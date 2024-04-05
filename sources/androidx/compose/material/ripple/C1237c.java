package androidx.compose.material.ripple;

import androidx.compose.runtime.C1338j0;

/* renamed from: androidx.compose.material.ripple.c */
public final class C1237c extends C1238d {
    public C1237c() {
        throw null;
    }

    public C1237c(boolean z, float f, C1338j0 j0Var) {
        super(z, f, j0Var);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: androidx.compose.material.ripple.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: androidx.compose.material.ripple.a} */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c4, code lost:
        if (r0 == androidx.compose.runtime.C1302d.C1303a.f2828a) goto L_0x00c6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.material.ripple.C1243i mo5328b(androidx.compose.foundation.interaction.C0639i r9, boolean r10, float r11, androidx.compose.runtime.C1338j0 r12, androidx.compose.runtime.C1338j0 r13, androidx.compose.runtime.C1302d r14) {
        /*
            r8 = this;
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.C19383o.m32797g(r9, r0)
            r0 = 331259447(0x13be9e37, float:4.8118755E-27)
            r14.mo5465u(r0)
            r0 = -1737891121(0xffffffff9869e2cf, float:-3.0229053E-24)
            r14.mo5465u(r0)
            androidx.compose.runtime.l1 r0 = androidx.compose.p015ui.platform.AndroidCompositionLocals_androidKt.f3991f
            java.lang.Object r0 = r14.mo5410J(r0)
        L_0x0017:
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 != 0) goto L_0x003f
            r1 = r0
            android.view.View r1 = (android.view.View) r1
            android.view.ViewParent r1 = r1.getParent()
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L_0x002d
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.C19383o.m32796f(r1, r0)
            r0 = r1
            goto L_0x0017
        L_0x002d:
            java.lang.String r9 = "Couldn't find a valid parent for "
            java.lang.String r10 = ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?"
            java.lang.String r9 = p504ai.C13983i.m21494m(r9, r0, r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L_0x003f:
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r14.mo5406H()
            r1 = 1643267286(0x61f244d6, float:5.5863403E20)
            r14.mo5465u(r1)
            boolean r1 = r0.isInEditMode()
            if (r1 == 0) goto L_0x007d
            r0 = -3686552(0xffffffffffc7bf68, float:NaN)
            r14.mo5465u(r0)
            boolean r9 = r14.mo5408I(r9)
            boolean r0 = r14.mo5408I(r8)
            r9 = r9 | r0
            java.lang.Object r0 = r14.mo5467v()
            if (r9 != 0) goto L_0x0069
            androidx.compose.runtime.d$a$a r9 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r0 != r9) goto L_0x0071
        L_0x0069:
            androidx.compose.material.ripple.CommonRippleIndicationInstance r0 = new androidx.compose.material.ripple.CommonRippleIndicationInstance
            r0.<init>(r10, r11, r12, r13)
            r14.mo5454o(r0)
        L_0x0071:
            r14.mo5406H()
            androidx.compose.material.ripple.CommonRippleIndicationInstance r0 = (androidx.compose.material.ripple.CommonRippleIndicationInstance) r0
            r14.mo5406H()
            r14.mo5406H()
            return r0
        L_0x007d:
            r14.mo5406H()
            r1 = 0
            r2 = 0
            int r3 = r0.getChildCount()
        L_0x0086:
            if (r2 >= r3) goto L_0x0095
            android.view.View r4 = r0.getChildAt(r2)
            boolean r5 = r4 instanceof androidx.compose.material.ripple.RippleContainer
            if (r5 == 0) goto L_0x0092
            r1 = r4
            goto L_0x0095
        L_0x0092:
            int r2 = r2 + 1
            goto L_0x0086
        L_0x0095:
            if (r1 != 0) goto L_0x00a8
            androidx.compose.material.ripple.RippleContainer r1 = new androidx.compose.material.ripple.RippleContainer
            android.content.Context r2 = r0.getContext()
            java.lang.String r3 = "view.context"
            kotlin.jvm.internal.C19383o.m32796f(r2, r3)
            r1.<init>(r2)
            r0.addView(r1)
        L_0x00a8:
            r0 = -3686095(0xffffffffffc7c131, float:NaN)
            r14.mo5465u(r0)
            boolean r9 = r14.mo5408I(r9)
            boolean r0 = r14.mo5408I(r8)
            r9 = r9 | r0
            boolean r0 = r14.mo5408I(r1)
            r9 = r9 | r0
            java.lang.Object r0 = r14.mo5467v()
            if (r9 != 0) goto L_0x00c6
            androidx.compose.runtime.d$a$a r9 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r0 != r9) goto L_0x00d6
        L_0x00c6:
            androidx.compose.material.ripple.a r0 = new androidx.compose.material.ripple.a
            r7 = r1
            androidx.compose.material.ripple.RippleContainer r7 = (androidx.compose.material.ripple.RippleContainer) r7
            r2 = r0
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r14.mo5454o(r0)
        L_0x00d6:
            r14.mo5406H()
            androidx.compose.material.ripple.a r0 = (androidx.compose.material.ripple.C1235a) r0
            r14.mo5406H()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.C1237c.mo5328b(androidx.compose.foundation.interaction.i, boolean, float, androidx.compose.runtime.j0, androidx.compose.runtime.j0, androidx.compose.runtime.d):androidx.compose.material.ripple.i");
    }
}
