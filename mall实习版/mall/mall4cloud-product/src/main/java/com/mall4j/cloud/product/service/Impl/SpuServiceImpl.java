package com.mall4j.cloud.product.service.Impl;

import com.mall4j.cloud.product.mapper.SpuMapper;
import com.mall4j.cloud.product.service.SpuService;
import com.mall4j.cloud.product.vo.app.SpuVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class SpuServiceImpl implements SpuService {

    @Autowired
    private SpuMapper spuMapper;

    @Override
    public List<SpuVO> getSpuListInfo() {
        return spuMapper.getSpuListInfo();
    }

    @Override
    public List<SpuVO> listBySid(Long spuId) {
        return spuMapper.listBySid(spuId);
    }

    @Override
    public void save(SpuVO spuVO) {
        return;
    }
}
