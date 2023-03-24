package com.example.supplierAndTaskScheduler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.core.MessageSource;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.MessageChannels;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.PollableChannel;

@Configuration
public class EventFlowConfig
{
    @Bean
    public PollableChannel events()
    {
        return MessageChannels.queue().get();
    }

    @Bean
    public IntegrationFlow eventsFlow(final PollableChannel events)
    {
        return IntegrationFlow.from(() -> null).channel(events).get();
    }
}
