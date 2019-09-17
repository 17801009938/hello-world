package com.jk.cotroller;

import com.jk.pojo.Reorder;
import com.jk.service.RecoverService;
import com.jk.service.ReorderServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class RecoverController implements ReorderServiceApi {

    @Autowired
    private RecoverService recoverService;

    @Override
    public Map queryOrder(Reorder reorder, Integer page, Integer rows) {
        return recoverService.queryReorderList(reorder,page,rows);
    }

    @Override
    public Reorder findReorder(String orderNum) {
        return recoverService.findReorderById(orderNum);
    }

    @Override
    public Map saveReorder(Reorder reorder) {
        try{
            recoverService.saveReorder(reorder);
            HashMap<String, Object> paramMap = new HashMap<>();
            paramMap.put("status",true);
            paramMap.put("msg","成功");
            return paramMap;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }



    /*
    *//**
     * 查询订单表信息
     * @param reorder
     * @return
     *//*
    @RequestMapping("queryReorderList")
    public Map queryReorderList(@RequestBody Reorder reorder, @RequestParam Integer page, @RequestParam Integer rows){
        return recoverService.queryReorderList(reorder,page,rows);
    }

    *//**
     * 详情
     * @param orderNum
     * @return
     *//*
    @RequestMapping("findReorderById")
    public Reorder findReorder(@RequestParam String orderNum){
        return recoverService.findReorderById(orderNum);
    }

    *//**
     * 新增
     * @param reorder
     *//*
    @RequestMapping("saveReorder")
    public void saveReorder(@RequestBody Reorder reorder){
        recoverService.saveReorder(reorder);
    }*/
}
