package cn.jqy.springcloud.dao;

import cn.jqy.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao
{
     int create(Payment payment);

     Payment getPaymentById(@Param("id") Long id);
}