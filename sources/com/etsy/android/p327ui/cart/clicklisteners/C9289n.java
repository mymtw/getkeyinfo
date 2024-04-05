package com.etsy.android.p327ui.cart.clicklisteners;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.Country;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.CartErrorResolution;
import com.etsy.android.lib.models.apiv3.cart.PaymentUpdateShippingCountry;
import com.etsy.android.lib.util.C8902h;
import com.etsy.android.stylekit.views.CollageBottomSheet;
import com.etsy.android.stylekit.views.CollageListItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.C19322o;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.clicklisteners.n */
public final class C9289n {

    /* renamed from: com.etsy.android.ui.cart.clicklisteners.n$a */
    public static final class C9290a extends RecyclerView.Adapter<C9291b> {

        /* renamed from: b */
        public final List<Country> f20504b;

        /* renamed from: c */
        public final int f20505c;

        /* renamed from: d */
        public final C19857l<Country, C19394m> f20506d;

        public C9290a(ArrayList arrayList, int i, C19857l lVar) {
            this.f20504b = arrayList;
            this.f20505c = i;
            this.f20506d = lVar;
        }

        public final int getItemCount() {
            return this.f20504b.size();
        }

        public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
            C9291b bVar = (C9291b) b0Var;
            C19383o.m32797g(bVar, "holder");
            boolean z = i < this.f20505c;
            Country country = this.f20504b.get(i);
            C19383o.m32797g(country, "country");
            View view = bVar.itemView;
            C19383o.m32795e(view, "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageListItem");
            CollageListItem collageListItem = (CollageListItem) view;
            collageListItem.setText(country.getName());
            if (country.getCountryId() == -1) {
                ((CollageListItem) bVar.itemView).setEnabled(false);
                CollageListItem collageListItem2 = (CollageListItem) bVar.itemView;
                collageListItem2.setContentDescription(collageListItem2.getResources().getString(R.string.cart_select_shipping_destination_unselectable_divider));
                collageListItem.setOnClickListener((View.OnClickListener) null);
                return;
            }
            ((CollageListItem) bVar.itemView).setEnabled(true);
            if (z) {
                CollageListItem collageListItem3 = (CollageListItem) bVar.itemView;
                collageListItem3.setContentDescription(collageListItem3.getResources().getString(R.string.cart_select_shipping_destination_preferred_country_label, new Object[]{country.getName()}));
            } else {
                ((CollageListItem) bVar.itemView).setContentDescription(country.getName());
            }
            ViewExtensions.m12866j(collageListItem, new SelectShippingDestinationWorkflow$CountryViewHolder$bind$1$1(bVar, country));
        }

        public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
            return new C9291b(viewGroup, this.f20506d);
        }
    }

    /* renamed from: com.etsy.android.ui.cart.clicklisteners.n$b */
    public static final class C9291b extends RecyclerView.C3084b0 {

        /* renamed from: b */
        public final C19857l<Country, C19394m> f20507b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9291b(ViewGroup viewGroup, C19857l<? super Country, C19394m> lVar) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_cart_bottomsheet_country, viewGroup, false));
            C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
            C19383o.m32797g(lVar, "onItemClick");
            this.f20507b = lVar;
        }
    }

    /* renamed from: a */
    public static void m17683a(FragmentActivity fragmentActivity, CartErrorResolution cartErrorResolution, C19857l lVar) {
        C19383o.m32797g(cartErrorResolution, "resolution");
        ArrayList arrayList = new ArrayList();
        PaymentUpdateShippingCountry shippingCountries = cartErrorResolution.getShippingCountries();
        C19383o.m32794d(shippingCountries);
        List<Integer> preferredCountries = shippingCountries.getPreferredCountries();
        C19383o.m32796f(preferredCountries, "shippingCountries.preferredCountries");
        ArrayList arrayList2 = new ArrayList(C19322o.m32624F0(preferredCountries));
        for (Integer b : preferredCountries) {
            arrayList2.add(C8902h.m17340b(b));
        }
        ArrayList R0 = C19327t.m32636R0(arrayList2);
        List<Integer> allCountryIds = shippingCountries.getAllCountryIds();
        C19383o.m32796f(allCountryIds, "shippingCountries.allCountryIds");
        ArrayList arrayList3 = new ArrayList(C19322o.m32624F0(allCountryIds));
        for (Integer b2 : allCountryIds) {
            arrayList3.add(C8902h.m17340b(b2));
        }
        ArrayList R02 = C19327t.m32636R0(arrayList3);
        Country country = new Country(-1, "--------------------", "--------------------", "--------------------", (String) null, 16, (DefaultConstructorMarker) null);
        if (!R0.isEmpty()) {
            arrayList.addAll(R0);
            arrayList.add(country);
        }
        arrayList.addAll(R02);
        CollageBottomSheet collageBottomSheet = new CollageBottomSheet(fragmentActivity);
        collageBottomSheet.setContentView((int) R.layout.view_cart_shipping_destination_select_bottom_sheet);
        collageBottomSheet.setPopover(true);
        View findViewById = collageBottomSheet.findViewById(R.id.title);
        C19383o.m32794d(findViewById);
        ((TextView) findViewById).setText(cartErrorResolution.getPrompt());
        C9290a aVar = new C9290a(arrayList, R0.size(), new SelectShippingDestinationWorkflow$start$adapter$1(collageBottomSheet, lVar));
        View findViewById2 = collageBottomSheet.findViewById(R.id.recycler_view);
        C19383o.m32794d(findViewById2);
        ((RecyclerView) findViewById2).setAdapter(aVar);
        collageBottomSheet.show();
    }
}
