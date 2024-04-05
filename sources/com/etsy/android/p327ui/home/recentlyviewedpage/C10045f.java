package com.etsy.android.p327ui.home.recentlyviewedpage;

import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2895z;
import com.etsy.android.util.C12059p;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p456ua.C13461f;

/* renamed from: com.etsy.android.ui.home.recentlyviewedpage.f */
public final class C10045f extends C2866i0 {

    /* renamed from: b */
    public final C10043d f22103b;

    /* renamed from: c */
    public final C13461f f22104c;

    /* renamed from: d */
    public final C7091a f22105d;

    /* renamed from: e */
    public final C2895z<C12059p<C10039b>> f22106e;

    /* renamed from: f */
    public final C2895z f22107f;

    public C10045f(C10043d dVar, C13461f fVar, C7091a aVar) {
        C19383o.m32797g(dVar, "recentlyViewedPageRepository");
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(aVar, "compositeDisposable");
        this.f22103b = dVar;
        this.f22104c = fVar;
        this.f22105d = aVar;
        C2895z<C12059p<C10039b>> zVar = new C2895z<>();
        this.f22106e = zVar;
        this.f22107f = zVar;
    }

    public final void onCleared() {
        this.f22105d.mo19405d();
    }
}
