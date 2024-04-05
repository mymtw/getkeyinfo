package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C19383o;

public final class WrongFragmentContainerViolation extends Violation {
    private final ViewGroup container;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WrongFragmentContainerViolation(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
        C19383o.m32797g(fragment, "fragment");
        C19383o.m32797g(viewGroup, "container");
        this.container = viewGroup;
    }

    public final ViewGroup getContainer() {
        return this.container;
    }
}
