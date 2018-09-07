package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pinyougou.mapper.TbTypeTemplateMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.pojo.TbBrandExample;
import com.pinyougou.pojo.TbTypeTemplate;
import com.pinyougou.pojo.TbTypeTemplateExample;
import com.pinyougou.sellergoods.service.TypeTemplateService;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lenovo on 2018/9/6.
 */
@Service
public class TypeTemplateServiceImpl implements TypeTemplateService {

    @Autowired
    private TbTypeTemplateMapper tbTypeTemplateMapper;

    @Override
    public PageResult findPage(int page, int rows) {
        PageHelper.startPage(page, rows);
        Page<TbTypeTemplate> p = (Page<TbTypeTemplate>) tbTypeTemplateMapper.selectByExample(null);
        return new PageResult(p.getTotal(), p.getResult());
    }

    @Override
    public PageResult findPage(TbTypeTemplate tbTypeTemplate, int page, int rows) {
        PageHelper.startPage(page, rows);
        TbTypeTemplateExample example = new TbTypeTemplateExample();
        TbTypeTemplateExample.Criteria criteria = example.createCriteria();
        if (tbTypeTemplate != null) {
            if (tbTypeTemplate.getName() != null && tbTypeTemplate.getName().length() > 0) {
                criteria.andNameLike("%" + tbTypeTemplate.getName() + "%");
            }

        }
        Page<TbTypeTemplate> p = (Page<TbTypeTemplate>) tbTypeTemplateMapper.selectByExample(example);
        return new PageResult(p.getTotal(), p.getResult());
    }

    @Override
    public void add(TbTypeTemplate tbTypeTemplate) {
        tbTypeTemplateMapper.insert(tbTypeTemplate);
    }

    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            tbTypeTemplateMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public TbTypeTemplate findOne(Long id) {
        return tbTypeTemplateMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(TbTypeTemplate tbTypeTemplate) {
        tbTypeTemplateMapper.updateByPrimaryKey(tbTypeTemplate);
    }

}
