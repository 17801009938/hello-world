package com.jk.error;


import com.jk.pojo.Reorder;
import com.jk.service.RecoverService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;
@RequestMapping("error")
@Component
public class ProductError implements RecoverService {
    @Override
    public Map queryOrder(Reorder reorder, Integer page, Integer rows) {
        return null;
    }

    @Override
    public Reorder findReorder(String orderNum) {
        return null;
    }

    @Override
    public Map saveReorder(Reorder reorder) {
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("status",false);
        paramMap.put("msg","当前网络不可用");
        return paramMap;
    }


}
