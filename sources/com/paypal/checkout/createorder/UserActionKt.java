package com.paypal.checkout.createorder;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;

public final class UserActionKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserAction.values().length];
            iArr[UserAction.CONTINUE.ordinal()] = 1;
            iArr[UserAction.PAY_NOW.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean getAsCommit(UserAction userAction) {
        C19383o.m32797g(userAction, "<this>");
        return userAction == UserAction.PAY_NOW;
    }

    public static final String getAsMerchantUrlQueryParam(UserAction userAction) {
        C19383o.m32797g(userAction, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[userAction.ordinal()];
        if (i == 1) {
            return "continue";
        }
        if (i == 2) {
            return "commit";
        }
        throw new NoWhenBranchMatchedException();
    }
}
