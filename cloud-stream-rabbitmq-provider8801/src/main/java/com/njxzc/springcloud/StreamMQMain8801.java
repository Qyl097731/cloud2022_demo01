package com.njxzc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.springcloud
 * date: 2022-07-05 22:13
 * copyright(c) 2020 南晓18卓工 邱依良
 *
 * @author 邱依良
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamMQMain8801 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMQMain8801.class, args);
    }
}
