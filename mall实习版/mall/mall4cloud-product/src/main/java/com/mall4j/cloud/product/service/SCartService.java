package com.mall4j.cloud.product.service;

import com.mall4j.cloud.product.vo.app.SpuVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SCartService {
    List<SpuVO> update(Long prod_id, Long sku_id, Long shop_id, int count);
}
