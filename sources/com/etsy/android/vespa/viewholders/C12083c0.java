package com.etsy.android.vespa.viewholders;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.appboy.p043ui.widget.C4956b;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.cart.GiftOptions;
import com.etsy.android.lib.models.apiv3.cart.ShippingDetails;
import com.etsy.android.lib.models.apiv3.cart.ShippingOption;
import com.etsy.android.lib.models.apiv3.cart.ShopHeader;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.lib.models.apiv3.vespa.UserAction;
import com.etsy.android.stylekit.views.CollageRadioButton;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19543e0;
import p415of.C13175d;
import p415of.C13178g;
import p415of.C13186o;
import p415of.C13189r;
import p415of.C13190s;
import p423pf.C13239i;

/* renamed from: com.etsy.android.vespa.viewholders.c0 */
public final class C12083c0 extends C12086e<C13186o> {

    /* renamed from: e */
    public static final /* synthetic */ int f26954e = 0;

    /* renamed from: c */
    public final C13239i f26955c;

    /* renamed from: d */
    public final C8703p f26956d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12083c0(ViewGroup viewGroup, C13239i iVar, C8703p pVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_msco_shop_header_bottom_sheet, viewGroup, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(iVar, "clickHandler");
        C19383o.m32797g(pVar, "viewTracker");
        this.f26955c = iVar;
        this.f26956d = pVar;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        T t;
        List<ShippingOption> shippingOptions;
        C13186o oVar = (C13186o) obj;
        C19383o.m32797g(oVar, "item");
        if (oVar instanceof CartGroupItem) {
            CartGroupItem cartGroupItem = (CartGroupItem) oVar;
            if (cartGroupItem.getData() instanceof ShopHeader) {
                BaseModel data = cartGroupItem.getData();
                C19383o.m32795e(data, "null cannot be cast to non-null type com.etsy.android.lib.models.apiv3.cart.ShopHeader");
                ShopHeader shopHeader = (ShopHeader) data;
                ShippingDetails shippingDetails = shopHeader.getShippingDetails();
                if (shippingDetails != null) {
                    View view = this.itemView;
                    List<ServerDrivenAction> actions = cartGroupItem.getActions();
                    C13239i iVar = this.f26955c;
                    C8703p pVar = this.f26956d;
                    C19383o.m32796f(view, "itemView");
                    C19383o.m32796f(actions, ResponseConstants.ACTIONS);
                    C13190s sVar = new C13190s(view, shippingDetails, actions, pVar, iVar);
                    ShippingDetails shippingDetails2 = sVar.f29020b;
                    if (!(shippingDetails2 == null || (shippingOptions = shippingDetails2.getShippingOptions()) == null)) {
                        for (ShippingOption shippingOption : shippingOptions) {
                            C19383o.m32796f(shippingOption, "it");
                            Context context = sVar.f29019a.getContext();
                            C19383o.m32796f(context, "itemView.context");
                            CollageRadioButton collageRadioButton = new CollageRadioButton(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                            if (C19383o.m32792b(sVar.f29025g, shippingOption.getOptionId())) {
                                collageRadioButton.setChecked(true);
                            }
                            collageRadioButton.setText(shippingOption.getNameWithoutPrice());
                            collageRadioButton.setHelperText(shippingOption.getEstimatedDeliveryDate());
                            if (C19543e0.m33306Y(shippingOption.getFormattedMoney().getArguments())) {
                                collageRadioButton.setMetaText(shippingOption.getFormattedMoney().getArguments().get(0).getCurrencyFormattedShort());
                            }
                            collageRadioButton.setSmall(true);
                            collageRadioButton.showBottomDivider(true);
                            sVar.f29024f.addView(collageRadioButton);
                        }
                    }
                    sVar.f29024f.setOnCheckedChangeListener(new C13189r(sVar));
                }
                if (shopHeader.getGiftOptions() != null) {
                    View view2 = this.itemView;
                    C19383o.m32796f(view2, "itemView");
                    String shopName = shopHeader.getShopName();
                    C19383o.m32796f(shopName, "shopHeader.shopName");
                    GiftOptions giftOptions = shopHeader.getGiftOptions();
                    C19383o.m32796f(giftOptions, "shopHeader.giftOptions");
                    List<ServerDrivenAction> actions2 = cartGroupItem.getActions();
                    C19383o.m32796f(actions2, "item.actions");
                    C13178g gVar = new C13178g(view2, shopName, giftOptions, actions2, this.f26955c, this.f26956d);
                    gVar.f29007g.setChecked(gVar.f29003c.isGift());
                    if (gVar.f29003c.isGift()) {
                        gVar.mo45899d();
                    } else {
                        ViewExtensions.m12860d(gVar.f29008h);
                        ViewExtensions.m12860d(gVar.f29009i);
                        ViewExtensions.m12860d(gVar.f29010j);
                    }
                    gVar.f29007g.setOnCheckedChangeListener(new C13175d(gVar));
                }
                Button button = (Button) this.itemView.findViewById(R.id.btn_cart_bottom_sheet_checkout);
                List<ServerDrivenAction> actions3 = cartGroupItem.getActions();
                C19383o.m32796f(actions3, "item.actions");
                Iterator<T> it = actions3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (C19383o.m32792b(((ServerDrivenAction) t).getType(), UserAction.TYPE_SINGLE_SHOP_CHECKOUT)) {
                        break;
                    }
                }
                ServerDrivenAction serverDrivenAction = (ServerDrivenAction) t;
                if (serverDrivenAction != null) {
                    ViewExtensions.m12869m(button);
                    button.setText(serverDrivenAction.getDisplayName());
                    button.setOnClickListener(new C4956b(2, this, serverDrivenAction));
                    return;
                }
                ViewExtensions.m12860d(button);
            }
        }
    }
}
