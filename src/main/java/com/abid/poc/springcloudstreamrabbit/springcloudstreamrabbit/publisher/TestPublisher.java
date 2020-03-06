package com.abid.poc.springcloudstreamrabbit.springcloudstreamrabbit.publisher;

import javax.annotation.PostConstruct;

import com.abid.poc.springcloudstreamrabbit.springcloudstreamrabbit.output.TestOutput;
import com.abid.poc.springcloudstreamrabbit.springcloudstreamrabbit.ws.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/publish")
public class TestPublisher {
    @Autowired
    private TestOutput testOutput;


    @RequestMapping(method = RequestMethod.POST)
    public void publish(@RequestBody Message message){
        log.info("Publishing message={}", message);
        testOutput.output().send(MessageBuilder.withPayload(message).build());
    }
}
