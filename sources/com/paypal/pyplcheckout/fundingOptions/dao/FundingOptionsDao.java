package com.paypal.pyplcheckout.fundingOptions.dao;

import com.paypal.pyplcheckout.pojo.FundingOption;

public interface FundingOptionsDao {
    void cacheCarouselPosition(int i);

    void cacheSelectedFundingOption(FundingOption fundingOption);

    void clear();

    int getCarouselPosition();

    FundingOption getSelectedFundingOption();
}
