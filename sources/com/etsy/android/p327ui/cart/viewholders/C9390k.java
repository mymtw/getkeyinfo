package com.etsy.android.p327ui.cart.viewholders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.cart.CartThankYouGroup;
import com.etsy.android.p327ui.cart.C9419w;
import com.etsy.android.p327ui.cart.C9422z;
import com.etsy.android.stylekit.views.CollageButton;
import com.etsy.android.vespa.viewholders.C12086e;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cart.viewholders.k */
public final class C9390k extends C12086e<CartThankYouGroup> {

    /* renamed from: i */
    public static final /* synthetic */ int f20795i = 0;

    /* renamed from: c */
    public final C9419w f20796c;

    /* renamed from: d */
    public final RecyclerView f20797d;

    /* renamed from: e */
    public final TextView f20798e;

    /* renamed from: f */
    public final TextView f20799f;

    /* renamed from: g */
    public final Button f20800g;

    /* renamed from: h */
    public final View f20801h = mo38986f(R.id.btn_divider);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9390k(ViewGroup viewGroup, C9422z zVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_msco_cart_thank_you_group_collage, viewGroup, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(zVar, "factory");
        C9419w wVar = new C9419w(zVar);
        this.f20796c = wVar;
        View f = mo38986f(R.id.items);
        C19383o.m32795e(f, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) f;
        this.f20797d = recyclerView;
        View f2 = mo38986f(R.id.title);
        C19383o.m32795e(f2, "null cannot be cast to non-null type android.widget.TextView");
        this.f20798e = (TextView) f2;
        View f3 = mo38986f(R.id.subtitle);
        C19383o.m32795e(f3, "null cannot be cast to non-null type android.widget.TextView");
        this.f20799f = (TextView) f3;
        View f4 = mo38986f(R.id.btn_toggle_items_display);
        C19383o.m32795e(f4, "null cannot be cast to non-null type android.widget.Button");
        this.f20800g = (Button) f4;
        viewGroup.getContext();
        recyclerView.setRecycledViewPool(zVar.f28988g);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(wVar);
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        CartThankYouGroup cartThankYouGroup = (CartThankYouGroup) obj;
        if (cartThankYouGroup != null) {
            this.f26962b.mo21333d("cart_thank_you", (Map<? extends AnalyticsProperty, Object>) null);
            this.f20798e.setText(cartThankYouGroup.getTitle());
            this.f20799f.setText(cartThankYouGroup.getSubtitle());
            C9419w wVar = this.f20796c;
            wVar.notifyItemRangeRemoved(0, wVar.f20895b.size());
            wVar.f20895b.clear();
            mo31838g(cartThankYouGroup);
            ViewExtensions.m12866j(this.f20800g, new CartThankYouGroupViewHolder$bind$1$1(cartThankYouGroup, this));
        }
    }

    /* renamed from: g */
    public final void mo31838g(CartThankYouGroup cartThankYouGroup) {
        boolean isItemsVisible = cartThankYouGroup.isItemsVisible();
        this.f20800g.setText(isItemsVisible ? R.string.hide_order_details : R.string.view_order_details);
        Button button = this.f20800g;
        C19383o.m32795e(button, "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageButton");
        ((CollageButton) button).setIconResource(isItemsVisible ? R.drawable.clg_icon_core_navigateup_v1 : R.drawable.clg_icon_core_navigatedown_v1);
        this.f20801h.setVisibility(isItemsVisible ? 0 : 8);
        RecyclerView.C3100o layoutManager = this.f20797d.getLayoutManager();
        C19383o.m32795e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (isItemsVisible) {
            linearLayoutManager.f7015C = cartThankYouGroup.getItems().size();
            C9419w wVar = this.f20796c;
            List<CartGroupItem> items = cartThankYouGroup.getItems();
            int size = wVar.f20895b.size();
            wVar.f20895b.addAll(items);
            wVar.notifyItemRangeInserted(size, items.size());
            return;
        }
        linearLayoutManager.f7015C = 0;
        C9419w wVar2 = this.f20796c;
        wVar2.notifyItemRangeRemoved(0, wVar2.f20895b.size());
        wVar2.f20895b.clear();
    }
}
