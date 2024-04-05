package com.paypal.pyplcheckout.utils;

import kotlin.NoWhenBranchMatchedException;

public enum ExpandableViewState {
    Expanded,
    Collapsed;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] iArr = new int[ExpandableViewState.values().length];
            iArr[ExpandableViewState.Expanded.ordinal()] = 1;
            iArr[ExpandableViewState.Collapsed.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public String toString() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return "EXPANDED";
        }
        if (i == 2) {
            return "COLLAPSED";
        }
        throw new NoWhenBranchMatchedException();
    }
}
