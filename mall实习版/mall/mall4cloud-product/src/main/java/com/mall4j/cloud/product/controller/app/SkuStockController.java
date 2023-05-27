package com.mall4j.cloud.product.controller.app;

import com.mall4j.cloud.common.response.ServerResponseEntity;
import com.mall4j.cloud.product.service.SkuStockService;
import com.mall4j.cloud.product.vo.app.AttrVO;
import com.mall4j.cloud.product.vo.app.BrandVO;
import com.mall4j.cloud.product.vo.app.SCartVO;
import com.mall4j.cloud.product.vo.app.SkuStockVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("skuStockController")
@RequestMapping("/app/sku")
@Api(tags = "app-库存锁定信息")
public class SkuStockController {
    @Autowired
    private SkuStockService skuStockService;

    @GetMapping("/select_sku")
    @ApiOperation(value = "根据id获取库存锁定信息", notes = "根据id获取库存锁定信息")
    public List<SkuStockVO> listSSK(Long stock_id) {
        return skuStockService.listSSK(stock_id);
    }

    @PostMapping("/save_sku")
    @ApiOperation(value = "保存库存锁定信息", notes = "保存库存锁定信息")
    public ServerResponseEntity<List<SkuStockVO>> insertSSK(@RequestBody SkuStockVO skuStockVO) {
        List<SkuStockVO> list = skuStockService.save(skuStockVO);
        return ServerResponseEntity.success(list);
    }

    @PutMapping("/update_sku")
    @ApiOperation(value = "更新库存锁定信息", notes = "更新库存锁定信息")
    public ServerResponseEntity<List<SkuStockVO>> updateSSK(@RequestBody SkuStockVO skuStockVO) {
        List<SkuStockVO> list = skuStockService.update(skuStockVO);
        return ServerResponseEntity.success(list);
    }

    @DeleteMapping("/delete_sku")
    @ApiOperation(value = "根据库存锁定信息id删除库存锁定信息", notes = "根据库存锁定信息id删除库存锁定信息")
    public ServerResponseEntity<List<SkuStockVO>> deleteSSK(Long stock_id) {
        List<SkuStockVO> list = skuStockService.delete(stock_id);
        return ServerResponseEntity.success(list);
    }

    @GetMapping("/page")
    @ApiOperation("分页查询")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "页码",name = "pageNum",example = "1"),
            @ApiImplicitParam(value = "每页条数",name = "pageSize",example = "10")
    })
    public List<SkuStockVO> pageSelect(Integer pageNum, Integer pageSize){

        return skuStockService.getPage(pageNum,pageSize);
    }
}
