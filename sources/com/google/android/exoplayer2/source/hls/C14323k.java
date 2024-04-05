package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.util.SparseArray;
import androidx.appcompat.app.C0164l;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.C14216b;
import com.google.android.exoplayer2.drm.C14219c;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.C14304h;
import com.google.android.exoplayer2.source.C14347j;
import com.google.android.exoplayer2.source.C14372q;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.hls.C14325m;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.upstream.C14431b;
import com.google.android.gms.measurement.internal.C15099u;
import com.google.common.collect.C16201n0;
import java.io.IOException;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import p241t2.C7949h;
import p505aj.C14003j;
import p505aj.C14014t;
import p513bj.C14049b0;
import p513bj.C14065m;
import p594jh.C17918h1;
import p595ji.C18000l;

/* renamed from: com.google.android.exoplayer2.source.hls.k */
public final class C14323k implements C14304h, C14325m.C14326a, HlsPlaylistTracker.C14331a {

    /* renamed from: b */
    public final C14320h f31925b;

    /* renamed from: c */
    public final HlsPlaylistTracker f31926c;

    /* renamed from: d */
    public final C14319g f31927d;

    /* renamed from: e */
    public final C14014t f31928e;

    /* renamed from: f */
    public final C14219c f31929f;

    /* renamed from: g */
    public final C14216b.C14217a f31930g;

    /* renamed from: h */
    public final C14431b f31931h;

    /* renamed from: i */
    public final C14347j.C14348a f31932i;

    /* renamed from: j */
    public final C14003j f31933j;

    /* renamed from: k */
    public final IdentityHashMap<C18000l, Integer> f31934k = new IdentityHashMap<>();

    /* renamed from: l */
    public final C7949h f31935l = new C7949h(1);

    /* renamed from: m */
    public final C15099u f31936m;

    /* renamed from: n */
    public final boolean f31937n;

    /* renamed from: o */
    public final int f31938o;

    /* renamed from: p */
    public final boolean f31939p;

    /* renamed from: q */
    public C14304h.C14305a f31940q;

    /* renamed from: r */
    public int f31941r;

    /* renamed from: s */
    public TrackGroupArray f31942s;

    /* renamed from: t */
    public C14325m[] f31943t = new C14325m[0];

    /* renamed from: u */
    public C14325m[] f31944u = new C14325m[0];

    /* renamed from: v */
    public int f31945v;

    /* renamed from: w */
    public C0164l f31946w = new C0164l((Object) new C14372q[0]);

    public C14323k(C14320h hVar, HlsPlaylistTracker hlsPlaylistTracker, C14319g gVar, C14014t tVar, C14219c cVar, C14216b.C14217a aVar, C14431b bVar, C14347j.C14348a aVar2, C14003j jVar, C15099u uVar, boolean z, int i, boolean z2) {
        this.f31925b = hVar;
        this.f31926c = hlsPlaylistTracker;
        this.f31927d = gVar;
        this.f31928e = tVar;
        this.f31929f = cVar;
        this.f31930g = aVar;
        this.f31931h = bVar;
        this.f31932i = aVar2;
        this.f31933j = jVar;
        this.f31936m = uVar;
        this.f31937n = z;
        this.f31938o = i;
        this.f31939p = z2;
        uVar.getClass();
    }

    /* renamed from: p */
    public static Format m22495p(Format format, Format format2, boolean z) {
        String str;
        int i;
        String str2;
        int i2;
        int i3;
        Metadata metadata;
        String str3;
        int i4 = -1;
        if (format2 != null) {
            str3 = format2.codecs;
            metadata = format2.metadata;
            int i5 = format2.channelCount;
            i2 = format2.selectionFlags;
            int i6 = format2.roleFlags;
            String str4 = format2.language;
            str = format2.label;
            String str5 = str4;
            i = i5;
            i3 = i6;
            str2 = str5;
        } else {
            String q = C14049b0.m21644q(1, format.codecs);
            Metadata metadata2 = format.metadata;
            if (z) {
                int i7 = format.channelCount;
                int i8 = format.selectionFlags;
                int i9 = format.roleFlags;
                str2 = format.language;
                int i10 = i7;
                str3 = q;
                str = format.label;
                i = i10;
                int i11 = i9;
                i2 = i8;
                metadata = metadata2;
                i3 = i11;
            } else {
                str2 = null;
                i2 = 0;
                i = -1;
                str3 = q;
                str = null;
                metadata = metadata2;
                i3 = 0;
            }
        }
        String d = C14065m.m21674d(str3);
        int i12 = z ? format.averageBitrate : -1;
        if (z) {
            i4 = format.peakBitrate;
        }
        Format.C14176b bVar = new Format.C14176b();
        bVar.f31293a = format.f31288id;
        bVar.f31294b = str;
        bVar.f31302j = format.containerMimeType;
        bVar.f31303k = d;
        bVar.f31300h = str3;
        bVar.f31301i = metadata;
        bVar.f31298f = i12;
        bVar.f31299g = i4;
        bVar.f31316x = i;
        bVar.f31296d = i2;
        bVar.f31297e = i3;
        bVar.f31295c = str2;
        return bVar.mo47144a();
    }

    /* renamed from: a */
    public final boolean mo1409a() {
        return this.f31946w.mo1409a();
    }

    /* renamed from: b */
    public final long mo1410b() {
        return this.f31946w.mo1410b();
    }

    /* renamed from: c */
    public final boolean mo1411c(long j) {
        if (this.f31942s != null) {
            return this.f31946w.mo1411c(j);
        }
        for (C14325m mVar : this.f31943t) {
            if (!mVar.f31954D) {
                mVar.mo1411c(mVar.f31966P);
            }
        }
        return false;
    }

    /* renamed from: d */
    public final long mo1412d() {
        return this.f31946w.mo1412d();
    }

    /* renamed from: e */
    public final void mo1413e(long j) {
        this.f31946w.mo1413e(j);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: com.google.android.exoplayer2.source.hls.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01e6  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo47669f(com.google.android.exoplayer2.trackselection.C14386b[] r30, boolean[] r31, p595ji.C18000l[] r32, boolean[] r33, long r34) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = r32
            r3 = r34
            int r5 = r1.length
            int[] r5 = new int[r5]
            int r6 = r1.length
            int[] r6 = new int[r6]
            r8 = 0
        L_0x000f:
            int r9 = r1.length
            r10 = -1
            if (r8 >= r9) goto L_0x004d
            r9 = r2[r8]
            if (r9 != 0) goto L_0x0019
            r9 = r10
            goto L_0x0025
        L_0x0019:
            java.util.IdentityHashMap<ji.l, java.lang.Integer> r11 = r0.f31934k
            java.lang.Object r9 = r11.get(r9)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
        L_0x0025:
            r5[r8] = r9
            r6[r8] = r10
            r9 = r1[r8]
            if (r9 == 0) goto L_0x004a
            com.google.android.exoplayer2.source.TrackGroup r9 = r9.mo70315h()
            r11 = 0
        L_0x0032:
            com.google.android.exoplayer2.source.hls.m[] r12 = r0.f31943t
            int r13 = r12.length
            if (r11 >= r13) goto L_0x004a
            r12 = r12[r11]
            r12.mo47749v()
            com.google.android.exoplayer2.source.TrackGroupArray r12 = r12.f31959I
            int r12 = r12.indexOf(r9)
            if (r12 == r10) goto L_0x0047
            r6[r8] = r11
            goto L_0x004a
        L_0x0047:
            int r11 = r11 + 1
            goto L_0x0032
        L_0x004a:
            int r8 = r8 + 1
            goto L_0x000f
        L_0x004d:
            java.util.IdentityHashMap<ji.l, java.lang.Integer> r8 = r0.f31934k
            r8.clear()
            int r8 = r1.length
            ji.l[] r9 = new p595ji.C18000l[r8]
            int r11 = r1.length
            ji.l[] r12 = new p595ji.C18000l[r11]
            int r13 = r1.length
            com.google.android.exoplayer2.trackselection.b[] r14 = new com.google.android.exoplayer2.trackselection.C14386b[r13]
            com.google.android.exoplayer2.source.hls.m[] r15 = r0.f31943t
            int r15 = r15.length
            com.google.android.exoplayer2.source.hls.m[] r15 = new com.google.android.exoplayer2.source.hls.C14325m[r15]
            r7 = 0
            r16 = 0
            r17 = 0
        L_0x0065:
            com.google.android.exoplayer2.source.hls.m[] r10 = r0.f31943t
            int r10 = r10.length
            if (r7 >= r10) goto L_0x0287
            r18 = r8
            r10 = 0
        L_0x006d:
            int r8 = r1.length
            r19 = r15
            if (r10 >= r8) goto L_0x008b
            r8 = r5[r10]
            if (r8 != r7) goto L_0x0079
            r8 = r2[r10]
            goto L_0x007a
        L_0x0079:
            r8 = 0
        L_0x007a:
            r12[r10] = r8
            r8 = r6[r10]
            if (r8 != r7) goto L_0x0083
            r15 = r1[r10]
            goto L_0x0084
        L_0x0083:
            r15 = 0
        L_0x0084:
            r14[r10] = r15
            int r10 = r10 + 1
            r15 = r19
            goto L_0x006d
        L_0x008b:
            com.google.android.exoplayer2.source.hls.m[] r8 = r0.f31943t
            r8 = r8[r7]
            r8.mo47749v()
            int r10 = r8.f31955E
            r15 = 0
        L_0x0095:
            if (r15 >= r13) goto L_0x00eb
            r20 = r12[r15]
            r2 = r20
            com.google.android.exoplayer2.source.hls.l r2 = (com.google.android.exoplayer2.source.hls.C14324l) r2
            if (r2 == 0) goto L_0x00db
            r20 = r14[r15]
            if (r20 == 0) goto L_0x00a7
            boolean r20 = r31[r15]
            if (r20 != 0) goto L_0x00db
        L_0x00a7:
            r20 = r5
            int r5 = r8.f31955E
            r0 = -1
            int r5 = r5 + r0
            r8.f31955E = r5
            int r5 = r2.f31949d
            if (r5 == r0) goto L_0x00d5
            com.google.android.exoplayer2.source.hls.m r0 = r2.f31948c
            int r5 = r2.f31947b
            r0.mo47749v()
            r21 = r9
            int[] r9 = r0.f31961K
            r9.getClass()
            int[] r9 = r0.f31961K
            r5 = r9[r5]
            boolean[] r9 = r0.f31964N
            boolean r9 = r9[r5]
            p513bj.C14075p.m21694f(r9)
            boolean[] r0 = r0.f31964N
            r9 = 0
            r0[r5] = r9
            r0 = -1
            r2.f31949d = r0
            goto L_0x00d7
        L_0x00d5:
            r21 = r9
        L_0x00d7:
            r2 = 0
            r12[r15] = r2
            goto L_0x00e0
        L_0x00db:
            r20 = r5
            r21 = r9
            r0 = -1
        L_0x00e0:
            int r15 = r15 + 1
            r0 = r29
            r2 = r32
            r5 = r20
            r9 = r21
            goto L_0x0095
        L_0x00eb:
            r20 = r5
            r21 = r9
            r0 = -1
            if (r17 != 0) goto L_0x0102
            boolean r2 = r8.f31969S
            if (r2 == 0) goto L_0x00f9
            if (r10 != 0) goto L_0x0100
            goto L_0x0102
        L_0x00f9:
            long r0 = r8.f31966P
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0100
            goto L_0x0102
        L_0x0100:
            r0 = 0
            goto L_0x0103
        L_0x0102:
            r0 = 1
        L_0x0103:
            com.google.android.exoplayer2.source.hls.f r1 = r8.f31977d
            com.google.android.exoplayer2.trackselection.b r1 = r1.f31882p
            r5 = r1
            r2 = 0
        L_0x0109:
            if (r2 >= r13) goto L_0x015b
            r10 = r14[r2]
            if (r10 != 0) goto L_0x0110
            goto L_0x0158
        L_0x0110:
            com.google.android.exoplayer2.source.TrackGroupArray r15 = r8.f31959I
            com.google.android.exoplayer2.source.TrackGroup r9 = r10.mo70315h()
            int r9 = r15.indexOf(r9)
            int r15 = r8.f31962L
            if (r9 != r15) goto L_0x0123
            com.google.android.exoplayer2.source.hls.f r5 = r8.f31977d
            r5.f31882p = r10
            r5 = r10
        L_0x0123:
            r10 = r12[r2]
            if (r10 != 0) goto L_0x0158
            int r10 = r8.f31955E
            r15 = 1
            int r10 = r10 + r15
            r8.f31955E = r10
            com.google.android.exoplayer2.source.hls.l r10 = new com.google.android.exoplayer2.source.hls.l
            r10.<init>(r8, r9)
            r12[r2] = r10
            r33[r2] = r15
            int[] r15 = r8.f31961K
            if (r15 == 0) goto L_0x0158
            r10.mo47736a()
            if (r0 != 0) goto L_0x0158
            com.google.android.exoplayer2.source.hls.m$c[] r0 = r8.f31995v
            int[] r10 = r8.f31961K
            r9 = r10[r9]
            r0 = r0[r9]
            r9 = 1
            boolean r10 = r0.mo47855v(r3, r9)
            if (r10 != 0) goto L_0x0157
            int r9 = r0.f32299r
            int r0 = r0.f32301t
            int r9 = r9 + r0
            if (r9 == 0) goto L_0x0157
            r0 = 1
            goto L_0x0158
        L_0x0157:
            r0 = 0
        L_0x0158:
            int r2 = r2 + 1
            goto L_0x0109
        L_0x015b:
            int r2 = r8.f31955E
            if (r2 != 0) goto L_0x0193
            com.google.android.exoplayer2.source.hls.f r1 = r8.f31977d
            r2 = 0
            r1.f31879m = r2
            r8.f31957G = r2
            r1 = 1
            r8.f31968R = r1
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.i> r1 = r8.f31987n
            r1.clear()
            com.google.android.exoplayer2.upstream.Loader r1 = r8.f31983j
            boolean r1 = r1.mo48164b()
            if (r1 == 0) goto L_0x018f
            boolean r1 = r8.f31953C
            if (r1 == 0) goto L_0x0188
            com.google.android.exoplayer2.source.hls.m$c[] r1 = r8.f31995v
            int r2 = r1.length
            r5 = 0
        L_0x017e:
            if (r5 >= r2) goto L_0x0188
            r9 = r1[r5]
            r9.mo47843i()
            int r5 = r5 + 1
            goto L_0x017e
        L_0x0188:
            com.google.android.exoplayer2.upstream.Loader r1 = r8.f31983j
            r1.mo48163a()
            goto L_0x01f6
        L_0x018f:
            r8.mo47742G()
            goto L_0x01f6
        L_0x0193:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.i> r2 = r8.f31987n
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x01e2
            boolean r1 = p513bj.C14049b0.m21628a(r5, r1)
            if (r1 != 0) goto L_0x01e2
            boolean r1 = r8.f31969S
            if (r1 != 0) goto L_0x01d9
            r1 = 0
            int r9 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r9 >= 0) goto L_0x01ac
            long r1 = -r3
        L_0x01ac:
            r23 = r1
            com.google.android.exoplayer2.source.hls.i r1 = r8.mo47737A()
            com.google.android.exoplayer2.source.hls.f r2 = r8.f31977d
            li.e[] r28 = r2.mo47717a(r1, r3)
            r25 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.List<com.google.android.exoplayer2.source.hls.i> r2 = r8.f31988o
            r22 = r5
            r27 = r2
            r22.mo47725i(r23, r25, r27, r28)
            com.google.android.exoplayer2.source.hls.f r2 = r8.f31977d
            com.google.android.exoplayer2.source.TrackGroup r2 = r2.f31874h
            com.google.android.exoplayer2.Format r1 = r1.f39828d
            int r1 = r2.indexOf(r1)
            int r2 = r5.mo47899m()
            if (r2 == r1) goto L_0x01d7
            goto L_0x01d9
        L_0x01d7:
            r1 = 0
            goto L_0x01da
        L_0x01d9:
            r1 = 1
        L_0x01da:
            if (r1 == 0) goto L_0x01e2
            r1 = 1
            r8.f31968R = r1
            r0 = 1
            r1 = 1
            goto L_0x01e4
        L_0x01e2:
            r1 = r17
        L_0x01e4:
            if (r0 == 0) goto L_0x01f6
            r8.mo47743H(r3, r1)
            r1 = 0
        L_0x01ea:
            if (r1 >= r11) goto L_0x01f6
            r2 = r12[r1]
            if (r2 == 0) goto L_0x01f3
            r2 = 1
            r33[r1] = r2
        L_0x01f3:
            int r1 = r1 + 1
            goto L_0x01ea
        L_0x01f6:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.l> r1 = r8.f31992s
            r1.clear()
            r1 = 0
        L_0x01fc:
            if (r1 >= r11) goto L_0x020c
            r2 = r12[r1]
            if (r2 == 0) goto L_0x0209
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.l> r5 = r8.f31992s
            com.google.android.exoplayer2.source.hls.l r2 = (com.google.android.exoplayer2.source.hls.C14324l) r2
            r5.add(r2)
        L_0x0209:
            int r1 = r1 + 1
            goto L_0x01fc
        L_0x020c:
            r1 = 1
            r8.f31969S = r1
            r5 = r30
            r1 = 0
            r2 = 0
        L_0x0213:
            int r9 = r5.length
            if (r1 >= r9) goto L_0x023f
            r9 = r12[r1]
            r10 = r6[r1]
            if (r10 != r7) goto L_0x022e
            r9.getClass()
            r21[r1] = r9
            r10 = r29
            java.util.IdentityHashMap<ji.l, java.lang.Integer> r2 = r10.f31934k
            java.lang.Integer r15 = java.lang.Integer.valueOf(r7)
            r2.put(r9, r15)
            r2 = 1
            goto L_0x023c
        L_0x022e:
            r10 = r29
            r15 = r20[r1]
            if (r15 != r7) goto L_0x023c
            if (r9 != 0) goto L_0x0238
            r9 = 1
            goto L_0x0239
        L_0x0238:
            r9 = 0
        L_0x0239:
            p513bj.C14075p.m21694f(r9)
        L_0x023c:
            int r1 = r1 + 1
            goto L_0x0213
        L_0x023f:
            r10 = r29
            if (r2 == 0) goto L_0x0275
            r1 = r16
            r19[r1] = r8
            int r16 = r1 + 1
            if (r1 != 0) goto L_0x0268
            com.google.android.exoplayer2.source.hls.f r1 = r8.f31977d
            r2 = 1
            r1.f31877k = r2
            if (r0 != 0) goto L_0x025c
            com.google.android.exoplayer2.source.hls.m[] r0 = r10.f31944u
            int r1 = r0.length
            if (r1 == 0) goto L_0x025c
            r1 = 0
            r0 = r0[r1]
            if (r8 == r0) goto L_0x0277
        L_0x025c:
            t2.h r0 = r10.f31935l
            java.lang.Object r0 = r0.f17418a
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            r0.clear()
            r17 = r2
            goto L_0x0277
        L_0x0268:
            r2 = 1
            int r0 = r10.f31945v
            if (r7 >= r0) goto L_0x026f
            r9 = r2
            goto L_0x0270
        L_0x026f:
            r9 = 0
        L_0x0270:
            com.google.android.exoplayer2.source.hls.f r0 = r8.f31977d
            r0.f31877k = r9
            goto L_0x0277
        L_0x0275:
            r1 = r16
        L_0x0277:
            int r7 = r7 + 1
            r2 = r32
            r1 = r5
            r0 = r10
            r8 = r18
            r15 = r19
            r5 = r20
            r9 = r21
            goto L_0x0065
        L_0x0287:
            r10 = r0
            r0 = r2
            r2 = r8
            r7 = r9
            r19 = r15
            r1 = r16
            r8 = 0
            java.lang.System.arraycopy(r7, r8, r0, r8, r2)
            r0 = r19
            java.lang.Object[] r0 = p513bj.C14049b0.m21623D(r1, r0)
            com.google.android.exoplayer2.source.hls.m[] r0 = (com.google.android.exoplayer2.source.hls.C14325m[]) r0
            r10.f31944u = r0
            com.google.android.gms.measurement.internal.u r1 = r10.f31936m
            r1.getClass()
            androidx.appcompat.app.l r1 = new androidx.appcompat.app.l
            r1.<init>((java.lang.Object) r0)
            r10.f31946w = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.C14323k.mo47669f(com.google.android.exoplayer2.trackselection.b[], boolean[], ji.l[], boolean[], long):long");
    }

    /* renamed from: g */
    public final void mo47732g() {
        for (C14325m mVar : this.f31943t) {
            if (!mVar.f31987n.isEmpty()) {
                C14321i iVar = (C14321i) C16201n0.m26211b(mVar.f31987n);
                int b = mVar.f31977d.mo47718b(iVar);
                if (b == 1) {
                    iVar.f31908K = true;
                } else if (b == 2 && !mVar.f31970T && mVar.f31983j.mo48164b()) {
                    mVar.f31983j.mo48163a();
                }
            }
        }
        this.f31940q.mo47674l(this);
    }

    /* renamed from: h */
    public final boolean mo47733h(Uri uri, long j) {
        boolean z;
        int g;
        boolean z2 = true;
        for (C14325m mVar : this.f31943t) {
            C14313f fVar = mVar.f31977d;
            int i = 0;
            while (true) {
                Uri[] uriArr = fVar.f31871e;
                if (i >= uriArr.length) {
                    i = -1;
                    break;
                } else if (uriArr[i].equals(uri)) {
                    break;
                } else {
                    i++;
                }
            }
            if (!(i == -1 || (g = fVar.f31882p.mo70314g(i)) == -1)) {
                fVar.f31884r |= uri.equals(fVar.f31880n);
                if (j != -9223372036854775807L && !fVar.f31882p.mo47898b(g, j)) {
                    z = false;
                    z2 &= z;
                }
            }
            z = true;
            z2 &= z;
        }
        this.f31940q.mo47674l(this);
        return z2;
    }

    /* renamed from: i */
    public final long mo47671i(long j) {
        C14325m[] mVarArr = this.f31944u;
        if (mVarArr.length > 0) {
            boolean H = mVarArr[0].mo47743H(j, false);
            int i = 1;
            while (true) {
                C14325m[] mVarArr2 = this.f31944u;
                if (i >= mVarArr2.length) {
                    break;
                }
                mVarArr2[i].mo47743H(j, H);
                i++;
            }
            if (H) {
                ((SparseArray) this.f31935l.f17418a).clear();
            }
        }
        return j;
    }

    /* renamed from: j */
    public final long mo47672j() {
        return -9223372036854775807L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01fd  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47673k(com.google.android.exoplayer2.source.C14304h.C14305a r23, long r24) {
        /*
            r22 = this;
            r9 = r22
            r0 = r23
            r9.f31940q = r0
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r0 = r9.f31926c
            r0.mo47771f(r9)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r0 = r9.f31926c
            com.google.android.exoplayer2.source.hls.playlist.b r10 = r0.mo47769d()
            r10.getClass()
            boolean r0 = r9.f31939p
            r11 = 0
            if (r0 == 0) goto L_0x005a
            java.util.List<com.google.android.exoplayer2.drm.DrmInitData> r0 = r10.f32111m
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = r11
        L_0x0026:
            int r4 = r1.size()
            if (r3 >= r4) goto L_0x005e
            java.lang.Object r4 = r0.get(r3)
            com.google.android.exoplayer2.drm.DrmInitData r4 = (com.google.android.exoplayer2.drm.DrmInitData) r4
            java.lang.String r5 = r4.schemeType
            int r3 = r3 + 1
            r6 = r3
        L_0x0037:
            int r7 = r1.size()
            if (r6 >= r7) goto L_0x0056
            java.lang.Object r7 = r1.get(r6)
            com.google.android.exoplayer2.drm.DrmInitData r7 = (com.google.android.exoplayer2.drm.DrmInitData) r7
            java.lang.String r8 = r7.schemeType
            boolean r8 = android.text.TextUtils.equals(r8, r5)
            if (r8 == 0) goto L_0x0053
            com.google.android.exoplayer2.drm.DrmInitData r4 = r4.merge(r7)
            r1.remove(r6)
            goto L_0x0037
        L_0x0053:
            int r6 = r6 + 1
            goto L_0x0037
        L_0x0056:
            r2.put(r5, r4)
            goto L_0x0026
        L_0x005a:
            java.util.Map r2 = java.util.Collections.emptyMap()
        L_0x005e:
            r12 = r2
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.b$b> r0 = r10.f32103e
            boolean r0 = r0.isEmpty()
            r13 = 1
            r0 = r0 ^ r13
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.b$a> r14 = r10.f32105g
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.b$a> r15 = r10.f32106h
            r9.f31941r = r11
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            if (r0 == 0) goto L_0x024c
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.b$b> r0 = r10.f32103e
            int r0 = r0.size()
            int[] r1 = new int[r0]
            r2 = r11
            r3 = r2
            r4 = r3
        L_0x0084:
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.b$b> r5 = r10.f32103e
            int r5 = r5.size()
            r6 = 2
            if (r2 >= r5) goto L_0x00bd
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.b$b> r5 = r10.f32103e
            java.lang.Object r5 = r5.get(r2)
            com.google.android.exoplayer2.source.hls.playlist.b$b r5 = (com.google.android.exoplayer2.source.hls.playlist.C14335b.C14337b) r5
            com.google.android.exoplayer2.Format r5 = r5.f32116b
            int r11 = r5.height
            if (r11 > 0) goto L_0x00b5
            java.lang.String r11 = r5.codecs
            java.lang.String r11 = p513bj.C14049b0.m21644q(r6, r11)
            if (r11 == 0) goto L_0x00a4
            goto L_0x00b5
        L_0x00a4:
            java.lang.String r5 = r5.codecs
            java.lang.String r5 = p513bj.C14049b0.m21644q(r13, r5)
            if (r5 == 0) goto L_0x00b1
            r1[r2] = r13
            int r4 = r4 + 1
            goto L_0x00b9
        L_0x00b1:
            r5 = -1
            r1[r2] = r5
            goto L_0x00b9
        L_0x00b5:
            r1[r2] = r6
            int r3 = r3 + 1
        L_0x00b9:
            int r2 = r2 + 1
            r11 = 0
            goto L_0x0084
        L_0x00bd:
            if (r3 <= 0) goto L_0x00c1
            r0 = r13
            goto L_0x00ca
        L_0x00c1:
            if (r4 >= r0) goto L_0x00c8
            int r0 = r0 - r4
            r11 = r0
            r2 = r13
            r0 = 0
            goto L_0x00cc
        L_0x00c8:
            r3 = r0
            r0 = 0
        L_0x00ca:
            r11 = r3
            r2 = 0
        L_0x00cc:
            android.net.Uri[] r3 = new android.net.Uri[r11]
            com.google.android.exoplayer2.Format[] r5 = new com.google.android.exoplayer2.Format[r11]
            int[] r4 = new int[r11]
            r13 = 0
            r16 = 0
        L_0x00d5:
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.b$b> r6 = r10.f32103e
            int r6 = r6.size()
            if (r13 >= r6) goto L_0x010b
            if (r0 == 0) goto L_0x00e7
            r6 = r1[r13]
            r18 = r0
            r0 = 2
            if (r6 != r0) goto L_0x0106
            goto L_0x00e9
        L_0x00e7:
            r18 = r0
        L_0x00e9:
            if (r2 == 0) goto L_0x00f0
            r0 = r1[r13]
            r6 = 1
            if (r0 == r6) goto L_0x0106
        L_0x00f0:
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.b$b> r0 = r10.f32103e
            java.lang.Object r0 = r0.get(r13)
            com.google.android.exoplayer2.source.hls.playlist.b$b r0 = (com.google.android.exoplayer2.source.hls.playlist.C14335b.C14337b) r0
            android.net.Uri r6 = r0.f32115a
            r3[r16] = r6
            com.google.android.exoplayer2.Format r0 = r0.f32116b
            r5[r16] = r0
            int r0 = r16 + 1
            r4[r16] = r13
            r16 = r0
        L_0x0106:
            int r13 = r13 + 1
            r0 = r18
            goto L_0x00d5
        L_0x010b:
            r0 = 0
            r1 = r5[r0]
            java.lang.String r0 = r1.codecs
            r6 = 2
            int r13 = p513bj.C14049b0.m21643p(r6, r0)
            r1 = 1
            int r2 = p513bj.C14049b0.m21643p(r1, r0)
            if (r2 > r1) goto L_0x0125
            if (r13 > r1) goto L_0x0125
            int r0 = r2 + r13
            if (r0 <= 0) goto L_0x0125
            r16 = 1
            goto L_0x0127
        L_0x0125:
            r16 = 0
        L_0x0127:
            r1 = 0
            com.google.android.exoplayer2.Format r0 = r10.f32108j
            java.util.List<com.google.android.exoplayer2.Format> r6 = r10.f32109k
            r18 = r0
            r0 = r22
            r19 = r2
            r2 = r3
            r3 = r5
            r20 = r4
            r4 = r18
            r18 = r5
            r5 = r6
            r6 = r12
            r21 = r12
            r17 = r15
            r15 = r7
            r12 = r8
            r7 = r24
            com.google.android.exoplayer2.source.hls.m r0 = r0.mo47734n(r1, r2, r3, r4, r5, r6, r7)
            r15.add(r0)
            r1 = r20
            r12.add(r1)
            boolean r1 = r9.f31937n
            if (r1 == 0) goto L_0x0252
            if (r16 == 0) goto L_0x0252
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r13 <= 0) goto L_0x01fd
            com.google.android.exoplayer2.Format[] r2 = new com.google.android.exoplayer2.Format[r11]
            r3 = 0
        L_0x0160:
            if (r3 >= r11) goto L_0x01ad
            r4 = r18[r3]
            java.lang.String r5 = r4.codecs
            r6 = 2
            java.lang.String r5 = p513bj.C14049b0.m21644q(r6, r5)
            java.lang.String r7 = p513bj.C14065m.m21674d(r5)
            com.google.android.exoplayer2.Format$b r8 = new com.google.android.exoplayer2.Format$b
            r8.<init>()
            java.lang.String r13 = r4.f31288id
            r8.f31293a = r13
            java.lang.String r13 = r4.label
            r8.f31294b = r13
            java.lang.String r13 = r4.containerMimeType
            r8.f31302j = r13
            r8.f31303k = r7
            r8.f31300h = r5
            com.google.android.exoplayer2.metadata.Metadata r5 = r4.metadata
            r8.f31301i = r5
            int r5 = r4.averageBitrate
            r8.f31298f = r5
            int r5 = r4.peakBitrate
            r8.f31299g = r5
            int r5 = r4.width
            r8.f31308p = r5
            int r5 = r4.height
            r8.f31309q = r5
            float r5 = r4.frameRate
            r8.f31310r = r5
            int r5 = r4.selectionFlags
            r8.f31296d = r5
            int r4 = r4.roleFlags
            r8.f31297e = r4
            com.google.android.exoplayer2.Format r4 = r8.mo47144a()
            r2[r3] = r4
            int r3 = r3 + 1
            goto L_0x0160
        L_0x01ad:
            com.google.android.exoplayer2.source.TrackGroup r3 = new com.google.android.exoplayer2.source.TrackGroup
            r3.<init>((com.google.android.exoplayer2.Format[]) r2)
            r1.add(r3)
            if (r19 <= 0) goto L_0x01d9
            com.google.android.exoplayer2.Format r2 = r10.f32108j
            if (r2 != 0) goto L_0x01c3
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.b$a> r2 = r10.f32105g
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x01d9
        L_0x01c3:
            com.google.android.exoplayer2.source.TrackGroup r2 = new com.google.android.exoplayer2.source.TrackGroup
            r3 = 1
            com.google.android.exoplayer2.Format[] r4 = new com.google.android.exoplayer2.Format[r3]
            r3 = 0
            r5 = r18[r3]
            com.google.android.exoplayer2.Format r6 = r10.f32108j
            com.google.android.exoplayer2.Format r5 = m22495p(r5, r6, r3)
            r4[r3] = r5
            r2.<init>((com.google.android.exoplayer2.Format[]) r4)
            r1.add(r2)
        L_0x01d9:
            java.util.List<com.google.android.exoplayer2.Format> r2 = r10.f32109k
            if (r2 == 0) goto L_0x01fb
            r3 = 0
        L_0x01de:
            int r4 = r2.size()
            if (r3 >= r4) goto L_0x01fb
            com.google.android.exoplayer2.source.TrackGroup r4 = new com.google.android.exoplayer2.source.TrackGroup
            r5 = 1
            com.google.android.exoplayer2.Format[] r6 = new com.google.android.exoplayer2.Format[r5]
            java.lang.Object r5 = r2.get(r3)
            com.google.android.exoplayer2.Format r5 = (com.google.android.exoplayer2.Format) r5
            r7 = 0
            r6[r7] = r5
            r4.<init>((com.google.android.exoplayer2.Format[]) r6)
            r1.add(r4)
            int r3 = r3 + 1
            goto L_0x01de
        L_0x01fb:
            r6 = 1
            goto L_0x0219
        L_0x01fd:
            com.google.android.exoplayer2.Format[] r2 = new com.google.android.exoplayer2.Format[r11]
            r3 = 0
        L_0x0200:
            if (r3 >= r11) goto L_0x0210
            r4 = r18[r3]
            com.google.android.exoplayer2.Format r5 = r10.f32108j
            r6 = 1
            com.google.android.exoplayer2.Format r4 = m22495p(r4, r5, r6)
            r2[r3] = r4
            int r3 = r3 + 1
            goto L_0x0200
        L_0x0210:
            r6 = 1
            com.google.android.exoplayer2.source.TrackGroup r3 = new com.google.android.exoplayer2.source.TrackGroup
            r3.<init>((com.google.android.exoplayer2.Format[]) r2)
            r1.add(r3)
        L_0x0219:
            com.google.android.exoplayer2.source.TrackGroup r2 = new com.google.android.exoplayer2.source.TrackGroup
            com.google.android.exoplayer2.Format[] r3 = new com.google.android.exoplayer2.Format[r6]
            com.google.android.exoplayer2.Format$b r4 = new com.google.android.exoplayer2.Format$b
            r4.<init>()
            java.lang.String r5 = "ID3"
            r4.f31293a = r5
            java.lang.String r5 = "application/id3"
            r4.f31303k = r5
            com.google.android.exoplayer2.Format r4 = r4.mo47144a()
            r5 = 0
            r3[r5] = r4
            r2.<init>((com.google.android.exoplayer2.Format[]) r3)
            r1.add(r2)
            com.google.android.exoplayer2.source.TrackGroup[] r3 = new com.google.android.exoplayer2.source.TrackGroup[r5]
            java.lang.Object[] r3 = r1.toArray(r3)
            com.google.android.exoplayer2.source.TrackGroup[] r3 = (com.google.android.exoplayer2.source.TrackGroup[]) r3
            r4 = 1
            int[] r6 = new int[r4]
            int r1 = r1.indexOf(r2)
            r6[r5] = r1
            r0.mo47741F(r3, r6)
            goto L_0x0252
        L_0x024c:
            r21 = r12
            r17 = r15
            r15 = r7
            r12 = r8
        L_0x0252:
            java.util.ArrayList r10 = new java.util.ArrayList
            int r0 = r14.size()
            r10.<init>(r0)
            java.util.ArrayList r11 = new java.util.ArrayList
            int r0 = r14.size()
            r11.<init>(r0)
            java.util.ArrayList r13 = new java.util.ArrayList
            int r0 = r14.size()
            r13.<init>(r0)
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            r8 = 0
        L_0x0273:
            int r0 = r14.size()
            if (r8 >= r0) goto L_0x032f
            java.lang.Object r0 = r14.get(r8)
            com.google.android.exoplayer2.source.hls.playlist.b$a r0 = (com.google.android.exoplayer2.source.hls.playlist.C14335b.C14336a) r0
            java.lang.String r0 = r0.f32114c
            boolean r1 = r7.add(r0)
            if (r1 != 0) goto L_0x028d
            r18 = r7
            r19 = r8
            goto L_0x0329
        L_0x028d:
            r10.clear()
            r11.clear()
            r13.clear()
            r1 = 0
            r16 = 1
        L_0x0299:
            int r2 = r14.size()
            if (r1 >= r2) goto L_0x02d9
            java.lang.Object r2 = r14.get(r1)
            com.google.android.exoplayer2.source.hls.playlist.b$a r2 = (com.google.android.exoplayer2.source.hls.playlist.C14335b.C14336a) r2
            java.lang.String r2 = r2.f32114c
            boolean r2 = p513bj.C14049b0.m21628a(r0, r2)
            if (r2 == 0) goto L_0x02d6
            java.lang.Object r2 = r14.get(r1)
            com.google.android.exoplayer2.source.hls.playlist.b$a r2 = (com.google.android.exoplayer2.source.hls.playlist.C14335b.C14336a) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r13.add(r3)
            android.net.Uri r3 = r2.f32112a
            r10.add(r3)
            com.google.android.exoplayer2.Format r3 = r2.f32113b
            r11.add(r3)
            com.google.android.exoplayer2.Format r2 = r2.f32113b
            java.lang.String r2 = r2.codecs
            r3 = 1
            int r2 = p513bj.C14049b0.m21643p(r3, r2)
            if (r2 != r3) goto L_0x02d1
            r2 = 1
            goto L_0x02d2
        L_0x02d1:
            r2 = 0
        L_0x02d2:
            r2 = r16 & r2
            r16 = r2
        L_0x02d6:
            int r1 = r1 + 1
            goto L_0x0299
        L_0x02d9:
            r1 = 1
            r0 = 0
            android.net.Uri[] r2 = new android.net.Uri[r0]
            int r3 = p513bj.C14049b0.f30913a
            java.lang.Object[] r2 = r10.toArray(r2)
            android.net.Uri[] r2 = (android.net.Uri[]) r2
            com.google.android.exoplayer2.Format[] r3 = new com.google.android.exoplayer2.Format[r0]
            java.lang.Object[] r0 = r11.toArray(r3)
            r3 = r0
            com.google.android.exoplayer2.Format[] r3 = (com.google.android.exoplayer2.Format[]) r3
            r4 = 0
            java.util.List r5 = java.util.Collections.emptyList()
            r0 = r22
            r6 = r21
            r18 = r7
            r19 = r8
            r7 = r24
            com.google.android.exoplayer2.source.hls.m r0 = r0.mo47734n(r1, r2, r3, r4, r5, r6, r7)
            int[] r1 = com.google.common.primitives.Ints.m26385c(r13)
            r12.add(r1)
            r15.add(r0)
            boolean r1 = r9.f31937n
            if (r1 == 0) goto L_0x0329
            if (r16 == 0) goto L_0x0329
            r1 = 0
            com.google.android.exoplayer2.Format[] r2 = new com.google.android.exoplayer2.Format[r1]
            java.lang.Object[] r2 = r11.toArray(r2)
            com.google.android.exoplayer2.Format[] r2 = (com.google.android.exoplayer2.Format[]) r2
            r3 = 1
            com.google.android.exoplayer2.source.TrackGroup[] r4 = new com.google.android.exoplayer2.source.TrackGroup[r3]
            com.google.android.exoplayer2.source.TrackGroup r3 = new com.google.android.exoplayer2.source.TrackGroup
            r3.<init>((com.google.android.exoplayer2.Format[]) r2)
            r4[r1] = r3
            int[] r2 = new int[r1]
            r0.mo47741F(r4, r2)
        L_0x0329:
            int r8 = r19 + 1
            r7 = r18
            goto L_0x0273
        L_0x032f:
            int r0 = r15.size()
            r9.f31945v = r0
            r10 = 0
        L_0x0336:
            int r0 = r17.size()
            if (r10 >= r0) goto L_0x0386
            r11 = r17
            java.lang.Object r0 = r11.get(r10)
            r13 = r0
            com.google.android.exoplayer2.source.hls.playlist.b$a r13 = (com.google.android.exoplayer2.source.hls.playlist.C14335b.C14336a) r13
            r1 = 3
            r0 = 1
            android.net.Uri[] r2 = new android.net.Uri[r0]
            android.net.Uri r3 = r13.f32112a
            r4 = 0
            r2[r4] = r3
            com.google.android.exoplayer2.Format[] r3 = new com.google.android.exoplayer2.Format[r0]
            com.google.android.exoplayer2.Format r0 = r13.f32113b
            r3[r4] = r0
            r4 = 0
            java.util.List r5 = java.util.Collections.emptyList()
            r0 = r22
            r6 = r21
            r7 = r24
            com.google.android.exoplayer2.source.hls.m r0 = r0.mo47734n(r1, r2, r3, r4, r5, r6, r7)
            r1 = 1
            int[] r2 = new int[r1]
            r3 = 0
            r2[r3] = r10
            r12.add(r2)
            r15.add(r0)
            com.google.android.exoplayer2.source.TrackGroup[] r2 = new com.google.android.exoplayer2.source.TrackGroup[r1]
            com.google.android.exoplayer2.source.TrackGroup r4 = new com.google.android.exoplayer2.source.TrackGroup
            com.google.android.exoplayer2.Format[] r5 = new com.google.android.exoplayer2.Format[r1]
            com.google.android.exoplayer2.Format r1 = r13.f32113b
            r5[r3] = r1
            r4.<init>((com.google.android.exoplayer2.Format[]) r5)
            r2[r3] = r4
            int[] r1 = new int[r3]
            r0.mo47741F(r2, r1)
            int r10 = r10 + 1
            goto L_0x0336
        L_0x0386:
            r3 = 0
            com.google.android.exoplayer2.source.hls.m[] r0 = new com.google.android.exoplayer2.source.hls.C14325m[r3]
            java.lang.Object[] r0 = r15.toArray(r0)
            com.google.android.exoplayer2.source.hls.m[] r0 = (com.google.android.exoplayer2.source.hls.C14325m[]) r0
            r9.f31943t = r0
            int[][] r0 = new int[r3][]
            java.lang.Object[] r0 = r12.toArray(r0)
            int[][] r0 = (int[][]) r0
            com.google.android.exoplayer2.source.hls.m[] r0 = r9.f31943t
            int r1 = r0.length
            r9.f31941r = r1
            r1 = r0[r3]
            com.google.android.exoplayer2.source.hls.f r1 = r1.f31977d
            r2 = 1
            r1.f31877k = r2
            int r1 = r0.length
            r11 = r3
        L_0x03a7:
            if (r11 >= r1) goto L_0x03b7
            r2 = r0[r11]
            boolean r3 = r2.f31954D
            if (r3 != 0) goto L_0x03b4
            long r3 = r2.f31966P
            r2.mo1411c(r3)
        L_0x03b4:
            int r11 = r11 + 1
            goto L_0x03a7
        L_0x03b7:
            com.google.android.exoplayer2.source.hls.m[] r0 = r9.f31943t
            r9.f31944u = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.C14323k.mo47673k(com.google.android.exoplayer2.source.h$a, long):void");
    }

    /* renamed from: l */
    public final void mo47674l(C14372q qVar) {
        C14325m mVar = (C14325m) qVar;
        this.f31940q.mo47674l(this);
    }

    /* renamed from: n */
    public final C14325m mo47734n(int i, Uri[] uriArr, Format[] formatArr, Format format, List<Format> list, Map<String, DrmInitData> map, long j) {
        return new C14325m(i, this, new C14313f(this.f31925b, this.f31926c, uriArr, formatArr, this.f31927d, this.f31928e, this.f31935l, list), map, this.f31933j, j, format, this.f31929f, this.f31930g, this.f31931h, this.f31932i, this.f31938o);
    }

    /* renamed from: o */
    public final void mo47676o() throws IOException {
        C14325m[] mVarArr = this.f31943t;
        int length = mVarArr.length;
        int i = 0;
        while (i < length) {
            C14325m mVar = mVarArr[i];
            mVar.mo47740E();
            if (!mVar.f31970T || mVar.f31954D) {
                i++;
            } else {
                throw new ParserException("Loading finished before preparation is complete.");
            }
        }
    }

    /* renamed from: q */
    public final TrackGroupArray mo47677q() {
        TrackGroupArray trackGroupArray = this.f31942s;
        trackGroupArray.getClass();
        return trackGroupArray;
    }

    /* renamed from: r */
    public final void mo47735r() {
        int i = this.f31941r - 1;
        this.f31941r = i;
        if (i <= 0) {
            int i2 = 0;
            for (C14325m mVar : this.f31943t) {
                mVar.mo47749v();
                i2 += mVar.f31959I.length;
            }
            TrackGroup[] trackGroupArr = new TrackGroup[i2];
            int i3 = 0;
            for (C14325m mVar2 : this.f31943t) {
                mVar2.mo47749v();
                int i4 = mVar2.f31959I.length;
                int i5 = 0;
                while (i5 < i4) {
                    mVar2.mo47749v();
                    trackGroupArr[i3] = mVar2.f31959I.get(i5);
                    i5++;
                    i3++;
                }
            }
            this.f31942s = new TrackGroupArray(trackGroupArr);
            this.f31940q.mo47675m(this);
        }
    }

    /* renamed from: t */
    public final void mo47678t(long j, boolean z) {
        for (C14325m mVar : this.f31944u) {
            if (mVar.f31953C && !mVar.mo47738C()) {
                int length = mVar.f31995v.length;
                for (int i = 0; i < length; i++) {
                    mVar.f31995v[i].mo47842h(j, z, mVar.f31964N[i]);
                }
            }
        }
    }

    /* renamed from: u */
    public final long mo47679u(long j, C17918h1 h1Var) {
        return j;
    }
}
