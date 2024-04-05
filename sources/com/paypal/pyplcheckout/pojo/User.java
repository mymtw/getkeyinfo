package com.paypal.pyplcheckout.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class User {
    @C18417a("additionalProperties")
    private final Map<String, Object> additionalProperties;
    @C18417a("addresses")
    private final List<UserAddress> addresses;
    @C18417a("email")
    private final Email email;
    @C18417a("locale")
    private final Locale locale;
    @C18417a("name")
    private final Name name;
    @C18417a("profileImage")
    private ProfileImage profileImage;
    @C18417a("userId")
    private final String userId;

    public User(String str, Name name2, List<UserAddress> list, Locale locale2, Email email2, ProfileImage profileImage2, Map<String, Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        this.userId = str;
        this.name = name2;
        this.addresses = list;
        this.locale = locale2;
        this.email = email2;
        this.profileImage = profileImage2;
        this.additionalProperties = map;
    }

    public static /* synthetic */ User copy$default(User user, String str, Name name2, List<UserAddress> list, Locale locale2, Email email2, ProfileImage profileImage2, Map<String, Object> map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = user.userId;
        }
        if ((i & 2) != 0) {
            name2 = user.name;
        }
        Name name3 = name2;
        if ((i & 4) != 0) {
            list = user.addresses;
        }
        List<UserAddress> list2 = list;
        if ((i & 8) != 0) {
            locale2 = user.locale;
        }
        Locale locale3 = locale2;
        if ((i & 16) != 0) {
            email2 = user.email;
        }
        Email email3 = email2;
        if ((i & 32) != 0) {
            profileImage2 = user.profileImage;
        }
        ProfileImage profileImage3 = profileImage2;
        if ((i & 64) != 0) {
            map = user.additionalProperties;
        }
        return user.copy(str, name3, list2, locale3, email3, profileImage3, map);
    }

    public final String component1() {
        return this.userId;
    }

    public final Name component2() {
        return this.name;
    }

    public final List<UserAddress> component3() {
        return this.addresses;
    }

    public final Locale component4() {
        return this.locale;
    }

    public final Email component5() {
        return this.email;
    }

    public final ProfileImage component6() {
        return this.profileImage;
    }

    public final Map<String, Object> component7() {
        return this.additionalProperties;
    }

    public final User copy(String str, Name name2, List<UserAddress> list, Locale locale2, Email email2, ProfileImage profileImage2, Map<String, Object> map) {
        Map<String, Object> map2 = map;
        C19383o.m32797g(map2, "additionalProperties");
        return new User(str, name2, list, locale2, email2, profileImage2, map2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        return C19383o.m32792b(this.userId, user.userId) && C19383o.m32792b(this.name, user.name) && C19383o.m32792b(this.addresses, user.addresses) && C19383o.m32792b(this.locale, user.locale) && C19383o.m32792b(this.email, user.email) && C19383o.m32792b(this.profileImage, user.profileImage) && C19383o.m32792b(this.additionalProperties, user.additionalProperties);
    }

    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final List<UserAddress> getAddresses() {
        return this.addresses;
    }

    public final String getCountry() {
        Locale locale2 = this.locale;
        String country = locale2 == null ? null : locale2.getCountry();
        return country == null ? "" : country;
    }

    public final Email getEmail() {
        return this.email;
    }

    public final String getEmailAddress() {
        Email email2 = this.email;
        if (email2 == null) {
            return null;
        }
        return email2.getStringValue();
    }

    public final String getFirstName() {
        Name name2 = this.name;
        String givenName = name2 == null ? null : name2.getGivenName();
        return givenName == null ? "" : givenName;
    }

    public final String getLanguage() {
        Locale locale2 = this.locale;
        if (locale2 == null) {
            return null;
        }
        return locale2.getLanguage();
    }

    public final String getLastName() {
        Name name2 = this.name;
        String familyName = name2 == null ? null : name2.getFamilyName();
        return familyName == null ? "" : familyName;
    }

    public final Locale getLocale() {
        return this.locale;
    }

    public final Name getName() {
        return this.name;
    }

    public final ProfileImage getProfileImage() {
        return this.profileImage;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserInitials() {
        StringBuilder sb = new StringBuilder();
        String firstName = getFirstName();
        String lastName = getLastName();
        boolean z = true;
        if (firstName.length() > 0) {
            sb.append(firstName.charAt(0));
        }
        if (lastName.length() <= 0) {
            z = false;
        }
        if (z) {
            sb.append(lastName.charAt(0));
        }
        String sb2 = sb.toString();
        C19383o.m32796f(sb2, "initialName.toString()");
        String upperCase = sb2.toUpperCase(Locale.ROOT);
        C19383o.m32796f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    public final String getUserLocale() {
        Locale locale2 = this.locale;
        if (locale2 == null) {
            return null;
        }
        return locale2.getLocale();
    }

    public final String getUserPhotoUri() {
        Url url;
        ProfileImage profileImage2 = this.profileImage;
        if (profileImage2 == null || (url = profileImage2.getUrl()) == null) {
            return null;
        }
        return url.getHref();
    }

    public int hashCode() {
        String str = this.userId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Name name2 = this.name;
        int hashCode2 = (hashCode + (name2 == null ? 0 : name2.hashCode())) * 31;
        List<UserAddress> list = this.addresses;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Locale locale2 = this.locale;
        int hashCode4 = (hashCode3 + (locale2 == null ? 0 : locale2.hashCode())) * 31;
        Email email2 = this.email;
        int hashCode5 = (hashCode4 + (email2 == null ? 0 : email2.hashCode())) * 31;
        ProfileImage profileImage2 = this.profileImage;
        if (profileImage2 != null) {
            i = profileImage2.hashCode();
        }
        return this.additionalProperties.hashCode() + ((hashCode5 + i) * 31);
    }

    public final void setProfileImage(ProfileImage profileImage2) {
        this.profileImage = profileImage2;
    }

    public String toString() {
        String str = this.userId;
        Name name2 = this.name;
        List<UserAddress> list = this.addresses;
        Locale locale2 = this.locale;
        Email email2 = this.email;
        ProfileImage profileImage2 = this.profileImage;
        Map<String, Object> map = this.additionalProperties;
        return "User(userId=" + str + ", name=" + name2 + ", addresses=" + list + ", locale=" + locale2 + ", email=" + email2 + ", profileImage=" + profileImage2 + ", additionalProperties=" + map + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ User(String str, Name name2, List list, Locale locale2, Email email2, ProfileImage profileImage2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, name2, list, locale2, email2, profileImage2, (i & 64) != 0 ? new HashMap() : map);
    }
}
