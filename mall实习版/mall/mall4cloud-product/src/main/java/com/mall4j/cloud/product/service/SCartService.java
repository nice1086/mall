package com.mall4j.cloud.product.service;

import com.mall4j.cloud.api.product.vo.SpuVO;
import com.mall4j.cloud.product.vo.app.SCartVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SCartService {
    List<SCartVO> update(Long spu_id, Long sku_id, Long shop_id, int count);

    int select(Long spu_id, Long sku_id, Long shop_id, int count);

    List<SCartVO> updateItems(Long cart_item_id,Boolean is_checked);

    List<SCartVO> delete();

    List<SCartVO> deleteItems(List<Long> cart_item_id);

    List<SpuVO> selectShop(List<Long> spu_id, String spu_name, Integer isFailure);

    List<SCartVO> selectInfo();

    List<Integer> selectShopNum();
}
