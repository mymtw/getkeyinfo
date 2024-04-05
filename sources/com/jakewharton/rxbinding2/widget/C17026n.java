package com.jakewharton.rxbinding2.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import p145io.reactivex.Observer;
import p258up.C8179a;
import p525co.C14173a;

/* renamed from: com.jakewharton.rxbinding2.widget.n */
public final class C17026n extends C14173a<C17025m> {

    /* renamed from: b */
    public final TextView f37382b;

    /* renamed from: com.jakewharton.rxbinding2.widget.n$a */
    public static final class C17027a extends C8179a implements TextWatcher {

        /* renamed from: c */
        public final TextView f37383c;

        /* renamed from: d */
        public final Observer<? super C17025m> f37384d;

        public C17027a(TextView textView, Observer<? super C17025m> observer) {
            this.f37383c = textView;
            this.f37384d = observer;
        }

        /* renamed from: a */
        public final void mo20811a() {
            this.f37383c.removeTextChangedListener(this);
        }

        public final void afterTextChanged(Editable editable) {
            this.f37384d.onNext(C17025m.create(this.f37383c, editable));
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public C17026n(EditText editText) {
        this.f37382b = editText;
    }

    /* renamed from: l */
    public final Object mo47114l() {
        TextView textView = this.f37382b;
        return C17025m.create(textView, textView.getEditableText());
    }

    /* renamed from: m */
    public final void mo47115m(Observer<? super C17025m> observer) {
        C17027a aVar = new C17027a(this.f37382b, observer);
        observer.onSubscribe(aVar);
        this.f37382b.addTextChangedListener(aVar);
    }
}
