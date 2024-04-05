package com.etsy.android.lib.selfuser;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class SelfUser {

    /* renamed from: a */
    public final long f19477a;

    /* renamed from: b */
    public final String f19478b;

    /* renamed from: c */
    public final Integer f19479c;

    /* renamed from: d */
    public final Integer f19480d;

    /* renamed from: e */
    public final String f19481e;

    /* renamed from: f */
    public final Integer f19482f;

    /* renamed from: g */
    public final SelfUserProfile f19483g;

    /* renamed from: h */
    public final List<SelfUserShop> f19484h;

    /* renamed from: i */
    public final List<SelfUserAddress> f19485i;

    /* renamed from: j */
    public final List<SelfUserListing> f19486j;

    public SelfUser(@C17402n(name = "user_id") long j, @C17402n(name = "login_name") String str, @C17402n(name = "follower_count") Integer num, @C17402n(name = "following_count") Integer num2, @C17402n(name = "primary_email") String str2, @C17402n(name = "awaiting_feedback_count") Integer num3, @C17402n(name = "profile") SelfUserProfile selfUserProfile, @C17402n(name = "shops") List<SelfUserShop> list, @C17402n(name = "addresses") List<SelfUserAddress> list2, @C17402n(name = "favorite_listings") List<SelfUserListing> list3) {
        C19383o.m32797g(str, "loginName");
        C19383o.m32797g(str2, "primaryEmail");
        this.f19477a = j;
        this.f19478b = str;
        this.f19479c = num;
        this.f19480d = num2;
        this.f19481e = str2;
        this.f19482f = num3;
        this.f19483g = selfUserProfile;
        this.f19484h = list;
        this.f19485i = list2;
        this.f19486j = list3;
    }

    public final SelfUser copy(@C17402n(name = "user_id") long j, @C17402n(name = "login_name") String str, @C17402n(name = "follower_count") Integer num, @C17402n(name = "following_count") Integer num2, @C17402n(name = "primary_email") String str2, @C17402n(name = "awaiting_feedback_count") Integer num3, @C17402n(name = "profile") SelfUserProfile selfUserProfile, @C17402n(name = "shops") List<SelfUserShop> list, @C17402n(name = "addresses") List<SelfUserAddress> list2, @C17402n(name = "favorite_listings") List<SelfUserListing> list3) {
        String str3 = str;
        C19383o.m32797g(str3, "loginName");
        String str4 = str2;
        C19383o.m32797g(str4, "primaryEmail");
        return new SelfUser(j, str3, num, num2, str4, num3, selfUserProfile, list, list2, list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelfUser)) {
            return false;
        }
        SelfUser selfUser = (SelfUser) obj;
        return this.f19477a == selfUser.f19477a && C19383o.m32792b(this.f19478b, selfUser.f19478b) && C19383o.m32792b(this.f19479c, selfUser.f19479c) && C19383o.m32792b(this.f19480d, selfUser.f19480d) && C19383o.m32792b(this.f19481e, selfUser.f19481e) && C19383o.m32792b(this.f19482f, selfUser.f19482f) && C19383o.m32792b(this.f19483g, selfUser.f19483g) && C19383o.m32792b(this.f19484h, selfUser.f19484h) && C19383o.m32792b(this.f19485i, selfUser.f19485i) && C19383o.m32792b(this.f19486j, selfUser.f19486j);
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f19478b, Long.hashCode(this.f19477a) * 31, 31);
        Integer num = this.f19479c;
        int i = 0;
        int hashCode = (e + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f19480d;
        int e2 = C0023f.m105e(this.f19481e, (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31);
        Integer num3 = this.f19482f;
        int hashCode2 = (e2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        SelfUserProfile selfUserProfile = this.f19483g;
        int hashCode3 = (hashCode2 + (selfUserProfile == null ? 0 : selfUserProfile.hashCode())) * 31;
        List<SelfUserShop> list = this.f19484h;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<SelfUserAddress> list2 = this.f19485i;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<SelfUserListing> list3 = this.f19486j;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SelfUser(userId=");
        h.append(this.f19477a);
        h.append(", loginName=");
        h.append(this.f19478b);
        h.append(", followerCount=");
        h.append(this.f19479c);
        h.append(", followingCount=");
        h.append(this.f19480d);
        h.append(", primaryEmail=");
        h.append(this.f19481e);
        h.append(", awaitingFeedbackCount=");
        h.append(this.f19482f);
        h.append(", profile=");
        h.append(this.f19483g);
        h.append(", shops=");
        h.append(this.f19484h);
        h.append(", addresses=");
        h.append(this.f19485i);
        h.append(", favoriteListings=");
        return C0070b.m186i(h, this.f19486j, ')');
    }
}
