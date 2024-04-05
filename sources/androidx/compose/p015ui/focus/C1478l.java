package androidx.compose.p015ui.focus;

import p219r.C7734e;

/* renamed from: androidx.compose.ui.focus.l */
public final class C1478l {

    /* renamed from: b */
    public static final C1478l f3194b = new C1478l();

    /* renamed from: a */
    public final C7734e<C1480n> f3195a = new C7734e<>(new C1480n[16]);

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0084, code lost:
        if (r11.mo20238l(r9) < r11.mo20238l(r10)) goto L_0x0088;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6218a() {
        /*
            r13 = this;
            r.e<androidx.compose.ui.focus.n> r0 = r13.f3195a
            boolean r0 = r0.mo20240n()
            if (r0 == 0) goto L_0x0096
            r.e<androidx.compose.ui.focus.n> r0 = r13.f3195a
            int r1 = r0.f17157d
            if (r1 <= 0) goto L_0x0095
            T[] r0 = r0.f17155b
            r2 = 0
            r3 = r2
        L_0x0012:
            r4 = r0[r3]
            androidx.compose.ui.focus.n r4 = (androidx.compose.p015ui.focus.C1480n) r4
            r.e<androidx.compose.ui.focus.FocusModifier> r4 = r4.f3197c
            int r5 = r4.f17157d
            r6 = 0
            if (r5 <= 0) goto L_0x008c
            T[] r4 = r4.f17155b
            r7 = r2
        L_0x0020:
            r8 = r4[r7]
            androidx.compose.ui.focus.FocusModifier r8 = (androidx.compose.p015ui.focus.FocusModifier) r8
            if (r6 == 0) goto L_0x0087
            androidx.compose.ui.node.LayoutNodeWrapper r9 = r6.f3161m
            if (r9 == 0) goto L_0x0087
            androidx.compose.ui.node.LayoutNode r9 = r9.f3850f
            if (r9 != 0) goto L_0x002f
            goto L_0x0087
        L_0x002f:
            androidx.compose.ui.node.LayoutNodeWrapper r10 = r8.f3161m
            if (r10 == 0) goto L_0x0088
            androidx.compose.ui.node.LayoutNode r10 = r10.f3850f
            if (r10 != 0) goto L_0x0038
            goto L_0x0088
        L_0x0038:
            int r11 = r9.f3824i
            int r12 = r10.f3824i
            if (r11 <= r12) goto L_0x0046
            androidx.compose.ui.node.LayoutNode r9 = r9.mo6766w()
            kotlin.jvm.internal.C19383o.m32794d(r9)
            goto L_0x0038
        L_0x0046:
            int r11 = r10.f3824i
            int r12 = r9.f3824i
            if (r11 <= r12) goto L_0x0054
            androidx.compose.ui.node.LayoutNode r10 = r10.mo6766w()
            kotlin.jvm.internal.C19383o.m32794d(r10)
            goto L_0x0046
        L_0x0054:
            androidx.compose.ui.node.LayoutNode r11 = r9.mo6766w()
            androidx.compose.ui.node.LayoutNode r12 = r10.mo6766w()
            boolean r11 = kotlin.jvm.internal.C19383o.m32792b(r11, r12)
            if (r11 != 0) goto L_0x0071
            androidx.compose.ui.node.LayoutNode r9 = r9.mo6766w()
            kotlin.jvm.internal.C19383o.m32794d(r9)
            androidx.compose.ui.node.LayoutNode r10 = r10.mo6766w()
            kotlin.jvm.internal.C19383o.m32794d(r10)
            goto L_0x0054
        L_0x0071:
            androidx.compose.ui.node.LayoutNode r11 = r9.mo6766w()
            kotlin.jvm.internal.C19383o.m32794d(r11)
            r.e r11 = r11.mo6768y()
            int r9 = r11.mo20238l(r9)
            int r10 = r11.mo20238l(r10)
            if (r9 >= r10) goto L_0x0087
            goto L_0x0088
        L_0x0087:
            r6 = r8
        L_0x0088:
            int r7 = r7 + 1
            if (r7 < r5) goto L_0x0020
        L_0x008c:
            if (r6 == 0) goto L_0x0091
            androidx.compose.p015ui.focus.C1482p.m3148f(r6)
        L_0x0091:
            int r3 = r3 + 1
            if (r3 < r1) goto L_0x0012
        L_0x0095:
            return
        L_0x0096:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.focus.C1478l.mo6218a():void");
    }
}
