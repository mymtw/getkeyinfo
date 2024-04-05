package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class ShopsPolicyJsonAdapter extends JsonAdapter<ShopsPolicy> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.ADDITIONAL, "can_include_dispute_form_link", ResponseConstants.HAS_NO_POLICIES, ResponseConstants.INCLUDE_RESOLUTION_LINK, ResponseConstants.PAYMENT, ResponseConstants.PRIVACY, ResponseConstants.REFUNDS, "seller_info", "shipping", ResponseConstants.UPDATE_DATE, ResponseConstants.WELCOME);

    public ShopsPolicyJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, ResponseConstants.ADDITIONAL);
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "canIncludeDisputeFormLink");
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "updateDate");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ShopsPolicy)";
    }

    public ShopsPolicy fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Integer num = null;
        String str7 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    bool2 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    bool3 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 9:
                    num = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 10:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.mo68413e();
        return new ShopsPolicy(str, bool, bool2, bool3, str2, str3, str4, str5, str6, num, str7);
    }

    public void toJson(C17412w wVar, ShopsPolicy shopsPolicy) {
        C19383o.m32797g(wVar, "writer");
        if (shopsPolicy != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.ADDITIONAL);
            this.nullableStringAdapter.toJson(wVar, shopsPolicy.getAdditional());
            wVar.mo68529h("can_include_dispute_form_link");
            this.nullableBooleanAdapter.toJson(wVar, shopsPolicy.getCanIncludeDisputeFormLink());
            wVar.mo68529h(ResponseConstants.HAS_NO_POLICIES);
            this.nullableBooleanAdapter.toJson(wVar, shopsPolicy.getHasNoPolicies());
            wVar.mo68529h(ResponseConstants.INCLUDE_RESOLUTION_LINK);
            this.nullableBooleanAdapter.toJson(wVar, shopsPolicy.getIncludeDisputeFormLink());
            wVar.mo68529h(ResponseConstants.PAYMENT);
            this.nullableStringAdapter.toJson(wVar, shopsPolicy.getPayment());
            wVar.mo68529h(ResponseConstants.PRIVACY);
            this.nullableStringAdapter.toJson(wVar, shopsPolicy.getPrivacy());
            wVar.mo68529h(ResponseConstants.REFUNDS);
            this.nullableStringAdapter.toJson(wVar, shopsPolicy.getRefunds());
            wVar.mo68529h("seller_info");
            this.nullableStringAdapter.toJson(wVar, shopsPolicy.getSellerInfo());
            wVar.mo68529h("shipping");
            this.nullableStringAdapter.toJson(wVar, shopsPolicy.getShipping());
            wVar.mo68529h(ResponseConstants.UPDATE_DATE);
            this.nullableIntAdapter.toJson(wVar, shopsPolicy.getUpdateDate());
            wVar.mo68529h(ResponseConstants.WELCOME);
            this.nullableStringAdapter.toJson(wVar, shopsPolicy.getWelcome());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
