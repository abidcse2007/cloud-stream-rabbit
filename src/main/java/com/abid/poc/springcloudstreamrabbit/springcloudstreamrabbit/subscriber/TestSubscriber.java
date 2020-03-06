package com.abid.poc.springcloudstreamrabbit.springcloudstreamrabbit.subscriber;

import com.abid.poc.springcloudstreamrabbit.springcloudstreamrabbit.input.TestInput;
import com.abid.poc.springcloudstreamrabbit.springcloudstreamrabbit.ws.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TestSubscriber {

    @StreamListener(TestInput.INPUT)
    public void subscribe(Message message){
        log.info("Received message={}", message);
    }
}
