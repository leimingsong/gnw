package com.gnw.Base;

import com.alibaba.druid.util.StringUtils;
import com.gnw.Util.UsersUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 基础服务层接口
 * @param <T>
 */
@Transactional(readOnly = true)
public class BaseServiceImpl<D extends BaseDao<T>,T extends BasePojo<T>>{

    /**
     * 日志对象
     */
    protected Logger logger = LoggerFactory.getLogger(getClass());
    /**
     * 持久层对象
     */
    @Autowired(required = false)
    protected D dao;
    /**
     * 根据主键删除数据
     *
     * @param id
     */
    @Transactional()
    public int deleteById(String id) {
        return dao.deleteByPrimaryKey(id);
    }

    @Transactional()
    public int batchDelete(List<String> ids) {
        try {
            if (ids != null && ids.size() > 0) {
                for (String id : ids) {
                    dao.deleteByPrimaryKey(id);
                }
                return ids.size();
            }
            return 0;

        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /**
     * 插入数据
     */
    @Transactional()
    public String insert(T record) {
        if (StringUtils.isEmpty(record.getId())) {
            record.setId(UsersUtil.uuid());
        }
        if (dao.insert(record) > 0) {
            return "新增成功";
        }
        return "新增失败";
    }

    /**
     * 选择性的插入数据
     */
    @Transactional()
    public String insertSelective(T record) {
        if (StringUtils.isEmpty(record.getId())) {
            record.setId(UsersUtil.uuid());
        }
        if (dao.insertSelective(record) > 0) {
            return "新增成功";
        }
        return "新增失败";
    }


    /**
     * 根据实体对象条件进行查询
     */
    public List<T> findAll(T record) {
        return dao.selectAll(record);
    }
    /**
     * 根据主键更新数据
     */
    @Transactional()
    public String updateById(T record) {
        if (dao.updateByPrimaryKey(record) > 0) {
            return "更新成功";
        }
        return "更新失败";
    }

    /**
     * 根据主键删除数据
     */
    @Transactional()
    public String del(T record) {
        if (dao.updateByPrimaryKeySelective(record) > 0) {
            return "删除成功";
        }
        return "删除失败";
    }

    /**
     * @description : 编辑
     * @params : [t]
     * @date : 16:10 2018/4/24
     */
    @Transactional()
    public String save(T t) {
        if (StringUtils.isEmpty(t.getId())) {
            return this.updateById(t);      //修改
        } else {
            return this.insert(t);                   //新增
        }
    }
}
