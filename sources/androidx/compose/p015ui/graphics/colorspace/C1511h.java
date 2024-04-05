package androidx.compose.p015ui.graphics.colorspace;

import android.support.p013v4.media.C0072d;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.graphics.colorspace.h */
public final class C1511h {

    /* renamed from: a */
    public final double f3278a;

    /* renamed from: b */
    public final double f3279b;

    /* renamed from: c */
    public final double f3280c;

    /* renamed from: d */
    public final double f3281d;

    /* renamed from: e */
    public final double f3282e;

    /* renamed from: f */
    public final double f3283f = ShadowDrawableWrapper.COS_45;

    /* renamed from: g */
    public final double f3284g = ShadowDrawableWrapper.COS_45;

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0062, code lost:
        if ((r6 == com.google.android.material.shadow.ShadowDrawableWrapper.COS_45) == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0093, code lost:
        if ((r6 == com.google.android.material.shadow.ShadowDrawableWrapper.COS_45) != false) goto L_0x0095;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1511h(double r6, double r8, double r10, double r12, double r14) {
        /*
            r5 = this;
            r5.<init>()
            r5.f3278a = r6
            r5.f3279b = r8
            r5.f3280c = r10
            r5.f3281d = r12
            r5.f3282e = r14
            r0 = 0
            r5.f3283f = r0
            r5.f3284g = r0
            boolean r2 = java.lang.Double.isNaN(r8)
            if (r2 != 0) goto L_0x00d7
            boolean r10 = java.lang.Double.isNaN(r10)
            if (r10 != 0) goto L_0x00d7
            boolean r10 = java.lang.Double.isNaN(r12)
            if (r10 != 0) goto L_0x00d7
            boolean r10 = java.lang.Double.isNaN(r14)
            if (r10 != 0) goto L_0x00d7
            boolean r10 = java.lang.Double.isNaN(r0)
            if (r10 != 0) goto L_0x00d7
            boolean r10 = java.lang.Double.isNaN(r0)
            if (r10 != 0) goto L_0x00d7
            boolean r10 = java.lang.Double.isNaN(r6)
            if (r10 != 0) goto L_0x00d7
            int r10 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r10 < 0) goto L_0x00c0
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r2 > 0) goto L_0x00c0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x004f
            r2 = r3
            goto L_0x0050
        L_0x004f:
            r2 = r4
        L_0x0050:
            if (r2 == 0) goto L_0x006d
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0058
            r2 = r3
            goto L_0x0059
        L_0x0058:
            r2 = r4
        L_0x0059:
            if (r2 != 0) goto L_0x0065
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0061
            r2 = r3
            goto L_0x0062
        L_0x0061:
            r2 = r4
        L_0x0062:
            if (r2 != 0) goto L_0x0065
            goto L_0x006d
        L_0x0065:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Parameter a or g is zero, the transfer function is constant"
            r6.<init>(r7)
            throw r6
        L_0x006d:
            int r10 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r10 < 0) goto L_0x0083
            int r10 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r10 != 0) goto L_0x0077
            r10 = r3
            goto L_0x0078
        L_0x0077:
            r10 = r4
        L_0x0078:
            if (r10 != 0) goto L_0x007b
            goto L_0x0083
        L_0x007b:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Parameter c is zero, the transfer function is constant"
            r6.<init>(r7)
            throw r6
        L_0x0083:
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x0089
            r9 = r3
            goto L_0x008a
        L_0x0089:
            r9 = r4
        L_0x008a:
            if (r9 != 0) goto L_0x0095
            int r9 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r9 != 0) goto L_0x0092
            r9 = r3
            goto L_0x0093
        L_0x0092:
            r9 = r4
        L_0x0093:
            if (r9 == 0) goto L_0x009d
        L_0x0095:
            int r9 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r9 != 0) goto L_0x009a
            goto L_0x009b
        L_0x009a:
            r3 = r4
        L_0x009b:
            if (r3 != 0) goto L_0x00b8
        L_0x009d:
            int r9 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r9 < 0) goto L_0x00b0
            if (r8 < 0) goto L_0x00a8
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 < 0) goto L_0x00a8
            return
        L_0x00a8:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "The transfer function must be positive or increasing"
            r6.<init>(r7)
            throw r6
        L_0x00b0:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "The transfer function must be increasing"
            r6.<init>(r7)
            throw r6
        L_0x00b8:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Parameter a or g is zero, and c is zero, the transfer function is constant"
            r6.<init>(r7)
            throw r6
        L_0x00c0:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Parameter d must be in the range [0..1], was "
            r7.append(r8)
            r7.append(r14)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x00d7:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Parameters cannot be NaN"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.graphics.colorspace.C1511h.<init>(double, double, double, double, double):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1511h)) {
            return false;
        }
        C1511h hVar = (C1511h) obj;
        return C19383o.m32792b(Double.valueOf(this.f3278a), Double.valueOf(hVar.f3278a)) && C19383o.m32792b(Double.valueOf(this.f3279b), Double.valueOf(hVar.f3279b)) && C19383o.m32792b(Double.valueOf(this.f3280c), Double.valueOf(hVar.f3280c)) && C19383o.m32792b(Double.valueOf(this.f3281d), Double.valueOf(hVar.f3281d)) && C19383o.m32792b(Double.valueOf(this.f3282e), Double.valueOf(hVar.f3282e)) && C19383o.m32792b(Double.valueOf(this.f3283f), Double.valueOf(hVar.f3283f)) && C19383o.m32792b(Double.valueOf(this.f3284g), Double.valueOf(hVar.f3284g));
    }

    public final int hashCode() {
        int hashCode = Double.hashCode(this.f3279b);
        int hashCode2 = Double.hashCode(this.f3280c);
        int hashCode3 = Double.hashCode(this.f3281d);
        int hashCode4 = Double.hashCode(this.f3282e);
        int hashCode5 = Double.hashCode(this.f3283f);
        return Double.hashCode(this.f3284g) + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (Double.hashCode(this.f3278a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("TransferParameters(gamma=");
        h.append(this.f3278a);
        h.append(", a=");
        h.append(this.f3279b);
        h.append(", b=");
        h.append(this.f3280c);
        h.append(", c=");
        h.append(this.f3281d);
        h.append(", d=");
        h.append(this.f3282e);
        h.append(", e=");
        h.append(this.f3283f);
        h.append(", f=");
        h.append(this.f3284g);
        h.append(')');
        return h.toString();
    }
}
