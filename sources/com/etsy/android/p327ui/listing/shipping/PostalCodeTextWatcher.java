package com.etsy.android.p327ui.listing.shipping;

import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.widget.EditText;
import com.appboy.Constants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p309ad.C8504a;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.listing.shipping.PostalCodeTextWatcher */
public final class PostalCodeTextWatcher implements TextWatcher {
    public static final int $stable = 8;
    private final EditText editableZip;
    private int maxLength;
    private int oldCount;
    private C8504a postalCodeFormatter;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PostalCodeTextWatcher(EditText editText) {
        this(editText, false, 2, (DefaultConstructorMarker) null);
        C19383o.m32797g(editText, "editableZip");
    }

    public PostalCodeTextWatcher(EditText editText, boolean z) {
        C19383o.m32797g(editText, "editableZip");
        this.editableZip = editText;
        this.maxLength = -1;
        if (z) {
            InputFilter[] filters = editText.getFilters();
            C19383o.m32796f(filters, "editableZip.filters");
            for (InputFilter inputFilter : filters) {
                C19383o.m32796f(inputFilter, "editableZip.filters");
                if (inputFilter instanceof InputFilter.LengthFilter) {
                    this.maxLength = ((InputFilter.LengthFilter) inputFilter).getMax();
                }
            }
        }
    }

    public void afterTextChanged(Editable editable) {
        String valueOf = String.valueOf(editable);
        C8504a aVar = this.postalCodeFormatter;
        if (aVar != null) {
            valueOf = String.valueOf(aVar != null ? aVar.mo1128c(this.oldCount, valueOf) : null);
        }
        if (!C19383o.m32792b(valueOf, String.valueOf(editable))) {
            this.editableZip.setText(valueOf);
            if (C18263b.m30839d0(this.editableZip.getText())) {
                EditText editText = this.editableZip;
                editText.setSelection(editText.getText().length());
            }
        }
        if (valueOf.length() - this.oldCount == 1 && valueOf.length() == this.maxLength) {
            this.editableZip.onEditorAction(6);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C19383o.m32797g(charSequence, Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY);
        this.oldCount = this.editableZip.length();
    }

    public final C8504a getPostalCodeFormatter() {
        return this.postalCodeFormatter;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C19383o.m32797g(charSequence, Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY);
    }

    public final void setPostalCodeFormatter(C8504a aVar) {
        this.postalCodeFormatter = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PostalCodeTextWatcher(EditText editText, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(editText, (i & 2) != 0 ? false : z);
    }
}
