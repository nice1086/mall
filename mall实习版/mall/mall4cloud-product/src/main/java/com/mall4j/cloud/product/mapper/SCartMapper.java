package com.mall4j.cloud.product.mapper;

import com.mall4j.cloud.product.service.SCartService;
import com.mall4j.cloud.product.vo.app.SCartVO;
import com.mall4j.cloud.product.vo.app.SpuVO;
import io.swagger.annotations.Api;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    List<SCartVO> deleteItems(Long cart_item_id);

    List<SCartVO> selectShop();

    List<SCartVO> selectInfo();

    List<SCartVO> selectShopNum();
}
