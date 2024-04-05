package com.etsy.android.p327ui.user.addresses.viewholders;

import android.text.Editable;
import android.text.TextWatcher;
import com.etsy.android.p327ui.user.addresses.C11396e;
import com.etsy.android.p327ui.user.addresses.C11430n;
import com.etsy.android.p327ui.user.addresses.PostalCodeSuggestion;
import com.etsy.android.stylekit.views.CollageTypeAhead;
import java.util.List;
import kotlin.C19394m;
import p628nj.C18263b;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.user.addresses.viewholders.AddressTypeAheadViewHolder$bind$1 */
public final class AddressTypeAheadViewHolder$bind$1 implements TextWatcher {
    public final /* synthetic */ C19861p<String, C19857l<? super List<PostalCodeSuggestion>, C19394m>, C19394m> $fetchSuggestions;
    public final /* synthetic */ C11396e $item;
    public final /* synthetic */ CollageTypeAhead $itemView;
    public final /* synthetic */ C11459f this$0;

    public AddressTypeAheadViewHolder$bind$1(C11396e eVar, CollageTypeAhead collageTypeAhead, C11459f fVar, C19861p<? super String, ? super C19857l<? super List<PostalCodeSuggestion>, C19394m>, C19394m> pVar) {
        this.$item = eVar;
        this.$itemView = collageTypeAhead;
        this.this$0 = fVar;
        this.$fetchSuggestions = pVar;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((C11396e.C11405i) this.$item).f25132a.f25234i = String.valueOf(charSequence);
        if (C18263b.m30839d0(charSequence)) {
            this.$itemView.setErrorText((String) null);
            ((C11396e.C11405i) this.$item).f25132a.f25235j = null;
        }
        this.this$0.f25289c.invoke(new C11430n.C11437g(this.$item, String.valueOf(charSequence)));
        if (i >= 2 && i3 == 1 && i2 == 0) {
            this.$fetchSuggestions.invoke(String.valueOf(charSequence), new AddressTypeAheadViewHolder$bind$1$onTextChanged$1(this.$itemView, this.this$0));
        }
    }
}
