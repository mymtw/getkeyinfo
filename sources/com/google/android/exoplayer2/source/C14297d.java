package com.google.android.exoplayer2.source;

import android.content.Context;
import android.net.Uri;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.exoplayer2.drm.C14216b;
import com.google.android.exoplayer2.source.C14347j;
import com.google.android.exoplayer2.source.C14363n;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p505aj.C13999g;
import p505aj.C14007n;
import p513bj.C14049b0;
import p594jh.C17912g;
import p594jh.C17954o0;
import p595ji.C17999k;
import p644ph.C18347f;

/* renamed from: com.google.android.exoplayer2.source.d */
public final class C14297d implements C17999k {

    /* renamed from: a */
    public final C13999g.C14000a f31799a;

    /* renamed from: b */
    public final SparseArray<C17999k> f31800b;

    /* renamed from: c */
    public final int[] f31801c;

    /* renamed from: d */
    public long f31802d;

    /* renamed from: e */
    public long f31803e;

    /* renamed from: f */
    public long f31804f;

    /* renamed from: g */
    public float f31805g;

    /* renamed from: h */
    public float f31806h;

    public C14297d(Context context, C18347f fVar) {
        C14007n nVar = new C14007n(context, (String) null);
        this.f31799a = nVar;
        Class<C13999g.C14000a> cls = C13999g.C14000a.class;
        Class<C17999k> cls2 = C17999k.class;
        SparseArray<C17999k> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, (C17999k) Class.forName("com.google.android.exoplayer2.source.dash.DashMediaSource$Factory").asSubclass(cls2).getConstructor(new Class[]{cls}).newInstance(new Object[]{nVar}));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (C17999k) Class.forName("com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(cls2).getConstructor(new Class[]{cls}).newInstance(new Object[]{nVar}));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (C17999k) HlsMediaSource.Factory.class.asSubclass(cls2).getConstructor(new Class[]{cls}).newInstance(new Object[]{nVar}));
        } catch (Exception unused3) {
        }
        try {
            sparseArray.put(3, (C17999k) Class.forName("com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory").asSubclass(cls2).getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Exception unused4) {
        }
        sparseArray.put(4, new C14363n.C14365b(nVar, fVar));
        this.f31800b = sparseArray;
        this.f31801c = new int[sparseArray.size()];
        for (int i = 0; i < this.f31800b.size(); i++) {
            this.f31801c[i] = this.f31800b.keyAt(i);
        }
        this.f31802d = -9223372036854775807L;
        this.f31803e = -9223372036854775807L;
        this.f31804f = -9223372036854775807L;
        this.f31805g = -3.4028235E38f;
        this.f31806h = -3.4028235E38f;
    }

    /* renamed from: a */
    public final C14344i mo47693a(C17954o0 o0Var) {
        o0Var.f39138b.getClass();
        C17954o0.C17960f fVar = o0Var.f39138b;
        int z = C14049b0.m21653z(fVar.f39189a, fVar.f39190b);
        C17999k kVar = this.f31800b.get(z);
        String g = C0072d.m200g(68, "No suitable media source factory found for content type: ", z);
        if (kVar != null) {
            C17954o0.C17959e eVar = o0Var.f39139c;
            if ((eVar.f39184a == -9223372036854775807L && this.f31802d != -9223372036854775807L) || ((eVar.f39187d == -3.4028235E38f && this.f31805g != -3.4028235E38f) || ((eVar.f39188e == -3.4028235E38f && this.f31806h != -3.4028235E38f) || ((eVar.f39185b == -9223372036854775807L && this.f31803e != -9223372036854775807L) || (eVar.f39186c == -9223372036854775807L && this.f31804f != -9223372036854775807L))))) {
                C17954o0.C17956b a = o0Var.mo69492a();
                C17954o0.C17959e eVar2 = o0Var.f39139c;
                long j = eVar2.f39184a;
                if (j == -9223372036854775807L) {
                    j = this.f31802d;
                }
                a.f39167w = j;
                float f = eVar2.f39187d;
                if (f == -3.4028235E38f) {
                    f = this.f31805g;
                }
                a.f39170z = f;
                float f2 = eVar2.f39188e;
                if (f2 == -3.4028235E38f) {
                    f2 = this.f31806h;
                }
                a.f39144A = f2;
                long j2 = eVar2.f39185b;
                if (j2 == -9223372036854775807L) {
                    j2 = this.f31803e;
                }
                a.f39168x = j2;
                long j3 = eVar2.f39186c;
                if (j3 == -9223372036854775807L) {
                    j3 = this.f31804f;
                }
                a.f39169y = j3;
                o0Var = a.mo69497a();
            }
            C14344i a2 = kVar.mo47693a(o0Var);
            List<C17954o0.C17961g> list = o0Var.f39138b.f39195g;
            if (!list.isEmpty()) {
                C14344i[] iVarArr = new C14344i[(list.size() + 1)];
                iVarArr[0] = a2;
                this.f31799a.getClass();
                if (list.size() <= 0) {
                    a2 = new MergingMediaSource(iVarArr);
                } else {
                    new ArrayList(1);
                    new HashSet(1);
                    new C14347j.C14348a();
                    new C14216b.C14217a();
                    Collections.emptyList();
                    Collections.emptyMap();
                    Collections.emptyList();
                    Collections.emptyList();
                    Uri uri = Uri.EMPTY;
                    list.get(0).getClass();
                    throw null;
                }
            }
            ClippingMediaSource clippingMediaSource = a2;
            C17954o0.C17957c cVar = o0Var.f39141e;
            long j4 = cVar.f39171a;
            if (!(j4 == 0 && cVar.f39172b == Long.MIN_VALUE && !cVar.f39174d)) {
                long a3 = C17912g.m30087a(j4);
                long a4 = C17912g.m30087a(o0Var.f39141e.f39172b);
                C17954o0.C17957c cVar2 = o0Var.f39141e;
                clippingMediaSource = new ClippingMediaSource(clippingMediaSource, a3, a4, !cVar2.f39175e, cVar2.f39173c, cVar2.f39174d);
            }
            o0Var.f39138b.getClass();
            if (o0Var.f39138b.f39192d != null) {
                Log.w("DefaultMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            }
            return clippingMediaSource;
        }
        throw new NullPointerException(String.valueOf(g));
    }
}
