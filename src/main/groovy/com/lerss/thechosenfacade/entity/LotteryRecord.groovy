package com.lerss.thechosenfacade.entity

import java.time.OffsetDateTime

/**
 * 开奖记录
 */
class LotteryRecord {
    String id
    /**
     * 某一局游戏
     */
    TripleKillRound round
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
