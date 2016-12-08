package com.lerss.happychosenfacade

/**
 * 游戏内部服务
 */
interface GameService {
    /**
     * 创建新一轮游戏
     * 3分钟一轮, 2分半下注, 30秒开奖
     * 由时间触发器触发, 检测跟上一轮的创建至少间隔2分30秒
     */
    void create()
    /**
     * 开奖
     */
    void lottery()
}