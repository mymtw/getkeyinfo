package com.etsy.android.p327ui.cart.viewholders;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.cart.PaymentAddCoupon;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.p327ui.cart.clicklisteners.C9282g;
import com.etsy.android.stylekit.accessibility.navigation.extensions.NavigationExtensionsKt;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import com.google.android.play.core.assetpacks.C15588c1;

/* renamed from: com.etsy.android.ui.cart.viewholders.x */
public final class C9410x extends C9370c {

    /* renamed from: c */
    public final C9282g f20871c;

    /* renamed from: d */
    public final Button f20872d = ((Button) mo38986f(R.id.btn_add_coupon_code));

    /* renamed from: e */
    public final EditText f20873e;

    /* renamed from: f */
    public final View f20874f = mo38986f(R.id.label_coupon_code);

    /* renamed from: g */
    public final TextView f20875g;

    /* renamed from: com.etsy.android.ui.cart.viewholders.x$a */
    public class C9411a implements View.OnFocusChangeListener {
        public C9411a() {
        }

        public final void onFocusChange(View view, boolean z) {
            C9410x xVar = C9410x.this;
            if (view == xVar.f20873e && z) {
                ((InputMethodManager) xVar.itemView.getContext().getSystemService("input_method")).showSoftInput(C9410x.this.f20873e, 1);
            }
        }
    }

    /* renamed from: com.etsy.android.ui.cart.viewholders.x$b */
    public class C9412b extends TrackingOnClickListener {

        /* renamed from: b */
        public final /* synthetic */ PaymentAddCoupon f20877b;

        public C9412b(PaymentAddCoupon paymentAddCoupon) {
            this.f20877b = paymentAddCoupon;
        }

        public final void onViewClick(View view) {
            C9410x.this.mo31847i(this.f20877b);
        }
    }

    /* renamed from: com.etsy.android.ui.cart.viewholders.x$c */
    public class C9413c implements TextView.OnEditorActionListener {

        /* renamed from: b */
        public final /* synthetic */ CartGroupItem f20879b;

        public C9413c(CartGroupItem cartGroupItem) {
            this.f20879b = cartGroupItem;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            ServerDrivenAction action = this.f20879b.getAction(ServerDrivenAction.TYPE_APPLY_COUPON);
            String obj = C9410x.this.f20873e.getText().toString();
            if (action != null && !TextUtils.isEmpty(obj)) {
                action.addParam("coupon_code", obj);
                C9410x xVar = C9410x.this;
                xVar.f20871c.mo45936d(xVar.itemView, action);
            }
            textView.clearFocus();
            C15588c1.m25340p0(textView);
            return false;
        }
    }

    public C9410x(ViewGroup viewGroup, C9282g gVar) {
        super(C0326j.m859c(viewGroup, R.layout.list_item_msco_add_coupon, viewGroup, false));
        this.f20871c = gVar;
        EditText editText = (EditText) mo38986f(R.id.txt_coupon_code);
        this.f20873e = editText;
        editText.setOnFocusChangeListener(new C9411a());
        this.f20875g = (TextView) mo38986f(R.id.txt_coupon_error);
    }

    /* renamed from: g */
    public final void mo31413g(CartGroupItem cartGroupItem) {
        PaymentAddCoupon paymentAddCoupon = (PaymentAddCoupon) cartGroupItem.getData();
        if (!TextUtils.isEmpty(paymentAddCoupon.getLabel())) {
            this.f20872d.setText(paymentAddCoupon.getLabel());
        }
        if (!TextUtils.isEmpty(paymentAddCoupon.getCode())) {
            mo31847i(paymentAddCoupon);
        } else {
            this.f20872d.setVisibility(0);
            this.f20874f.setVisibility(8);
            this.f20873e.setVisibility(8);
            this.f20875g.setVisibility(8);
        }
        if (this.f20871c != null) {
            this.f20872d.setOnClickListener(new C9412b(paymentAddCoupon));
            this.f20873e.setOnEditorActionListener(new C9413c(cartGroupItem));
        }
    }

    /* renamed from: i */
    public final void mo31847i(PaymentAddCoupon paymentAddCoupon) {
        this.f20872d.setVisibility(8);
        this.f20874f.setVisibility(0);
        this.f20873e.setVisibility(0);
        this.f20873e.setText(paymentAddCoupon.getCode());
        this.f20873e.requestFocus();
        String error = paymentAddCoupon.getError();
        if (!TextUtils.isEmpty(paymentAddCoupon.getError())) {
            this.f20875g.setVisibility(0);
            this.f20875g.setText(error);
            this.f20875g.setFocusableInTouchMode(true);
            NavigationExtensionsKt.m17420a(this.f20875g, 500);
            return;
        }
        this.f20875g.setVisibility(8);
    }
}
