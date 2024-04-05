package com.etsy.android.uikit.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.etsy.android.R;

public class PaymentMethodsView extends FlowLayout {
    private View mCreditCardIcons;
    private View mGiftCards;
    private View mGooglePay;
    private View mPayPalIcon;

    public PaymentMethodsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    private void init(Context context) {
        View.inflate(context, R.layout.view_payment_methods, this);
        this.mCreditCardIcons = findViewById(R.id.icons_credit_cards);
        this.mGooglePay = findViewById(R.id.icon_gpay);
        this.mPayPalIcon = findViewById(R.id.icon_paypal);
        this.mGiftCards = findViewById(R.id.section_giftcards);
    }

    public void setCreditCardsVisible(boolean z) {
        this.mCreditCardIcons.setVisibility(z ? 0 : 8);
    }

    public void setGiftCardsVisible(boolean z) {
        this.mGiftCards.setVisibility(z ? 0 : 8);
    }

    public void setGooglePayVisible(boolean z) {
        this.mGooglePay.setVisibility(z ? 0 : 8);
    }

    public void setPayPalVisible(boolean z) {
        this.mPayPalIcon.setVisibility(z ? 0 : 8);
    }

    public PaymentMethodsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    public PaymentMethodsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context);
    }
}
