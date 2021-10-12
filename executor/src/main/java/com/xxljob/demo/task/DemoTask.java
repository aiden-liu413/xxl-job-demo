package com.xxljob.demo.task;

import cn.hutool.core.util.RuntimeUtil;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author： aiden
 * @description：
 * @date： 2021/9/23 5:21 下午
 */
@Component
@RefreshScope
public class DemoTask {

    @Value("${executor.desc}")
    private String desc;

    @XxlJob(value = "demoTask")
    public void demoTask() throws Exception {
        String jobParam = XxlJobHelper.getJobParam();
        System.out.println(jobParam);
        int i = 0;
        if ("error".equals(desc)) {
            XxlJobHelper.log(new RuntimeException("the ${executor.desc} value can not be error"));
        } else {
            while (i < 100) {
                XxlJobHelper.log(desc + i);
                i++;
            }
            XxlJobHelper.handleSuccess("任务执行成功");
        }
    }

    @XxlJob(value = "commandJobTask")
    public void commandJobTask() throws Exception {
        String command = XxlJobHelper.getJobParam();
        BufferedReader bufferedReader = null;
        try {
            Process exec = RuntimeUtil.exec(command);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(exec.getInputStream());
            bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream));

            // 记录日志
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                XxlJobHelper.log(line);
            }

            // command exit
            exec.waitFor();
            int exitValue = exec.exitValue();
        } catch (Exception e) {
            XxlJobHelper.log(e);
        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }
    }
}
