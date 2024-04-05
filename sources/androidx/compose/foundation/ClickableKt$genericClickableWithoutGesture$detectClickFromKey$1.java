package androidx.compose.foundation;

import androidx.compose.p015ui.input.key.C1612b;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;

final class ClickableKt$genericClickableWithoutGesture$detectClickFromKey$1 extends Lambda implements C19857l<C1612b, Boolean> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C19846a<C19394m> $onClick;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableKt$genericClickableWithoutGesture$detectClickFromKey$1(boolean z, C19846a<C19394m> aVar) {
        super(1);
        this.$enabled = z;
        this.$onClick = aVar;
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m34654invokeZmokQxo(((C1612b) obj).f3587a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036  */
    /* renamed from: invoke-ZmokQxo  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Boolean m34654invokeZmokQxo(android.view.KeyEvent r6) {
        /*
            r5 = this;
            java.lang.String r0 = "it"
            kotlin.jvm.internal.C19383o.m32797g(r6, r0)
            boolean r0 = r5.$enabled
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x003c
            int r0 = androidx.compose.foundation.C0620h.f1363b
            int r0 = androidx.compose.p015ui.input.key.C1613c.m3424b(r6)
            if (r0 != r1) goto L_0x0015
            r0 = r1
            goto L_0x0016
        L_0x0015:
            r0 = r2
        L_0x0016:
            if (r0 == 0) goto L_0x0033
            long r3 = androidx.compose.p015ui.input.key.C1613c.m3423a(r6)
            r6 = 32
            long r3 = r3 >> r6
            int r6 = (int) r3
            r0 = 23
            if (r6 == r0) goto L_0x002e
            r0 = 66
            if (r6 == r0) goto L_0x002e
            r0 = 160(0xa0, float:2.24E-43)
            if (r6 == r0) goto L_0x002e
            r6 = r2
            goto L_0x002f
        L_0x002e:
            r6 = r1
        L_0x002f:
            if (r6 == 0) goto L_0x0033
            r6 = r1
            goto L_0x0034
        L_0x0033:
            r6 = r2
        L_0x0034:
            if (r6 == 0) goto L_0x003c
            kq.a<kotlin.m> r6 = r5.$onClick
            r6.invoke()
            goto L_0x003d
        L_0x003c:
            r1 = r2
        L_0x003d:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectClickFromKey$1.m34654invokeZmokQxo(android.view.KeyEvent):java.lang.Boolean");
    }
}
