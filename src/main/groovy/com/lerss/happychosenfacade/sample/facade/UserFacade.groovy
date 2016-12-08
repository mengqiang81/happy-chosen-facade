package com.lerss.happychosenfacade.sample.facade

import org.nofdev.servicefacade.PagedList
import org.nofdev.servicefacade.Paginator

interface UserFacade {
    PagedList<UserDTO> findUsersByNameLike(String nameLike, Paginator paginator)
}