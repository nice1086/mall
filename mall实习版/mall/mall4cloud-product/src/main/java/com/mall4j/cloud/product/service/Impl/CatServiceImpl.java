package com.mall4j.cloud.product.service.Impl;

import com.mall4j.cloud.product.mapper.CatMapper;
import com.mall4j.cloud.product.service.CatService;
import com.mall4j.cloud.product.vo.app.CatVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CatServiceImpl implements CatService {

    @Autowired
    private CatMapper catMapper;

    @Override
    public List<CatVO> listByCid(Long category_id) {
        return catMapper.listByCid(category_id);
    }

    @Override
    public void save(CatVO catVO) {
        catMapper.save(catVO);
    }

    @Override
    public void update(CatVO catVO) {
        catMapper.update(catVO);
    }

    @Override
    public void delete(Long category_id) {
        catMapper.delete(category_id);
    }

    @Override
    public void enableOrDisable(CatVO catVO) {
        catMapper.enableOrDisable(catVO);
    }

    @Override
    public List<CatVO> listByPid(Long parent_id) {
        return catMapper.listByPid(parent_id);
    }

    @Override
    public List<CatVO> listPlatform() {
        return catMapper.listPlatform();
    }

    @Override
    public List<CatVO> listShop() {
        return catMapper.listShop();
    }

    @Override
    public List<CatVO> list(Long parent_id, Long shop_id) {
        return catMapper.list(parent_id,shop_id);
    }

    @Override
    public List<CatVO> listShop(Long shop_id) {
        return catMapper.listShop(shop_id);
    }
}
