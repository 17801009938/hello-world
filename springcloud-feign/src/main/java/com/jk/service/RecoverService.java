package com.jk.service;

import com.jk.error.ProductError;
import com.jk.pojo.Reorder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(value = "springcloud-privade",fallback = ProductError.class)
public interface RecoverService extends ReorderServiceApi {
    /**
     * 分页查询
     * @param reorder
     * @param page
     * @param rows
     * @return
     *//*
    @RequestMapping("queryReorderList")
    Map queryOrder(@RequestBody Reorder reorder, @RequestParam Integer page,@RequestParam Integer rows);
    *//**
     * 详情
     * @param orderNum
     * @return
     *//*
    @RequestMapping("findReorderById")
    Reorder findReorder(@RequestParam String orderNum);

    @RequestMapping("saveReorder")
    Reorder saveReorder(@RequestBody Reorder reorder);*/

}
