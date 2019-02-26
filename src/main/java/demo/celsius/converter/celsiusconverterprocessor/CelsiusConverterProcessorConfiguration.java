package demo.celsius.converter.celsiusconverterprocessor;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.Payload;

@EnableBinding(Processor.class)
public class CelsiusConverterProcessorConfiguration {

    @StreamListener(Processor.INPUT)
    @Output(Processor.OUTPUT)
    public String convertToCelsius(@Payload String data) {
        System.out.println(data);
        return data;
    }
}
