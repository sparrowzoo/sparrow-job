package com.sparrow.job.admin.client.protocol;

import com.sparrow.protocol.Param;

public class WorkerRegisterParam implements Param {
    /**
     * 应用ID，上线前需要申请APP ID，默认为0
     */
    private Long appId = 0L;

    /**
     * 微服务ID
     */
    private Long microServerId;
    /**
     * 端口
     */
    private Integer port;

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public Long getMicroServerId() {
        return microServerId;
    }

    public void setMicroServerId(Long microServerId) {
        this.microServerId = microServerId;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
