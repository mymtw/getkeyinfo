package androidx.compose.p015ui.focus;

import androidx.compose.p015ui.node.C1750p;
import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.p015ui.node.LayoutNodeWrapper;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.focus.p */
public final class C1482p {

    /* renamed from: androidx.compose.ui.focus.p$a */
    public /* synthetic */ class C1483a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3198a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.Captured.ordinal()] = 2;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 3;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            f3198a = iArr;
        }
    }

    /* renamed from: a */
    public static final void m3143a(FocusModifier focusModifier) {
        C19383o.m32797g(focusModifier, "<this>");
        int i = C1483a.f3198a[focusModifier.f3153e.ordinal()];
        if (i == 3) {
            focusModifier.mo6187b(FocusStateImpl.Inactive);
        } else if (i == 4) {
            focusModifier.mo6187b(FocusStateImpl.ActiveParent);
        }
    }

    /* renamed from: b */
    public static final boolean m3144b(FocusModifier focusModifier) {
        FocusModifier focusModifier2 = focusModifier.f3154f;
        if (focusModifier2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (!m3145c(focusModifier2, false)) {
            return false;
        } else {
            focusModifier.f3154f = null;
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m3145c(androidx.compose.p015ui.focus.FocusModifier r3, boolean r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r3, r0)
            androidx.compose.ui.focus.FocusStateImpl r0 = r3.f3153e
            int[] r1 = androidx.compose.p015ui.focus.C1482p.C1483a.f3198a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 0
            r2 = 1
            switch(r0) {
                case 1: goto L_0x003c;
                case 2: goto L_0x0034;
                case 3: goto L_0x0041;
                case 4: goto L_0x0026;
                case 5: goto L_0x001a;
                case 6: goto L_0x0041;
                default: goto L_0x0014;
            }
        L_0x0014:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        L_0x001a:
            boolean r4 = m3144b(r3)
            if (r4 == 0) goto L_0x0032
            androidx.compose.ui.focus.FocusStateImpl r4 = androidx.compose.p015ui.focus.FocusStateImpl.Inactive
            r3.mo6187b(r4)
            goto L_0x0041
        L_0x0026:
            boolean r4 = m3144b(r3)
            if (r4 == 0) goto L_0x0032
            androidx.compose.ui.focus.FocusStateImpl r4 = androidx.compose.p015ui.focus.FocusStateImpl.Deactivated
            r3.mo6187b(r4)
            goto L_0x0041
        L_0x0032:
            r4 = r1
            goto L_0x0042
        L_0x0034:
            if (r4 == 0) goto L_0x0042
            androidx.compose.ui.focus.FocusStateImpl r0 = androidx.compose.p015ui.focus.FocusStateImpl.Inactive
            r3.mo6187b(r0)
            goto L_0x0042
        L_0x003c:
            androidx.compose.ui.focus.FocusStateImpl r4 = androidx.compose.p015ui.focus.FocusStateImpl.Inactive
            r3.mo6187b(r4)
        L_0x0041:
            r4 = r2
        L_0x0042:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.focus.C1482p.m3145c(androidx.compose.ui.focus.FocusModifier, boolean):boolean");
    }

    /* renamed from: d */
    public static final void m3146d(FocusModifier focusModifier) {
        LayoutNode layoutNode;
        C1750p pVar;
        C1469d focusManager;
        C19383o.m32797g(focusModifier, "<this>");
        int i = C1483a.f3198a[focusModifier.f3153e.ordinal()];
        if (i == 1 || i == 2) {
            LayoutNodeWrapper layoutNodeWrapper = focusModifier.f3161m;
            if (!(layoutNodeWrapper == null || (layoutNode = layoutNodeWrapper.f3850f) == null || (pVar = layoutNode.f3823h) == null || (focusManager = pVar.getFocusManager()) == null)) {
                focusManager.mo6185b(true);
            }
            focusModifier.mo6187b(FocusStateImpl.Deactivated);
        } else if (i == 5) {
            focusModifier.mo6187b(FocusStateImpl.DeactivatedParent);
        } else if (i == 6) {
            focusModifier.mo6187b(FocusStateImpl.Deactivated);
        }
    }

    /* renamed from: e */
    public static final void m3147e(FocusModifier focusModifier) {
        FocusStateImpl focusStateImpl;
        switch (C1483a.f3198a[focusModifier.f3153e.ordinal()]) {
            case 1:
            case 5:
            case 6:
                focusStateImpl = FocusStateImpl.Active;
                break;
            case 2:
                focusStateImpl = FocusStateImpl.Captured;
                break;
            case 3:
            case 4:
                throw new IllegalStateException("Granting focus to a deactivated node.".toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
        focusModifier.mo6187b(focusStateImpl);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r0.f3850f;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m3148f(androidx.compose.p015ui.focus.FocusModifier r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r2, r0)
            androidx.compose.ui.node.LayoutNodeWrapper r0 = r2.f3161m
            if (r0 == 0) goto L_0x0010
            androidx.compose.ui.node.LayoutNode r0 = r0.f3850f
            if (r0 == 0) goto L_0x0010
            androidx.compose.ui.node.p r0 = r0.f3823h
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 != 0) goto L_0x0017
            r0 = 1
            r2.f3162n = r0
            return
        L_0x0017:
            androidx.compose.ui.focus.FocusStateImpl r0 = r2.f3153e
            int[] r1 = androidx.compose.p015ui.focus.C1482p.C1483a.f3198a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L_0x0041;
                case 2: goto L_0x0041;
                case 3: goto L_0x0041;
                case 4: goto L_0x0041;
                case 5: goto L_0x0037;
                case 6: goto L_0x0025;
                default: goto L_0x0024;
            }
        L_0x0024:
            goto L_0x0044
        L_0x0025:
            androidx.compose.ui.focus.FocusModifier r0 = r2.f3151c
            if (r0 == 0) goto L_0x002d
            m3149g(r0, r2)
            goto L_0x0044
        L_0x002d:
            boolean r0 = m3150h(r2)
            if (r0 == 0) goto L_0x0044
            m3147e(r2)
            goto L_0x0044
        L_0x0037:
            boolean r0 = m3144b(r2)
            if (r0 == 0) goto L_0x0044
            m3147e(r2)
            goto L_0x0044
        L_0x0041:
            m3151i(r2)
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.focus.C1482p.m3148f(androidx.compose.ui.focus.FocusModifier):void");
    }

    /* renamed from: g */
    public static final boolean m3149g(FocusModifier focusModifier, FocusModifier focusModifier2) {
        if (focusModifier.f3152d.mo20236j(focusModifier2)) {
            switch (C1483a.f3198a[focusModifier.f3153e.ordinal()]) {
                case 1:
                    focusModifier.mo6187b(FocusStateImpl.ActiveParent);
                    focusModifier.f3154f = focusModifier2;
                    m3147e(focusModifier2);
                    break;
                case 2:
                    return false;
                case 3:
                    m3143a(focusModifier);
                    boolean g = m3149g(focusModifier, focusModifier2);
                    m3146d(focusModifier);
                    return g;
                case 4:
                    if (focusModifier.f3154f == null) {
                        focusModifier.f3154f = focusModifier2;
                        m3147e(focusModifier2);
                        break;
                    } else if (m3144b(focusModifier)) {
                        focusModifier.f3154f = focusModifier2;
                        m3147e(focusModifier2);
                        break;
                    } else {
                        return false;
                    }
                case 5:
                    if (m3144b(focusModifier)) {
                        focusModifier.f3154f = focusModifier2;
                        m3147e(focusModifier2);
                        break;
                    } else {
                        return false;
                    }
                case 6:
                    FocusModifier focusModifier3 = focusModifier.f3151c;
                    if (focusModifier3 == null && m3150h(focusModifier)) {
                        focusModifier.mo6187b(FocusStateImpl.Active);
                        return m3149g(focusModifier, focusModifier2);
                    } else if (focusModifier3 == null || !m3149g(focusModifier3, focusModifier)) {
                        return false;
                    } else {
                        return m3149g(focusModifier, focusModifier2);
                    }
                default:
                    throw new NoWhenBranchMatchedException();
            }
            return true;
        }
        throw new IllegalStateException("Non child node cannot request focus.".toString());
    }

    /* renamed from: h */
    public static final boolean m3150h(FocusModifier focusModifier) {
        LayoutNode layoutNode;
        C1750p pVar;
        LayoutNodeWrapper layoutNodeWrapper = focusModifier.f3161m;
        if (layoutNodeWrapper != null && (layoutNode = layoutNodeWrapper.f3850f) != null && (pVar = layoutNode.f3823h) != null) {
            return pVar.requestFocus();
        }
        throw new IllegalStateException("Owner not initialized.".toString());
    }

    /* renamed from: i */
    public static final void m3151i(FocusModifier focusModifier) {
        C19383o.m32797g(focusModifier, "<this>");
        C1467c cVar = focusModifier.f3155g;
        if (cVar != null) {
            cVar.mo6209d();
        }
    }
}
