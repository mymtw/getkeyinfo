package com.paypal.pyplcheckout.threeds.usecase;

import com.paypal.pyplcheckout.threeds.ThreeDSState;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.C19656n1;
import p753kq.C19846a;

public final class ThreeDSUseCase$threeDSState$2 extends Lambda implements C19846a<C19656n1<ThreeDSState>> {
    public static final ThreeDSUseCase$threeDSState$2 INSTANCE = new ThreeDSUseCase$threeDSState$2();

    public ThreeDSUseCase$threeDSState$2() {
        super(0);
    }

    public final C19656n1<ThreeDSState> invoke() {
        return C19388s.m32862g(ThreeDSState.None.INSTANCE);
    }
}
