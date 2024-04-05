package com.paypal.pyplcheckout.common.cache;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.p013v4.media.C0069a;
import androidx.appcompat.widget.C0326j;
import com.appboy.Constants;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.gson.C16708i;
import com.paypal.pyplcheckout.addshipping.model.Address;
import com.paypal.pyplcheckout.addshipping.model.Country;
import com.paypal.pyplcheckout.pojo.TransactionSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import kotlin.text.C19459m;

public final class Cache {
    private static final String ADD_MANUALLY = "ADD_MANUALLY";
    private static final String ADD_SHIPPING = "ADD_SHIPPING";
    private static final String BLOCK_NON_DOMESTIC_SHIPPING = "BLOCK_NON_DOMESTIC_SHIPPING";
    private static final String BUTTON_SESSION_ID = "BUTTON_SESSION_ID";
    private static final String CACHE_PREFS = "CACHE_PREFS";
    private static final String CITY = "CITY";
    private static final String COMING_FROM_REVIEW = "COMING_FROM_REVIEW";
    private static final String COUNTRY_ID = "COUNTRY_ID";
    private static final String COUNTRY_POSITION = "COUNTRY_POSITION";
    private static final String DID_CCT_OPEN = "DID_CCT_OPEN";
    private static final String DOMAIN = "DOMAIN";
    private static final String FACILITATOR_ID = "FACILITATOR_ID";
    public static final String FB_SESSION_UID = "FB_SESSION_UID";
    private static final String FINISH_CHECKOUT_AND_APPROVE_FIRED = "FINISH_CHECKOUT_AND_APPROVE_FIRED";
    private static final String FIREBASE_DB_INSTANCE_ID = "FIREBASE_DB_INSTANCE_ID";
    private static final String FULL_ADDRESS = "FULL_ADDRESS";
    private static final String FUNDING_SOURCE = "FUNDING_SOURCE";
    private static final String HINT_TITLE = "HINT_TITLE";
    public static final Cache INSTANCE = new Cache();
    private static final String INTENT_DATA_URL = "INTENT_DATA_URL";
    private static final String IS_FALLBACK = "IS_FALLBACK";
    private static final String IS_ORDER_CREATED = "IS_ORDER_CREATED";
    private static final String IS_SMART_PAYMENT = "IS_SMART_PAYMENT";
    private static final String IS_VAULT_FLOW = "IS_VAULT_FLOW";
    private static final String MERCHANT_COUNTRY = "MERCHANT_COUNTRY";
    private static final String ORDER_AUTHORIZE_URL = "ORDER_AUTHORIZE_URL";
    private static final String ORDER_CAPTURE_URL = "ORDER_CAPTURE_URL";
    private static final String ORDER_ID = "ORDER_ID";
    private static final String ORDER_PATCH_URL = "ORDER_PATCH_URL";
    private static final String POSTAL_CODE = "POSTAL_CODE";
    private static final String SAVED_ADDRESS = "SAVED_ADDRESS";
    private static final String SEARCH_SCREEN_TITLE = "SEARCH_SCREEN_TITLE";
    private static final String SPB_TOKEN = "TOKEN";
    private static final String STATE = "STATE";
    private static final String STICKINESS_ID = "STICKINESS_ID";
    private static final String TRANSACTIONS_SESSIONS_KEYS = "TRANSACTION_SESSIONS_KEY";
    private static final String UUID_KEY = "UUID_KEY";
    private static HashMap<String, String> countryFields = new HashMap<>();
    private static final ArrayList<Country> countryList = new ArrayList<>();

    private Cache() {
    }

    public static final void cacheBlockNonDomesticShipping(Context context, boolean z) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        context.getSharedPreferences(ADD_SHIPPING, 0).edit().putBoolean(BLOCK_NON_DOMESTIC_SHIPPING, z).apply();
    }

    public static final void cacheCreateOrderContext(Context context, String str, String str2, String str3) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        SharedPreferences.Editor edit = context.getSharedPreferences(CACHE_PREFS, 0).edit();
        edit.putString(ORDER_CAPTURE_URL, str);
        edit.putString(ORDER_AUTHORIZE_URL, str2);
        edit.putString(ORDER_PATCH_URL, str3);
        edit.putBoolean(IS_ORDER_CREATED, true);
        edit.apply();
    }

    public static final void cacheDidCustomTabOpen(Context context, boolean z) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        SharedPreferences.Editor edit = context.getSharedPreferences(CACHE_PREFS, 0).edit();
        edit.putBoolean(DID_CCT_OPEN, z);
        edit.apply();
    }

    public static final void cacheDomain(Context context, String str) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        SharedPreferences.Editor edit = context.getSharedPreferences(CACHE_PREFS, 0).edit();
        edit.putString(DOMAIN, str);
        edit.apply();
    }

    public static final void cacheFacilitatorClientId(Context context, String str) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        SharedPreferences.Editor edit = context.getSharedPreferences(CACHE_PREFS, 0).edit();
        edit.putString(FACILITATOR_ID, str);
        edit.apply();
    }

    public static final void cacheFirebaseInstanceID(Context context, String str) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        SharedPreferences.Editor edit = context.getSharedPreferences(CACHE_PREFS, 0).edit();
        edit.putString(FIREBASE_DB_INSTANCE_ID, str);
        edit.apply();
    }

    public static final void cacheFundingSource(Context context, String str) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        SharedPreferences.Editor edit = context.getSharedPreferences(CACHE_PREFS, 0).edit();
        edit.putString(FUNDING_SOURCE, str);
        edit.apply();
    }

    public static final void cacheIntentDataUri(Context context, String str) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        SharedPreferences.Editor edit = context.getSharedPreferences(CACHE_PREFS, 0).edit();
        edit.putString(INTENT_DATA_URL, str);
        edit.apply();
    }

    public static final void cacheIsFallback(Context context, boolean z) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        SharedPreferences.Editor edit = context.getSharedPreferences(CACHE_PREFS, 0).edit();
        edit.putBoolean(IS_FALLBACK, z);
        edit.apply();
    }

    public static final void cacheIsSmartPaymentButton(Context context, boolean z) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        SharedPreferences.Editor edit = context.getSharedPreferences(CACHE_PREFS, 0).edit();
        edit.putBoolean(IS_SMART_PAYMENT, z);
        edit.apply();
    }

    public static final void cacheIsVaultFlow(Context context, boolean z) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        context.getSharedPreferences(IS_VAULT_FLOW, 0).edit().putBoolean(IS_VAULT_FLOW, z).apply();
    }

    public static final void cacheMerchantCountry(Context context, String str) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, "country");
        context.getSharedPreferences(ADD_SHIPPING, 0).edit().putString(MERCHANT_COUNTRY, str).apply();
    }

    public static final void cacheOrderAuthorizeUrl(Context context, String str) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        SharedPreferences.Editor edit = context.getSharedPreferences(CACHE_PREFS, 0).edit();
        edit.putString(ORDER_AUTHORIZE_URL, str);
        edit.apply();
    }

    public static final void cacheOrderCaptureUrl(Context context, String str) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        SharedPreferences.Editor edit = context.getSharedPreferences(CACHE_PREFS, 0).edit();
        edit.putString(ORDER_CAPTURE_URL, str);
        edit.apply();
    }

    public static final void cacheOrderPatchUrl(Context context, String str) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        SharedPreferences.Editor edit = context.getSharedPreferences(CACHE_PREFS, 0).edit();
        edit.putString(ORDER_PATCH_URL, str);
        edit.apply();
    }

    public static final void clearCreateOrderContext(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        SharedPreferences.Editor edit = context.getSharedPreferences(CACHE_PREFS, 0).edit();
        edit.remove(ORDER_PATCH_URL);
        edit.remove(ORDER_AUTHORIZE_URL);
        edit.remove(ORDER_CAPTURE_URL);
        edit.remove(IS_ORDER_CREATED);
        edit.apply();
    }

    public static final void clearFinishCheckoutAndOnApproveFiredFlag(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        SharedPreferences.Editor edit = context.getSharedPreferences(CACHE_PREFS, 0).edit();
        edit.remove(FINISH_CHECKOUT_AND_APPROVE_FIRED);
        edit.apply();
    }

    public static final void clearIntentDataUri(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        SharedPreferences.Editor edit = context.getSharedPreferences(CACHE_PREFS, 0).edit();
        edit.remove(INTENT_DATA_URL);
        edit.apply();
    }

    public static final String getButtonSessionId(Context context) {
        return C0326j.m861f(context, ResponseConstants.CONTEXT, CACHE_PREFS, 0, BUTTON_SESSION_ID, (String) null);
    }

    public static final boolean getDidCustomTabOpen(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return context.getSharedPreferences(CACHE_PREFS, 0).getBoolean(DID_CCT_OPEN, false);
    }

    public static final String getDomain(Context context) {
        return C0326j.m861f(context, ResponseConstants.CONTEXT, CACHE_PREFS, 0, DOMAIN, (String) null);
    }

    public static final String getFacilitatorClientId(Context context) {
        return C0326j.m861f(context, ResponseConstants.CONTEXT, CACHE_PREFS, 0, FACILITATOR_ID, (String) null);
    }

    public static final String getFbSessionUid(Context context) {
        return C0326j.m861f(context, ResponseConstants.CONTEXT, CACHE_PREFS, 0, FB_SESSION_UID, (String) null);
    }

    public static final boolean getFinishCheckoutAndOnApproveFiredFlag(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return context.getSharedPreferences(CACHE_PREFS, 0).getBoolean(FINISH_CHECKOUT_AND_APPROVE_FIRED, false);
    }

    public static final String getFirebaseInstanceID(Context context) {
        return C0326j.m861f(context, ResponseConstants.CONTEXT, CACHE_PREFS, 0, FIREBASE_DB_INSTANCE_ID, (String) null);
    }

    public static final String getFundingSource(Context context) {
        return C0326j.m861f(context, ResponseConstants.CONTEXT, CACHE_PREFS, 0, FUNDING_SOURCE, (String) null);
    }

    public static final String getIntentDataUri(Context context) {
        return C0326j.m861f(context, ResponseConstants.CONTEXT, CACHE_PREFS, 0, INTENT_DATA_URL, (String) null);
    }

    public static final boolean getIsFallback(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return context.getSharedPreferences(CACHE_PREFS, 0).getBoolean(IS_FALLBACK, false);
    }

    public static final boolean getIsOrderCreated(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return context.getSharedPreferences(CACHE_PREFS, 0).getBoolean(IS_ORDER_CREATED, false);
    }

    public static final boolean getIsSmartPayment(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return context.getSharedPreferences(CACHE_PREFS, 0).getBoolean(IS_SMART_PAYMENT, false);
    }

    public static final String getOrCreateUUID(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        SharedPreferences sharedPreferences = context.getSharedPreferences(CACHE_PREFS, 0);
        String string = sharedPreferences.getString(UUID_KEY, (String) null);
        if (string != null) {
            return string;
        }
        String e = C0069a.m174e("randomUUID().toString()");
        sharedPreferences.edit().putString(UUID_KEY, e).apply();
        return e;
    }

    public static final String getOrderAuthorizeUrl(Context context) {
        return C0326j.m861f(context, ResponseConstants.CONTEXT, CACHE_PREFS, 0, ORDER_AUTHORIZE_URL, (String) null);
    }

    public static final String getOrderCaptureUrl(Context context) {
        return C0326j.m861f(context, ResponseConstants.CONTEXT, CACHE_PREFS, 0, ORDER_CAPTURE_URL, (String) null);
    }

    public static final String getOrderId(Context context) {
        return C0326j.m861f(context, ResponseConstants.CONTEXT, CACHE_PREFS, 0, ORDER_ID, (String) null);
    }

    public static final String getOrderPatchUrl(Context context) {
        return C0326j.m861f(context, ResponseConstants.CONTEXT, CACHE_PREFS, 0, ORDER_PATCH_URL, (String) null);
    }

    public static final String getSPBToken(Context context) {
        return C0326j.m861f(context, ResponseConstants.CONTEXT, CACHE_PREFS, 0, SPB_TOKEN, (String) null);
    }

    public static final String getStickinessId(Context context) {
        return C0326j.m861f(context, ResponseConstants.CONTEXT, CACHE_PREFS, 0, STICKINESS_ID, (String) null);
    }

    public static final boolean isVaultFlow(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return context.getSharedPreferences(IS_VAULT_FLOW, 0).getBoolean(IS_VAULT_FLOW, false);
    }

    public final void cacheAddManually(Context context, boolean z) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        context.getSharedPreferences(ADD_SHIPPING, 0).edit().putBoolean(ADD_MANUALLY, z).apply();
    }

    public final void cacheAddressSelected(Context context, Address address) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(address, "address");
        SharedPreferences.Editor edit = context.getSharedPreferences(ADD_SHIPPING, 0).edit();
        String fullAddress = address.getFullAddress();
        edit.putString(FULL_ADDRESS, fullAddress == null ? null : C19459m.m33032E1(fullAddress, ",", fullAddress));
        edit.putString(STATE, address.getState());
        edit.putString(POSTAL_CODE, address.getPostalCode());
        edit.putString(CITY, address.getCity());
        edit.apply();
    }

    public final void cacheButtonSessionId(Context context, String str) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, "buttonSessionId");
        SharedPreferences.Editor edit = context.getSharedPreferences(CACHE_PREFS, 0).edit();
        edit.putString(BUTTON_SESSION_ID, str);
        edit.apply();
    }

    public final void cacheComingFromReviewPage(Context context, boolean z) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        context.getSharedPreferences(ADD_SHIPPING, 0).edit().putBoolean(COMING_FROM_REVIEW, z).apply();
    }

    public final void cacheCountries(Country country) {
        C19383o.m32797g(country, "country");
        countryList.add(country);
    }

    public final void cacheCountryId(Context context, String str) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, "id");
        context.getSharedPreferences(ADD_SHIPPING, 0).edit().putString(COUNTRY_ID, str).apply();
    }

    public final void cacheCountryPosition(Context context, int i) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        context.getSharedPreferences(ADD_SHIPPING, 0).edit().putInt(COUNTRY_POSITION, i).apply();
    }

    public final void cacheCountryfield(String str, String str2) {
        C19383o.m32797g(str, "text");
        C19383o.m32797g(str2, "resource");
        countryFields.put(str, str2);
    }

    public final void cacheFbSessionUid(Context context, String str) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, "sessionId");
        SharedPreferences.Editor edit = context.getSharedPreferences(CACHE_PREFS, 0).edit();
        edit.putString(FB_SESSION_UID, str);
        edit.apply();
    }

    public final void cacheFinishCheckoutAndOnApproveFiredFlag(Context context, boolean z) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        SharedPreferences.Editor edit = context.getSharedPreferences(CACHE_PREFS, 0).edit();
        edit.putBoolean(FINISH_CHECKOUT_AND_APPROVE_FIRED, z);
        edit.apply();
    }

    public final void cacheHintTitle(Context context, String str) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, ResponseConstants.HINT);
        context.getSharedPreferences(ADD_SHIPPING, 0).edit().putString(HINT_TITLE, str).apply();
    }

    public final void cacheOrderId(Context context, String str) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, "orderId");
        SharedPreferences.Editor edit = context.getSharedPreferences(CACHE_PREFS, 0).edit();
        edit.putString(ORDER_ID, str);
        edit.apply();
    }

    public final void cacheSPBToken(Context context, String str) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, "orderId");
        SharedPreferences.Editor edit = context.getSharedPreferences(CACHE_PREFS, 0).edit();
        edit.putString(SPB_TOKEN, str);
        edit.apply();
    }

    public final void cacheSavedAddress(Context context, String str) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, ResponseConstants.HINT);
        context.getSharedPreferences(ADD_SHIPPING, 0).edit().putString(SAVED_ADDRESS, str).apply();
    }

    public final void cacheSearchScreenTitle(Context context, String str) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, "title");
        context.getSharedPreferences(ADD_SHIPPING, 0).edit().putString(SEARCH_SCREEN_TITLE, str).apply();
    }

    public final void cacheStickinessId(Context context, String str) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, "stickinessId");
        SharedPreferences.Editor edit = context.getSharedPreferences(CACHE_PREFS, 0).edit();
        edit.putString(STICKINESS_ID, str);
        edit.apply();
    }

    public final void clearAddShippingData(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        context.getSharedPreferences(ADD_SHIPPING, 0).edit().clear().apply();
    }

    public final void clearSavedAddress(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        context.getSharedPreferences(ADD_SHIPPING, 0).edit().remove(SAVED_ADDRESS).apply();
    }

    public final void clearSessionValues(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        SharedPreferences.Editor edit = context.getSharedPreferences(CACHE_PREFS, 0).edit();
        edit.remove(BUTTON_SESSION_ID);
        edit.remove(ORDER_ID);
        edit.remove(SPB_TOKEN);
        edit.remove(FB_SESSION_UID);
        edit.remove(FIREBASE_DB_INSTANCE_ID);
        edit.remove(FACILITATOR_ID);
        edit.remove(FUNDING_SOURCE);
        edit.remove(DOMAIN);
        edit.remove(IS_SMART_PAYMENT);
        edit.remove(ORDER_AUTHORIZE_URL);
        edit.remove(ORDER_CAPTURE_URL);
        edit.remove(ORDER_PATCH_URL);
        edit.remove(IS_ORDER_CREATED);
        edit.apply();
    }

    public final boolean getBlockNonDomesticShipping(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return context.getSharedPreferences(ADD_SHIPPING, 0).getBoolean(BLOCK_NON_DOMESTIC_SHIPPING, false);
    }

    public final String getCity(Context context) {
        return C0326j.m861f(context, ResponseConstants.CONTEXT, ADD_SHIPPING, 0, CITY, (String) null);
    }

    public final ArrayList<Country> getCountries() {
        return countryList;
    }

    public final Country getCountryById(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        for (Country country : countryList) {
            if (C19457k.m33019W0(country.getCode(), INSTANCE.getCountryId(context), true)) {
                return country;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final HashMap<String, String> getCountryFields() {
        return countryFields;
    }

    public final String getCountryId(Context context) {
        return C0326j.m861f(context, ResponseConstants.CONTEXT, ADD_SHIPPING, 0, COUNTRY_ID, (String) null);
    }

    public final ArrayList<Country> getCountryList() {
        return countryList;
    }

    public final int getCountryPosition(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return context.getSharedPreferences(ADD_SHIPPING, 0).getInt(COUNTRY_POSITION, 0);
    }

    public final HashMap<String, String> getCountryfield() {
        return countryFields;
    }

    public final String getFullAddress(Context context) {
        return C0326j.m861f(context, ResponseConstants.CONTEXT, ADD_SHIPPING, 0, FULL_ADDRESS, (String) null);
    }

    public final String getHintTitle(Context context) {
        return C0326j.m861f(context, ResponseConstants.CONTEXT, ADD_SHIPPING, 0, HINT_TITLE, (String) null);
    }

    public final String getMerchantCountry(Context context) {
        return C0326j.m861f(context, ResponseConstants.CONTEXT, ADD_SHIPPING, 0, MERCHANT_COUNTRY, (String) null);
    }

    public final String getPostalCode(Context context) {
        return C0326j.m861f(context, ResponseConstants.CONTEXT, ADD_SHIPPING, 0, POSTAL_CODE, (String) null);
    }

    public final String getSavedAddress(Context context) {
        return C0326j.m861f(context, ResponseConstants.CONTEXT, ADD_SHIPPING, 0, SAVED_ADDRESS, (String) null);
    }

    public final String getSearchScreenTitle(Context context) {
        return C0326j.m861f(context, ResponseConstants.CONTEXT, ADD_SHIPPING, 0, SEARCH_SCREEN_TITLE, (String) null);
    }

    public final String getState(Context context) {
        return C0326j.m861f(context, ResponseConstants.CONTEXT, ADD_SHIPPING, 0, STATE, (String) null);
    }

    public final List<TransactionSession> getTransactionSessions(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return (List) new C16708i().mo59459f(context.getSharedPreferences(CACHE_PREFS, 0).getString(TRANSACTIONS_SESSIONS_KEYS, (String) null), new Cache$getTransactionSessions$transactionSessionType$1().getType());
    }

    public final Boolean isAddManually(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return Boolean.valueOf(context.getSharedPreferences(ADD_SHIPPING, 0).getBoolean(ADD_MANUALLY, false));
    }

    public final boolean isCacheComingFromReviewPage(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return context.getSharedPreferences(ADD_SHIPPING, 0).getBoolean(COMING_FROM_REVIEW, false);
    }

    public final void saveTransactionSessions(Context context, List<TransactionSession> list) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(list, "listOfTransactionSessions");
        SharedPreferences sharedPreferences = context.getSharedPreferences(CACHE_PREFS, 0);
        String j = new C16708i().mo59463j(list);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(TRANSACTIONS_SESSIONS_KEYS, j);
        edit.apply();
    }

    public final void setCountryFields(HashMap<String, String> hashMap) {
        C19383o.m32797g(hashMap, "<set-?>");
        countryFields = hashMap;
    }
}
