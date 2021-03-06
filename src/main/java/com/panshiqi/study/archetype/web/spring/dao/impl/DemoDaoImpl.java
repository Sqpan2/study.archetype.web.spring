
package com.panshiqi.study.archetype.web.spring.dao.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.panshiqi.study.archetype.web.spring.dao.BaseDao;
import com.panshiqi.study.archetype.web.spring.dao.DemoDao;
import com.panshiqi.study.archetype.web.spring.entity.DO.DemoDO;

@Repository
public class DemoDaoImpl extends BaseDao implements DemoDao {

    private String SQLMAP_NAMESPACE = "com.panshiqi.study.archetype.web.spring.dao.DemoDao.";

    @Override
    public List<DemoDO> query(DemoDO param) {
        if (param == null) {
            return Collections.emptyList();
        }
        return this.getSqlSession().selectList(SQLMAP_NAMESPACE.concat("query"), param);
    }
}
