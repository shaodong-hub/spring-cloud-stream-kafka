package com.github.springcloudstreamkafka.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * <p>
 * 创建时间为 下午11:21 2020/1/16
 * 项目名称 spring-cloud-stream-kafka
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StreamDataDTO {

    private String data;

    private Date date;

}
