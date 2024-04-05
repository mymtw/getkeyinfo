package com.etsy.android.vespa;

import android.text.Editable;
import android.text.TextWatcher;
import com.etsy.android.R;
import p415of.C13178g;
import p628nj.C18263b;

public final class GiftOptionsHelper$setUpGiftMessage$2 implements TextWatcher {
    public final /* synthetic */ C13178g this$0;

    public GiftOptionsHelper$setUpGiftMessage$2(C13178g gVar) {
        this.this$0 = gVar;
    }

    public void afterTextChanged(Editable editable) {
        if (!C18263b.m30839d0(editable) || editable.toString().length() <= 150) {
            C13178g.m20857b(this.this$0, String.valueOf(editable));
            this.this$0.f29009i.setErrorText((String) null);
            return;
        }
        C13178g gVar = this.this$0;
        gVar.f29009i.setErrorText(gVar.f29001a.getContext().getString(R.string.gift_options_gift_message_too_long, new Object[]{150}));
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
