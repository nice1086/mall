package com.mall4j.cloud.product.mapper;

import com.mall4j.cloud.api.product.vo.SpuVO;
import com.mall4j.cloud.product.vo.app.SCartVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface SCartMapper {

     List<SCartVO> update(@Param("spu_id") Long spu_id,
                          @Param("sku_id")Long sku_id,
                          @Param("shop_id")Long shop_id,
                          @Param("count")int count);

     List<SCartVO> delete(Long spu_id);

    int select(@Param("spu_id") Long spu_id,
               @Param("sku_id")Long sku_id,
               @Param("shop_id")Long shop_id,
               @Param("count")int count);

    List<SCartVO> updateItems(Long cart_item_id,Boolean is_checked);

    List<SCartVO> delete();

    List<SCartVO> deleteItems(List<Long> cart_item_id);

    List<SCartVO> selectInfo();

    List<Integer> selectShopNum();

    List<SpuVO> selectShop(@Param("spu_id") List<Long> spu_id,
                           @Param("spu_name") String spu_name,
                           @Param("isFailure") Integer isFailure);
}
