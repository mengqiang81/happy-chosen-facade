package com.lerss.happychosenfacade.entity

import org.hibernate.annotations.GenericGenerator

import javax.persistence.*
import java.time.OffsetDateTime
import java.time.ZoneOffset

/**
 * 一局游戏
 */
@Entity
@Table(indexes = [@Index(columnList = "dateCreated"), @Index(columnList = "lastUpdated")])
class TripleKillRound {
    @Id
    @GeneratedValue(generator = "system_uuid")
    @GenericGenerator(name = "system_uuid", strategy = "uuid2")
    String id
    /**
     * 第几期
     * TODO 利用了数据库的自增能力
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
