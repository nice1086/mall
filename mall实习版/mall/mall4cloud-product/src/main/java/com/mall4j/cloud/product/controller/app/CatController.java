package com.mall4j.cloud.product.controller.app;

import com.mall4j.cloud.common.response.ServerResponseEntity;
import com.mall4j.cloud.product.service.CatService;
import com.mall4j.cloud.product.vo.app.CatVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("catController")
@RequestMapping("/ua/category")
@Api(tags = "app-分类信息")
public class CatController {

    @Autowired
    private CatService catService;

    @GetMapping("/category_list")
    @ApiOperation(value = "根据id，获取分类列表信息")
    public List<CatVO> list(Long parent_id, Long shop_id) {

        return catService.list(parent_id,shop_id);
    }

    @GetMapping("/shop_category_list")
    @ApiOperation(value = "根据id，获取购物车列表信息")
    public List<CatVO> listShop(Long shop_id) {
        return  catService.listShop(shop_id);
    }
}
