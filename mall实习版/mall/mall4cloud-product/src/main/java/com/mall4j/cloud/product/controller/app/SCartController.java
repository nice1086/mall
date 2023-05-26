package com.mall4j.cloud.product.controller.app;

import com.mall4j.cloud.common.response.ServerResponseEntity;
import com.mall4j.cloud.product.service.SCartService;
import com.mall4j.cloud.product.vo.app.SpuVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("brandController")
@RequestMapping("/ua/shop_cart")
@Api(tags = "app-购物车信息")
public class SCartController {
    @Autowired
    private SCartService sCartService;

//    通过商品id(prodId)、skuId、店铺Id(shopId),添加/修改用户购物车商品，
//    并传入改变的商品个数(count)，当count为正值时，增加商品数量，
//    当count为负值时，
//    将减去商品的数量，当最终count值小于0时，会将商品从购物车里面删除
    @GetMapping("/change_item")
    @ApiOperation(value = "修改商品信息列表", notes = "修改商品信息列表")
    public ServerResponseEntity<List<SpuVO>> update(Long prod_id,Long sku_id,Long shop_id,int count) {
        List<SpuVO> list = sCartService.update(prod_id,sku_id,shop_id,count);
        return ServerResponseEntity.success(list);
    }
}
