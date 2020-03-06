package com.abid.poc.springcloudstreamrabbit.springcloudstreamrabbit.input;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface TestInput {
    String INPUT = "input";


    @Input(TestInput.INPUT)
    SubscribableChannel input();

}
