package com.etsy.android.feedback;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.listing.Reviews;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.feedback.g */
public final class C6462g {

    /* renamed from: a */
    public final Reviews.ReviewType f14329a;

    /* renamed from: b */
    public final Long f14330b;

    /* renamed from: c */
    public final String f14331c;

    /* renamed from: d */
    public final String f14332d;

    /* renamed from: e */
    public final String f14333e;

    /* renamed from: f */
    public final Long f14334f;

    /* renamed from: g */
    public final String f14335g;

    /* renamed from: h */
    public final String f14336h;

    /* renamed from: i */
    public final String f14337i;

    /* renamed from: j */
    public final Integer f14338j;

    public C6462g(Reviews.ReviewType reviewType, Long l, String str, String str2, String str3, Long l2, String str4, String str5, String str6, Integer num) {
        C19383o.m32797g(reviewType, "reviewType");
        C19383o.m32797g(str3, "shopId");
        this.f14329a = reviewType;
        this.f14330b = l;
        this.f14331c = str;
        this.f14332d = str2;
        this.f14333e = str3;
        this.f14334f = l2;
        this.f14335g = str4;
        this.f14336h = str5;
        this.f14337i = str6;
        this.f14338j = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6462g)) {
            return false;
        }
        C6462g gVar = (C6462g) obj;
        return this.f14329a == gVar.f14329a && C19383o.m32792b(this.f14330b, gVar.f14330b) && C19383o.m32792b(this.f14331c, gVar.f14331c) && C19383o.m32792b(this.f14332d, gVar.f14332d) && C19383o.m32792b(this.f14333e, gVar.f14333e) && C19383o.m32792b(this.f14334f, gVar.f14334f) && C19383o.m32792b(this.f14335g, gVar.f14335g) && C19383o.m32792b(this.f14336h, gVar.f14336h) && C19383o.m32792b(this.f14337i, gVar.f14337i) && C19383o.m32792b(this.f14338j, gVar.f14338j);
    }

    public final int hashCode() {
        int hashCode = this.f14329a.hashCode() * 31;
        Long l = this.f14330b;
        int i = 0;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.f14331c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f14332d;
        int e = C0023f.m105e(this.f14333e, (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Long l2 = this.f14334f;
        int hashCode4 = (e + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.f14335g;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f14336h;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f14337i;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f14338j;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode7 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("FeedbackViewModelData(reviewType=");
        h.append(this.f14329a);
        h.append(", listingId=");
        h.append(this.f14330b);
        h.append(", listingTitle=");
        h.append(this.f14331c);
        h.append(", listingUrl=");
        h.append(this.f14332d);
        h.append(", shopId=");
        h.append(this.f14333e);
        h.append(", shopOwnerId=");
        h.append(this.f14334f);
        h.append(", shopName=");
        h.append(this.f14335g);
        h.append(", shopLoginName=");
        h.append(this.f14336h);
        h.append(", shopDisplayName=");
        h.append(this.f14337i);
        h.append(", listingReviewsCount=");
        return C0023f.m109j(h, this.f14338j, ')');
    }
}
