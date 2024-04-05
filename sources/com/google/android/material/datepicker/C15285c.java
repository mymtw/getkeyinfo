package com.google.android.material.datepicker;

import android.content.Context;
import com.etsy.android.R;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.util.Date;
import p010a9.C0048b;

/* renamed from: com.google.android.material.datepicker.c */
public final class C15285c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ String f34267b;

    /* renamed from: c */
    public final /* synthetic */ C15287e f34268c;

    public C15285c(C15287e eVar, String str) {
        this.f34268c = eVar;
        this.f34267b = str;
    }

    public final void run() {
        C15287e eVar = this.f34268c;
        TextInputLayout textInputLayout = eVar.f34271b;
        DateFormat dateFormat = eVar.f34272c;
        Context context = textInputLayout.getContext();
        textInputLayout.setError(C0048b.m164c(context.getString(R.string.mtrl_picker_invalid_format), "\n", String.format(context.getString(R.string.mtrl_picker_invalid_format_use), new Object[]{this.f34267b}), "\n", String.format(context.getString(R.string.mtrl_picker_invalid_format_example), new Object[]{dateFormat.format(new Date(C15301r.m24856f().getTimeInMillis()))})));
        this.f34268c.mo53845a();
    }
}
