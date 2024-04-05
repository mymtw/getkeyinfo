package com.google.common.collect;

import com.google.common.base.C15794l;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import p504ai.C13983i;

/* renamed from: com.google.common.collect.o */
public final class C16203o {
    /* renamed from: a */
    public static void m26214a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        } else if (obj2 == null) {
            throw new NullPointerException(C13983i.m21494m("null value in entry: ", obj, "=null"));
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: b */
    public static void m26215b(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: c */
    public static void m26216c(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("distance" + " cannot be negative but was: " + j);
        }
    }

    /* renamed from: d */
    public static void m26217d(int i, String str) {
        if (i <= 0) {
            throw new IllegalArgumentException(str + " must be positive but was: " + i);
        }
    }

    /* renamed from: e */
    public static void m26218e(boolean z) {
        C15794l.m25624r(z, "no calls to next() since the last call to remove()");
    }
}
