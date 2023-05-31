package com.mall4j.cloud.product.mapper;

import com.mall4j.cloud.product.vo.app.CatVO;
import org.apache.ibatis.annotations.Param;

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

    List<CatVO> list(@Param("parent_id") Long parent_id,
                     @Param("shop_id") Long shop_id);

    List<CatVO> listShop(Long shop_id);
}
