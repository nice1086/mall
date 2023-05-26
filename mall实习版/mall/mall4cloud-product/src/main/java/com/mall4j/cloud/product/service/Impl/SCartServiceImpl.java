package com.mall4j.cloud.product.service.Impl;

import com.mall4j.cloud.product.mapper.SCartMapper;
import com.mall4j.cloud.product.service.SCartService;
import com.mall4j.cloud.product.vo.app.SCartVO;
import com.mall4j.cloud.product.vo.app.SpuVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SCartServiceImpl implements SCartService {

    @Autowired
    private SCartMapper sCartMapper;

    @Override
    public int select(Long spu_id, Long sku_id, Long shop_id, int count) {
        return sCartMapper.select(spu_id,sku_id,shop_id,count);
    }

    @Override
    public List<SCartVO> updateItems(Long cart_item_id, Boolean is_checked) {
        return sCartMapper.updateItems(cart_item_id,is_checked);
    }

    @Override
    public List<SCartVO> delete() {
        return sCartMapper.delete();
    }

    @Override
    public List<SCartVO> deleteItems(Long cart_item_id) {
        return sCartMapper.deleteItems(cart_item_id);
    }

    @Override
    public List<SCartVO> selectShop() {
        return sCartMapper.selectShop();
    }

    @Override
    public List<SCartVO> selectInfo() {
        return sCartMapper.selectInfo();
    }

    @Override
    public List<SCartVO> selectShopNum() {
        return sCartMapper.selectShopNum() ;
    }

    @Override
    public List<SCartVO> update(Long spu_id, Long sku_id, Long shop_id, int count) {
        if(count > 0){return sCartMapper.update(spu_id,sku_id,shop_id,count);}
        if(count < 0){return sCartMapper.delete(spu_id);}
        return null;
    }

}
