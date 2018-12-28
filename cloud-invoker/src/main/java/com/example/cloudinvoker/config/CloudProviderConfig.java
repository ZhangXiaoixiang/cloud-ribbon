package com.example.cloudinvoker.config;

import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * CloudProviderConfig
 *
 * @author 10905 2018/12/28
 * @version 1.0
 */
@RibbonClient(name = "cloud-provider",configuration = MyConfig.class)
public class CloudProviderConfig {
}
