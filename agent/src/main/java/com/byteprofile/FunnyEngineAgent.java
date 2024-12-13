package com.byteprofile;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;


import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;

public class FunnyEngineAgent {
    public static void premain(String agentArgs, Instrumentation inst) {
        HumourFactory.printName();
        inst.addTransformer(new ClassFileTransformer() {
            @Override
            public byte[] transform(ClassLoader classLoader, String className, Class<?> aClass, ProtectionDomain protectionDomain, byte[] bytes) {
                if (className.equals("com/byteprofile/MyEngines")) {
                    try {
                        ClassPool classPool = ClassPool.getDefault();
                        CtClass ctClass = classPool.get("com.byteprofile.MyEngines");

                        CtMethod startMethod = ctClass.getDeclaredMethod("start");
                        startMethod.insertBefore(HumourFactory.getBeforeStartMethodCode());

                        CtMethod printStatusTaskMethod = ctClass.getDeclaredMethod("printStatusTask");
                        printStatusTaskMethod.insertBefore(HumourFactory.getCodeBeforePrintLog());

                        printStatusTaskMethod.insertAfter("{ System.out.println(\"\\\033[0m\\n\"); " +
                                "System.out.println(\"\\\033[1;32mAgent : YOUPI! The engine has finished responding! 🎉\\\033[0m\"); " +
                                "}");

                        byte[] newBytecode = ctClass.toBytecode();
                        ctClass.detach();
                        return newBytecode;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                return bytes;
            }
        });
    }
}