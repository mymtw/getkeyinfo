package androidx.compose.foundation.text;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p297z.C8412e;
import p753kq.C19857l;

final class TextController$drawTextAndSelectionBehind$1 extends Lambda implements C19857l<C8412e, C19394m> {
    public final /* synthetic */ TextController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextController$drawTextAndSelectionBehind$1(TextController textController) {
        super(1);
        this.this$0 = textController;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8412e) obj);
        return C19394m.f43287a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r1 = r1.mo4713b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(p297z.C8412e r12) {
        /*
            r11 = this;
            java.lang.String r0 = "$this$drawBehind"
            kotlin.jvm.internal.C19383o.m32797g(r12, r0)
            androidx.compose.foundation.text.TextController r0 = r11.this$0
            androidx.compose.foundation.text.TextState r1 = r0.f1923b
            androidx.compose.ui.text.q r2 = r1.f1966f
            if (r2 == 0) goto L_0x006b
            androidx.compose.runtime.ParcelableSnapshotMutableState r1 = r1.f1969i
            r1.getValue()
            kotlin.m r1 = kotlin.C19394m.f43287a
            androidx.compose.foundation.text.selection.l r1 = r0.f1924c
            if (r1 == 0) goto L_0x002d
            java.util.Map r1 = r1.mo4713b()
            if (r1 == 0) goto L_0x002d
            androidx.compose.foundation.text.TextState r3 = r0.f1923b
            long r3 = r3.f1962b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r1 = r1.get(r3)
            androidx.compose.foundation.text.selection.g r1 = (androidx.compose.foundation.text.selection.C1011g) r1
            goto L_0x002e
        L_0x002d:
            r1 = 0
        L_0x002e:
            if (r1 == 0) goto L_0x005b
            boolean r3 = r1.f2123c
            if (r3 != 0) goto L_0x0039
            androidx.compose.foundation.text.selection.g$a r4 = r1.f2121a
            int r4 = r4.f2125b
            goto L_0x003d
        L_0x0039:
            androidx.compose.foundation.text.selection.g$a r4 = r1.f2122b
            int r4 = r4.f2125b
        L_0x003d:
            if (r3 != 0) goto L_0x0044
            androidx.compose.foundation.text.selection.g$a r1 = r1.f2122b
            int r1 = r1.f2125b
            goto L_0x0048
        L_0x0044:
            androidx.compose.foundation.text.selection.g$a r1 = r1.f2121a
            int r1 = r1.f2125b
        L_0x0048:
            if (r4 == r1) goto L_0x005b
            androidx.compose.ui.text.c r3 = r2.f4590b
            androidx.compose.ui.graphics.g r6 = r3.mo7467a(r4, r1)
            androidx.compose.foundation.text.TextState r0 = r0.f1923b
            long r7 = r0.f1968h
            r9 = 0
            r10 = 60
            r5 = r12
            p297z.C8412e.m16782E(r5, r6, r7, r9, r10)
        L_0x005b:
            z.a$b r12 = r12.mo6900C0()
            androidx.compose.ui.graphics.o r12 = r12.mo20991a()
            java.lang.String r0 = "canvas"
            kotlin.jvm.internal.C19383o.m32797g(r12, r0)
            androidx.activity.C0114h.m318s0(r12, r2)
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextController$drawTextAndSelectionBehind$1.invoke(z.e):void");
    }
}
