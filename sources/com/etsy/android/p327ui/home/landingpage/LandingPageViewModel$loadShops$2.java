package com.etsy.android.p327ui.home.landingpage;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.p327ui.home.landingpage.C10023e;
import com.etsy.android.p327ui.home.landingpage.C10027f;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.home.landingpage.LandingPageViewModel$loadShops$2 */
final class LandingPageViewModel$loadShops$2 extends Lambda implements C19857l<C10023e, C19394m> {
    public final /* synthetic */ LandingPageViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LandingPageViewModel$loadShops$2(LandingPageViewModel landingPageViewModel) {
        super(1);
        this.this$0 = landingPageViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10023e) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10023e eVar) {
        LandingPageViewModel.m18183b(this.this$0.f22050h, C10027f.C10032e.f22082a);
        if (eVar instanceof C10023e.C10026c) {
            C10023e.C10026c cVar = (C10023e.C10026c) eVar;
            LandingPageViewModel.m18183b(this.this$0.f22050h, new C10027f.C10030c((List<? extends BaseModel>) cVar.f22075a));
            this.this$0.mo33264f(cVar.f22077c, cVar.f22075a.size(), cVar.f22076b);
        } else if (eVar instanceof C10023e.C10025b) {
            int i = ((C10023e.C10025b) eVar).f22073b;
            if (i >= 400 && i < 500) {
                this.this$0.f22047e.mo45474a("cbf.home.landing_page.error.load_shops_error");
            }
            LandingPageViewModel.m18183b(this.this$0.f22050h, C10027f.C10031d.f22081a);
            this.this$0.mo33263e().f29307c = true;
        } else if (eVar instanceof C10023e.C10024a) {
            LandingPageViewModel.m18183b(this.this$0.f22050h, C10027f.C10031d.f22081a);
            this.this$0.mo33263e().f29307c = true;
        }
    }
}
