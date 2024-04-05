package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.text.TextUtils;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.hls.C14325m;
import com.google.common.collect.ImmutableList;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.reflect.C19421p;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p001a0.C0005b;
import p505aj.C13999g;
import p505aj.C14002i;
import p513bj.C14049b0;
import p513bj.C14065m;
import p513bj.C14075p;
import p513bj.C14077r;
import p513bj.C14086y;
import p563fi.C17734a;
import p612li.C18188d;
import p644ph.C18346e;
import p644ph.C18349h;
import p693vh.C18639d;
import p701wh.C18680e;
import p717yh.C18836a;
import p717yh.C18841c;
import p717yh.C18844d0;
import p717yh.C18847e;
import p717yh.C18855g;

/* renamed from: com.google.android.exoplayer2.source.hls.i */
public final class C14321i extends C18188d {

    /* renamed from: L */
    public static final AtomicInteger f31897L = new AtomicInteger();

    /* renamed from: A */
    public final boolean f31898A;

    /* renamed from: B */
    public final boolean f31899B;

    /* renamed from: C */
    public C14322j f31900C;

    /* renamed from: D */
    public C14325m f31901D;

    /* renamed from: E */
    public int f31902E;

    /* renamed from: F */
    public boolean f31903F;

    /* renamed from: G */
    public volatile boolean f31904G;

    /* renamed from: H */
    public boolean f31905H;

    /* renamed from: I */
    public ImmutableList<Integer> f31906I;

    /* renamed from: J */
    public boolean f31907J;

    /* renamed from: K */
    public boolean f31908K;

    /* renamed from: k */
    public final int f31909k;

    /* renamed from: l */
    public final int f31910l;

    /* renamed from: m */
    public final Uri f31911m;

    /* renamed from: n */
    public final boolean f31912n;

    /* renamed from: o */
    public final int f31913o;

    /* renamed from: p */
    public final C13999g f31914p;

    /* renamed from: q */
    public final C14002i f31915q;

    /* renamed from: r */
    public final C14322j f31916r;

    /* renamed from: s */
    public final boolean f31917s;

    /* renamed from: t */
    public final boolean f31918t;

    /* renamed from: u */
    public final C14086y f31919u;

    /* renamed from: v */
    public final C14320h f31920v;

    /* renamed from: w */
    public final List<Format> f31921w;

    /* renamed from: x */
    public final DrmInitData f31922x;

    /* renamed from: y */
    public final C17734a f31923y;

    /* renamed from: z */
    public final C14077r f31924z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14321i(C14320h hVar, C13999g gVar, C14002i iVar, Format format, boolean z, C13999g gVar2, C14002i iVar2, boolean z2, Uri uri, List<Format> list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, C14086y yVar, DrmInitData drmInitData, C14322j jVar, C17734a aVar, C14077r rVar, boolean z6) {
        super(gVar, iVar, format, i, obj, j, j2, j3);
        C14002i iVar3 = iVar2;
        this.f31898A = z;
        this.f31913o = i2;
        this.f31908K = z3;
        this.f31910l = i3;
        this.f31915q = iVar3;
        this.f31914p = gVar2;
        this.f31903F = iVar3 != null;
        this.f31899B = z2;
        this.f31911m = uri;
        this.f31917s = z5;
        this.f31919u = yVar;
        this.f31918t = z4;
        this.f31920v = hVar;
        this.f31921w = list;
        this.f31922x = drmInitData;
        this.f31916r = jVar;
        this.f31923y = aVar;
        this.f31924z = rVar;
        this.f31912n = z6;
        this.f31906I = ImmutableList.m25826of();
        this.f31909k = f31897L.getAndIncrement();
    }

    /* renamed from: d */
    public static byte[] m22489d(String str) {
        if (C0005b.m56q0(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    /* renamed from: a */
    public final void mo47727a() throws IOException {
        C14322j jVar;
        this.f31901D.getClass();
        if (this.f31900C == null && (jVar = this.f31916r) != null) {
            C18349h hVar = ((C14309b) jVar).f31861a;
            if ((hVar instanceof C18844d0) || (hVar instanceof C18680e)) {
                this.f31900C = jVar;
                this.f31903F = false;
            }
        }
        if (this.f31903F) {
            this.f31914p.getClass();
            this.f31915q.getClass();
            mo47729c(this.f31914p, this.f31915q, this.f31899B);
            this.f31902E = 0;
            this.f31903F = false;
        }
        if (!this.f31904G) {
            if (!this.f31918t) {
                try {
                    C14086y yVar = this.f31919u;
                    boolean z = this.f31917s;
                    long j = this.f39831g;
                    synchronized (yVar) {
                        if (z) {
                            if (!yVar.f31017a) {
                                yVar.f31018b = j;
                                yVar.f31017a = true;
                            }
                        }
                        if (!z || j != yVar.f31018b) {
                            while (yVar.f31020d == -9223372036854775807L) {
                                yVar.wait();
                            }
                        }
                    }
                    mo47729c(this.f39833i, this.f39826b, this.f31898A);
                } catch (InterruptedException unused) {
                    throw new InterruptedIOException();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f31905H = !this.f31904G;
        }
    }

    /* renamed from: b */
    public final void mo47728b() {
        this.f31904G = true;
    }

    @RequiresNonNull({"output"})
    /* renamed from: c */
    public final void mo47729c(C13999g gVar, C14002i iVar, boolean z) throws IOException {
        C14002i iVar2;
        boolean z2;
        C13999g gVar2;
        C18346e f;
        long j;
        long j2;
        boolean z3;
        C14002i iVar3 = iVar;
        if (z) {
            z2 = this.f31902E != 0;
            gVar2 = gVar;
            iVar2 = iVar3;
        } else {
            long j3 = (long) this.f31902E;
            long j4 = iVar3.f30780g;
            long j5 = -1;
            if (j4 != -1) {
                j5 = j4 - j3;
            }
            long j6 = j5;
            iVar2 = (j3 == 0 && j4 == j6) ? iVar3 : new C14002i(iVar3.f30774a, iVar3.f30775b, iVar3.f30776c, iVar3.f30777d, iVar3.f30778e, iVar3.f30779f + j3, j6, iVar3.f30781h, iVar3.f30782i, iVar3.f30783j);
            gVar2 = gVar;
            z2 = false;
        }
        try {
            f = mo47731f(gVar2, iVar2);
            if (z2) {
                f.mo69879j(this.f31902E);
            }
            do {
                if (this.f31904G) {
                    break;
                } else if (((C14309b) this.f31900C).f31861a.mo47757a(f, C14309b.f31860d) == 0) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                break;
                break;
            } while (z3);
            break;
            j = f.f40294d;
            j2 = iVar3.f30779f;
        } catch (EOFException e) {
            if ((this.f39828d.roleFlags & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0) {
                ((C14309b) this.f31900C).f31861a.mo47759c(0, 0);
                j = f.f40294d;
                j2 = iVar3.f30779f;
            } else {
                throw e;
            }
        } catch (Throwable th) {
            C14049b0.m21634g(gVar);
            throw th;
        }
        this.f31902E = (int) (j - j2);
        C14049b0.m21634g(gVar);
    }

    /* renamed from: e */
    public final int mo47730e(int i) {
        C14075p.m21694f(!this.f31912n);
        if (i >= this.f31906I.size()) {
            return 0;
        }
        return this.f31906I.get(i).intValue();
    }

    @RequiresNonNull({"output"})
    @EnsuresNonNull({"extractor"})
    /* renamed from: f */
    public final C18346e mo47731f(C13999g gVar, C14002i iVar) throws IOException {
        int i;
        long j;
        long j2;
        C14309b bVar;
        C14309b bVar2;
        ArrayList arrayList;
        C18349h hVar;
        boolean z;
        boolean z2;
        List<Format> list;
        int i2;
        C18349h hVar2;
        C14002i iVar2 = iVar;
        C18346e eVar = new C18346e(gVar, iVar2.f30779f, gVar.mo46812b(iVar));
        int i3 = 1;
        if (this.f31900C == null) {
            eVar.f40296f = 0;
            try {
                this.f31924z.mo46932w(10);
                eVar.mo69872c(this.f31924z.f30986a, 0, 10, false);
                if (this.f31924z.mo46927r() == 4801587) {
                    this.f31924z.mo46909A(3);
                    int o = this.f31924z.mo46924o();
                    int i4 = o + 10;
                    C14077r rVar = this.f31924z;
                    byte[] bArr = rVar.f30986a;
                    if (i4 > bArr.length) {
                        rVar.mo46932w(i4);
                        System.arraycopy(bArr, 0, this.f31924z.f30986a, 0, 10);
                    }
                    eVar.mo69872c(this.f31924z.f30986a, 10, o, false);
                    Metadata u0 = this.f31923y.mo68991u0(o, this.f31924z.f30986a);
                    if (u0 != null) {
                        int length = u0.length();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                break;
                            }
                            Metadata.Entry entry = u0.get(i5);
                            if (entry instanceof PrivFrame) {
                                PrivFrame privFrame = (PrivFrame) entry;
                                if ("com.apple.streaming.transportStreamTimestamp".equals(privFrame.owner)) {
                                    System.arraycopy(privFrame.privateData, 0, this.f31924z.f30986a, 0, 8);
                                    this.f31924z.mo46935z(0);
                                    this.f31924z.mo46934y(8);
                                    j = this.f31924z.mo46919j() & 8589934591L;
                                    break;
                                }
                            }
                            i5++;
                        }
                    }
                }
            } catch (EOFException unused) {
            }
            j = -9223372036854775807L;
            eVar.f40296f = 0;
            C14322j jVar = this.f31916r;
            if (jVar != null) {
                C14309b bVar3 = (C14309b) jVar;
                C18349h hVar3 = bVar3.f31861a;
                C14075p.m21694f(!((hVar3 instanceof C18844d0) || (hVar3 instanceof C18680e)));
                C18349h hVar4 = bVar3.f31861a;
                if (hVar4 instanceof C14329n) {
                    hVar2 = new C14329n(bVar3.f31862b.language, bVar3.f31863c);
                } else if (hVar4 instanceof C18847e) {
                    hVar2 = new C18847e(0);
                } else if (hVar4 instanceof C18836a) {
                    hVar2 = new C18836a();
                } else if (hVar4 instanceof C18841c) {
                    hVar2 = new C18841c();
                } else if (hVar4 instanceof C18639d) {
                    hVar2 = new C18639d();
                } else {
                    String simpleName = bVar3.f31861a.getClass().getSimpleName();
                    throw new IllegalStateException(simpleName.length() != 0 ? "Unexpected extractor type for recreation: ".concat(simpleName) : new String("Unexpected extractor type for recreation: "));
                }
                bVar = new C14309b(hVar2, bVar3.f31862b, bVar3.f31863c);
                j2 = j;
                i = 0;
            } else {
                C14320h hVar5 = this.f31920v;
                Uri uri = iVar2.f30774a;
                Format format = this.f39828d;
                List<Format> list2 = this.f31921w;
                C14086y yVar = this.f31919u;
                Map<String, List<String>> d = gVar.mo46815d();
                ((C14311d) hVar5).getClass();
                int N = C19421p.m32924N(format.sampleMimeType);
                int O = C19421p.m32925O(d);
                int P = C19421p.m32926P(uri);
                int[] iArr = C14311d.f31865b;
                ArrayList arrayList2 = new ArrayList(7);
                C14311d.m22477a(N, arrayList2);
                C14311d.m22477a(O, arrayList2);
                C14311d.m22477a(P, arrayList2);
                for (int i6 = 0; i6 < 7; i6++) {
                    C14311d.m22477a(iArr[i6], arrayList2);
                }
                eVar.f40296f = 0;
                int i7 = 0;
                C18349h hVar6 = null;
                while (true) {
                    if (i7 >= arrayList2.size()) {
                        j2 = j;
                        i = 0;
                        hVar6.getClass();
                        bVar2 = new C14309b(hVar6, format, yVar);
                        break;
                    }
                    int intValue = ((Integer) arrayList2.get(i7)).intValue();
                    if (intValue == 0) {
                        arrayList = arrayList2;
                        j2 = j;
                        hVar = new C18836a();
                    } else if (intValue == i3) {
                        arrayList = arrayList2;
                        j2 = j;
                        hVar = new C18841c();
                    } else if (intValue == 2) {
                        arrayList = arrayList2;
                        j2 = j;
                        hVar = new C18847e(0);
                    } else if (intValue == 7) {
                        arrayList = arrayList2;
                        j2 = j;
                        hVar = new C18639d(0);
                    } else if (intValue == 8) {
                        arrayList = arrayList2;
                        j2 = j;
                        Metadata metadata = format.metadata;
                        if (metadata != null) {
                            int i8 = 0;
                            while (true) {
                                if (i8 >= metadata.length()) {
                                    break;
                                }
                                Metadata.Entry entry2 = metadata.get(i8);
                                if (entry2 instanceof HlsTrackMetadataEntry) {
                                    z2 = !((HlsTrackMetadataEntry) entry2).variantInfos.isEmpty();
                                    break;
                                }
                                i8++;
                            }
                        }
                        z2 = false;
                        hVar = new C18680e(z2 ? 4 : 0, yVar, list2 != null ? list2 : Collections.emptyList());
                    } else if (intValue == 11) {
                        if (list2 != null) {
                            i2 = 48;
                            arrayList = arrayList2;
                            list = list2;
                        } else {
                            Format.C14176b bVar4 = new Format.C14176b();
                            bVar4.f31303k = "application/cea-608";
                            arrayList = arrayList2;
                            list = Collections.singletonList(bVar4.mo47144a());
                            i2 = 16;
                        }
                        String str = format.codecs;
                        if (!TextUtils.isEmpty(str)) {
                            j2 = j;
                            if (!(C14065m.m21672b(str, "audio/mp4a-latm") != null)) {
                                i2 |= 2;
                            }
                            if (!(C14065m.m21672b(str, "video/avc") != null)) {
                                i2 |= 4;
                            }
                        } else {
                            j2 = j;
                        }
                        hVar = new C18844d0(2, yVar, new C18855g(i2, list));
                    } else if (intValue != 13) {
                        arrayList = arrayList2;
                        j2 = j;
                        hVar = null;
                    } else {
                        hVar = new C14329n(format.language, yVar);
                        arrayList = arrayList2;
                        j2 = j;
                    }
                    hVar.getClass();
                    try {
                        z = hVar.mo47761f(eVar);
                        i = 0;
                        eVar.f40296f = 0;
                    } catch (EOFException unused2) {
                        i = 0;
                        eVar.f40296f = 0;
                        z = false;
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        eVar.f40296f = 0;
                        throw th2;
                    }
                    if (z) {
                        bVar2 = new C14309b(hVar, format, yVar);
                        break;
                    }
                    if (hVar6 == null && (intValue == N || intValue == O || intValue == P || intValue == 11)) {
                        hVar6 = hVar;
                    }
                    i7++;
                    arrayList2 = arrayList;
                    j = j2;
                    i3 = 1;
                }
                bVar = bVar2;
            }
            this.f31900C = bVar;
            C18349h hVar7 = bVar.f31861a;
            if ((((hVar7 instanceof C18847e) || (hVar7 instanceof C18836a) || (hVar7 instanceof C18841c) || (hVar7 instanceof C18639d)) ? 1 : i) != 0) {
                C14325m mVar = this.f31901D;
                long b = j2 != -9223372036854775807L ? this.f31919u.mo46958b(j2) : this.f39831g;
                if (mVar.f31972W != b) {
                    mVar.f31972W = b;
                    C14325m.C14328c[] cVarArr = mVar.f31995v;
                    int length2 = cVarArr.length;
                    for (int i9 = i; i9 < length2; i9++) {
                        C14325m.C14328c cVar = cVarArr[i9];
                        if (cVar.f32280G != b) {
                            cVar.f32280G = b;
                            cVar.f32274A = true;
                        }
                    }
                }
            } else {
                C14325m mVar2 = this.f31901D;
                if (mVar2.f31972W != 0) {
                    mVar2.f31972W = 0;
                    C14325m.C14328c[] cVarArr2 = mVar2.f31995v;
                    int length3 = cVarArr2.length;
                    for (int i10 = i; i10 < length3; i10++) {
                        C14325m.C14328c cVar2 = cVarArr2[i10];
                        if (cVar2.f32280G != 0) {
                            cVar2.f32280G = 0;
                            cVar2.f32274A = true;
                        }
                    }
                }
            }
            this.f31901D.f31997x.clear();
            ((C14309b) this.f31900C).f31861a.mo47758b(this.f31901D);
        } else {
            i = 0;
        }
        C14325m mVar3 = this.f31901D;
        DrmInitData drmInitData = this.f31922x;
        if (!C14049b0.m21628a(mVar3.f31973X, drmInitData)) {
            mVar3.f31973X = drmInitData;
            int i11 = i;
            while (true) {
                C14325m.C14328c[] cVarArr3 = mVar3.f31995v;
                if (i11 >= cVarArr3.length) {
                    break;
                }
                if (mVar3.f31965O[i11]) {
                    C14325m.C14328c cVar3 = cVarArr3[i11];
                    cVar3.f32009J = drmInitData;
                    cVar3.f32274A = true;
                }
                i11++;
            }
        }
        return eVar;
    }
}
