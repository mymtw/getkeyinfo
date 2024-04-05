package com.facebook.appevents.codeless.internal;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

final /* synthetic */ class UnityReflection$sendMessage$1 extends MutablePropertyReference0Impl {
    public UnityReflection$sendMessage$1(C12224c cVar) {
        super(cVar, C12224c.class, "unityPlayer", "getUnityPlayer()Ljava/lang/Class;", 0);
    }

    public Object get() {
        C12224c cVar = (C12224c) this.receiver;
        Class<?> cls = C12224c.f27286a;
        if (cls != null) {
            return cls;
        }
        C19383o.m32805o("unityPlayer");
        throw null;
    }

    public void set(Object obj) {
        C12224c cVar = (C12224c) this.receiver;
        C12224c.f27286a = (Class) obj;
    }
}
