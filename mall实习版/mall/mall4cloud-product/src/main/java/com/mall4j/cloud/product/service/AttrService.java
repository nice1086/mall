package com.mall4j.cloud.product.service;

import com.mall4j.cloud.product.vo.app.AttrVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AttrService {
    List<AttrVO> listByAid(Long attr_id);

    void save(AttrVO attrVO);

    void update(AttrVO attrVO);

    void delete(Long attr_id);

    List<AttrVO> listByCid(Long category_id);

    List<AttrVO> listShop();

    List<AttrVO> getPage(Integer pageNum, Integer pageSize);
}
