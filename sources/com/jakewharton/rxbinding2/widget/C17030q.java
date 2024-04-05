package com.jakewharton.rxbinding2.widget;

import android.os.Looper;
import android.support.p013v4.media.C0072d;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.C7092b;
import p248tp.C8061n;
import p258up.C8179a;
import p287xp.C8340h;
import p553do.C17700a;

/* renamed from: com.jakewharton.rxbinding2.widget.q */
public final class C17030q extends C8061n<C17029p> {

    /* renamed from: b */
    public final TextView f37385b;

    /* renamed from: c */
    public final C8340h<? super C17029p> f37386c;

    /* renamed from: com.jakewharton.rxbinding2.widget.q$a */
    public static final class C17031a extends C8179a implements TextView.OnEditorActionListener {

        /* renamed from: c */
        public final TextView f37387c;

        /* renamed from: d */
        public final Observer<? super C17029p> f37388d;

        /* renamed from: e */
        public final C8340h<? super C17029p> f37389e;

        public C17031a(TextView textView, Observer<? super C17029p> observer, C8340h<? super C17029p> hVar) {
            this.f37387c = textView;
            this.f37388d = observer;
            this.f37389e = hVar;
        }

        /* renamed from: a */
        public final void mo20811a() {
            this.f37387c.setOnEditorActionListener((TextView.OnEditorActionListener) null);
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            C17029p create = C17029p.create(this.f37387c, i, keyEvent);
            try {
                if (isDisposed() || !this.f37389e.test(create)) {
                    return false;
                }
                this.f37388d.onNext(create);
                return true;
            } catch (Exception e) {
                this.f37388d.onError(e);
                dispose();
                return false;
            }
        }
    }

    public C17030q(EditText editText) {
        C17700a.C17701a aVar = C17700a.f38506a;
        this.f37385b = editText;
        this.f37386c = aVar;
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super C17029p> observer) {
        boolean z;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            observer.onSubscribe(C7092b.m13750a());
            StringBuilder h = C0072d.m201h("Expected to be called on the main thread but was ");
            h.append(Thread.currentThread().getName());
            observer.onError(new IllegalStateException(h.toString()));
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C17031a aVar = new C17031a(this.f37385b, observer, this.f37386c);
            observer.onSubscribe(aVar);
            this.f37385b.setOnEditorActionListener(aVar);
        }
    }
}
