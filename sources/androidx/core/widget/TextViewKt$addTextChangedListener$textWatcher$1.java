package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.C19394m;
import p753kq.C19857l;
import p753kq.C19863r;

public final class TextViewKt$addTextChangedListener$textWatcher$1 implements TextWatcher {
    public final /* synthetic */ C19857l<Editable, C19394m> $afterTextChanged;
    public final /* synthetic */ C19863r<CharSequence, Integer, Integer, Integer, C19394m> $beforeTextChanged;
    public final /* synthetic */ C19863r<CharSequence, Integer, Integer, Integer, C19394m> $onTextChanged;

    public TextViewKt$addTextChangedListener$textWatcher$1(C19857l<? super Editable, C19394m> lVar, C19863r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, C19394m> rVar, C19863r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, C19394m> rVar2) {
        this.$afterTextChanged = lVar;
        this.$beforeTextChanged = rVar;
        this.$onTextChanged = rVar2;
    }

    public void afterTextChanged(Editable editable) {
        this.$afterTextChanged.invoke(editable);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.$beforeTextChanged.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.$onTextChanged.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }
}
