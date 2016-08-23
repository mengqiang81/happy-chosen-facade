package com.lerss.thechosenfacade

/**
 * Created by Qiang on 8/22/16.
 */
enum TripleKillStatus {
    /**
     * 接受投注中
     */
    BETTING,
    /**
     * 锁定投注, 等待开奖
     */
    LOCKING,
    /**
     * 开奖中
     */
    LOTTERYING,
    /**
     * 已开奖
     */
    LOTTERIED
}
