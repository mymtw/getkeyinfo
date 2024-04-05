package com.etsy.android.lib.selfuser;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p504ai.C13983i;

@C17403o(generateAdapter = true)
public final class SelfUserShop {

    /* renamed from: a */
    public final long f19514a;

    /* renamed from: b */
    public final String f19515b;

    /* renamed from: c */
    public final String f19516c;

    /* renamed from: d */
    public final Integer f19517d;

    /* renamed from: e */
    public final String f19518e;

    /* renamed from: f */
    public final String f19519f;

    /* renamed from: g */
    public final String f19520g;

    /* renamed from: h */
    public final Boolean f19521h;

    /* renamed from: i */
    public final List<String> f19522i;

    /* renamed from: j */
    public final Double f19523j;

    /* renamed from: k */
    public final Integer f19524k;

    /* renamed from: l */
    public final List<SelfUserListingDetails> f19525l;

    /* renamed from: m */
    public final List<SelfUserListingDetails> f19526m;

    public SelfUserShop(@C17402n(name = "shop_id") long j, @C17402n(name = "shop_name") String str, @C17402n(name = "status") String str2, @C17402n(name = "listing_active_count") Integer num, @C17402n(name = "icon_url_fullxfull") String str3, @C17402n(name = "image_url_760x100") String str4, @C17402n(name = "currency_code") String str5, @C17402n(name = "is_vacation") Boolean bool, @C17402n(name = "languages") List<String> list, @C17402n(name = "average_rating") Double d, @C17402n(name = "total_rating_count") Integer num2, @C17402n(name = "displayed_featured_listings") List<SelfUserListingDetails> list2, @C17402n(name = "listings") List<SelfUserListingDetails> list3) {
        C19383o.m32797g(str2, ResponseConstants.STATUS);
        C19383o.m32797g(list, ResponseConstants.LANGUAGES);
        this.f19514a = j;
        this.f19515b = str;
        this.f19516c = str2;
        this.f19517d = num;
        this.f19518e = str3;
        this.f19519f = str4;
        this.f19520g = str5;
        this.f19521h = bool;
        this.f19522i = list;
        this.f19523j = d;
        this.f19524k = num2;
        this.f19525l = list2;
        this.f19526m = list3;
    }

    public final SelfUserShop copy(@C17402n(name = "shop_id") long j, @C17402n(name = "shop_name") String str, @C17402n(name = "status") String str2, @C17402n(name = "listing_active_count") Integer num, @C17402n(name = "icon_url_fullxfull") String str3, @C17402n(name = "image_url_760x100") String str4, @C17402n(name = "currency_code") String str5, @C17402n(name = "is_vacation") Boolean bool, @C17402n(name = "languages") List<String> list, @C17402n(name = "average_rating") Double d, @C17402n(name = "total_rating_count") Integer num2, @C17402n(name = "displayed_featured_listings") List<SelfUserListingDetails> list2, @C17402n(name = "listings") List<SelfUserListingDetails> list3) {
        String str6 = str2;
        C19383o.m32797g(str6, ResponseConstants.STATUS);
        List<String> list4 = list;
        C19383o.m32797g(list4, ResponseConstants.LANGUAGES);
        return new SelfUserShop(j, str, str6, num, str3, str4, str5, bool, list4, d, num2, list2, list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelfUserShop)) {
            return false;
        }
        SelfUserShop selfUserShop = (SelfUserShop) obj;
        return this.f19514a == selfUserShop.f19514a && C19383o.m32792b(this.f19515b, selfUserShop.f19515b) && C19383o.m32792b(this.f19516c, selfUserShop.f19516c) && C19383o.m32792b(this.f19517d, selfUserShop.f19517d) && C19383o.m32792b(this.f19518e, selfUserShop.f19518e) && C19383o.m32792b(this.f19519f, selfUserShop.f19519f) && C19383o.m32792b(this.f19520g, selfUserShop.f19520g) && C19383o.m32792b(this.f19521h, selfUserShop.f19521h) && C19383o.m32792b(this.f19522i, selfUserShop.f19522i) && C19383o.m32792b(this.f19523j, selfUserShop.f19523j) && C19383o.m32792b(this.f19524k, selfUserShop.f19524k) && C19383o.m32792b(this.f19525l, selfUserShop.f19525l) && C19383o.m32792b(this.f19526m, selfUserShop.f19526m);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f19514a) * 31;
        String str = this.f19515b;
        int i = 0;
        int e = C0023f.m105e(this.f19516c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        Integer num = this.f19517d;
        int hashCode2 = (e + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f19518e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19519f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f19520g;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.f19521h;
        int g = C13983i.m21488g(this.f19522i, (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31, 31);
        Double d = this.f19523j;
        int hashCode6 = (g + (d == null ? 0 : d.hashCode())) * 31;
        Integer num2 = this.f19524k;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<SelfUserListingDetails> list = this.f19525l;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List<SelfUserListingDetails> list2 = this.f19526m;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SelfUserShop(shopId=");
        h.append(this.f19514a);
        h.append(", name=");
        h.append(this.f19515b);
        h.append(", status=");
        h.append(this.f19516c);
        h.append(", listingActiveCount=");
        h.append(this.f19517d);
        h.append(", iconUrl=");
        h.append(this.f19518e);
        h.append(", imageUrl=");
        h.append(this.f19519f);
        h.append(", currencyCode=");
        h.append(this.f19520g);
        h.append(", isVacation=");
        h.append(this.f19521h);
        h.append(", languages=");
        h.append(this.f19522i);
        h.append(", averageRating=");
        h.append(this.f19523j);
        h.append(", totalRatingCount=");
        h.append(this.f19524k);
        h.append(", displayedFeaturedListings=");
        h.append(this.f19525l);
        h.append(", listings=");
        return C0070b.m186i(h, this.f19526m, ')');
    }
}
