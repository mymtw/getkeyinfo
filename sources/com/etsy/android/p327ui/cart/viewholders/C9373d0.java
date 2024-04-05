package com.etsy.android.p327ui.cart.viewholders;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.cart.PaymentMethod;
import com.etsy.android.lib.models.apiv3.cart.PaymentOptions;
import com.etsy.android.lib.util.C8917p;
import com.etsy.android.lib.util.C8918q;
import com.etsy.android.p327ui.cart.clicklisteners.C9282g;
import java.util.List;
import kotlinx.coroutines.C19543e0;

/* renamed from: com.etsy.android.ui.cart.viewholders.d0 */
public final class C9373d0 extends C9370c {

    /* renamed from: c */
    public final C9282g f20759c;

    /* renamed from: d */
    public final RadioGroup f20760d;

    /* renamed from: e */
    public final C8918q f20761e = new C8918q();

    /* renamed from: f */
    public String f20762f;

    public C9373d0(ViewGroup viewGroup, C9282g gVar) {
        super(C0326j.m859c(viewGroup, R.layout.list_item_msco_payment_options, viewGroup, false));
        this.f20759c = gVar;
        this.f20760d = (RadioGroup) mo38986f(R.id.group_payment_methods);
        View childAt = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
        if (childAt != null) {
            TextView textView = (TextView) childAt.findViewById(R.id.txt_title);
            if (textView != null) {
                this.f20762f = textView.getText().toString();
            } else {
                this.f20762f = this.itemView.getResources().getString(R.string.payment_methods);
            }
        } else {
            this.f20762f = this.itemView.getResources().getString(R.string.payment_methods);
        }
    }

    /* renamed from: g */
    public final void mo31413g(CartGroupItem cartGroupItem) {
        Drawable drawable;
        boolean z;
        this.f20760d.removeAllViews();
        List<PaymentMethod> paymentMethods = ((PaymentOptions) cartGroupItem.getData()).getPaymentMethods();
        for (int i = 0; i < paymentMethods.size(); i++) {
            PaymentMethod paymentMethod = paymentMethods.get(i);
            View inflate = paymentMethod.isKlarnaInstallments() ? LayoutInflater.from(this.itemView.getContext()).inflate(R.layout.list_item_payment_option_klarna, this.f20760d, false) : LayoutInflater.from(this.itemView.getContext()).inflate(R.layout.list_item_payment_option, this.f20760d, false);
            RadioButton radioButton = (RadioButton) inflate.findViewById(R.id.radio_button);
            TextView textView = (TextView) inflate.findViewById(R.id.text);
            if (paymentMethod.isPayPal()) {
                drawable = this.itemView.getResources().getDrawable(R.drawable.cc_paypal);
            } else if (paymentMethod.isCreditCard()) {
                drawable = this.itemView.getResources().getDrawable(R.drawable.cc_all);
            } else if (paymentMethod.isGooglePay()) {
                drawable = this.itemView.getResources().getDrawable(R.drawable.cc_google_pay);
            } else if (paymentMethod.isIdeal()) {
                drawable = this.itemView.getResources().getDrawable(R.drawable.cc_ideal);
            } else if (paymentMethod.isSofort()) {
                drawable = this.itemView.getResources().getDrawable(R.drawable.sofort);
            } else if (paymentMethod.isKlarnaInstallments()) {
                ImageView imageView = (ImageView) inflate.findViewById(R.id.payment_icon);
                TextView textView2 = (TextView) inflate.findViewById(R.id.payment_item_title);
                Drawable drawable2 = this.itemView.getResources().getDrawable(R.drawable.ic_etsy_klarna_badge);
                TextView textView3 = (TextView) inflate.findViewById(R.id.payment_item_subtext);
                if (!TextUtils.isEmpty(paymentMethod.getSubText())) {
                    C19543e0.m33318k0(textView3, paymentMethod.getSubText(), paymentMethod.getFirstInfoModalOrNull(), new C9369b0(this));
                }
                textView2.setText(paymentMethod.getDisplayValue());
                imageView.setImageResource(R.drawable.ic_etsy_klarna_badge);
                boolean z2 = paymentMethod.isEnabled() && cartGroupItem.isEnabled();
                this.itemView.setEnabled(paymentMethod.isEnabled() && cartGroupItem.isEnabled());
                imageView.setEnabled(z2);
                textView2.setEnabled(z2);
                textView3.setEnabled(z2);
                drawable = drawable2;
            } else if (paymentMethod.isKlarnaInvoicing()) {
                Drawable drawable3 = this.itemView.getResources().getDrawable(R.drawable.klarna);
                String string = this.itemView.getResources().getString(R.string.klarna_invoice_url);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.itemView.getResources().getString(R.string.invoice_terms));
                spannableStringBuilder.setSpan(new URLSpan(string), 0, spannableStringBuilder.length(), 0);
                textView.setText(spannableStringBuilder);
                textView.setVisibility(0);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                drawable = drawable3;
            } else {
                drawable = null;
            }
            if (drawable == null) {
                radioButton.setText(paymentMethod.getDisplayValue());
            } else if (!paymentMethod.isKlarnaInstallments()) {
                radioButton.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            if (paymentMethod.isCreditCard()) {
                z = true;
                radioButton.setContentDescription(this.itemView.getResources().getString(R.string.cart_payment_methods_desc, new Object[]{this.itemView.getResources().getString(R.string.payment_method_label_all_credit_card), this.f20762f}));
            } else {
                z = true;
                radioButton.setContentDescription(this.itemView.getResources().getString(R.string.cart_payment_methods_desc, new Object[]{paymentMethod.getDisplayValue(), this.f20762f}));
            }
            radioButton.setChecked(paymentMethod.isSelected());
            radioButton.setEnabled((!paymentMethod.isEnabled() || !cartGroupItem.isEnabled()) ? false : z);
            radioButton.setAlpha((!paymentMethod.isEnabled() || !cartGroupItem.isEnabled()) ? 0.5f : 1.0f);
            radioButton.setTag(paymentMethod.getValue());
            this.f20760d.addView(inflate);
            C8918q qVar = this.f20761e;
            qVar.getClass();
            qVar.f19675a.add(radioButton);
            radioButton.setOnCheckedChangeListener(new C8917p(qVar));
        }
        if (this.f20760d.getChildCount() > 0) {
            this.f20761e.f19676b = new C9371c0(this, cartGroupItem);
        }
    }
}
