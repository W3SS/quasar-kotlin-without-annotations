package com.example;

import co.paralleluniverse.fibers.instrument.MethodDatabase;
import co.paralleluniverse.fibers.instrument.SuspendableClassifier;

public class AnnotationlessSuspendableClassifier implements SuspendableClassifier {

    @Override
    public MethodDatabase.SuspendableType isSuspendable(MethodDatabase db, String sourceName, String sourceDebugInfo, boolean isInterface, String className, String superClassName, String[] interfaces, String methodName, String methodDesc, String methodSignature, String[] methodExceptions) {
        for (String anInterface : interfaces) {
            if ("com/example/FiberCallable".equals(anInterface)) {
                return MethodDatabase.SuspendableType.SUSPENDABLE;
            }
        }

        return null;
    }
}
