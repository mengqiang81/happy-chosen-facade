package com.lerss.happychosenfacade

import org.nofdev.servicefacade.PagedList

/**
 * Created by Qiang on 8/22/16.
 */
interface GameFacade {
    PagedList<LotteryResultDTO> findLotteryResults()
}