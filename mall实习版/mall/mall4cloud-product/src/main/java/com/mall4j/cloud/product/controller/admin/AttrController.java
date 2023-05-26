package com.mall4j.cloud.product.controller.admin;

import com.mall4j.cloud.common.response.ServerResponseEntity;
import com.mall4j.cloud.product.service.AttrService;
import com.mall4j.cloud.product.vo.app.AttrVO;
import com.mall4j.cloud.product.vo.app.CatVO;
import com.mall4j.cloud.product.vo.app.SpuVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("attrController")
@RequestMapping("/admin/attr")
@Api(tags = "admin-属性信息")
public class AttrController {
    @Autowired
    private AttrService attrService;

    @GetMapping("/list_by_attrid")
    @ApiOperation(value = "通过attrid获取属性列表", notes = "通过attrid获取属性列表")
    public ServerResponseEntity<List<AttrVO>> listBySid(Long attr_id) {
        List<AttrVO> list = attrService.listByAid(attr_id);
        return ServerResponseEntity.success(list);
    }

    @PostMapping("/save_attr")
    @ApiOperation(value = "保存attr信息")
    public ServerResponseEntity<Void> updateUser(@RequestBody AttrVO attrVO) {
        attrService.save(attrVO);
        return ServerResponseEntity.success();
    }

    @PutMapping("/update_attr")
    @ApiOperation(value = "更新attr信息")
    public ServerResponseEntity<Void> update(@RequestBody AttrVO attrVO) {
        attrService.update(attrVO);
        return ServerResponseEntity.success();
    }

    @DeleteMapping("/delete_attr")
    @ApiOperation(value = "删除attr信息")
    public ServerResponseEntity<Void> delete(Long attr_id){
        attrService.delete(attr_id);
        return ServerResponseEntity.success();
    }

    @GetMapping("/get_attrs_by_category_id")
    @ApiOperation(value = "根据id，获取分类列表信息")
    public ServerResponseEntity<List<AttrVO>> listByCid(Long category_id) {
        List<AttrVO> list = attrService.listByCid(category_id);
        return ServerResponseEntity.success(list);
    }

    @GetMapping("/get_shop_attrs")
    @ApiOperation(value = "获取店铺中的销售属性")
    public ServerResponseEntity<List<AttrVO>> listShop() {
        List<AttrVO> list = attrService.listShop();
        return ServerResponseEntity.success(list);
    }

    @GetMapping("/page")
    @ApiOperation("分页查询")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "页码",name = "pageNum",example = "1"),
            @ApiImplicitParam(value = "每页条数",name = "pageSize",example = "10")
    })
    public List<AttrVO> pageSelect(Integer pageNum, Integer pageSize){

        return attrService.getPage(pageNum,pageSize);
    }
}
