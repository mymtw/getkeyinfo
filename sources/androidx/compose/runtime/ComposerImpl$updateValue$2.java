package androidx.compose.runtime;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;

public final class ComposerImpl$updateValue$2 extends Lambda implements C19862q<C1299c<?>, C1306d1, C1424y0, C19394m> {
    public final /* synthetic */ int $groupSlotIndex;
    public final /* synthetic */ Object $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerImpl$updateValue$2(Object obj, int i) {
        super(3);
        this.$value = obj;
        this.$groupSlotIndex = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        r7 = (androidx.compose.runtime.C1418v0) r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1299c<?> r7, androidx.compose.runtime.C1306d1 r8, androidx.compose.runtime.C1424y0 r9) {
        /*
            r6 = this;
            java.lang.String r1 = "<anonymous parameter 0>"
            java.lang.String r3 = "slots"
            java.lang.String r5 = "rememberManager"
            r0 = r7
            r2 = r8
            r4 = r9
            androidx.compose.animation.C0391c.m1059f(r0, r1, r2, r3, r4, r5)
            java.lang.Object r7 = r6.$value
            boolean r0 = r7 instanceof androidx.compose.runtime.C1426z0
            if (r0 == 0) goto L_0x0017
            androidx.compose.runtime.z0 r7 = (androidx.compose.runtime.C1426z0) r7
            r9.mo5824b(r7)
        L_0x0017:
            int r7 = r6.$groupSlotIndex
            java.lang.Object r0 = r6.$value
            java.lang.Object r7 = r8.mo5656E(r7, r0)
            boolean r8 = r7 instanceof androidx.compose.runtime.C1426z0
            if (r8 == 0) goto L_0x0029
            androidx.compose.runtime.z0 r7 = (androidx.compose.runtime.C1426z0) r7
            r9.mo5823a(r7)
            goto L_0x003d
        L_0x0029:
            boolean r8 = r7 instanceof androidx.compose.runtime.C1418v0
            if (r8 == 0) goto L_0x003d
            androidx.compose.runtime.v0 r7 = (androidx.compose.runtime.C1418v0) r7
            androidx.compose.runtime.i r8 = r7.f3079b
            if (r8 == 0) goto L_0x003d
            r9 = 0
            r7.f3079b = r9
            r7.f3083f = r9
            r7.f3084g = r9
            r7 = 1
            r8.f2904o = r7
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl$updateValue$2.invoke(androidx.compose.runtime.c, androidx.compose.runtime.d1, androidx.compose.runtime.y0):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1299c<?>) (C1299c) obj, (C1306d1) obj2, (C1424y0) obj3);
        return C19394m.f43287a;
    }
}
