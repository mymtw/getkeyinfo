package com.paypal.pyplcheckout.userprofile.usecase;

import com.paypal.pyplcheckout.extensions.FlowExtensionsKt;
import com.paypal.pyplcheckout.pojo.Locale;
import com.paypal.pyplcheckout.userprofile.model.UserCountry;
import com.paypal.pyplcheckout.userprofile.model.UserStateKt;
import com.paypal.pyplcheckout.utils.StringExtensionsKt;
import java.util.List;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19689x1;
import p568fn.C17782b;

public final class GetUserCountryUseCase {
    private final List<String> euCountries = C17782b.m29865e0("BE", "BG", "CZ", "DK", "DE", "EE", "IE", "EL", "ES", "FR", "HR", "IT", "CY", "LV", "LT", "LU", "HU", "MT", "NL", "AT", "PL", "PT", "RO", "SI", "SK", "FI", "SE", "IS", "NO", "LI", "NO", "CH", "UK");
    private final GetUserUseCase getUserUseCase;
    private final C19525d0 scope;

    public GetUserCountryUseCase(GetUserUseCase getUserUseCase2, C19525d0 d0Var) {
        GetUserUseCase getUserUseCase3 = getUserUseCase2;
        C19525d0 d0Var2 = d0Var;
        C19383o.m32797g(getUserUseCase3, "getUserUseCase");
        C19383o.m32797g(d0Var2, "scope");
        this.getUserUseCase = getUserUseCase3;
        this.scope = d0Var2;
    }

    /* access modifiers changed from: private */
    public final UserCountry mapUserCountry(Locale locale) {
        UserCountry userCountry;
        String str = null;
        String country = locale == null ? null : locale.getCountry();
        String nullIfNullOrEmpty = StringExtensionsKt.nullIfNullOrEmpty(country);
        if (nullIfNullOrEmpty == null) {
            return UserCountry.Unknown.INSTANCE;
        }
        if (C19383o.m32792b(nullIfNullOrEmpty, UserStateKt.US_COUNTRY)) {
            if (locale != null) {
                str = locale.getLocale();
            }
            return new UserCountry.C17273US(str);
        }
        if (C19327t.m32634P0(country, this.euCountries)) {
            if (locale != null) {
                str = locale.getLocale();
            }
            userCountry = new UserCountry.C17272EU(country, str);
        } else {
            if (locale != null) {
                str = locale.getLocale();
            }
            userCountry = new UserCountry.Other(country, str);
        }
        return userCountry;
    }

    public final C19689x1<UserCountry> invoke() {
        return FlowExtensionsKt.mapState(this.getUserUseCase.invoke(), this.scope, new GetUserCountryUseCase$invoke$1(this));
    }
}
