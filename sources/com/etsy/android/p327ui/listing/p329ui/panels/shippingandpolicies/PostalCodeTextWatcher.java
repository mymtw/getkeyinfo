package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies;

import android.text.Editable;
import com.etsy.android.stylekit.views.CollageTextInput;
import com.etsy.android.uikit.text.TextWatcherAdapter;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p309ad.C8504a;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.PostalCodeTextWatcher */
public final class PostalCodeTextWatcher extends TextWatcherAdapter {
    public static final int $stable = 8;
    private final CollageTextInput editableZip;
    private int oldCount;
    private final C8504a postalCodeFormatter;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PostalCodeTextWatcher(CollageTextInput collageTextInput) {
        this(collageTextInput, (C8504a) null, 2, (DefaultConstructorMarker) null);
        C19383o.m32797g(collageTextInput, "editableZip");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PostalCodeTextWatcher(CollageTextInput collageTextInput, C8504a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(collageTextInput, (i & 2) != 0 ? null : aVar);
    }

    public void afterTextChanged(Editable editable) {
        String valueOf = String.valueOf(editable);
        C8504a aVar = this.postalCodeFormatter;
        if (aVar != null) {
            String valueOf2 = String.valueOf(aVar.mo1128c(this.oldCount, valueOf));
            if (!C19383o.m32792b(valueOf2, String.valueOf(editable))) {
                this.editableZip.setText(valueOf2);
                if (C18263b.m30839d0(this.editableZip.getText())) {
                    CollageTextInput collageTextInput = this.editableZip;
                    collageTextInput.setSelection(collageTextInput.getText().length());
                }
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.oldCount = this.editableZip.getText().length();
    }

    public PostalCodeTextWatcher(CollageTextInput collageTextInput, C8504a aVar) {
        C19383o.m32797g(collageTextInput, "editableZip");
        this.editableZip = collageTextInput;
        this.postalCodeFormatter = aVar;
    }
}
