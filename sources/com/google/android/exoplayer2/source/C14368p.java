package com.google.android.exoplayer2.source;

import android.os.Looper;
import android.util.SparseArray;
import androidx.room.C3221c;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.C14216b;
import com.google.android.exoplayer2.drm.C14219c;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.source.C14366o;
import java.io.EOFException;
import java.io.IOException;
import p505aj.C13990a;
import p505aj.C13997e;
import p505aj.C14003j;
import p513bj.C14049b0;
import p513bj.C14065m;
import p513bj.C14075p;
import p513bj.C14077r;
import p594jh.C17948m0;
import p595ji.C18004o;
import p644ph.C18368v;

/* renamed from: com.google.android.exoplayer2.source.p */
public class C14368p implements C18368v {

    /* renamed from: A */
    public boolean f32274A;

    /* renamed from: B */
    public Format f32275B;

    /* renamed from: C */
    public Format f32276C;

    /* renamed from: D */
    public int f32277D;

    /* renamed from: E */
    public boolean f32278E;

    /* renamed from: F */
    public boolean f32279F;

    /* renamed from: G */
    public long f32280G;

    /* renamed from: H */
    public boolean f32281H;

    /* renamed from: a */
    public final C14366o f32282a;

    /* renamed from: b */
    public final C14369a f32283b = new C14369a();

    /* renamed from: c */
    public final C18004o<C14370b> f32284c = new C18004o<>(new C3221c(4));

    /* renamed from: d */
    public final C14219c f32285d;

    /* renamed from: e */
    public final C14216b.C14217a f32286e;

    /* renamed from: f */
    public final Looper f32287f;

    /* renamed from: g */
    public C14371c f32288g;

    /* renamed from: h */
    public Format f32289h;

    /* renamed from: i */
    public DrmSession f32290i;

    /* renamed from: j */
    public int f32291j = 1000;

    /* renamed from: k */
    public int[] f32292k = new int[1000];

    /* renamed from: l */
    public long[] f32293l = new long[1000];

    /* renamed from: m */
    public int[] f32294m = new int[1000];

    /* renamed from: n */
    public int[] f32295n = new int[1000];

    /* renamed from: o */
    public long[] f32296o = new long[1000];

    /* renamed from: p */
    public C18368v.C18369a[] f32297p = new C18368v.C18369a[1000];

    /* renamed from: q */
    public int f32298q;

    /* renamed from: r */
    public int f32299r;

    /* renamed from: s */
    public int f32300s;

    /* renamed from: t */
    public int f32301t;

    /* renamed from: u */
    public long f32302u = Long.MIN_VALUE;

    /* renamed from: v */
    public long f32303v = Long.MIN_VALUE;

    /* renamed from: w */
    public long f32304w = Long.MIN_VALUE;

    /* renamed from: x */
    public boolean f32305x;

    /* renamed from: y */
    public boolean f32306y = true;

    /* renamed from: z */
    public boolean f32307z = true;

    /* renamed from: com.google.android.exoplayer2.source.p$a */
    public static final class C14369a {

        /* renamed from: a */
        public int f32308a;

        /* renamed from: b */
        public long f32309b;

        /* renamed from: c */
        public C18368v.C18369a f32310c;
    }

    /* renamed from: com.google.android.exoplayer2.source.p$b */
    public static final class C14370b {

        /* renamed from: a */
        public final Format f32311a;

        /* renamed from: b */
        public final C14219c.C14221b f32312b;

        public C14370b(Format format, C14219c.C14221b bVar) {
            this.f32311a = format;
            this.f32312b = bVar;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.p$c */
    public interface C14371c {
        /* renamed from: s */
        void mo47748s();
    }

    public C14368p(C14003j jVar, Looper looper, C14219c cVar, C14216b.C14217a aVar) {
        this.f32287f = looper;
        this.f32285d = cVar;
        this.f32286e = aVar;
        this.f32282a = new C14366o(jVar);
    }

    /* renamed from: a */
    public final void mo47752a(Format format) {
        Format l = mo47756l(format);
        boolean z = false;
        this.f32274A = false;
        this.f32275B = format;
        synchronized (this) {
            this.f32307z = false;
            if (!C14049b0.m21628a(l, this.f32276C)) {
                if (!(this.f32284c.f39387b.size() == 0)) {
                    SparseArray<V> sparseArray = this.f32284c.f39387b;
                    if (((C14370b) sparseArray.valueAt(sparseArray.size() - 1)).f32311a.equals(l)) {
                        SparseArray<V> sparseArray2 = this.f32284c.f39387b;
                        this.f32276C = ((C14370b) sparseArray2.valueAt(sparseArray2.size() - 1)).f32311a;
                        Format format2 = this.f32276C;
                        this.f32278E = C14065m.m21671a(format2.sampleMimeType, format2.codecs);
                        this.f32279F = false;
                        z = true;
                    }
                }
                this.f32276C = l;
                Format format22 = this.f32276C;
                this.f32278E = C14065m.m21671a(format22.sampleMimeType, format22.codecs);
                this.f32279F = false;
                z = true;
            }
        }
        C14371c cVar = this.f32288g;
        if (cVar != null && z) {
            cVar.mo47748s();
        }
    }

    /* renamed from: b */
    public final int mo47753b(C13997e eVar, int i, boolean z) throws IOException {
        C14366o oVar = this.f32282a;
        int c = oVar.mo47840c(i);
        C14366o.C14367a aVar = oVar.f32267f;
        C13990a aVar2 = aVar.f32272d;
        int read = eVar.read(aVar2.f30751a, ((int) (oVar.f32268g - aVar.f32269a)) + aVar2.f30752b, c);
        if (read != -1) {
            long j = oVar.f32268g + ((long) read);
            oVar.f32268g = j;
            C14366o.C14367a aVar3 = oVar.f32267f;
            if (j != aVar3.f32270b) {
                return read;
            }
            oVar.f32267f = aVar3.f32273e;
            return read;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: c */
    public void mo47754c(long r17, int r19, int r20, int r21, p644ph.C18368v.C18369a r22) {
        /*
            r16 = this;
            r1 = r16
            r0 = r20
            boolean r2 = r1.f32274A
            if (r2 == 0) goto L_0x0010
            com.google.android.exoplayer2.Format r2 = r1.f32275B
            p513bj.C14075p.m21696h(r2)
            r1.mo47752a(r2)
        L_0x0010:
            r2 = r19 & 1
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0018
            r5 = r4
            goto L_0x0019
        L_0x0018:
            r5 = r3
        L_0x0019:
            boolean r6 = r1.f32306y
            if (r6 == 0) goto L_0x0022
            if (r5 != 0) goto L_0x0020
            return
        L_0x0020:
            r1.f32306y = r3
        L_0x0022:
            long r6 = r1.f32280G
            long r6 = r17 + r6
            boolean r8 = r1.f32278E
            if (r8 == 0) goto L_0x005e
            long r8 = r1.f32302u
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x0031
            return
        L_0x0031:
            if (r2 != 0) goto L_0x005e
            boolean r2 = r1.f32279F
            if (r2 != 0) goto L_0x005b
            java.lang.String r2 = "SampleQueue"
            com.google.android.exoplayer2.Format r8 = r1.f32276C
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r9 = r8.length()
            int r9 = r9 + 50
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r9)
            java.lang.String r9 = "Overriding unexpected non-sync sample for format: "
            r10.append(r9)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            android.util.Log.w(r2, r8)
            r1.f32279F = r4
        L_0x005b:
            r2 = r19 | 1
            goto L_0x0060
        L_0x005e:
            r2 = r19
        L_0x0060:
            boolean r8 = r1.f32281H
            r9 = -1
            if (r8 == 0) goto L_0x00bf
            if (r5 == 0) goto L_0x00be
            monitor-enter(r16)
            int r5 = r1.f32298q     // Catch:{ all -> 0x00bb }
            if (r5 != 0) goto L_0x0077
            long r10 = r1.f32303v     // Catch:{ all -> 0x00bb }
            int r5 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x0074
            r5 = r4
            goto L_0x0075
        L_0x0074:
            r5 = r3
        L_0x0075:
            monitor-exit(r16)
            goto L_0x00b2
        L_0x0077:
            monitor-enter(r16)     // Catch:{ all -> 0x00bb }
            long r10 = r1.f32303v     // Catch:{ all -> 0x00b8 }
            int r5 = r1.f32301t     // Catch:{ all -> 0x00b8 }
            long r12 = r1.mo47846m(r5)     // Catch:{ all -> 0x00b8 }
            long r10 = java.lang.Math.max(r10, r12)     // Catch:{ all -> 0x00b8 }
            monitor-exit(r16)     // Catch:{ all -> 0x00bb }
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x008c
            monitor-exit(r16)
            r5 = r3
            goto L_0x00b2
        L_0x008c:
            int r5 = r1.f32298q     // Catch:{ all -> 0x00bb }
            int r8 = r5 + -1
            int r8 = r1.mo47847n(r8)     // Catch:{ all -> 0x00bb }
        L_0x0094:
            int r10 = r1.f32301t     // Catch:{ all -> 0x00bb }
            if (r5 <= r10) goto L_0x00aa
            long[] r10 = r1.f32296o     // Catch:{ all -> 0x00bb }
            r11 = r10[r8]     // Catch:{ all -> 0x00bb }
            int r10 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r10 < 0) goto L_0x00aa
            int r5 = r5 + -1
            int r8 = r8 + -1
            if (r8 != r9) goto L_0x0094
            int r8 = r1.f32291j     // Catch:{ all -> 0x00bb }
            int r8 = r8 + r9
            goto L_0x0094
        L_0x00aa:
            int r8 = r1.f32299r     // Catch:{ all -> 0x00bb }
            int r8 = r8 + r5
            r1.mo47844j(r8)     // Catch:{ all -> 0x00bb }
            monitor-exit(r16)
            r5 = r4
        L_0x00b2:
            if (r5 != 0) goto L_0x00b5
            goto L_0x00be
        L_0x00b5:
            r1.f32281H = r3
            goto L_0x00bf
        L_0x00b8:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x00bb }
            throw r0     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        L_0x00be:
            return
        L_0x00bf:
            com.google.android.exoplayer2.source.o r5 = r1.f32282a
            long r10 = r5.f32268g
            long r12 = (long) r0
            long r10 = r10 - r12
            r5 = r21
            long r12 = (long) r5
            long r10 = r10 - r12
            monitor-enter(r16)
            int r5 = r1.f32298q     // Catch:{ all -> 0x01dd }
            if (r5 <= 0) goto L_0x00e7
            int r5 = r5 - r4
            int r5 = r1.mo47847n(r5)     // Catch:{ all -> 0x01dd }
            long[] r8 = r1.f32293l     // Catch:{ all -> 0x01dd }
            r12 = r8[r5]     // Catch:{ all -> 0x01dd }
            int[] r8 = r1.f32294m     // Catch:{ all -> 0x01dd }
            r5 = r8[r5]     // Catch:{ all -> 0x01dd }
            long r14 = (long) r5     // Catch:{ all -> 0x01dd }
            long r12 = r12 + r14
            int r5 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r5 > 0) goto L_0x00e3
            r5 = r4
            goto L_0x00e4
        L_0x00e3:
            r5 = r3
        L_0x00e4:
            p513bj.C14075p.m21691c(r5)     // Catch:{ all -> 0x01dd }
        L_0x00e7:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r5 & r2
            if (r5 == 0) goto L_0x00ee
            r5 = r4
            goto L_0x00ef
        L_0x00ee:
            r5 = r3
        L_0x00ef:
            r1.f32305x = r5     // Catch:{ all -> 0x01dd }
            long r12 = r1.f32304w     // Catch:{ all -> 0x01dd }
            long r12 = java.lang.Math.max(r12, r6)     // Catch:{ all -> 0x01dd }
            r1.f32304w = r12     // Catch:{ all -> 0x01dd }
            int r5 = r1.f32298q     // Catch:{ all -> 0x01dd }
            int r5 = r1.mo47847n(r5)     // Catch:{ all -> 0x01dd }
            long[] r8 = r1.f32296o     // Catch:{ all -> 0x01dd }
            r8[r5] = r6     // Catch:{ all -> 0x01dd }
            long[] r6 = r1.f32293l     // Catch:{ all -> 0x01dd }
            r6[r5] = r10     // Catch:{ all -> 0x01dd }
            int[] r6 = r1.f32294m     // Catch:{ all -> 0x01dd }
            r6[r5] = r0     // Catch:{ all -> 0x01dd }
            int[] r0 = r1.f32295n     // Catch:{ all -> 0x01dd }
            r0[r5] = r2     // Catch:{ all -> 0x01dd }
            ph.v$a[] r0 = r1.f32297p     // Catch:{ all -> 0x01dd }
            r0[r5] = r22     // Catch:{ all -> 0x01dd }
            int[] r0 = r1.f32292k     // Catch:{ all -> 0x01dd }
            int r2 = r1.f32277D     // Catch:{ all -> 0x01dd }
            r0[r5] = r2     // Catch:{ all -> 0x01dd }
            ji.o<com.google.android.exoplayer2.source.p$b> r0 = r1.f32284c     // Catch:{ all -> 0x01dd }
            android.util.SparseArray<V> r0 = r0.f39387b     // Catch:{ all -> 0x01dd }
            int r0 = r0.size()     // Catch:{ all -> 0x01dd }
            if (r0 != 0) goto L_0x0125
            r0 = r4
            goto L_0x0126
        L_0x0125:
            r0 = r3
        L_0x0126:
            if (r0 != 0) goto L_0x0141
            ji.o<com.google.android.exoplayer2.source.p$b> r0 = r1.f32284c     // Catch:{ all -> 0x01dd }
            android.util.SparseArray<V> r0 = r0.f39387b     // Catch:{ all -> 0x01dd }
            int r2 = r0.size()     // Catch:{ all -> 0x01dd }
            int r2 = r2 + r9
            java.lang.Object r0 = r0.valueAt(r2)     // Catch:{ all -> 0x01dd }
            com.google.android.exoplayer2.source.p$b r0 = (com.google.android.exoplayer2.source.C14368p.C14370b) r0     // Catch:{ all -> 0x01dd }
            com.google.android.exoplayer2.Format r0 = r0.f32311a     // Catch:{ all -> 0x01dd }
            com.google.android.exoplayer2.Format r2 = r1.f32276C     // Catch:{ all -> 0x01dd }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x01dd }
            if (r0 != 0) goto L_0x0169
        L_0x0141:
            com.google.android.exoplayer2.drm.c r0 = r1.f32285d     // Catch:{ all -> 0x01dd }
            if (r0 == 0) goto L_0x0153
            android.os.Looper r2 = r1.f32287f     // Catch:{ all -> 0x01dd }
            r2.getClass()     // Catch:{ all -> 0x01dd }
            com.google.android.exoplayer2.drm.b$a r5 = r1.f32286e     // Catch:{ all -> 0x01dd }
            com.google.android.exoplayer2.Format r6 = r1.f32276C     // Catch:{ all -> 0x01dd }
            com.google.android.exoplayer2.drm.c$b r0 = r0.mo47289b(r2, r5, r6)     // Catch:{ all -> 0x01dd }
            goto L_0x0155
        L_0x0153:
            a9.b r0 = com.google.android.exoplayer2.drm.C14219c.C14221b.f31570e0     // Catch:{ all -> 0x01dd }
        L_0x0155:
            ji.o<com.google.android.exoplayer2.source.p$b> r2 = r1.f32284c     // Catch:{ all -> 0x01dd }
            int r5 = r1.f32299r     // Catch:{ all -> 0x01dd }
            int r6 = r1.f32298q     // Catch:{ all -> 0x01dd }
            int r5 = r5 + r6
            com.google.android.exoplayer2.source.p$b r6 = new com.google.android.exoplayer2.source.p$b     // Catch:{ all -> 0x01dd }
            com.google.android.exoplayer2.Format r7 = r1.f32276C     // Catch:{ all -> 0x01dd }
            r7.getClass()     // Catch:{ all -> 0x01dd }
            r6.<init>(r7, r0)     // Catch:{ all -> 0x01dd }
            r2.mo69574a(r5, r6)     // Catch:{ all -> 0x01dd }
        L_0x0169:
            int r0 = r1.f32298q     // Catch:{ all -> 0x01dd }
            int r0 = r0 + r4
            r1.f32298q = r0     // Catch:{ all -> 0x01dd }
            int r2 = r1.f32291j     // Catch:{ all -> 0x01dd }
            if (r0 != r2) goto L_0x01db
            int r0 = r2 + 1000
            int[] r4 = new int[r0]     // Catch:{ all -> 0x01dd }
            long[] r5 = new long[r0]     // Catch:{ all -> 0x01dd }
            long[] r6 = new long[r0]     // Catch:{ all -> 0x01dd }
            int[] r7 = new int[r0]     // Catch:{ all -> 0x01dd }
            int[] r8 = new int[r0]     // Catch:{ all -> 0x01dd }
            ph.v$a[] r9 = new p644ph.C18368v.C18369a[r0]     // Catch:{ all -> 0x01dd }
            int r10 = r1.f32300s     // Catch:{ all -> 0x01dd }
            int r2 = r2 - r10
            long[] r11 = r1.f32293l     // Catch:{ all -> 0x01dd }
            java.lang.System.arraycopy(r11, r10, r5, r3, r2)     // Catch:{ all -> 0x01dd }
            long[] r10 = r1.f32296o     // Catch:{ all -> 0x01dd }
            int r11 = r1.f32300s     // Catch:{ all -> 0x01dd }
            java.lang.System.arraycopy(r10, r11, r6, r3, r2)     // Catch:{ all -> 0x01dd }
            int[] r10 = r1.f32295n     // Catch:{ all -> 0x01dd }
            int r11 = r1.f32300s     // Catch:{ all -> 0x01dd }
            java.lang.System.arraycopy(r10, r11, r7, r3, r2)     // Catch:{ all -> 0x01dd }
            int[] r10 = r1.f32294m     // Catch:{ all -> 0x01dd }
            int r11 = r1.f32300s     // Catch:{ all -> 0x01dd }
            java.lang.System.arraycopy(r10, r11, r8, r3, r2)     // Catch:{ all -> 0x01dd }
            ph.v$a[] r10 = r1.f32297p     // Catch:{ all -> 0x01dd }
            int r11 = r1.f32300s     // Catch:{ all -> 0x01dd }
            java.lang.System.arraycopy(r10, r11, r9, r3, r2)     // Catch:{ all -> 0x01dd }
            int[] r10 = r1.f32292k     // Catch:{ all -> 0x01dd }
            int r11 = r1.f32300s     // Catch:{ all -> 0x01dd }
            java.lang.System.arraycopy(r10, r11, r4, r3, r2)     // Catch:{ all -> 0x01dd }
            int r10 = r1.f32300s     // Catch:{ all -> 0x01dd }
            long[] r11 = r1.f32293l     // Catch:{ all -> 0x01dd }
            java.lang.System.arraycopy(r11, r3, r5, r2, r10)     // Catch:{ all -> 0x01dd }
            long[] r11 = r1.f32296o     // Catch:{ all -> 0x01dd }
            java.lang.System.arraycopy(r11, r3, r6, r2, r10)     // Catch:{ all -> 0x01dd }
            int[] r11 = r1.f32295n     // Catch:{ all -> 0x01dd }
            java.lang.System.arraycopy(r11, r3, r7, r2, r10)     // Catch:{ all -> 0x01dd }
            int[] r11 = r1.f32294m     // Catch:{ all -> 0x01dd }
            java.lang.System.arraycopy(r11, r3, r8, r2, r10)     // Catch:{ all -> 0x01dd }
            ph.v$a[] r11 = r1.f32297p     // Catch:{ all -> 0x01dd }
            java.lang.System.arraycopy(r11, r3, r9, r2, r10)     // Catch:{ all -> 0x01dd }
            int[] r11 = r1.f32292k     // Catch:{ all -> 0x01dd }
            java.lang.System.arraycopy(r11, r3, r4, r2, r10)     // Catch:{ all -> 0x01dd }
            r1.f32293l = r5     // Catch:{ all -> 0x01dd }
            r1.f32296o = r6     // Catch:{ all -> 0x01dd }
            r1.f32295n = r7     // Catch:{ all -> 0x01dd }
            r1.f32294m = r8     // Catch:{ all -> 0x01dd }
            r1.f32297p = r9     // Catch:{ all -> 0x01dd }
            r1.f32292k = r4     // Catch:{ all -> 0x01dd }
            r1.f32300s = r3     // Catch:{ all -> 0x01dd }
            r1.f32291j = r0     // Catch:{ all -> 0x01dd }
        L_0x01db:
            monitor-exit(r16)
            return
        L_0x01dd:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C14368p.mo47754c(long, int, int, int, ph.v$a):void");
    }

    /* renamed from: f */
    public final void mo47755f(C14077r rVar, int i) {
        C14366o oVar = this.f32282a;
        while (i > 0) {
            int c = oVar.mo47840c(i);
            C14366o.C14367a aVar = oVar.f32267f;
            C13990a aVar2 = aVar.f32272d;
            rVar.mo46911b(((int) (oVar.f32268g - aVar.f32269a)) + aVar2.f30752b, c, aVar2.f30751a);
            i -= c;
            long j = oVar.f32268g + ((long) c);
            oVar.f32268g = j;
            C14366o.C14367a aVar3 = oVar.f32267f;
            if (j == aVar3.f32270b) {
                oVar.f32267f = aVar3.f32273e;
            }
        }
        oVar.getClass();
    }

    /* renamed from: g */
    public final long mo47841g(int i) {
        this.f32303v = Math.max(this.f32303v, mo47846m(i));
        this.f32298q -= i;
        int i2 = this.f32299r + i;
        this.f32299r = i2;
        int i3 = this.f32300s + i;
        this.f32300s = i3;
        int i4 = this.f32291j;
        if (i3 >= i4) {
            this.f32300s = i3 - i4;
        }
        int i5 = this.f32301t - i;
        this.f32301t = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.f32301t = 0;
        }
        C18004o<C14370b> oVar = this.f32284c;
        while (i6 < oVar.f39387b.size() - 1) {
            int i7 = i6 + 1;
            if (i2 < oVar.f39387b.keyAt(i7)) {
                break;
            }
            oVar.f39388c.accept(oVar.f39387b.valueAt(i6));
            oVar.f39387b.removeAt(i6);
            int i8 = oVar.f39386a;
            if (i8 > 0) {
                oVar.f39386a = i8 - 1;
            }
            i6 = i7;
        }
        if (this.f32298q != 0) {
            return this.f32293l[this.f32300s];
        }
        int i9 = this.f32300s;
        if (i9 == 0) {
            i9 = this.f32291j;
        }
        int i10 = i9 - 1;
        return this.f32293l[i10] + ((long) this.f32294m[i10]);
    }

    /* renamed from: h */
    public final void mo47842h(long j, boolean z, boolean z2) {
        long j2;
        int i;
        C14366o oVar = this.f32282a;
        synchronized (this) {
            int i2 = this.f32298q;
            j2 = -1;
            if (i2 != 0) {
                long[] jArr = this.f32296o;
                int i3 = this.f32300s;
                if (j >= jArr[i3]) {
                    if (z2 && (i = this.f32301t) != i2) {
                        i2 = i + 1;
                    }
                    int k = mo47845k(i3, i2, j, z);
                    if (k != -1) {
                        j2 = mo47841g(k);
                    }
                }
            }
        }
        oVar.mo47839b(j2);
    }

    /* renamed from: i */
    public final void mo47843i() {
        long g;
        C14366o oVar = this.f32282a;
        synchronized (this) {
            int i = this.f32298q;
            g = i == 0 ? -1 : mo47841g(i);
        }
        oVar.mo47839b(g);
    }

    /* renamed from: j */
    public final long mo47844j(int i) {
        int i2 = this.f32299r;
        int i3 = this.f32298q;
        int i4 = (i2 + i3) - i;
        boolean z = false;
        C14075p.m21691c(i4 >= 0 && i4 <= i3 - this.f32301t);
        int i5 = this.f32298q - i4;
        this.f32298q = i5;
        this.f32304w = Math.max(this.f32303v, mo47846m(i5));
        if (i4 == 0 && this.f32305x) {
            z = true;
        }
        this.f32305x = z;
        C18004o<C14370b> oVar = this.f32284c;
        int i6 = -1;
        int size = oVar.f39387b.size() - 1;
        while (size >= 0 && i < oVar.f39387b.keyAt(size)) {
            oVar.f39388c.accept(oVar.f39387b.valueAt(size));
            oVar.f39387b.removeAt(size);
            size--;
        }
        if (oVar.f39387b.size() > 0) {
            i6 = Math.min(oVar.f39386a, oVar.f39387b.size() - 1);
        }
        oVar.f39386a = i6;
        int i7 = this.f32298q;
        if (i7 == 0) {
            return 0;
        }
        int n = mo47847n(i7 - 1);
        return this.f32293l[n] + ((long) this.f32294m[n]);
    }

    /* renamed from: k */
    public final int mo47845k(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.f32296o[i];
            if (j2 > j) {
                return i3;
            }
            if (!z || (this.f32295n[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.f32291j) {
                i = 0;
            }
        }
        return i3;
    }

    /* renamed from: l */
    public Format mo47756l(Format format) {
        if (this.f32280G == 0 || format.subsampleOffsetUs == Long.MAX_VALUE) {
            return format;
        }
        Format.C14176b buildUpon = format.buildUpon();
        buildUpon.f31307o = format.subsampleOffsetUs + this.f32280G;
        return buildUpon.mo47144a();
    }

    /* renamed from: m */
    public final long mo47846m(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int n = mo47847n(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.f32296o[n]);
            if ((this.f32295n[n] & 1) != 0) {
                break;
            }
            n--;
            if (n == -1) {
                n = this.f32291j - 1;
            }
        }
        return j;
    }

    /* renamed from: n */
    public final int mo47847n(int i) {
        int i2 = this.f32300s + i;
        int i3 = this.f32291j;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0038, code lost:
        return 0;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo47848o(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.f32301t     // Catch:{ all -> 0x0039 }
            int r2 = r8.mo47847n(r0)     // Catch:{ all -> 0x0039 }
            int r0 = r8.f32301t     // Catch:{ all -> 0x0039 }
            int r1 = r8.f32298q     // Catch:{ all -> 0x0039 }
            r7 = 0
            if (r0 == r1) goto L_0x0010
            r3 = 1
            goto L_0x0011
        L_0x0010:
            r3 = r7
        L_0x0011:
            if (r3 == 0) goto L_0x0037
            long[] r3 = r8.f32296o     // Catch:{ all -> 0x0039 }
            r4 = r3[r2]     // Catch:{ all -> 0x0039 }
            int r3 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x001c
            goto L_0x0037
        L_0x001c:
            long r3 = r8.f32304w     // Catch:{ all -> 0x0039 }
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0027
            if (r11 == 0) goto L_0x0027
            int r1 = r1 - r0
            monitor-exit(r8)
            return r1
        L_0x0027:
            int r3 = r1 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r9 = r1.mo47845k(r2, r3, r4, r6)     // Catch:{ all -> 0x0039 }
            r10 = -1
            if (r9 != r10) goto L_0x0035
            monitor-exit(r8)
            return r7
        L_0x0035:
            monitor-exit(r8)
            return r9
        L_0x0037:
            monitor-exit(r8)
            return r7
        L_0x0039:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C14368p.mo47848o(long, boolean):int");
    }

    /* renamed from: p */
    public final synchronized Format mo47849p() {
        return this.f32307z ? null : this.f32276C;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001f, code lost:
        return r2;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo47850q(boolean r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f32301t     // Catch:{ all -> 0x003f }
            int r1 = r4.f32298q     // Catch:{ all -> 0x003f }
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x000b
            r1 = r2
            goto L_0x000c
        L_0x000b:
            r1 = r3
        L_0x000c:
            if (r1 != 0) goto L_0x0020
            if (r5 != 0) goto L_0x001e
            boolean r5 = r4.f32305x     // Catch:{ all -> 0x003f }
            if (r5 != 0) goto L_0x001e
            com.google.android.exoplayer2.Format r5 = r4.f32276C     // Catch:{ all -> 0x003f }
            if (r5 == 0) goto L_0x001d
            com.google.android.exoplayer2.Format r0 = r4.f32289h     // Catch:{ all -> 0x003f }
            if (r5 == r0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r2 = r3
        L_0x001e:
            monitor-exit(r4)
            return r2
        L_0x0020:
            ji.o<com.google.android.exoplayer2.source.p$b> r5 = r4.f32284c     // Catch:{ all -> 0x003f }
            int r1 = r4.f32299r     // Catch:{ all -> 0x003f }
            int r1 = r1 + r0
            java.lang.Object r5 = r5.mo69575b(r1)     // Catch:{ all -> 0x003f }
            com.google.android.exoplayer2.source.p$b r5 = (com.google.android.exoplayer2.source.C14368p.C14370b) r5     // Catch:{ all -> 0x003f }
            com.google.android.exoplayer2.Format r5 = r5.f32311a     // Catch:{ all -> 0x003f }
            com.google.android.exoplayer2.Format r0 = r4.f32289h     // Catch:{ all -> 0x003f }
            if (r5 == r0) goto L_0x0033
            monitor-exit(r4)
            return r2
        L_0x0033:
            int r5 = r4.f32301t     // Catch:{ all -> 0x003f }
            int r5 = r4.mo47847n(r5)     // Catch:{ all -> 0x003f }
            boolean r5 = r4.mo47851r(r5)     // Catch:{ all -> 0x003f }
            monitor-exit(r4)
            return r5
        L_0x003f:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C14368p.mo47850q(boolean):boolean");
    }

    /* renamed from: r */
    public final boolean mo47851r(int i) {
        DrmSession drmSession = this.f32290i;
        return drmSession == null || drmSession.getState() == 4 || ((this.f32295n[i] & 1073741824) == 0 && this.f32290i.mo47276d());
    }

    /* renamed from: s */
    public final void mo47852s(Format format, C17948m0 m0Var) {
        Format format2 = this.f32289h;
        boolean z = format2 == null;
        DrmInitData drmInitData = z ? null : format2.drmInitData;
        this.f32289h = format;
        DrmInitData drmInitData2 = format.drmInitData;
        C14219c cVar = this.f32285d;
        m0Var.f39134b = cVar != null ? format.copyWithExoMediaCryptoType(cVar.mo47290c(format)) : format;
        m0Var.f39133a = this.f32290i;
        if (this.f32285d != null) {
            if (z || !C14049b0.m21628a(drmInitData, drmInitData2)) {
                DrmSession drmSession = this.f32290i;
                C14219c cVar2 = this.f32285d;
                Looper looper = this.f32287f;
                looper.getClass();
                DrmSession a = cVar2.mo47288a(looper, this.f32286e, format);
                this.f32290i = a;
                m0Var.f39133a = a;
                if (drmSession != null) {
                    drmSession.mo47274b(this.f32286e);
                }
            }
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:25:0x0035=Splitter:B:25:0x0035, B:46:0x008a=Splitter:B:46:0x008a} */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo47853t(p594jh.C17948m0 r11, com.google.android.exoplayer2.decoder.DecoderInputBuffer r12, int r13, boolean r14) {
        /*
            r10 = this;
            r0 = r13 & 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0008
            r0 = r2
            goto L_0x0009
        L_0x0008:
            r0 = r1
        L_0x0009:
            com.google.android.exoplayer2.source.p$a r3 = r10.f32283b
            monitor-enter(r10)
            r12.f31494e = r1     // Catch:{ all -> 0x00c3 }
            int r4 = r10.f32301t     // Catch:{ all -> 0x00c3 }
            int r5 = r10.f32298q     // Catch:{ all -> 0x00c3 }
            if (r4 == r5) goto L_0x0016
            r5 = r2
            goto L_0x0017
        L_0x0016:
            r5 = r1
        L_0x0017:
            r6 = -5
            r7 = -3
            r8 = -4
            r9 = 4
            if (r5 != 0) goto L_0x0039
            if (r14 != 0) goto L_0x0035
            boolean r14 = r10.f32305x     // Catch:{ all -> 0x00c3 }
            if (r14 == 0) goto L_0x0024
            goto L_0x0035
        L_0x0024:
            com.google.android.exoplayer2.Format r14 = r10.f32276C     // Catch:{ all -> 0x00c3 }
            if (r14 == 0) goto L_0x0033
            if (r0 != 0) goto L_0x002e
            com.google.android.exoplayer2.Format r0 = r10.f32289h     // Catch:{ all -> 0x00c3 }
            if (r14 == r0) goto L_0x0033
        L_0x002e:
            r10.mo47852s(r14, r11)     // Catch:{ all -> 0x00c3 }
            monitor-exit(r10)
            goto L_0x008e
        L_0x0033:
            monitor-exit(r10)
            goto L_0x005c
        L_0x0035:
            r12.f39937b = r9     // Catch:{ all -> 0x00c3 }
            monitor-exit(r10)
            goto L_0x0088
        L_0x0039:
            ji.o<com.google.android.exoplayer2.source.p$b> r14 = r10.f32284c     // Catch:{ all -> 0x00c3 }
            int r5 = r10.f32299r     // Catch:{ all -> 0x00c3 }
            int r5 = r5 + r4
            java.lang.Object r14 = r14.mo69575b(r5)     // Catch:{ all -> 0x00c3 }
            com.google.android.exoplayer2.source.p$b r14 = (com.google.android.exoplayer2.source.C14368p.C14370b) r14     // Catch:{ all -> 0x00c3 }
            com.google.android.exoplayer2.Format r14 = r14.f32311a     // Catch:{ all -> 0x00c3 }
            if (r0 != 0) goto L_0x008a
            com.google.android.exoplayer2.Format r0 = r10.f32289h     // Catch:{ all -> 0x00c3 }
            if (r14 == r0) goto L_0x004d
            goto L_0x008a
        L_0x004d:
            int r11 = r10.f32301t     // Catch:{ all -> 0x00c3 }
            int r11 = r10.mo47847n(r11)     // Catch:{ all -> 0x00c3 }
            boolean r14 = r10.mo47851r(r11)     // Catch:{ all -> 0x00c3 }
            if (r14 != 0) goto L_0x005e
            r12.f31494e = r2     // Catch:{ all -> 0x00c3 }
            monitor-exit(r10)
        L_0x005c:
            r6 = r7
            goto L_0x008e
        L_0x005e:
            int[] r14 = r10.f32295n     // Catch:{ all -> 0x00c3 }
            r14 = r14[r11]     // Catch:{ all -> 0x00c3 }
            r12.f39937b = r14     // Catch:{ all -> 0x00c3 }
            long[] r14 = r10.f32296o     // Catch:{ all -> 0x00c3 }
            r4 = r14[r11]     // Catch:{ all -> 0x00c3 }
            r12.f31495f = r4     // Catch:{ all -> 0x00c3 }
            long r6 = r10.f32302u     // Catch:{ all -> 0x00c3 }
            int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r14 >= 0) goto L_0x0075
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r12.mo69760g(r14)     // Catch:{ all -> 0x00c3 }
        L_0x0075:
            int[] r14 = r10.f32294m     // Catch:{ all -> 0x00c3 }
            r14 = r14[r11]     // Catch:{ all -> 0x00c3 }
            r3.f32308a = r14     // Catch:{ all -> 0x00c3 }
            long[] r14 = r10.f32293l     // Catch:{ all -> 0x00c3 }
            r4 = r14[r11]     // Catch:{ all -> 0x00c3 }
            r3.f32309b = r4     // Catch:{ all -> 0x00c3 }
            ph.v$a[] r14 = r10.f32297p     // Catch:{ all -> 0x00c3 }
            r11 = r14[r11]     // Catch:{ all -> 0x00c3 }
            r3.f32310c = r11     // Catch:{ all -> 0x00c3 }
            monitor-exit(r10)
        L_0x0088:
            r6 = r8
            goto L_0x008e
        L_0x008a:
            r10.mo47852s(r14, r11)     // Catch:{ all -> 0x00c3 }
            monitor-exit(r10)
        L_0x008e:
            if (r6 != r8) goto L_0x00c2
            boolean r11 = r12.mo69761h(r9)
            if (r11 != 0) goto L_0x00c2
            r11 = r13 & 1
            if (r11 == 0) goto L_0x009b
            r1 = r2
        L_0x009b:
            r11 = r13 & 4
            if (r11 != 0) goto L_0x00bb
            if (r1 == 0) goto L_0x00ad
            com.google.android.exoplayer2.source.o r11 = r10.f32282a
            com.google.android.exoplayer2.source.p$a r13 = r10.f32283b
            com.google.android.exoplayer2.source.o$a r14 = r11.f32266e
            bj.r r11 = r11.f32264c
            com.google.android.exoplayer2.source.C14366o.m22730f(r14, r12, r13, r11)
            goto L_0x00bb
        L_0x00ad:
            com.google.android.exoplayer2.source.o r11 = r10.f32282a
            com.google.android.exoplayer2.source.p$a r13 = r10.f32283b
            com.google.android.exoplayer2.source.o$a r14 = r11.f32266e
            bj.r r0 = r11.f32264c
            com.google.android.exoplayer2.source.o$a r12 = com.google.android.exoplayer2.source.C14366o.m22730f(r14, r12, r13, r0)
            r11.f32266e = r12
        L_0x00bb:
            if (r1 != 0) goto L_0x00c2
            int r11 = r10.f32301t
            int r11 = r11 + r2
            r10.f32301t = r11
        L_0x00c2:
            return r6
        L_0x00c3:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C14368p.mo47853t(jh.m0, com.google.android.exoplayer2.decoder.DecoderInputBuffer, int, boolean):int");
    }

    /* renamed from: u */
    public final void mo47854u(boolean z) {
        C14366o oVar = this.f32282a;
        oVar.mo47838a(oVar.f32265d);
        C14366o.C14367a aVar = new C14366o.C14367a(0, oVar.f32263b);
        oVar.f32265d = aVar;
        oVar.f32266e = aVar;
        oVar.f32267f = aVar;
        oVar.f32268g = 0;
        oVar.f32262a.mo46824b();
        this.f32298q = 0;
        this.f32299r = 0;
        this.f32300s = 0;
        this.f32301t = 0;
        this.f32306y = true;
        this.f32302u = Long.MIN_VALUE;
        this.f32303v = Long.MIN_VALUE;
        this.f32304w = Long.MIN_VALUE;
        this.f32305x = false;
        C18004o<C14370b> oVar2 = this.f32284c;
        for (int i = 0; i < oVar2.f39387b.size(); i++) {
            oVar2.f39388c.accept(oVar2.f39387b.valueAt(i));
        }
        oVar2.f39386a = -1;
        oVar2.f39387b.clear();
        if (z) {
            this.f32275B = null;
            this.f32276C = null;
            this.f32307z = true;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: v */
    public final synchronized boolean mo47855v(long r11, boolean r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            monitor-enter(r10)     // Catch:{ all -> 0x0046 }
            r0 = 0
            r10.f32301t = r0     // Catch:{ all -> 0x0048 }
            com.google.android.exoplayer2.source.o r1 = r10.f32282a     // Catch:{ all -> 0x0048 }
            com.google.android.exoplayer2.source.o$a r2 = r1.f32265d     // Catch:{ all -> 0x0048 }
            r1.f32266e = r2     // Catch:{ all -> 0x0048 }
            monitor-exit(r10)     // Catch:{ all -> 0x0046 }
            int r4 = r10.mo47847n(r0)     // Catch:{ all -> 0x0046 }
            int r1 = r10.f32301t     // Catch:{ all -> 0x0046 }
            int r2 = r10.f32298q     // Catch:{ all -> 0x0046 }
            r9 = 1
            if (r1 == r2) goto L_0x0019
            r3 = r9
            goto L_0x001a
        L_0x0019:
            r3 = r0
        L_0x001a:
            if (r3 == 0) goto L_0x0044
            long[] r3 = r10.f32296o     // Catch:{ all -> 0x0046 }
            r5 = r3[r4]     // Catch:{ all -> 0x0046 }
            int r3 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x0044
            long r5 = r10.f32304w     // Catch:{ all -> 0x0046 }
            int r3 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x002d
            if (r13 != 0) goto L_0x002d
            goto L_0x0044
        L_0x002d:
            int r5 = r2 - r1
            r8 = 1
            r3 = r10
            r6 = r11
            int r13 = r3.mo47845k(r4, r5, r6, r8)     // Catch:{ all -> 0x0046 }
            r1 = -1
            if (r13 != r1) goto L_0x003b
            monitor-exit(r10)
            return r0
        L_0x003b:
            r10.f32302u = r11     // Catch:{ all -> 0x0046 }
            int r11 = r10.f32301t     // Catch:{ all -> 0x0046 }
            int r11 = r11 + r13
            r10.f32301t = r11     // Catch:{ all -> 0x0046 }
            monitor-exit(r10)
            return r9
        L_0x0044:
            monitor-exit(r10)
            return r0
        L_0x0046:
            r11 = move-exception
            goto L_0x004b
        L_0x0048:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0046 }
            throw r11     // Catch:{ all -> 0x0046 }
        L_0x004b:
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C14368p.mo47855v(long, boolean):boolean");
    }
}
