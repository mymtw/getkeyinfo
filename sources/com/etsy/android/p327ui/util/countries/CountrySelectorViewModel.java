package com.etsy.android.p327ui.util.countries;

import androidx.lifecycle.C2866i0;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.Country;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.LambdaObserver;
import p145io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p145io.reactivex.subjects.C19254a;
import p145io.reactivex.subjects.PublishSubject;
import p346fa.C12703a;
import p456ua.C13461f;
import p470w9.C13794b;
import p486y9.C13888d;

/* renamed from: com.etsy.android.ui.util.countries.CountrySelectorViewModel */
public final class CountrySelectorViewModel extends C2866i0 {

    /* renamed from: b */
    public final C13794b f26228b;

    /* renamed from: c */
    public final C13461f f26229c;

    /* renamed from: d */
    public final C8694h f26230d;

    /* renamed from: e */
    public final PublishSubject<List<Country>> f26231e = new PublishSubject<>();

    /* renamed from: f */
    public final C19254a<Country> f26232f;

    /* renamed from: g */
    public final C7091a f26233g;

    public CountrySelectorViewModel(C13794b bVar, C13461f fVar, C8694h hVar, C12703a aVar, C8618c cVar, C13888d dVar) {
        C19383o.m32797g(bVar, "countriesRepository");
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(hVar, "logCat");
        C19383o.m32797g(aVar, "grafana");
        C19383o.m32797g(cVar, "configMap");
        C19383o.m32797g(dVar, "currentLocale");
        this.f26228b = bVar;
        this.f26229c = fVar;
        this.f26230d = hVar;
        C19254a<Country> aVar2 = new C19254a<>();
        this.f26232f = aVar2;
        this.f26233g = new C7091a();
        Locale c = dVar.mo46719c();
        String displayCountry = c.getDisplayCountry();
        C19383o.m32796f(displayCountry, "locale.displayCountry");
        String country = c.getCountry();
        C19383o.m32796f(country, "locale.country");
        aVar2.onNext(new Country(0, displayCountry, country, (String) null, (String) null, 25, (DefaultConstructorMarker) null));
    }

    /* renamed from: b */
    public final void mo38038b(int i) {
        PublishSubject<List<Country>> publishSubject = this.f26231e;
        this.f26229c.getClass();
        ObservableSubscribeOn i2 = publishSubject.mo20639i(C13461f.m21235b());
        this.f26229c.getClass();
        LambdaObserver f = SubscribersKt.m32501f(i2.mo20635e(C13461f.m21235b()), new CountrySelectorViewModel$setSelectedCountry$1(this), new CountrySelectorViewModel$setSelectedCountry$2(i, this), 2);
        C7091a aVar = this.f26233g;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(f);
    }

    public final void onCleared() {
        super.onCleared();
        this.f26233g.mo19405d();
    }
}
