package p716xo;

import androidx.fragment.app.Fragment;
import com.paypal.android.platform.authsdk.authcommon.p531ui.AuthPresenter;
import com.paypal.android.platform.authsdk.authcommon.p531ui.PartnerHostNavigationController;
import kotlin.jvm.internal.C19383o;

/* renamed from: xo.d */
public final class C18832d implements PartnerHostNavigationController {

    /* renamed from: a */
    public final AuthPresenter f41704a;

    public C18832d(AuthPresenter authPresenter) {
        C19383o.m32797g(authPresenter, "authPresenter");
        this.f41704a = authPresenter;
    }

    public final void dismiss(Fragment fragment, boolean z) {
        C19383o.m32797g(fragment, "fragment");
        this.f41704a.onViewDismissRequested(fragment, z);
    }

    public final void navigate(Fragment fragment, boolean z) {
        C19383o.m32797g(fragment, "fragment");
        this.f41704a.onViewPresentRequested(fragment, z);
    }
}
