package com.google.android.play.core.internal;

public final class zzbt extends RuntimeException {
    public zzbt(String str) {
        super(str);
    }

    public zzbt(String str, Throwable th) {
        super("Failed to initialize FileStorage", th);
    }
}
