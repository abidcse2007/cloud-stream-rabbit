package com.abid.poc.springcloudstreamrabbit.springcloudstreamrabbit;

import com.abid.poc.springcloudstreamrabbit.springcloudstreamrabbit.input.TestInput;
import com.abid.poc.springcloudstreamrabbit.springcloudstreamrabbit.output.TestOutput;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding({TestOutput.class, TestInput.class})
@SpringBootApplication
public class SpringCloudStreamRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStreamRabbitApplication.class, args);
	}

}
