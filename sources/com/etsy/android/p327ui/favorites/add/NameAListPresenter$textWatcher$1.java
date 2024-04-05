package com.etsy.android.p327ui.favorites.add;

import android.text.Editable;
import android.text.TextWatcher;
import com.etsy.android.R;
import com.etsy.android.stylekit.views.CollageTextInput;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.favorites.add.NameAListPresenter$textWatcher$1 */
public final class NameAListPresenter$textWatcher$1 implements TextWatcher {
    public final /* synthetic */ NameAListPresenter this$0;

    public NameAListPresenter$textWatcher$1(NameAListPresenter nameAListPresenter) {
        this.this$0 = nameAListPresenter;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (C18263b.m30837c0(charSequence != null ? charSequence.toString() : null)) {
            CollageTextInput collageTextInput = (CollageTextInput) this.this$0.f21568a._$_findCachedViewById(R.id.name_input);
            if (collageTextInput != null) {
                collageTextInput.setErrorText((String) null);
            }
            CollageTextInput collageTextInput2 = (CollageTextInput) this.this$0.f21568a._$_findCachedViewById(R.id.name_input);
            if (collageTextInput2 != null) {
                collageTextInput2.setTextChangeListener((TextWatcher) null);
            }
        }
    }
}
