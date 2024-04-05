package com.etsy.android.lib.requests;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.models.EtsyLocale;
import com.etsy.android.lib.models.MoshiModelFactory;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.push.registration.C8834g;
import com.etsy.android.lib.requests.LocaleResult;
import com.squareup.moshi.C17414y;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.C19928a0;
import p145io.reactivex.internal.operators.completable.C19093f;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p248tp.C8048a;
import p248tp.C8071s;
import p409o9.C13127g;
import retrofit2.C20145v;
import retrofit2.HttpException;

public final class LocaleRepository {
    public static final int $stable = 8;
    private final LocaleEndpoint endpoint;
    private final C17414y moshi;

    public LocaleRepository(LocaleEndpoint localeEndpoint, C17414y yVar) {
        C19383o.m32797g(localeEndpoint, "endpoint");
        C19383o.m32797g(yVar, "moshi");
        this.endpoint = localeEndpoint;
        this.moshi = yVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: locale$lambda-0  reason: not valid java name */
    public static final LocaleResult m34869locale$lambda0(LocaleRepository localeRepository, C20145v vVar) {
        C19383o.m32797g(localeRepository, "this$0");
        C19383o.m32797g(vVar, ResponseConstants.RESPONSE);
        if (!vVar.mo74384a()) {
            return new LocaleResult.Error(C0761x.m1692S0(vVar, localeRepository.moshi), vVar.f44614a.f44365f, (Throwable) null, 4, (DefaultConstructorMarker) null);
        }
        C19928a0 a0Var = (C19928a0) vVar.f44615b;
        Object createFromByteArray = a0Var != null ? MoshiModelFactory.createFromByteArray(a0Var.mo72841a(), EtsyLocale.class) : null;
        C19383o.m32794d(createFromByteArray);
        return new LocaleResult.Success((EtsyLocale) createFromByteArray);
    }

    /* access modifiers changed from: private */
    /* renamed from: locale$lambda-1  reason: not valid java name */
    public static final LocaleResult m34870locale$lambda1(LocaleRepository localeRepository, Throwable th) {
        C19383o.m32797g(localeRepository, "this$0");
        C19383o.m32797g(th, "it");
        String str = null;
        HttpException httpException = th instanceof HttpException ? (HttpException) th : null;
        if (httpException != null) {
            str = C0761x.m1690R0(httpException, localeRepository.moshi);
        }
        return new LocaleResult.Error(str, httpException != null ? httpException.code() : 0, httpException);
    }

    public final C8071s<LocaleResult> locale() {
        C8071s<C20145v<C19928a0>> locale = this.endpoint.getLocale();
        C13127g gVar = new C13127g(this, 1);
        locale.getClass();
        return new C19211l(new C19208j(locale, gVar), new C8834g(this, 1));
    }

    public final C8048a saveLocale(SaveLocaleSpecs saveLocaleSpecs) {
        C19383o.m32797g(saveLocaleSpecs, "specs");
        C8071s<C20145v<C19928a0>> saveLocale = this.endpoint.saveLocale(C19294b0.m32562s0(new Pair("currency", saveLocaleSpecs.getCurrencyCode()), new Pair("language", saveLocaleSpecs.getLanguage()), new Pair("region", saveLocaleSpecs.getRegion())));
        saveLocale.getClass();
        return new C19093f(saveLocale);
    }
}
