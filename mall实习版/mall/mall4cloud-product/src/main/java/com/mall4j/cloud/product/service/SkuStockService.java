package com.mall4j.cloud.product.service;

import com.mall4j.cloud.product.vo.app.SkuStockVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SkuStockService {
    List<SkuStockVO> listSSK(Long stock_id);

    List<SkuStockVO> save(SkuStockVO skuStockVO);

    List<SkuStockVO> update(SkuStockVO skuStockVO);

    List<SkuStockVO> delete(Long stock_id);

    List<SkuStockVO> getPage(Integer pageNum, Integer pageSize);
}
