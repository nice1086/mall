package com.mall4j.cloud.product.controller.app;

import com.mall4j.cloud.common.response.ServerResponseEntity;
import com.mall4j.cloud.product.service.SpuService;
import com.mall4j.cloud.product.vo.app.SpuVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("spuController")
@RequestMapping("/ua/spu")
@Api(tags = "app-spu信息")
public class SpuController {

    @Autowired
    private SpuService spuService;

    @GetMapping("/prod_info")
    @ApiOperation(value = "获取商品信息列表", notes = "获取商品信息列表")
    public ServerResponseEntity<List<SpuVO>> prodInfo(Long spuId) {
        List<SpuVO> list = spuService.getProdInfo(spuId);
        return ServerResponseEntity.success(list);
    }
}
