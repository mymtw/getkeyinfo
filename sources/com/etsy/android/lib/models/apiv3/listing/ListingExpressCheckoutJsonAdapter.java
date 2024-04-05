package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class ListingExpressCheckoutJsonAdapter extends JsonAdapter<ListingExpressCheckout> {
    public static final int $stable = 8;
    private volatile Constructor<ListingExpressCheckout> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<KlarnaOnSiteMessaging> nullableKlarnaOnSiteMessagingAdapter;
    private final JsonAdapter<List<ListingExpressCheckoutPaymentOption>> nullableListOfListingExpressCheckoutPaymentOptionAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.ACCEPTS_MULTIPLE_PAYMENT_METHODS, ResponseConstants.ACCEPTS_PAYPAL, "accepts_google_pay", ResponseConstants.DEFAULT_PAYMENT_METHOD, ResponseConstants.DEFAULT_SUBMIT_TEXT, ResponseConstants.INELIGIBILITY_ERROR_CODE, ResponseConstants.INELIGIBILITY_ERROR_REASON, ResponseConstants.IS_EXPRESS_CHECKOUT_ELIGIBLE, ResponseConstants.IS_GUEST, ResponseConstants.IS_INTERNATIONAL, "is_marketing_email_auto_subscribe_eligible", ResponseConstants.PAYMENT_OPTIONS, ResponseConstants.PURCHASE_ACCEPT_TERMS_TEXT, "should_show_digital_rights_waiver", "show_overlay", "title", "klarna_osm_message");

    public ListingExpressCheckoutJsonAdapter(C17414y yVar) {
        C17414y yVar2 = yVar;
        C19383o.m32797g(yVar2, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableBooleanAdapter = yVar2.mo68558c(Boolean.class, emptySet, "acceptsMultiplePaymentMethods");
        this.nullableStringAdapter = yVar2.mo68558c(String.class, emptySet, "defaultPaymentMethod");
        this.nullableIntAdapter = yVar2.mo68558c(Integer.class, emptySet, "ineligibilityErrorCode");
        this.nullableListOfListingExpressCheckoutPaymentOptionAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, ListingExpressCheckoutPaymentOption.class), emptySet, CartGroupItem.ELEMENT_PAYMENT_OPTIONS);
        this.nullableKlarnaOnSiteMessagingAdapter = yVar2.mo68558c(KlarnaOnSiteMessaging.class, emptySet, "klarnaMessaging");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ListingExpressCheckout)";
    }

    public ListingExpressCheckout fromJson(JsonReader jsonReader) {
        int i;
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        Class<Boolean> cls2 = Boolean.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i2 = -1;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        String str3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        String str4 = null;
        List list = null;
        String str5 = null;
        Boolean bool7 = null;
        Boolean bool8 = null;
        String str6 = null;
        KlarnaOnSiteMessaging klarnaOnSiteMessaging = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    continue;
                case 0:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i2 &= -2;
                    continue;
                case 1:
                    bool2 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i2 &= -3;
                    continue;
                case 2:
                    bool3 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i2 &= -5;
                    continue;
                case 3:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -9;
                    continue;
                case 4:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -17;
                    continue;
                case 5:
                    num = this.nullableIntAdapter.fromJson(jsonReader2);
                    i2 &= -33;
                    continue;
                case 6:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -65;
                    continue;
                case 7:
                    bool4 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i2 &= -129;
                    continue;
                case 8:
                    bool5 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i2 &= -257;
                    continue;
                case 9:
                    bool6 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i2 &= -513;
                    continue;
                case 10:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -1025;
                    continue;
                case 11:
                    list = this.nullableListOfListingExpressCheckoutPaymentOptionAdapter.fromJson(jsonReader2);
                    i2 &= -2049;
                    continue;
                case 12:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -4097;
                    continue;
                case 13:
                    bool7 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i2 &= -8193;
                    continue;
                case 14:
                    bool8 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i2 &= -16385;
                    continue;
                case 15:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i = -32769;
                    break;
                case 16:
                    klarnaOnSiteMessaging = this.nullableKlarnaOnSiteMessagingAdapter.fromJson(jsonReader2);
                    i = -65537;
                    break;
            }
            i2 &= i;
        }
        jsonReader.mo68413e();
        if (i2 == -131072) {
            return new ListingExpressCheckout(bool, bool2, bool3, str, str2, num, str3, bool4, bool5, bool6, str4, list, str5, bool7, bool8, str6, klarnaOnSiteMessaging);
        }
        Constructor<ListingExpressCheckout> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ListingExpressCheckout.class.getDeclaredConstructor(new Class[]{cls2, cls2, cls2, cls, cls, Integer.class, cls, cls2, cls2, cls2, cls, List.class, cls, cls2, cls2, cls, KlarnaOnSiteMessaging.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "ListingExpressCheckout::…his.constructorRef = it }");
        }
        ListingExpressCheckout newInstance = constructor.newInstance(new Object[]{bool, bool2, bool3, str, str2, num, str3, bool4, bool5, bool6, str4, list, str5, bool7, bool8, str6, klarnaOnSiteMessaging, Integer.valueOf(i2), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, ListingExpressCheckout listingExpressCheckout) {
        C19383o.m32797g(wVar, "writer");
        if (listingExpressCheckout != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.ACCEPTS_MULTIPLE_PAYMENT_METHODS);
            this.nullableBooleanAdapter.toJson(wVar, listingExpressCheckout.getAcceptsMultiplePaymentMethods());
            wVar.mo68529h(ResponseConstants.ACCEPTS_PAYPAL);
            this.nullableBooleanAdapter.toJson(wVar, listingExpressCheckout.getAcceptsPaypal());
            wVar.mo68529h("accepts_google_pay");
            this.nullableBooleanAdapter.toJson(wVar, listingExpressCheckout.getAcceptsGooglePay());
            wVar.mo68529h(ResponseConstants.DEFAULT_PAYMENT_METHOD);
            this.nullableStringAdapter.toJson(wVar, listingExpressCheckout.getDefaultPaymentMethod());
            wVar.mo68529h(ResponseConstants.DEFAULT_SUBMIT_TEXT);
            this.nullableStringAdapter.toJson(wVar, listingExpressCheckout.getDefaultSubmitText());
            wVar.mo68529h(ResponseConstants.INELIGIBILITY_ERROR_CODE);
            this.nullableIntAdapter.toJson(wVar, listingExpressCheckout.getIneligibilityErrorCode());
            wVar.mo68529h(ResponseConstants.INELIGIBILITY_ERROR_REASON);
            this.nullableStringAdapter.toJson(wVar, listingExpressCheckout.getIneligibilityErrorReason());
            wVar.mo68529h(ResponseConstants.IS_EXPRESS_CHECKOUT_ELIGIBLE);
            this.nullableBooleanAdapter.toJson(wVar, listingExpressCheckout.isExpressCheckoutEligible());
            wVar.mo68529h(ResponseConstants.IS_GUEST);
            this.nullableBooleanAdapter.toJson(wVar, listingExpressCheckout.isGuest());
            wVar.mo68529h(ResponseConstants.IS_INTERNATIONAL);
            this.nullableBooleanAdapter.toJson(wVar, listingExpressCheckout.isInternational());
            wVar.mo68529h("is_marketing_email_auto_subscribe_eligible");
            this.nullableStringAdapter.toJson(wVar, listingExpressCheckout.isMarketingEmailAutoSubscribeEligible());
            wVar.mo68529h(ResponseConstants.PAYMENT_OPTIONS);
            this.nullableListOfListingExpressCheckoutPaymentOptionAdapter.toJson(wVar, listingExpressCheckout.getPaymentOptions());
            wVar.mo68529h(ResponseConstants.PURCHASE_ACCEPT_TERMS_TEXT);
            this.nullableStringAdapter.toJson(wVar, listingExpressCheckout.getPurchaseAcceptTermsText());
            wVar.mo68529h("should_show_digital_rights_waiver");
            this.nullableBooleanAdapter.toJson(wVar, listingExpressCheckout.getShouldShowDigitalRightsWaiver());
            wVar.mo68529h("show_overlay");
            this.nullableBooleanAdapter.toJson(wVar, listingExpressCheckout.getShowOverlay());
            wVar.mo68529h("title");
            this.nullableStringAdapter.toJson(wVar, listingExpressCheckout.getTitle());
            wVar.mo68529h("klarna_osm_message");
            this.nullableKlarnaOnSiteMessagingAdapter.toJson(wVar, listingExpressCheckout.getKlarnaMessaging());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
