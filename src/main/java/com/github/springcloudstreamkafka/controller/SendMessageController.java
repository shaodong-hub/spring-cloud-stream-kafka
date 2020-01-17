package com.github.springcloudstreamkafka.controller;

import com.github.springcloudstreamkafka.message.StreamClient;
import com.github.springcloudstreamkafka.pojo.StreamDataDTO;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * <p>
 * 创建时间为 下午11:09 2020/1/16
 * 项目名称 spring-cloud-stream-kafka
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@RestController
public class SendMessageController {

    @Resource
    private StreamClient streamClient;

    @GetMapping("/send")
    public void process() {
        StreamDataDTO streamData = StreamDataDTO.builder().data("now").date(new Date()).build();
        streamClient.output().send(MessageBuilder.withPayload(streamData).build());
    }


}
