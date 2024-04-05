package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C19383o;

public final class GetRetainInstanceUsageViolation extends RetainInstanceUsageViolation {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetRetainInstanceUsageViolation(Fragment fragment) {
        super(fragment, C19383o.m32802l(fragment, "Attempting to get retain instance for fragment "));
        C19383o.m32797g(fragment, "fragment");
    }
}
