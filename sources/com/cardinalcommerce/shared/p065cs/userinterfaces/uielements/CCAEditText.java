package com.cardinalcommerce.shared.p065cs.userinterfaces.uielements;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewDebug;
import android.widget.TextView;
import com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.C6323c;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCAEditText */
public class CCAEditText extends TextView {
    public CCAEditText(Context context) {
        super(context);
    }

    public CCAEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setImeOptions(268435456);
        setCursorVisible(true);
        setSingleLine();
        setGravity(17);
    }

    public CCAEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CCAEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void addTextChangedListener(TextWatcher textWatcher) {
    }

    public CharSequence getCCAText() {
        return super.getText();
    }

    @ViewDebug.ExportedProperty(category = "text")
    public int getSelectionEnd() {
        return getText().toString().length();
    }

    @ViewDebug.ExportedProperty(category = "text")
    public int getSelectionStart() {
        return getText().toString().length();
    }

    public Editable getText() {
        CharSequence text = super.getText();
        if (text == null) {
            return null;
        }
        setCursorVisible(true);
        setTextIsSelectable(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i = 0; i < text.length(); i++) {
            spannableStringBuilder.append('*');
        }
        return spannableStringBuilder;
    }

    public void setCCAFocusableInTouchMode(boolean z) {
        super.setFocusableInTouchMode(z);
    }

    public void setCCAOnFocusChangeListener(C6323c.C6325b bVar) {
        super.setOnFocusChangeListener(bVar);
    }

    public void setCCAText(CharSequence charSequence) {
        super.setText(charSequence, TextView.BufferType.EDITABLE);
    }

    public void setFocusableInTouchMode(boolean z) {
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText("", bufferType);
    }
}
