package com.mall4j.cloud.product.service;

import com.mall4j.cloud.product.vo.app.SCartVO;
import com.mall4j.cloud.product.vo.app.SpuVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SCartService {
    List<SCartVO> update(Long spu_id, Long sku_id, Long shop_id, int count);

    int select(Long spu_id, Long sku_id, Long shop_id, int count);

    List<SCartVO> updateItems(Long cart_item_id,Boolean is_checked);

    List<SCartVO> delete();

    List<SCartVO> deleteItems(Long cart_item_id);

    List<SCartVO> selectShop();

    List<SCartVO> selectInfo();

    List<SCartVO> selectShopNum();
}
