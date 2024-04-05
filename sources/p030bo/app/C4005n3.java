package p030bo.app;

import android.support.p013v4.media.C0072d;
import com.braze.support.DateTimeUtils;
import kotlin.jvm.internal.C19383o;

/* renamed from: bo.app.n3 */
public final class C4005n3 extends C3624d5 {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C4005n3(p030bo.app.C3670f5 r4, double r5, java.lang.Double r7, boolean r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x000a
            bo.app.f5$a r4 = p030bo.app.C3670f5.f8421d
            bo.app.f5 r4 = r4.mo13297a()
        L_0x000a:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x0012
            double r5 = com.braze.support.DateTimeUtils.m11303e()
        L_0x0012:
            r0 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0018
            r7 = 0
        L_0x0018:
            r10 = r7
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001e
            r8 = 0
        L_0x001e:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r0
            r9 = r10
            r10 = r2
            r5.<init>(r6, r7, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C4005n3.<init>(bo.app.f5, double, java.lang.Double, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* renamed from: A */
    public final void mo13780A() {
        mo13208a(true);
        mo13207a(Double.valueOf(DateTimeUtils.m11303e()));
    }

    /* renamed from: a */
    public void mo13207a(Double d) {
        super.mo13207a(d);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("\nMutableSession(sessionId=");
        h.append(mo13210n());
        h.append(", startTime=");
        h.append(mo13214x());
        h.append(", endTime=");
        h.append(mo13213w());
        h.append(", isSealed=");
        h.append(mo13215y());
        h.append(", duration=");
        h.append(mo13212v());
        h.append(')');
        return h.toString();
    }

    /* renamed from: w */
    public Double mo13213w() {
        return super.mo13213w();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4005n3(C3670f5 f5Var, double d, Double d2, boolean z) {
        super(f5Var, d, d2, z);
        C19383o.m32797g(f5Var, "sessionId");
    }
}
