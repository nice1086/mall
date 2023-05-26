package com.mall4j.cloud.product.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mall4j.cloud.product.mapper.AttrMapper;
import com.mall4j.cloud.product.service.AttrService;
import com.mall4j.cloud.product.vo.app.AttrVO;
import com.mall4j.cloud.product.vo.app.SpuVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AttrServiceImpl implements AttrService {
    @Autowired
    private AttrMapper attrMapper;
    @Override
    public List<AttrVO> listByAid(Long attr_id) {
        return attrMapper.listByAid(attr_id);
    }

    @Override
    public void save(AttrVO attrVO) {
        attrMapper.save(attrVO);
    }

    @Override
    public void update(AttrVO attrVO) {
        attrMapper.update(attrVO);
    }

    @Override
    public void delete(Long attr_id) {
        attrMapper.delete(attr_id);
    }

    @Override
    public List<AttrVO> listByCid(Long category_id) {
        return attrMapper.listByCid(category_id);
    }

    @Override
    public List<AttrVO> listShop() {
        return attrMapper.listShop();
    }

    @Override
    public List<AttrVO> getPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<AttrVO> list = attrMapper.getPage();
        PageInfo<AttrVO> pageInfo = new PageInfo(list);
        return pageInfo.getList();
    }
}
