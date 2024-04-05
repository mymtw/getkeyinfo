package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.i7 */
public final class C15000i7 {

    /* renamed from: a */
    public final String f33580a;

    /* renamed from: b */
    public final String f33581b;

    /* renamed from: c */
    public final String f33582c;

    /* renamed from: d */
    public final long f33583d;

    /* renamed from: e */
    public final Object f33584e;

    public C15000i7(String str, String str2, String str3, long j, Object obj) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(obj);
        this.f33580a = str;
        this.f33581b = str2;
        this.f33582c = str3;
        this.f33583d = j;
        this.f33584e = obj;
    }
}
