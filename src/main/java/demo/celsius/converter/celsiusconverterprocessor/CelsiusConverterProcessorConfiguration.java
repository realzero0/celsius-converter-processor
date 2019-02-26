package demo.celsius.converter.celsiusconverterprocessor;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.integration.annotation.Transformer;

@EnableBinding(Processor.class)
public class CelsiusConverterProcessorConfiguration {

    @Transformer(inputChannel = Processor.INPUT, outputChannel = Processor.OUTPUT)
    public String convertToCelsius(String data) {
        System.out.println(data);
        return data;
    }
}