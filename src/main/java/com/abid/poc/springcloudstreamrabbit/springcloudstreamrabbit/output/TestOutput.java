package com.abid.poc.springcloudstreamrabbit.springcloudstreamrabbit.output;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface TestOutput {
    String OUTPUT = "output";

    @Output(TestOutput.OUTPUT)
    MessageChannel output();
}
