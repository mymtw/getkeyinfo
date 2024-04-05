package com.etsy.android.p327ui.cart.clicklisteners;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.lib.models.apiv3.vespa.UserAction;
import com.etsy.android.p327ui.cardview.clickhandlers.ShopCardClickHandler;
import com.etsy.android.p327ui.cart.C9332q;
import com.etsy.android.p327ui.cart.C9333r;
import com.etsy.android.p327ui.util.C11780h;
import com.etsy.android.vespa.VespaBottomSheetDialog;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p415of.C13171a;
import p415of.C13186o;
import p423pf.C13239i;
import p456ua.C13461f;

/* renamed from: com.etsy.android.ui.cart.clicklisteners.CartShopHeaderClickHandler */
public final class CartShopHeaderClickHandler extends C9282g {

    /* renamed from: f */
    public final C9332q f20471f;

    /* renamed from: g */
    public final ShopCardClickHandler f20472g;

    /* renamed from: com.etsy.android.ui.cart.clicklisteners.CartShopHeaderClickHandler$a */
    public static final class C9269a extends C13171a<UserAction> {

        /* renamed from: d */
        public final /* synthetic */ CartShopHeaderClickHandler f20473d;

        /* renamed from: e */
        public final /* synthetic */ View f20474e;

        /* renamed from: f */
        public final /* synthetic */ VespaBottomSheetDialog f20475f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9269a(Fragment fragment, CartShopHeaderClickHandler cartShopHeaderClickHandler, View view, VespaBottomSheetDialog vespaBottomSheetDialog, C8703p pVar) {
            super(fragment, pVar);
            this.f20473d = cartShopHeaderClickHandler;
            this.f20474e = view;
            this.f20475f = vespaBottomSheetDialog;
        }

        /* renamed from: c */
        public final void mo31328c(Object obj) {
            UserAction userAction = (UserAction) obj;
            C19383o.m32797g(userAction, "data");
            ServerDrivenAction serverDrivenAction = (ServerDrivenAction) userAction;
            this.f20473d.mo45936d(this.f20474e, serverDrivenAction);
            String type = serverDrivenAction.getType();
            if (C19383o.m32792b(type, UserAction.TYPE_CONTACT_SHOP)) {
                this.f28980b.mo21333d("contact_shop_clicked", (Map<? extends AnalyticsProperty, Object>) null);
            } else if (C19383o.m32792b(type, UserAction.TYPE_SINGLE_SHOP_CHECKOUT)) {
                this.f28980b.mo21333d("single_shop_checkout_clicked", (Map<? extends AnalyticsProperty, Object>) null);
            } else {
                this.f28980b.mo21333d("shop_options_dismissed", (Map<? extends AnalyticsProperty, Object>) null);
            }
            this.f20475f.dismiss();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CartShopHeaderClickHandler(C9333r rVar, Fragment fragment, C11780h hVar, C13461f fVar, C8703p pVar, C9332q qVar) {
        super(fragment, pVar, rVar);
        C19383o.m32797g(rVar, "cartActionDelegate");
        C19383o.m32797g(fragment, "fragment");
        C19383o.m32797g(hVar, "favoriteRepository");
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(pVar, "viewTracker");
        C19383o.m32797g(qVar, "cartViewEligibility");
        this.f20471f = qVar;
        this.f20472g = new ShopCardClickHandler(fragment, pVar, hVar, fVar);
    }

    /* renamed from: f */
    public final void mo31599f(View view, CartGroupItem cartGroupItem) {
        C19383o.m32797g(view, "viewHolderRoot");
        C19383o.m32797g(cartGroupItem, CartGroupItem.ELEMENT_SHOP_HEADER);
        Fragment a = mo45889a();
        if (cartGroupItem.getActions().size() > 0 && a != null) {
            VespaBottomSheetDialog vespaBottomSheetDialog = new VespaBottomSheetDialog(a, this.f28980b);
            if (this.f20471f.f20606a.mo21132b(C8592b.C8597e.f18869a)) {
                vespaBottomSheetDialog.addItem((C13186o) cartGroupItem);
                vespaBottomSheetDialog.registerItemClickHandler(cartGroupItem.getViewType(), new C13239i(a, view, this.f28980b, this.f20499e, new CartShopHeaderClickHandler$openCartOptions$1(vespaBottomSheetDialog)));
                vespaBottomSheetDialog.setOnDismissListener(new C9286k(this));
            } else {
                vespaBottomSheetDialog.addItems(cartGroupItem.getActions());
            }
            vespaBottomSheetDialog.registerItemClickHandler(cartGroupItem.getActions().get(0).getViewType(), new C9269a(a, this, view, vespaBottomSheetDialog, this.f28980b));
            vespaBottomSheetDialog.show();
        }
    }
}
