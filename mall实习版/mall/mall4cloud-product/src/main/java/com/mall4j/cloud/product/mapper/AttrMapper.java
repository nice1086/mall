package com.mall4j.cloud.product.mapper;

import com.mall4j.cloud.product.vo.app.AttrVO;

import java.util.List;

public interface AttrMapper {
    List<AttrVO> listByAid(Long attr_id);

    void save(AttrVO attrVO);

    void update(AttrVO attrVO);

    void delete(Long attr_id);

    List<AttrVO> listByCid(Long category_id);

    List<AttrVO> listShop();

    List<AttrVO> getPage();
}
