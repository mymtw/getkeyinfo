package com.bugsnag.android;

import java.util.Comparator;
import p628nj.C18263b;

/* renamed from: com.bugsnag.android.q2 */
public final class C5826q2<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        return C18263b.m30880z(Long.valueOf(((Thread) t).getId()), Long.valueOf(((Thread) t2).getId()));
    }
}
