package com.etsy.android.p327ui.search.container;

import androidx.lifecycle.C2866i0;
import kotlin.C19394m;
import p145io.reactivex.internal.observers.LambdaObserver;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p145io.reactivex.subjects.PublishSubject;
import p430qe.C13301b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.container.SearchNavigationViewModel */
public final class SearchNavigationViewModel extends C2866i0 {

    /* renamed from: b */
    public final PublishSubject<C13301b> f23672b;

    /* renamed from: c */
    public LambdaObserver f23673c;

    public SearchNavigationViewModel() {
        PublishSubject<C13301b> publishSubject = new PublishSubject<>();
        this.f23672b = publishSubject;
        this.f23673c = SubscribersKt.m32501f(publishSubject, (C19857l) null, new C19857l<C13301b, C19394m>(this) {
            public final /* synthetic */ SearchNavigationViewModel this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C13301b) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C13301b bVar) {
                this.this$0.getClass();
            }
        }, 3);
    }

    public final void onCleared() {
        super.onCleared();
        this.f23673c.dispose();
    }
}
