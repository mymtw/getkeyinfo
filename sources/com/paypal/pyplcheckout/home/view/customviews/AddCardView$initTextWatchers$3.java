package com.paypal.pyplcheckout.home.view.customviews;

import com.google.android.material.textfield.TextInputEditText;
import com.paypal.pyplcheckout.model.PaymentProcessors;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19863r;

public final class AddCardView$initTextWatchers$3 extends Lambda implements C19863r<CharSequence, Integer, Integer, Integer, C19394m> {
    public final /* synthetic */ AddCardView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddCardView$initTextWatchers$3(AddCardView addCardView) {
        super(4);
        this.this$0 = addCardView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((CharSequence) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(CharSequence charSequence, int i, int i2, int i3) {
        Integer valueOf = charSequence == null ? null : Integer.valueOf(charSequence.length());
        PaymentProcessors value = this.this$0.getAddCardViewModel().getPaymentProcessor().getValue();
        if (C19383o.m32792b(valueOf, value == null ? null : Integer.valueOf(value.getCscMaxLength()))) {
            TextInputEditText access$getZipCodeEditText$p = this.this$0.zipCodeEditText;
            if (access$getZipCodeEditText$p != null) {
                access$getZipCodeEditText$p.requestFocus();
            } else {
                C19383o.m32805o("zipCodeEditText");
                throw null;
            }
        }
    }
}
