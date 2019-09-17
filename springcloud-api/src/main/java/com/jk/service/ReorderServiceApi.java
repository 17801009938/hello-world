package com.jk.service;


import com.jk.pojo.Reorder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

public interface ReorderServiceApi {

    @RequestMapping("queryOrder")
    Map queryOrder(@RequestBody Reorder reorder,@RequestParam Integer page,@RequestParam Integer rows);

    @RequestMapping("findReorder")
    Reorder findReorder(@RequestParam String orderNum);

    @RequestMapping("saveReorderAll")
    Map saveReorder(@RequestBody Reorder reorder);

}
