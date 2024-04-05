package com.google.android.material.datepicker;

import android.text.TextUtils;
import com.etsy.android.R;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.google.android.material.datepicker.e */
public abstract class C15287e extends TextWatcherAdapter {

    /* renamed from: b */
    public final TextInputLayout f34271b;

    /* renamed from: c */
    public final DateFormat f34272c;

    /* renamed from: d */
    public final CalendarConstraints f34273d;

    /* renamed from: e */
    public final String f34274e;

    /* renamed from: f */
    public final C15285c f34275f;

    /* renamed from: g */
    public C15286d f34276g;

    public C15287e(String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f34272c = simpleDateFormat;
        this.f34271b = textInputLayout;
        this.f34273d = calendarConstraints;
        this.f34274e = textInputLayout.getContext().getString(R.string.mtrl_picker_out_of_range);
        this.f34275f = new C15285c(this, str);
    }

    /* renamed from: a */
    public abstract void mo53845a();

    /* renamed from: b */
    public abstract void mo53846b(Long l);

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f34271b.removeCallbacks(this.f34275f);
        this.f34271b.removeCallbacks(this.f34276g);
        this.f34271b.setError((CharSequence) null);
        mo53846b((Long) null);
        if (!TextUtils.isEmpty(charSequence)) {
            try {
                Date parse = this.f34272c.parse(charSequence.toString());
                this.f34271b.setError((CharSequence) null);
                long time = parse.getTime();
                if (!this.f34273d.getDateValidator().isValid(time) || !this.f34273d.isWithinBounds(time)) {
                    C15286d dVar = new C15286d(this, time);
                    this.f34276g = dVar;
                    this.f34271b.postDelayed(dVar, 1000);
                    return;
                }
                mo53846b(Long.valueOf(parse.getTime()));
            } catch (ParseException unused) {
                this.f34271b.postDelayed(this.f34275f, 1000);
            }
        }
    }
}
