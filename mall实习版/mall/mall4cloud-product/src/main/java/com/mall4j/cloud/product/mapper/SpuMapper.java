package com.mall4j.cloud.product.mapper;

import com.mall4j.cloud.product.vo.app.SpuVO;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.List;

@Component
public interface SpuMapper {
    List<SpuVO> getSpuListInfo();

    List<SpuVO> listBySid(Long spuId);
}
