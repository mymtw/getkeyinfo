package com.etsy.android.p327ui.home.etsylens;

import com.etsy.android.R;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.util.C12060q;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.home.etsylens.EtsyLensPresenter$handleEtsyLensEvent$7 */
final class EtsyLensPresenter$handleEtsyLensEvent$7 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ EtsyLensPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EtsyLensPresenter$handleEtsyLensEvent$7(EtsyLensPresenter etsyLensPresenter) {
        super(1);
        this.this$0 = etsyLensPresenter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        C9974e eVar = this.this$0.f21944c;
        eVar.getClass();
        LogCatKt.m17045a().mo21309d("Error resizing image for EtsyLens search", th);
        C12060q.m19871b(eVar.f21962d, new C9974e.C9975a.C9983h(eVar.f21960b.mo38059c(R.string.etsy_lens_image_save_error, new Object[0])));
    }
}
