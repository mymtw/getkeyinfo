package com.paypal.pyplcheckout.userprofile.usecase;

import com.paypal.pyplcheckout.userprofile.model.UserCountry;
import com.paypal.pyplcheckout.userprofile.model.UserState;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class GetUserCountryUseCase$invoke$1 extends Lambda implements C19857l<UserState, UserCountry> {
    public final /* synthetic */ GetUserCountryUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetUserCountryUseCase$invoke$1(GetUserCountryUseCase getUserCountryUseCase) {
        super(1);
        this.this$0 = getUserCountryUseCase;
    }

    public final UserCountry invoke(UserState userState) {
        C19383o.m32797g(userState, "userState");
        if (userState instanceof UserState.Success) {
            return this.this$0.mapUserCountry(((UserState.Success) userState).getUser().getLocale());
        }
        return UserCountry.Unknown.INSTANCE;
    }
}
