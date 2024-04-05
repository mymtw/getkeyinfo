package com.google.common.util.concurrent;

import sun.misc.Unsafe;

/* renamed from: com.google.common.util.concurrent.a */
public final /* synthetic */ class C16371a {
    /* renamed from: a */
    public static /* synthetic */ boolean m26502a(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
