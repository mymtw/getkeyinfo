package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import p753kq.C19863r;

/* renamed from: androidx.core.widget.TextViewKt$doBeforeTextChanged$$inlined$addTextChangedListener$default$1 */
public final class C2394x44bcd5b1 implements TextWatcher {
    public final /* synthetic */ C19863r $beforeTextChanged;

    public C2394x44bcd5b1(C19863r rVar) {
        this.$beforeTextChanged = rVar;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.$beforeTextChanged.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
