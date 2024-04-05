package p653qh;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import p513bj.C14049b0;
import p513bj.C14075p;
import p644ph.C18345d;
import p644ph.C18346e;
import p644ph.C18349h;
import p644ph.C18350i;
import p644ph.C18351j;
import p644ph.C18363s;
import p644ph.C18364t;
import p644ph.C18368v;

/* renamed from: qh.a */
public final class C18449a implements C18349h {

    /* renamed from: m */
    public static final int[] f40580m = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: n */
    public static final int[] f40581n;

    /* renamed from: o */
    public static final byte[] f40582o = C14049b0.m21652y("#!AMR\n");

    /* renamed from: p */
    public static final byte[] f40583p = C14049b0.m21652y("#!AMR-WB\n");

    /* renamed from: q */
    public static final int f40584q;

    /* renamed from: a */
    public final byte[] f40585a = new byte[1];

    /* renamed from: b */
    public boolean f40586b;

    /* renamed from: c */
    public long f40587c;

    /* renamed from: d */
    public int f40588d;

    /* renamed from: e */
    public int f40589e;

    /* renamed from: f */
    public boolean f40590f;

    /* renamed from: g */
    public int f40591g = -1;

    /* renamed from: h */
    public long f40592h;

    /* renamed from: i */
    public C18351j f40593i;

    /* renamed from: j */
    public C18368v f40594j;

    /* renamed from: k */
    public C18364t.C18366b f40595k;

    /* renamed from: l */
    public boolean f40596l;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f40581n = iArr;
        f40584q = iArr[8];
    }

    /* renamed from: a */
    public final int mo47757a(C18350i iVar, C18363s sVar) throws IOException {
        C14075p.m21696h(this.f40594j);
        int i = C14049b0.f30913a;
        C18346e eVar = (C18346e) iVar;
        if (eVar.f40294d != 0 || mo69972e(eVar)) {
            if (!this.f40596l) {
                this.f40596l = true;
                boolean z = this.f40586b;
                String str = z ? "audio/amr-wb" : "audio/3gpp";
                int i2 = z ? 16000 : 8000;
                C18368v vVar = this.f40594j;
                Format.C14176b bVar = new Format.C14176b();
                bVar.f31303k = str;
                bVar.f31304l = f40584q;
                bVar.f31316x = 1;
                bVar.f31317y = i2;
                vVar.mo47752a(bVar.mo47144a());
            }
            int i3 = -1;
            if (this.f40589e == 0) {
                try {
                    int d = mo69971d((C18346e) iVar);
                    this.f40588d = d;
                    this.f40589e = d;
                    if (this.f40591g == -1) {
                        this.f40591g = d;
                    }
                } catch (EOFException unused) {
                }
            }
            int e = this.f40594j.mo69900e(iVar, this.f40589e, true);
            if (e != -1) {
                int i4 = this.f40589e - e;
                this.f40589e = i4;
                i3 = 0;
                if (i4 <= 0) {
                    this.f40594j.mo47754c(this.f40587c + this.f40592h, 1, this.f40588d, 0, (C18368v.C18369a) null);
                    this.f40587c += 20000;
                }
            }
            if (!this.f40590f) {
                C18364t.C18366b bVar2 = new C18364t.C18366b(-9223372036854775807L);
                this.f40595k = bVar2;
                this.f40593i.mo4162l(bVar2);
                this.f40590f = true;
            }
            return i3;
        }
        throw new ParserException("Could not find AMR header.");
    }

    /* renamed from: b */
    public final void mo47758b(C18351j jVar) {
        this.f40593i = jVar;
        this.f40594j = jVar.mo4164r(0, 1);
        jVar.mo4163p();
    }

    /* renamed from: c */
    public final void mo47759c(long j, long j2) {
        this.f40587c = 0;
        this.f40588d = 0;
        this.f40589e = 0;
        if (j != 0) {
            C18364t.C18366b bVar = this.f40595k;
            if (bVar instanceof C18345d) {
                C18345d dVar = (C18345d) bVar;
                this.f40592h = ((Math.max(0, j - dVar.f40286b) * 8) * 1000000) / ((long) dVar.f40289e);
                return;
            }
        }
        this.f40592h = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        if ((!r1 && (r5 < 12 || r5 > 14)) != false) goto L_0x003a;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo69971d(p644ph.C18346e r5) throws java.io.IOException {
        /*
            r4 = this;
            r0 = 0
            r5.f40296f = r0
            byte[] r1 = r4.f40585a
            r2 = 1
            r5.mo69872c(r1, r0, r2, r0)
            byte[] r5 = r4.f40585a
            byte r5 = r5[r0]
            r1 = r5 & 131(0x83, float:1.84E-43)
            if (r1 > 0) goto L_0x0079
            int r5 = r5 >> 3
            r1 = 15
            r5 = r5 & r1
            if (r5 < 0) goto L_0x003b
            if (r5 > r1) goto L_0x003b
            boolean r1 = r4.f40586b
            if (r1 == 0) goto L_0x0028
            r3 = 10
            if (r5 < r3) goto L_0x0026
            r3 = 13
            if (r5 <= r3) goto L_0x0028
        L_0x0026:
            r3 = r2
            goto L_0x0029
        L_0x0028:
            r3 = r0
        L_0x0029:
            if (r3 != 0) goto L_0x003a
            if (r1 != 0) goto L_0x0037
            r1 = 12
            if (r5 < r1) goto L_0x0035
            r1 = 14
            if (r5 <= r1) goto L_0x0037
        L_0x0035:
            r1 = r2
            goto L_0x0038
        L_0x0037:
            r1 = r0
        L_0x0038:
            if (r1 == 0) goto L_0x003b
        L_0x003a:
            r0 = r2
        L_0x003b:
            if (r0 != 0) goto L_0x006b
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            boolean r1 = r4.f40586b
            if (r1 == 0) goto L_0x0046
            java.lang.String r1 = "WB"
            goto L_0x0048
        L_0x0046:
            java.lang.String r1 = "NB"
        L_0x0048:
            int r2 = r1.length()
            int r2 = r2 + 35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Illegal AMR "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = " frame type "
            r3.append(r1)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r0.<init>((java.lang.String) r5)
            throw r0
        L_0x006b:
            boolean r0 = r4.f40586b
            if (r0 == 0) goto L_0x0074
            int[] r0 = f40581n
            r5 = r0[r5]
            goto L_0x0078
        L_0x0074:
            int[] r0 = f40580m
            r5 = r0[r5]
        L_0x0078:
            return r5
        L_0x0079:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            r1 = 42
            java.lang.String r2 = "Invalid padding bits for frame header "
            java.lang.String r5 = android.support.p013v4.media.C0072d.m200g(r1, r2, r5)
            r0.<init>((java.lang.String) r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p653qh.C18449a.mo69971d(ph.e):int");
    }

    /* renamed from: e */
    public final boolean mo69972e(C18346e eVar) throws IOException {
        byte[] bArr = f40582o;
        eVar.f40296f = 0;
        byte[] bArr2 = new byte[bArr.length];
        eVar.mo69872c(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f40586b = false;
            eVar.mo69879j(bArr.length);
            return true;
        }
        byte[] bArr3 = f40583p;
        eVar.f40296f = 0;
        byte[] bArr4 = new byte[bArr3.length];
        eVar.mo69872c(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f40586b = true;
        eVar.mo69879j(bArr3.length);
        return true;
    }

    /* renamed from: f */
    public final boolean mo47761f(C18350i iVar) throws IOException {
        return mo69972e((C18346e) iVar);
    }

    public final void release() {
    }
}
