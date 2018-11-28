package com.ck.esdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

/**
 * project es-demo
 *
 * @author chenghai on 2018/10/31 0031. - 星期三
 * nickName louyedaren
 */
@Configuration
@EnableElasticsearchRepositories(basePackages = "com.ck.esdemo.repository")
public class ElasticConfig {
}
