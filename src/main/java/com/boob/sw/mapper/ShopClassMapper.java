package com.boob.sw.mapper;

import com.boob.sw.model.ShopClass;
import com.boob.sw.model.ShopClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ShopClassMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_class
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    long countByExample(ShopClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_class
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    int deleteByExample(ShopClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_class
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_class
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    int insert(ShopClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_class
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    int insertSelective(ShopClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_class
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    List<ShopClass> selectByExampleWithRowbounds(ShopClassExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_class
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    List<ShopClass> selectByExample(ShopClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_class
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    ShopClass selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_class
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    int updateByExampleSelective(@Param("record") ShopClass record, @Param("example") ShopClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_class
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    int updateByExample(@Param("record") ShopClass record, @Param("example") ShopClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_class
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    int updateByPrimaryKeySelective(ShopClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_class
     *
     * @mbg.generated Sat Feb 01 12:40:18 CST 2020
     */
    int updateByPrimaryKey(ShopClass record);
}