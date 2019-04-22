
package com.panshiqi.study.archetype.web.spring.dao;

import java.util.List;

import com.panshiqi.study.archetype.web.spring.entity.DO.DemoDO;

public interface DemoDao {

    public List<DemoDO> query(DemoDO param);

}
