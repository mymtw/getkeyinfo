package com.etsy.android.p327ui.favorites.createalist;

import android.text.Editable;
import android.text.TextWatcher;
import com.etsy.android.R;
import com.etsy.android.stylekit.views.CollageTextInput;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.favorites.createalist.NameAListPresenter$textwatcher$1 */
public final class NameAListPresenter$textwatcher$1 implements TextWatcher {
    public final /* synthetic */ NameAListPresenter this$0;

    public NameAListPresenter$textwatcher$1(NameAListPresenter nameAListPresenter) {
        this.this$0 = nameAListPresenter;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (C18263b.m30837c0(charSequence != null ? charSequence.toString() : null)) {
            ((CollageTextInput) this.this$0.f21676a._$_findCachedViewById(R.id.name_input)).setErrorText((String) null);
            ((CollageTextInput) this.this$0.f21676a._$_findCachedViewById(R.id.name_input)).setTextChangeListener(this);
        }
    }
}
