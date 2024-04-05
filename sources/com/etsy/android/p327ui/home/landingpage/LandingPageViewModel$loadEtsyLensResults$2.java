package com.etsy.android.p327ui.home.landingpage;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.p327ui.home.landingpage.C10013a;
import com.etsy.android.p327ui.home.landingpage.C10027f;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.home.landingpage.LandingPageViewModel$loadEtsyLensResults$2 */
final class LandingPageViewModel$loadEtsyLensResults$2 extends Lambda implements C19857l<C10013a, C19394m> {
    public final /* synthetic */ LandingPageViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LandingPageViewModel$loadEtsyLensResults$2(LandingPageViewModel landingPageViewModel) {
        super(1);
        this.this$0 = landingPageViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10013a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10013a aVar) {
        LandingPageViewModel.m18183b(this.this$0.f22050h, C10027f.C10032e.f22082a);
        if (aVar instanceof C10013a.C10016c) {
            C10013a.C10016c cVar = (C10013a.C10016c) aVar;
            LandingPageViewModel.m18183b(this.this$0.f22050h, new C10027f.C10030c((List<? extends BaseModel>) cVar.f22059a));
            this.this$0.mo33264f(cVar.f22061c, cVar.f22059a.size(), cVar.f22060b);
        } else if (aVar instanceof C10013a.C10015b) {
            int i = ((C10013a.C10015b) aVar).f22057b;
            if (i >= 400 && i < 500) {
                this.this$0.f22047e.mo45474a("cbf.home.landing_page.error.load_listings_error");
            }
            LandingPageViewModel.m18183b(this.this$0.f22050h, C10027f.C10031d.f22081a);
            this.this$0.mo33263e().f29307c = true;
        } else if (aVar instanceof C10013a.C10014a) {
            LandingPageViewModel.m18183b(this.this$0.f22050h, C10027f.C10031d.f22081a);
            this.this$0.mo33263e().f29307c = true;
        }
    }
}
