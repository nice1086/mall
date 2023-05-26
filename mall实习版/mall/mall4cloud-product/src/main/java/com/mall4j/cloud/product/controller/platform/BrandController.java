package com.mall4j.cloud.product.controller.platform;

import com.mall4j.cloud.common.response.ServerResponseEntity;
import com.mall4j.cloud.product.service.BrandService;
import com.mall4j.cloud.product.vo.app.BrandVO;
import com.mall4j.cloud.product.vo.app.SpuVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("brandController")
@RequestMapping("/platform/brand")
@Api(tags = "platform-品牌信息")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @GetMapping("/get_brand")
    @ApiOperation(value = "根据brandId获取品牌信息", notes = "根据brandId获取品牌信息")
    public ServerResponseEntity<List<BrandVO>> listByBrid(Long brand_id) {
        List<BrandVO> list = brandService.listByBrid(brand_id);
        return ServerResponseEntity.success(list);
    }

    @PostMapping("/insert_brand")
    @ApiOperation("保存品牌信息")
    public ServerResponseEntity<List<BrandVO>> insertBrand(BrandVO brandVO){

        List<BrandVO> list = brandService.insertBrand(brandVO);
        return ServerResponseEntity.success(list);
    }

    @PutMapping("/update_brand")
    @ApiOperation("更新品牌信息")
    public ServerResponseEntity<List<BrandVO>> updateBrand(BrandVO brandVO){

        List<BrandVO> list = brandService.updateBrand(brandVO);
        return ServerResponseEntity.success(list);
    }

    @DeleteMapping("delete_brand")
    @ApiOperation("删除品牌信息")
    public ServerResponseEntity<List<BrandVO>> deleteBrand(Long brand_id){

        List<BrandVO> list = brandService.deleteBrand(brand_id);
        return ServerResponseEntity.success(list);
    }

    @GetMapping("/page")
    @ApiOperation("分页查询")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "页码",name = "pageNum",example = "1"),
            @ApiImplicitParam(value = "每页条数",name = "pageSize",example = "10")
    })
    public List<BrandVO> pageSelect(Integer pageNum, Integer pageSize){

        return brandService.getPageSelect(pageNum,pageSize);
    }

    @PutMapping("/update_brand_status")
    @ApiOperation("更新品牌状态（启用或禁用）")
    public ServerResponseEntity<List<BrandVO>> updateBrandStatus(BrandVO brandVO){

        List<BrandVO> list = brandService.updateBrandStatus(brandVO);
        return ServerResponseEntity.success(list);
    }
}
