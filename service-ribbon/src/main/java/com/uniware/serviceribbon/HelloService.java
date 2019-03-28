package com.uniware.serviceribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVER-CLIENT/hi?name="+name,String.class);
    }

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiServiceHystrix(String name) {
        return restTemplate.getForObject("http://SERVER-CLIENT/hi?name="+name,String.class);
    }
    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
