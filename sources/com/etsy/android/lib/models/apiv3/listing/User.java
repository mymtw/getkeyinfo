package com.etsy.android.lib.models.apiv3.listing;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;

@C17403o(generateAdapter = true)
public final class User implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<User> CREATOR = new Creator();
    private final Image avatar;
    private final String avatarUrl;
    private final String bio;
    private final Integer createDate;
    private final String displayName;
    private final Boolean favoriteItemsPublic;
    private final Boolean favoriteShopsPublic;
    private final Boolean favoriteTreasuriesPublic;
    private final String firstName;
    private final Integer followerCount;
    private final Integer followingCount;
    private final String gender;
    private final Boolean hasAvatar;
    private final Boolean hasPage;
    private final Boolean isSeller;
    private final String lastName;
    private final String location;
    private final String loginName;
    private final Integer numFavorites;
    private final String realName;
    private final Integer updateDate;
    private final Long userId;

    public static final class Creator implements Parcelable.Creator<User> {
        public final User createFromParcel(Parcel parcel) {
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            Boolean bool4;
            Boolean bool5;
            Boolean bool6;
            Parcel parcel2 = parcel;
            C19383o.m32797g(parcel2, "parcel");
            Image createFromParcel = parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel2);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString3 = parcel.readString();
            boolean z = true;
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                bool2 = null;
            } else {
                bool2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                bool3 = null;
            } else {
                bool3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString4 = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString5 = parcel.readString();
            if (parcel.readInt() == 0) {
                bool4 = null;
            } else {
                bool4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                bool5 = null;
            } else {
                bool5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                bool6 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z = false;
                }
                bool6 = Boolean.valueOf(z);
            }
            return new User(createFromParcel, readString, readString2, valueOf, readString3, bool, bool2, bool3, readString4, valueOf2, valueOf3, readString5, bool4, bool5, bool6, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        public final User[] newArray(int i) {
            return new User[i];
        }
    }

    public User(@C17402n(name = "avatar") Image image, @C17402n(name = "avatar_url") String str, @C17402n(name = "bio") String str2, @C17402n(name = "create_date") Integer num, @C17402n(name = "display_name") String str3, @C17402n(name = "favorite_items_public") Boolean bool, @C17402n(name = "favorite_shops_public") Boolean bool2, @C17402n(name = "favorite_treasuries_public") Boolean bool3, @C17402n(name = "first_name") String str4, @C17402n(name = "follower_count") Integer num2, @C17402n(name = "following_count") Integer num3, @C17402n(name = "gender") String str5, @C17402n(name = "has_avatar") Boolean bool4, @C17402n(name = "has_page") Boolean bool5, @C17402n(name = "is_seller") Boolean bool6, @C17402n(name = "last_name") String str6, @C17402n(name = "location") String str7, @C17402n(name = "login_name") String str8, @C17402n(name = "num_favorites") Integer num4, @C17402n(name = "real_name") String str9, @C17402n(name = "update_date") Integer num5, @C17402n(name = "user_id") Long l) {
        this.avatar = image;
        this.avatarUrl = str;
        this.bio = str2;
        this.createDate = num;
        this.displayName = str3;
        this.favoriteItemsPublic = bool;
        this.favoriteShopsPublic = bool2;
        this.favoriteTreasuriesPublic = bool3;
        this.firstName = str4;
        this.followerCount = num2;
        this.followingCount = num3;
        this.gender = str5;
        this.hasAvatar = bool4;
        this.hasPage = bool5;
        this.isSeller = bool6;
        this.lastName = str6;
        this.location = str7;
        this.loginName = str8;
        this.numFavorites = num4;
        this.realName = str9;
        this.updateDate = num5;
        this.userId = l;
    }

    public static /* synthetic */ User copy$default(User user, Image image, String str, String str2, Integer num, String str3, Boolean bool, Boolean bool2, Boolean bool3, String str4, Integer num2, Integer num3, String str5, Boolean bool4, Boolean bool5, Boolean bool6, String str6, String str7, String str8, Integer num4, String str9, Integer num5, Long l, int i, Object obj) {
        User user2 = user;
        int i2 = i;
        return user.copy((i2 & 1) != 0 ? user2.avatar : image, (i2 & 2) != 0 ? user2.avatarUrl : str, (i2 & 4) != 0 ? user2.bio : str2, (i2 & 8) != 0 ? user2.createDate : num, (i2 & 16) != 0 ? user2.displayName : str3, (i2 & 32) != 0 ? user2.favoriteItemsPublic : bool, (i2 & 64) != 0 ? user2.favoriteShopsPublic : bool2, (i2 & 128) != 0 ? user2.favoriteTreasuriesPublic : bool3, (i2 & 256) != 0 ? user2.firstName : str4, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? user2.followerCount : num2, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? user2.followingCount : num3, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? user2.gender : str5, (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? user2.hasAvatar : bool4, (i2 & 8192) != 0 ? user2.hasPage : bool5, (i2 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? user2.isSeller : bool6, (i2 & 32768) != 0 ? user2.lastName : str6, (i2 & 65536) != 0 ? user2.location : str7, (i2 & 131072) != 0 ? user2.loginName : str8, (i2 & PrimitiveArrayBuilder.MAX_CHUNK_SIZE) != 0 ? user2.numFavorites : num4, (i2 & 524288) != 0 ? user2.realName : str9, (i2 & 1048576) != 0 ? user2.updateDate : num5, (i2 & 2097152) != 0 ? user2.userId : l);
    }

    public final Image component1() {
        return this.avatar;
    }

    public final Integer component10() {
        return this.followerCount;
    }

    public final Integer component11() {
        return this.followingCount;
    }

    public final String component12() {
        return this.gender;
    }

    public final Boolean component13() {
        return this.hasAvatar;
    }

    public final Boolean component14() {
        return this.hasPage;
    }

    public final Boolean component15() {
        return this.isSeller;
    }

    public final String component16() {
        return this.lastName;
    }

    public final String component17() {
        return this.location;
    }

    public final String component18() {
        return this.loginName;
    }

    public final Integer component19() {
        return this.numFavorites;
    }

    public final String component2() {
        return this.avatarUrl;
    }

    public final String component20() {
        return this.realName;
    }

    public final Integer component21() {
        return this.updateDate;
    }

    public final Long component22() {
        return this.userId;
    }

    public final String component3() {
        return this.bio;
    }

    public final Integer component4() {
        return this.createDate;
    }

    public final String component5() {
        return this.displayName;
    }

    public final Boolean component6() {
        return this.favoriteItemsPublic;
    }

    public final Boolean component7() {
        return this.favoriteShopsPublic;
    }

    public final Boolean component8() {
        return this.favoriteTreasuriesPublic;
    }

    public final String component9() {
        return this.firstName;
    }

    public final User copy(@C17402n(name = "avatar") Image image, @C17402n(name = "avatar_url") String str, @C17402n(name = "bio") String str2, @C17402n(name = "create_date") Integer num, @C17402n(name = "display_name") String str3, @C17402n(name = "favorite_items_public") Boolean bool, @C17402n(name = "favorite_shops_public") Boolean bool2, @C17402n(name = "favorite_treasuries_public") Boolean bool3, @C17402n(name = "first_name") String str4, @C17402n(name = "follower_count") Integer num2, @C17402n(name = "following_count") Integer num3, @C17402n(name = "gender") String str5, @C17402n(name = "has_avatar") Boolean bool4, @C17402n(name = "has_page") Boolean bool5, @C17402n(name = "is_seller") Boolean bool6, @C17402n(name = "last_name") String str6, @C17402n(name = "location") String str7, @C17402n(name = "login_name") String str8, @C17402n(name = "num_favorites") Integer num4, @C17402n(name = "real_name") String str9, @C17402n(name = "update_date") Integer num5, @C17402n(name = "user_id") Long l) {
        return new User(image, str, str2, num, str3, bool, bool2, bool3, str4, num2, num3, str5, bool4, bool5, bool6, str6, str7, str8, num4, str9, num5, l);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        return C19383o.m32792b(this.avatar, user.avatar) && C19383o.m32792b(this.avatarUrl, user.avatarUrl) && C19383o.m32792b(this.bio, user.bio) && C19383o.m32792b(this.createDate, user.createDate) && C19383o.m32792b(this.displayName, user.displayName) && C19383o.m32792b(this.favoriteItemsPublic, user.favoriteItemsPublic) && C19383o.m32792b(this.favoriteShopsPublic, user.favoriteShopsPublic) && C19383o.m32792b(this.favoriteTreasuriesPublic, user.favoriteTreasuriesPublic) && C19383o.m32792b(this.firstName, user.firstName) && C19383o.m32792b(this.followerCount, user.followerCount) && C19383o.m32792b(this.followingCount, user.followingCount) && C19383o.m32792b(this.gender, user.gender) && C19383o.m32792b(this.hasAvatar, user.hasAvatar) && C19383o.m32792b(this.hasPage, user.hasPage) && C19383o.m32792b(this.isSeller, user.isSeller) && C19383o.m32792b(this.lastName, user.lastName) && C19383o.m32792b(this.location, user.location) && C19383o.m32792b(this.loginName, user.loginName) && C19383o.m32792b(this.numFavorites, user.numFavorites) && C19383o.m32792b(this.realName, user.realName) && C19383o.m32792b(this.updateDate, user.updateDate) && C19383o.m32792b(this.userId, user.userId);
    }

    public final Image getAvatar() {
        return this.avatar;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getBio() {
        return this.bio;
    }

    public final Integer getCreateDate() {
        return this.createDate;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final Boolean getFavoriteItemsPublic() {
        return this.favoriteItemsPublic;
    }

    public final Boolean getFavoriteShopsPublic() {
        return this.favoriteShopsPublic;
    }

    public final Boolean getFavoriteTreasuriesPublic() {
        return this.favoriteTreasuriesPublic;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final Integer getFollowerCount() {
        return this.followerCount;
    }

    public final Integer getFollowingCount() {
        return this.followingCount;
    }

    public final String getGender() {
        return this.gender;
    }

    public final Boolean getHasAvatar() {
        return this.hasAvatar;
    }

    public final Boolean getHasPage() {
        return this.hasPage;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getLoginName() {
        return this.loginName;
    }

    public final Integer getNumFavorites() {
        return this.numFavorites;
    }

    public final String getRealName() {
        return this.realName;
    }

    public final Integer getUpdateDate() {
        return this.updateDate;
    }

    public final Long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        Image image = this.avatar;
        int i = 0;
        int hashCode = (image == null ? 0 : image.hashCode()) * 31;
        String str = this.avatarUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bio;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.createDate;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.displayName;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.favoriteItemsPublic;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.favoriteShopsPublic;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.favoriteTreasuriesPublic;
        int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str4 = this.firstName;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.followerCount;
        int hashCode10 = (hashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.followingCount;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str5 = this.gender;
        int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool4 = this.hasAvatar;
        int hashCode13 = (hashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.hasPage;
        int hashCode14 = (hashCode13 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.isSeller;
        int hashCode15 = (hashCode14 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str6 = this.lastName;
        int hashCode16 = (hashCode15 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.location;
        int hashCode17 = (hashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.loginName;
        int hashCode18 = (hashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num4 = this.numFavorites;
        int hashCode19 = (hashCode18 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str9 = this.realName;
        int hashCode20 = (hashCode19 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num5 = this.updateDate;
        int hashCode21 = (hashCode20 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Long l = this.userId;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode21 + i;
    }

    public final Boolean isSeller() {
        return this.isSeller;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("User(avatar=");
        h.append(this.avatar);
        h.append(", avatarUrl=");
        h.append(this.avatarUrl);
        h.append(", bio=");
        h.append(this.bio);
        h.append(", createDate=");
        h.append(this.createDate);
        h.append(", displayName=");
        h.append(this.displayName);
        h.append(", favoriteItemsPublic=");
        h.append(this.favoriteItemsPublic);
        h.append(", favoriteShopsPublic=");
        h.append(this.favoriteShopsPublic);
        h.append(", favoriteTreasuriesPublic=");
        h.append(this.favoriteTreasuriesPublic);
        h.append(", firstName=");
        h.append(this.firstName);
        h.append(", followerCount=");
        h.append(this.followerCount);
        h.append(", followingCount=");
        h.append(this.followingCount);
        h.append(", gender=");
        h.append(this.gender);
        h.append(", hasAvatar=");
        h.append(this.hasAvatar);
        h.append(", hasPage=");
        h.append(this.hasPage);
        h.append(", isSeller=");
        h.append(this.isSeller);
        h.append(", lastName=");
        h.append(this.lastName);
        h.append(", location=");
        h.append(this.location);
        h.append(", loginName=");
        h.append(this.loginName);
        h.append(", numFavorites=");
        h.append(this.numFavorites);
        h.append(", realName=");
        h.append(this.realName);
        h.append(", updateDate=");
        h.append(this.updateDate);
        h.append(", userId=");
        h.append(this.userId);
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        Image image = this.avatar;
        if (image == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image.writeToParcel(parcel, i);
        }
        parcel.writeString(this.avatarUrl);
        parcel.writeString(this.bio);
        Integer num = this.createDate;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            C13983i.m21499r(parcel, 1, num);
        }
        parcel.writeString(this.displayName);
        Boolean bool = this.favoriteItemsPublic;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.favoriteShopsPublic;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.favoriteTreasuriesPublic;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.firstName);
        Integer num2 = this.followerCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            C13983i.m21499r(parcel, 1, num2);
        }
        Integer num3 = this.followingCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            C13983i.m21499r(parcel, 1, num3);
        }
        parcel.writeString(this.gender);
        Boolean bool4 = this.hasAvatar;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Boolean bool5 = this.hasPage;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        Boolean bool6 = this.isSeller;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.lastName);
        parcel.writeString(this.location);
        parcel.writeString(this.loginName);
        Integer num4 = this.numFavorites;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            C13983i.m21499r(parcel, 1, num4);
        }
        parcel.writeString(this.realName);
        Integer num5 = this.updateDate;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            C13983i.m21499r(parcel, 1, num5);
        }
        Long l = this.userId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            C0069a.m180k(parcel, 1, l);
        }
    }
}
