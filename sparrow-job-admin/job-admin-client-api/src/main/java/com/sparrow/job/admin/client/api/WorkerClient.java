package com.sparrow.job.admin.client.api;

import com.sparrow.job.admin.client.protocol.HandlerCallbackParam;
import com.sparrow.job.admin.client.protocol.WorkerRegisterParam;
import com.sparrow.job.admin.client.protocol.WorkerRemoveParam;
import com.sparrow.protocol.BusinessException;

public interface WorkerClient {
    void register(WorkerRegisterParam workerRegisterParam) throws BusinessException;

    void remove(WorkerRemoveParam workerRemove);

    void callback(HandlerCallbackParam handlerCallback);
}
