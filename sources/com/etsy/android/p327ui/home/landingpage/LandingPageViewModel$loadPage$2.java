package com.etsy.android.p327ui.home.landingpage;

import com.etsy.android.p327ui.home.landingpage.C10027f;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p464va.C13554f;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.home.landingpage.LandingPageViewModel$loadPage$2 */
final class LandingPageViewModel$loadPage$2 extends Lambda implements C19857l<C13554f, C19394m> {
    public final /* synthetic */ LandingPageViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LandingPageViewModel$loadPage$2(LandingPageViewModel landingPageViewModel) {
        super(1);
        this.this$0 = landingPageViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C13554f) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C13554f fVar) {
        if (fVar instanceof C13554f.C13556b) {
            C13554f.C13556b bVar = (C13554f.C13556b) fVar;
            LandingPageViewModel.m18183b(this.this$0.f22050h, new C10027f.C10030c(bVar.f29640a));
            LandingPageViewModel.m18183b(this.this$0.f22050h, new C10027f.C10033f(bVar.f29642c, Integer.valueOf(bVar.f29641b)));
        } else if (fVar instanceof C13554f.C13555a) {
            int code = ((C13554f.C13555a) fVar).f29638a.getCode();
            if (code >= 400 && code < 500) {
                this.this$0.f22047e.mo45474a("cbf.home.landing_page.error.load_page_error");
            }
            LandingPageViewModel.m18183b(this.this$0.f22050h, C10027f.C10029b.f22079a);
        }
    }
}
