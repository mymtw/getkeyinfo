package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.common.collect.C16201n0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import p620mi.C18231c;

/* renamed from: com.google.android.exoplayer2.source.hls.playlist.c */
public final class C14338c extends C18231c {

    /* renamed from: d */
    public final int f32121d;

    /* renamed from: e */
    public final long f32122e;

    /* renamed from: f */
    public final boolean f32123f;

    /* renamed from: g */
    public final long f32124g;

    /* renamed from: h */
    public final boolean f32125h;

    /* renamed from: i */
    public final int f32126i;

    /* renamed from: j */
    public final long f32127j;

    /* renamed from: k */
    public final int f32128k;

    /* renamed from: l */
    public final long f32129l;

    /* renamed from: m */
    public final long f32130m;

    /* renamed from: n */
    public final boolean f32131n;

    /* renamed from: o */
    public final boolean f32132o;

    /* renamed from: p */
    public final DrmInitData f32133p;

    /* renamed from: q */
    public final ImmutableList f32134q;

    /* renamed from: r */
    public final ImmutableList f32135r;

    /* renamed from: s */
    public final ImmutableMap f32136s;

    /* renamed from: t */
    public final long f32137t;

    /* renamed from: u */
    public final C14343e f32138u;

    /* renamed from: com.google.android.exoplayer2.source.hls.playlist.c$a */
    public static final class C14339a extends C14342d {

        /* renamed from: m */
        public final boolean f32139m;

        /* renamed from: n */
        public final boolean f32140n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14339a(String str, C14341c cVar, long j, int i, long j2, DrmInitData drmInitData, String str2, String str3, long j3, long j4, boolean z, boolean z2, boolean z3) {
            super(str, cVar, j, i, j2, drmInitData, str2, str3, j3, j4, z);
            this.f32139m = z2;
            this.f32140n = z3;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.playlist.c$b */
    public static final class C14340b {

        /* renamed from: a */
        public final long f32141a;

        /* renamed from: b */
        public final int f32142b;

        public C14340b(long j, int i) {
            this.f32141a = j;
            this.f32142b = i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.playlist.c$d */
    public static class C14342d implements Comparable<Long> {

        /* renamed from: b */
        public final String f32145b;

        /* renamed from: c */
        public final C14341c f32146c;

        /* renamed from: d */
        public final long f32147d;

        /* renamed from: e */
        public final int f32148e;

        /* renamed from: f */
        public final long f32149f;

        /* renamed from: g */
        public final DrmInitData f32150g;

        /* renamed from: h */
        public final String f32151h;

        /* renamed from: i */
        public final String f32152i;

        /* renamed from: j */
        public final long f32153j;

        /* renamed from: k */
        public final long f32154k;

        /* renamed from: l */
        public final boolean f32155l;

        public C14342d(String str, C14341c cVar, long j, int i, long j2, DrmInitData drmInitData, String str2, String str3, long j3, long j4, boolean z) {
            this.f32145b = str;
            this.f32146c = cVar;
            this.f32147d = j;
            this.f32148e = i;
            this.f32149f = j2;
            this.f32150g = drmInitData;
            this.f32151h = str2;
            this.f32152i = str3;
            this.f32153j = j3;
            this.f32154k = j4;
            this.f32155l = z;
        }

        public final int compareTo(Object obj) {
            Long l = (Long) obj;
            if (this.f32149f > l.longValue()) {
                return 1;
            }
            return this.f32149f < l.longValue() ? -1 : 0;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.playlist.c$e */
    public static final class C14343e {

        /* renamed from: a */
        public final long f32156a;

        /* renamed from: b */
        public final boolean f32157b;

        /* renamed from: c */
        public final long f32158c;

        /* renamed from: d */
        public final long f32159d;

        /* renamed from: e */
        public final boolean f32160e;

        public C14343e(long j, boolean z, long j2, long j3, boolean z2) {
            this.f32156a = j;
            this.f32157b = z;
            this.f32158c = j2;
            this.f32159d = j3;
            this.f32160e = z2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14338c(int i, String str, List<String> list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, DrmInitData drmInitData, List<C14341c> list2, List<C14339a> list3, C14343e eVar, Map<Uri, C14340b> map) {
        super(z3, str, list);
        long j6 = j;
        String str2 = str;
        List<String> list4 = list;
        this.f32121d = i;
        this.f32124g = j2;
        this.f32123f = z;
        this.f32125h = z2;
        this.f32126i = i2;
        this.f32127j = j3;
        this.f32128k = i3;
        this.f32129l = j4;
        this.f32130m = j5;
        this.f32131n = z4;
        this.f32132o = z5;
        this.f32133p = drmInitData;
        this.f32134q = ImmutableList.copyOf(list2);
        this.f32135r = ImmutableList.copyOf(list3);
        this.f32136s = ImmutableMap.copyOf(map);
        if (!list3.isEmpty()) {
            C14339a aVar = (C14339a) C16201n0.m26211b(list3);
            this.f32137t = aVar.f32149f + aVar.f32147d;
        } else if (!list2.isEmpty()) {
            C14341c cVar = (C14341c) C16201n0.m26211b(list2);
            this.f32137t = cVar.f32149f + cVar.f32147d;
        } else {
            this.f32137t = 0;
        }
        this.f32122e = j6 != -9223372036854775807L ? j6 >= 0 ? Math.min(this.f32137t, j) : Math.max(0, this.f32137t + j6) : -9223372036854775807L;
        this.f32138u = eVar;
    }

    /* renamed from: a */
    public final Object mo47783a(List list) {
        return this;
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.playlist.c$c */
    public static final class C14341c extends C14342d {

        /* renamed from: m */
        public final String f32143m;

        /* renamed from: n */
        public final ImmutableList f32144n;

        public C14341c(String str, String str2, long j, String str3, long j2) {
            this(str, (C14341c) null, "", 0, -1, -9223372036854775807L, (DrmInitData) null, str2, str3, j, j2, false, ImmutableList.m25826of());
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14341c(String str, C14341c cVar, String str2, long j, int i, long j2, DrmInitData drmInitData, String str3, String str4, long j3, long j4, boolean z, List<C14339a> list) {
            super(str, cVar, j, i, j2, drmInitData, str3, str4, j3, j4, z);
            this.f32143m = str2;
            this.f32144n = ImmutableList.copyOf(list);
        }
    }
}
