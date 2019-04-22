
package com.panshiqi.study.archetype.web.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.panshiqi.study.archetype.web.spring.common.util.LoggerUtil;

public class TEST {

    private final static Logger log = LoggerFactory.getLogger(TEST.class);

    public static void main(String[] args) {

        LoggerUtil.INSTANCE.access("panshiqi access log");
        log.error("panshiqi error log");

    }
}
