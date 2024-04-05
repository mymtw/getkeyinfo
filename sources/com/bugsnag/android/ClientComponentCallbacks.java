package com.bugsnag.android;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19861p;

public final class ClientComponentCallbacks implements ComponentCallbacks2 {

    /* renamed from: cb */
    private final C19861p<String, String, C19394m> f12106cb;
    private final C5773j0 deviceDataCollector;
    private final C19861p<Boolean, Integer, C19394m> memoryCallback;

    public ClientComponentCallbacks(C5773j0 j0Var, C19861p<? super String, ? super String, C19394m> pVar, C19861p<? super Boolean, ? super Integer, C19394m> pVar2) {
        C19383o.m32798h(j0Var, "deviceDataCollector");
        C19383o.m32798h(pVar, "cb");
        C19383o.m32798h(pVar2, "memoryCallback");
        this.deviceDataCollector = j0Var;
        this.f12106cb = pVar;
        this.memoryCallback = pVar2;
    }

    public final C19861p<Boolean, Integer, C19394m> getMemoryCallback() {
        return this.memoryCallback;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C19383o.m32798h(configuration, "newConfig");
        String d = this.deviceDataCollector.mo16559d();
        C5773j0 j0Var = this.deviceDataCollector;
        int i = configuration.orientation;
        if (j0Var.f12358j.getAndSet(i) != i) {
            this.f12106cb.invoke(d, this.deviceDataCollector.mo16559d());
        }
    }

    public void onLowMemory() {
        this.memoryCallback.invoke(Boolean.TRUE, null);
    }

    public void onTrimMemory(int i) {
        this.memoryCallback.invoke(Boolean.valueOf(i >= 80), Integer.valueOf(i));
    }
}
