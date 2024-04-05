package com.paypal.pyplcheckout.fundingOptions.p544di;

import com.paypal.pyplcheckout.fundingOptions.dao.FundingOptionsDao;
import com.paypal.pyplcheckout.fundingOptions.dao.SharedPrefsFundingOptionsDao;

/* renamed from: com.paypal.pyplcheckout.fundingOptions.di.FundingOptionsModule */
public interface FundingOptionsModule {
    FundingOptionsDao provideFundingOptionsDao(SharedPrefsFundingOptionsDao sharedPrefsFundingOptionsDao);
}
