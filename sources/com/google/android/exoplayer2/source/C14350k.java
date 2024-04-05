package com.google.android.exoplayer2.source;

import androidx.appcompat.app.C0164l;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.C14304h;
import com.google.android.exoplayer2.trackselection.C14386b;
import com.google.android.gms.measurement.internal.C15099u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import p513bj.C14075p;
import p594jh.C17918h1;
import p594jh.C17948m0;
import p595ji.C18000l;

/* renamed from: com.google.android.exoplayer2.source.k */
public final class C14350k implements C14304h, C14304h.C14305a {

    /* renamed from: b */
    public final C14304h[] f32167b;

    /* renamed from: c */
    public final IdentityHashMap<C18000l, Integer> f32168c;

    /* renamed from: d */
    public final C15099u f32169d;

    /* renamed from: e */
    public final ArrayList<C14304h> f32170e = new ArrayList<>();

    /* renamed from: f */
    public C14304h.C14305a f32171f;

    /* renamed from: g */
    public TrackGroupArray f32172g;

    /* renamed from: h */
    public C14304h[] f32173h;

    /* renamed from: i */
    public C0164l f32174i;

    /* renamed from: com.google.android.exoplayer2.source.k$a */
    public static final class C14351a implements C14304h, C14304h.C14305a {

        /* renamed from: b */
        public final C14304h f32175b;

        /* renamed from: c */
        public final long f32176c;

        /* renamed from: d */
        public C14304h.C14305a f32177d;

        public C14351a(C14304h hVar, long j) {
            this.f32175b = hVar;
            this.f32176c = j;
        }

        /* renamed from: a */
        public final boolean mo1409a() {
            return this.f32175b.mo1409a();
        }

        /* renamed from: b */
        public final long mo1410b() {
            long b = this.f32175b.mo1410b();
            if (b == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f32176c + b;
        }

        /* renamed from: c */
        public final boolean mo1411c(long j) {
            return this.f32175b.mo1411c(j - this.f32176c);
        }

        /* renamed from: d */
        public final long mo1412d() {
            long d = this.f32175b.mo1412d();
            if (d == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f32176c + d;
        }

        /* renamed from: e */
        public final void mo1413e(long j) {
            this.f32175b.mo1413e(j - this.f32176c);
        }

        /* renamed from: f */
        public final long mo47669f(C14386b[] bVarArr, boolean[] zArr, C18000l[] lVarArr, boolean[] zArr2, long j) {
            C18000l[] lVarArr2 = lVarArr;
            C18000l[] lVarArr3 = new C18000l[lVarArr2.length];
            int i = 0;
            while (true) {
                C18000l lVar = null;
                if (i >= lVarArr2.length) {
                    break;
                }
                C14352b bVar = (C14352b) lVarArr2[i];
                if (bVar != null) {
                    lVar = bVar.f32178b;
                }
                lVarArr3[i] = lVar;
                i++;
            }
            long f = this.f32175b.mo47669f(bVarArr, zArr, lVarArr3, zArr2, j - this.f32176c);
            for (int i2 = 0; i2 < lVarArr2.length; i2++) {
                C18000l lVar2 = lVarArr3[i2];
                if (lVar2 == null) {
                    lVarArr2[i2] = null;
                } else {
                    C18000l lVar3 = lVarArr2[i2];
                    if (lVar3 == null || ((C14352b) lVar3).f32178b != lVar2) {
                        lVarArr2[i2] = new C14352b(lVar2, this.f32176c);
                    }
                }
            }
            return f + this.f32176c;
        }

        /* renamed from: i */
        public final long mo47671i(long j) {
            return this.f32175b.mo47671i(j - this.f32176c) + this.f32176c;
        }

        /* renamed from: j */
        public final long mo47672j() {
            long j = this.f32175b.mo47672j();
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f32176c + j;
        }

        /* renamed from: k */
        public final void mo47673k(C14304h.C14305a aVar, long j) {
            this.f32177d = aVar;
            this.f32175b.mo47673k(this, j - this.f32176c);
        }

        /* renamed from: l */
        public final void mo47674l(C14372q qVar) {
            C14304h hVar = (C14304h) qVar;
            C14304h.C14305a aVar = this.f32177d;
            aVar.getClass();
            aVar.mo47674l(this);
        }

        /* renamed from: m */
        public final void mo47675m(C14304h hVar) {
            C14304h.C14305a aVar = this.f32177d;
            aVar.getClass();
            aVar.mo47675m(this);
        }

        /* renamed from: o */
        public final void mo47676o() throws IOException {
            this.f32175b.mo47676o();
        }

        /* renamed from: q */
        public final TrackGroupArray mo47677q() {
            return this.f32175b.mo47677q();
        }

        /* renamed from: t */
        public final void mo47678t(long j, boolean z) {
            this.f32175b.mo47678t(j - this.f32176c, z);
        }

        /* renamed from: u */
        public final long mo47679u(long j, C17918h1 h1Var) {
            return this.f32175b.mo47679u(j - this.f32176c, h1Var) + this.f32176c;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.k$b */
    public static final class C14352b implements C18000l {

        /* renamed from: b */
        public final C18000l f32178b;

        /* renamed from: c */
        public final long f32179c;

        public C14352b(C18000l lVar, long j) {
            this.f32178b = lVar;
            this.f32179c = j;
        }

        /* renamed from: c */
        public final void mo47680c() throws IOException {
            this.f32178b.mo47680c();
        }

        /* renamed from: f */
        public final int mo47681f(long j) {
            return this.f32178b.mo47681f(j - this.f32179c);
        }

        public final boolean isReady() {
            return this.f32178b.isReady();
        }

        /* renamed from: j */
        public final int mo47683j(C17948m0 m0Var, DecoderInputBuffer decoderInputBuffer, int i) {
            int j = this.f32178b.mo47683j(m0Var, decoderInputBuffer, i);
            if (j == -4) {
                decoderInputBuffer.f31495f = Math.max(0, decoderInputBuffer.f31495f + this.f32179c);
            }
            return j;
        }
    }

    public C14350k(C15099u uVar, long[] jArr, C14304h... hVarArr) {
        this.f32169d = uVar;
        this.f32167b = hVarArr;
        uVar.getClass();
        this.f32174i = new C0164l((Object) new C14372q[0]);
        this.f32168c = new IdentityHashMap<>();
        this.f32173h = new C14304h[0];
        for (int i = 0; i < hVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.f32167b[i] = new C14351a(hVarArr[i], j);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo1409a() {
        return this.f32174i.mo1409a();
    }

    /* renamed from: b */
    public final long mo1410b() {
        return this.f32174i.mo1410b();
    }

    /* renamed from: c */
    public final boolean mo1411c(long j) {
        if (this.f32170e.isEmpty()) {
            return this.f32174i.mo1411c(j);
        }
        int size = this.f32170e.size();
        for (int i = 0; i < size; i++) {
            this.f32170e.get(i).mo1411c(j);
        }
        return false;
    }

    /* renamed from: d */
    public final long mo1412d() {
        return this.f32174i.mo1412d();
    }

    /* renamed from: e */
    public final void mo1413e(long j) {
        this.f32174i.mo1413e(j);
    }

    /* renamed from: f */
    public final long mo47669f(C14386b[] bVarArr, boolean[] zArr, C18000l[] lVarArr, boolean[] zArr2, long j) {
        C14386b[] bVarArr2 = bVarArr;
        C18000l[] lVarArr2 = lVarArr;
        int[] iArr = new int[bVarArr2.length];
        int[] iArr2 = new int[bVarArr2.length];
        for (int i = 0; i < bVarArr2.length; i++) {
            C18000l lVar = lVarArr2[i];
            Integer num = lVar == null ? null : this.f32168c.get(lVar);
            iArr[i] = num == null ? -1 : num.intValue();
            iArr2[i] = -1;
            C14386b bVar = bVarArr2[i];
            if (bVar != null) {
                TrackGroup h = bVar.mo70315h();
                int i2 = 0;
                while (true) {
                    C14304h[] hVarArr = this.f32167b;
                    if (i2 >= hVarArr.length) {
                        break;
                    } else if (hVarArr[i2].mo47677q().indexOf(h) != -1) {
                        iArr2[i] = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        this.f32168c.clear();
        int length = bVarArr2.length;
        C18000l[] lVarArr3 = new C18000l[length];
        C18000l[] lVarArr4 = new C18000l[bVarArr2.length];
        C14386b[] bVarArr3 = new C14386b[bVarArr2.length];
        ArrayList arrayList = new ArrayList(this.f32167b.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.f32167b.length) {
            for (int i4 = 0; i4 < bVarArr2.length; i4++) {
                lVarArr4[i4] = iArr[i4] == i3 ? lVarArr2[i4] : null;
                bVarArr3[i4] = iArr2[i4] == i3 ? bVarArr2[i4] : null;
            }
            int i5 = i3;
            ArrayList arrayList2 = arrayList;
            C14386b[] bVarArr4 = bVarArr3;
            long f = this.f32167b[i3].mo47669f(bVarArr3, zArr, lVarArr4, zArr2, j2);
            if (i5 == 0) {
                j2 = f;
            } else if (f != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < bVarArr2.length; i6++) {
                boolean z2 = true;
                if (iArr2[i6] == i5) {
                    C18000l lVar2 = lVarArr4[i6];
                    lVar2.getClass();
                    lVarArr3[i6] = lVarArr4[i6];
                    this.f32168c.put(lVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    if (lVarArr4[i6] != null) {
                        z2 = false;
                    }
                    C14075p.m21694f(z2);
                }
            }
            if (z) {
                arrayList2.add(this.f32167b[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            bVarArr3 = bVarArr4;
        }
        System.arraycopy(lVarArr3, 0, lVarArr2, 0, length);
        C14304h[] hVarArr2 = (C14304h[]) arrayList.toArray(new C14304h[0]);
        this.f32173h = hVarArr2;
        this.f32169d.getClass();
        this.f32174i = new C0164l((Object) hVarArr2);
        return j2;
    }

    /* renamed from: i */
    public final long mo47671i(long j) {
        long i = this.f32173h[0].mo47671i(j);
        int i2 = 1;
        while (true) {
            C14304h[] hVarArr = this.f32173h;
            if (i2 >= hVarArr.length) {
                return i;
            }
            if (hVarArr[i2].mo47671i(i) == i) {
                i2++;
            } else {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
    }

    /* renamed from: j */
    public final long mo47672j() {
        long j = -9223372036854775807L;
        for (C14304h hVar : this.f32173h) {
            long j2 = hVar.mo47672j();
            if (j2 != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    C14304h[] hVarArr = this.f32173h;
                    int length = hVarArr.length;
                    int i = 0;
                    while (i < length) {
                        C14304h hVar2 = hVarArr[i];
                        if (hVar2 == hVar) {
                            break;
                        } else if (hVar2.mo47671i(j2) == j2) {
                            i++;
                        } else {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = j2;
                } else if (j2 != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (!(j == -9223372036854775807L || hVar.mo47671i(j) == j)) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    /* renamed from: k */
    public final void mo47673k(C14304h.C14305a aVar, long j) {
        this.f32171f = aVar;
        Collections.addAll(this.f32170e, this.f32167b);
        for (C14304h k : this.f32167b) {
            k.mo47673k(this, j);
        }
    }

    /* renamed from: l */
    public final void mo47674l(C14372q qVar) {
        C14304h hVar = (C14304h) qVar;
        C14304h.C14305a aVar = this.f32171f;
        aVar.getClass();
        aVar.mo47674l(this);
    }

    /* renamed from: m */
    public final void mo47675m(C14304h hVar) {
        this.f32170e.remove(hVar);
        if (this.f32170e.isEmpty()) {
            int i = 0;
            for (C14304h q : this.f32167b) {
                i += q.mo47677q().length;
            }
            TrackGroup[] trackGroupArr = new TrackGroup[i];
            int i2 = 0;
            for (C14304h q2 : this.f32167b) {
                TrackGroupArray q3 = q2.mo47677q();
                int i3 = q3.length;
                int i4 = 0;
                while (i4 < i3) {
                    trackGroupArr[i2] = q3.get(i4);
                    i4++;
                    i2++;
                }
            }
            this.f32172g = new TrackGroupArray(trackGroupArr);
            C14304h.C14305a aVar = this.f32171f;
            aVar.getClass();
            aVar.mo47675m(this);
        }
    }

    /* renamed from: o */
    public final void mo47676o() throws IOException {
        for (C14304h o : this.f32167b) {
            o.mo47676o();
        }
    }

    /* renamed from: q */
    public final TrackGroupArray mo47677q() {
        TrackGroupArray trackGroupArray = this.f32172g;
        trackGroupArray.getClass();
        return trackGroupArray;
    }

    /* renamed from: t */
    public final void mo47678t(long j, boolean z) {
        for (C14304h t : this.f32173h) {
            t.mo47678t(j, z);
        }
    }

    /* renamed from: u */
    public final long mo47679u(long j, C17918h1 h1Var) {
        C14304h[] hVarArr = this.f32173h;
        return (hVarArr.length > 0 ? hVarArr[0] : this.f32167b[0]).mo47679u(j, h1Var);
    }
}
