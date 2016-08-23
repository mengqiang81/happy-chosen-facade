package com.lerss.thechosenfacade.entity

import java.time.OffsetDateTime

/**
 * 中奖记录
 */
class WinningRecord {
    String id
    /**
     * 某一局游戏
     */
    TripleKillRound round
    /**
     * 用户
     */
    String user
    /**
     * 选中项(A,B,C)
     */
    String theChosen
    /**
     * 下注金额
     */
    BigDecimal amount
    /**
     * 数据创建时间, UTC
     */
    OffsetDateTime dateCreated
    /**
     * 最后更新时间, UTC
     */
    OffsetDateTime lastUpdated
}
