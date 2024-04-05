package androidx.compose.p015ui.graphics.painter;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.graphics.C1546t;
import androidx.compose.p015ui.graphics.C1604x;
import kotlin.jvm.internal.C19383o;
import p173m.C7279a;
import p174m0.C7287g;
import p174m0.C7290i;
import p288y.C8347f;
import p297z.C8412e;
import p297z.C8413f;

/* renamed from: androidx.compose.ui.graphics.painter.a */
public final class C1541a extends Painter {

    /* renamed from: f */
    public final C1604x f3345f;

    /* renamed from: g */
    public final long f3346g;

    /* renamed from: h */
    public final long f3347h;

    /* renamed from: i */
    public int f3348i = 1;

    /* renamed from: j */
    public final long f3349j;

    /* renamed from: k */
    public float f3350k;

    /* renamed from: l */
    public C1546t f3351l;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0027, code lost:
        r0 = (int) (r2 >> 32);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1541a(androidx.compose.p015ui.graphics.C1604x r9) {
        /*
            r8 = this;
            long r0 = p174m0.C7287g.f16164b
            int r2 = r9.getWidth()
            int r3 = r9.getHeight()
            long r2 = androidx.compose.foundation.layout.C0761x.m1707a(r2, r3)
            r8.<init>()
            r8.f3345f = r9
            r8.f3346g = r0
            r8.f3347h = r2
            r4 = 1
            r8.f3348i = r4
            r5 = 32
            long r6 = r0 >> r5
            int r6 = (int) r6
            if (r6 < 0) goto L_0x0043
            int r0 = p174m0.C7287g.m13992b(r0)
            if (r0 < 0) goto L_0x0043
            long r0 = r2 >> r5
            int r0 = (int) r0
            if (r0 < 0) goto L_0x0043
            int r1 = p174m0.C7290i.m13995b(r2)
            if (r1 < 0) goto L_0x0043
            int r1 = r9.getWidth()
            if (r0 > r1) goto L_0x0043
            int r0 = p174m0.C7290i.m13995b(r2)
            int r9 = r9.getHeight()
            if (r0 > r9) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r4 = 0
        L_0x0044:
            if (r4 == 0) goto L_0x004d
            r8.f3349j = r2
            r9 = 1065353216(0x3f800000, float:1.0)
            r8.f3350k = r9
            return
        L_0x004d:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.graphics.painter.C1541a.<init>(androidx.compose.ui.graphics.x):void");
    }

    /* renamed from: a */
    public final boolean mo6388a(float f) {
        this.f3350k = f;
        return true;
    }

    /* renamed from: b */
    public final boolean mo6389b(C1546t tVar) {
        this.f3351l = tVar;
        return true;
    }

    /* renamed from: c */
    public final long mo6390c() {
        return C0761x.m1698V0(this.f3349j);
    }

    /* renamed from: d */
    public final void mo6391d(C8412e eVar) {
        C8412e eVar2 = eVar;
        C19383o.m32797g(eVar2, "<this>");
        C8412e.m16786S(eVar2, this.f3345f, this.f3346g, this.f3347h, 0, C0761x.m1707a(C7279a.m13954l(C8347f.m16656d(eVar.mo6913b())), C7279a.m13954l(C8347f.m16654b(eVar.mo6913b()))), this.f3350k, (C8413f) null, this.f3351l, 0, this.f3348i, 328);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1541a)) {
            return false;
        }
        C1541a aVar = (C1541a) obj;
        if (!C19383o.m32792b(this.f3345f, aVar.f3345f)) {
            return false;
        }
        long j = this.f3346g;
        long j2 = aVar.f3346g;
        int i = C7287g.f16165c;
        if (!(j == j2) || !C7290i.m13994a(this.f3347h, aVar.f3347h)) {
            return false;
        }
        return this.f3348i == aVar.f3348i;
    }

    public final int hashCode() {
        long j = this.f3346g;
        int i = C7287g.f16165c;
        return Integer.hashCode(this.f3348i) + C0071c.m190b(this.f3347h, C0071c.m190b(j, this.f3345f.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String str;
        StringBuilder h = C0072d.m201h("BitmapPainter(image=");
        h.append(this.f3345f);
        h.append(", srcOffset=");
        h.append(C7287g.m13993c(this.f3346g));
        h.append(", srcSize=");
        h.append(C7290i.m13996c(this.f3347h));
        h.append(", filterQuality=");
        int i = this.f3348i;
        boolean z = false;
        if (i == 0) {
            str = "None";
        } else {
            if (i == 1) {
                str = "Low";
            } else {
                if (i == 2) {
                    str = "Medium";
                } else {
                    if (i == 3) {
                        z = true;
                    }
                    str = z ? "High" : "Unknown";
                }
            }
        }
        h.append(str);
        h.append(')');
        return h.toString();
    }
}
