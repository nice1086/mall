package com.mall4j.cloud.product.controller.admin;

import com.github.pagehelper.PageInfo;
import com.mall4j.cloud.api.user.vo.AreaVO;
import com.mall4j.cloud.api.user.vo.UserApiVO;
import com.mall4j.cloud.common.response.ServerResponseEntity;
import com.mall4j.cloud.common.security.AuthUserContext;
import com.mall4j.cloud.product.bo.SpuDTO;
import com.mall4j.cloud.product.model.Spu;
import com.mall4j.cloud.product.service.SpuService;
import com.mall4j.cloud.product.vo.app.SkuVO;
import com.mall4j.cloud.product.vo.app.SpuVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;
import java.util.Objects;

@RestController("spuController")
@RequestMapping("/admin/spu")
@Api(tags = "admin-spu信息")
public class SpuController {

    @Autowired
    private SpuService spuService;

    @GetMapping("/list")
    @ApiOperation(value = "获取spu信息列表", notes = "获取spu信息列表")
    public List<SpuVO> list() {

        return spuService.getSpuListInfo();
    }

    @GetMapping("/list_by_spuId")
    @ApiOperation(value = "通过spuid获取spu列表", notes = "通过spuid获取spu列表")
    public List<SpuVO> listBySid(Long spuId) {

        return spuService.listBySid(spuId);
    }

    @PostMapping("/save_product")
    @ApiOperation(value = "保存spu信息")
    public ServerResponseEntity<Void> updateUser(@RequestBody SpuVO spuVO) {

        spuService.save(spuVO);
        return ServerResponseEntity.success();
    }

    @PutMapping("/update_product")
    @ApiOperation(value = "更新spu信息")
    public ServerResponseEntity<Void> update(@RequestBody SpuVO spuVO) {
        spuService.update(spuVO);
        return ServerResponseEntity.success();
    }

    @DeleteMapping("/delete_product")
    @ApiOperation(value = "删除spu信息")
    public ServerResponseEntity<Void> delete(Long spuId){
        spuService.delete(spuId);
        return ServerResponseEntity.success();
    }

    @GetMapping("/page_product")
    @ApiOperation("分页查询")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "页码",name = "pageNum",example = "1"),
            @ApiImplicitParam(value = "每页条数",name = "pageSize",example = "10")
    })
    public List<SpuVO> pageSelect(Integer pageNum,Integer pageSize){

        return spuService.getPage(pageNum,pageSize);
    }

    @GetMapping("/page_platform")
    @ApiOperation("分页查询")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "页码",name = "pageNum",example = "1"),
            @ApiImplicitParam(value = "每页条数",name = "pageSize",example = "10")
    })
    public List<SpuVO> pagePlatformSelect(Integer pageNum,Integer pageSize){

        return spuService.getPlatformPage(pageNum,pageSize);
    }

    @PutMapping("/prod_status")
    @ApiOperation("商品上下架")
    public ServerResponseEntity<Void> putAndDown(@RequestBody SkuVO skuVO) {
        spuService.putAndDown(skuVO);
        return ServerResponseEntity.success();
    }

    @PutMapping("/update_spu_data")
    @ApiOperation("更新spu")
    public ServerResponseEntity<Void> updateSpu(@RequestBody SpuDTO spuDTO) {
        spuService.updateSpu(spuDTO);
        return ServerResponseEntity.success();
    }

}
