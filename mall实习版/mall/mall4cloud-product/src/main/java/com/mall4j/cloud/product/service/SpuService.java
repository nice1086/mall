package com.mall4j.cloud.product.service;

import com.mall4j.cloud.product.vo.app.SpuVO;

import java.math.BigInteger;
import java.util.List;

public interface SpuService {
    List<SpuVO> getSpuListInfo();

    List<SpuVO> listBySid(Long spuId);

    void save(SpuVO spuVO);
}
