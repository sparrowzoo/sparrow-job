package com.sparrow.job.worker.client.protocol;

public class TriggerParam {
    /**
     * 任务id
     */
    private Long taskId;
    /**
     * job id
     */
    private Long jobId;
    /**
     * 微服务id
     */
    private Long microServiceId;
    /**
     * 阶段id
     */
    private Long stageId;
    /**
     * 触发时间
     */
    private Long triggerTime;
    /**
     * handler 名称
     */
    private String handlerName;
    /**
     * 静态参数
     */
    private String params;
    /**
     * 运行时参数
     */
    private String runtimeParams;
    /**
     * 调度超时时间
     */
    private Integer timeout;
    /**
     * glue 类型
     */
    private String glueType;
    /**
     * glue 源码
     */
    private String glueSource;
    /**
     * 分片索引
     */
    private Integer shardingIndex;
    /**
     * 分片数
     */
    private Integer shardingTotal;


    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public Long getMicroServiceId() {
        return microServiceId;
    }

    public void setMicroServiceId(Long microServiceId) {
        this.microServiceId = microServiceId;
    }

    public Long getStageId() {
        return stageId;
    }

    public void setStageId(Long stageId) {
        this.stageId = stageId;
    }

    public Long getTriggerTime() {
        return triggerTime;
    }

    public void setTriggerTime(Long triggerTime) {
        this.triggerTime = triggerTime;
    }

    public String getHandlerName() {
        return handlerName;
    }

    public void setHandlerName(String handlerName) {
        this.handlerName = handlerName;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getRuntimeParams() {
        return runtimeParams;
    }

    public void setRuntimeParams(String runtimeParams) {
        this.runtimeParams = runtimeParams;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public String getGlueType() {
        return glueType;
    }

    public void setGlueType(String glueType) {
        this.glueType = glueType;
    }

    public String getGlueSource() {
        return glueSource;
    }

    public void setGlueSource(String glueSource) {
        this.glueSource = glueSource;
    }

    public Integer getShardingIndex() {
        return shardingIndex;
    }

    public void setShardingIndex(Integer shardingIndex) {
        this.shardingIndex = shardingIndex;
    }

    public Integer getShardingTotal() {
        return shardingTotal;
    }

    public void setShardingTotal(Integer shardingTotal) {
        this.shardingTotal = shardingTotal;
    }
}
