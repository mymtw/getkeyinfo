package com.google.common.collect;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.i0 */
public final class C16184i0 {
    /* renamed from: a */
    public static int m26178a(int i, double d) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= ((int) (d * ((double) highestOneBit)))) {
            return highestOneBit;
        }
        int i2 = highestOneBit << 1;
        if (i2 > 0) {
            return i2;
        }
        return 1073741824;
    }

    /* renamed from: b */
    public static int m26179b(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    /* renamed from: c */
    public static int m26180c(@NullableDecl Object obj) {
        return m26179b(obj == null ? 0 : obj.hashCode());
    }
}
