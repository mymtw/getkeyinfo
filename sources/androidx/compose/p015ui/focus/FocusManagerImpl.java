package androidx.compose.p015ui.focus;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: androidx.compose.ui.focus.FocusManagerImpl */
public final class FocusManagerImpl implements C1469d {

    /* renamed from: a */
    public final FocusModifier f3146a;

    /* renamed from: b */
    public final C1436d f3147b;

    /* renamed from: c */
    public LayoutDirection f3148c;

    /* renamed from: androidx.compose.ui.focus.FocusManagerImpl$a */
    public /* synthetic */ class C1454a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3149a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 2;
            iArr[FocusStateImpl.Captured.ordinal()] = 3;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 4;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            f3149a = iArr;
        }
    }

    public FocusManagerImpl() {
        FocusModifier focusModifier = new FocusModifier(FocusStateImpl.Inactive);
        this.f3146a = focusModifier;
        this.f3147b = FocusModifierKt.m3103b(C1436d.C1437a.f3125b, focusModifier);
    }

    /* JADX WARNING: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo6184a(int r15) {
        /*
            r14 = this;
            androidx.compose.ui.focus.FocusModifier r0 = r14.f3146a
            androidx.compose.ui.focus.FocusModifier r0 = androidx.compose.p015ui.focus.C1484q.m3153b(r0)
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            androidx.compose.ui.unit.LayoutDirection r2 = r14.f3148c
            java.lang.String r3 = "layoutDirection"
            r4 = 0
            if (r2 == 0) goto L_0x01e2
            r5 = 1
            if (r15 != r5) goto L_0x0016
            r6 = r5
            goto L_0x0017
        L_0x0016:
            r6 = r1
        L_0x0017:
            r7 = 8
            r8 = 7
            r9 = 4
            r10 = 3
            r11 = 6
            r12 = 5
            r13 = 2
            if (r6 == 0) goto L_0x0027
            androidx.compose.ui.focus.j r2 = r0.f3159k
            androidx.compose.ui.focus.l r2 = r2.f3183b
            goto L_0x00c7
        L_0x0027:
            if (r15 != r13) goto L_0x002b
            r6 = r5
            goto L_0x002c
        L_0x002b:
            r6 = r1
        L_0x002c:
            if (r6 == 0) goto L_0x0034
            androidx.compose.ui.focus.j r2 = r0.f3159k
            androidx.compose.ui.focus.l r2 = r2.f3184c
            goto L_0x00c7
        L_0x0034:
            if (r15 != r12) goto L_0x0038
            r6 = r5
            goto L_0x0039
        L_0x0038:
            r6 = r1
        L_0x0039:
            if (r6 == 0) goto L_0x0041
            androidx.compose.ui.focus.j r2 = r0.f3159k
            androidx.compose.ui.focus.l r2 = r2.f3185d
            goto L_0x00c7
        L_0x0041:
            if (r15 != r11) goto L_0x0045
            r6 = r5
            goto L_0x0046
        L_0x0045:
            r6 = r1
        L_0x0046:
            if (r6 == 0) goto L_0x004e
            androidx.compose.ui.focus.j r2 = r0.f3159k
            androidx.compose.ui.focus.l r2 = r2.f3186e
            goto L_0x00c7
        L_0x004e:
            if (r15 != r10) goto L_0x0052
            r6 = r5
            goto L_0x0053
        L_0x0052:
            r6 = r1
        L_0x0053:
            if (r6 == 0) goto L_0x0081
            int[] r6 = androidx.compose.p015ui.focus.C1473g.f3180a
            int r2 = r2.ordinal()
            r2 = r6[r2]
            if (r2 == r5) goto L_0x006c
            if (r2 != r13) goto L_0x0066
            androidx.compose.ui.focus.j r2 = r0.f3159k
            androidx.compose.ui.focus.l r2 = r2.f3190i
            goto L_0x0070
        L_0x0066:
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
        L_0x006c:
            androidx.compose.ui.focus.j r2 = r0.f3159k
            androidx.compose.ui.focus.l r2 = r2.f3189h
        L_0x0070:
            androidx.compose.ui.focus.l r6 = androidx.compose.p015ui.focus.C1478l.f3194b
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r2, r6)
            if (r6 != 0) goto L_0x0079
            goto L_0x007a
        L_0x0079:
            r2 = r4
        L_0x007a:
            if (r2 != 0) goto L_0x00c7
            androidx.compose.ui.focus.j r2 = r0.f3159k
            androidx.compose.ui.focus.l r2 = r2.f3187f
            goto L_0x00c7
        L_0x0081:
            if (r15 != r9) goto L_0x0085
            r6 = r5
            goto L_0x0086
        L_0x0085:
            r6 = r1
        L_0x0086:
            if (r6 == 0) goto L_0x00b4
            int[] r6 = androidx.compose.p015ui.focus.C1473g.f3180a
            int r2 = r2.ordinal()
            r2 = r6[r2]
            if (r2 == r5) goto L_0x009f
            if (r2 != r13) goto L_0x0099
            androidx.compose.ui.focus.j r2 = r0.f3159k
            androidx.compose.ui.focus.l r2 = r2.f3189h
            goto L_0x00a3
        L_0x0099:
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
        L_0x009f:
            androidx.compose.ui.focus.j r2 = r0.f3159k
            androidx.compose.ui.focus.l r2 = r2.f3190i
        L_0x00a3:
            androidx.compose.ui.focus.l r6 = androidx.compose.p015ui.focus.C1478l.f3194b
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r2, r6)
            if (r6 != 0) goto L_0x00ac
            goto L_0x00ad
        L_0x00ac:
            r2 = r4
        L_0x00ad:
            if (r2 != 0) goto L_0x00c7
            androidx.compose.ui.focus.j r2 = r0.f3159k
            androidx.compose.ui.focus.l r2 = r2.f3188g
            goto L_0x00c7
        L_0x00b4:
            if (r15 != r8) goto L_0x00b8
            r2 = r5
            goto L_0x00b9
        L_0x00b8:
            r2 = r1
        L_0x00b9:
            if (r2 == 0) goto L_0x00be
            androidx.compose.ui.focus.l r2 = androidx.compose.p015ui.focus.C1478l.f3194b
            goto L_0x00c7
        L_0x00be:
            if (r15 != r7) goto L_0x00c2
            r2 = r5
            goto L_0x00c3
        L_0x00c2:
            r2 = r1
        L_0x00c3:
            if (r2 == 0) goto L_0x01d6
            androidx.compose.ui.focus.l r2 = androidx.compose.p015ui.focus.C1478l.f3194b
        L_0x00c7:
            androidx.compose.ui.focus.l r6 = androidx.compose.p015ui.focus.C1478l.f3194b
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r2, r6)
            if (r6 != 0) goto L_0x00d3
            r2.mo6218a()
            return r5
        L_0x00d3:
            androidx.compose.ui.focus.FocusModifier r2 = r14.f3146a
            androidx.compose.ui.unit.LayoutDirection r6 = r14.f3148c
            if (r6 == 0) goto L_0x01d2
            androidx.compose.ui.focus.FocusManagerImpl$moveFocus$1 r3 = new androidx.compose.ui.focus.FocusManagerImpl$moveFocus$1
            r3.<init>(r0)
            java.lang.String r0 = "$this$focusSearch"
            kotlin.jvm.internal.C19383o.m32797g(r2, r0)
            if (r15 != r5) goto L_0x00e7
            r0 = r5
            goto L_0x00e8
        L_0x00e7:
            r0 = r1
        L_0x00e8:
            if (r0 == 0) goto L_0x00eb
            goto L_0x00ed
        L_0x00eb:
            if (r15 != r13) goto L_0x00ef
        L_0x00ed:
            r0 = r5
            goto L_0x00f0
        L_0x00ef:
            r0 = r1
        L_0x00f0:
            if (r0 == 0) goto L_0x0118
            if (r15 != r5) goto L_0x00f6
            r0 = r5
            goto L_0x00f7
        L_0x00f6:
            r0 = r1
        L_0x00f7:
            if (r0 == 0) goto L_0x00ff
            boolean r0 = androidx.compose.p015ui.focus.OneDimensionalFocusSearchKt.m3107b(r2, r3)
            goto L_0x0188
        L_0x00ff:
            if (r15 != r13) goto L_0x0103
            r0 = r5
            goto L_0x0104
        L_0x0103:
            r0 = r1
        L_0x0104:
            if (r0 == 0) goto L_0x010c
            boolean r0 = androidx.compose.p015ui.focus.OneDimensionalFocusSearchKt.m3106a(r2, r3)
            goto L_0x0188
        L_0x010c:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "This function should only be used for 1-D focus search"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x0118:
            if (r15 != r10) goto L_0x011c
            r0 = r5
            goto L_0x011d
        L_0x011c:
            r0 = r1
        L_0x011d:
            if (r0 == 0) goto L_0x0120
            goto L_0x0122
        L_0x0120:
            if (r15 != r9) goto L_0x0124
        L_0x0122:
            r0 = r5
            goto L_0x0125
        L_0x0124:
            r0 = r1
        L_0x0125:
            if (r0 == 0) goto L_0x0128
            goto L_0x012a
        L_0x0128:
            if (r15 != r12) goto L_0x012c
        L_0x012a:
            r0 = r5
            goto L_0x012d
        L_0x012c:
            r0 = r1
        L_0x012d:
            if (r0 == 0) goto L_0x0130
            goto L_0x0132
        L_0x0130:
            if (r15 != r11) goto L_0x0134
        L_0x0132:
            r0 = r5
            goto L_0x0135
        L_0x0134:
            r0 = r1
        L_0x0135:
            if (r0 == 0) goto L_0x013c
            boolean r0 = androidx.compose.p015ui.focus.TwoDimensionalFocusSearchKt.m3118h(r2, r15, r3)
            goto L_0x0188
        L_0x013c:
            if (r15 != r8) goto L_0x0140
            r0 = r5
            goto L_0x0141
        L_0x0140:
            r0 = r1
        L_0x0141:
            if (r0 == 0) goto L_0x0162
            int[] r0 = androidx.compose.p015ui.focus.C1484q.C1485a.f3199a
            int r4 = r6.ordinal()
            r0 = r0[r4]
            if (r0 == r5) goto L_0x0156
            if (r0 != r13) goto L_0x0150
            goto L_0x0157
        L_0x0150:
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
        L_0x0156:
            r9 = r10
        L_0x0157:
            androidx.compose.ui.focus.FocusModifier r0 = androidx.compose.p015ui.focus.C1484q.m3153b(r2)
            if (r0 == 0) goto L_0x0187
            boolean r0 = androidx.compose.p015ui.focus.TwoDimensionalFocusSearchKt.m3118h(r0, r9, r3)
            goto L_0x0188
        L_0x0162:
            if (r15 != r7) goto L_0x0166
            r0 = r5
            goto L_0x0167
        L_0x0166:
            r0 = r1
        L_0x0167:
            if (r0 == 0) goto L_0x01c6
            androidx.compose.ui.focus.FocusModifier r0 = androidx.compose.p015ui.focus.C1484q.m3153b(r2)
            if (r0 == 0) goto L_0x0173
            androidx.compose.ui.focus.FocusModifier r4 = androidx.compose.p015ui.focus.C1484q.m3154c(r0)
        L_0x0173:
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r4, r2)
            if (r0 != 0) goto L_0x0187
            if (r4 != 0) goto L_0x017c
            goto L_0x0187
        L_0x017c:
            java.lang.Object r0 = r3.invoke(r4)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x0188
        L_0x0187:
            r0 = r1
        L_0x0188:
            if (r0 != 0) goto L_0x01c4
            androidx.compose.ui.focus.FocusModifier r0 = r14.f3146a
            androidx.compose.ui.focus.FocusStateImpl r0 = r0.f3153e
            boolean r0 = r0.getHasFocus()
            if (r0 == 0) goto L_0x01c1
            androidx.compose.ui.focus.FocusModifier r0 = r14.f3146a
            androidx.compose.ui.focus.FocusStateImpl r0 = r0.f3153e
            boolean r0 = r0.isFocused()
            if (r0 == 0) goto L_0x019f
            goto L_0x01c1
        L_0x019f:
            if (r15 != r5) goto L_0x01a3
            r0 = r5
            goto L_0x01a4
        L_0x01a3:
            r0 = r1
        L_0x01a4:
            if (r0 == 0) goto L_0x01a7
            goto L_0x01a9
        L_0x01a7:
            if (r15 != r13) goto L_0x01ab
        L_0x01a9:
            r0 = r5
            goto L_0x01ac
        L_0x01ab:
            r0 = r1
        L_0x01ac:
            if (r0 == 0) goto L_0x01c1
            r14.mo6185b(r1)
            androidx.compose.ui.focus.FocusModifier r0 = r14.f3146a
            androidx.compose.ui.focus.FocusStateImpl r0 = r0.f3153e
            boolean r0 = r0.isFocused()
            if (r0 != 0) goto L_0x01bc
            goto L_0x01c1
        L_0x01bc:
            boolean r15 = r14.mo6184a(r15)
            goto L_0x01c2
        L_0x01c1:
            r15 = r1
        L_0x01c2:
            if (r15 == 0) goto L_0x01c5
        L_0x01c4:
            r1 = r5
        L_0x01c5:
            return r1
        L_0x01c6:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Invalid FocusDirection"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x01d2:
            kotlin.jvm.internal.C19383o.m32805o(r3)
            throw r4
        L_0x01d6:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "invalid FocusDirection"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x01e2:
            kotlin.jvm.internal.C19383o.m32805o(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.focus.FocusManagerImpl.mo6184a(int):boolean");
    }

    /* renamed from: b */
    public final void mo6185b(boolean z) {
        FocusStateImpl focusStateImpl;
        FocusModifier focusModifier = this.f3146a;
        FocusStateImpl focusStateImpl2 = focusModifier.f3153e;
        if (C1482p.m3145c(focusModifier, z)) {
            FocusModifier focusModifier2 = this.f3146a;
            switch (C1454a.f3149a[focusStateImpl2.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    focusStateImpl = FocusStateImpl.Active;
                    break;
                case 4:
                case 5:
                    focusStateImpl = FocusStateImpl.Deactivated;
                    break;
                case 6:
                    focusStateImpl = FocusStateImpl.Inactive;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            focusModifier2.mo6187b(focusStateImpl);
        }
    }
}
