package com.rcacao.tactics.core.data.status

data class StatusEffect(val status: Status, val operation: StatusOperation, val rate: Int) {
    constructor(status: Status, operation: StatusOperation) : this(status, operation, 100)
}
