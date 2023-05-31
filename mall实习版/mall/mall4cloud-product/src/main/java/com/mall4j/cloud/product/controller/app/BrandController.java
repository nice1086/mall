package com.mall4j.cloud.product.controller.app;

import com.mall4j.cloud.common.response.ServerResponseEntity;
import com.mall4j.cloud.product.service.BrandService;
import com.mall4j.cloud.product.vo.app.BrandVO;
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
@RequestMapping("/ua/brand")
@Api(tags = "app-品牌信息")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @GetMapping("/list_by_category")
    @ApiOperation(value = "通过categoryid获取", notes = "通过categoryid获取")
    public  List<BrandVO> listByCatid(Long category_id) {

        return brandService.listByCatid(category_id);
    }

    @GetMapping("/page_product")
    @ApiOperation("分页查询")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "页码",name = "pageNum",example = "1"),
            @ApiImplicitParam(value = "每页条数",name = "pageSize",example = "10")
    })
    public List<BrandVO> pageSelect(Integer pageNum, Integer pageSize){

        return brandService.getPage(pageNum,pageSize);
    }

    @GetMapping("/top_brand_list")
    @ApiOperation(value = "置顶品牌列表", notes = "置顶品牌列表")
    public List<BrandVO> listBrand() {
        return brandService.listBrand();
    }
}
