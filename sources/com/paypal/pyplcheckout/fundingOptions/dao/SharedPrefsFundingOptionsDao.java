package com.paypal.pyplcheckout.fundingOptions.dao;

import android.content.Context;
import android.content.SharedPreferences;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.gson.C16708i;
import com.paypal.pyplcheckout.pojo.FundingOption;
import kotlin.jvm.internal.C19383o;

public final class SharedPrefsFundingOptionsDao implements FundingOptionsDao {
    private Integer carouselPosition;
    private final C16708i gson;
    private FundingOption selectedFundingOption;
    private final SharedPreferences sharedPreferences;

    public SharedPrefsFundingOptionsDao(Context context, C16708i iVar) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(iVar, "gson");
        this.gson = iVar;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(getTAG(), 0);
        C19383o.m32796f(sharedPreferences2, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.sharedPreferences = sharedPreferences2;
    }

    private final FundingOption deserializeSelectedFundingOption() {
        String string = this.sharedPreferences.getString(SharedPrefsFundingOptionsDaoKt.SELECTED_FUNDING_OPTION, (String) null);
        if (string == null) {
            return null;
        }
        return (FundingOption) this.gson.mo59458e(FundingOption.class, string);
    }

    private final String getTAG() {
        return "SharedPrefsFundingOptionsDao";
    }

    public void cacheCarouselPosition(int i) {
        this.carouselPosition = Integer.valueOf(i);
        this.sharedPreferences.edit().putInt(SharedPrefsFundingOptionsDaoKt.CAROUSEL_POSITION, i).apply();
    }

    public void cacheSelectedFundingOption(FundingOption fundingOption) {
        this.sharedPreferences.edit().putString(SharedPrefsFundingOptionsDaoKt.SELECTED_FUNDING_OPTION, this.gson.mo59463j(fundingOption)).apply();
        this.selectedFundingOption = fundingOption;
    }

    public void clear() {
        this.selectedFundingOption = null;
        this.carouselPosition = null;
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.remove(SharedPrefsFundingOptionsDaoKt.SELECTED_FUNDING_OPTION);
        edit.remove(SharedPrefsFundingOptionsDaoKt.CAROUSEL_POSITION);
        edit.apply();
    }

    public int getCarouselPosition() {
        Integer num = this.carouselPosition;
        if (num != null) {
            return num.intValue();
        }
        int i = this.sharedPreferences.getInt(SharedPrefsFundingOptionsDaoKt.CAROUSEL_POSITION, -1);
        this.carouselPosition = Integer.valueOf(i);
        return i;
    }

    public FundingOption getSelectedFundingOption() {
        try {
            FundingOption fundingOption = this.selectedFundingOption;
            if (fundingOption == null) {
                fundingOption = deserializeSelectedFundingOption();
                if (fundingOption == null) {
                    return null;
                }
                this.selectedFundingOption = fundingOption;
            }
            return fundingOption;
        } catch (Throwable unused) {
            return null;
        }
    }
}
