package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbBrand;
import com.pinyougou.pojo.TbTypeTemplate;
import entity.PageResult;


/**
 * Created by lenovo on 2018/9/6.
 */
public interface TypeTemplateService {

    public PageResult findPage(TbTypeTemplate tbTypeTemplate, int page, int rows);

    public PageResult findPage(int page, int rows);

    public void add(TbTypeTemplate tbTypeTemplate);

    public void delete(Long[] ids);

    public TbTypeTemplate findOne(Long id);

    public void update(TbTypeTemplate tbTypeTemplate);
}
