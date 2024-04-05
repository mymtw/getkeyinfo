package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import p753kq.C19857l;

/* renamed from: androidx.core.widget.TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1 */
public final class C2393xbb2cb19c implements TextWatcher {
    public final /* synthetic */ C19857l $afterTextChanged;

    public C2393xbb2cb19c(C19857l lVar) {
        this.$afterTextChanged = lVar;
    }

    public void afterTextChanged(Editable editable) {
        this.$afterTextChanged.invoke(editable);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
