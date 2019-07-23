package com.yoge.miaosha.dao;


import com.yoge.miaosha.dataobject.ItemDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Sat May 04 14:47:18 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Sat May 04 14:47:18 CST 2019
     */
    int insert(ItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Sat May 04 14:47:18 CST 2019
     */
    int insertSelective(ItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Sat May 04 14:47:18 CST 2019
     */
    ItemDO selectByPrimaryKey(Integer id);

    /**
     * 根据销量降序查询
     * @return
     */
    List<ItemDO> listItem();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Sat May 04 14:47:18 CST 2019
     */
    int updateByPrimaryKeySelective(ItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Sat May 04 14:47:18 CST 2019
     */
    int updateByPrimaryKey(ItemDO record);

    int increaseSales(@Param("id") Integer id, @Param("amount") Integer amount);
}