package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.Array;
import java.util.Collection;
import p003a2.C0015b;

/* renamed from: com.google.common.collect.j1 */
public final class C16188j1 {
    @CanIgnoreReturnValue
    /* renamed from: a */
    public static void m26182a(int i, Object[] objArr) {
        int i2 = 0;
        while (i2 < i) {
            if (objArr[i2] != null) {
                i2++;
            } else {
                throw new NullPointerException(C0015b.m88g("at index ", i2));
            }
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: b */
    public static void m26183b(Iterable iterable, Object[] objArr) {
        int i = 0;
        for (Object obj : iterable) {
            objArr[i] = obj;
            i++;
        }
    }

    /* renamed from: c */
    public static <T> T[] m26184c(Collection<?> collection, T[] tArr) {
        int size = collection.size();
        if (tArr.length < size) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        }
        m26183b(collection, tArr);
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }
}
