package com.google.common.util.concurrent;

import com.google.common.base.C15784e;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.common.util.concurrent.e */
public final class C16376e implements C15784e<AtomicLong, Long> {
    public final Object apply(Object obj) {
        return Long.valueOf(((AtomicLong) obj).get());
    }
}
