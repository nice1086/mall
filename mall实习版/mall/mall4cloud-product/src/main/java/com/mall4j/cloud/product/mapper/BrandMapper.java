package com.mall4j.cloud.product.mapper;

import com.mall4j.cloud.product.vo.app.BrandVO;
import com.mall4j.cloud.product.vo.app.CBVO;

import java.util.List;

public interface BrandMapper {
   Long listByCid(Long category_id);

    List<BrandVO> listByBid(Long brand_id);

    List<BrandVO> listByCatid(Long category_id);

    List<BrandVO> getPage();

    List<BrandVO> listBrand();
}
