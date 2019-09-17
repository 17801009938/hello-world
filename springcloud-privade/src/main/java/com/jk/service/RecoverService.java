package com.jk.service;

import com.jk.pojo.Reorder;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface RecoverService {
    /**
     * 查询订单表信息
     * @param reorder
     * @param page
     * @param rows
     * @return
     */
    Map queryReorderList(Reorder reorder, Integer page, Integer rows);
    /**
     * 详情
     * @param orderNum
     * @return
     */
    Reorder findReorderById(String orderNum);

    /**
     * 新增
     * @param reorder
     */
    void saveReorder(Reorder reorder);
}
