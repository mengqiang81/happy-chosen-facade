package com.lerss.happychosenfacade

import org.nofdev.servicefacade.PagedList

/**
 * 下注接口
 */
interface MyGameFacade {
    /**
     * 下注
     * @param amount
     */
    void bet(BigDecimal amount, TripleKillOption option)

    PagedList<BetResultDTO> findBetResultsByRound(String roundId)
}