package com.etsy.android.uikit.view.shop.policies;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.StructuredShopPayments;
import com.etsy.android.lib.util.PaymentMethod;
import com.etsy.android.stylekit.views.CollageHeadingTextView;
import com.etsy.android.uikit.view.PaymentMethodsView;
import com.etsy.android.uikit.view.shop.policies.StructuredShopPoliciesView;

public class StructuredShopPaymentsView extends StructuredShopPoliciesView {
    private PaymentMethodsView mPaymentMethodsView;
    private TextView mTxtOtherOptionsInfo;
    private TextView mTxtSecureOptionsInfo;
    private CollageHeadingTextView mTxtSubheadOtherOptions;
    private CollageHeadingTextView mTxtSubheadPaymentMethods;
    private CollageHeadingTextView mTxtSubheadSecureOptions;

    public StructuredShopPaymentsView(Context context) {
        super(context);
    }

    public void init(Context context, LinearLayout linearLayout) {
        View.inflate(context, R.layout.view_structured_shop_payments, linearLayout);
        this.mTxtSubheadSecureOptions = (CollageHeadingTextView) findViewById(R.id.txt_subhead_secure_options);
        this.mTxtSecureOptionsInfo = (TextView) findViewById(R.id.txt_secure_options_info);
        this.mPaymentMethodsView = (PaymentMethodsView) findViewById(R.id.payment_methods);
        this.mTxtSubheadPaymentMethods = (CollageHeadingTextView) findViewById(R.id.txt_subhead_payment_methods);
        this.mTxtSubheadOtherOptions = (CollageHeadingTextView) findViewById(R.id.txt_subhead_other_options);
        this.mTxtOtherOptionsInfo = (TextView) findViewById(R.id.txt_other_options_info);
    }

    public void setStructuredShopPayments(StructuredShopPayments structuredShopPayments, StructuredShopPoliciesView.C11957b bVar) {
        Resources resources = getResources();
        boolean z = true;
        boolean z2 = !structuredShopPayments.getProtectedPaymentMethods().isEmpty();
        if (z2) {
            this.mTxtSubheadSecureOptions.setVisibility(0);
            this.mPaymentMethodsView.setVisibility(0);
            this.mTxtSecureOptionsInfo.setVisibility(0);
            this.mTxtSubheadOtherOptions.setVisibility(0);
            this.mTxtSubheadPaymentMethods.setVisibility(8);
            this.mPaymentMethodsView.setCreditCardsVisible(structuredShopPayments.acceptsDirectCheckout() || structuredShopPayments.acceptsPayPal());
            this.mPaymentMethodsView.setGooglePayVisible(false);
            this.mPaymentMethodsView.setPayPalVisible(structuredShopPayments.acceptsDirectCheckout() || structuredShopPayments.acceptsPayPal());
            this.mPaymentMethodsView.setGiftCardsVisible(structuredShopPayments.acceptsDirectCheckout());
        } else {
            this.mTxtSubheadSecureOptions.setVisibility(8);
            this.mPaymentMethodsView.setVisibility(8);
            this.mTxtSecureOptionsInfo.setVisibility(8);
            this.mTxtSubheadOtherOptions.setVisibility(8);
            this.mTxtSubheadPaymentMethods.setVisibility(0);
        }
        boolean z3 = !structuredShopPayments.getManualPaymentMethods().isEmpty();
        if (z3) {
            this.mTxtOtherOptionsInfo.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(resources.getString(R.string.structured_payment_other_options_info)));
            for (String paymentMethod : structuredShopPayments.getManualPaymentMethods()) {
                spannableStringBuilder.append("\n\n").append(Html.fromHtml(StructuredShopPoliciesView.BULLET_POINT_AND_SPACE)).append(resources.getString(PaymentMethod.getPaymentMethod(paymentMethod).getDisplayLabel()));
            }
            this.mTxtOtherOptionsInfo.setText(spannableStringBuilder);
            linkifyContactShopUrlSpan(this.mTxtOtherOptionsInfo, bVar);
        } else {
            this.mTxtSubheadOtherOptions.setVisibility(8);
            this.mTxtOtherOptionsInfo.setVisibility(8);
        }
        if (!z2 || !z3) {
            z = false;
        }
        setContentCollapsible(z);
    }

    public StructuredShopPaymentsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StructuredShopPaymentsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public StructuredShopPaymentsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
