package com.mall4j.cloud.product.mapper;

import com.mall4j.cloud.product.vo.app.CatVO;

import java.util.List;

public interface CatMapper {
    List<CatVO> listByCid(Long category_id);

    void save(CatVO catVO);

    void update(CatVO catVO);

    void delete(Long category_id);

    void enableOrDisable(CatVO catVO);

    List<CatVO> listByPid(Long parent_id);

    List<CatVO> listPlatform();

    List<CatVO> listShop();
}
