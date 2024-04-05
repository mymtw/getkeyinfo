package com.cardinalcommerce.shared.p065cs.userinterfaces.uielements;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.C6323c;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCATextView */
public class CCATextView extends TextView {
    public CCATextView(Context context) {
        super(context);
    }

    public CCATextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CCATextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CCATextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public CharSequence getCCAText() {
        return super.getText();
    }

    public CharSequence getText() {
        return "";
    }

    public void setCCAOnClickListener(C6323c.C6324a aVar) {
        super.setOnClickListener(aVar);
    }

    public void setCCAOnFocusChangeListener(C6323c.C6325b bVar) {
        super.setOnFocusChangeListener(bVar);
    }

    public void setCCAOnTouchListener(C6323c.C6327d dVar) {
        super.setOnTouchListener(dVar);
    }

    public void setCCAText(CharSequence charSequence) {
        super.setText(charSequence, TextView.BufferType.EDITABLE);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText("", bufferType);
    }
}
