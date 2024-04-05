package com.google.android.play.core.tasks;

public class RuntimeExecutionException extends zzj {
    public RuntimeExecutionException(Throwable th) {
        super(th);
    }

    public final int getErrorCode() {
        return -100;
    }
}
