package com.jakewharton.rxbinding2.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import p145io.reactivex.Observer;
import p258up.C8179a;
import p525co.C14173a;

/* renamed from: com.jakewharton.rxbinding2.widget.s */
public final class C17033s extends C14173a<C17032r> {

    /* renamed from: b */
    public final TextView f37390b;

    /* renamed from: com.jakewharton.rxbinding2.widget.s$a */
    public static final class C17034a extends C8179a implements TextWatcher {

        /* renamed from: c */
        public final TextView f37391c;

        /* renamed from: d */
        public final Observer<? super C17032r> f37392d;

        public C17034a(TextView textView, Observer<? super C17032r> observer) {
            this.f37391c = textView;
            this.f37392d = observer;
        }

        /* renamed from: a */
        public final void mo20811a() {
            this.f37391c.removeTextChangedListener(this);
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!isDisposed()) {
                this.f37392d.onNext(C17032r.create(this.f37391c, charSequence, i, i2, i3));
            }
        }
    }

    public C17033s(EditText editText) {
        this.f37390b = editText;
    }

    /* renamed from: l */
    public final Object mo47114l() {
        TextView textView = this.f37390b;
        return C17032r.create(textView, textView.getText(), 0, 0, 0);
    }

    /* renamed from: m */
    public final void mo47115m(Observer<? super C17032r> observer) {
        C17034a aVar = new C17034a(this.f37390b, observer);
        observer.onSubscribe(aVar);
        this.f37390b.addTextChangedListener(aVar);
    }
}
