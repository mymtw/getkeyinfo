package com.paypal.pyplcheckout.billingagreements.repo;

import android.content.Context;
import android.content.SharedPreferences;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.billingagreements.model.BillingAgreementType;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class BillingAgreementsDaoImpl implements BillingAgreementsDao {
    public static final String ALWAYS_USE_BALANCE_PREFERENCE = "alwaysUseBalancePreference";
    public static final String BILLING_AGREEMENT_TOKEN = "billingAgreementToken";
    public static final String BILLING_AGREEMENT_TYPE = "billingAgreementType";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = "BillingAgreementsDaoImpl";
    private final SharedPreferences sharedPreferences;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BillingAgreementsDaoImpl(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.sharedPreferences = context.getSharedPreferences(TAG, 0);
    }

    public void clear() {
        this.sharedPreferences.edit().clear().apply();
    }

    public boolean getAlwaysUseBalancePreference() {
        return this.sharedPreferences.getBoolean(ALWAYS_USE_BALANCE_PREFERENCE, true);
    }

    public String getBillingAgreementToken() {
        return this.sharedPreferences.getString(BILLING_AGREEMENT_TOKEN, (String) null);
    }

    public BillingAgreementType getBillingAgreementType() {
        String string = this.sharedPreferences.getString(BILLING_AGREEMENT_TYPE, (String) null);
        return string == null ? BillingAgreementType.NOT_SUPPORTED : BillingAgreementType.valueOf(string);
    }

    public void setAlwaysUseBalancePreference(boolean z) {
        this.sharedPreferences.edit().putBoolean(ALWAYS_USE_BALANCE_PREFERENCE, z).apply();
    }

    public void setBillingAgreementToken(String str) {
        this.sharedPreferences.edit().putString(BILLING_AGREEMENT_TOKEN, str).apply();
    }

    public void setBillingAgreementType(BillingAgreementType billingAgreementType) {
        C19383o.m32797g(billingAgreementType, "type");
        this.sharedPreferences.edit().putString(BILLING_AGREEMENT_TYPE, billingAgreementType.name()).apply();
    }
}
