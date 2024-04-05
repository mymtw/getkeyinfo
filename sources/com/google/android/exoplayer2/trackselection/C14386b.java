package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import java.util.List;
import p612li.C18188d;
import p612li.C18189e;
import p718yi.C18886d;

/* renamed from: com.google.android.exoplayer2.trackselection.b */
public interface C14386b extends C18886d {

    /* renamed from: com.google.android.exoplayer2.trackselection.b$a */
    public static final class C14387a {

        /* renamed from: a */
        public final TrackGroup f32400a;

        /* renamed from: b */
        public final int[] f32401b;

        /* renamed from: c */
        public final int f32402c;

        public C14387a() {
            throw null;
        }

        public C14387a(TrackGroup trackGroup, int[] iArr, int i) {
            this.f32400a = trackGroup;
            this.f32401b = iArr;
            this.f32402c = i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.b$b */
    public interface C14388b {
    }

    /* renamed from: a */
    int mo47723a();

    /* renamed from: b */
    boolean mo47898b(int i, long j);

    void disable();

    /* renamed from: e */
    void mo47892e(float f);

    /* renamed from: f */
    Object mo47724f();

    /* renamed from: i */
    void mo47725i(long j, long j2, List list, C18189e[] eVarArr);

    /* renamed from: j */
    void mo47893j();

    /* renamed from: k */
    int mo47894k(long j, List<? extends C18188d> list);

    /* renamed from: m */
    int mo47899m();

    /* renamed from: n */
    Format mo47900n();

    /* renamed from: o */
    int mo47726o();
}
