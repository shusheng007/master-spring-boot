package top.ss007.springkafka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ben.Wang
 * <p>
 * Author      Ben.Wang
 * Date        2021/9/24 13:18
 * Description
 */
@RestController
public class KafkaController {

    @GetMapping("/send")
    public String sendMessage(){
        return "hello";
    }
}
