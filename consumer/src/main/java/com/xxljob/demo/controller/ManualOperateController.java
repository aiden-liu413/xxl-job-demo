package com.xxljob.demo.controller;

import cn.hutool.json.JSONUtil;
import com.google.common.collect.Maps;
import com.xxl.job.core.enums.ExecutorBlockStrategyEnum;
import com.xxl.job.core.glue.GlueTypeEnum;
import com.xxljob.demo.client.XxlJobAdminClinet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 手动操作 xxl-job
 * </p>
 *
 * @author aiden
 */
@Slf4j
@RestController
@RequestMapping("/xxl-job")
//@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ManualOperateController {
    private final static String JOB_GROUP_URI = "/jobgroup";
    private final static String XXL_JOB_ADMIN = "http://xxl-job-admin/xxl-job-admin";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private XxlJobAdminClinet xxlJobAdminClinet;

    /**
     * 任务组列表，xxl-job叫做触发器列表
     */
    @GetMapping("/group")
    public Object xxlJobGroup() {
        HashMap reponse = restTemplate.getForObject( XXL_JOB_ADMIN + JOB_GROUP_URI + "/list", HashMap.class);
        log.info("【execute】= {}", reponse);
        return reponse;
    }

    /**
     * 分页任务列表
     *
     * @param page 当前页，第一页 -> 0
     * @param size 每页条数，默认10
     * @return 分页任务列表
     */
    @GetMapping("/list")
    public Object xxlJobList(Integer page, Integer size) {
        Map<String, Object> jobInfo = Maps.newHashMap();
        jobInfo.put("start", page != null ? page : 0);
        jobInfo.put("length", size != null ? size : 10);
        jobInfo.put("jobGroup", 2);
        jobInfo.put("triggerStatus", -1);

        HashMap reponse = xxlJobAdminClinet.jobInfoPageList(jobInfo);
        log.info("【reponse】= {}", reponse);
        return reponse;
    }

    /**
     * 测试手动保存任务
     */
    @GetMapping("/add")
    public Object xxlJobAdd() {
        Map<String, Object> jobInfo = Maps.newHashMap();
        jobInfo.put("jobGroup", 2);
        jobInfo.put("scheduleType", "CRON");
        jobInfo.put("scheduleConf", "0 0/1 * * * ? *");
        jobInfo.put("jobDesc", "手动添加的任务");
        jobInfo.put("author", "admin");
        jobInfo.put("executorRouteStrategy", "ROUND");
        jobInfo.put("misfireStrategy", "DO_NOTHING");
        jobInfo.put("executorHandler", "demoTask");
        jobInfo.put("executorParam", "手动添加的任务的参数");
        jobInfo.put("executorBlockStrategy", ExecutorBlockStrategyEnum.SERIAL_EXECUTION);
        jobInfo.put("glueType", GlueTypeEnum.BEAN);

        HashMap reponse = xxlJobAdminClinet.add(jobInfo);
        log.info("【reponse】= {}", reponse);
        return reponse;
    }

    /**
     * 测试手动触发一次任务
     */
    @GetMapping("/trigger")
    public Object xxlJobTrigger() {
        Map<String, Object> jobInfo = Maps.newHashMap();
        jobInfo.put("id", 2);
        jobInfo.put("executorParam", JSONUtil.toJsonStr(jobInfo));

        HashMap reponse = xxlJobAdminClinet.trigger(jobInfo);
        log.info("【reponse】= {}", reponse);
        return reponse;
    }

    /**
     * 测试手动删除任务
     */
    @GetMapping("/remove")
    public Object xxlJobRemove() {
        Map<String, Object> jobInfo = Maps.newHashMap();
        jobInfo.put("id", 2);

        HashMap reponse = xxlJobAdminClinet.remove(jobInfo);
        log.info("【reponse】= {}", reponse);
        return reponse;
    }

    /**
     * 测试手动停止任务
     */
    @GetMapping("/stop")
    public Object xxlJobStop() {
        Map<String, Object> jobInfo = Maps.newHashMap();
        jobInfo.put("id", 2);

        HashMap reponse = xxlJobAdminClinet.stop(jobInfo);
        log.info("【reponse】= {}", reponse);
        return reponse;
    }

    /**
     * 测试手动启动任务
     */
    @GetMapping("/start")
    public Object xxlJobStart() {
        Map<String, Object> jobInfo = Maps.newHashMap();
        jobInfo.put("id", 2);

        HashMap reponse = xxlJobAdminClinet.start(jobInfo);
        log.info("【reponse】= {}", reponse);
        return reponse;
    }

}
