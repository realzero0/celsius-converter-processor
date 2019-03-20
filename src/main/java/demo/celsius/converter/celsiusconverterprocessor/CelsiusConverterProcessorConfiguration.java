package demo.celsius.converter.celsiusconverterprocessor;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;

@EnableBinding(Processor.class)
public class CelsiusConverterProcessorConfiguration {

    @StreamListener(Processor.INPUT)
    @SendTo(Processor.OUTPUT)
    public String convertToCelsius(@Payload String data) throws InterruptedException {
        for(int i = 1; i < 30; i++) {
            System.out.println(i + " data: " + data);
            Thread.sleep(1000);
        }
        return data;
    }
}
