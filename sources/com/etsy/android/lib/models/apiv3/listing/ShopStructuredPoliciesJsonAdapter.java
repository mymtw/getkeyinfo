package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class ShopStructuredPoliciesJsonAdapter extends JsonAdapter<ShopStructuredPolicies> {
    public static final int $stable = 8;
    private volatile Constructor<ShopStructuredPolicies> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<StructuredPolicyCharLimits> nullableStructuredPolicyCharLimitsAdapter;
    private final JsonAdapter<StructuredPolicyPayments> nullableStructuredPolicyPaymentsAdapter;
    private final JsonAdapter<StructuredPolicyPrivacy> nullableStructuredPolicyPrivacyAdapter;
    private final JsonAdapter<StructuredPolicyRefunds> nullableStructuredPolicyRefundsAdapter;
    private final JsonAdapter<StructuredPolicyShipping> nullableStructuredPolicyShippingAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.TERMS_AND_CONDITIONS, ResponseConstants.CAN_HAVE_ADDITIONAL_POLICIES, ResponseConstants.CREATE_DATE, "create_date_formatted", ResponseConstants.HAS_UNSTRUCTURED_POLICIES, ResponseConstants.INCLUDE_RESOLUTION_LINK, ResponseConstants.PAYMENTS, ResponseConstants.PRIVACY, ResponseConstants.REFUNDS, "shipping", "shop_in_germany", "structured_policies_id", ResponseConstants.UPDATE_DATE, "update_date_formatted", ResponseConstants.CHAR_LIMITS);

    public ShopStructuredPoliciesJsonAdapter(C17414y yVar) {
        C17414y yVar2 = yVar;
        C19383o.m32797g(yVar2, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar2.mo68558c(String.class, emptySet, "additionalTermsAndConditions");
        this.nullableBooleanAdapter = yVar2.mo68558c(Boolean.class, emptySet, "canHaveAdditionalPolicies");
        this.nullableLongAdapter = yVar2.mo68558c(Long.class, emptySet, "createDate");
        this.nullableStructuredPolicyPaymentsAdapter = yVar2.mo68558c(StructuredPolicyPayments.class, emptySet, ResponseConstants.PAYMENTS);
        this.nullableStructuredPolicyPrivacyAdapter = yVar2.mo68558c(StructuredPolicyPrivacy.class, emptySet, ResponseConstants.PRIVACY);
        this.nullableStructuredPolicyRefundsAdapter = yVar2.mo68558c(StructuredPolicyRefunds.class, emptySet, ResponseConstants.REFUNDS);
        this.nullableStructuredPolicyShippingAdapter = yVar2.mo68558c(StructuredPolicyShipping.class, emptySet, "shipping");
        this.nullableStructuredPolicyCharLimitsAdapter = yVar2.mo68558c(StructuredPolicyCharLimits.class, emptySet, "charLimits");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ShopStructuredPolicies)";
    }

    public ShopStructuredPolicies fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<Long> cls = Long.class;
        Class<String> cls2 = String.class;
        Class<Boolean> cls3 = Boolean.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        Boolean bool = null;
        Long l = null;
        String str2 = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        StructuredPolicyPayments structuredPolicyPayments = null;
        StructuredPolicyPrivacy structuredPolicyPrivacy = null;
        StructuredPolicyRefunds structuredPolicyRefunds = null;
        StructuredPolicyShipping structuredPolicyShipping = null;
        Boolean bool4 = null;
        Long l2 = null;
        Long l3 = null;
        String str3 = null;
        StructuredPolicyCharLimits structuredPolicyCharLimits = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -2;
                    break;
                case 1:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i &= -3;
                    break;
                case 2:
                    l = this.nullableLongAdapter.fromJson(jsonReader2);
                    i &= -5;
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -9;
                    break;
                case 4:
                    bool2 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i &= -17;
                    break;
                case 5:
                    bool3 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i &= -33;
                    break;
                case 6:
                    structuredPolicyPayments = this.nullableStructuredPolicyPaymentsAdapter.fromJson(jsonReader2);
                    i &= -65;
                    break;
                case 7:
                    structuredPolicyPrivacy = this.nullableStructuredPolicyPrivacyAdapter.fromJson(jsonReader2);
                    i &= -129;
                    break;
                case 8:
                    structuredPolicyRefunds = this.nullableStructuredPolicyRefundsAdapter.fromJson(jsonReader2);
                    i &= -257;
                    break;
                case 9:
                    structuredPolicyShipping = this.nullableStructuredPolicyShippingAdapter.fromJson(jsonReader2);
                    i &= -513;
                    break;
                case 10:
                    bool4 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i &= -1025;
                    break;
                case 11:
                    l2 = this.nullableLongAdapter.fromJson(jsonReader2);
                    i &= -2049;
                    break;
                case 12:
                    l3 = this.nullableLongAdapter.fromJson(jsonReader2);
                    i &= -4097;
                    break;
                case 13:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -8193;
                    break;
                case 14:
                    structuredPolicyCharLimits = this.nullableStructuredPolicyCharLimitsAdapter.fromJson(jsonReader2);
                    i &= -16385;
                    break;
            }
        }
        jsonReader.mo68413e();
        if (i == -32768) {
            return new ShopStructuredPolicies(str, bool, l, str2, bool2, bool3, structuredPolicyPayments, structuredPolicyPrivacy, structuredPolicyRefunds, structuredPolicyShipping, bool4, l2, l3, str3, structuredPolicyCharLimits);
        }
        Constructor<ShopStructuredPolicies> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ShopStructuredPolicies.class.getDeclaredConstructor(new Class[]{cls2, cls3, cls, cls2, cls3, cls3, StructuredPolicyPayments.class, StructuredPolicyPrivacy.class, StructuredPolicyRefunds.class, StructuredPolicyShipping.class, cls3, cls, cls, cls2, StructuredPolicyCharLimits.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "ShopStructuredPolicies::…his.constructorRef = it }");
        }
        ShopStructuredPolicies newInstance = constructor.newInstance(new Object[]{str, bool, l, str2, bool2, bool3, structuredPolicyPayments, structuredPolicyPrivacy, structuredPolicyRefunds, structuredPolicyShipping, bool4, l2, l3, str3, structuredPolicyCharLimits, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, ShopStructuredPolicies shopStructuredPolicies) {
        C19383o.m32797g(wVar, "writer");
        if (shopStructuredPolicies != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.TERMS_AND_CONDITIONS);
            this.nullableStringAdapter.toJson(wVar, shopStructuredPolicies.getAdditionalTermsAndConditions());
            wVar.mo68529h(ResponseConstants.CAN_HAVE_ADDITIONAL_POLICIES);
            this.nullableBooleanAdapter.toJson(wVar, shopStructuredPolicies.getCanHaveAdditionalPolicies());
            wVar.mo68529h(ResponseConstants.CREATE_DATE);
            this.nullableLongAdapter.toJson(wVar, shopStructuredPolicies.getCreateDate());
            wVar.mo68529h("create_date_formatted");
            this.nullableStringAdapter.toJson(wVar, shopStructuredPolicies.getCreateDateFormatted());
            wVar.mo68529h(ResponseConstants.HAS_UNSTRUCTURED_POLICIES);
            this.nullableBooleanAdapter.toJson(wVar, shopStructuredPolicies.getHasUnstructuredPolicies());
            wVar.mo68529h(ResponseConstants.INCLUDE_RESOLUTION_LINK);
            this.nullableBooleanAdapter.toJson(wVar, shopStructuredPolicies.getIncludeDisputeFormLink());
            wVar.mo68529h(ResponseConstants.PAYMENTS);
            this.nullableStructuredPolicyPaymentsAdapter.toJson(wVar, shopStructuredPolicies.getPayments());
            wVar.mo68529h(ResponseConstants.PRIVACY);
            this.nullableStructuredPolicyPrivacyAdapter.toJson(wVar, shopStructuredPolicies.getPrivacy());
            wVar.mo68529h(ResponseConstants.REFUNDS);
            this.nullableStructuredPolicyRefundsAdapter.toJson(wVar, shopStructuredPolicies.getRefunds());
            wVar.mo68529h("shipping");
            this.nullableStructuredPolicyShippingAdapter.toJson(wVar, shopStructuredPolicies.getShipping());
            wVar.mo68529h("shop_in_germany");
            this.nullableBooleanAdapter.toJson(wVar, shopStructuredPolicies.getShopInGermany());
            wVar.mo68529h("structured_policies_id");
            this.nullableLongAdapter.toJson(wVar, shopStructuredPolicies.getStructuredPoliciesId());
            wVar.mo68529h(ResponseConstants.UPDATE_DATE);
            this.nullableLongAdapter.toJson(wVar, shopStructuredPolicies.getUpdateDate());
            wVar.mo68529h("update_date_formatted");
            this.nullableStringAdapter.toJson(wVar, shopStructuredPolicies.getUpdateDateFormatted());
            wVar.mo68529h(ResponseConstants.CHAR_LIMITS);
            this.nullableStructuredPolicyCharLimitsAdapter.toJson(wVar, shopStructuredPolicies.getCharLimits());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
