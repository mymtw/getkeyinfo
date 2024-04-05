package com.etsy.android.lib.selfuser;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class SelfUserProfileJsonAdapter extends JsonAdapter<SelfUserProfile> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<SelfUserProfileCountry> nullableSelfUserProfileCountryAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("image_url_75x75", "city", "region", ResponseConstants.BIO, ResponseConstants.FIRST_NAME, "last_name", "login_name", "country", "num_favorites", ResponseConstants.DISPLAY_NAME, "is_favoritelistings_private", "is_favoritetreasuries_private");
    private final JsonAdapter<String> stringAdapter;

    public SelfUserProfileJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(cls, emptySet, "imageUrl75x75");
        this.stringAdapter = yVar.mo68558c(cls, emptySet, "loginName");
        this.nullableSelfUserProfileCountryAdapter = yVar.mo68558c(SelfUserProfileCountry.class, emptySet, "country");
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "numFavorites");
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "isFavoriteListingsPrivate");
    }

    public final Object fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        SelfUserProfileCountry selfUserProfileCountry = null;
        Integer num = null;
        String str8 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        while (true) {
            Boolean bool3 = bool2;
            if (jsonReader.mo68414f()) {
                switch (jsonReader2.mo68406Q(this.options)) {
                    case -1:
                        jsonReader.mo68408S();
                        jsonReader.mo68411c0();
                        break;
                    case 0:
                        str = this.nullableStringAdapter.fromJson(jsonReader2);
                        break;
                    case 1:
                        str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                        break;
                    case 2:
                        str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                        break;
                    case 3:
                        str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                        break;
                    case 4:
                        str5 = this.nullableStringAdapter.fromJson(jsonReader2);
                        break;
                    case 5:
                        str6 = this.nullableStringAdapter.fromJson(jsonReader2);
                        break;
                    case 6:
                        String fromJson = this.stringAdapter.fromJson(jsonReader2);
                        if (fromJson != null) {
                            str7 = fromJson;
                            break;
                        } else {
                            throw C18215a.m30734m("loginName", "login_name", jsonReader2);
                        }
                    case 7:
                        selfUserProfileCountry = this.nullableSelfUserProfileCountryAdapter.fromJson(jsonReader2);
                        break;
                    case 8:
                        num = this.nullableIntAdapter.fromJson(jsonReader2);
                        break;
                    case 9:
                        str8 = this.nullableStringAdapter.fromJson(jsonReader2);
                        break;
                    case 10:
                        bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                        break;
                    case 11:
                        bool2 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                        continue;
                }
                bool2 = bool3;
            } else {
                jsonReader.mo68413e();
                if (str7 != null) {
                    return new SelfUserProfile(str, str2, str3, str4, str5, str6, str7, selfUserProfileCountry, num, str8, bool, bool3);
                }
                throw C18215a.m30728g("loginName", "login_name", jsonReader2);
            }
        }
    }

    public final void toJson(C17412w wVar, Object obj) {
        SelfUserProfile selfUserProfile = (SelfUserProfile) obj;
        C19383o.m32797g(wVar, "writer");
        if (selfUserProfile != null) {
            wVar.mo68522b();
            wVar.mo68529h("image_url_75x75");
            this.nullableStringAdapter.toJson(wVar, selfUserProfile.f19498a);
            wVar.mo68529h("city");
            this.nullableStringAdapter.toJson(wVar, selfUserProfile.f19499b);
            wVar.mo68529h("region");
            this.nullableStringAdapter.toJson(wVar, selfUserProfile.f19500c);
            wVar.mo68529h(ResponseConstants.BIO);
            this.nullableStringAdapter.toJson(wVar, selfUserProfile.f19501d);
            wVar.mo68529h(ResponseConstants.FIRST_NAME);
            this.nullableStringAdapter.toJson(wVar, selfUserProfile.f19502e);
            wVar.mo68529h("last_name");
            this.nullableStringAdapter.toJson(wVar, selfUserProfile.f19503f);
            wVar.mo68529h("login_name");
            this.stringAdapter.toJson(wVar, selfUserProfile.f19504g);
            wVar.mo68529h("country");
            this.nullableSelfUserProfileCountryAdapter.toJson(wVar, selfUserProfile.f19505h);
            wVar.mo68529h("num_favorites");
            this.nullableIntAdapter.toJson(wVar, selfUserProfile.f19506i);
            wVar.mo68529h(ResponseConstants.DISPLAY_NAME);
            this.nullableStringAdapter.toJson(wVar, selfUserProfile.f19507j);
            wVar.mo68529h("is_favoritelistings_private");
            this.nullableBooleanAdapter.toJson(wVar, selfUserProfile.f19508k);
            wVar.mo68529h("is_favoritetreasuries_private");
            this.nullableBooleanAdapter.toJson(wVar, selfUserProfile.f19509l);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SelfUserProfile)";
    }
}
