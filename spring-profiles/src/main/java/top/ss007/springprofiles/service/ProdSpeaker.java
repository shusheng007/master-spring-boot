package top.ss007.springprofiles.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Ben.Wang
 * <p>
 * Author      Ben.Wang
 * Date        2021/9/22 15:53
 * Description
 */
@Service
@Profile("prod")
public class ProdSpeaker implements Speaker{
    @Override
    public String speak() {
        return "I am prod speaker";
    }
}
