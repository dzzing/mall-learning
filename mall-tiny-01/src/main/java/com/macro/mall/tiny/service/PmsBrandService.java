package com.macro.mall.tiny.service;

import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.mbg.model.PmsBrand;

import java.util.List;

/**
 * PmsBrandService实现类
 * @author Dpc
 */
public interface PmsBrandService {
    /**
     * 查询所有的品牌
     * @return
     */
    List<PmsBrand> listAllBrand();

    /**
     * 创建品牌
     * @param pmsBrand
     * @return
     */
    int createBrand(PmsBrand pmsBrand);

    /**
     * 更新品牌
     * @param id
     * @param pmsBrand
     * @return
     */
    int updateBrand(Long id, PmsBrand pmsBrand);

    /**
     * 删除品牌
     * @param id
     * @return
     */
    int deleteBrand(Long id);

    /**
     * 分页查询
     * @param pageNumber
     * @param pageSize
     * @return
     */
    List<PmsBrand> listBrand(Integer pageNumber, Integer pageSize);

    /**
     * 根据ID查询品牌
     * @param id
     * @return
     */
    PmsBrand getBrand(Long id);
}
