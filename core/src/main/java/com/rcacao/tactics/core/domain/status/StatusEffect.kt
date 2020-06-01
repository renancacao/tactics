package com.rcacao.tactics.core.domain.status

import com.rcacao.tactics.core.data.status.model.StatusOperation

data class StatusEffect(val status: Status, val operation: StatusOperation)
