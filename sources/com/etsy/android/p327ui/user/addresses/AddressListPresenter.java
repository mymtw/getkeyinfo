package com.etsy.android.p327ui.user.addresses;

import java.util.List;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.LambdaObserver;
import p145io.reactivex.internal.operators.observable.C19172m;
import p145io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p456ua.C13461f;

/* renamed from: com.etsy.android.ui.user.addresses.AddressListPresenter */
public final class AddressListPresenter {

    /* renamed from: a */
    public final C13461f f25092a;

    /* renamed from: b */
    public C11452u f25093b;

    /* renamed from: c */
    public C11460w f25094c;

    /* renamed from: d */
    public final C7091a f25095d = new C7091a();

    /* renamed from: e */
    public boolean f25096e;

    /* renamed from: f */
    public List<AddressItemUI> f25097f;

    public AddressListPresenter(C13461f fVar) {
        this.f25092a = fVar;
    }

    /* renamed from: a */
    public final void mo37219a() {
        C11460w wVar = this.f25094c;
        if (wVar != null) {
            C19172m b = wVar.mo37317b();
            this.f25092a.getClass();
            ObservableSubscribeOn i = b.mo20639i(C13461f.m21235b());
            this.f25092a.getClass();
            LambdaObserver f = SubscribersKt.m32501f(i.mo20635e(C13461f.m21236c()), new AddressListPresenter$loadAddresses$1(this), new AddressListPresenter$loadAddresses$2(this), 2);
            C7091a aVar = this.f25095d;
            C19383o.m32798h(aVar, "compositeDisposable");
            aVar.mo19403b(f);
        }
    }
}
