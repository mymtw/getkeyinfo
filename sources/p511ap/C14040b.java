package p511ap;

import android.view.View;
import com.paypal.pyplcheckout.addressbook.view.adapters.ShippingAdapter;

/* renamed from: ap.b */
public final /* synthetic */ class C14040b implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ ShippingAdapter.ShippingAdapterClickListener f30901b;

    /* renamed from: c */
    public final /* synthetic */ ShippingAdapter f30902c;

    /* renamed from: d */
    public final /* synthetic */ ShippingAdapter.ItemViewHolder f30903d;

    /* renamed from: e */
    public final /* synthetic */ ShippingAdapter.CountryAdapterClickListener f30904e;

    public /* synthetic */ C14040b(ShippingAdapter.ShippingAdapterClickListener shippingAdapterClickListener, ShippingAdapter shippingAdapter, ShippingAdapter.ItemViewHolder itemViewHolder, ShippingAdapter.CountryAdapterClickListener countryAdapterClickListener) {
        this.f30901b = shippingAdapterClickListener;
        this.f30902c = shippingAdapter;
        this.f30903d = itemViewHolder;
        this.f30904e = countryAdapterClickListener;
    }

    public final void onClick(View view) {
        ShippingAdapter.ItemViewHolder.m35158_init_$lambda2(this.f30901b, this.f30902c, this.f30903d, this.f30904e, view);
    }
}
