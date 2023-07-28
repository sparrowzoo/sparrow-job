package com.sparrow.job.admin.client.protocol;

import com.sparrow.protocol.Param;

public class WorkerRemoveParam implements Param {
    /**
     * port
     */
    private Integer port;

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
