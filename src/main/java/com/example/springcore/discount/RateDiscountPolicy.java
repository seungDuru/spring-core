package com.example.springcore.discount;

import com.example.springcore.annotation.MainDiscountPolicy;
import com.example.springcore.member.Grade;
import com.example.springcore.member.Member;
import org.springframework.stereotype.Repository;

@MainDiscountPolicy
@Repository
public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPercent = 10;
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        } else {
            return 0;
        }
    }
}
