package com.mall4j.cloud.product.mapper;

import com.github.pagehelper.PageInfo;
import com.mall4j.cloud.product.bo.SpuDTO;
import com.mall4j.cloud.product.vo.app.SkuVO;
import com.mall4j.cloud.product.vo.app.SpuVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SpuMapper {
    List<SpuVO> getSpuListInfo();

    List<SpuVO> listBySid(Long spuId);

    void save(SpuVO spuVO);

    void update(SpuVO spuVO);

    void delete(Long spuId);

    List<SpuVO> getPage();

    List<SpuVO> getPlatformPage();

    void putAndDown(SkuVO skuVO);

    void updateSpu(SpuDTO spuDTO);
}
