package com.etsy.android.p327ui.cart.viewholders;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.EditText;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.util.C8920s;
import com.google.android.play.core.assetpacks.C15588c1;

/* renamed from: com.etsy.android.ui.cart.viewholders.n */
public final /* synthetic */ class C9400n implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: b */
    public final /* synthetic */ C9405s f20832b;

    /* renamed from: c */
    public final /* synthetic */ Context f20833c;

    /* renamed from: d */
    public final /* synthetic */ CartGroupItem f20834d;

    public /* synthetic */ C9400n(C9405s sVar, Context context, CartGroupItem cartGroupItem) {
        this.f20832b = sVar;
        this.f20833c = context;
        this.f20834d = cartGroupItem;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C9405s sVar = this.f20832b;
        Context context = this.f20833c;
        CartGroupItem cartGroupItem = this.f20834d;
        sVar.f20845e.setText(C9405s.m17761j(context, z));
        if (sVar.f20853m != null) {
            sVar.f20845e.setContentDescription(sVar.mo31844i(context, Boolean.valueOf(z)));
        }
        if (z) {
            sVar.f20850j.setVisibility(0);
            EditText editText = sVar.f20850j;
            editText.postDelayed(new C8920s(editText, (InputMethodManager) editText.getContext().getSystemService("input_method")), 200);
            return;
        }
        sVar.f20850j.setVisibility(8);
        sVar.f20850j.setText("");
        sVar.mo31846l(cartGroupItem, "");
        C15588c1.m25340p0(sVar.f20850j);
    }
}
