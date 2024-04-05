package androidx.compose.p015ui.focus;

import kotlin.NoWhenBranchMatchedException;

/* renamed from: androidx.compose.ui.focus.FocusStateImpl */
public enum FocusStateImpl implements C1481o {
    Active,
    ActiveParent,
    Captured,
    Deactivated,
    DeactivatedParent,
    Inactive;

    /* renamed from: androidx.compose.ui.focus.FocusStateImpl$a */
    public /* synthetic */ class C1462a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3170a = null;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Captured.ordinal()] = 1;
            iArr[FocusStateImpl.Active.ordinal()] = 2;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 4;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            f3170a = iArr;
        }
    }

    public boolean getHasFocus() {
        switch (C1462a.f3170a[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 5:
                return true;
            case 4:
            case 6:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public boolean isCaptured() {
        switch (C1462a.f3170a[ordinal()]) {
            case 1:
                return true;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isDeactivated() {
        switch (C1462a.f3170a[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 6:
                return false;
            case 4:
            case 5:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public boolean isFocused() {
        switch (C1462a.f3170a[ordinal()]) {
            case 1:
            case 2:
                return true;
            case 3:
            case 4:
            case 5:
            case 6:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
