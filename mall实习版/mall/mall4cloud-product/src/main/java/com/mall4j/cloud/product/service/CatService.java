package com.mall4j.cloud.product.service;

import com.mall4j.cloud.product.vo.app.CatVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CatService {
    List<CatVO> listByCid(Long category_id);

    void save(CatVO catVO);

    void update(CatVO catVO);

    void delete(Long category_id);

    void enableOrDisable(CatVO catVO);

    List<CatVO> listByPid(Long parent_id);

    List<CatVO> listPlatform();

    List<CatVO> listShop();
}
