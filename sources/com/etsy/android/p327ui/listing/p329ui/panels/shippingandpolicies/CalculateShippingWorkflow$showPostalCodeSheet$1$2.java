package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies;

import android.text.Editable;
import android.widget.Button;
import com.etsy.android.stylekit.views.CollageTextInput;
import com.etsy.android.uikit.text.TextWatcherAdapter;
import kotlin.text.C19459m;
import p309ad.C8509e;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.CalculateShippingWorkflow$showPostalCodeSheet$1$2 */
public final class CalculateShippingWorkflow$showPostalCodeSheet$1$2 extends TextWatcherAdapter {
    public final /* synthetic */ Button $applyButton;
    public final /* synthetic */ CollageTextInput $inputView;
    public final /* synthetic */ PostalCodeTextWatcher $postalCodeTextWatcher;
    public final /* synthetic */ C8509e $postalCodeValidator;

    public CalculateShippingWorkflow$showPostalCodeSheet$1$2(PostalCodeTextWatcher postalCodeTextWatcher, Button button, C8509e eVar, CollageTextInput collageTextInput) {
        this.$postalCodeTextWatcher = postalCodeTextWatcher;
        this.$applyButton = button;
        this.$postalCodeValidator = eVar;
        this.$inputView = collageTextInput;
    }

    public void afterTextChanged(Editable editable) {
        this.$postalCodeTextWatcher.afterTextChanged(editable);
        this.$applyButton.setEnabled(this.$postalCodeValidator.mo14c(C19459m.m33035H1(this.$inputView.getText()).toString()));
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.$postalCodeTextWatcher.beforeTextChanged(charSequence, i, i2, i3);
    }
}
