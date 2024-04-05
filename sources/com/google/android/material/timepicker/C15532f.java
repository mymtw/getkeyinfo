package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/* renamed from: com.google.android.material.timepicker.f */
public final class C15532f implements TextView.OnEditorActionListener, View.OnKeyListener {

    /* renamed from: b */
    public final ChipTextInputComboView f34900b;

    /* renamed from: c */
    public final ChipTextInputComboView f34901c;

    /* renamed from: d */
    public final TimeModel f34902d;

    /* renamed from: e */
    public boolean f34903e = false;

    public C15532f(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, TimeModel timeModel) {
        this.f34900b = chipTextInputComboView;
        this.f34901c = chipTextInputComboView2;
        this.f34902d = timeModel;
    }

    /* renamed from: a */
    public final void mo55199a(int i) {
        boolean z = true;
        this.f34901c.setChecked(i == 12);
        ChipTextInputComboView chipTextInputComboView = this.f34900b;
        if (i != 10) {
            z = false;
        }
        chipTextInputComboView.setChecked(z);
        this.f34902d.f34874g = i;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z = i == 5;
        if (z) {
            mo55199a(12);
        }
        return z;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (this.f34903e) {
            return false;
        }
        boolean z = true;
        this.f34903e = true;
        EditText editText = (EditText) view;
        if (this.f34902d.f34874g == 12) {
            if (i == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
                mo55199a(10);
                this.f34903e = false;
                return z;
            }
        } else {
            Editable text = editText.getText();
            if (text != null) {
                if (i >= 7 && i <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
                    mo55199a(12);
                    this.f34903e = false;
                    return z;
                }
            }
        }
        z = false;
        this.f34903e = false;
        return z;
    }
}
