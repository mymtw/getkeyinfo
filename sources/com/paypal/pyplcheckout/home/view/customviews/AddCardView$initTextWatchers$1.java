package com.paypal.pyplcheckout.home.view.customviews;

import android.text.Editable;
import android.text.TextWatcher;
import com.paypal.pyplcheckout.model.PaymentProcessors;
import com.paypal.pyplcheckout.utils.CardNumberFormatterUtilKt;
import com.paypal.pyplcheckout.utils.CardValidationUtilKt;
import com.paypal.pyplcheckout.utils.WhiteSpaceSpan;
import kotlin.jvm.internal.C19383o;

public final class AddCardView$initTextWatchers$1 implements TextWatcher {
    public final /* synthetic */ AddCardView this$0;

    public AddCardView$initTextWatchers$1(AddCardView addCardView) {
        this.this$0 = addCardView;
    }

    public void afterTextChanged(Editable editable) {
        if (editable != null) {
            PaymentProcessors value = this.this$0.getAddCardViewModel().getPaymentProcessor().getValue();
            int i = 0;
            if (value != null) {
                int autoAdvanceLength = value.getAutoAdvanceLength();
                AddCardView addCardView = this.this$0;
                if (addCardView.hasAdvancedPastCardNumber && editable.length() < autoAdvanceLength) {
                    addCardView.hasAdvancedPastCardNumber = false;
                }
            }
            WhiteSpaceSpan[] whiteSpaceSpanArr = (WhiteSpaceSpan[]) editable.getSpans(0, editable.length(), WhiteSpaceSpan.class);
            C19383o.m32796f(whiteSpaceSpanArr, "spans");
            int length = whiteSpaceSpanArr.length;
            while (i < length) {
                WhiteSpaceSpan whiteSpaceSpan = whiteSpaceSpanArr[i];
                i++;
                editable.removeSpan(whiteSpaceSpan);
            }
            this.this$0.getAddCardViewModel().setPaymentProcessorFromCardNumber(editable.toString(), CardValidationUtilKt.paymentProcessorIdentifier(editable.toString()));
            PaymentProcessors value2 = this.this$0.getAddCardViewModel().getPaymentProcessor().getValue();
            C19383o.m32794d(value2);
            for (Integer intValue : CardNumberFormatterUtilKt.getWhiteSpaceSpanList(value2)) {
                int intValue2 = intValue.intValue();
                if (intValue2 < editable.length()) {
                    editable.setSpan(new WhiteSpaceSpan(), intValue2 - 1, intValue2, 33);
                }
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
