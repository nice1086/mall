package com.mall4j.cloud.product.controller.admin;

import com.mall4j.cloud.common.response.ServerResponseEntity;
import com.mall4j.cloud.product.service.BrandService;
import com.mall4j.cloud.product.service.CatService;
import com.mall4j.cloud.product.vo.app.BrandVO;
import com.mall4j.cloud.product.vo.app.CBVO;
import com.mall4j.cloud.product.vo.app.CatVO;
import com.mall4j.cloud.product.vo.app.SpuVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("brandController")
@RequestMapping("/admin/brand")
@Api(tags = "admin-品牌信息")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @GetMapping("/get_brandid")
    @ApiOperation(value = "通过categoryid获取brandid", notes = "通过categoryid获取brandid")
    public Long listBySid(Long category_id) {
        Long brandid = brandService.listByCid(category_id);
        return brandid;
    }

    @GetMapping("/get_brand_by_category_id")
    @ApiOperation(value = "通过categoryid获取brand", notes = "通过categoryid获取brand")
    public  List<BrandVO> listByBid(Long category_id) {
        Long brand_id = listBySid(category_id);

        return brandService.listByBid(brand_id);
    }

}
