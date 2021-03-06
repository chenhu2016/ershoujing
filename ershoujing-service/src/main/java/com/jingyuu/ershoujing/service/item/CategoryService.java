package com.jingyuu.ershoujing.service.item;

import com.jingyuu.ershoujing.common.exception.JyuException;
import com.jingyuu.ershoujing.dao.jpa.entity.item.CategoryEntity;
import com.jingyuu.ershoujing.dao.mybatis.bo.CategoryBo;

import java.util.List;

/**
 * @author owen
 * @date 2017-10-09
 */
public interface CategoryService {
    /**
     * 创建类目
     *
     * @param categoryBo
     */
    void save(CategoryBo categoryBo) throws JyuException;

    /**
     * 查询类目详情
     *
     * @param categoryId 类目编号
     * @return
     * @throws JyuException
     */
    CategoryEntity load(long categoryId) throws JyuException;

    /**
     * 查询类目详情
     *
     * @param categoryId 类目编号
     * @return
     */
    CategoryEntity get(long categoryId);

    /**
     * 查询类目列表
     *
     * @return
     */
    List<CategoryEntity> listCategory();
}
