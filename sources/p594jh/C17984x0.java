package p594jh;

import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.C14344i;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.common.collect.ImmutableList;
import java.util.List;
import p594jh.C17939k1;
import p718yi.C18890g;

/* renamed from: jh.x0 */
public final class C17984x0 {

    /* renamed from: t */
    public static final C14344i.C14345a f39303t = new C14344i.C14345a(new Object());

    /* renamed from: a */
    public final C17939k1 f39304a;

    /* renamed from: b */
    public final C14344i.C14345a f39305b;

    /* renamed from: c */
    public final long f39306c;

    /* renamed from: d */
    public final long f39307d;

    /* renamed from: e */
    public final int f39308e;

    /* renamed from: f */
    public final ExoPlaybackException f39309f;

    /* renamed from: g */
    public final boolean f39310g;

    /* renamed from: h */
    public final TrackGroupArray f39311h;

    /* renamed from: i */
    public final C18890g f39312i;

    /* renamed from: j */
    public final List<Metadata> f39313j;

    /* renamed from: k */
    public final C14344i.C14345a f39314k;

    /* renamed from: l */
    public final boolean f39315l;

    /* renamed from: m */
    public final int f39316m;

    /* renamed from: n */
    public final C17986y0 f39317n;

    /* renamed from: o */
    public final boolean f39318o;

    /* renamed from: p */
    public final boolean f39319p;

    /* renamed from: q */
    public volatile long f39320q;

    /* renamed from: r */
    public volatile long f39321r;

    /* renamed from: s */
    public volatile long f39322s;

    public C17984x0(C17939k1 k1Var, C14344i.C14345a aVar, long j, long j2, int i, ExoPlaybackException exoPlaybackException, boolean z, TrackGroupArray trackGroupArray, C18890g gVar, List<Metadata> list, C14344i.C14345a aVar2, boolean z2, int i2, C17986y0 y0Var, long j3, long j4, long j5, boolean z3, boolean z4) {
        this.f39304a = k1Var;
        this.f39305b = aVar;
        this.f39306c = j;
        this.f39307d = j2;
        this.f39308e = i;
        this.f39309f = exoPlaybackException;
        this.f39310g = z;
        this.f39311h = trackGroupArray;
        this.f39312i = gVar;
        this.f39313j = list;
        this.f39314k = aVar2;
        this.f39315l = z2;
        this.f39316m = i2;
        this.f39317n = y0Var;
        this.f39320q = j3;
        this.f39321r = j4;
        this.f39322s = j5;
        this.f39318o = z3;
        this.f39319p = z4;
    }

    /* renamed from: i */
    public static C17984x0 m30387i(C18890g gVar) {
        C17939k1.C17940a aVar = C17939k1.f39097a;
        C14344i.C14345a aVar2 = f39303t;
        return new C17984x0(aVar, aVar2, -9223372036854775807L, 0, 1, (ExoPlaybackException) null, false, TrackGroupArray.EMPTY, gVar, ImmutableList.m25826of(), aVar2, false, 0, C17986y0.f39325d, 0, 0, 0, false, false);
    }

    /* renamed from: a */
    public final C17984x0 mo69545a(C14344i.C14345a aVar) {
        C17939k1 k1Var = this.f39304a;
        return new C17984x0(k1Var, this.f39305b, this.f39306c, this.f39307d, this.f39308e, this.f39309f, this.f39310g, this.f39311h, this.f39312i, this.f39313j, aVar, this.f39315l, this.f39316m, this.f39317n, this.f39320q, this.f39321r, this.f39322s, this.f39318o, this.f39319p);
    }

    /* renamed from: b */
    public final C17984x0 mo69546b(C14344i.C14345a aVar, long j, long j2, long j3, long j4, TrackGroupArray trackGroupArray, C18890g gVar, List<Metadata> list) {
        long j5 = j;
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        C18890g gVar2 = gVar;
        List<Metadata> list2 = list;
        C17939k1 k1Var = this.f39304a;
        return new C17984x0(k1Var, aVar, j2, j3, this.f39308e, this.f39309f, this.f39310g, trackGroupArray2, gVar2, list2, this.f39314k, this.f39315l, this.f39316m, this.f39317n, this.f39320q, j4, j5, this.f39318o, this.f39319p);
    }

    /* renamed from: c */
    public final C17984x0 mo69547c(boolean z) {
        C17939k1 k1Var = this.f39304a;
        return new C17984x0(k1Var, this.f39305b, this.f39306c, this.f39307d, this.f39308e, this.f39309f, this.f39310g, this.f39311h, this.f39312i, this.f39313j, this.f39314k, this.f39315l, this.f39316m, this.f39317n, this.f39320q, this.f39321r, this.f39322s, z, this.f39319p);
    }

    /* renamed from: d */
    public final C17984x0 mo69548d(int i, boolean z) {
        boolean z2 = z;
        C17939k1 k1Var = this.f39304a;
        return new C17984x0(k1Var, this.f39305b, this.f39306c, this.f39307d, this.f39308e, this.f39309f, this.f39310g, this.f39311h, this.f39312i, this.f39313j, this.f39314k, z2, i, this.f39317n, this.f39320q, this.f39321r, this.f39322s, this.f39318o, this.f39319p);
    }

    /* renamed from: e */
    public final C17984x0 mo69549e(ExoPlaybackException exoPlaybackException) {
        C17939k1 k1Var = this.f39304a;
        return new C17984x0(k1Var, this.f39305b, this.f39306c, this.f39307d, this.f39308e, exoPlaybackException, this.f39310g, this.f39311h, this.f39312i, this.f39313j, this.f39314k, this.f39315l, this.f39316m, this.f39317n, this.f39320q, this.f39321r, this.f39322s, this.f39318o, this.f39319p);
    }

    /* renamed from: f */
    public final C17984x0 mo69550f(C17986y0 y0Var) {
        C17939k1 k1Var = this.f39304a;
        return new C17984x0(k1Var, this.f39305b, this.f39306c, this.f39307d, this.f39308e, this.f39309f, this.f39310g, this.f39311h, this.f39312i, this.f39313j, this.f39314k, this.f39315l, this.f39316m, y0Var, this.f39320q, this.f39321r, this.f39322s, this.f39318o, this.f39319p);
    }

    /* renamed from: g */
    public final C17984x0 mo69551g(int i) {
        C17939k1 k1Var = this.f39304a;
        return new C17984x0(k1Var, this.f39305b, this.f39306c, this.f39307d, i, this.f39309f, this.f39310g, this.f39311h, this.f39312i, this.f39313j, this.f39314k, this.f39315l, this.f39316m, this.f39317n, this.f39320q, this.f39321r, this.f39322s, this.f39318o, this.f39319p);
    }

    /* renamed from: h */
    public final C17984x0 mo69552h(C17939k1 k1Var) {
        return new C17984x0(k1Var, this.f39305b, this.f39306c, this.f39307d, this.f39308e, this.f39309f, this.f39310g, this.f39311h, this.f39312i, this.f39313j, this.f39314k, this.f39315l, this.f39316m, this.f39317n, this.f39320q, this.f39321r, this.f39322s, this.f39318o, this.f39319p);
    }
}
