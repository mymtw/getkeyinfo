package androidx.compose.p015ui.window;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.window.g */
public final class C2094g {

    /* renamed from: androidx.compose.ui.window.g$a */
    public /* synthetic */ class C2095a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4736a;

        static {
            int[] iArr = new int[SecureFlagPolicy.values().length];
            iArr[SecureFlagPolicy.SecureOff.ordinal()] = 1;
            iArr[SecureFlagPolicy.SecureOn.ordinal()] = 2;
            iArr[SecureFlagPolicy.Inherit.ordinal()] = 3;
            f4736a = iArr;
        }
    }

    /* renamed from: a */
    public static final boolean m4527a(SecureFlagPolicy secureFlagPolicy, boolean z) {
        C19383o.m32797g(secureFlagPolicy, "<this>");
        int i = C2095a.f4736a[secureFlagPolicy.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 3) {
            return z;
        }
        throw new NoWhenBranchMatchedException();
    }
}
