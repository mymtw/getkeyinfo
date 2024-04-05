package com.google.common.cache;

import com.google.common.base.C15788i;
import com.google.common.base.C15794l;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.cache.d */
public final class C15872d {

    /* renamed from: a */
    public final long f35725a;

    /* renamed from: b */
    public final long f35726b;

    /* renamed from: c */
    public final long f35727c;

    /* renamed from: d */
    public final long f35728d;

    /* renamed from: e */
    public final long f35729e;

    /* renamed from: f */
    public final long f35730f;

    public C15872d(long j, long j2, long j3, long j4, long j5, long j6) {
        long j7 = j;
        long j8 = j2;
        long j9 = j3;
        long j10 = j4;
        long j11 = j5;
        long j12 = j6;
        boolean z = true;
        C15794l.m25613g(j7 >= 0);
        C15794l.m25613g(j8 >= 0);
        C15794l.m25613g(j9 >= 0);
        C15794l.m25613g(j10 >= 0);
        C15794l.m25613g(j11 >= 0);
        C15794l.m25613g(j12 < 0 ? false : z);
        this.f35725a = j7;
        this.f35726b = j8;
        this.f35727c = j9;
        this.f35728d = j10;
        this.f35729e = j11;
        this.f35730f = j12;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof C15872d)) {
            return false;
        }
        C15872d dVar = (C15872d) obj;
        return this.f35725a == dVar.f35725a && this.f35726b == dVar.f35726b && this.f35727c == dVar.f35727c && this.f35728d == dVar.f35728d && this.f35729e == dVar.f35729e && this.f35730f == dVar.f35730f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f35725a), Long.valueOf(this.f35726b), Long.valueOf(this.f35727c), Long.valueOf(this.f35728d), Long.valueOf(this.f35729e), Long.valueOf(this.f35730f)});
    }

    public final String toString() {
        C15788i.C15789a b = C15788i.m25603b(this);
        b.mo55781a(this.f35725a, "hitCount");
        b.mo55781a(this.f35726b, "missCount");
        b.mo55781a(this.f35727c, "loadSuccessCount");
        b.mo55781a(this.f35728d, "loadExceptionCount");
        b.mo55781a(this.f35729e, "totalLoadTime");
        b.mo55781a(this.f35730f, "evictionCount");
        return b.toString();
    }
}
