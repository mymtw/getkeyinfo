package com.google.android.gms.internal.common;

import android.support.p013v4.media.C0070b;
import androidx.preference.C3039b;

/* renamed from: com.google.android.gms.internal.common.h */
public final class C14468h extends C3039b {

    /* renamed from: c */
    public final char f32599c;

    public C14468h(char c) {
        this.f32599c = c;
    }

    /* renamed from: t0 */
    public final boolean mo11187t0(char c) {
        return c == this.f32599c;
    }

    public final String toString() {
        int i = this.f32599c;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        return C0070b.m184f(new StringBuilder(String.valueOf(copyValueOf).length() + 18), "CharMatcher.is('", copyValueOf, "')");
    }
}
