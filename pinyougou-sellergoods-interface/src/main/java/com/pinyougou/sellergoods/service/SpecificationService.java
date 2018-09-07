package com.pinyougou.sellergoods.service;


import com.pinyougou.pojo.TbSpecification;
import com.pinyougou.pojogroup.Specification;
import entity.PageResult;

import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2018/9/5.
 */
public interface SpecificationService {

    public PageResult findPage(int page, int rows);

    public PageResult findPage(TbSpecification specification, int page, int rows);

    public void delete(Long[] ids);

    public void add(Specification specification);

    public Specification findOne(Long id);

    public void update(Specification specification);


    List<Map> selectOptionList();
}
