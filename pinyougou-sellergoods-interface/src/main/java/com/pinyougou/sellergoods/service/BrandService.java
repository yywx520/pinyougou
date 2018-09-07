package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbBrand;
import entity.PageResult;

import java.util.List;
import java.util.Map;

/**
 * 品牌接口
 * Created by yangzhichao on 2018-09-05.
 */
public interface BrandService {

	/**
	 * 品牌列表查询
	 * @return
	 */
	public List<TbBrand> findAll();

	/**
	 * 品牌分页查询
	 * @param page
	 * @param rows
	 * @return
	 */
	public PageResult findPage(int page, int rows);

	/**
	 * 新增品牌
	 * @param tbBrand
	 */
	public void add(TbBrand tbBrand);

	/**
	 * 修改回显品牌
	 * @param id
	 * @return
	 */
	public TbBrand findOne(Long id);

	/**
	 * 修改品牌
	 * @param tbBrand
	 */
	public void update(TbBrand tbBrand);

	/**
	 *
	 * @param ids
	 */
	public void delete(Long[] ids);

	/**
	 *带条件的分页查询
	 * @param tbBrand
	 * @param page
	 * @param rows
	 * @return
	 */
	public PageResult findPage(TbBrand tbBrand, int page, int rows);

	List<Map> selectOptionList();

}
