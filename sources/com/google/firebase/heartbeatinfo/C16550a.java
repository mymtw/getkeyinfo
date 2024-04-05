package com.google.firebase.heartbeatinfo;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.firebase.heartbeatinfo.a */
public final /* synthetic */ class C16550a implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }
}
