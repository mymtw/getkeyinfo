package p186n2;

import android.view.View;
import androidx.preference.C3039b;

/* renamed from: n2.k */
public final class C7407k extends C3039b {

    /* renamed from: d */
    public static final String[] f16546d = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    /* renamed from: c */
    public int f16547c = 80;

    /* renamed from: h0 */
    public final void mo11183h0(C7433t tVar) {
        View view = tVar.f16607b;
        Integer num = (Integer) tVar.f16606a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        tVar.f16606a.put("android:visibilityPropagation:visibility", num);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int round = Math.round(view.getTranslationX()) + iArr[0];
        iArr[0] = round;
        iArr[0] = (view.getWidth() / 2) + round;
        int round2 = Math.round(view.getTranslationY()) + iArr[1];
        iArr[1] = round2;
        iArr[1] = (view.getHeight() / 2) + round2;
        tVar.f16606a.put("android:visibilityPropagation:center", iArr);
    }

    /* renamed from: q0 */
    public final /* bridge */ /* synthetic */ void mo11185q0() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ae, code lost:
        if (r6 != false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c0, code lost:
        if (r6 != false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c4, code lost:
        r10 = 5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x011c  */
    /* renamed from: r0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo11186r0(android.view.ViewGroup r19, p186n2.C7418m r20, p186n2.C7433t r21, p186n2.C7433t r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = 0
            if (r2 != 0) goto L_0x000d
            if (r22 != 0) goto L_0x000d
            return r3
        L_0x000d:
            n2.m$c r5 = r1.f16579u
            if (r5 != 0) goto L_0x0013
            r5 = 0
            goto L_0x0017
        L_0x0013:
            android.graphics.Rect r5 = r5.mo19748a()
        L_0x0017:
            r6 = 1
            r7 = -1
            if (r22 == 0) goto L_0x0038
            r8 = 8
            if (r2 != 0) goto L_0x0020
            goto L_0x0031
        L_0x0020:
            java.util.HashMap r9 = r2.f16606a
            java.lang.String r10 = "android:visibilityPropagation:visibility"
            java.lang.Object r9 = r9.get(r10)
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 != 0) goto L_0x002d
            goto L_0x0031
        L_0x002d:
            int r8 = r9.intValue()
        L_0x0031:
            if (r8 != 0) goto L_0x0034
            goto L_0x0038
        L_0x0034:
            r2 = r22
            r8 = r6
            goto L_0x0039
        L_0x0038:
            r8 = r7
        L_0x0039:
            java.lang.String r9 = "android:visibilityPropagation:center"
            r10 = 0
            if (r2 != 0) goto L_0x0040
        L_0x003e:
            r11 = r7
            goto L_0x004d
        L_0x0040:
            java.util.HashMap r11 = r2.f16606a
            java.lang.Object r11 = r11.get(r9)
            int[] r11 = (int[]) r11
            if (r11 != 0) goto L_0x004b
            goto L_0x003e
        L_0x004b:
            r11 = r11[r10]
        L_0x004d:
            if (r2 != 0) goto L_0x0050
            goto L_0x005d
        L_0x0050:
            java.util.HashMap r2 = r2.f16606a
            java.lang.Object r2 = r2.get(r9)
            int[] r2 = (int[]) r2
            if (r2 != 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r7 = r2[r6]
        L_0x005d:
            r2 = 2
            int[] r9 = new int[r2]
            r12 = r19
            r12.getLocationOnScreen(r9)
            r13 = r9[r10]
            float r14 = r19.getTranslationX()
            int r14 = java.lang.Math.round(r14)
            int r14 = r14 + r13
            r9 = r9[r6]
            float r13 = r19.getTranslationY()
            int r13 = java.lang.Math.round(r13)
            int r13 = r13 + r9
            int r9 = r19.getWidth()
            int r9 = r9 + r14
            int r15 = r19.getHeight()
            int r15 = r15 + r13
            if (r5 == 0) goto L_0x0090
            int r2 = r5.centerX()
            int r5 = r5.centerY()
            goto L_0x009c
        L_0x0090:
            int r5 = r14 + r9
            int r5 = r5 / r2
            int r16 = r13 + r15
            int r2 = r16 / 2
            r17 = r5
            r5 = r2
            r2 = r17
        L_0x009c:
            int r10 = r0.f16547c
            r3 = 8388611(0x800003, float:1.1754948E-38)
            r4 = 3
            if (r10 != r3) goto L_0x00b1
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r10 = androidx.core.view.C2364y.f5646a
            int r10 = androidx.core.view.C2364y.C2369e.m5233d(r19)
            if (r10 != r6) goto L_0x00ad
            goto L_0x00ae
        L_0x00ad:
            r6 = 0
        L_0x00ae:
            if (r6 == 0) goto L_0x00c2
            goto L_0x00c4
        L_0x00b1:
            r3 = 8388613(0x800005, float:1.175495E-38)
            if (r10 != r3) goto L_0x00c5
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r3 = androidx.core.view.C2364y.f5646a
            int r3 = androidx.core.view.C2364y.C2369e.m5233d(r19)
            if (r3 != r6) goto L_0x00bf
            goto L_0x00c0
        L_0x00bf:
            r6 = 0
        L_0x00c0:
            if (r6 == 0) goto L_0x00c4
        L_0x00c2:
            r10 = r4
            goto L_0x00c5
        L_0x00c4:
            r10 = 5
        L_0x00c5:
            if (r10 == r4) goto L_0x00ef
            r3 = 5
            if (r10 == r3) goto L_0x00e6
            r3 = 48
            if (r10 == r3) goto L_0x00dd
            r3 = 80
            if (r10 == r3) goto L_0x00d4
            r10 = 0
            goto L_0x00f7
        L_0x00d4:
            int r7 = r7 - r13
            int r2 = r2 - r11
            int r2 = java.lang.Math.abs(r2)
            int r10 = r2 + r7
            goto L_0x00f7
        L_0x00dd:
            int r15 = r15 - r7
            int r2 = r2 - r11
            int r2 = java.lang.Math.abs(r2)
            int r10 = r2 + r15
            goto L_0x00f7
        L_0x00e6:
            int r11 = r11 - r14
            int r5 = r5 - r7
            int r2 = java.lang.Math.abs(r5)
            int r10 = r2 + r11
            goto L_0x00f7
        L_0x00ef:
            int r9 = r9 - r11
            int r5 = r5 - r7
            int r2 = java.lang.Math.abs(r5)
            int r10 = r2 + r9
        L_0x00f7:
            float r2 = (float) r10
            int r3 = r0.f16547c
            if (r3 == r4) goto L_0x010e
            r4 = 5
            if (r3 == r4) goto L_0x010e
            r4 = 8388611(0x800003, float:1.1754948E-38)
            if (r3 == r4) goto L_0x010e
            r4 = 8388613(0x800005, float:1.175495E-38)
            if (r3 == r4) goto L_0x010e
            int r3 = r19.getHeight()
            goto L_0x0112
        L_0x010e:
            int r3 = r19.getWidth()
        L_0x0112:
            float r3 = (float) r3
            float r2 = r2 / r3
            long r3 = r1.f16562d
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x011e
            r3 = 300(0x12c, double:1.48E-321)
        L_0x011e:
            long r5 = (long) r8
            long r3 = r3 * r5
            float r1 = (float) r3
            r3 = 1077936128(0x40400000, float:3.0)
            float r1 = r1 / r3
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            long r1 = (long) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p186n2.C7407k.mo11186r0(android.view.ViewGroup, n2.m, n2.t, n2.t):long");
    }
}
