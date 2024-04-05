package com.etsy.android.p327ui.home.landingpage;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.p327ui.home.landingpage.C10017b;
import com.etsy.android.p327ui.home.landingpage.C10027f;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.home.landingpage.LandingPageViewModel$loadListings$2 */
final class LandingPageViewModel$loadListings$2 extends Lambda implements C19857l<C10017b, C19394m> {
    public final /* synthetic */ LandingPageViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LandingPageViewModel$loadListings$2(LandingPageViewModel landingPageViewModel) {
        super(1);
        this.this$0 = landingPageViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10017b) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10017b bVar) {
        LandingPageViewModel.m18183b(this.this$0.f22050h, C10027f.C10032e.f22082a);
        if (bVar instanceof C10017b.C10020c) {
            C10017b.C10020c cVar = (C10017b.C10020c) bVar;
            LandingPageViewModel.m18183b(this.this$0.f22050h, new C10027f.C10030c((List<? extends BaseModel>) cVar.f22066a));
            this.this$0.mo33264f(cVar.f22068c, cVar.f22066a.size(), cVar.f22067b);
        } else if (bVar instanceof C10017b.C10019b) {
            int i = ((C10017b.C10019b) bVar).f22064b;
            if (i >= 400 && i < 500) {
                this.this$0.f22047e.mo45474a("cbf.home.landing_page.error.load_listings_error");
            }
            LandingPageViewModel.m18183b(this.this$0.f22050h, C10027f.C10031d.f22081a);
            this.this$0.mo33263e().f29307c = true;
        } else if (bVar instanceof C10017b.C10018a) {
            LandingPageViewModel.m18183b(this.this$0.f22050h, C10027f.C10031d.f22081a);
            this.this$0.mo33263e().f29307c = true;
        }
    }
}
