package com.mall4j.cloud.product.controller.admin;

import com.mall4j.cloud.api.user.vo.AreaVO;
import com.mall4j.cloud.api.user.vo.UserApiVO;
import com.mall4j.cloud.common.response.ServerResponseEntity;
import com.mall4j.cloud.common.security.AuthUserContext;
import com.mall4j.cloud.product.service.SpuService;
import com.mall4j.cloud.product.vo.app.SpuVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;
import java.util.Objects;

@RestController("spuController")
@RequestMapping("/admin")
@Api(tags = "spu信息")
public class SpuController {

    @Autowired
    private SpuService spuService;

    @GetMapping("/list")
    @ApiOperation(value = "获取spu信息列表", notes = "获取spu信息列表")
    public ServerResponseEntity<List<SpuVO>> list() {
        List<SpuVO> list = spuService.getSpuListInfo();
        return ServerResponseEntity.success(list);
    }

    @GetMapping("/list_by_spuId")
    @ApiOperation(value = "通过spuid获取区域列表", notes = "通过spuid获取区域列表")
    public ServerResponseEntity<List<SpuVO>> listBySid(Long spuId) {
        List<SpuVO> list = spuService.listBySid(spuId);
        return ServerResponseEntity.success(list);
    }

    @PostMapping("/save_product")
    @ApiOperation(value = "保存spu信息")
    public ServerResponseEntity<Void> updateUser(@RequestBody SpuVO spuVO) {

        spuService.save(spuVO);
        return ServerResponseEntity.success();
    }
}
