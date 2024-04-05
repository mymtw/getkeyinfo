package com.etsy.android.p327ui.giftcards;

import android.widget.RadioGroup;

/* renamed from: com.etsy.android.ui.giftcards.a */
public final /* synthetic */ class C9910a implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: b */
    public final /* synthetic */ GiftCardCreateFragment f21865b;

    public /* synthetic */ C9910a(GiftCardCreateFragment giftCardCreateFragment) {
        this.f21865b = giftCardCreateFragment;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        GiftCardCreateFragment.m34983onCreateView$lambda1(this.f21865b, radioGroup, i);
    }
}
