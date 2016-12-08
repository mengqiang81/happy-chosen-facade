package com.lerss.happychosenfacade.entity

import org.hibernate.annotations.GenericGenerator

import javax.persistence.*
import java.time.OffsetDateTime
import java.time.ZoneOffset
/**
 * 开奖记录
 */
@Entity
@Table(indexes = [@Index(columnList = "round_id"), @Index(columnList = "dateCreated")])
class LotteryRecord {
    @Id
    @GeneratedValue(generator = "system_uuid")
    @GenericGenerator(name = "system_uuid", strategy = "uuid2")
    String id
    /**
     * 某一局游戏
     */
    @OneToOne
    TripleKillRound round
    /**
     * 中奖项(A,B,C)
     */
    String result
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
