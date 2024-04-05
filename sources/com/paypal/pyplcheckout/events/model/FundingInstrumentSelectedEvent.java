package com.paypal.pyplcheckout.events.model;

import com.paypal.pyplcheckout.home.view.customviews.CardUiModel;
import java.util.List;
import kotlin.jvm.internal.C19383o;

public final class FundingInstrumentSelectedEvent {
    private final int fundingOptionsListSize;
    private final boolean isPayNowMode;
    private final boolean isShippingHidden;
    private final List<CardUiModel> listOfPaymentCards;
    private final String selectedFundingOptionId;
    private final String selectedFundingOptionType;
    private final int selectedPosition;
    private final boolean shouldShowBalance;
    private final boolean shouldShowConversion;
    private final boolean shouldShowCrypto;

    public FundingInstrumentSelectedEvent(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, String str2, List<? extends CardUiModel> list) {
        C19383o.m32797g(str, "selectedFundingOptionId");
        C19383o.m32797g(str2, "selectedFundingOptionType");
        C19383o.m32797g(list, "listOfPaymentCards");
        this.selectedPosition = i;
        this.fundingOptionsListSize = i2;
        this.shouldShowBalance = z;
        this.shouldShowConversion = z2;
        this.shouldShowCrypto = z3;
        this.isPayNowMode = z4;
        this.isShippingHidden = z5;
        this.selectedFundingOptionId = str;
        this.selectedFundingOptionType = str2;
        this.listOfPaymentCards = list;
    }

    public final int getFundingOptionsListSize() {
        return this.fundingOptionsListSize;
    }

    public final List<CardUiModel> getListOfPaymentCards() {
        return this.listOfPaymentCards;
    }

    public final String getSelectedFundingOptionId() {
        return this.selectedFundingOptionId;
    }

    public final String getSelectedFundingOptionType() {
        return this.selectedFundingOptionType;
    }

    public final int getSelectedPosition() {
        return this.selectedPosition;
    }

    public final boolean getShouldShowBalance() {
        return this.shouldShowBalance;
    }

    public final boolean getShouldShowConversion() {
        return this.shouldShowConversion;
    }

    public final boolean getShouldShowCrypto() {
        return this.shouldShowCrypto;
    }

    public final boolean isPayNowMode() {
        return this.isPayNowMode;
    }

    public final boolean isShippingHidden() {
        return this.isShippingHidden;
    }
}
