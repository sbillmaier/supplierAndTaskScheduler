package com.example.supplierAndTaskScheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask
{
    @Scheduled(cron = "0/5 * * * * *")
    public void doScheduled()
    {
       System.out.println("Scheduled method triggered");
    }
}
