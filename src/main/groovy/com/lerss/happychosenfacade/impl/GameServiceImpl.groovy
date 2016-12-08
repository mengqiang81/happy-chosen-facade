package com.lerss.happychosenfacade.impl

import com.lerss.happychosenfacade.GameService

import java.time.OffsetDateTime

/**
 * Created by Qiang on 8/22/16.
 */
class GameServiceImpl implements GameService{
    @Override
    void create() {

    }

    @Override
    void lottery() {

    }

    void validateTime(){
        def now = OffsetDateTime.now()
    }
}
