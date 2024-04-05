package com.etsy.android.p327ui.home.etsylens;

import android.content.Context;
import com.etsy.android.p327ui.user.review.C11750u;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.home.etsylens.EtsyLensPresenter$permissionsHelper$2 */
public final class EtsyLensPresenter$permissionsHelper$2 extends Lambda implements C19846a<C11750u> {
    public final /* synthetic */ EtsyLensPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EtsyLensPresenter$permissionsHelper$2(EtsyLensPresenter etsyLensPresenter) {
        super(0);
        this.this$0 = etsyLensPresenter;
    }

    public final C11750u invoke() {
        Context requireContext = this.this$0.f21943b.requireContext();
        C19383o.m32796f(requireContext, "fragment.requireContext()");
        return new C11750u(requireContext);
    }
}
