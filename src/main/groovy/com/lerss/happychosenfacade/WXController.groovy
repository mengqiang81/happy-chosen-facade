package com.lerss.happychosenfacade

import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import java.security.MessageDigest
/**
 * Created by Qiang on 09/12/2016.
 */
@RestController
@RequestMapping("/wx")
@CompileStatic
@Slf4j
class WXController {

    @RequestMapping
    String verify(String signature, String timestamp, String nonce, String echostr){
        String token = 'kaiyuliheng'

        def list = [token, timestamp, nonce]
        def str = list.sort().join('')

        MessageDigest sha1 = MessageDigest.getInstance("SHA1")
        byte[] digest  = sha1.digest(str.getBytes())
        def hashcode = digest.encodeHex().toString()

        log.info("handle/GET func: hashcode, signature: $hashcode $signature")
        if (hashcode == signature){
            return echostr
        }else{
            return ""
        }
    }
}
