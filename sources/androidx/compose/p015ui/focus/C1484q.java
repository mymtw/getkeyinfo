package androidx.compose.p015ui.focus;

import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import p219r.C7734e;

/* renamed from: androidx.compose.ui.focus.q */
public final class C1484q {

    /* renamed from: androidx.compose.ui.focus.q$a */
    public /* synthetic */ class C1485a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3199a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f3200b;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Rtl.ordinal()] = 1;
            iArr[LayoutDirection.Ltr.ordinal()] = 2;
            f3199a = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            iArr2[FocusStateImpl.Active.ordinal()] = 1;
            iArr2[FocusStateImpl.Captured.ordinal()] = 2;
            iArr2[FocusStateImpl.ActiveParent.ordinal()] = 3;
            iArr2[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr2[FocusStateImpl.Inactive.ordinal()] = 5;
            iArr2[FocusStateImpl.Deactivated.ordinal()] = 6;
            f3200b = iArr2;
        }
    }

    /* renamed from: a */
    public static final C7734e<FocusModifier> m3152a(FocusModifier focusModifier) {
        boolean z;
        C7734e<FocusModifier> eVar = focusModifier.f3152d;
        int i = eVar.f17157d;
        int i2 = 0;
        if (i > 0) {
            T[] tArr = eVar.f17155b;
            int i3 = 0;
            while (true) {
                if (!((FocusModifier) tArr[i3]).f3153e.isDeactivated()) {
                    i3++;
                    if (i3 >= i) {
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        if (!z) {
            return focusModifier.f3152d;
        }
        C7734e<FocusModifier> eVar2 = new C7734e<>(new FocusModifier[16]);
        C7734e<FocusModifier> eVar3 = focusModifier.f3152d;
        int i4 = eVar3.f17157d;
        if (i4 > 0) {
            T[] tArr2 = eVar3.f17155b;
            do {
                FocusModifier focusModifier2 = (FocusModifier) tArr2[i2];
                if (!focusModifier2.f3153e.isDeactivated()) {
                    eVar2.mo20232c(focusModifier2);
                } else {
                    eVar2.mo20233e(eVar2.f17157d, m3152a(focusModifier2));
                }
                i2++;
            } while (i2 < i4);
        }
        return eVar2;
    }

    /* renamed from: b */
    public static final FocusModifier m3153b(FocusModifier focusModifier) {
        C19383o.m32797g(focusModifier, "<this>");
        switch (C1485a.f3200b[focusModifier.f3153e.ordinal()]) {
            case 1:
            case 2:
                return focusModifier;
            case 3:
            case 4:
                FocusModifier focusModifier2 = focusModifier.f3154f;
                if (focusModifier2 != null) {
                    return m3153b(focusModifier2);
                }
                break;
            case 5:
            case 6:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return null;
    }

    /* renamed from: c */
    public static final FocusModifier m3154c(FocusModifier focusModifier) {
        FocusModifier focusModifier2 = focusModifier.f3151c;
        if (focusModifier2 == null) {
            return null;
        }
        switch (C1485a.f3200b[focusModifier.f3153e.ordinal()]) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
                return m3154c(focusModifier2);
            case 3:
                return focusModifier;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = androidx.activity.C0114h.m294Y(r2).mo6689v(r2, false);
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p288y.C8345d m3155d(androidx.compose.p015ui.focus.FocusModifier r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r2, r0)
            androidx.compose.ui.node.LayoutNodeWrapper r2 = r2.f3161m
            if (r2 == 0) goto L_0x0014
            androidx.compose.ui.layout.j r0 = androidx.activity.C0114h.m294Y(r2)
            r1 = 0
            y.d r2 = r0.mo6689v(r2, r1)
            if (r2 != 0) goto L_0x0016
        L_0x0014:
            y.d r2 = p288y.C8345d.f18300e
        L_0x0016:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.focus.C1484q.m3155d(androidx.compose.ui.focus.FocusModifier):y.d");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r2 = r3.f3850f;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m3156e(androidx.compose.p015ui.focus.FocusModifier r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r3, r0)
            androidx.compose.ui.node.LayoutNodeWrapper r3 = r3.f3161m
            r0 = 1
            r1 = 0
            if (r3 == 0) goto L_0x0015
            androidx.compose.ui.node.LayoutNode r2 = r3.f3850f
            if (r2 == 0) goto L_0x0015
            boolean r2 = r2.f3837v
            if (r2 != r0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r1
        L_0x0016:
            if (r2 == 0) goto L_0x002a
            if (r3 == 0) goto L_0x0026
            androidx.compose.ui.node.LayoutNode r3 = r3.f3850f
            if (r3 == 0) goto L_0x0026
            boolean r3 = r3.mo6696c()
            if (r3 != r0) goto L_0x0026
            r3 = r0
            goto L_0x0027
        L_0x0026:
            r3 = r1
        L_0x0027:
            if (r3 == 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r0 = r1
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.focus.C1484q.m3156e(androidx.compose.ui.focus.FocusModifier):boolean");
    }
}
