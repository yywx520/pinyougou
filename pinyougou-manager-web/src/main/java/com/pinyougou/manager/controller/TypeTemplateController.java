package com.pinyougou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.pojo.TbTypeTemplate;
import com.pinyougou.sellergoods.service.TypeTemplateService;
import entity.PageResult;
import entity.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lenovo on 2018/9/6.
 */
@RestController
@RequestMapping("/typetemplate")
public class TypeTemplateController {

    @Reference
    private TypeTemplateService typeTemplateService;

    @RequestMapping("/search")
    public PageResult search(@RequestBody TbTypeTemplate tbTypeTemplate, int page, int rows) {
        return typeTemplateService.findPage(tbTypeTemplate, page, rows);
    }

    @RequestMapping("/findPage")
    public PageResult findPage(int page, int rows ) {
        return typeTemplateService.findPage(page, rows);
    }

    @RequestMapping("/add")
    public Result add(@RequestBody TbTypeTemplate typeTemplate){
        try {
            typeTemplateService.add(typeTemplate);
            return new Result(true, "增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败");
        }
    }

    @RequestMapping("/delete")
    public Result delete(Long [] ids){
        try {
            typeTemplateService.delete(ids);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }

    @RequestMapping("/findOne")
    public TbTypeTemplate findOne(Long id){
        return typeTemplateService.findOne(id);
    }

    @RequestMapping("/update")
    public Result update(@RequestBody TbTypeTemplate typeTemplate){
        try {
            typeTemplateService.update(typeTemplate);
            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }
    }

}
