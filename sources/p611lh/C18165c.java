package p611lh;

import androidx.recyclerview.widget.RecyclerView;
import com.google.logging.type.LogSeverity;
import org.apache.commons.lang3.time.DateUtils;
import p513bj.C14077r;

/* renamed from: lh.c */
public final class C18165c {

    /* renamed from: a */
    public static final int[] f39734a = {2002, RecyclerView.MAX_SCROLL_DURATION, 1920, 1601, 1600, DateUtils.SEMI_MONTH, 1000, 960, LogSeverity.EMERGENCY_VALUE, LogSeverity.EMERGENCY_VALUE, 480, LogSeverity.WARNING_VALUE, LogSeverity.WARNING_VALUE, RecyclerView.C3084b0.FLAG_MOVED};

    /* renamed from: lh.c$a */
    public static final class C18166a {

        /* renamed from: a */
        public final int f39735a;

        /* renamed from: b */
        public final int f39736b;

        /* renamed from: c */
        public final int f39737c;

        public C18166a(int i, int i2, int i3) {
            this.f39735a = i;
            this.f39736b = i2;
            this.f39737c = i3;
        }
    }

    /* renamed from: a */
    public static void m30679a(int i, C14077r rVar) {
        rVar.mo46932w(7);
        byte[] bArr = rVar.f30986a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0084, code lost:
        if (r9 != 11) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0089, code lost:
        if (r9 != 11) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008e, code lost:
        if (r9 != 8) goto L_0x0092;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p611lh.C18165c.C18166a m30680b(p513bj.C14076q r9) {
        /*
            r0 = 16
            int r1 = r9.mo46901h(r0)
            int r0 = r9.mo46901h(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L_0x0018
            r0 = 24
            int r0 = r9.mo46901h(r0)
            r3 = 7
            goto L_0x0019
        L_0x0018:
            r3 = r2
        L_0x0019:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r3) goto L_0x0021
            int r0 = r0 + 2
        L_0x0021:
            r1 = 2
            int r3 = r9.mo46901h(r1)
            r4 = 0
            r5 = 3
            if (r3 != r5) goto L_0x0033
        L_0x002a:
            r9.mo46901h(r1)
            boolean r3 = r9.mo46900g()
            if (r3 != 0) goto L_0x002a
        L_0x0033:
            r3 = 10
            int r3 = r9.mo46901h(r3)
            boolean r6 = r9.mo46900g()
            if (r6 == 0) goto L_0x0048
            int r6 = r9.mo46901h(r5)
            if (r6 <= 0) goto L_0x0048
            r9.mo46907n(r1)
        L_0x0048:
            boolean r6 = r9.mo46900g()
            r7 = 48000(0xbb80, float:6.7262E-41)
            r8 = 44100(0xac44, float:6.1797E-41)
            if (r6 == 0) goto L_0x0056
            r6 = r7
            goto L_0x0057
        L_0x0056:
            r6 = r8
        L_0x0057:
            int r9 = r9.mo46901h(r2)
            if (r6 != r8) goto L_0x0066
            r8 = 13
            if (r9 != r8) goto L_0x0066
            int[] r1 = f39734a
            r9 = r1[r9]
            goto L_0x0093
        L_0x0066:
            if (r6 != r7) goto L_0x0092
            int[] r7 = f39734a
            r8 = 14
            if (r9 >= r8) goto L_0x0092
            r4 = r7[r9]
            int r3 = r3 % 5
            r7 = 8
            r8 = 1
            if (r3 == r8) goto L_0x008c
            r8 = 11
            if (r3 == r1) goto L_0x0087
            if (r3 == r5) goto L_0x008c
            if (r3 == r2) goto L_0x0080
            goto L_0x0092
        L_0x0080:
            if (r9 == r5) goto L_0x0090
            if (r9 == r7) goto L_0x0090
            if (r9 != r8) goto L_0x0092
            goto L_0x0090
        L_0x0087:
            if (r9 == r7) goto L_0x0090
            if (r9 != r8) goto L_0x0092
            goto L_0x0090
        L_0x008c:
            if (r9 == r5) goto L_0x0090
            if (r9 != r7) goto L_0x0092
        L_0x0090:
            int r4 = r4 + 1
        L_0x0092:
            r9 = r4
        L_0x0093:
            lh.c$a r1 = new lh.c$a
            r1.<init>(r6, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p611lh.C18165c.m30680b(bj.q):lh.c$a");
    }
}
