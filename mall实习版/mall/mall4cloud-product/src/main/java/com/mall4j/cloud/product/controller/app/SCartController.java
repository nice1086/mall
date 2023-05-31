package com.mall4j.cloud.product.controller.app;

import com.mall4j.cloud.common.response.ServerResponseEntity;
import com.mall4j.cloud.product.service.SCartService;
import com.mall4j.cloud.product.vo.app.SCartVO;
import com.mall4j.cloud.product.vo.app.SpuVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("brandController")
@RequestMapping("/ua/shop_cart")
@Api(tags = "app-购物车信息")
public class SCartController {
    @Autowired
    private SCartService sCartService;

    @GetMapping("/select")
    @ApiOperation(value = "获取商品信息列表", notes = "获取商品信息列表")
    public int select(Long spu_id,Long sku_id,Long shop_id,int count){
        count = sCartService.select(spu_id,sku_id,shop_id,count);
        return count;
    }
//    通过商品id(prodId)、skuId、店铺Id(shopId),添加/修改用户购物车商品，
//    并传入改变的商品个数(count)，当count为正值时，增加商品数量，
//    当count为负值时，
//    将减去商品的数量，当最终count值小于0时，会将商品从购物车里面删除
    @PostMapping("/change_item")
    @ApiOperation(value = "修改商品信息列表", notes = "修改商品信息列表")
    public ServerResponseEntity<List<SCartVO>> update(Long spu_id,Long sku_id,Long shop_id,int count) {
        int num = select(spu_id, sku_id, shop_id, count);
        List<SCartVO> list = sCartService.update(spu_id,sku_id,shop_id,count + num);
        return ServerResponseEntity.success(list);
    }

    @PostMapping("/check_items")
    @ApiOperation(value = "修改购物车信息列表", notes = "修改购物车信息列表")
    public ServerResponseEntity<List<SCartVO>> updateItems(Long cart_item_id,Boolean is_checked) {
        List<SCartVO> list = sCartService.updateItems(cart_item_id,is_checked);
        return ServerResponseEntity.success(list);
    }

    @DeleteMapping("/delete_all")
    @ApiOperation(value = "清空用户购物车所有物品", notes = "清空用户购物车所有物品")
    public ServerResponseEntity<List<SCartVO>> delete() {
        List<SCartVO> list = sCartService.delete();
        return ServerResponseEntity.success(list);
    }

    @DeleteMapping("/delete_item")
    @ApiOperation(value = "通过购物车id删除用户购物车物品", notes = "通过购物车id删除用户购物车物品")
    public ServerResponseEntity<List<SCartVO>> deleteItems(Long cart_item_id) {
        List<SCartVO> list = sCartService.deleteItems(cart_item_id);
        return ServerResponseEntity.success(list);
    }

    @GetMapping("/info")
    @ApiOperation(value = "获取用户购物车信息", notes = "获取用户购物车信息")
    public List<SCartVO> selectInfo() {

        return  sCartService.selectInfo();
    }

    @GetMapping("/prod_count")
    @ApiOperation(value = "获取购物车商品数量", notes = "获取购物车商品数量")
    public List<Integer> selectShopNum() {

        return  sCartService.selectShopNum();
    }
}
