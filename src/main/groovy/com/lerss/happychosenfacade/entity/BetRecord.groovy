package com.lerss.happychosenfacade.entity

import org.hibernate.annotations.GenericGenerator

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Index
import javax.persistence.ManyToOne
import javax.persistence.PrePersist
import javax.persistence.PreUpdate
import javax.persistence.Table
import java.time.OffsetDateTime
import java.time.ZoneOffset

/**
 * 下注记录
 */
@Entity
@Table(indexes = [@Index(columnList = "round_id"), @Index(columnList = "dateCreated")])
class BetRecord {
    @Id
    @GeneratedValue(generator = "system_uuid")
    @GenericGenerator(name = "system_uuid", strategy = "uuid2")
    String id
    /**
     * 某一局游戏
     */
    @ManyToOne
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

    @PrePersist
    void preInsert(){
        dateCreated = OffsetDateTime.now(ZoneOffset.UTC)
        lastUpdated = OffsetDateTime.now(ZoneOffset.UTC)
    }
    @PreUpdate
    void preUpdate(){
        lastUpdated = OffsetDateTime.now(ZoneOffset.UTC)
    }
}
