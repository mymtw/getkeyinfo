package com.etsy.android.p327ui.listing.p329ui.buyitnow;

import androidx.compose.animation.C0472h;
import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2895z;
import com.etsy.android.C6487g;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.UiState;
import com.etsy.android.util.C12059p;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.subjects.PublishSubject;
import p456ua.C13461f;

/* renamed from: com.etsy.android.ui.listing.ui.buyitnow.d */
public final class C10384d extends C2866i0 {

    /* renamed from: b */
    public final C13461f f22738b;

    /* renamed from: c */
    public final C2895z<UiState> f22739c = new C2895z<>(UiState.C10366a.f22722b);

    /* renamed from: d */
    public final PublishSubject<C12059p<C10385e>> f22740d;

    /* renamed from: e */
    public final PublishSubject f22741e;

    /* renamed from: f */
    public final C7091a f22742f;

    public C10384d(C13461f fVar, C10368a aVar) {
        C19383o.m32797g(aVar, "dispatcher");
        this.f22738b = fVar;
        PublishSubject<C12059p<C10385e>> publishSubject = new PublishSubject<>();
        this.f22740d = publishSubject;
        this.f22741e = publishSubject;
        C7091a aVar2 = new C7091a();
        this.f22742f = aVar2;
        PublishSubject<T> publishSubject2 = aVar.f26240a;
        aVar2.mo19403b(C0472h.m1242c(publishSubject2, publishSubject2).mo20639i(C13461f.m21236c()).mo20635e(C13461f.m21236c()).mo20637g(new C6487g(this, 6)));
    }

    public final void onCleared() {
        this.f22742f.mo19405d();
    }
}
