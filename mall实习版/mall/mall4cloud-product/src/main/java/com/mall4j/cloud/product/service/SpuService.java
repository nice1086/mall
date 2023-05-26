package com.mall4j.cloud.product.service;

import com.github.pagehelper.PageInfo;
import com.mall4j.cloud.product.bo.SpuDTO;
import com.mall4j.cloud.product.vo.app.SkuVO;
import com.mall4j.cloud.product.vo.app.SpuVO;

import java.util.List;

public interface SpuService {

    List<SpuVO> getPage(Integer pageNum, Integer pageSize);

    List<SpuVO> getSpuListInfo();

    List<SpuVO> listBySid(Long spuId);

    void save(SpuVO spuVO);

    void update(SpuVO spuVO);

    void delete(Long spuId);

    List<SpuVO> getPlatformPage(Integer pageNum, Integer pageSize);

    void putAndDown(SkuVO skuVO);

    void updateSpu(SpuDTO spuDTO);

    List<SpuVO> getProdInfo(Long spuId);
}
