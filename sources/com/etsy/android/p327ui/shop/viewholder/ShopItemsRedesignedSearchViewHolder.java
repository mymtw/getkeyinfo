package com.etsy.android.p327ui.shop.viewholder;

import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.shop.C11192q0;
import com.etsy.android.vespa.viewholders.C12086e;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.shop.viewholder.ShopItemsRedesignedSearchViewHolder */
public final class ShopItemsRedesignedSearchViewHolder extends C12086e<C11192q0> {

    /* renamed from: c */
    public final TextInputLayout f24848c;

    /* renamed from: d */
    public final TextInputEditText f24849d;

    /* renamed from: e */
    public C11192q0 f24850e;

    /* renamed from: f */
    public final ShopItemsRedesignedSearchViewHolder$textWatcherAdapter$1 f24851f = new ShopItemsRedesignedSearchViewHolder$textWatcherAdapter$1(this);

    /* renamed from: g */
    public final ShopItemsRedesignedSearchViewHolder$closeClickListener$1 f24852g = new ShopItemsRedesignedSearchViewHolder$closeClickListener$1(this);

    /* renamed from: h */
    public final C11275g0 f24853h = new C11275g0(this);

    /* renamed from: i */
    public final C11277h0 f24854i = new C11277h0(this);

    public ShopItemsRedesignedSearchViewHolder(ViewGroup viewGroup) {
        super(C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.shop_home_redesigned_search_field, viewGroup, false));
        View findViewById = this.itemView.findViewById(R.id.text_input_layout);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.text_input_layout)");
        this.f24848c = (TextInputLayout) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.text_input);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.text_input)");
        TextInputEditText textInputEditText = (TextInputEditText) findViewById2;
        this.f24849d = textInputEditText;
        textInputEditText.setImeOptions(2);
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        String str;
        C11192q0 q0Var = (C11192q0) obj;
        this.f24850e = q0Var;
        if (q0Var == null || (str = q0Var.f24744d) == null) {
            str = "";
        }
        this.f24849d.removeTextChangedListener(this.f24851f);
        this.f24849d.setText(str);
        this.f24849d.addTextChangedListener(this.f24851f);
        this.f24849d.setOnEditorActionListener(this.f24854i);
        this.f24849d.setOnKeyListener(this.f24853h);
        this.f24848c.setEndIconOnClickListener(this.f24852g);
    }

    /* renamed from: b */
    public final void mo31374b() {
        this.f24850e = null;
    }

    /* renamed from: g */
    public final void mo36963g() {
        String str;
        this.f24849d.clearFocus();
        Editable text = this.f24849d.getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        C11192q0 q0Var = this.f24850e;
        if (q0Var != null) {
            q0Var.f24745e = str;
            q0Var.f24744d = str;
            q0Var.f24746f = null;
            C11192q0.C11193a aVar = q0Var.f24741a;
            if (aVar != null) {
                aVar.refreshFilterSpinners();
                q0Var.f24741a.performSearch();
                q0Var.f24741a.didSubmitSearchQuery(str);
            }
        }
        C15588c1.m25340p0(this.f24849d);
    }
}
