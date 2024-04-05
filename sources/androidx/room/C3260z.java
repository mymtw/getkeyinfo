package androidx.room;

import android.view.View;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.ShippingAndPoliciesPanelViewHolder;
import com.etsy.android.uikit.view.shop.policies.StructuredShopPoliciesView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalAddressBookInfoView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalSnappingRecyclerView;
import com.paypal.pyplcheckout.home.view.customviews.SnappingRecyclerView;
import com.paypal.pyplcheckout.utils.DialogMaker;
import kotlin.jvm.internal.C19383o;
import p112g2.C6831a;
import p146j.C7096a;
import p466vc.C13597g;

/* renamed from: androidx.room.z */
public final /* synthetic */ class C3260z implements C7096a, StructuredShopPoliciesView.C11957b, BottomNavigationView.C15214c, DialogMaker.NegativeClickListener, SnappingRecyclerView.OnViewSelectedListener {

    /* renamed from: b */
    public final /* synthetic */ Object f7580b;

    public /* synthetic */ C3260z(Object obj) {
        this.f7580b = obj;
    }

    public final Object apply(Object obj) {
        RoomDatabase roomDatabase = (RoomDatabase) this.f7580b;
        C6831a aVar = (C6831a) obj;
        roomDatabase.mo11972a();
        C6831a j0 = roomDatabase.f7463d.mo12025j0();
        roomDatabase.f7464e.mo12045e(j0);
        if (j0.mo18969u0()) {
            j0.mo18959F();
            return null;
        }
        j0.mo18964o();
        return null;
    }

    /* renamed from: b */
    public final void mo12056b() {
        ShippingAndPoliciesPanelViewHolder shippingAndPoliciesPanelViewHolder = (ShippingAndPoliciesPanelViewHolder) this.f7580b;
        int i = ShippingAndPoliciesPanelViewHolder.f23196x;
        C19383o.m32797g(shippingAndPoliciesPanelViewHolder, "this$0");
        shippingAndPoliciesPanelViewHolder.f23197b.mo38043a(C13597g.C13694n4.f30199a);
    }

    public final void onNegativeClick(DialogMaker dialogMaker) {
        PayPalAddressBookInfoView.m35166setupButton$lambda6$lambda5((PayPalAddressBookInfoView) this.f7580b, dialogMaker);
    }

    public final void onSelected(View view, int i) {
        PayPalSnappingRecyclerView.m35350_init_$lambda12((PayPalSnappingRecyclerView) this.f7580b, view, i);
    }
}
