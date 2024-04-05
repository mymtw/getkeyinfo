package androidx.compose.p015ui.focus;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import p219r.C7734e;
import p753kq.C19857l;
import p764pq.C20057i;

/* renamed from: androidx.compose.ui.focus.OneDimensionalFocusSearchKt */
public final class OneDimensionalFocusSearchKt {

    /* renamed from: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$a */
    public /* synthetic */ class C1463a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3171a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 2;
            iArr[FocusStateImpl.Active.ordinal()] = 3;
            iArr[FocusStateImpl.Captured.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            f3171a = iArr;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0072, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0074 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m3106a(androidx.compose.p015ui.focus.FocusModifier r4, p753kq.C19857l<? super androidx.compose.p015ui.focus.FocusModifier, java.lang.Boolean> r5) {
        /*
            androidx.compose.ui.focus.FocusStateImpl r0 = r4.f3153e
            int[] r1 = androidx.compose.p015ui.focus.OneDimensionalFocusSearchKt.C1463a.f3171a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L_0x002b;
                case 2: goto L_0x002b;
                case 3: goto L_0x0026;
                case 4: goto L_0x0026;
                case 5: goto L_0x0026;
                case 6: goto L_0x0013;
                default: goto L_0x000d;
            }
        L_0x000d:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L_0x0013:
            boolean r0 = m3109d(r4, r5)
            if (r0 != 0) goto L_0x0074
            java.lang.Object r4 = r5.invoke(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0072
            goto L_0x0074
        L_0x0026:
            boolean r4 = m3109d(r4, r5)
            goto L_0x0075
        L_0x002b:
            androidx.compose.ui.focus.FocusModifier r0 = r4.f3154f
            java.lang.String r2 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto L_0x0076
            androidx.compose.ui.focus.FocusStateImpl r3 = r0.f3153e
            int r3 = r3.ordinal()
            r1 = r1[r3]
            r3 = 2
            switch(r1) {
                case 1: goto L_0x005f;
                case 2: goto L_0x0052;
                case 3: goto L_0x004d;
                case 4: goto L_0x004d;
                case 5: goto L_0x0043;
                case 6: goto L_0x0043;
                default: goto L_0x003d;
            }
        L_0x003d:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L_0x0043:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = r2.toString()
            r4.<init>(r5)
            throw r4
        L_0x004d:
            boolean r4 = m3108c(r4, r0, r3, r5)
            goto L_0x0075
        L_0x0052:
            boolean r1 = m3106a(r0, r5)
            if (r1 != 0) goto L_0x0074
            boolean r4 = m3108c(r4, r0, r3, r5)
            if (r4 == 0) goto L_0x0072
            goto L_0x0074
        L_0x005f:
            boolean r4 = m3106a(r0, r5)
            if (r4 != 0) goto L_0x0074
            java.lang.Object r4 = r5.invoke(r0)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0072
            goto L_0x0074
        L_0x0072:
            r4 = 0
            goto L_0x0075
        L_0x0074:
            r4 = 1
        L_0x0075:
            return r4
        L_0x0076:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = r2.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.focus.OneDimensionalFocusSearchKt.m3106a(androidx.compose.ui.focus.FocusModifier, kq.l):boolean");
    }

    /* renamed from: b */
    public static final boolean m3107b(FocusModifier focusModifier, C19857l<? super FocusModifier, Boolean> lVar) {
        switch (C1463a.f3171a[focusModifier.f3153e.ordinal()]) {
            case 1:
            case 2:
                FocusModifier focusModifier2 = focusModifier.f3154f;
                if (focusModifier2 == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                } else if (m3107b(focusModifier2, lVar) || m3108c(focusModifier, focusModifier2, 1, lVar)) {
                    return true;
                }
            case 3:
            case 4:
            case 5:
                focusModifier.f3152d.mo20244s(new C1486r());
                C7734e<FocusModifier> eVar = focusModifier.f3152d;
                int i = eVar.f17157d;
                if (i > 0) {
                    T[] tArr = eVar.f17155b;
                    int i2 = 0;
                    do {
                        FocusModifier focusModifier3 = (FocusModifier) tArr[i2];
                        if (C1484q.m3156e(focusModifier3) && m3107b(focusModifier3, lVar)) {
                            return true;
                        }
                        i2++;
                    } while (i2 < i);
                    break;
                }
                break;
            case 6:
                return lVar.invoke(focusModifier).booleanValue();
            default:
                throw new NoWhenBranchMatchedException();
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m3108c(FocusModifier focusModifier, FocusModifier focusModifier2, int i, C19857l<? super FocusModifier, Boolean> lVar) {
        if (m3110e(focusModifier, focusModifier2, i, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) C19382n.m32698A0(focusModifier, i, new OneDimensionalFocusSearchKt$generateAndSearchChildren$1(focusModifier, focusModifier2, i, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m3109d(FocusModifier focusModifier, C19857l<? super FocusModifier, Boolean> lVar) {
        focusModifier.f3152d.mo20244s(new C1486r());
        C7734e<FocusModifier> eVar = focusModifier.f3152d;
        int i = eVar.f17157d;
        if (i <= 0) {
            return false;
        }
        int i2 = i - 1;
        T[] tArr = eVar.f17155b;
        do {
            FocusModifier focusModifier2 = (FocusModifier) tArr[i2];
            if (C1484q.m3156e(focusModifier2) && m3106a(focusModifier2, lVar)) {
                return true;
            }
            i2--;
        } while (i2 >= 0);
        return false;
    }

    /* renamed from: e */
    public static final boolean m3110e(FocusModifier focusModifier, FocusModifier focusModifier2, int i, C19857l<? super FocusModifier, Boolean> lVar) {
        FocusStateImpl focusStateImpl = focusModifier.f3153e;
        boolean z = true;
        if (focusStateImpl == FocusStateImpl.ActiveParent || focusStateImpl == FocusStateImpl.DeactivatedParent) {
            focusModifier.f3152d.mo20244s(new C1486r());
            if (i == 1) {
                C7734e<FocusModifier> eVar = focusModifier.f3152d;
                int i2 = new C20057i(0, eVar.f17157d - 1).f44415c;
                if (i2 >= 0) {
                    boolean z2 = false;
                    int i3 = 0;
                    while (true) {
                        if (z2) {
                            FocusModifier focusModifier3 = (FocusModifier) eVar.f17155b[i3];
                            if (C1484q.m3156e(focusModifier3) && m3107b(focusModifier3, lVar)) {
                                return true;
                            }
                        }
                        if (C19383o.m32792b(eVar.f17155b[i3], focusModifier2)) {
                            z2 = true;
                        }
                        if (i3 == i2) {
                            break;
                        }
                        i3++;
                    }
                }
            } else {
                if (i == 2) {
                    C7734e<FocusModifier> eVar2 = focusModifier.f3152d;
                    int i4 = new C20057i(0, eVar2.f17157d - 1).f44415c;
                    if (i4 >= 0) {
                        boolean z3 = false;
                        while (true) {
                            if (z3) {
                                FocusModifier focusModifier4 = (FocusModifier) eVar2.f17155b[i4];
                                if (C1484q.m3156e(focusModifier4) && m3106a(focusModifier4, lVar)) {
                                    return true;
                                }
                            }
                            if (C19383o.m32792b(eVar2.f17155b[i4], focusModifier2)) {
                                z3 = true;
                            }
                            if (i4 == 0) {
                                break;
                            }
                            i4--;
                        }
                    }
                } else {
                    throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
                }
            }
            if (!(i == 1) && focusModifier.f3153e != FocusStateImpl.DeactivatedParent) {
                if (focusModifier.f3151c != null) {
                    z = false;
                }
                if (!z) {
                    return lVar.invoke(focusModifier).booleanValue();
                }
            }
            return false;
        }
        throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
    }
}
