package com.sparrow.job.worker.client.protocol;

import java.io.Serializable;

public class KillParam implements Serializable {
    private int jobId;
    
    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

}
