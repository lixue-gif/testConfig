package cn.jqy.springcloud.service.impl;

import cn.jqy.springcloud.dao.PaymentDao;
import cn.jqy.springcloud.entity.Payment;
import cn.jqy.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService
{
    @Autowired
    private PaymentDao paymentDao;

    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}
