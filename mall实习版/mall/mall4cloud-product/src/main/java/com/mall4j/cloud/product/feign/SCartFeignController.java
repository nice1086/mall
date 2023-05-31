package com.mall4j.cloud.product.feign;

import com.mall4j.cloud.api.product.feign.ShopCartFeignClient;
import com.mall4j.cloud.common.order.vo.ShopCartItemVO;
import com.mall4j.cloud.common.response.ServerResponseEntity;
import com.mall4j.cloud.product.service.SCartService;
import com.mall4j.cloud.product.vo.app.SCartVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("SCartFeignController")
@RequestMapping("/ua/shop_cart")
public class SCartFeignController implements ShopCartFeignClient {

    @Autowired
    private SCartService sCartService;

    @Override
    public ServerResponseEntity<List<ShopCartItemVO>> getCheckedShopCartItems() {
        return null;
    }

    @Override
    @DeleteMapping("/delete_item")
    @ApiOperation(value = "通过购物车id删除用户购物车物品", notes = "通过购物车id删除用户购物车物品")
    public ServerResponseEntity<Void> deleteItem(List<Long> shopCartItemIds) {

            List<SCartVO> list = sCartService.deleteItems(shopCartItemIds);
            return ServerResponseEntity.success();

    }
}
