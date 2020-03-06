package com.abid.poc.springcloudstreamrabbit.springcloudstreamrabbit.ws;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    private String message;
}
