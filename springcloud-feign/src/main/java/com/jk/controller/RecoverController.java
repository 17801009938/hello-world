package com.jk.controller;

import com.jk.pojo.Reorder;
import com.jk.service.RecoverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class RecoverController {
    @Autowired
    private RecoverService recoverService;

    /**
     * 分页查询
     * @param reorder
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("queryOrder")
    public Map queryOrder(Reorder reorder, Integer page, Integer rows){
        return recoverService.queryOrder(reorder,page,rows);
    }

    /**
     * 详情
     * @param orderNum
     * @return
     */
    @RequestMapping("findReorder")
    public Reorder findReorder(String orderNum){
        Reorder reorder = recoverService.findReorder(orderNum);
        return reorder;
    }

    @RequestMapping("saveReorderAll")
    public Map saveReorder(Reorder reorder){
        return  recoverService.saveReorder(reorder);
    }
}
