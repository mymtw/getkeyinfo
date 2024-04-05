package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.hls.playlist.C14338c;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.trackselection.C14386b;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import p241t2.C7949h;
import p505aj.C13999g;
import p505aj.C14002i;
import p505aj.C14014t;
import p513bj.C14049b0;
import p513bj.C14087z;
import p612li.C18185a;
import p612li.C18186b;
import p612li.C18187c;
import p612li.C18189e;
import p718yi.C18883a;

/* renamed from: com.google.android.exoplayer2.source.hls.f */
public final class C14313f {

    /* renamed from: a */
    public final C14320h f31867a;

    /* renamed from: b */
    public final C13999g f31868b;

    /* renamed from: c */
    public final C13999g f31869c;

    /* renamed from: d */
    public final C7949h f31870d;

    /* renamed from: e */
    public final Uri[] f31871e;

    /* renamed from: f */
    public final Format[] f31872f;

    /* renamed from: g */
    public final HlsPlaylistTracker f31873g;

    /* renamed from: h */
    public final TrackGroup f31874h;

    /* renamed from: i */
    public final List<Format> f31875i;

    /* renamed from: j */
    public final C14312e f31876j = new C14312e();

    /* renamed from: k */
    public boolean f31877k;

    /* renamed from: l */
    public byte[] f31878l = C14049b0.f30918f;

    /* renamed from: m */
    public BehindLiveWindowException f31879m;

    /* renamed from: n */
    public Uri f31880n;

    /* renamed from: o */
    public boolean f31881o;

    /* renamed from: p */
    public C14386b f31882p;

    /* renamed from: q */
    public long f31883q = -9223372036854775807L;

    /* renamed from: r */
    public boolean f31884r;

    /* renamed from: com.google.android.exoplayer2.source.hls.f$a */
    public static final class C14314a extends C18187c {

        /* renamed from: l */
        public byte[] f31885l;

        public C14314a(C13999g gVar, C14002i iVar, Format format, int i, Object obj, byte[] bArr) {
            super(gVar, iVar, format, i, obj, bArr);
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.f$b */
    public static final class C14315b {

        /* renamed from: a */
        public C18186b f31886a = null;

        /* renamed from: b */
        public boolean f31887b = false;

        /* renamed from: c */
        public Uri f31888c = null;
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.f$c */
    public static final class C14316c extends C18185a {

        /* renamed from: e */
        public final List<C14338c.C14342d> f31889e;

        /* renamed from: f */
        public final long f31890f;

        public C14316c(long j, List list) {
            super((long) (list.size() - 1));
            this.f31890f = j;
            this.f31889e = list;
        }

        /* renamed from: a */
        public final long mo47721a() {
            long j = this.f39824d;
            if (j >= this.f39822b && j <= this.f39823c) {
                return this.f31890f + this.f31889e.get((int) j).f32149f;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: b */
        public final long mo47722b() {
            long j = this.f39824d;
            if (j < this.f39822b || j > this.f39823c) {
                throw new NoSuchElementException();
            }
            C14338c.C14342d dVar = this.f31889e.get((int) j);
            return this.f31890f + dVar.f32149f + dVar.f32147d;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.f$d */
    public static final class C14317d extends C18883a {

        /* renamed from: g */
        public int f31891g;

        public C14317d(TrackGroup trackGroup, int[] iArr) {
            super(trackGroup, iArr);
            this.f31891g = mo70317l(trackGroup.getFormat(iArr[0]));
        }

        /* renamed from: a */
        public final int mo47723a() {
            return this.f31891g;
        }

        /* renamed from: f */
        public final Object mo47724f() {
            return null;
        }

        /* renamed from: i */
        public final void mo47725i(long j, long j2, List list, C18189e[] eVarArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (mo70319p(this.f31891g, elapsedRealtime)) {
                int i = this.f42058b;
                do {
                    i--;
                    if (i < 0) {
                        throw new IllegalStateException();
                    }
                } while (mo70319p(i, elapsedRealtime));
                this.f31891g = i;
            }
        }

        /* renamed from: o */
        public final int mo47726o() {
            return 0;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.f$e */
    public static final class C14318e {

        /* renamed from: a */
        public final C14338c.C14342d f31892a;

        /* renamed from: b */
        public final long f31893b;

        /* renamed from: c */
        public final int f31894c;

        /* renamed from: d */
        public final boolean f31895d;

        public C14318e(C14338c.C14342d dVar, long j, int i) {
            this.f31892a = dVar;
            this.f31893b = j;
            this.f31894c = i;
            this.f31895d = (dVar instanceof C14338c.C14339a) && ((C14338c.C14339a) dVar).f32140n;
        }
    }

    public C14313f(C14320h hVar, HlsPlaylistTracker hlsPlaylistTracker, Uri[] uriArr, Format[] formatArr, C14319g gVar, C14014t tVar, C7949h hVar2, List<Format> list) {
        this.f31867a = hVar;
        this.f31873g = hlsPlaylistTracker;
        this.f31871e = uriArr;
        this.f31872f = formatArr;
        this.f31870d = hVar2;
        this.f31875i = list;
        C13999g a = gVar.mo47716a();
        this.f31868b = a;
        if (tVar != null) {
            a.mo46806e(tVar);
        }
        this.f31869c = gVar.mo47716a();
        this.f31874h = new TrackGroup(formatArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((formatArr[i].roleFlags & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        this.f31882p = new C14317d(this.f31874h, Ints.m26385c(arrayList));
    }

    /* renamed from: a */
    public final C18189e[] mo47717a(C14321i iVar, long j) {
        List list;
        C14321i iVar2 = iVar;
        int indexOf = iVar2 == null ? -1 : this.f31874h.indexOf(iVar2.f39828d);
        int length = this.f31882p.length();
        C18189e[] eVarArr = new C18189e[length];
        boolean z = false;
        int i = 0;
        while (i < length) {
            int d = this.f31882p.mo70312d(i);
            Uri uri = this.f31871e[d];
            if (!this.f31873g.mo47773j(uri)) {
                eVarArr[i] = C18189e.f39837a;
            } else {
                C14338c i2 = this.f31873g.mo47772i(z, uri);
                i2.getClass();
                long c = i2.f32124g - this.f31873g.mo47768c();
                boolean z2 = d != indexOf ? true : z;
                long j2 = c;
                C14338c cVar = i2;
                Pair<Long, Integer> c2 = mo47719c(iVar, z2, i2, c, j);
                long longValue = ((Long) c2.first).longValue();
                int intValue = ((Integer) c2.second).intValue();
                int i3 = (int) (longValue - cVar.f32127j);
                if (i3 < 0 || cVar.f32134q.size() < i3) {
                    list = ImmutableList.m25826of();
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i3 < cVar.f32134q.size()) {
                        if (intValue != -1) {
                            C14338c.C14341c cVar2 = (C14338c.C14341c) cVar.f32134q.get(i3);
                            if (intValue == 0) {
                                arrayList.add(cVar2);
                            } else if (intValue < cVar2.f32144n.size()) {
                                ImmutableList immutableList = cVar2.f32144n;
                                arrayList.addAll(immutableList.subList(intValue, immutableList.size()));
                            }
                            i3++;
                        }
                        ImmutableList immutableList2 = cVar.f32134q;
                        arrayList.addAll(immutableList2.subList(i3, immutableList2.size()));
                        intValue = 0;
                    }
                    if (cVar.f32130m != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < cVar.f32135r.size()) {
                            ImmutableList immutableList3 = cVar.f32135r;
                            arrayList.addAll(immutableList3.subList(intValue, immutableList3.size()));
                        }
                    }
                    list = Collections.unmodifiableList(arrayList);
                }
                eVarArr[i] = new C14316c(j2, list);
            }
            i++;
            z = false;
        }
        return eVarArr;
    }

    /* renamed from: b */
    public final int mo47718b(C14321i iVar) {
        if (iVar.f31913o == -1) {
            return 1;
        }
        C14338c i = this.f31873g.mo47772i(false, this.f31871e[this.f31874h.indexOf(iVar.f39828d)]);
        i.getClass();
        int i2 = (int) (iVar.f39836j - i.f32127j);
        if (i2 < 0) {
            return 1;
        }
        ImmutableList immutableList = i2 < i.f32134q.size() ? ((C14338c.C14341c) i.f32134q.get(i2)).f32144n : i.f32135r;
        if (iVar.f31913o >= immutableList.size()) {
            return 2;
        }
        C14338c.C14339a aVar = (C14338c.C14339a) immutableList.get(iVar.f31913o);
        if (aVar.f32140n) {
            return 0;
        }
        return C14049b0.m21628a(Uri.parse(C14087z.m21776c(i.f39972a, aVar.f32145b)), iVar.f39826b.f30774a) ? 1 : 2;
    }

    /* renamed from: c */
    public final Pair<Long, Integer> mo47719c(C14321i iVar, boolean z, C14338c cVar, long j, long j2) {
        long j3;
        C14321i iVar2 = iVar;
        C14338c cVar2 = cVar;
        boolean z2 = true;
        int i = -1;
        if (iVar2 == null || z) {
            long j4 = j + cVar2.f32137t;
            long j5 = (iVar2 == null || this.f31881o) ? j2 : iVar2.f39831g;
            if (!cVar2.f32131n && j5 >= j4) {
                return new Pair<>(Long.valueOf(cVar2.f32127j + ((long) cVar2.f32134q.size())), -1);
            }
            long j6 = j5 - j;
            ImmutableList immutableList = cVar2.f32134q;
            Long valueOf = Long.valueOf(j6);
            int i2 = 0;
            if (this.f31873g.mo47774k() && iVar2 != null) {
                z2 = false;
            }
            int c = C14049b0.m21630c(immutableList, valueOf, z2);
            long j7 = ((long) c) + cVar2.f32127j;
            if (c >= 0) {
                C14338c.C14341c cVar3 = (C14338c.C14341c) cVar2.f32134q.get(c);
                ImmutableList immutableList2 = j6 < cVar3.f32149f + cVar3.f32147d ? cVar3.f32144n : cVar2.f32135r;
                while (true) {
                    if (i2 >= immutableList2.size()) {
                        break;
                    }
                    C14338c.C14339a aVar = (C14338c.C14339a) immutableList2.get(i2);
                    if (j6 >= aVar.f32149f + aVar.f32147d) {
                        i2++;
                    } else if (aVar.f32139m) {
                        j7 += immutableList2 == cVar2.f32135r ? 1 : 0;
                        i = i2;
                    }
                }
            }
            return new Pair<>(Long.valueOf(j7), Integer.valueOf(i));
        } else if (!iVar2.f31905H) {
            return new Pair<>(Long.valueOf(iVar2.f39836j), Integer.valueOf(iVar2.f31913o));
        } else {
            if (iVar2.f31913o == -1) {
                long j8 = iVar2.f39836j;
                j3 = -1;
                if (j8 != -1) {
                    j3 = j8 + 1;
                }
            } else {
                j3 = iVar2.f39836j;
            }
            Long valueOf2 = Long.valueOf(j3);
            int i3 = iVar2.f31913o;
            if (i3 != -1) {
                i = i3 + 1;
            }
            return new Pair<>(valueOf2, Integer.valueOf(i));
        }
    }

    /* renamed from: d */
    public final C14314a mo47720d(Uri uri, int i) {
        Uri uri2 = uri;
        if (uri2 == null) {
            return null;
        }
        byte[] remove = this.f31876j.f31866a.remove(uri2);
        if (remove != null) {
            byte[] put = this.f31876j.f31866a.put(uri2, remove);
            return null;
        }
        C14002i iVar = new C14002i(uri, 0, 1, (byte[]) null, Collections.emptyMap(), 0, -1, (String) null, 1, (Object) null);
        return new C14314a(this.f31869c, iVar, this.f31872f[i], this.f31882p.mo47726o(), this.f31882p.mo47724f(), this.f31878l);
    }
}
