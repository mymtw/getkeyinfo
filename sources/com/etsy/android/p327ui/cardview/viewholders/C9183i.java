package com.etsy.android.p327ui.cardview.viewholders;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.CartCollageAlert;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.p327ui.cart.clicklisteners.C9282g;
import com.etsy.android.p327ui.cart.viewholders.C9370c;
import com.etsy.android.stylekit.views.CollageAlert;
import java.util.List;
import java.util.Map;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cardview.viewholders.i */
public final class C9183i extends C9370c {

    /* renamed from: c */
    public final C9282g f20219c;

    /* renamed from: d */
    public final C8703p f20220d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9183i(ViewGroup viewGroup, C9282g gVar, C8703p pVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_alert, viewGroup, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(pVar, "analyticsTracker");
        this.f20219c = gVar;
        this.f20220d = pVar;
    }

    /* renamed from: g */
    public final void mo31413g(CartGroupItem cartGroupItem) {
        C19383o.m32797g(cartGroupItem, "item");
        BaseModel data = cartGroupItem.getData();
        CartCollageAlert cartCollageAlert = data instanceof CartCollageAlert ? (CartCollageAlert) data : null;
        if (cartCollageAlert != null) {
            View view = this.itemView;
            C19383o.m32795e(view, "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageAlert");
            CollageAlert collageAlert = (CollageAlert) view;
            collageAlert.setAlertType(cartCollageAlert.getType());
            collageAlert.setTitleText(cartCollageAlert.getTitle());
            CollageAlert.setBodyText$default(collageAlert, cartCollageAlert.getBody(), (Drawable) null, 2, (Object) null);
            collageAlert.setIcon(cartCollageAlert.getIcon());
            collageAlert.showDismissButton(cartCollageAlert.isDismissible());
            List<ServerDrivenAction> actions = cartGroupItem.getActions();
            C19383o.m32796f(actions, "item.actions");
            ServerDrivenAction serverDrivenAction = (ServerDrivenAction) C19327t.m32641W0(0, actions);
            if (serverDrivenAction != null) {
                collageAlert.setMainButtonText(serverDrivenAction.getDisplayName());
                collageAlert.setMainButtonClickListener(new C9180h(cartCollageAlert.getAnalyticsName(), this, serverDrivenAction));
            }
            List<ServerDrivenAction> actions2 = cartGroupItem.getActions();
            C19383o.m32796f(actions2, "item.actions");
            ServerDrivenAction serverDrivenAction2 = (ServerDrivenAction) C19327t.m32641W0(1, actions2);
            if (serverDrivenAction2 != null) {
                collageAlert.setAltButtonText(serverDrivenAction2.getDisplayName());
                collageAlert.setAltButtonClickListener(new C9180h(cartCollageAlert.getAnalyticsName(), this, serverDrivenAction2));
            }
            if (cartCollageAlert.getAnalyticsName() != null) {
                C8703p pVar = this.f20220d;
                pVar.mo21333d(cartCollageAlert.getAnalyticsName() + "_viewed", (Map<? extends AnalyticsProperty, Object>) null);
            }
        }
    }
}
