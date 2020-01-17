package com.github.springcloudstreamkafka.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * <p>
 * 创建时间为 下午11:04 2020/1/16
 * 项目名称 spring-cloud-stream-kafka
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

public interface StreamClient {

    String INPUT = "TestMessage";
    String INPUT2 = "TestMessage2";

    @Input(INPUT)
    SubscribableChannel input();

    @Output(INPUT)
    MessageChannel output();

    @Input(INPUT2)
    SubscribableChannel input2();

    @Output(INPUT2)
    MessageChannel output2();


}
