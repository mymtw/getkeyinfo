package com.cardinalcommerce.shared.p065cs.userinterfaces.uielements;

import android.content.Context;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.etsy.android.R;

/* renamed from: com.cardinalcommerce.shared.cs.userinterfaces.uielements.b */
public class C6322b extends CompoundButton {
    public C6322b(Context context) {
        super(context);
        m12768b();
    }

    /* renamed from: b */
    private void m12768b() {
        mo17956a();
        setCCAButtonDrawable(R.drawable.ic_radio_button_unchecked);
        setCCAMarginsBetweenBoxes(this);
    }

    private void setCCAMarginsBetweenBoxes(C6322b bVar) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(8, 8, 8, 16);
        bVar.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public void mo17956a() {
        super.setPadding(20, 4, 28, 4);
    }

    public CharSequence getCCAText() {
        return super.getText();
    }

    public CharSequence getText() {
        return "*";
    }

    public void setButtonDrawable(int i) {
    }

    public void setCCAButtonDrawable(int i) {
        super.setButtonDrawable(i);
    }

    public void setCCAText(CharSequence charSequence) {
        super.setText(charSequence, TextView.BufferType.EDITABLE);
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
    }
}
