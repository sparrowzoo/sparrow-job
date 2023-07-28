package com.sparrow.job.worker.client.protocol;

import com.sparrow.protocol.Param;

public class IdleParam implements Param {
    private static final long serialVersionUID = 42L;

    private int jobId;


    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

}
