
package com.panshiqi.study.archetype.web.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panshiqi.study.archetype.web.spring.dao.DemoDao;
import com.panshiqi.study.archetype.web.spring.entity.DO.DemoDO;
import com.panshiqi.study.archetype.web.spring.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoDao demoDao;

    @Override
    public List<DemoDO> query(DemoDO param) {

        return demoDao.query(param);
    }

}
