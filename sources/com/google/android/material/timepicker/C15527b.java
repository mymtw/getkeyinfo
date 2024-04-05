package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: com.google.android.material.timepicker.b */
public final class C15527b implements InputFilter {

    /* renamed from: a */
    public int f34887a;

    public C15527b(int i) {
        this.f34887a = i;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i3, i4, charSequence.subSequence(i, i2).toString());
            if (Integer.parseInt(sb.toString()) <= this.f34887a) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
