package p677th;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import java.io.IOException;
import p513bj.C14077r;
import p644ph.C18346e;
import p644ph.C18349h;
import p644ph.C18350i;
import p644ph.C18351j;
import p644ph.C18364t;
import p644ph.C18368v;
import p701wh.C18685h;

/* renamed from: th.a */
public final class C18544a implements C18349h {

    /* renamed from: a */
    public final C14077r f40809a = new C14077r(6);

    /* renamed from: b */
    public C18351j f40810b;

    /* renamed from: c */
    public int f40811c;

    /* renamed from: d */
    public int f40812d;

    /* renamed from: e */
    public int f40813e;

    /* renamed from: f */
    public long f40814f = -1;

    /* renamed from: g */
    public MotionPhotoMetadata f40815g;

    /* renamed from: h */
    public C18350i f40816h;

    /* renamed from: i */
    public C18547c f40817i;

    /* renamed from: j */
    public C18685h f40818j;

    /* JADX WARNING: Removed duplicated region for block: B:99:0x0183  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo47757a(p644ph.C18350i r25, p644ph.C18363s r26) throws java.io.IOException {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            int r3 = r0.f40811c
            r4 = 1
            r5 = 0
            r6 = -1
            r8 = 4
            r9 = 2
            if (r3 == 0) goto L_0x01ac
            if (r3 == r4) goto L_0x0192
            r10 = -1
            if (r3 == r9) goto L_0x00aa
            r6 = 5
            if (r3 == r8) goto L_0x004e
            if (r3 == r6) goto L_0x0024
            r1 = 6
            if (r3 != r1) goto L_0x001e
            return r10
        L_0x001e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0024:
            th.c r3 = r0.f40817i
            if (r3 == 0) goto L_0x002c
            ph.i r3 = r0.f40816h
            if (r1 == r3) goto L_0x0039
        L_0x002c:
            r0.f40816h = r1
            th.c r3 = new th.c
            long r5 = r0.f40814f
            ph.e r1 = (p644ph.C18346e) r1
            r3.<init>(r1, r5)
            r0.f40817i = r3
        L_0x0039:
            wh.h r1 = r0.f40818j
            r1.getClass()
            th.c r3 = r0.f40817i
            int r1 = r1.mo47757a(r3, r2)
            if (r1 != r4) goto L_0x004d
            long r3 = r2.f40327a
            long r5 = r0.f40814f
            long r3 = r3 + r5
            r2.f40327a = r3
        L_0x004d:
            return r1
        L_0x004e:
            ph.e r1 = (p644ph.C18346e) r1
            long r7 = r1.f40294d
            long r9 = r0.f40814f
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x005b
            r2.f40327a = r9
            return r4
        L_0x005b:
            bj.r r2 = r0.f40809a
            byte[] r2 = r2.f30986a
            boolean r2 = r1.mo69872c(r2, r5, r4, r4)
            if (r2 != 0) goto L_0x0069
            r24.mo70062d()
            goto L_0x00a9
        L_0x0069:
            r1.f40296f = r5
            wh.h r2 = r0.f40818j
            if (r2 != 0) goto L_0x0076
            wh.h r2 = new wh.h
            r2.<init>()
            r0.f40818j = r2
        L_0x0076:
            th.c r2 = new th.c
            long r7 = r0.f40814f
            r2.<init>(r1, r7)
            r0.f40817i = r2
            wh.h r1 = r0.f40818j
            boolean r1 = r1.mo47761f(r2)
            if (r1 == 0) goto L_0x00a6
            wh.h r1 = r0.f40818j
            th.d r2 = new th.d
            long r7 = r0.f40814f
            ph.j r3 = r0.f40810b
            r3.getClass()
            r2.<init>(r7, r3)
            r1.f41379r = r2
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r1 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r4]
            com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata r2 = r0.f40815g
            r2.getClass()
            r1[r5] = r2
            r0.mo70063e(r1)
            r0.f40811c = r6
            goto L_0x00a9
        L_0x00a6:
            r24.mo70062d()
        L_0x00a9:
            return r5
        L_0x00aa:
            int r2 = r0.f40812d
            r3 = 65505(0xffe1, float:9.1792E-41)
            if (r2 != r3) goto L_0x0188
            int r2 = r0.f40813e
            byte[] r3 = new byte[r2]
            ph.e r1 = (p644ph.C18346e) r1
            r1.mo69874g(r3, r5, r2, r5)
            com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata r4 = r0.f40815g
            if (r4 != 0) goto L_0x018f
            int r4 = r2 + 0
            if (r4 != 0) goto L_0x00c5
            r4 = r5
            r11 = 0
            goto L_0x00d9
        L_0x00c5:
            r4 = r5
        L_0x00c6:
            if (r4 >= r2) goto L_0x00cf
            byte r11 = r3[r4]
            if (r11 == 0) goto L_0x00cf
            int r4 = r4 + 1
            goto L_0x00c6
        L_0x00cf:
            int r11 = r4 + 0
            java.lang.String r11 = p513bj.C14049b0.m21641n(r5, r11, r3)
            if (r4 >= r2) goto L_0x00d9
            int r4 = r4 + 1
        L_0x00d9:
            java.lang.String r12 = "http://ns.adobe.com/xap/1.0/"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x018f
            int r11 = r2 - r4
            if (r11 != 0) goto L_0x00e7
            r2 = 0
            goto L_0x00f6
        L_0x00e7:
            r11 = r4
        L_0x00e8:
            if (r11 >= r2) goto L_0x00f1
            byte r12 = r3[r11]
            if (r12 == 0) goto L_0x00f1
            int r11 = r11 + 1
            goto L_0x00e8
        L_0x00f1:
            int r11 = r11 - r4
            java.lang.String r2 = p513bj.C14049b0.m21641n(r4, r11, r3)
        L_0x00f6:
            if (r2 == 0) goto L_0x018f
            long r3 = r1.f40293c
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0100
            goto L_0x017e
        L_0x0100:
            th.b r1 = p677th.C18550e.m31302a(r2)     // Catch:{ ParserException | NumberFormatException | XmlPullParserException -> 0x0105 }
            goto L_0x010d
        L_0x0105:
            java.lang.String r1 = "MotionPhotoXmpParser"
            java.lang.String r2 = "Ignoring unexpected XMP metadata"
            android.util.Log.w(r1, r2)
            r1 = 0
        L_0x010d:
            if (r1 != 0) goto L_0x0111
            goto L_0x017e
        L_0x0111:
            java.util.List<th.b$a> r2 = r1.f40820b
            int r2 = r2.size()
            if (r2 >= r9) goto L_0x011b
            goto L_0x017e
        L_0x011b:
            java.util.List<th.b$a> r2 = r1.f40820b
            int r2 = r2.size()
            int r2 = r2 + r10
            r9 = r5
            r10 = r6
            r12 = r10
            r16 = r12
            r18 = r16
        L_0x0129:
            if (r2 < 0) goto L_0x0164
            java.util.List<th.b$a> r14 = r1.f40820b
            java.lang.Object r14 = r14.get(r2)
            th.b$a r14 = (p677th.C18545b.C18546a) r14
            java.lang.String r15 = r14.f40821a
            java.lang.String r8 = "video/mp4"
            boolean r8 = r8.equals(r15)
            r8 = r8 | r9
            if (r2 != 0) goto L_0x0147
            r20 = 0
            long r14 = r14.f40823c
            long r3 = r3 - r14
            r14 = r3
            r3 = r20
            goto L_0x0150
        L_0x0147:
            long r14 = r14.f40822b
            long r14 = r3 - r14
            r22 = r3
            r3 = r14
            r14 = r22
        L_0x0150:
            if (r8 == 0) goto L_0x015c
            int r9 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x015c
            long r18 = r14 - r3
            r16 = r3
            r9 = r5
            goto L_0x015d
        L_0x015c:
            r9 = r8
        L_0x015d:
            if (r2 != 0) goto L_0x0161
            r10 = r3
            r12 = r14
        L_0x0161:
            int r2 = r2 + -1
            goto L_0x0129
        L_0x0164:
            int r2 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x017e
            int r2 = (r18 > r6 ? 1 : (r18 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x017e
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x017e
            int r2 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0175
            goto L_0x017e
        L_0x0175:
            com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata r8 = new com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata
            long r14 = r1.f40819a
            r9 = r8
            r9.<init>(r10, r12, r14, r16, r18)
            goto L_0x017f
        L_0x017e:
            r8 = 0
        L_0x017f:
            r0.f40815g = r8
            if (r8 == 0) goto L_0x018f
            long r1 = r8.videoStartPosition
            r0.f40814f = r1
            goto L_0x018f
        L_0x0188:
            int r2 = r0.f40813e
            ph.e r1 = (p644ph.C18346e) r1
            r1.mo69879j(r2)
        L_0x018f:
            r0.f40811c = r5
            return r5
        L_0x0192:
            bj.r r2 = r0.f40809a
            r2.mo46932w(r9)
            bj.r r2 = r0.f40809a
            byte[] r2 = r2.f30986a
            ph.e r1 = (p644ph.C18346e) r1
            r1.mo69874g(r2, r5, r9, r5)
            bj.r r1 = r0.f40809a
            int r1 = r1.mo46930u()
            int r1 = r1 - r9
            r0.f40813e = r1
            r0.f40811c = r9
            return r5
        L_0x01ac:
            bj.r r2 = r0.f40809a
            r2.mo46932w(r9)
            bj.r r2 = r0.f40809a
            byte[] r2 = r2.f30986a
            ph.e r1 = (p644ph.C18346e) r1
            r1.mo69874g(r2, r5, r9, r5)
            bj.r r1 = r0.f40809a
            int r1 = r1.mo46930u()
            r0.f40812d = r1
            r2 = 65498(0xffda, float:9.1782E-41)
            if (r1 != r2) goto L_0x01d4
            long r1 = r0.f40814f
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x01d0
            r0.f40811c = r8
            goto L_0x01e5
        L_0x01d0:
            r24.mo70062d()
            goto L_0x01e5
        L_0x01d4:
            r2 = 65488(0xffd0, float:9.1768E-41)
            if (r1 < r2) goto L_0x01de
            r2 = 65497(0xffd9, float:9.1781E-41)
            if (r1 <= r2) goto L_0x01e5
        L_0x01de:
            r2 = 65281(0xff01, float:9.1478E-41)
            if (r1 == r2) goto L_0x01e5
            r0.f40811c = r4
        L_0x01e5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p677th.C18544a.mo47757a(ph.i, ph.s):int");
    }

    /* renamed from: b */
    public final void mo47758b(C18351j jVar) {
        this.f40810b = jVar;
    }

    /* renamed from: c */
    public final void mo47759c(long j, long j2) {
        if (j == 0) {
            this.f40811c = 0;
            this.f40818j = null;
        } else if (this.f40811c == 5) {
            C18685h hVar = this.f40818j;
            hVar.getClass();
            hVar.mo47759c(j, j2);
        }
    }

    /* renamed from: d */
    public final void mo70062d() {
        mo70063e(new Metadata.Entry[0]);
        C18351j jVar = this.f40810b;
        jVar.getClass();
        jVar.mo4163p();
        this.f40810b.mo4162l(new C18364t.C18366b(-9223372036854775807L));
        this.f40811c = 6;
    }

    /* renamed from: e */
    public final void mo70063e(Metadata.Entry... entryArr) {
        C18351j jVar = this.f40810b;
        jVar.getClass();
        C18368v r = jVar.mo4164r(RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE, 4);
        Format.C14176b bVar = new Format.C14176b();
        bVar.f31301i = new Metadata(entryArr);
        r.mo47752a(bVar.mo47144a());
    }

    /* renamed from: f */
    public final boolean mo47761f(C18350i iVar) throws IOException {
        C18346e eVar = (C18346e) iVar;
        if (mo70064g(eVar) != 65496) {
            return false;
        }
        int g = mo70064g(eVar);
        this.f40812d = g;
        if (g == 65504) {
            this.f40809a.mo46932w(2);
            eVar.mo69872c(this.f40809a.f30986a, 0, 2, false);
            eVar.mo69880k(this.f40809a.mo46930u() - 2, false);
            this.f40812d = mo70064g(eVar);
        }
        if (this.f40812d != 65505) {
            return false;
        }
        eVar.mo69880k(2, false);
        this.f40809a.mo46932w(6);
        eVar.mo69872c(this.f40809a.f30986a, 0, 6, false);
        return this.f40809a.mo46926q() == 1165519206 && this.f40809a.mo46930u() == 0;
    }

    /* renamed from: g */
    public final int mo70064g(C18346e eVar) throws IOException {
        this.f40809a.mo46932w(2);
        eVar.mo69872c(this.f40809a.f30986a, 0, 2, false);
        return this.f40809a.mo46930u();
    }

    public final void release() {
        C18685h hVar = this.f40818j;
        if (hVar != null) {
            hVar.getClass();
        }
    }
}
