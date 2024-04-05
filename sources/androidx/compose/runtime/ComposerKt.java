package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19862q;

public final class ComposerKt {

    /* renamed from: a */
    public static final C19862q<C1299c<?>, C1306d1, C1424y0, C19394m> f2748a = ComposerKt$removeCurrentGroupInstance$1.INSTANCE;

    /* renamed from: b */
    public static final C19862q<C1299c<?>, C1306d1, C1424y0, C19394m> f2749b = ComposerKt$skipToGroupEndInstance$1.INSTANCE;

    /* renamed from: c */
    public static final C19862q<C1299c<?>, C1306d1, C1424y0, C19394m> f2750c = ComposerKt$endGroupInstance$1.INSTANCE;

    /* renamed from: d */
    public static final C19862q<C1299c<?>, C1306d1, C1424y0, C19394m> f2751d = ComposerKt$startRootGroup$1.INSTANCE;

    /* renamed from: e */
    public static final C19862q<C1299c<?>, C1306d1, C1424y0, C19394m> f2752e = ComposerKt$resetSlotsInstance$1.INSTANCE;

    /* renamed from: f */
    public static final C1347m0 f2753f = new C1347m0("provider");

    /* renamed from: g */
    public static final C1347m0 f2754g = new C1347m0("provider");

    /* renamed from: h */
    public static final C1347m0 f2755h = new C1347m0("compositionLocalMap");

    /* renamed from: i */
    public static final C1347m0 f2756i = new C1347m0("providerValues");

    /* renamed from: j */
    public static final C1347m0 f2757j = new C1347m0("providers");

    /* renamed from: k */
    public static final C1347m0 f2758k = new C1347m0("reference");

    /* renamed from: a */
    public static final void m2524a(ArrayList arrayList, int i, int i2) {
        int d = m2527d(i, arrayList);
        if (d < 0) {
            d = -(d + 1);
        }
        while (d < arrayList.size() && ((C1425z) arrayList.get(d)).f3097b < i2) {
            arrayList.remove(d);
        }
    }

    /* renamed from: b */
    public static final void m2525b(C1298b1 b1Var, ArrayList arrayList, int i) {
        if (b1Var.mo5630h(i)) {
            arrayList.add(b1Var.mo5631i(i));
            return;
        }
        int i2 = i + 1;
        int g = b1Var.mo5629g(i) + i;
        while (i2 < g) {
            m2525b(b1Var, arrayList, i2);
            i2 += b1Var.mo5629g(i2);
        }
    }

    /* renamed from: c */
    public static final void m2526c(String str) {
        C19383o.m32797g(str, "message");
        throw new IllegalStateException(("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback").toString());
    }

    /* renamed from: d */
    public static final int m2527d(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int i4 = C19383o.m32799i(((C1425z) list.get(i3)).f3097b, i);
            if (i4 < 0) {
                i2 = i3 + 1;
            } else if (i4 <= 0) {
                return i3;
            } else {
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0044, code lost:
        r0 = (androidx.compose.runtime.C1418v0) r0;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2528e(androidx.compose.runtime.C1306d1 r4, androidx.compose.runtime.C1424y0 r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)
            java.lang.String r0 = "rememberManager"
            kotlin.jvm.internal.C19383o.m32797g(r5, r0)
            int[] r0 = r4.f2833b
            int r1 = r4.f2849r
            int r1 = r4.mo5679n(r1)
            int r0 = r4.mo5672g(r1, r0)
            int[] r1 = r4.f2833b
            int r2 = r4.f2849r
            int r3 = r4.mo5680o(r2)
            int r3 = r3 + r2
            int r2 = r4.mo5679n(r3)
            int r1 = r4.mo5672g(r2, r1)
            androidx.compose.runtime.e1 r2 = new androidx.compose.runtime.e1
            r2.<init>(r0, r1, r4)
        L_0x002c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0055
            java.lang.Object r0 = r2.next()
            boolean r1 = r0 instanceof androidx.compose.runtime.C1426z0
            if (r1 == 0) goto L_0x0040
            androidx.compose.runtime.z0 r0 = (androidx.compose.runtime.C1426z0) r0
            r5.mo5823a(r0)
            goto L_0x002c
        L_0x0040:
            boolean r1 = r0 instanceof androidx.compose.runtime.C1418v0
            if (r1 == 0) goto L_0x002c
            androidx.compose.runtime.v0 r0 = (androidx.compose.runtime.C1418v0) r0
            androidx.compose.runtime.i r1 = r0.f3079b
            if (r1 == 0) goto L_0x002c
            r3 = 1
            r1.f2904o = r3
            r1 = 0
            r0.f3079b = r1
            r0.f3083f = r1
            r0.f3084g = r1
            goto L_0x002c
        L_0x0055:
            r4.mo5653B()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerKt.m2528e(androidx.compose.runtime.d1, androidx.compose.runtime.y0):void");
    }

    /* renamed from: f */
    public static final void m2529f(boolean z) {
        if (!z) {
            m2526c("Check failed".toString());
            throw null;
        }
    }
}
