package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.etsy.android.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.C15368h;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout;

class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: b */
    public final Chip f34826b;

    /* renamed from: c */
    public final TextInputLayout f34827c;

    /* renamed from: d */
    public final EditText f34828d;

    /* renamed from: e */
    public C15509a f34829e;

    /* renamed from: com.google.android.material.timepicker.ChipTextInputComboView$a */
    public class C15509a extends TextWatcherAdapter {
        public C15509a() {
        }

        public final void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
                chipTextInputComboView.f34826b.setText(TimeModel.m25113a(chipTextInputComboView.getResources(), "00", "%02d"));
                return;
            }
            ChipTextInputComboView chipTextInputComboView2 = ChipTextInputComboView.this;
            chipTextInputComboView2.f34826b.setText(TimeModel.m25113a(chipTextInputComboView2.getResources(), editable, "%02d"));
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, this, false);
        this.f34826b = chip;
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, this, false);
        this.f34827c = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f34828d = editText;
        editText.setVisibility(4);
        C15509a aVar = new C15509a();
        this.f34829e = aVar;
        editText.addTextChangedListener(aVar);
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        editText.setSaveEnabled(false);
    }

    /* renamed from: a */
    public final void mo55134a(String str) {
        this.f34826b.setText(TimeModel.m25113a(getResources(), str, "%02d"));
        if (!TextUtils.isEmpty(this.f34828d.getText())) {
            this.f34828d.removeTextChangedListener(this.f34829e);
            this.f34828d.setText((CharSequence) null);
            this.f34828d.addTextChangedListener(this.f34829e);
        }
    }

    public final boolean isChecked() {
        return this.f34826b.isChecked();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f34828d.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    public final void setChecked(boolean z) {
        this.f34826b.setChecked(z);
        int i = 0;
        this.f34828d.setVisibility(z ? 0 : 4);
        Chip chip = this.f34826b;
        if (z) {
            i = 8;
        }
        chip.setVisibility(i);
        if (isChecked()) {
            EditText editText = this.f34828d;
            editText.requestFocus();
            editText.post(new C15368h(editText));
            if (!TextUtils.isEmpty(this.f34828d.getText())) {
                EditText editText2 = this.f34828d;
                editText2.setSelection(editText2.getText().length());
            }
        }
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f34826b.setOnClickListener(onClickListener);
    }

    public final void setTag(int i, Object obj) {
        this.f34826b.setTag(i, obj);
    }

    public final void toggle() {
        this.f34826b.toggle();
    }
}
