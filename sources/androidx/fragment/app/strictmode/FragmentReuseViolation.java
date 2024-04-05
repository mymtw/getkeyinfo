package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C19383o;

public final class FragmentReuseViolation extends Violation {
    private final String previousFragmentId;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentReuseViolation(Fragment fragment, String str) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        C19383o.m32797g(fragment, "fragment");
        C19383o.m32797g(str, "previousFragmentId");
        this.previousFragmentId = str;
    }

    public final String getPreviousFragmentId() {
        return this.previousFragmentId;
    }
}
