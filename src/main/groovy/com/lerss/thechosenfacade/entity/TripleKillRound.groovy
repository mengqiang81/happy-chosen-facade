package com.lerss.thechosenfacade.entity

import java.time.OffsetDateTime

/**
 * 一局游戏
 */
class TripleKillRound {
    String id
    /**
     * 第几期
     */
    Long period
    /**
     * 游戏状态
     */
    String status
    /**
     * 创建时间
     */
    OffsetDateTime dateCreated
    /**
     * 最后修改时间
     */
    OffsetDateTime lastUpdated
}
