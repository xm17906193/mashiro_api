package com.blog.dao;

import com.blog.entity.TbCommentDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TbCommentDetail)表数据库访问层
 *
 * @author xiamo
 * @since 2021-03-30 16:45:01
 */
@Mapper
public interface TbCommentDetailDao {

  /**
   * 通过ID查询单条数据
   *
   * @param id 主键
   * @return 实例对象
   */
  TbCommentDetail queryById(Integer id);

  /**
   * 首页查最新前五条
   *
   * @return 对象列表
   */
  List<TbCommentDetail> queryByIndex();

  /**
   * 通过博客id作为查询条件查询
   *
   * @return 对象列表
   */
  List<TbCommentDetail> queryByblogId(Integer id);

  /**
   * 查询指定行数据
   *
   * @param offset 查询起始位置
   * @param limit 查询条数
   * @return 对象列表
   */
  List<TbCommentDetail> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

  /**
   * 通过实体作为筛选条件查询
   *
   * @param tbCommentDetail 实例对象
   * @return 对象列表
   */
  List<TbCommentDetail> queryAll(TbCommentDetail tbCommentDetail);

  /**
   * 新增数据
   *
   * @param tbCommentDetail 实例对象
   * @return 影响行数
   */
  int insert(TbCommentDetail tbCommentDetail);

  /**
   * 批量新增数据（MyBatis原生foreach方法）
   *
   * @param entities List<TbCommentDetail> 实例对象列表
   * @return 影响行数
   */
  int insertBatch(@Param("entities") List<TbCommentDetail> entities);

  /**
   * 批量新增或按主键更新数据（MyBatis原生foreach方法）
   *
   * @param entities List<TbCommentDetail> 实例对象列表
   * @return 影响行数
   */
  int insertOrUpdateBatch(@Param("entities") List<TbCommentDetail> entities);

  /**
   * 修改数据
   *
   * @param tbCommentDetail 实例对象
   * @return 影响行数
   */
  int update(TbCommentDetail tbCommentDetail);

  /**
   * 通过主键删除数据
   *
   * @param id 主键
   * @return 影响行数
   */
  int deleteById(Integer id);
}
