package com.etsy.android.stylekit.views;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.lib.models.apiv3.cart.InfoModal;
import com.etsy.android.p327ui.navigation.keys.bottomsheetkeys.DetailsBottomSheetNavigationKey;
import com.paypal.pyplcheckout.home.view.adapters.WebAddCardViewHolder;
import com.paypal.pyplcheckout.home.view.customviews.CardUiModel;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p356ge.C12788a;
import p491ye.C13915a;
import p491ye.C13916b;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.stylekit.views.r */
public final /* synthetic */ class C9069r implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f19951b;

    /* renamed from: c */
    public final /* synthetic */ Object f19952c;

    /* renamed from: d */
    public final /* synthetic */ Object f19953d;

    public /* synthetic */ C9069r(int i, Object obj, Object obj2) {
        this.f19951b = i;
        this.f19952c = obj;
        this.f19953d = obj2;
    }

    public final void onClick(View view) {
        switch (this.f19951b) {
            case 0:
                CollageTextWithTooltip.m34901_init_$lambda2((PopupWindow) this.f19952c, (CollageTextWithTooltip) this.f19953d, view);
                return;
            case 1:
                C19857l lVar = (C19857l) this.f19952c;
                C13915a aVar = (C13915a) this.f19953d;
                C19383o.m32797g(aVar, "this$0");
                if (lVar != null) {
                    lVar.invoke(new C13916b.C13918b(aVar.f30578d));
                }
                aVar.f30575a.dismiss();
                return;
            case 2:
                C19846a aVar2 = (C19846a) this.f19952c;
                InfoModal infoModal = (InfoModal) this.f19953d;
                C19383o.m32797g(aVar2, "$analyticsEvent");
                aVar2.invoke();
                Context context = view.getContext();
                String str = null;
                FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
                String c0 = C19421p.m32935c0(fragmentActivity);
                String title = infoModal != null ? infoModal.getTitle() : null;
                if (infoModal != null) {
                    str = infoModal.getBody();
                }
                C12788a.m20424c(fragmentActivity, new DetailsBottomSheetNavigationKey(c0, title, str));
                return;
            default:
                WebAddCardViewHolder.m35268bind$lambda0((WebAddCardViewHolder) this.f19952c, (CardUiModel.AddCardUiModel.Web) this.f19953d, view);
                return;
        }
    }
}
