package androidx.compose.p015ui.focus;

import kotlin.NoWhenBranchMatchedException;
import p219r.C7734e;

/* renamed from: androidx.compose.ui.focus.e */
public final class C1470e {

    /* renamed from: androidx.compose.ui.focus.e$a */
    public /* synthetic */ class C1471a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3179a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.Captured.ordinal()] = 2;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            f3179a = iArr;
        }
    }

    /* renamed from: a */
    public static final FocusModifier m3128a(FocusModifier focusModifier) {
        FocusModifier a;
        switch (C1471a.f3179a[focusModifier.f3153e.ordinal()]) {
            case 1:
            case 2:
                return focusModifier;
            case 3:
            case 4:
                FocusModifier focusModifier2 = focusModifier.f3154f;
                if (focusModifier2 != null && (a = m3128a(focusModifier2)) != null) {
                    return a;
                }
                throw new IllegalStateException("no child".toString());
            case 5:
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: b */
    public static final void m3129b(FocusModifier focusModifier) {
        FocusPropertiesKt.m3104a(focusModifier);
        C7734e<FocusModifier> eVar = focusModifier.f3152d;
        int i = eVar.f17157d;
        if (i > 0) {
            int i2 = 0;
            T[] tArr = eVar.f17155b;
            do {
                m3129b((FocusModifier) tArr[i2]);
                i2++;
            } while (i2 < i);
        }
    }
}
