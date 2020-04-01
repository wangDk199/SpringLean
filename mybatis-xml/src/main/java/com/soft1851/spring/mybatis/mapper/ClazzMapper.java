package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.entity.Clazz;

/**
 * @author ke
 * @ClassName ClazzMapper
 * @Description TOOD
 * @Date 2020/4/1
 * @Version 1.0
 **/
public interface ClazzMapper {
    /**
     * 根据clazzId一对多关联查询本班所有学生
     * @param clazzId
     * @return
     */
    Clazz getClazzOneToMany(int clazzId);
}
