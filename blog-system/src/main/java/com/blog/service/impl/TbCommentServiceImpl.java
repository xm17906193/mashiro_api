package com.blog.service.impl;

import com.blog.dao.TbCommentDao;
import com.blog.entity.TbComment;
import com.blog.service.TbCommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbComment)表服务实现类
 *
 * @author xiamo
 * @since 2021-03-30 16:45:01
 */
@Service("tbCommentService")
public class TbCommentServiceImpl implements TbCommentService {
  @Resource private TbCommentDao tbCommentDao;

  /**
   * 通过ID查询单条数据
   *
   * @param id 主键
   * @return 实例对象
   */
  @Override
  public TbComment queryById(Integer id) {
    return this.tbCommentDao.queryById(id);
  }

  /**
   * 查询多条数据
   *
   * @param offset 查询起始位置
   * @param limit 查询条数
   * @return 对象列表
   */
  @Override
  public List<TbComment> queryAllByLimit(int offset, int limit) {
    return this.tbCommentDao.queryAllByLimit(offset, limit);
  }

  /**
   * 通过实体作为筛选条件查询
   *
   * @param tbComment 实例对象
   * @return 对象列表
   */
  @Override
  public List<TbComment> queryAll(TbComment tbComment) {
    return this.tbCommentDao.queryAll(tbComment);
  }

  /**
   * 新增数据
   *
   * @param tbComment 实例对象
   * @return 实例对象
   */
  @Override
  public TbComment insert(TbComment tbComment) {
    this.tbCommentDao.insert(tbComment);
    return tbComment;
  }

  /**
   * 修改数据
   *
   * @param tbComment 实例对象
   * @return 实例对象
   */
  @Override
  public TbComment update(TbComment tbComment) {
    this.tbCommentDao.update(tbComment);
    return this.queryById(tbComment.getId());
  }

  /**
   * 通过主键删除数据
   *
   * @param id 主键
   * @return 是否成功
   */
  @Override
  public boolean deleteById(Integer id) {
    return this.tbCommentDao.deleteById(id) > 0;
  }
}
