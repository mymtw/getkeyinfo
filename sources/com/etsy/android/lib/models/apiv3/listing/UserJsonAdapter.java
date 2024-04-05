package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class UserJsonAdapter extends JsonAdapter<User> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Image> nullableImageAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.AVATAR, "avatar_url", ResponseConstants.BIO, ResponseConstants.CREATE_DATE, ResponseConstants.DISPLAY_NAME, "favorite_items_public", "favorite_shops_public", "favorite_treasuries_public", ResponseConstants.FIRST_NAME, ResponseConstants.FOLLOWER_COUNT, ResponseConstants.FOLLOWING_COUNT, "gender", "has_avatar", "has_page", ResponseConstants.IS_SELLER, "last_name", "location", "login_name", "num_favorites", ResponseConstants.GUEST_REAL_NAME, ResponseConstants.UPDATE_DATE, "user_id");

    public UserJsonAdapter(C17414y yVar) {
        C17414y yVar2 = yVar;
        C19383o.m32797g(yVar2, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableImageAdapter = yVar2.mo68558c(Image.class, emptySet, ResponseConstants.AVATAR);
        this.nullableStringAdapter = yVar2.mo68558c(String.class, emptySet, "avatarUrl");
        this.nullableIntAdapter = yVar2.mo68558c(Integer.class, emptySet, "createDate");
        this.nullableBooleanAdapter = yVar2.mo68558c(Boolean.class, emptySet, "favoriteItemsPublic");
        this.nullableLongAdapter = yVar2.mo68558c(Long.class, emptySet, "userId");
    }

    public String toString() {
        return "GeneratedJsonAdapter(User)";
    }

    public User fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        Image image = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        String str3 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        String str4 = null;
        Integer num2 = null;
        Integer num3 = null;
        String str5 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        Integer num4 = null;
        String str9 = null;
        Integer num5 = null;
        Long l = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    image = this.nullableImageAdapter.fromJson(jsonReader2);
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 3:
                    num = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 5:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 6:
                    bool2 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 7:
                    bool3 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 8:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 9:
                    num2 = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 10:
                    num3 = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 11:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 12:
                    bool4 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 13:
                    bool5 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 14:
                    bool6 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 15:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 16:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 17:
                    str8 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 18:
                    num4 = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 19:
                    str9 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 20:
                    num5 = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 21:
                    l = this.nullableLongAdapter.fromJson(jsonReader2);
                    break;
            }
        }
        jsonReader.mo68413e();
        return new User(image, str, str2, num, str3, bool, bool2, bool3, str4, num2, num3, str5, bool4, bool5, bool6, str6, str7, str8, num4, str9, num5, l);
    }

    public void toJson(C17412w wVar, User user) {
        C19383o.m32797g(wVar, "writer");
        if (user != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.AVATAR);
            this.nullableImageAdapter.toJson(wVar, user.getAvatar());
            wVar.mo68529h("avatar_url");
            this.nullableStringAdapter.toJson(wVar, user.getAvatarUrl());
            wVar.mo68529h(ResponseConstants.BIO);
            this.nullableStringAdapter.toJson(wVar, user.getBio());
            wVar.mo68529h(ResponseConstants.CREATE_DATE);
            this.nullableIntAdapter.toJson(wVar, user.getCreateDate());
            wVar.mo68529h(ResponseConstants.DISPLAY_NAME);
            this.nullableStringAdapter.toJson(wVar, user.getDisplayName());
            wVar.mo68529h("favorite_items_public");
            this.nullableBooleanAdapter.toJson(wVar, user.getFavoriteItemsPublic());
            wVar.mo68529h("favorite_shops_public");
            this.nullableBooleanAdapter.toJson(wVar, user.getFavoriteShopsPublic());
            wVar.mo68529h("favorite_treasuries_public");
            this.nullableBooleanAdapter.toJson(wVar, user.getFavoriteTreasuriesPublic());
            wVar.mo68529h(ResponseConstants.FIRST_NAME);
            this.nullableStringAdapter.toJson(wVar, user.getFirstName());
            wVar.mo68529h(ResponseConstants.FOLLOWER_COUNT);
            this.nullableIntAdapter.toJson(wVar, user.getFollowerCount());
            wVar.mo68529h(ResponseConstants.FOLLOWING_COUNT);
            this.nullableIntAdapter.toJson(wVar, user.getFollowingCount());
            wVar.mo68529h("gender");
            this.nullableStringAdapter.toJson(wVar, user.getGender());
            wVar.mo68529h("has_avatar");
            this.nullableBooleanAdapter.toJson(wVar, user.getHasAvatar());
            wVar.mo68529h("has_page");
            this.nullableBooleanAdapter.toJson(wVar, user.getHasPage());
            wVar.mo68529h(ResponseConstants.IS_SELLER);
            this.nullableBooleanAdapter.toJson(wVar, user.isSeller());
            wVar.mo68529h("last_name");
            this.nullableStringAdapter.toJson(wVar, user.getLastName());
            wVar.mo68529h("location");
            this.nullableStringAdapter.toJson(wVar, user.getLocation());
            wVar.mo68529h("login_name");
            this.nullableStringAdapter.toJson(wVar, user.getLoginName());
            wVar.mo68529h("num_favorites");
            this.nullableIntAdapter.toJson(wVar, user.getNumFavorites());
            wVar.mo68529h(ResponseConstants.GUEST_REAL_NAME);
            this.nullableStringAdapter.toJson(wVar, user.getRealName());
            wVar.mo68529h(ResponseConstants.UPDATE_DATE);
            this.nullableIntAdapter.toJson(wVar, user.getUpdateDate());
            wVar.mo68529h("user_id");
            this.nullableLongAdapter.toJson(wVar, user.getUserId());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
