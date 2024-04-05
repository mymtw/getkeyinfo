package com.paypal.pyplcheckout.threeds.usecase;

import com.paypal.pyplcheckout.threeds.usecase.AddCardThreeDsState;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.C19656n1;
import p753kq.C19846a;

public final class StartAddCardThreeDsUseCase$state$2 extends Lambda implements C19846a<C19656n1<AddCardThreeDsState>> {
    public static final StartAddCardThreeDsUseCase$state$2 INSTANCE = new StartAddCardThreeDsUseCase$state$2();

    public StartAddCardThreeDsUseCase$state$2() {
        super(0);
    }

    public final C19656n1<AddCardThreeDsState> invoke() {
        return C19388s.m32862g(AddCardThreeDsState.Loading.INSTANCE);
    }
}
