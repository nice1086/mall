package com.mall4j.cloud.product.service.Impl;

import com.mall4j.cloud.product.mapper.SCartMapper;
import com.mall4j.cloud.product.service.SCartService;
import org.springframework.beans.factory.annotation.Autowired;

public class SCartServiceImpl implements SCartService {

    @Autowired
    private SCartMapper sCartMapper;

}
