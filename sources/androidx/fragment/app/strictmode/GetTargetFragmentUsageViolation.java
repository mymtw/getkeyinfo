package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C19383o;

public final class GetTargetFragmentUsageViolation extends TargetFragmentUsageViolation {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetTargetFragmentUsageViolation(Fragment fragment) {
        super(fragment, C19383o.m32802l(fragment, "Attempting to get target fragment from fragment "));
        C19383o.m32797g(fragment, "fragment");
    }
}
