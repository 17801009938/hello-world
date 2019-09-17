package com.jk.map;

import com.jk.pojo.ReGoods;
import com.jk.pojo.Reorder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;
@Mapper
public interface RecoverMap {
    /**
     * 查询订单表信息
     * @param parmes
     * @return
     */
    List<Reorder> queryReorderList(HashMap<String, Object> parmes);

    /**
     * 总条数
     * @param parmes
     * @return
     */
    int queryReorderCount(HashMap<String, Object> parmes);

    /**
     * 回显
     * @param orderNum
     * @return
     */
    @Select("SELECT * FROM reorder where orderNum = #{value}")
    Reorder queryReorderById(String orderNum);
    /**
     * 回显
     * @param orderId
     * @return
     */
    @Select("SELECT * FROM regoods where orderId = #{value}")
    List<ReGoods> queryRegoods(Integer orderId);

    void saveReorder(Reorder reorder);

    void saveRegoods(List<ReGoods> list);
}
