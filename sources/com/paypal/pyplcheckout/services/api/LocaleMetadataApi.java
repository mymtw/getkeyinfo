package com.paypal.pyplcheckout.services.api;

import com.paypal.pyplcheckout.addressvalidation.request.LocaleMetadataRequest;
import com.paypal.pyplcheckout.addressvalidation.response.LocaleMetadataResponse;
import java.util.Locale;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.C20009t;
import okhttp3.C20011u;

public final class LocaleMetadataApi {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String query = "query LOCALE_METADATA(\n    $countryCode: CountryCodes!\n    $languageCode: CheckoutContentLanguageCode!\n) {\n    localeMetadata {\n        address(\n            countryCode: $countryCode,\n            languageCode: $languageCode\n        ) {\n             portableLayout {\n                 parts {\n                     name\n                     label\n                     regex\n                     minLength\n                     maxLength\n                     isRequired\n                     allowedValues {\n                         displayText\n                         value\n                     }\n                 }\n             }\n        }\n    }\n}";
    /* access modifiers changed from: private */
    public final C20009t authenticatedOkHttpClient;
    /* access modifiers changed from: private */
    public final Locale deviceLocale;
    private final CoroutineDispatcher dispatcher;
    /* access modifiers changed from: private */
    public final C20011u.C20012a requestBuilder;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LocaleMetadataApi(C20011u.C20012a aVar, CoroutineDispatcher coroutineDispatcher, C20009t tVar, Locale locale) {
        C19383o.m32797g(aVar, "requestBuilder");
        C19383o.m32797g(coroutineDispatcher, "dispatcher");
        C19383o.m32797g(tVar, "authenticatedOkHttpClient");
        C19383o.m32797g(locale, "deviceLocale");
        this.requestBuilder = aVar;
        this.dispatcher = coroutineDispatcher;
        this.authenticatedOkHttpClient = tVar;
        this.deviceLocale = locale;
    }

    public final Object execute(LocaleMetadataRequest localeMetadataRequest, C19340c<? super LocaleMetadataResponse> cVar) {
        return C19697g.m33471i(cVar, this.dispatcher, new LocaleMetadataApi$execute$2(this, localeMetadataRequest, (C19340c<? super LocaleMetadataApi$execute$2>) null));
    }
}
