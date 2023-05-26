package com.mall4j.cloud.product.controller.app;

import com.mall4j.cloud.common.response.ServerResponseEntity;
import com.mall4j.cloud.product.service.AttrService;
import com.mall4j.cloud.product.vo.app.AttrVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("attrController")
@RequestMapping("/ua/attr")
@Api(tags = "app-属性信息")
public class AttrController {

    @Autowired
    private AttrService attrService;

    @GetMapping("/attr")
    @ApiOperation(value = "通过attrid获取属性列表", notes = "通过attrid获取属性列表")
    public ServerResponseEntity<List<AttrVO>> listBySid(Long attr_id) {
        List<AttrVO> list = attrService.listByAid(attr_id);
        return ServerResponseEntity.success(list);
    }
}
