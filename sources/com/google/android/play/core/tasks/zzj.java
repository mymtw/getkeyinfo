package com.google.android.play.core.tasks;

public abstract class zzj extends RuntimeException {
    public zzj(String str) {
        super(str);
    }

    public abstract int getErrorCode();

    public zzj(Throwable th) {
        super(th);
    }
}
