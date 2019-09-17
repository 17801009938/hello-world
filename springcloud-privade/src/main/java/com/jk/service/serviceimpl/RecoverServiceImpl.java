package com.jk.service.serviceimpl;

import com.jk.map.RecoverMap;
import com.jk.pojo.ReGoods;
import com.jk.pojo.Reorder;
import com.jk.service.RecoverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

@Service
public class RecoverServiceImpl implements RecoverService {

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private RecoverMap recoverMap;

    /**
     * 查询订单表信息
     * @param reorder
     * @param page
     * @param rows
     * @return
     */
    @Override
    public Map queryReorderList(Reorder reorder, Integer page, Integer rows) {
        HashMap<String, Object> resultMap = new HashMap<>();
        HashMap<String, Object> parmes = new HashMap<>();
        parmes.put("reorder",reorder);
        int total = recoverMap.queryReorderCount(parmes);
        resultMap.put("total",total);
        parmes.put("startIndex",(page-1)*rows);
        parmes.put("endIndex",rows);
        List<Reorder> list = recoverMap.queryReorderList(parmes);
        resultMap.put("rows",list);
        return resultMap;

    }
    /**
     * 详情
     * @param orderNum
     * @return
     */
    @Override
    public Reorder findReorderById(String orderNum) {
        Reorder reorder = recoverMap.queryReorderById(orderNum);
        List<ReGoods> list = recoverMap.queryRegoods(reorder.getOrderId());
        reorder.setRegoods(list);
        return reorder;
    }

    /**
     * 新增
     * @param reorder
     */
    @Override
    public void saveReorder(Reorder reorder) {
        Date date = new Date();
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
        String format = sim.format(date);
        String replace = format.replace("-", "");
        int ceil = (int) Math.ceil(Math.random() * 999);
        String s = replace + ceil;
        reorder.setStatus(1);
        reorder.setOrderNum(s);
        recoverMap.saveReorder(reorder);
        List<ReGoods> list = new ArrayList<>();
        List<ReGoods> regoods = reorder.getRegoods();
        for (ReGoods re:regoods) {
            re.setOrderId(reorder.getOrderId());
            list.add(re);
        }
        recoverMap.saveRegoods(list);
    }
}
