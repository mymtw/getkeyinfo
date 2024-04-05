package com.etsy.android.p327ui.cart.viewholders;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.cart.ShopHeader;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.cardview.clickhandlers.ShopCardClickHandler;
import com.etsy.android.p327ui.cart.clicklisteners.CartShopHeaderClickHandler;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ShopHomeKey;
import com.etsy.android.p327ui.shop.ShopHomeConfig;
import com.etsy.android.stylekit.accessibility.views.AccessibilityClassNames;
import com.etsy.android.stylekit.accessibility.views.extensions.ViewsExtensionsKt;
import com.etsy.android.stylekit.views.CollageHeadingTextView;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p356ge.C12790b;

/* renamed from: com.etsy.android.ui.cart.viewholders.l0 */
public final class C9393l0 extends C9370c {

    /* renamed from: c */
    public final CollageHeadingTextView f20814c;

    /* renamed from: d */
    public final CartShopHeaderClickHandler f20815d;

    /* renamed from: e */
    public final TextView f20816e = ((TextView) mo38986f(R.id.btn_shop_policies));

    /* renamed from: f */
    public final TextView f20817f;

    /* renamed from: g */
    public final View f20818g = mo38986f(R.id.btn_shop_more);

    /* renamed from: h */
    public final Resources f20819h;

    /* renamed from: com.etsy.android.ui.cart.viewholders.l0$a */
    public class C9394a extends TrackingOnClickListener {

        /* renamed from: b */
        public final /* synthetic */ ShopHeader f20820b;

        public C9394a(ShopHeader shopHeader) {
            this.f20820b = shopHeader;
        }

        public final void onViewClick(View view) {
            if (C9393l0.this.f20815d != null && !this.f20820b.isPrivate()) {
                CartShopHeaderClickHandler cartShopHeaderClickHandler = C9393l0.this.f20815d;
                ShopHeader shopHeader = this.f20820b;
                String contentSource = shopHeader.getContentSource();
                cartShopHeaderClickHandler.getClass();
                C19383o.m32797g(shopHeader, CartGroupItem.ELEMENT_SHOP_HEADER);
                C19383o.m32797g(contentSource, "contentSource");
                cartShopHeaderClickHandler.f20472g.mo31338e(shopHeader, contentSource);
            }
        }
    }

    /* renamed from: com.etsy.android.ui.cart.viewholders.l0$b */
    public class C9395b extends TrackingOnClickListener {

        /* renamed from: b */
        public final /* synthetic */ CartGroupItem f20822b;

        public C9395b(CartGroupItem cartGroupItem) {
            this.f20822b = cartGroupItem;
        }

        public final void onViewClick(View view) {
            C9393l0 l0Var = C9393l0.this;
            CartShopHeaderClickHandler cartShopHeaderClickHandler = l0Var.f20815d;
            if (cartShopHeaderClickHandler != null) {
                cartShopHeaderClickHandler.mo31599f(l0Var.itemView, this.f20822b);
            }
        }
    }

    /* renamed from: com.etsy.android.ui.cart.viewholders.l0$c */
    public class C9396c extends TrackingOnClickListener {

        /* renamed from: b */
        public final /* synthetic */ ServerDrivenAction f20824b;

        public C9396c(ServerDrivenAction serverDrivenAction) {
            this.f20824b = serverDrivenAction;
        }

        public final void onViewClick(View view) {
            C9393l0 l0Var = C9393l0.this;
            CartShopHeaderClickHandler cartShopHeaderClickHandler = l0Var.f20815d;
            if (cartShopHeaderClickHandler != null) {
                cartShopHeaderClickHandler.mo45936d(l0Var.itemView, this.f20824b);
            }
        }
    }

    /* renamed from: com.etsy.android.ui.cart.viewholders.l0$d */
    public class C9397d extends TrackingOnClickListener {

        /* renamed from: b */
        public final /* synthetic */ ShopHeader f20826b;

        public C9397d(ShopHeader shopHeader) {
            this.f20826b = shopHeader;
        }

        public final void onViewClick(View view) {
            CartShopHeaderClickHandler cartShopHeaderClickHandler = C9393l0.this.f20815d;
            if (cartShopHeaderClickHandler != null) {
                EtsyId shopId = this.f20826b.getShopId();
                cartShopHeaderClickHandler.getClass();
                C19383o.m32797g(shopId, "shopId");
                ShopCardClickHandler shopCardClickHandler = cartShopHeaderClickHandler.f20472g;
                shopCardClickHandler.getClass();
                C12790b.m20430b(shopCardClickHandler.mo45889a(), new ShopHomeKey(C12790b.m20432d(shopCardClickHandler.mo45889a()), shopId, ShopHomeConfig.POLICIES, (Map) null, (String) null, (String) null, (EtsyId) null, false, (String) null, (Bundle) null, 1016, (DefaultConstructorMarker) null));
            }
        }
    }

    public C9393l0(ViewGroup viewGroup, CartShopHeaderClickHandler cartShopHeaderClickHandler) {
        super(C0326j.m859c(viewGroup, R.layout.list_item_msco_shop_cart_header, viewGroup, false));
        this.f20815d = cartShopHeaderClickHandler;
        this.f20819h = viewGroup.getResources();
        CollageHeadingTextView collageHeadingTextView = (CollageHeadingTextView) mo38986f(R.id.txt_shop_name);
        this.f20814c = collageHeadingTextView;
        TextView textView = (TextView) mo38986f(R.id.txt_contact_shop);
        this.f20817f = textView;
        AccessibilityClassNames accessibilityClassNames = AccessibilityClassNames.BUTTON;
        ViewsExtensionsKt.m17423b(collageHeadingTextView, accessibilityClassNames);
        ViewsExtensionsKt.m17423b(textView, accessibilityClassNames);
    }

    /* renamed from: g */
    public final void mo31413g(CartGroupItem cartGroupItem) {
        ShopHeader shopHeader = (ShopHeader) cartGroupItem.getData();
        this.f20814c.setText(shopHeader.getShopName());
        this.f20814c.setOnClickListener(new C9394a(shopHeader));
        ServerDrivenAction action = cartGroupItem.getAction("message_to_seller");
        boolean z = cartGroupItem.getActions().size() <= 1 && action != null;
        if (cartGroupItem.getActions().isEmpty()) {
            this.f20818g.setVisibility(8);
            this.f20817f.setVisibility(8);
        } else if (!z) {
            this.f20817f.setVisibility(8);
            this.f20818g.setVisibility(0);
            this.f20818g.setContentDescription(this.f20819h.getString(R.string.show_menu_of_listing_actions_for, new Object[]{shopHeader.getShopName()}));
            this.f20818g.setOnClickListener(new C9395b(cartGroupItem));
        } else {
            this.f20818g.setVisibility(8);
            if (!shopHeader.isPrivate()) {
                this.f20817f.setVisibility(0);
                this.f20817f.setText(action.getDisplayName());
                this.f20817f.setOnClickListener(new C9396c(action));
            } else {
                this.f20817f.setVisibility(8);
            }
        }
        if (shopHeader.isTrustSignalsOn()) {
            this.f20816e.setVisibility(0);
            this.f20816e.setOnClickListener(new C9397d(shopHeader));
            return;
        }
        this.f20816e.setVisibility(8);
    }
}
