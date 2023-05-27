package com.mall4j.cloud.product.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mall4j.cloud.product.mapper.SkuStockMapper;
import com.mall4j.cloud.product.service.SkuStockService;
import com.mall4j.cloud.product.vo.app.BrandVO;
import com.mall4j.cloud.product.vo.app.SkuStockVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SkuStockServiceImpl implements SkuStockService {

    @Autowired
    private SkuStockMapper skuStockMapper;

    @Override
    public List<SkuStockVO> listSSK(Long stock_id) {
        return skuStockMapper.listSSK(stock_id);
    }

    @Override
    public List<SkuStockVO> save(SkuStockVO skuStockVO) {

        return skuStockMapper.save(skuStockVO);
    }

    @Override
    public List<SkuStockVO> update(SkuStockVO skuStockVO) {

        return skuStockMapper.update(skuStockVO);
    }

    @Override
    public List<SkuStockVO> delete(Long stock_id) {
        return skuStockMapper.delete(stock_id);
    }

    @Override
    public List<SkuStockVO> getPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<SkuStockVO> list = skuStockMapper.getPage();
        PageInfo<SkuStockVO> pageInfo = new PageInfo(list);
        return pageInfo.getList();
    }
}
