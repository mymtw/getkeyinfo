package p570fp;

import android.view.MotionEvent;
import android.view.View;
import com.paypal.pyplcheckout.pojo.ShippingMethods;
import com.paypal.pyplcheckout.shippingmethods.view.adapters.ShippingMethodsAdapter;

/* renamed from: fp.a */
public final /* synthetic */ class C17784a implements View.OnTouchListener {

    /* renamed from: b */
    public final /* synthetic */ ShippingMethodsAdapter f38655b;

    /* renamed from: c */
    public final /* synthetic */ ShippingMethodsAdapter.ItemViewHolder f38656c;

    /* renamed from: d */
    public final /* synthetic */ ShippingMethods f38657d;

    public /* synthetic */ C17784a(ShippingMethodsAdapter shippingMethodsAdapter, ShippingMethodsAdapter.ItemViewHolder itemViewHolder, ShippingMethods shippingMethods) {
        this.f38655b = shippingMethodsAdapter;
        this.f38656c = itemViewHolder;
        this.f38657d = shippingMethods;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return ShippingMethodsAdapter.m35438onBindViewHolder$lambda0(this.f38655b, this.f38656c, this.f38657d, view, motionEvent);
    }
}
