package com.etsy.android.p327ui.dialog;

import android.widget.RadioGroup;
import com.etsy.android.lib.models.PaymentOption;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.dialog.a */
public final /* synthetic */ class C9725a implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: b */
    public final /* synthetic */ C9726b f21520b;

    public /* synthetic */ C9725a(C9726b bVar) {
        this.f21520b = bVar;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        C9726b bVar = this.f21520b;
        C19383o.m32797g(bVar, "this$0");
        Object tag = radioGroup.findViewById(i).getTag();
        C19383o.m32795e(tag, "null cannot be cast to non-null type com.etsy.android.lib.models.PaymentOption");
        PaymentOption paymentOption = (PaymentOption) tag;
        bVar.f21524d = paymentOption;
        bVar.mo32582a(paymentOption);
    }
}
