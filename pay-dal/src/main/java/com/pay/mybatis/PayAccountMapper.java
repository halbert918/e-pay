package com.pay.mybatis;

import com.pay.domain.PayAccount;

public interface PayAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_account
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_account
     *
     * @mbg.generated
     */
    int insert(PayAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_account
     *
     * @mbg.generated
     */
    int insertSelective(PayAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_account
     *
     * @mbg.generated
     */
    PayAccount selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_account
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(PayAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_account
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PayAccount record);
}