package com.github.springcloudstreamkafka.message;

import com.github.springcloudstreamkafka.pojo.StreamDataDTO;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 创建时间为 下午11:06 2020/1/16
 * 项目名称 spring-cloud-stream-kafka
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@Slf4j
@Component
@EnableBinding(StreamClient.class)
public class StreamReceiver {

    @StreamListener(StreamClient.INPUT)
    @SendTo(StreamClient.INPUT2)
    public String process(@NotNull StreamDataDTO message) {
        log.info("StreamReceiver - process:{}", message.toString());
        return message.toString();
    }

    @StreamListener(StreamClient.INPUT2)
    public void process2(@NotNull String message) {
        log.info("StreamReceiver - process2:{}", message);
    }

}
