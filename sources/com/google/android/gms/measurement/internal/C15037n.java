package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.n */
public final class C15037n {

    /* renamed from: a */
    public final String f33686a;

    /* renamed from: b */
    public final String f33687b;

    /* renamed from: c */
    public final long f33688c;

    /* renamed from: d */
    public final long f33689d;

    /* renamed from: e */
    public final long f33690e;

    /* renamed from: f */
    public final long f33691f;

    /* renamed from: g */
    public final long f33692g;

    /* renamed from: h */
    public final Long f33693h;

    /* renamed from: i */
    public final Long f33694i;

    /* renamed from: j */
    public final Long f33695j;

    /* renamed from: k */
    public final Boolean f33696k;

    public C15037n(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        long j6 = j;
        long j7 = j2;
        long j8 = j3;
        long j9 = j5;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        boolean z = true;
        Preconditions.checkArgument(j6 >= 0);
        Preconditions.checkArgument(j7 >= 0);
        Preconditions.checkArgument(j8 >= 0);
        Preconditions.checkArgument(j9 < 0 ? false : z);
        this.f33686a = str;
        this.f33687b = str2;
        this.f33688c = j6;
        this.f33689d = j7;
        this.f33690e = j8;
        this.f33691f = j4;
        this.f33692g = j9;
        this.f33693h = l;
        this.f33694i = l2;
        this.f33695j = l3;
        this.f33696k = bool;
    }

    /* renamed from: a */
    public final C15037n mo52252a(Long l, Long l2, Boolean bool) {
        return new C15037n(this.f33686a, this.f33687b, this.f33688c, this.f33689d, this.f33690e, this.f33691f, this.f33692g, this.f33693h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }

    /* renamed from: b */
    public final C15037n mo52253b(long j, long j2) {
        return new C15037n(this.f33686a, this.f33687b, this.f33688c, this.f33689d, this.f33690e, this.f33691f, j, Long.valueOf(j2), this.f33694i, this.f33695j, this.f33696k);
    }
}
