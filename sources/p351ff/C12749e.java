package p351ff;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8703p;

/* renamed from: ff.e */
public final class C12749e {

    /* renamed from: a */
    public View f28169a;

    /* renamed from: b */
    public View f28170b;

    /* renamed from: c */
    public TextView f28171c;

    /* renamed from: d */
    public TextView f28172d;

    /* renamed from: e */
    public TextView f28173e;

    /* renamed from: f */
    public TextView f28174f;

    /* renamed from: g */
    public TextView f28175g;

    /* renamed from: h */
    public View f28176h;

    /* renamed from: i */
    public TextView f28177i;

    /* renamed from: j */
    public TextView f28178j;

    /* renamed from: k */
    public TextView f28179k;

    /* renamed from: l */
    public View f28180l;

    /* renamed from: m */
    public TextView f28181m;

    /* renamed from: n */
    public View f28182n;

    /* renamed from: o */
    public TextView f28183o;

    /* renamed from: p */
    public View f28184p;

    /* renamed from: q */
    public TextView f28185q;

    /* renamed from: r */
    public View f28186r;

    /* renamed from: s */
    public TextView f28187s;

    /* renamed from: t */
    public TextView f28188t;

    /* renamed from: u */
    public TextView f28189u;

    /* renamed from: v */
    public TextView f28190v;

    /* renamed from: w */
    public TextView f28191w;

    /* renamed from: x */
    public ViewGroup f28192x;

    /* renamed from: y */
    public final C8703p f28193y;

    public C12749e(View view, C8703p pVar) {
        this.f28193y = pVar;
        this.f28169a = view;
        this.f28170b = view.findViewById(R.id.shipping_row);
        this.f28172d = (TextView) view.findViewById(R.id.text_item_total_value);
        this.f28171c = (TextView) view.findViewById(R.id.text_item_total);
        this.f28173e = (TextView) view.findViewById(R.id.text_shipping_value);
        this.f28174f = (TextView) view.findViewById(R.id.text_order_total_value);
        this.f28175g = (TextView) view.findViewById(R.id.text_order_total);
        this.f28176h = view.findViewById(R.id.coupon_row);
        this.f28177i = (TextView) view.findViewById(R.id.text_coupon_title);
        this.f28178j = (TextView) view.findViewById(R.id.text_coupon_value);
        this.f28179k = (TextView) view.findViewById(R.id.text_coupon_details);
        this.f28180l = view.findViewById(R.id.tax_row);
        this.f28181m = (TextView) view.findViewById(R.id.text_tax_value);
        this.f28186r = view.findViewById(R.id.vat_row);
        this.f28187s = (TextView) view.findViewById(R.id.text_vat_value);
        this.f28188t = (TextView) view.findViewById(R.id.text_vat_desc);
        this.f28189u = (TextView) view.findViewById(R.id.text_vat_invoice);
        this.f28190v = (TextView) view.findViewById(R.id.text_donation_message);
        this.f28191w = (TextView) view.findViewById(R.id.text_transparent_pricing);
        this.f28182n = view.findViewById(R.id.discount_row);
        this.f28183o = (TextView) view.findViewById(R.id.text_discount_value);
        this.f28184p = view.findViewById(R.id.etsy_discount_row);
        this.f28185q = (TextView) view.findViewById(R.id.text_etsy_discount_value);
        this.f28192x = (ViewGroup) view.findViewById(R.id.refund_view);
    }
}
