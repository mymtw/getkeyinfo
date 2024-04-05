package com.jakewharton.rxbinding2.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import p145io.reactivex.Observer;
import p258up.C8179a;
import p525co.C14173a;

/* renamed from: com.jakewharton.rxbinding2.widget.t */
public final class C17035t extends C14173a<CharSequence> {

    /* renamed from: b */
    public final TextView f37393b;

    /* renamed from: com.jakewharton.rxbinding2.widget.t$a */
    public static final class C17036a extends C8179a implements TextWatcher {

        /* renamed from: c */
        public final TextView f37394c;

        /* renamed from: d */
        public final Observer<? super CharSequence> f37395d;

        public C17036a(TextView textView, Observer<? super CharSequence> observer) {
            this.f37394c = textView;
            this.f37395d = observer;
        }

        /* renamed from: a */
        public final void mo20811a() {
            this.f37394c.removeTextChangedListener(this);
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!isDisposed()) {
                this.f37395d.onNext(charSequence);
            }
        }
    }

    public C17035t(EditText editText) {
        this.f37393b = editText;
    }

    /* renamed from: l */
    public final Object mo47114l() {
        return this.f37393b.getText();
    }

    /* renamed from: m */
    public final void mo47115m(Observer<? super CharSequence> observer) {
        C17036a aVar = new C17036a(this.f37393b, observer);
        observer.onSubscribe(aVar);
        this.f37393b.addTextChangedListener(aVar);
    }
}
