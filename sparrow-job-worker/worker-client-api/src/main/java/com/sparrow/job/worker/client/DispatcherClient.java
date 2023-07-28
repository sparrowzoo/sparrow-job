package com.sparrow.job.worker.client;

import com.sparrow.job.worker.client.protocol.IdleParam;
import com.sparrow.job.worker.client.protocol.KillParam;
import com.sparrow.job.worker.client.protocol.TriggerParam;
import com.sparrow.protocol.BusinessException;

public interface DispatcherClient {
    /**
     * 调度器在路由前对worker进行ping操作，保证worker 可用
     *
     * @throws BusinessException
     */
    void ping() throws BusinessException;


    /**
     * 调度器在路由前判断worker 是否空闲
     *
     * @param idleParam
     * @return
     * @throws BusinessException
     */
    Integer idle(IdleParam idleParam) throws BusinessException;


    /**
     * 调度器将客户端线程池杀死，在手动重启任务前使用
     *
     * @param killParam
     * @throws BusinessException
     */
    void kill(KillParam killParam) throws BusinessException;

    /**
     * 任务调度
     * @param triggerParam
     * @throws BusinessException
     */
    void dispatcher(TriggerParam triggerParam) throws BusinessException;
}
