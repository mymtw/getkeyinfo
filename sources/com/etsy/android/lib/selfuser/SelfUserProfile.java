package com.etsy.android.lib.selfuser;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class SelfUserProfile {

    /* renamed from: a */
    public final String f19498a;

    /* renamed from: b */
    public final String f19499b;

    /* renamed from: c */
    public final String f19500c;

    /* renamed from: d */
    public final String f19501d;

    /* renamed from: e */
    public final String f19502e;

    /* renamed from: f */
    public final String f19503f;

    /* renamed from: g */
    public final String f19504g;

    /* renamed from: h */
    public final SelfUserProfileCountry f19505h;

    /* renamed from: i */
    public final Integer f19506i;

    /* renamed from: j */
    public final String f19507j;

    /* renamed from: k */
    public final Boolean f19508k;

    /* renamed from: l */
    public final Boolean f19509l;

    public SelfUserProfile(@C17402n(name = "image_url_75x75") String str, @C17402n(name = "city") String str2, @C17402n(name = "region") String str3, @C17402n(name = "bio") String str4, @C17402n(name = "first_name") String str5, @C17402n(name = "last_name") String str6, @C17402n(name = "login_name") String str7, @C17402n(name = "country") SelfUserProfileCountry selfUserProfileCountry, @C17402n(name = "num_favorites") Integer num, @C17402n(name = "display_name") String str8, @C17402n(name = "is_favoritelistings_private") Boolean bool, @C17402n(name = "is_favoritetreasuries_private") Boolean bool2) {
        C19383o.m32797g(str7, "loginName");
        this.f19498a = str;
        this.f19499b = str2;
        this.f19500c = str3;
        this.f19501d = str4;
        this.f19502e = str5;
        this.f19503f = str6;
        this.f19504g = str7;
        this.f19505h = selfUserProfileCountry;
        this.f19506i = num;
        this.f19507j = str8;
        this.f19508k = bool;
        this.f19509l = bool2;
    }

    public final SelfUserProfile copy(@C17402n(name = "image_url_75x75") String str, @C17402n(name = "city") String str2, @C17402n(name = "region") String str3, @C17402n(name = "bio") String str4, @C17402n(name = "first_name") String str5, @C17402n(name = "last_name") String str6, @C17402n(name = "login_name") String str7, @C17402n(name = "country") SelfUserProfileCountry selfUserProfileCountry, @C17402n(name = "num_favorites") Integer num, @C17402n(name = "display_name") String str8, @C17402n(name = "is_favoritelistings_private") Boolean bool, @C17402n(name = "is_favoritetreasuries_private") Boolean bool2) {
        String str9 = str7;
        C19383o.m32797g(str9, "loginName");
        return new SelfUserProfile(str, str2, str3, str4, str5, str6, str9, selfUserProfileCountry, num, str8, bool, bool2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelfUserProfile)) {
            return false;
        }
        SelfUserProfile selfUserProfile = (SelfUserProfile) obj;
        return C19383o.m32792b(this.f19498a, selfUserProfile.f19498a) && C19383o.m32792b(this.f19499b, selfUserProfile.f19499b) && C19383o.m32792b(this.f19500c, selfUserProfile.f19500c) && C19383o.m32792b(this.f19501d, selfUserProfile.f19501d) && C19383o.m32792b(this.f19502e, selfUserProfile.f19502e) && C19383o.m32792b(this.f19503f, selfUserProfile.f19503f) && C19383o.m32792b(this.f19504g, selfUserProfile.f19504g) && C19383o.m32792b(this.f19505h, selfUserProfile.f19505h) && C19383o.m32792b(this.f19506i, selfUserProfile.f19506i) && C19383o.m32792b(this.f19507j, selfUserProfile.f19507j) && C19383o.m32792b(this.f19508k, selfUserProfile.f19508k) && C19383o.m32792b(this.f19509l, selfUserProfile.f19509l);
    }

    public final int hashCode() {
        String str = this.f19498a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f19499b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19500c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f19501d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f19502e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f19503f;
        int e = C0023f.m105e(this.f19504g, (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31);
        SelfUserProfileCountry selfUserProfileCountry = this.f19505h;
        int hashCode6 = (e + (selfUserProfileCountry == null ? 0 : selfUserProfileCountry.hashCode())) * 31;
        Integer num = this.f19506i;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.f19507j;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.f19508k;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f19509l;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode9 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SelfUserProfile(imageUrl75x75=");
        h.append(this.f19498a);
        h.append(", city=");
        h.append(this.f19499b);
        h.append(", region=");
        h.append(this.f19500c);
        h.append(", bio=");
        h.append(this.f19501d);
        h.append(", firstName=");
        h.append(this.f19502e);
        h.append(", lastName=");
        h.append(this.f19503f);
        h.append(", loginName=");
        h.append(this.f19504g);
        h.append(", country=");
        h.append(this.f19505h);
        h.append(", numFavorites=");
        h.append(this.f19506i);
        h.append(", displayName=");
        h.append(this.f19507j);
        h.append(", isFavoriteListingsPrivate=");
        h.append(this.f19508k);
        h.append(", isFavoriteTreasuriesPrivate=");
        h.append(this.f19509l);
        h.append(')');
        return h.toString();
    }
}
