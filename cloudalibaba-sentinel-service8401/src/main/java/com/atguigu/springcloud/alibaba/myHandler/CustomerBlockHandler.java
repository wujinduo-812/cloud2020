package com.atguigu.springcloud.alibaba.myHandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;

public class CustomerBlockHandler {
    public  static CommonResult  handleException(BlockException exception){
        return new CommonResult(4444,"按客戶自定义,global handleException--------1" );
    }
    public  static CommonResult  handleException2(BlockException exception){
        return new CommonResult(4444,"按客戶自定义,global handleException--------2" );
    }
}
