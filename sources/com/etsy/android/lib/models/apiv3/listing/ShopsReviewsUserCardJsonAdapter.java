package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class ShopsReviewsUserCardJsonAdapter extends JsonAdapter<ShopsReviewsUserCard> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("avatar_color", "avatar_url", "casual_name_or_login_name", "is_active", ResponseConstants.IS_GUEST, "is_name_withheld", "login_name", "profile_url", ResponseConstants.REAL_NAME, "user_id");

    public ShopsReviewsUserCardJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "avatarColor");
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "isActive");
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "userId");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ShopsReviewsUserCard)";
    }

    public ShopsReviewsUserCard fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Long l = null;
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
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    bool2 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    bool3 = this.nullableBooleanAdapter.fromJson(jsonReader);
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
                    l = this.nullableLongAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.mo68413e();
        return new ShopsReviewsUserCard(str, str2, str3, bool, bool2, bool3, str4, str5, str6, l);
    }

    public void toJson(C17412w wVar, ShopsReviewsUserCard shopsReviewsUserCard) {
        C19383o.m32797g(wVar, "writer");
        if (shopsReviewsUserCard != null) {
            wVar.mo68522b();
            wVar.mo68529h("avatar_color");
            this.nullableStringAdapter.toJson(wVar, shopsReviewsUserCard.getAvatarColor());
            wVar.mo68529h("avatar_url");
            this.nullableStringAdapter.toJson(wVar, shopsReviewsUserCard.getAvatarUrl());
            wVar.mo68529h("casual_name_or_login_name");
            this.nullableStringAdapter.toJson(wVar, shopsReviewsUserCard.getCasualNameOrLoginName());
            wVar.mo68529h("is_active");
            this.nullableBooleanAdapter.toJson(wVar, shopsReviewsUserCard.isActive());
            wVar.mo68529h(ResponseConstants.IS_GUEST);
            this.nullableBooleanAdapter.toJson(wVar, shopsReviewsUserCard.isGuest());
            wVar.mo68529h("is_name_withheld");
            this.nullableBooleanAdapter.toJson(wVar, shopsReviewsUserCard.isNameWithheld());
            wVar.mo68529h("login_name");
            this.nullableStringAdapter.toJson(wVar, shopsReviewsUserCard.getLoginName());
            wVar.mo68529h("profile_url");
            this.nullableStringAdapter.toJson(wVar, shopsReviewsUserCard.getProfileUrl());
            wVar.mo68529h(ResponseConstants.REAL_NAME);
            this.nullableStringAdapter.toJson(wVar, shopsReviewsUserCard.getRealNameOrLoginName());
            wVar.mo68529h("user_id");
            this.nullableLongAdapter.toJson(wVar, shopsReviewsUserCard.getUserId());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
