package com.blog.dao;

import com.blog.entity.TbUserType;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (TbUserType)表数据库访问层
 *
 * @author xiamo
 * @since 2021-03-30 16:45:05
 */
@Mapper
public interface TbUserTypeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbUserType queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbUserType> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbUserType 实例对象
     * @return 对象列表
     */
    List<TbUserType> queryAll(TbUserType tbUserType);

    /**
     * 新增数据
     *
     * @param tbUserType 实例对象
     * @return 影响行数
     */
    int insert(TbUserType tbUserType);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbUserType> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TbUserType> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbUserType> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TbUserType> entities);

    /**
     * 修改数据
     *
     * @param tbUserType 实例对象
     * @return 影响行数
     */
    int update(TbUserType tbUserType);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}