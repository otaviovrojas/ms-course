package com.otaviovrojas.hrpayroll.services;

import com.otaviovrojas.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days){
        return new Payment("Vinicius", 420.0, days);
    }

}