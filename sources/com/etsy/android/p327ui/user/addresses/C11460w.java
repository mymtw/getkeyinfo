package com.etsy.android.p327ui.user.addresses;

import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0391c;
import androidx.compose.animation.C0472h;
import androidx.lifecycle.C2866i0;
import com.etsy.android.p327ui.search.p330v2.C11027h;
import com.etsy.android.p327ui.user.addresses.C11381a0;
import com.etsy.android.p327ui.user.addresses.C11445t;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.observable.C19172m;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p145io.reactivex.subjects.C19254a;
import p145io.reactivex.subjects.PublishSubject;
import p346fa.C12703a;
import p456ua.C13461f;
import p486y9.C13888d;

/* renamed from: com.etsy.android.ui.user.addresses.w */
public final class C11460w extends C2866i0 {

    /* renamed from: b */
    public final C13461f f25290b;

    /* renamed from: c */
    public final C11393c0 f25291c;

    /* renamed from: d */
    public final C13888d f25292d;

    /* renamed from: e */
    public final C12703a f25293e;

    /* renamed from: f */
    public final C7091a f25294f = new C7091a();

    /* renamed from: g */
    public final C19254a<C11445t> f25295g = new C19254a<>();

    /* renamed from: h */
    public final PublishSubject<C11410f0> f25296h = new PublishSubject<>();

    public C11460w(C13461f fVar, C11393c0 c0Var, C13888d dVar, C12703a aVar) {
        C19383o.m32797g(fVar, "schedulers");
        C19383o.m32797g(c0Var, "addressesRepository");
        C19383o.m32797g(dVar, "currentLocale");
        C19383o.m32797g(aVar, "grafana");
        this.f25290b = fVar;
        this.f25291c = c0Var;
        this.f25292d = dVar;
        this.f25293e = aVar;
    }

    /* renamed from: b */
    public final C19172m mo37317b() {
        this.f25295g.onNext(C11445t.C11450e.f25269a);
        ConsumerSingleObserver e = SubscribersKt.m32500e(new C19208j(C0391c.m1056b(this.f25290b, C0326j.m860e(this.f25290b, this.f25291c.mo37264a(C11381a0.C11384c.f25112a))), new C11027h(this, 2)), new AddressListViewModel$loadAddresses$2(this), new AddressListViewModel$loadAddresses$3(this));
        C7091a aVar = this.f25294f;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(e);
        C19254a<C11445t> aVar2 = this.f25295g;
        return C0472h.m1241b(aVar2, aVar2);
    }

    public final void onCleared() {
        super.onCleared();
        this.f25294f.mo19405d();
    }
}
