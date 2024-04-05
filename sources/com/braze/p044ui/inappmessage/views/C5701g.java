package com.braze.p044ui.inappmessage.views;

import android.view.View;
import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.CartErrorResolution;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.p327ui.cart.clicklisteners.C9282g;
import com.etsy.android.p327ui.cart.viewholders.C9388j;
import com.etsy.android.p327ui.navigation.keys.bottomsheetkeys.ListingSelectQuantityBottomSheetKey;
import com.etsy.android.stylekit.views.CollagePlayerView;
import com.etsy.android.stylekit.views.ratings.CollageRatingButtons;
import com.google.android.exoplayer2.p526ui.StyledPlayerControlView;
import com.paypal.android.platform.authsdk.otplogin.p533ui.login.OtpLoginFragment;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p356ge.C12790b;
import p423pf.C13236g;

/* renamed from: com.braze.ui.inappmessage.views.g */
public final /* synthetic */ class C5701g implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f12097b;

    /* renamed from: c */
    public final /* synthetic */ Object f12098c;

    public /* synthetic */ C5701g(Object obj, int i) {
        this.f12097b = i;
        this.f12098c = obj;
    }

    public final void onClick(View view) {
        switch (this.f12097b) {
            case 0:
                ((InAppMessageModalView) this.f12098c).lambda$resetMessageMargins$0(view);
                return;
            case 1:
                CollagePlayerView.m34891onFinishInflate$lambda3((CollagePlayerView) this.f12098c, view);
                return;
            case 2:
                CollageRatingButtons.m34908_init_$lambda2((CollageRatingButtons) this.f12098c, view);
                return;
            case 3:
                C9388j jVar = (C9388j) this.f12098c;
                int i = C9388j.f20789f;
                C19383o.m32797g(jVar, "this$0");
                Object tag = jVar.f20791d.getTag(R.id.tag_alert_primary_action);
                ServerDrivenAction serverDrivenAction = tag instanceof ServerDrivenAction ? (ServerDrivenAction) tag : null;
                Object tag2 = jVar.f20791d.getTag(R.id.tag_alert_resolution);
                CartErrorResolution cartErrorResolution = tag2 instanceof CartErrorResolution ? (CartErrorResolution) tag2 : null;
                String type = serverDrivenAction != null ? serverDrivenAction.getType() : null;
                if (type != null) {
                    switch (type.hashCode()) {
                        case -1992937663:
                            if (type.equals(ServerDrivenAction.TYPE_UPDATE_QUANTITY) && cartErrorResolution != null) {
                                int quantity = cartErrorResolution.getQuantity();
                                C9282g gVar = jVar.f20790c;
                                View view2 = jVar.itemView;
                                C19383o.m32796f(view2, "itemView");
                                gVar.getClass();
                                C19383o.m32797g(serverDrivenAction, ResponseConstants.ACTION);
                                C12790b.m20430b(gVar.mo45889a(), new ListingSelectQuantityBottomSheetKey(C12790b.m20432d(gVar.mo45889a()), serverDrivenAction, C13236g.C13237a.m20892a(view2), 1, quantity));
                                C8703p pVar = gVar.f28980b;
                                if (pVar != null) {
                                    pVar.mo21333d("cart_quantity_selector_tapped", (Map<? extends AnalyticsProperty, Object>) null);
                                    return;
                                }
                                return;
                            }
                            return;
                        case -934610812:
                            if (type.equals("remove")) {
                                C9282g gVar2 = jVar.f20790c;
                                View view3 = jVar.itemView;
                                C19383o.m32796f(view3, "itemView");
                                gVar2.mo45936d(view3, serverDrivenAction);
                                return;
                            }
                            return;
                        case -600386989:
                            if (type.equals(ServerDrivenAction.TYPE_UPDATE_PRICE)) {
                                C9282g gVar3 = jVar.f20790c;
                                View view4 = jVar.itemView;
                                C19383o.m32796f(view4, "itemView");
                                gVar3.mo45936d(view4, serverDrivenAction);
                                return;
                            }
                            return;
                        case 405656755:
                            if (type.equals(ServerDrivenAction.TYPE_UPDATE_SHIPPING_DESTINATION) && cartErrorResolution != null) {
                                C9282g gVar4 = jVar.f20790c;
                                View view5 = jVar.itemView;
                                C19383o.m32796f(view5, "itemView");
                                gVar4.getClass();
                                C19383o.m32797g(serverDrivenAction, ResponseConstants.ACTION);
                                gVar4.f20499e.showSelectShippingDestinationDialog(C13236g.C13237a.m20892a(view5), serverDrivenAction, cartErrorResolution);
                                return;
                            }
                            return;
                        case 1159540416:
                            if (type.equals(ServerDrivenAction.TYPE_RESOLVE_CUSTOMIZATION)) {
                                C9282g gVar5 = jVar.f20790c;
                                View view6 = jVar.itemView;
                                C19383o.m32796f(view6, "itemView");
                                gVar5.getClass();
                                C19383o.m32797g(serverDrivenAction, ResponseConstants.ACTION);
                                gVar5.f20499e.showVariationSelectDialog(C13236g.C13237a.m20892a(view6), serverDrivenAction);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                } else {
                    return;
                }
            case 4:
                StyledPlayerControlView.C14403f fVar = (StyledPlayerControlView.C14403f) this.f12098c;
                StyledPlayerControlView.this.onSettingViewClicked(fVar.getAdapterPosition());
                return;
            default:
                OtpLoginFragment.m35131onViewCreated$lambda5((OtpLoginFragment) this.f12098c, view);
                return;
        }
    }
}
