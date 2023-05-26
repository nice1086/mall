package com.mall4j.cloud.product.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mall4j.cloud.product.mapper.BrandMapper;
import com.mall4j.cloud.product.service.BrandService;
import com.mall4j.cloud.product.vo.app.BrandVO;
import com.mall4j.cloud.product.vo.app.CBVO;
import com.mall4j.cloud.product.vo.app.SpuVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public Long listByCid(Long category_id) {
        return brandMapper.listByCid(category_id);
    }

    @Override
    public List<BrandVO> listByBid(Long brand_id) {
        return brandMapper.listByBid(brand_id);
    }

    @Override
    public List<BrandVO> listByCatid(Long category_id) {
        return brandMapper.listByCatid(category_id);
    }

    @Override
    public List<BrandVO> getPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<BrandVO> list = brandMapper.getPage();
        PageInfo<BrandVO> pageInfo = new PageInfo(list);
        return pageInfo.getList();
    }

    @Override
    public List<BrandVO> listBrand() {
        return brandMapper.listBrand();
    }

    @Override
    public List<BrandVO> listByBrid(Long brand_id) {
        return brandMapper.listByBrid(brand_id);
    }

    @Override
    public List<BrandVO> insertBrand(BrandVO brandVO) {
        return brandMapper.insertBrand(brandVO);
    }

    @Override
    public List<BrandVO> updateBrand(BrandVO brandVO) {
        return brandMapper.updateBrand(brandVO);
    }

    @Override
    public List<BrandVO> deleteBrand(Long brand_id) {
        return brandMapper.deleteBrand(brand_id);
    }

    @Override
    public List<BrandVO> getPageSelect(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<BrandVO> list = brandMapper.getPageSelect();
        PageInfo<BrandVO> pageInfo = new PageInfo(list);
        return pageInfo.getList();
    }

    @Override
    public List<BrandVO> updateBrandStatus(BrandVO brandVO) {
        return brandMapper.updateBrandStatus(brandVO);
    }
}
