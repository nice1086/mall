package com.mall4j.cloud.product.service;

import com.mall4j.cloud.product.vo.app.BrandVO;
import com.mall4j.cloud.product.vo.app.CBVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BrandService {
    Long listByCid(Long category_id);

    List<BrandVO> listByBid(Long brand_id);

    List<BrandVO> listByCatid(Long category_id);

    List<BrandVO> getPage(Integer pageNum, Integer pageSize);

    List<BrandVO> listBrand();

    List<BrandVO> listByBrid(Long brand_id);

    List<BrandVO> insertBrand(BrandVO brandVO);

    List<BrandVO> updateBrand(BrandVO brandVO);

    List<BrandVO> deleteBrand(Long brand_id);

    List<BrandVO> getPageSelect(Integer pageNum, Integer pageSize);

    List<BrandVO> updateBrandStatus(BrandVO brandVO);
}
