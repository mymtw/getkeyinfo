package androidx.compose.p015ui.focus;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19382n;
import p219r.C7734e;
import p288y.C8345d;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt */
public final class TwoDimensionalFocusSearchKt {

    /* renamed from: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$a */
    public /* synthetic */ class C1464a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3172a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 2;
            iArr[FocusStateImpl.Active.ordinal()] = 3;
            iArr[FocusStateImpl.Captured.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            f3172a = iArr;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r10.f18301a >= r12.f18303c) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (r10.f18303c <= r12.f18301a) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        if (r10.f18302b >= r12.f18304d) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0053, code lost:
        if (r10.f18304d <= r12.f18302b) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0057, code lost:
        r3 = false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m3111a(p288y.C8345d r10, p288y.C8345d r11, p288y.C8345d r12, int r13) {
        /*
            boolean r0 = m3112b(r13, r12, r10)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0100
            boolean r0 = m3112b(r13, r11, r10)
            if (r0 != 0) goto L_0x0010
            goto L_0x0100
        L_0x0010:
            r0 = 3
            if (r13 != r0) goto L_0x0015
            r3 = r2
            goto L_0x0016
        L_0x0015:
            r3 = r1
        L_0x0016:
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            r5 = 6
            r6 = 5
            r7 = 4
            if (r3 == 0) goto L_0x0026
            float r3 = r10.f18301a
            float r8 = r12.f18303c
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0057
            goto L_0x0055
        L_0x0026:
            if (r13 != r7) goto L_0x002a
            r3 = r2
            goto L_0x002b
        L_0x002a:
            r3 = r1
        L_0x002b:
            if (r3 == 0) goto L_0x0036
            float r3 = r10.f18303c
            float r8 = r12.f18301a
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 > 0) goto L_0x0057
            goto L_0x0055
        L_0x0036:
            if (r13 != r6) goto L_0x003a
            r3 = r2
            goto L_0x003b
        L_0x003a:
            r3 = r1
        L_0x003b:
            if (r3 == 0) goto L_0x0046
            float r3 = r10.f18302b
            float r8 = r12.f18304d
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0057
            goto L_0x0055
        L_0x0046:
            if (r13 != r5) goto L_0x004a
            r3 = r2
            goto L_0x004b
        L_0x004a:
            r3 = r1
        L_0x004b:
            if (r3 == 0) goto L_0x00f6
            float r3 = r10.f18304d
            float r8 = r12.f18302b
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 > 0) goto L_0x0057
        L_0x0055:
            r3 = r2
            goto L_0x0058
        L_0x0057:
            r3 = r1
        L_0x0058:
            if (r3 != 0) goto L_0x005c
            goto L_0x00f4
        L_0x005c:
            if (r13 != r0) goto L_0x0060
            r3 = r2
            goto L_0x0061
        L_0x0060:
            r3 = r1
        L_0x0061:
            if (r3 != 0) goto L_0x00f4
            if (r13 != r7) goto L_0x0067
            r3 = r2
            goto L_0x0068
        L_0x0067:
            r3 = r1
        L_0x0068:
            if (r3 == 0) goto L_0x006c
            goto L_0x00f4
        L_0x006c:
            if (r13 != r0) goto L_0x0070
            r3 = r2
            goto L_0x0071
        L_0x0070:
            r3 = r1
        L_0x0071:
            if (r3 == 0) goto L_0x0078
            float r3 = r10.f18301a
            float r11 = r11.f18303c
            goto L_0x009b
        L_0x0078:
            if (r13 != r7) goto L_0x007c
            r3 = r2
            goto L_0x007d
        L_0x007c:
            r3 = r1
        L_0x007d:
            if (r3 == 0) goto L_0x0084
            float r3 = r11.f18301a
            float r11 = r10.f18303c
            goto L_0x009b
        L_0x0084:
            if (r13 != r6) goto L_0x0088
            r3 = r2
            goto L_0x0089
        L_0x0088:
            r3 = r1
        L_0x0089:
            if (r3 == 0) goto L_0x0090
            float r3 = r10.f18302b
            float r11 = r11.f18304d
            goto L_0x009b
        L_0x0090:
            if (r13 != r5) goto L_0x0094
            r3 = r2
            goto L_0x0095
        L_0x0094:
            r3 = r1
        L_0x0095:
            if (r3 == 0) goto L_0x00ea
            float r3 = r11.f18302b
            float r11 = r10.f18304d
        L_0x009b:
            float r3 = r3 - r11
            r11 = 0
            float r11 = java.lang.Math.max(r11, r3)
            if (r13 != r0) goto L_0x00a5
            r0 = r2
            goto L_0x00a6
        L_0x00a5:
            r0 = r1
        L_0x00a6:
            if (r0 == 0) goto L_0x00ad
            float r10 = r10.f18301a
            float r12 = r12.f18301a
            goto L_0x00d4
        L_0x00ad:
            if (r13 != r7) goto L_0x00b1
            r0 = r2
            goto L_0x00b2
        L_0x00b1:
            r0 = r1
        L_0x00b2:
            if (r0 == 0) goto L_0x00bc
            float r12 = r12.f18303c
            float r10 = r10.f18303c
        L_0x00b8:
            r9 = r12
            r12 = r10
            r10 = r9
            goto L_0x00d4
        L_0x00bc:
            if (r13 != r6) goto L_0x00c0
            r0 = r2
            goto L_0x00c1
        L_0x00c0:
            r0 = r1
        L_0x00c1:
            if (r0 == 0) goto L_0x00c8
            float r10 = r10.f18302b
            float r12 = r12.f18302b
            goto L_0x00d4
        L_0x00c8:
            if (r13 != r5) goto L_0x00cc
            r13 = r2
            goto L_0x00cd
        L_0x00cc:
            r13 = r1
        L_0x00cd:
            if (r13 == 0) goto L_0x00e0
            float r12 = r12.f18304d
            float r10 = r10.f18304d
            goto L_0x00b8
        L_0x00d4:
            float r10 = r10 - r12
            r12 = 1065353216(0x3f800000, float:1.0)
            float r10 = java.lang.Math.max(r12, r10)
            int r10 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r10 >= 0) goto L_0x0100
            goto L_0x00f4
        L_0x00e0:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = r4.toString()
            r10.<init>(r11)
            throw r10
        L_0x00ea:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = r4.toString()
            r10.<init>(r11)
            throw r10
        L_0x00f4:
            r1 = r2
            goto L_0x0100
        L_0x00f6:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = r4.toString()
            r10.<init>(r11)
            throw r10
        L_0x0100:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.focus.TwoDimensionalFocusSearchKt.m3111a(y.d, y.d, y.d, int):boolean");
    }

    /* renamed from: b */
    public static final boolean m3112b(int i, C8345d dVar, C8345d dVar2) {
        if (!((i == 3) || i == 4)) {
            if (!((i == 5) || i == 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            } else if (dVar.f18303c <= dVar2.f18301a || dVar.f18301a >= dVar2.f18303c) {
                return false;
            }
        } else if (dVar.f18304d <= dVar2.f18302b || dVar.f18302b >= dVar2.f18304d) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final FocusModifier m3113c(C7734e<FocusModifier> eVar, C8345d dVar, int i) {
        C8345d dVar2;
        if (i == 3) {
            dVar2 = dVar.mo20929d((dVar.f18303c - dVar.f18301a) + ((float) 1), 0.0f);
        } else {
            if (i == 4) {
                dVar2 = dVar.mo20929d(-((dVar.f18303c - dVar.f18301a) + ((float) 1)), 0.0f);
            } else {
                if (i == 5) {
                    dVar2 = dVar.mo20929d(0.0f, (dVar.f18304d - dVar.f18302b) + ((float) 1));
                } else {
                    if (i == 6) {
                        dVar2 = dVar.mo20929d(0.0f, -((dVar.f18304d - dVar.f18302b) + ((float) 1)));
                    } else {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                }
            }
        }
        FocusModifier focusModifier = null;
        int i2 = eVar.f17157d;
        if (i2 > 0) {
            T[] tArr = eVar.f17155b;
            int i3 = 0;
            do {
                FocusModifier focusModifier2 = (FocusModifier) tArr[i3];
                if (C1484q.m3156e(focusModifier2)) {
                    C8345d d = C1484q.m3155d(focusModifier2);
                    if (m3115e(i, d, dVar) && (!m3115e(i, dVar2, dVar) || m3111a(dVar, d, dVar2, i) || (!m3111a(dVar, dVar2, d, i) && m3116f(i, dVar, d) < m3116f(i, dVar, dVar2)))) {
                        focusModifier = focusModifier2;
                        dVar2 = d;
                    }
                }
                i3++;
            } while (i3 < i2);
        }
        return focusModifier;
    }

    /* renamed from: d */
    public static final boolean m3114d(FocusModifier focusModifier, FocusModifier focusModifier2, int i, C19857l<? super FocusModifier, Boolean> lVar) {
        if (m3117g(focusModifier, focusModifier2, i, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) C19382n.m32698A0(focusModifier, i, new TwoDimensionalFocusSearchKt$generateAndSearchChildren$1(focusModifier, focusModifier2, i, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m3115e(int i, C8345d dVar, C8345d dVar2) {
        if (i == 3) {
            float f = dVar2.f18303c;
            float f2 = dVar.f18303c;
            if ((f > f2 || dVar2.f18301a >= f2) && dVar2.f18301a > dVar.f18301a) {
                return true;
            }
        } else {
            if (i == 4) {
                float f3 = dVar2.f18301a;
                float f4 = dVar.f18301a;
                if ((f3 < f4 || dVar2.f18303c <= f4) && dVar2.f18303c < dVar.f18303c) {
                    return true;
                }
            } else {
                if (i == 5) {
                    float f5 = dVar2.f18304d;
                    float f6 = dVar.f18304d;
                    if ((f5 > f6 || dVar2.f18302b >= f6) && dVar2.f18302b > dVar.f18302b) {
                        return true;
                    }
                } else {
                    if (i == 6) {
                        float f7 = dVar2.f18302b;
                        float f8 = dVar.f18302b;
                        if ((f7 < f8 || dVar2.f18304d <= f8) && dVar2.f18304d < dVar.f18304d) {
                            return true;
                        }
                    } else {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public static final long m3116f(int i, C8345d dVar, C8345d dVar2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        boolean z = false;
        boolean z2 = true;
        if (i == 3) {
            f2 = dVar.f18301a;
            f = dVar2.f18303c;
        } else {
            if (i == 4) {
                f2 = dVar2.f18301a;
                f = dVar.f18303c;
            } else {
                if (i == 5) {
                    f2 = dVar.f18302b;
                    f = dVar2.f18304d;
                } else {
                    if (i == 6) {
                        f2 = dVar2.f18302b;
                        f = dVar.f18304d;
                    } else {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                }
            }
        }
        long abs = (long) Math.abs(Math.max(0.0f, f2 - f));
        if ((i == 3) || i == 4) {
            float f7 = dVar.f18302b;
            f6 = (float) 2;
            f4 = ((dVar.f18304d - f7) / f6) + f7;
            f5 = dVar2.f18302b;
            f3 = dVar2.f18304d;
        } else {
            if (!(i == 5)) {
                if (i == 6) {
                    z = true;
                }
                z2 = z;
            }
            if (z2) {
                float f8 = dVar.f18301a;
                f6 = (float) 2;
                f4 = ((dVar.f18303c - f8) / f6) + f8;
                f5 = dVar2.f18301a;
                f3 = dVar2.f18303c;
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
        }
        long abs2 = (long) Math.abs(f4 - (((f3 - f5) / f6) + f5));
        return (abs2 * abs2) + (((long) 13) * abs * abs);
    }

    /* renamed from: g */
    public static final boolean m3117g(FocusModifier focusModifier, FocusModifier focusModifier2, int i, C19857l<? super FocusModifier, Boolean> lVar) {
        FocusModifier c;
        C7734e<FocusModifier> eVar = focusModifier.f3152d;
        C7734e eVar2 = new C7734e(new FocusModifier[eVar.f17157d]);
        eVar2.mo20233e(eVar2.f17157d, eVar);
        while (eVar2.mo20240n() && (c = m3113c(eVar2, C1484q.m3155d(focusModifier2), i)) != null) {
            if (!c.f3153e.isDeactivated()) {
                return lVar.invoke(c).booleanValue();
            }
            if (m3114d(c, focusModifier2, i, lVar)) {
                return true;
            }
            eVar2.mo20241o(c);
        }
        return false;
    }

    /* renamed from: h */
    public static final boolean m3118h(FocusModifier focusModifier, int i, C19857l<? super FocusModifier, Boolean> lVar) {
        C8345d dVar;
        FocusStateImpl focusStateImpl = focusModifier.f3153e;
        int[] iArr = C1464a.f3172a;
        boolean z = true;
        switch (iArr[focusStateImpl.ordinal()]) {
            case 1:
            case 2:
                FocusModifier focusModifier2 = focusModifier.f3154f;
                if (focusModifier2 != null) {
                    switch (iArr[focusModifier2.f3153e.ordinal()]) {
                        case 1:
                        case 2:
                            if (m3118h(focusModifier2, i, lVar)) {
                                return true;
                            }
                            FocusStateImpl focusStateImpl2 = focusModifier2.f3153e;
                            if (focusStateImpl2 == FocusStateImpl.ActiveParent || focusStateImpl2 == FocusStateImpl.DeactivatedParent) {
                                FocusModifier b = C1484q.m3153b(focusModifier2);
                                if (b != null) {
                                    return m3114d(focusModifier, b, i, lVar);
                                }
                                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                            }
                            throw new IllegalStateException("Check failed.".toString());
                        case 3:
                        case 4:
                            return m3114d(focusModifier, focusModifier2, i, lVar);
                        case 5:
                        case 6:
                            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                } else {
                    throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                }
            case 3:
            case 4:
                C7734e<FocusModifier> a = C1484q.m3152a(focusModifier);
                if (a.f17157d <= 1) {
                    FocusModifier focusModifier3 = (FocusModifier) (a.mo20239m() ? null : a.f17155b[0]);
                    if (focusModifier3 != null) {
                        return lVar.invoke(focusModifier3).booleanValue();
                    }
                    return false;
                }
                if ((i == 4) || i == 6) {
                    C8345d d = C1484q.m3155d(focusModifier);
                    float f = d.f18301a;
                    float f2 = d.f18302b;
                    dVar = new C8345d(f, f2, f, f2);
                } else {
                    if (!(i == 3) && i != 5) {
                        z = false;
                    }
                    if (z) {
                        C8345d d2 = C1484q.m3155d(focusModifier);
                        float f3 = d2.f18303c;
                        float f4 = d2.f18304d;
                        dVar = new C8345d(f3, f4, f3, f4);
                    } else {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                }
                FocusModifier c = m3113c(a, dVar, i);
                if (c != null) {
                    return lVar.invoke(c).booleanValue();
                }
                return false;
            case 5:
                return false;
            case 6:
                return lVar.invoke(focusModifier).booleanValue();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
