package com.paypal.pyplcheckout.home.view.customviews.availablebalance;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;

public abstract class AvailableBalanceState {

    public static final class DisabledState extends AvailableBalanceState {
        public static final DisabledState INSTANCE = new DisabledState();

        private DisabledState() {
            super((DefaultConstructorMarker) null);
        }
    }

    public static final class EnabledState extends AvailableBalanceState {
        public static final EnabledState INSTANCE = new EnabledState();

        private EnabledState() {
            super((DefaultConstructorMarker) null);
        }
    }

    public static final class NoSplitBalance extends AvailableBalanceState {
        public static final NoSplitBalance INSTANCE = new NoSplitBalance();

        private NoSplitBalance() {
            super((DefaultConstructorMarker) null);
        }
    }

    public static final class ShowSplitBalance extends AvailableBalanceState {
        private final SplitBalanceInfo firstSplitBalance;
        private final SplitBalanceInfo secondSplitBalance;
        private final String splitBalanceCurrency;
        private final int stringResource;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ShowSplitBalance(SplitBalanceInfo splitBalanceInfo, SplitBalanceInfo splitBalanceInfo2, String str, int i) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(splitBalanceInfo, "firstSplitBalance");
            C19383o.m32797g(str, "splitBalanceCurrency");
            this.firstSplitBalance = splitBalanceInfo;
            this.secondSplitBalance = splitBalanceInfo2;
            this.splitBalanceCurrency = str;
            this.stringResource = i;
        }

        public static /* synthetic */ ShowSplitBalance copy$default(ShowSplitBalance showSplitBalance, SplitBalanceInfo splitBalanceInfo, SplitBalanceInfo splitBalanceInfo2, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                splitBalanceInfo = showSplitBalance.firstSplitBalance;
            }
            if ((i2 & 2) != 0) {
                splitBalanceInfo2 = showSplitBalance.secondSplitBalance;
            }
            if ((i2 & 4) != 0) {
                str = showSplitBalance.splitBalanceCurrency;
            }
            if ((i2 & 8) != 0) {
                i = showSplitBalance.stringResource;
            }
            return showSplitBalance.copy(splitBalanceInfo, splitBalanceInfo2, str, i);
        }

        public final SplitBalanceInfo component1() {
            return this.firstSplitBalance;
        }

        public final SplitBalanceInfo component2() {
            return this.secondSplitBalance;
        }

        public final String component3() {
            return this.splitBalanceCurrency;
        }

        public final int component4() {
            return this.stringResource;
        }

        public final ShowSplitBalance copy(SplitBalanceInfo splitBalanceInfo, SplitBalanceInfo splitBalanceInfo2, String str, int i) {
            C19383o.m32797g(splitBalanceInfo, "firstSplitBalance");
            C19383o.m32797g(str, "splitBalanceCurrency");
            return new ShowSplitBalance(splitBalanceInfo, splitBalanceInfo2, str, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowSplitBalance)) {
                return false;
            }
            ShowSplitBalance showSplitBalance = (ShowSplitBalance) obj;
            return C19383o.m32792b(this.firstSplitBalance, showSplitBalance.firstSplitBalance) && C19383o.m32792b(this.secondSplitBalance, showSplitBalance.secondSplitBalance) && C19383o.m32792b(this.splitBalanceCurrency, showSplitBalance.splitBalanceCurrency) && this.stringResource == showSplitBalance.stringResource;
        }

        public final SplitBalanceInfo getFirstSplitBalance() {
            return this.firstSplitBalance;
        }

        public final SplitBalanceInfo getSecondSplitBalance() {
            return this.secondSplitBalance;
        }

        public final String getSplitBalanceCurrency() {
            return this.splitBalanceCurrency;
        }

        public final int getStringResource() {
            return this.stringResource;
        }

        public int hashCode() {
            int hashCode = this.firstSplitBalance.hashCode() * 31;
            SplitBalanceInfo splitBalanceInfo = this.secondSplitBalance;
            return Integer.hashCode(this.stringResource) + C0023f.m105e(this.splitBalanceCurrency, (hashCode + (splitBalanceInfo == null ? 0 : splitBalanceInfo.hashCode())) * 31, 31);
        }

        public String toString() {
            SplitBalanceInfo splitBalanceInfo = this.firstSplitBalance;
            SplitBalanceInfo splitBalanceInfo2 = this.secondSplitBalance;
            String str = this.splitBalanceCurrency;
            int i = this.stringResource;
            return "ShowSplitBalance(firstSplitBalance=" + splitBalanceInfo + ", secondSplitBalance=" + splitBalanceInfo2 + ", splitBalanceCurrency=" + str + ", stringResource=" + i + ")";
        }
    }

    private AvailableBalanceState() {
    }

    public /* synthetic */ AvailableBalanceState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
