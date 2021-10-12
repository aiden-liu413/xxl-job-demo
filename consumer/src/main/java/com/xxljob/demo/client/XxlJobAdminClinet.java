package com.xxljob.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * @author： aiden
 * @description：
 * @date： 2021/10/8 1:48 下午
 */
@FeignClient(value = "xxl-job-admin")
public interface XxlJobAdminClinet {

    String PATH = "xxl-job-admin";

    @GetMapping(PATH + "/jobinfo/pageList")
    HashMap jobInfoPageList(@SpringQueryMap Map param);

    @GetMapping(PATH + "/jobinfo/add")
    HashMap add(@SpringQueryMap Map param);

    @GetMapping(PATH + "/jobinfo/trigger")
    HashMap trigger(@SpringQueryMap Map param);

    @GetMapping(PATH + "/jobinfo/remove")
    HashMap remove(@SpringQueryMap Map param);

    @GetMapping(PATH + "/jobinfo/start")
    HashMap start(@SpringQueryMap Map param);

    @GetMapping(PATH + "/jobinfo/stop")
    HashMap stop(@SpringQueryMap Map param);
}
