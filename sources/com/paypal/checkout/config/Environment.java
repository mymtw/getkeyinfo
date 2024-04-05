package com.paypal.checkout.config;

import com.paypal.pyplcheckout.merchantIntegration.RunTimeEnvironment;
import kotlin.NoWhenBranchMatchedException;

public enum Environment {
    LIVE,
    SANDBOX,
    STAGE,
    LOCAL;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] iArr = new int[Environment.values().length];
            iArr[Environment.LIVE.ordinal()] = 1;
            iArr[Environment.SANDBOX.ordinal()] = 2;
            iArr[Environment.STAGE.ordinal()] = 3;
            iArr[Environment.LOCAL.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final RunTimeEnvironment toRunTimeEnvironment() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return RunTimeEnvironment.LIVE;
        }
        if (i == 2) {
            return RunTimeEnvironment.SANDBOX;
        }
        if (i == 3) {
            return RunTimeEnvironment.STAGE;
        }
        if (i == 4) {
            return RunTimeEnvironment.LOCAL;
        }
        throw new NoWhenBranchMatchedException();
    }
}
