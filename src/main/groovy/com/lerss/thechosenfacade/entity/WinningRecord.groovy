package com.lerss.thechosenfacade.entity

import org.hibernate.annotations.GenericGenerator

import javax.persistence.*
import java.time.OffsetDateTime
import java.time.ZoneOffset

/**
 * 中奖记录
 */
@Entity
@Table(indexes = [@Index(columnList = "round"), @Index(columnList = "dateCreated")])
class WinningRecord {
    @Id
    @GeneratedValue(generator = "system_uuid")
    @GenericGenerator(name = "system_uuid", strategy = "uuid2")
    String id

    /**
     * 某一次开奖的结果
     */
    LotteryRecord lotteryRecord
    /**
     * 哪个投注中的奖
     */
    BetRecord betRecord
    /**
     * 中奖金额
     */
    BigDecimal winAmount
    /**
     * 数据创建时间, UTC
     */
    OffsetDateTime dateCreated
    /**
     * 最后更新时间, UTC
     */
    OffsetDateTime lastUpdated

    @PrePersist
    void preInsert() {
        dateCreated = OffsetDateTime.now(ZoneOffset.UTC)
        lastUpdated = OffsetDateTime.now(ZoneOffset.UTC)
    }

    @PreUpdate
    void preUpdate() {
        lastUpdated = OffsetDateTime.now(ZoneOffset.UTC)
    }
}
