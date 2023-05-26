package com.mall4j.cloud.product.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mall4j.cloud.product.bo.SpuDTO;
import com.mall4j.cloud.product.mapper.SpuMapper;
import com.mall4j.cloud.product.service.SpuService;
import com.mall4j.cloud.product.vo.app.SkuVO;
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
    public List<SpuVO> getPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<SpuVO> list = spuMapper.getPage();
        PageInfo<SpuVO> pageInfo = new PageInfo(list);
        return pageInfo.getList();
    }

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
        spuMapper.save(spuVO);
    }

    @Override
    public void update(SpuVO spuVO) {
        spuMapper.update(spuVO);
    }

    @Override
    public void delete(Long spuId) {
        spuMapper.delete(spuId);
    }

    @Override
    public List<SpuVO> getPlatformPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<SpuVO> list = spuMapper.getPlatformPage();
        PageInfo<SpuVO> pageInfo = new PageInfo(list);
        return pageInfo.getList();
    }

    @Override
    public void putAndDown(SkuVO skuVO) {
        spuMapper.putAndDown(skuVO);
    }

    @Override
    public void updateSpu(SpuDTO spuDTO) {
        spuMapper.updateSpu(spuDTO);
    }

    @Override
    public List<SpuVO> getProdInfo(Long spuId) {
        return spuMapper.getProdInfo(spuId);
    }
}
