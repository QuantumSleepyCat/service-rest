package by.bsuir.books.controller.email;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 * Created by Lenovo on 20.03.2017.
 */
public class Schedule {
    public Scheduler makeSchedule() throws SchedulerException, InterruptedException {

        JobDetail job = JobBuilder.newJob(DailySending.class)
                .withIdentity("dummyJobName", "group1").build();

        Trigger trigger = TriggerBuilder
                .newTrigger()
                .withIdentity("dummyTriggerName", "group1")
                .withSchedule(
                        CronScheduleBuilder.cronSchedule("0 44 21 * * ? *"))
                .build();

        Scheduler scheduler = new StdSchedulerFactory().getScheduler();
        scheduler.start();
        scheduler.scheduleJob(job, trigger);
        return scheduler;
    }
}
