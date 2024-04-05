package com.etsy.android.p327ui.cardview.clickhandlers;

import androidx.appcompat.widget.C0326j;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.StyledBannerModel;
import com.etsy.android.lib.models.apiv3.cart.InfoModal;
import com.etsy.android.p327ui.navigation.keys.bottomsheetkeys.DetailsBottomSheetNavigationKey;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p356ge.C12790b;
import p363he.C12821d;
import p415of.C13171a;
import p423pf.C13236g;

/* renamed from: com.etsy.android.ui.cardview.clickhandlers.y */
public final class C9144y extends C13171a<StyledBannerModel> {

    /* renamed from: d */
    public final C8703p f20087d;

    /* renamed from: e */
    public final C13236g f20088e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9144y(Fragment fragment, C8703p pVar, C13236g gVar) {
        super(fragment, pVar);
        C19383o.m32797g(pVar, "viewAnalyticsTracker");
        this.f20087d = pVar;
        this.f20088e = gVar;
    }

    /* renamed from: d */
    public final void mo31328c(StyledBannerModel styledBannerModel) {
        C19383o.m32797g(styledBannerModel, "data");
        String analyticsName = styledBannerModel.getAnalyticsName();
        boolean z = true;
        if (styledBannerModel.getDeepLink().length() > 0) {
            if (analyticsName.length() <= 0) {
                z = false;
            }
            if (z) {
                this.f20087d.mo21333d(C0326j.m864i(analyticsName, "_tapped"), C19388s.m32882r0(styledBannerModel));
            }
            C12790b.m20430b(mo45889a(), new C12821d(styledBannerModel.getDeepLink()));
        } else if (styledBannerModel.getInfoModal() != null) {
            mo31367e(styledBannerModel.getInfoModal(), analyticsName, C19388s.m32882r0(styledBannerModel));
        }
    }

    /* renamed from: e */
    public final void mo31367e(InfoModal infoModal, String str, Map<AnalyticsProperty, ? extends Object> map) {
        C19383o.m32797g(str, "analyticsName");
        if (str.length() > 0) {
            C8703p pVar = this.f20087d;
            pVar.mo21333d(str + "_info_modal_tapped", map);
        }
        Fragment a = mo45889a();
        String d = C12790b.m20432d(mo45889a());
        String str2 = null;
        String title = infoModal != null ? infoModal.getTitle() : null;
        if (infoModal != null) {
            str2 = infoModal.getBody();
        }
        C12790b.m20430b(a, new DetailsBottomSheetNavigationKey(d, title, str2));
    }
}
