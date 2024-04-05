package com.cardinalcommerce.shared.p065cs.userinterfaces.uielements;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.C6323c;
import com.etsy.android.R;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.cardinalcommerce.shared.cs.userinterfaces.uielements.a */
public class C6319a extends CompoundButton {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f14060a;

    /* renamed from: com.cardinalcommerce.shared.cs.userinterfaces.uielements.a$a */
    public class C6320a implements C6321b {
        public C6320a() {
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C6319a aVar;
            int i = 1;
            if (C6319a.this.f14060a != 1) {
                aVar = C6319a.this;
            } else {
                aVar = C6319a.this;
                i = 0;
            }
            int unused = aVar.f14060a = i;
            C6319a.this.m12765b();
        }
    }

    /* renamed from: com.cardinalcommerce.shared.cs.userinterfaces.uielements.a$b */
    public interface C6321b extends CompoundButton.OnCheckedChangeListener {
    }

    public C6319a(Context context) {
        super(context);
        m12764a();
    }

    /* renamed from: a */
    private void m12764a() {
        this.f14060a = 0;
        m12765b();
        setCCAOnCheckedChangeListener(new C6320a());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m12765b() {
        int i = this.f14060a != 1 ? R.drawable.ic_uncheck_box : R.drawable.ic_checked_box;
        m12767c();
        setCCAButtonDrawable(i);
        setCCAMarginsBetweenBoxes(this);
    }

    /* renamed from: c */
    private void m12767c() {
        super.setPadding(20, 4, 28, 4);
    }

    private void setCCAMarginsBetweenBoxes(C6319a aVar) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(8, 8, 8, 16);
        aVar.setLayoutParams(layoutParams);
    }

    public int getCCAId() {
        return super.getId();
    }

    public CharSequence getCCAText() {
        return super.getText();
    }

    public int getCheckState() {
        return this.f14060a;
    }

    public int getId() {
        return 0;
    }

    public CharSequence getText() {
        return "*";
    }

    public boolean isChecked() {
        return false;
    }

    public void setButtonDrawable(int i) {
    }

    public void setCCAButtonDrawable(int i) {
        super.setButtonDrawable(i);
    }

    public void setCCAElevation(float f) {
        super.setElevation(f);
    }

    public void setCCAId(int i) {
        super.setId(i);
    }

    public void setCCAOnCheckedChangeListener(C6321b bVar) {
        super.setOnCheckedChangeListener(bVar);
    }

    public void setCCAOnClickListener(C6323c.C6324a aVar) {
        super.setOnClickListener(aVar);
    }

    public void setCCAText(CharSequence charSequence) {
        super.setText(charSequence, TextView.BufferType.EDITABLE);
    }

    public void setCheckState(int i) {
        this.f14060a = i;
        m12765b();
    }

    public void setElevation(float f) {
    }

    public void setId(int i) {
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText("", bufferType);
    }
}
