package com.lerss.thechosenfacade

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