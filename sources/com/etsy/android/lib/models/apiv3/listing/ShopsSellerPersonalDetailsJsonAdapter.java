package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalNewShippingAddressReviewViewKt;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class ShopsSellerPersonalDetailsJsonAdapter extends JsonAdapter<ShopsSellerPersonalDetails> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("details_id", ResponseConstants.FIRST_NAME, "last_name", ResponseConstants.ADDRESS_LINE_1, ResponseConstants.ADDRESS_LINE_2, "city", "state", "country", ResponseConstants.POSTAL_CODE, ResponseConstants.VAT_NUMBER, ResponseConstants.EMAIL_ADDRESS, ResponseConstants.PHONE_NUMBER, ResponseConstants.CREATE_DATE, "create_date_formatted", ResponseConstants.UPDATE_DATE, "update_date_formatted", ResponseConstants.FORMATTED_STRING, "has_contact_info", "trader_distinction");

    public ShopsSellerPersonalDetailsJsonAdapter(C17414y yVar) {
        C17414y yVar2 = yVar;
        C19383o.m32797g(yVar2, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableLongAdapter = yVar2.mo68558c(Long.class, emptySet, "detailsId");
        this.nullableStringAdapter = yVar2.mo68558c(String.class, emptySet, PayPalNewShippingAddressReviewViewKt.FIRST_NAME_FIELD);
        this.nullableIntAdapter = yVar2.mo68558c(Integer.class, emptySet, "createDate");
        this.nullableBooleanAdapter = yVar2.mo68558c(Boolean.class, emptySet, "hasContactInfo");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ShopsSellerPersonalDetails)";
    }

    public ShopsSellerPersonalDetails fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        Long l = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        Integer num = null;
        String str12 = null;
        Integer num2 = null;
        String str13 = null;
        String str14 = null;
        Boolean bool = null;
        String str15 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    l = this.nullableLongAdapter.fromJson(jsonReader2);
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 6:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 7:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 8:
                    str8 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 9:
                    str9 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 10:
                    str10 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 11:
                    str11 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 12:
                    num = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 13:
                    str12 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 14:
                    num2 = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 15:
                    str13 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 16:
                    str14 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 17:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 18:
                    str15 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
            }
        }
        jsonReader.mo68413e();
        return new ShopsSellerPersonalDetails(l, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, num2, str13, str14, bool, str15);
    }

    public void toJson(C17412w wVar, ShopsSellerPersonalDetails shopsSellerPersonalDetails) {
        C19383o.m32797g(wVar, "writer");
        if (shopsSellerPersonalDetails != null) {
            wVar.mo68522b();
            wVar.mo68529h("details_id");
            this.nullableLongAdapter.toJson(wVar, shopsSellerPersonalDetails.getDetailsId());
            wVar.mo68529h(ResponseConstants.FIRST_NAME);
            this.nullableStringAdapter.toJson(wVar, shopsSellerPersonalDetails.getFirstName());
            wVar.mo68529h("last_name");
            this.nullableStringAdapter.toJson(wVar, shopsSellerPersonalDetails.getLastName());
            wVar.mo68529h(ResponseConstants.ADDRESS_LINE_1);
            this.nullableStringAdapter.toJson(wVar, shopsSellerPersonalDetails.getAddressLine1());
            wVar.mo68529h(ResponseConstants.ADDRESS_LINE_2);
            this.nullableStringAdapter.toJson(wVar, shopsSellerPersonalDetails.getAddressLine2());
            wVar.mo68529h("city");
            this.nullableStringAdapter.toJson(wVar, shopsSellerPersonalDetails.getCity());
            wVar.mo68529h("state");
            this.nullableStringAdapter.toJson(wVar, shopsSellerPersonalDetails.getState());
            wVar.mo68529h("country");
            this.nullableStringAdapter.toJson(wVar, shopsSellerPersonalDetails.getCountry());
            wVar.mo68529h(ResponseConstants.POSTAL_CODE);
            this.nullableStringAdapter.toJson(wVar, shopsSellerPersonalDetails.getPostalCode());
            wVar.mo68529h(ResponseConstants.VAT_NUMBER);
            this.nullableStringAdapter.toJson(wVar, shopsSellerPersonalDetails.getVatNumber());
            wVar.mo68529h(ResponseConstants.EMAIL_ADDRESS);
            this.nullableStringAdapter.toJson(wVar, shopsSellerPersonalDetails.getEmailAddress());
            wVar.mo68529h(ResponseConstants.PHONE_NUMBER);
            this.nullableStringAdapter.toJson(wVar, shopsSellerPersonalDetails.getPhoneNumber());
            wVar.mo68529h(ResponseConstants.CREATE_DATE);
            this.nullableIntAdapter.toJson(wVar, shopsSellerPersonalDetails.getCreateDate());
            wVar.mo68529h("create_date_formatted");
            this.nullableStringAdapter.toJson(wVar, shopsSellerPersonalDetails.getCreateDateFormatted());
            wVar.mo68529h(ResponseConstants.UPDATE_DATE);
            this.nullableIntAdapter.toJson(wVar, shopsSellerPersonalDetails.getUpdateDate());
            wVar.mo68529h("update_date_formatted");
            this.nullableStringAdapter.toJson(wVar, shopsSellerPersonalDetails.getUpdateDateFormatted());
            wVar.mo68529h(ResponseConstants.FORMATTED_STRING);
            this.nullableStringAdapter.toJson(wVar, shopsSellerPersonalDetails.getFormattedString());
            wVar.mo68529h("has_contact_info");
            this.nullableBooleanAdapter.toJson(wVar, shopsSellerPersonalDetails.getHasContactInfo());
            wVar.mo68529h("trader_distinction");
            this.nullableStringAdapter.toJson(wVar, shopsSellerPersonalDetails.getTraderDistinction());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
