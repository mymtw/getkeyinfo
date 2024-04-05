package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import p753kq.C19863r;

/* renamed from: androidx.core.widget.TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1 */
public final class C2395x3fe43951 implements TextWatcher {
    public final /* synthetic */ C19863r $onTextChanged;

    public C2395x3fe43951(C19863r rVar) {
        this.$onTextChanged = rVar;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.$onTextChanged.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }
}
