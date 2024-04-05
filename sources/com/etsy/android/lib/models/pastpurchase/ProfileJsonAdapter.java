package com.etsy.android.lib.models.pastpurchase;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class ProfileJsonAdapter extends JsonAdapter<Profile> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Country> nullableCountryAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("country", ResponseConstants.IS_SELLER, "login_name", "city", "image_url_75x75", "last_name", ResponseConstants.TRANSACTION_SOLD_COUNT, "region", ResponseConstants.FIRST_NAME);

    public ProfileJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableCountryAdapter = yVar.mo68558c(Country.class, emptySet, "country");
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "isSeller");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "loginName");
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "transactionSoldCount");
    }

    public String toString() {
        return "GeneratedJsonAdapter(Profile)";
    }

    public Profile fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Country country = null;
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        String str5 = null;
        String str6 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    country = this.nullableCountryAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    num = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.mo68413e();
        return new Profile(country, bool, str, str2, str3, str4, num, str5, str6);
    }

    public void toJson(C17412w wVar, Profile profile) {
        C19383o.m32797g(wVar, "writer");
        if (profile != null) {
            wVar.mo68522b();
            wVar.mo68529h("country");
            this.nullableCountryAdapter.toJson(wVar, profile.getCountry());
            wVar.mo68529h(ResponseConstants.IS_SELLER);
            this.nullableBooleanAdapter.toJson(wVar, profile.isSeller());
            wVar.mo68529h("login_name");
            this.nullableStringAdapter.toJson(wVar, profile.getLoginName());
            wVar.mo68529h("city");
            this.nullableStringAdapter.toJson(wVar, profile.getCity());
            wVar.mo68529h("image_url_75x75");
            this.nullableStringAdapter.toJson(wVar, profile.getImageUrl75x75());
            wVar.mo68529h("last_name");
            this.nullableStringAdapter.toJson(wVar, profile.getLastName());
            wVar.mo68529h(ResponseConstants.TRANSACTION_SOLD_COUNT);
            this.nullableIntAdapter.toJson(wVar, profile.getTransactionSoldCount());
            wVar.mo68529h("region");
            this.nullableStringAdapter.toJson(wVar, profile.getRegion());
            wVar.mo68529h(ResponseConstants.FIRST_NAME);
            this.nullableStringAdapter.toJson(wVar, profile.getFirstName());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
