package com.example.supplierAndTaskScheduler;

import org.springframework.messaging.Message;
import org.springframework.messaging.PollableChannel;
import org.springframework.stereotype.Component;

@Component
public class Supplier implements java.util.function.Supplier<Message<String>>
{
    private final PollableChannel events;

    public Supplier(final PollableChannel events)
    {
        this.events = events;
    }

    @Override
    public Message<String> get()
    {
        return (Message<String>) events.receive();
    }
}
