package com.mall4j.cloud.product.mapper;

import com.mall4j.cloud.product.vo.app.SkuStockVO;

import java.util.List;

public interface SkuStockMapper {
    List<SkuStockVO> listSSK(Long stock_id);

    List<SkuStockVO> save(SkuStockVO skuStockVO);

    List<SkuStockVO> update(SkuStockVO skuStockVO);

    List<SkuStockVO> delete(Long stock_id);

    List<SkuStockVO> getPage();
}
