package com.byteprofile;

import java.lang.management.MemoryType;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MyEngine {

    private String[] engineWords = {"Turbo", "Vortex", "Rocket", "Nitro", "Piston", "Propeller", "Booster", "Fusion"};
    private String[] funnyAdjectives = {"Wacky", "Bizarre", "Cheesy", "Fluffy", "Zany", "Silly", "Crazy", "Quirky"};
    private String[] nouns = {"Penguin", "Banana", "Duck", "Unicorn", "Cucumber", "Squirrel", "Muffin", "Zombie"};


    public MyEngine() {}

    public void start() throws Exception{
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        Runnable task = () -> {
            try {
                printStatusTask();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
        scheduler.scheduleAtFixedRate(task, 0, 1, TimeUnit.SECONDS);

    }


    private String getEngineName() throws Exception {
        Random random = new Random();
        String engineWord = engineWords[random.nextInt(engineWords.length)];
        String adjective = funnyAdjectives[random.nextInt(funnyAdjectives.length)];
        String noun = nouns[random.nextInt(nouns.length)];

        return engineWord + " " + adjective + " " + noun;
    }

    private void printStatusTask() throws Exception{
        System.out.println(String.format("%s has successfully wrapped up their task like a pro!", getEngineName()));
    }


    public static MyEngine build() {
        return new MyEngine();
    }
}
