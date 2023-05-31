package com.mall4j.cloud.product.feign;

import com.mall4j.cloud.api.product.vo.SkuVO;
import com.mall4j.cloud.api.product.vo.SpuAndSkuVO;
import com.mall4j.cloud.api.product.vo.SpuVO;
import com.mall4j.cloud.common.response.ServerResponseEntity;
import com.mall4j.cloud.product.service.SCartService;
import com.mall4j.cloud.product.vo.app.SCartVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("GetSpuFeignController")
@RequestMapping("/ua/shop_cart")
public class GetSpuControllerFeignController implements com.mall4j.cloud.api.product.feign.SpuFeignClient{

    @Autowired
    private SCartService sCartService;

    @Override
    public ServerResponseEntity<SpuVO> getById(Long spuId) {
        return null;
    }

    @Override
    public ServerResponseEntity<SpuAndSkuVO> getSpuAndSkuById(Long spuId, Long skuId) {
        return null;
    }

    @Override
    @GetMapping("/expiry_prod_list")
    @ApiOperation(value = "获取购物车失效商品列表", notes = "获取购物车失效商品列表")
    public ServerResponseEntity<List<SpuVO>> getSpusBySpuIds(List<Long> spuIds, String spuName, Integer isFailure) {
        List<SpuVO> list = sCartService.selectShop(spuIds,spuName,isFailure);
         return ServerResponseEntity.success(list);
    }
}
