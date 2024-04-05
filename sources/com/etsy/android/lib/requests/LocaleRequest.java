package com.etsy.android.lib.requests;

import com.etsy.android.lib.currency.C8629a;
import com.etsy.android.lib.logger.C8694h;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8048a;
import p248tp.C8066r;
import p456ua.C13461f;
import p486y9.C13888d;

public final class LocaleRequest {
    public static final int $stable = 8;
    private Disposable disposable;
    private final LocaleRepository localeRepository;
    /* access modifiers changed from: private */
    public final C8694h logcat;
    private final LocaleMetadata metadata;
    private final C13461f schedulers;

    public LocaleRequest(C8629a aVar, C13888d dVar, LocaleRepository localeRepository2, C13461f fVar, C8694h hVar) {
        C19383o.m32797g(aVar, "appCurrency");
        C19383o.m32797g(dVar, "currentLocale");
        C19383o.m32797g(localeRepository2, "localeRepository");
        C19383o.m32797g(fVar, "schedulers");
        C19383o.m32797g(hVar, "logcat");
        this.localeRepository = localeRepository2;
        this.schedulers = fVar;
        this.logcat = hVar;
        this.metadata = new LocaleMetadata(aVar, dVar);
    }

    public final void sendUserLocale() {
        Disposable disposable2 = this.disposable;
        if (disposable2 != null) {
            disposable2.dispose();
        }
        C8048a saveLocale = this.localeRepository.saveLocale(new SaveLocaleSpecs(this.metadata.getCurrencyCode(), this.metadata.getLanguageTag(), this.metadata.getRegionCode()));
        this.schedulers.getClass();
        C8066r b = C13461f.m21235b();
        saveLocale.getClass();
        this.disposable = SubscribersKt.m32499d(new CompletableSubscribeOn(saveLocale, b), new LocaleRequest$sendUserLocale$1(this), new LocaleRequest$sendUserLocale$2(this));
    }
}
