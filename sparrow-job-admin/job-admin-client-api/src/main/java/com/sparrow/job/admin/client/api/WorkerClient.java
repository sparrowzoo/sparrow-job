package com.sparrow.job.admin.client.api;

import com.sparrow.job.admin.client.protocol.HandlerCallbackParam;
import com.sparrow.job.admin.client.protocol.WorkerRegisterParam;
import com.sparrow.job.admin.client.protocol.WorkerRemoveParam;
import com.sparrow.protocol.BusinessException;

import java.util.List;

public interface WorkerClient {
    /**
     * 注册工作节点
     * 每30秒定时注册 相当于心跳逻辑
     * <p>
     * admin 可以直接拿到注册过来的client ip
     *
     * @param workerRegisterParam
     * @throws BusinessException
     */
    void register(WorkerRegisterParam workerRegisterParam) throws BusinessException;

    /**
     * 移除工作节点
     * <p>
     * admin 可以直接拿到注册过来的client ip
     *
     * @param workerRemove
     */
    void remove(WorkerRemoveParam workerRemove);

    /**
     * 任务执行后的回调
     *
     * @param handlerCallbacks
     */
    void callback(List<HandlerCallbackParam> handlerCallbacks);
}
