package com.etsy.android.p327ui.cart.viewholders;

import android.view.View;
import com.etsy.android.lib.models.apiv3.Image;
import com.etsy.android.lib.models.apiv3.cart.GiftOptions;
import com.etsy.android.p327ui.cart.clicklisteners.C9288m;
import com.etsy.android.p327ui.favorites.search.clusters.ClusterItem;
import com.etsy.android.p327ui.favorites.search.clusters.ClusterViewHolder;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.GiftWrapKey;
import com.etsy.android.p327ui.user.PhabletsFragment;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.home.view.adapters.OfferViewHolder;
import com.paypal.pyplcheckout.home.view.customviews.CardUiModel;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p356ge.C12788a;

/* renamed from: com.etsy.android.ui.cart.viewholders.q */
public final /* synthetic */ class C9403q implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f20839b;

    /* renamed from: c */
    public final /* synthetic */ Object f20840c;

    /* renamed from: d */
    public final /* synthetic */ Object f20841d;

    public /* synthetic */ C9403q(int i, Object obj, Object obj2) {
        this.f20839b = i;
        this.f20840c = obj;
        this.f20841d = obj2;
    }

    public final void onClick(View view) {
        switch (this.f20839b) {
            case 0:
                C9405s sVar = (C9405s) this.f20840c;
                GiftOptions giftOptions = (GiftOptions) this.f20841d;
                sVar.getClass();
                if (giftOptions != null && giftOptions.getGiftWrap() != null) {
                    C9288m mVar = sVar.f20843c;
                    String shopName = giftOptions.getGiftWrap().getShopName();
                    String description = giftOptions.getGiftWrap().getDescription();
                    Image previewImage = giftOptions.getGiftWrap().getPreviewImage();
                    String c0 = C19421p.m32935c0(mVar.mo45889a().getActivity());
                    C19383o.m32797g(shopName, "shopName");
                    C19383o.m32797g(description, "description");
                    C12788a.m20424c(mVar.mo45889a().getActivity(), new GiftWrapKey(c0, shopName, description, previewImage));
                    return;
                }
                return;
            case 1:
                ClusterViewHolder clusterViewHolder = (ClusterViewHolder) this.f20840c;
                ClusterItem clusterItem = (ClusterItem) this.f20841d;
                int i = ClusterViewHolder.f21813g;
                C19383o.m32797g(clusterViewHolder, "this$0");
                C19383o.m32797g(clusterItem, "$it");
                clusterViewHolder.f21814c.invoke(clusterItem);
                return;
            case 2:
                PhabletsFragment.C11337b.C11338a aVar = (PhabletsFragment.C11337b.C11338a) this.f20840c;
                PhabletsFragment.C11335a aVar2 = (PhabletsFragment.C11335a) this.f20841d;
                int i2 = PhabletsFragment.C11337b.C11339b.f25004e;
                C19383o.m32797g(aVar, "$clickListener");
                C19383o.m32797g(aVar2, "$phablet");
                aVar.mo37100a(aVar2);
                return;
            case 3:
                OfferViewHolder.m35267bind$lambda0((OfferViewHolder) this.f20840c, (CardUiModel.OfferCardUiModel) this.f20841d, view);
                return;
            default:
                PYPLCheckoutUtils.m35471showErrorDialog$lambda21((PEnums.EventCode) this.f20840c, (PYPLCheckoutUtils) this.f20841d, view);
                return;
        }
    }
}
