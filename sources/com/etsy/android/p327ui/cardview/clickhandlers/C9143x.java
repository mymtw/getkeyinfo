package com.etsy.android.p327ui.cardview.clickhandlers;

import androidx.fragment.app.Fragment;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.apiv3.cart.InfoModal;
import com.etsy.android.lib.models.cardviewelement.TooltipButton;
import com.etsy.android.p327ui.navigation.keys.bottomsheetkeys.DetailsBottomSheetNavigationKey;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p356ge.C12790b;
import p415of.C13171a;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.cardview.clickhandlers.x */
public final class C9143x extends C13171a<TooltipButton> {

    /* renamed from: d */
    public final C8703p f20086d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9143x(Fragment fragment, C8703p pVar) {
        super(fragment, pVar);
        C19383o.m32797g(pVar, "analyticsTracker");
        this.f20086d = pVar;
    }

    /* renamed from: c */
    public final void mo31328c(Object obj) {
        Fragment a;
        TooltipButton tooltipButton = (TooltipButton) obj;
        C19383o.m32797g(tooltipButton, "data");
        String str = null;
        if (C18263b.m30839d0(C19388s.m32863g0(tooltipButton))) {
            C8703p pVar = this.f20086d;
            pVar.mo21333d(C19388s.m32863g0(tooltipButton) + "_clicked", (Map<? extends AnalyticsProperty, Object>) null);
        }
        if (tooltipButton.getInfoModal() != null && (a = mo45889a()) != null) {
            String d = C12790b.m20432d(mo45889a());
            InfoModal infoModal = tooltipButton.getInfoModal();
            String title = infoModal != null ? infoModal.getTitle() : null;
            InfoModal infoModal2 = tooltipButton.getInfoModal();
            if (infoModal2 != null) {
                str = infoModal2.getBody();
            }
            C12790b.m20430b(a, new DetailsBottomSheetNavigationKey(d, title, str));
        }
    }
}
