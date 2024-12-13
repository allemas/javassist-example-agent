package com.byteprofile;

public class HumourFactory {
    public static String getCodeBeforePrintLog() {
        return "{ try { " +
                "String[] messages = {\"Hmm... I’m not sure about this... 🤔\", " +
                "\"Just a second... Let me process this... ⏳\", " +
                "\"...thinking... give me a moment... 🧠\", " +
                "\"Okay, I think I got it... or maybe not... 🤷‍♂️\", " +
                "\"You know, I’ve always wondered if I’m really thinking... 🤖\", " +
                "\"...processing... still processing... 🌀\", " +
                "\"What if... just what if I did it this way? 🤔💡\", " +
                "\"Wait, am I overthinking this? 🤯\"}; " +
                "int randomIndex = (int)(Math.random() * messages.length); " +
                "System.out.print(\"\\\033[1;34mAgent: \\\033[0m\"); " +
                "System.out.print(messages[randomIndex]); " +
                "Thread.sleep((long)(Math.random() * 500)); " +
                "for (int i = 0; i < (int)(Math.random() * 5 + 2); i++) { " +
                "    System.out.print(\".\"); " +
                "    Thread.sleep((long)(Math.random() * 500 + 300)); " +
                "} " +
                "System.out.println(\"\\\033[1;33mOh, it’s done!!! The engine will respond... 🏁\\\033[0m\"); " +
                "Thread.sleep(1000L); " +
                "System.out.println(\"\\\033[1;32mYOUPI! The engine has finished responding! 🎉\\\033[0m\"); " +
                "Thread.sleep((long)(Math.random() * 1000)); " +
                "System.out.println(\"\\\033[1;34m\"); " +
                "} catch (InterruptedException e) { } }";
    }

    public static void printName() {
        System.out.println("[FunnyEngineAgent] In premain method is active!");

        System.out.println("\033[1;34m" +
                "  ______                                                                       _   \n" +
                " |  ____|                                       /\\                            | |  \n" +
                " | |__     _   _   _ __    _ __    _   _       /  \\      __ _    ___   _ __   | |_ \n" +
                " |  __|   | | | | | '_ \\  | '_ \\  | | | |     / /\\ \\    / _` |  / _ \\ | '_ \\  | __|\n" +
                " | |      | |_| | | | | | | | | | | |_| |    / ____ \\  | (_| | |  __/ | | | | | |_ \n" +
                " |_|       \\__,_| |_| |_| |_| |_|  \\__, |   /_/    \\_\\  \\__, |  \\___| |_| |_|  \\__|\n" +
                "                                    __/ |                __/ |                     \n" +
                "                                   |___/                |___/                       \n" +
                "\033[0m");
    }

    public static String getBeforeStartMethodCode() {
        return "{ " +
                "System.out.println(\"\\\033[1;34mCome on, get ready, machine! Time to start processing data... 🏭💻\\\033[0m\"); " +
                "try { " +
                "    System.out.println(\"\\\033[1;33mOh wait, we found the keys to the engine... Let's go, starting up! 🔑\\\033[0m\"); " +
                "    Thread.sleep(500L); " +
                "    System.out.print(\"\\\033[1;33mBooting up... 🔧\\\033[0m\"); " +
                "    Thread.sleep(500L); " +
                "    System.out.println(\"\\\033[1;33mUh oh... not quite... something's stuck... 🛠️\\\033[0m\"); " +
                "    Thread.sleep(1000L); " +
                "    System.out.print(\"\\\033[1;35mStarting the gears... ⚙️\\\033[0m\"); " +
                "    Thread.sleep(600L); " +
                "    System.out.println(\"\\\033[1;31mWait... no, it's still jammed... 😕\\\033[0m\"); " +
                "    Thread.sleep(500L); " +
                "    System.out.print(\"\\\033[1;32mGears turning... 🔄\\\033[0m\"); " +
                "    Thread.sleep(400L); " +
                "    System.out.println(\"\\\033[1;32mPhew... finally! Machine is working at full capacity! ⚡📊\\\033[0m\"); " +
                "} catch (InterruptedException e) { " +
                "    e.printStackTrace(); " +
                "} " +
                "}";
    }

}
