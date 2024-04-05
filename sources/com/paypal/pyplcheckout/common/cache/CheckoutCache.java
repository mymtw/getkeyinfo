package com.paypal.pyplcheckout.common.cache;

import android.support.p013v4.media.C0069a;
import com.appboy.Constants;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.gson.C16708i;
import com.paypal.pyplcheckout.addshipping.model.Address;
import com.paypal.pyplcheckout.addshipping.model.Country;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.pojo.TransactionSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import kotlin.text.C19459m;

public final class CheckoutCache {
    private final CheckoutDataStore checkoutDataStore;

    public CheckoutCache(CheckoutDataStore checkoutDataStore2) {
        C19383o.m32797g(checkoutDataStore2, "checkoutDataStore");
        this.checkoutDataStore = checkoutDataStore2;
    }

    public final void cacheAddManually(boolean z) {
        this.checkoutDataStore.setBooleanDataStorePref(BooleanPrefConstants.ADD_MANUALLY.name(), z);
    }

    public final void cacheAddressSelected(Address address) {
        C19383o.m32797g(address, "address");
        CheckoutDataStore checkoutDataStore2 = this.checkoutDataStore;
        String name = StringPreferenceConstants.FULL_ADDRESS.name();
        String fullAddress = address.getFullAddress();
        checkoutDataStore2.setStringDataStorePref(name, fullAddress == null ? null : C19459m.m33032E1(fullAddress, ",", fullAddress));
        this.checkoutDataStore.setStringDataStorePref(StringPreferenceConstants.STATE.name(), address.getState());
        this.checkoutDataStore.setStringDataStorePref(StringPreferenceConstants.POSTAL_CODE.name(), address.getPostalCode());
        this.checkoutDataStore.setStringDataStorePref(StringPreferenceConstants.CITY.name(), address.getCity());
    }

    public final void cacheBlockNonDomesticShipping(boolean z) {
        this.checkoutDataStore.setBooleanDataStorePref(BooleanPrefConstants.BLOCK_NON_DOMESTIC_SHIPPING.name(), z);
    }

    public final void cacheButtonSessionId(String str) {
        C19383o.m32797g(str, "buttonSessionId");
        this.checkoutDataStore.setStringDataStorePref(StringPreferenceConstants.BUTTON_SESSION_ID.name(), str);
    }

    public final void cacheComingFromReviewPage(boolean z) {
        this.checkoutDataStore.setBooleanDataStorePref(BooleanPrefConstants.COMING_FROM_REVIEW.name(), z);
    }

    public final void cacheCountries(Country country) {
        C19383o.m32797g(country, "country");
        Cache.INSTANCE.getCountryList().add(country);
    }

    public final void cacheCountryId(String str) {
        C19383o.m32797g(str, "id");
        this.checkoutDataStore.setStringDataStorePref(StringPreferenceConstants.COUNTRY_ID.name(), str);
    }

    public final void cacheCountryPosition(int i) {
        this.checkoutDataStore.setIntDataStorePref(IntPrefConstants.COUNTRY_POSITION.name(), i);
    }

    public final void cacheCountryfield(String str, String str2) {
        C19383o.m32797g(str, "text");
        C19383o.m32797g(str2, "resource");
        Cache.INSTANCE.getCountryFields().put(str, str2);
    }

    public final void cacheCreateOrderContext(String str, String str2, String str3) {
        this.checkoutDataStore.setStringDataStorePref(StringPreferenceConstants.ORDER_CAPTURE_URL.name(), str);
        this.checkoutDataStore.setStringDataStorePref(StringPreferenceConstants.ORDER_AUTHORIZE_URL.name(), str2);
        this.checkoutDataStore.setStringDataStorePref(StringPreferenceConstants.ORDER_PATCH_URL.name(), str3);
        this.checkoutDataStore.setBooleanDataStorePref(BooleanPrefConstants.IS_ORDER_CREATED.name(), true);
    }

    public final void cacheDidCustomTabOpen(boolean z) {
        this.checkoutDataStore.setBooleanDataStorePref(BooleanPrefConstants.DID_CCT_OPEN.name(), z);
    }

    public final void cacheDomain(String str) {
        this.checkoutDataStore.setStringDataStorePref(StringPreferenceConstants.DOMAIN.name(), str);
    }

    public final void cacheFacilitatorClientId(String str) {
        this.checkoutDataStore.setStringDataStorePref(StringPreferenceConstants.FACILITATOR_ID.name(), str);
    }

    public final void cacheFbSessionUid(String str) {
        C19383o.m32797g(str, "sessionId");
        this.checkoutDataStore.setStringDataStorePref(StringPreferenceConstants.FB_SESSION_UID.name(), str);
    }

    public final void cacheFinishCheckoutAndOnApproveFiredFlag(boolean z) {
        this.checkoutDataStore.setBooleanDataStorePref(BooleanPrefConstants.FINISH_CHECKOUT_AND_APPROVE_FIRED.name(), z);
    }

    public final void cacheFirebaseInstanceID(String str) {
        this.checkoutDataStore.setStringDataStorePref(StringPreferenceConstants.FIREBASE_DB_INSTANCE_ID.name(), str);
    }

    public final void cacheFundingSource(String str) {
        this.checkoutDataStore.setStringDataStorePref(StringPreferenceConstants.FUNDING_SOURCE.name(), str);
    }

    public final void cacheHintTitle(String str) {
        C19383o.m32797g(str, ResponseConstants.HINT);
        this.checkoutDataStore.setStringDataStorePref(StringPreferenceConstants.HINT_TITLE.name(), str);
    }

    public final void cacheIntentDataUri(String str) {
        C19383o.m32797g(str, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        this.checkoutDataStore.setStringDataStorePref(StringPreferenceConstants.INTENT_DATA_URL.name(), str);
    }

    public final void cacheIsFallback(boolean z) {
        this.checkoutDataStore.setBooleanDataStorePref(BooleanPrefConstants.IS_FALLBACK.name(), z);
    }

    public final void cacheIsSmartPaymentButton(boolean z) {
        this.checkoutDataStore.setBooleanDataStorePref(BooleanPrefConstants.IS_SMART_PAYMENT.name(), z);
    }

    public final void cacheMerchantCountry(String str) {
        C19383o.m32797g(str, "country");
        this.checkoutDataStore.setStringDataStorePref(StringPreferenceConstants.MERCHANT_COUNTRY.name(), str);
    }

    public final String cacheOrderAuthorizeUrl(String str) {
        return this.checkoutDataStore.getStringDataStorePref(StringPreferenceConstants.ORDER_AUTHORIZE_URL.name());
    }

    public final void cacheOrderCaptureUrl(String str) {
        this.checkoutDataStore.setStringDataStorePref(StringPreferenceConstants.ORDER_CAPTURE_URL.name(), str);
    }

    public final void cacheOrderId(String str) {
        C19383o.m32797g(str, "orderId");
        this.checkoutDataStore.setStringDataStorePref(StringPreferenceConstants.ORDER_ID.name(), str);
    }

    public final void cacheOrderPatchUrl(String str) {
        this.checkoutDataStore.setStringDataStorePref(StringPreferenceConstants.ORDER_CAPTURE_URL.name(), str);
    }

    public final void cacheSPBToken(String str) {
        C19383o.m32797g(str, "orderId");
        this.checkoutDataStore.setStringDataStorePref(StringPreferenceConstants.SPB_TOKEN.name(), str);
    }

    public final void cacheSavedAddress(String str) {
        C19383o.m32797g(str, ResponseConstants.HINT);
        this.checkoutDataStore.setStringDataStorePref(StringPreferenceConstants.SAVED_ADDRESS.name(), str);
    }

    public final void cacheSearchScreenTitle(String str) {
        C19383o.m32797g(str, "title");
        this.checkoutDataStore.setStringDataStorePref(StringPreferenceConstants.SEARCH_SCREEN_TITLE.name(), str);
    }

    public final void cacheStickinessId(String str) {
        C19383o.m32797g(str, "stickinessId");
        this.checkoutDataStore.setStringDataStorePref(StringPreferenceConstants.SAVED_ADDRESS.name(), str);
    }

    public final void clearAddShippingData() {
        this.checkoutDataStore.clear(StringPreferenceConstants.FULL_ADDRESS.name());
        this.checkoutDataStore.clear(StringPreferenceConstants.STATE.name());
        this.checkoutDataStore.clear(StringPreferenceConstants.POSTAL_CODE.name());
        this.checkoutDataStore.clear(StringPreferenceConstants.CITY.name());
        this.checkoutDataStore.clear(StringPreferenceConstants.COUNTRY_ID.name());
        this.checkoutDataStore.clear(StringPreferenceConstants.SEARCH_SCREEN_TITLE.name());
        this.checkoutDataStore.clear(StringPreferenceConstants.HINT_TITLE.name());
        this.checkoutDataStore.clear(BooleanPrefConstants.ADD_MANUALLY.name());
        this.checkoutDataStore.clear(StringPreferenceConstants.SAVED_ADDRESS.name());
        this.checkoutDataStore.clear(IntPrefConstants.COUNTRY_POSITION.name());
        this.checkoutDataStore.clear(BooleanPrefConstants.BLOCK_NON_DOMESTIC_SHIPPING.name());
        this.checkoutDataStore.clear(BooleanPrefConstants.COMING_FROM_REVIEW.name());
        this.checkoutDataStore.clear(StringPreferenceConstants.MERCHANT_COUNTRY.name());
    }

    public final void clearCreateOrderContext() {
        this.checkoutDataStore.clear(StringPreferenceConstants.ORDER_PATCH_URL.name());
        this.checkoutDataStore.clear(StringPreferenceConstants.ORDER_AUTHORIZE_URL.name());
        this.checkoutDataStore.clear(StringPreferenceConstants.ORDER_CAPTURE_URL.name());
        this.checkoutDataStore.clear(BooleanPrefConstants.IS_ORDER_CREATED.name());
    }

    public final void clearFinishCheckoutAndOnApproveFiredFlag() {
        this.checkoutDataStore.clear(BooleanPrefConstants.FINISH_CHECKOUT_AND_APPROVE_FIRED.name());
    }

    public final void clearIntentDataUri() {
        this.checkoutDataStore.clear(StringPreferenceConstants.INTENT_DATA_URL.name());
    }

    public final void clearSavedAddress() {
        clearAddShippingData();
    }

    public final void clearSessionValues() {
        this.checkoutDataStore.clear(StringPreferenceConstants.BUTTON_SESSION_ID.name());
        this.checkoutDataStore.clear(StringPreferenceConstants.ORDER_ID.name());
        this.checkoutDataStore.clear(StringPreferenceConstants.SPB_TOKEN.name());
        this.checkoutDataStore.clear(StringPreferenceConstants.FB_SESSION_UID.name());
        this.checkoutDataStore.clear(StringPreferenceConstants.FIREBASE_DB_INSTANCE_ID.name());
        this.checkoutDataStore.clear(StringPreferenceConstants.FACILITATOR_ID.name());
        this.checkoutDataStore.clear(StringPreferenceConstants.FUNDING_SOURCE.name());
        this.checkoutDataStore.clear(StringPreferenceConstants.DOMAIN.name());
        this.checkoutDataStore.clear(BooleanPrefConstants.IS_SMART_PAYMENT.name());
        this.checkoutDataStore.clear(StringPreferenceConstants.ORDER_AUTHORIZE_URL.name());
        this.checkoutDataStore.clear(StringPreferenceConstants.ORDER_CAPTURE_URL.name());
        this.checkoutDataStore.clear(StringPreferenceConstants.ORDER_PATCH_URL.name());
        this.checkoutDataStore.clear(BooleanPrefConstants.IS_ORDER_CREATED.name());
    }

    public final boolean getBlockNonDomesticShipping() {
        return this.checkoutDataStore.getBooleanDataStorePref(BooleanPrefConstants.BLOCK_NON_DOMESTIC_SHIPPING.name());
    }

    public final boolean getBooleanDataForPref(String str) {
        C19383o.m32797g(str, "text");
        return this.checkoutDataStore.getBooleanDataStorePref(str);
    }

    public final String getButtonSessionId() {
        return this.checkoutDataStore.getStringDataStorePref(StringPreferenceConstants.BUTTON_SESSION_ID.name());
    }

    public final CheckoutCache getCache() {
        return SdkComponent.Companion.getInstance().getCache();
    }

    public final String getCity() {
        return this.checkoutDataStore.getStringDataStorePref(StringPreferenceConstants.CITY.name());
    }

    public final ArrayList<Country> getCountries() {
        return Cache.INSTANCE.getCountryList();
    }

    public final Country getCountryById() {
        for (Country country : Cache.INSTANCE.getCountryList()) {
            if (C19457k.m33019W0(country.getCode(), getCountryId(), true)) {
                return country;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final String getCountryId() {
        return this.checkoutDataStore.getStringDataStorePref(StringPreferenceConstants.COUNTRY_ID.name());
    }

    public final int getCountryPosition() {
        return this.checkoutDataStore.getIntDataStorePref(IntPrefConstants.COUNTRY_POSITION.name());
    }

    public final HashMap<String, String> getCountryfield() {
        return Cache.INSTANCE.getCountryFields();
    }

    public final boolean getDidCustomTabOpen() {
        return this.checkoutDataStore.getBooleanDataStorePref(BooleanPrefConstants.DID_CCT_OPEN.name());
    }

    public final String getDomain() {
        return this.checkoutDataStore.getStringDataStorePref(StringPreferenceConstants.DOMAIN.name());
    }

    public final String getFacilitatorClientId() {
        return this.checkoutDataStore.getStringDataStorePref(StringPreferenceConstants.FACILITATOR_ID.name());
    }

    public final String getFbSessionUid() {
        return this.checkoutDataStore.getStringDataStorePref(StringPreferenceConstants.FB_SESSION_UID.name());
    }

    public final boolean getFinishCheckoutAndOnApproveFiredFlag() {
        return this.checkoutDataStore.getBooleanDataStorePref(BooleanPrefConstants.FINISH_CHECKOUT_AND_APPROVE_FIRED.name());
    }

    public final String getFirebaseInstanceID() {
        return this.checkoutDataStore.getStringDataStorePref(StringPreferenceConstants.FIREBASE_DB_INSTANCE_ID.name());
    }

    public final String getFullAddress() {
        return this.checkoutDataStore.getStringDataStorePref(StringPreferenceConstants.FULL_ADDRESS.name());
    }

    public final String getFundingSource() {
        return this.checkoutDataStore.getStringDataStorePref(StringPreferenceConstants.FUNDING_SOURCE.name());
    }

    public final String getHintTitle() {
        return this.checkoutDataStore.getStringDataStorePref(StringPreferenceConstants.HINT_TITLE.name());
    }

    public final int getIntDataForPref(String str) {
        C19383o.m32797g(str, "text");
        return this.checkoutDataStore.getIntDataStorePref(str);
    }

    public final String getIntentDataUri() {
        return this.checkoutDataStore.getStringDataStorePref(StringPreferenceConstants.INTENT_DATA_URL.name());
    }

    public final boolean getIsFallback() {
        return this.checkoutDataStore.getBooleanDataStorePref(BooleanPrefConstants.IS_FALLBACK.name());
    }

    public final boolean getIsOrderCreated() {
        return this.checkoutDataStore.getBooleanDataStorePref(BooleanPrefConstants.IS_ORDER_CREATED.name());
    }

    public final boolean getIsSmartPayment() {
        return this.checkoutDataStore.getBooleanDataStorePref(BooleanPrefConstants.IS_SMART_PAYMENT.name());
    }

    public final String getMerchantCountry() {
        return this.checkoutDataStore.getStringDataStorePref(StringPreferenceConstants.MERCHANT_COUNTRY.name());
    }

    public final String getOrCreateUUID() {
        CheckoutDataStore checkoutDataStore2 = this.checkoutDataStore;
        StringPreferenceConstants stringPreferenceConstants = StringPreferenceConstants.UUID_KEY;
        String stringDataStorePref = checkoutDataStore2.getStringDataStorePref(stringPreferenceConstants.name());
        if (stringDataStorePref != null) {
            return stringDataStorePref;
        }
        String e = C0069a.m174e("randomUUID().toString()");
        this.checkoutDataStore.setStringDataStorePref(stringPreferenceConstants.name(), e);
        return e;
    }

    public final String getOrderAuthorizeUrl() {
        return this.checkoutDataStore.getStringDataStorePref(StringPreferenceConstants.ORDER_AUTHORIZE_URL.name());
    }

    public final String getOrderCaptureUrl() {
        return this.checkoutDataStore.getStringDataStorePref(StringPreferenceConstants.ORDER_CAPTURE_URL.name());
    }

    public final String getOrderId() {
        return this.checkoutDataStore.getStringDataStorePref(StringPreferenceConstants.ORDER_ID.name());
    }

    public final String getOrderPatchUrl() {
        return this.checkoutDataStore.getStringDataStorePref(StringPreferenceConstants.ORDER_PATCH_URL.name());
    }

    public final String getPostalCode() {
        return this.checkoutDataStore.getStringDataStorePref(StringPreferenceConstants.POSTAL_CODE.name());
    }

    public final String getSPBToken() {
        return this.checkoutDataStore.getStringDataStorePref(StringPreferenceConstants.SPB_TOKEN.name());
    }

    public final String getSavedAddress() {
        return this.checkoutDataStore.getStringDataStorePref(StringPreferenceConstants.SAVED_ADDRESS.name());
    }

    public final String getSearchScreenTitle() {
        return this.checkoutDataStore.getStringDataStorePref(StringPreferenceConstants.SEARCH_SCREEN_TITLE.name());
    }

    public final String getState() {
        return this.checkoutDataStore.getStringDataStorePref(StringPreferenceConstants.STATE.name());
    }

    public final String getStickinessId() {
        return this.checkoutDataStore.getStringDataStorePref(StringPreferenceConstants.STICKINESS_ID.name());
    }

    public final String getStringDataForPref(String str) {
        C19383o.m32797g(str, "text");
        return this.checkoutDataStore.getStringDataStorePref(str);
    }

    public final List<TransactionSession> getTransactionSessions() {
        try {
            return (List) new C16708i().mo59459f(this.checkoutDataStore.getStringDataStorePref(StringPreferenceConstants.TRANSACTIONS_SESSIONS_KEYS.name()), new CheckoutCache$getTransactionSessions$transactionSessionType$1().getType());
        } catch (Exception unused) {
            return null;
        }
    }

    public final Boolean isAddManually() {
        return Boolean.valueOf(this.checkoutDataStore.getBooleanDataStorePref(BooleanPrefConstants.ADD_MANUALLY.name()));
    }

    public final boolean isCacheComingFromReviewPage() {
        return this.checkoutDataStore.getBooleanDataStorePref(BooleanPrefConstants.COMING_FROM_REVIEW.name());
    }

    public final void saveTransactionSessions(List<TransactionSession> list) {
        C19383o.m32797g(list, "listOfTransactionSessions");
        this.checkoutDataStore.setStringDataStorePref(StringPreferenceConstants.TRANSACTIONS_SESSIONS_KEYS.name(), new C16708i().mo59463j(list));
    }

    public final void setBooleanDataForPref(String str, boolean z) {
        C19383o.m32797g(str, Constants.APPBOY_PUSH_TITLE_KEY);
        this.checkoutDataStore.setBooleanDataStorePref(str, z);
    }

    public final void setIntDataForPref(String str, int i) {
        C19383o.m32797g(str, Constants.APPBOY_PUSH_TITLE_KEY);
        this.checkoutDataStore.setIntDataStorePref(str, i);
    }

    public final void setStringDataForPref(String str, String str2) {
        C19383o.m32797g(str, Constants.APPBOY_PUSH_TITLE_KEY);
        this.checkoutDataStore.setStringDataStorePref(str, str2);
    }
}
