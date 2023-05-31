package com.mall4j.cloud.product.controller.admin;


import com.mall4j.cloud.common.response.ServerResponseEntity;
import com.mall4j.cloud.product.bo.SpuDTO;
import com.mall4j.cloud.product.service.CatService;
import com.mall4j.cloud.product.service.SpuService;
import com.mall4j.cloud.product.vo.app.CatVO;
import com.mall4j.cloud.product.vo.app.SkuVO;
import com.mall4j.cloud.product.vo.app.SpuVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("catController")
@RequestMapping("/admin/category")
@Api(tags = "admin-分类信息")
public class CatController {
    @Autowired
    private CatService catService;

    @GetMapping("/list_by_categoryid")
    @ApiOperation(value = "通过categoryid获取分类列表", notes = "通过categoryid获取分类列表")
    public List<CatVO> listBySid(Long category_id) {

        return catService.listByCid(category_id);
    }

    @PostMapping("/save_category")
    @ApiOperation(value = "保存category信息")
    public ServerResponseEntity<Void> updateUser(@RequestBody CatVO catVO) {

        catService.save(catVO);
        return ServerResponseEntity.success();
    }

    @PutMapping("/update_category")
    @ApiOperation(value = "更新category信息")
    public ServerResponseEntity<Void> update(@RequestBody CatVO catVO) {
        catService.update(catVO);
        return ServerResponseEntity.success();
    }

    @DeleteMapping("/delete_category")
    @ApiOperation(value = "删除category信息")
    public ServerResponseEntity<Void> delete(Long category_id){
        catService.delete(category_id);
        return ServerResponseEntity.success();
    }

    @PutMapping("/category_enable_or_disable")
    @ApiOperation(value = "分类的启用或禁用")
    public ServerResponseEntity<Void> enableOrDisable(@RequestBody CatVO catVO) {
        catService.enableOrDisable(catVO);
        return ServerResponseEntity.success();
    }

    @GetMapping("/get_list_by_parent_id")
    @ApiOperation(value = "根据上级id，获取分类列表信息")
    public List<CatVO> listByPid(Long parent_id) {

        return catService.listByPid(parent_id);
    }

    @GetMapping("/platform_categories")
    @ApiOperation(value = "获取平台的分类列表信息")
    public List<CatVO> listPlatform() {

        return catService.listPlatform();
    }

    @GetMapping("/shop_categories")
    @ApiOperation(value = "获取店铺所有的分类信息")
    public List<CatVO> listShop() {

        return catService.listShop();
    }


}
