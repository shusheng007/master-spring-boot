package top.ss007.springprofiles.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import top.ss007.springprofiles.service.Speaker;

import java.util.Arrays;

/**
 * Created by Ben.Wang
 * <p>
 * Author      Ben.Wang
 * Date        2021/9/22 15:54
 * Description
 */
@RestController
public class SpeakerController {
    private final Speaker speaker;

    public SpeakerController(Speaker speaker, Environment environment) {
        this.speaker = speaker;
        this.environment = environment;
    }

    private final Environment environment;

    @Value("${spring.profiles.active:}")
    private String activeProfile;

    /**
     * 演示通过各种方式切换不同的profile，speaker会根据不同的profile注入不同的实例
     * @return
     */
    @RequestMapping(method = RequestMethod.GET,path = "/speak")
    public String speaking(){
       return speaker.speak();
    }

    /**
     * 演示如何获取当前激活的profiles
     * @return
     */
    @GetMapping("/profiles")
    public String getCurrentProfiles(){
       return String.format("通过Environment获取：%s | 通过@Value获取：%s",
               Arrays.toString(environment.getActiveProfiles()),
               activeProfile);

    }
}
