package com.br.fastBurguer.infra.controllers.queue;

import com.br.fastBurguer.core.Enums.QueueStatusEnum;

public record QueueStatusRequest(
        QueueStatusEnum queueStatus) {

}
