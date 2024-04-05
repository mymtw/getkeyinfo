package com.etsy.android.p327ui.listing.p329ui.sellerinfo;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import android.text.Spanned;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.sellerinfo.favoriting.C10639c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.listing.ui.sellerinfo.b */
public final class C10635b extends C10423j {

    /* renamed from: a */
    public final String f23349a;

    /* renamed from: b */
    public final String f23350b;

    /* renamed from: c */
    public final String f23351c;

    /* renamed from: d */
    public final long f23352d;

    /* renamed from: e */
    public final boolean f23353e;

    /* renamed from: f */
    public final long f23354f;

    /* renamed from: g */
    public final String f23355g;

    /* renamed from: h */
    public final String f23356h;

    /* renamed from: i */
    public final String f23357i;

    /* renamed from: j */
    public final C10639c f23358j;

    /* renamed from: k */
    public final Spanned f23359k;

    /* renamed from: com.etsy.android.ui.listing.ui.sellerinfo.b$a */
    public static final class C10636a {
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00d3  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00d6  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x012b  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0136  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x013d  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x0142  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x014c  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x0151  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x0154  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x0156  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.etsy.android.p327ui.listing.p329ui.sellerinfo.C10635b m18562a(com.etsy.android.p327ui.util.C11786n r23, com.etsy.android.lib.models.apiv3.listing.ListingFetch r24, com.etsy.android.lib.models.datatypes.EtsyId r25) {
            /*
                r0 = r23
                java.lang.String r1 = "resourceProvider"
                kotlin.jvm.internal.C19383o.m32797g(r0, r1)
                com.etsy.android.lib.models.apiv3.listing.Shop r1 = r24.getShop()
                com.etsy.android.lib.models.apiv3.listing.User r2 = r24.getSeller()
                r3 = 0
                if (r1 == 0) goto L_0x0174
                if (r2 != 0) goto L_0x0016
                goto L_0x0174
            L_0x0016:
                com.etsy.android.lib.models.apiv3.listing.Listing r4 = r24.getListing()
                long r12 = r4.getListingId()
                java.lang.String r4 = r2.getRealName()
                boolean r4 = p628nj.C18263b.m30839d0(r4)
                if (r4 == 0) goto L_0x002d
                java.lang.String r4 = r2.getRealName()
                goto L_0x0031
            L_0x002d:
                java.lang.String r4 = r2.getDisplayName()
            L_0x0031:
                r5 = 2131166379(0x7f0704ab, float:1.7947002E38)
                int r5 = r0.mo38057a(r5)
                com.etsy.android.lib.models.apiv3.listing.Image r2 = r2.getAvatar()
                if (r2 == 0) goto L_0x0043
                java.lang.String r2 = com.etsy.android.lib.models.apiv3.listing.extensions.ImageExtensionsKt.pickBestImageSource(r2, r5, r5)
                goto L_0x0044
            L_0x0043:
                r2 = r3
            L_0x0044:
                java.lang.String r6 = ""
                if (r2 != 0) goto L_0x0049
                r2 = r6
            L_0x0049:
                com.etsy.android.lib.models.apiv3.listing.ShopIcon r7 = r1.getIcon()
                if (r7 == 0) goto L_0x0054
                java.lang.String r5 = com.etsy.android.lib.models.apiv3.listing.ShopIconKt.urlForSize(r7, r5, r5)
                goto L_0x0055
            L_0x0054:
                r5 = r3
            L_0x0055:
                if (r5 != 0) goto L_0x0058
                r5 = r6
            L_0x0058:
                boolean r7 = p628nj.C18263b.m30839d0(r2)
                if (r7 == 0) goto L_0x0060
                r8 = r2
                goto L_0x0061
            L_0x0060:
                r8 = r5
            L_0x0061:
                com.etsy.android.lib.models.apiv3.listing.Listing r2 = r24.getListing()
                long r9 = r2.getUserId()
                long r14 = r25.getIdAsLongDeprecated()
                int r2 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
                r5 = 0
                r7 = 1
                if (r2 != 0) goto L_0x0075
                r2 = r7
                goto L_0x0076
            L_0x0075:
                r2 = r5
            L_0x0076:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = r1.getShopName()
                r9.append(r10)
                r10 = 32
                r9.append(r10)
                java.lang.String r10 = r24.getTitle()
                java.lang.String r10 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r10)
                if (r10 != 0) goto L_0x0092
                r10 = r6
            L_0x0092:
                r9.append(r10)
                java.lang.String r15 = r9.toString()
                r9 = 2131952449(0x7f130341, float:1.9541341E38)
                java.lang.Object[] r10 = new java.lang.Object[r7]
                com.etsy.android.lib.models.apiv3.listing.Listing r11 = r24.getListing()
                java.lang.String r11 = r11.getUrl()
                if (r11 != 0) goto L_0x00a9
                r11 = r6
            L_0x00a9:
                r10[r5] = r11
                java.lang.String r16 = r0.mo38059c(r9, r10)
                com.etsy.android.lib.models.apiv3.listing.Shop r0 = r24.getShop()
                if (r0 == 0) goto L_0x00d0
                com.etsy.android.lib.models.apiv3.listing.User r0 = r0.getOwner()
                if (r0 == 0) goto L_0x00d0
                java.lang.Long r0 = r0.getUserId()
                long r9 = r25.getIdAsLongDeprecated()
                if (r0 != 0) goto L_0x00c6
                goto L_0x00d0
            L_0x00c6:
                long r17 = r0.longValue()
                int r0 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
                if (r0 != 0) goto L_0x00d0
                r0 = r7
                goto L_0x00d1
            L_0x00d0:
                r0 = r5
            L_0x00d1:
                if (r0 == 0) goto L_0x00d6
                r17 = r3
                goto L_0x0129
            L_0x00d6:
                long r9 = r25.getIdAsLongDeprecated()
                com.etsy.android.lib.models.apiv3.listing.Shop r0 = r24.getShop()
                if (r0 == 0) goto L_0x00eb
                com.etsy.android.lib.models.apiv3.listing.User r0 = r0.getOwner()
                if (r0 == 0) goto L_0x00eb
                java.lang.Long r0 = r0.getUserId()
                goto L_0x00ec
            L_0x00eb:
                r0 = r3
            L_0x00ec:
                com.etsy.android.lib.models.apiv3.listing.Shop r11 = r24.getShop()
                if (r11 == 0) goto L_0x00f9
                java.lang.String r11 = r11.getShopName()
                r21 = r11
                goto L_0x00fb
            L_0x00f9:
                r21 = r3
            L_0x00fb:
                if (r0 != 0) goto L_0x00fe
                goto L_0x0107
            L_0x00fe:
                long r17 = r0.longValue()
                int r9 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
                if (r9 != 0) goto L_0x0107
                goto L_0x0126
            L_0x0107:
                if (r0 == 0) goto L_0x0126
                if (r21 != 0) goto L_0x010c
                goto L_0x0126
            L_0x010c:
                com.etsy.android.ui.listing.ui.sellerinfo.favoriting.c r9 = new com.etsy.android.ui.listing.ui.sellerinfo.favoriting.c
                java.lang.Boolean r10 = r24.isShopFavorited()
                if (r10 == 0) goto L_0x0118
                boolean r5 = r10.booleanValue()
            L_0x0118:
                r18 = r5
                long r19 = r0.longValue()
                r22 = 0
                r17 = r9
                r17.<init>(r18, r19, r21, r22)
                goto L_0x0127
            L_0x0126:
                r9 = r3
            L_0x0127:
                r17 = r9
            L_0x0129:
                if (r4 != 0) goto L_0x012c
                r4 = r6
            L_0x012c:
                java.lang.String r0 = r1.getShopName()
                java.lang.String r0 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r0)
                if (r0 != 0) goto L_0x0137
                r0 = r6
            L_0x0137:
                java.lang.Long r5 = r1.getShopId()
                if (r5 == 0) goto L_0x0142
                long r9 = r5.longValue()
                goto L_0x0144
            L_0x0142:
                r9 = 0
            L_0x0144:
                r11 = r2 ^ 1
                com.etsy.android.lib.models.apiv3.listing.User r1 = r1.getOwner()
                if (r1 == 0) goto L_0x0151
                java.lang.String r1 = r1.getLoginName()
                goto L_0x0152
            L_0x0151:
                r1 = r3
            L_0x0152:
                if (r1 != 0) goto L_0x0156
                r14 = r6
                goto L_0x0157
            L_0x0156:
                r14 = r1
            L_0x0157:
                com.etsy.android.lib.models.apiv3.listing.ShopsSellerPersonalDetails r1 = r24.getSellerDetails()
                if (r1 == 0) goto L_0x0169
                java.lang.String r1 = r1.getTraderDistinction()
                if (r1 == 0) goto L_0x0169
                r2 = 63
                android.text.Spanned r3 = android.text.Html.fromHtml(r1, r2)
            L_0x0169:
                r18 = r3
                com.etsy.android.ui.listing.ui.sellerinfo.b r1 = new com.etsy.android.ui.listing.ui.sellerinfo.b
                r5 = r1
                r6 = r4
                r7 = r0
                r5.<init>((java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (long) r9, (boolean) r11, (long) r12, (java.lang.String) r14, (java.lang.String) r15, (java.lang.String) r16, (com.etsy.android.p327ui.listing.p329ui.sellerinfo.favoriting.C10639c) r17, (android.text.Spanned) r18)
                return r1
            L_0x0174:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.sellerinfo.C10635b.C10636a.m18562a(com.etsy.android.ui.util.n, com.etsy.android.lib.models.apiv3.listing.ListingFetch, com.etsy.android.lib.models.datatypes.EtsyId):com.etsy.android.ui.listing.ui.sellerinfo.b");
        }
    }

    public C10635b() {
        this((String) null, (String) null, (String) null, 0, false, 0, (String) null, (String) null, (String) null, (C10639c) null, 2047);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C10635b(java.lang.String r18, java.lang.String r19, java.lang.String r20, long r21, boolean r23, long r24, java.lang.String r26, java.lang.String r27, java.lang.String r28, com.etsy.android.p327ui.listing.p329ui.sellerinfo.favoriting.C10639c r29, int r30) {
        /*
            r17 = this;
            r0 = r30
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r4 = r2
            goto L_0x000c
        L_0x000a:
            r4 = r18
        L_0x000c:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0012
            r5 = r2
            goto L_0x0014
        L_0x0012:
            r5 = r19
        L_0x0014:
            r1 = r0 & 4
            r3 = 0
            if (r1 == 0) goto L_0x001b
            r6 = r3
            goto L_0x001d
        L_0x001b:
            r6 = r20
        L_0x001d:
            r1 = r0 & 8
            r7 = 0
            if (r1 == 0) goto L_0x0025
            r9 = r7
            goto L_0x0027
        L_0x0025:
            r9 = r21
        L_0x0027:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x002d
            r1 = 1
            goto L_0x002f
        L_0x002d:
            r1 = r23
        L_0x002f:
            r11 = r0 & 32
            if (r11 == 0) goto L_0x0035
            r11 = r7
            goto L_0x0037
        L_0x0035:
            r11 = r24
        L_0x0037:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x003d
            r13 = r2
            goto L_0x003f
        L_0x003d:
            r13 = r26
        L_0x003f:
            r7 = r0 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0045
            r14 = r2
            goto L_0x0047
        L_0x0045:
            r14 = r27
        L_0x0047:
            r7 = r0 & 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r2 = r28
        L_0x004e:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0054
            r15 = r3
            goto L_0x0056
        L_0x0054:
            r15 = r29
        L_0x0056:
            r16 = 0
            r3 = r17
            r7 = r9
            r9 = r1
            r10 = r11
            r12 = r13
            r13 = r14
            r14 = r2
            r3.<init>((java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (long) r7, (boolean) r9, (long) r10, (java.lang.String) r12, (java.lang.String) r13, (java.lang.String) r14, (com.etsy.android.p327ui.listing.p329ui.sellerinfo.favoriting.C10639c) r15, (android.text.Spanned) r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.sellerinfo.C10635b.<init>(java.lang.String, java.lang.String, java.lang.String, long, boolean, long, java.lang.String, java.lang.String, java.lang.String, com.etsy.android.ui.listing.ui.sellerinfo.favoriting.c, int):void");
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.SELLER_INFO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10635b)) {
            return false;
        }
        C10635b bVar = (C10635b) obj;
        return C19383o.m32792b(this.f23349a, bVar.f23349a) && C19383o.m32792b(this.f23350b, bVar.f23350b) && C19383o.m32792b(this.f23351c, bVar.f23351c) && this.f23352d == bVar.f23352d && this.f23353e == bVar.f23353e && this.f23354f == bVar.f23354f && C19383o.m32792b(this.f23355g, bVar.f23355g) && C19383o.m32792b(this.f23356h, bVar.f23356h) && C19383o.m32792b(this.f23357i, bVar.f23357i) && C19383o.m32792b(this.f23358j, bVar.f23358j) && C19383o.m32792b(this.f23359k, bVar.f23359k);
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f23350b, this.f23349a.hashCode() * 31, 31);
        String str = this.f23351c;
        int i = 0;
        int b = C0071c.m190b(this.f23352d, (e + (str == null ? 0 : str.hashCode())) * 31, 31);
        boolean z = this.f23353e;
        if (z) {
            z = true;
        }
        int e2 = C0023f.m105e(this.f23357i, C0023f.m105e(this.f23356h, C0023f.m105e(this.f23355g, C0071c.m190b(this.f23354f, (b + (z ? 1 : 0)) * 31, 31), 31), 31), 31);
        C10639c cVar = this.f23358j;
        int hashCode = (e2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Spanned spanned = this.f23359k;
        if (spanned != null) {
            i = spanned.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SellerInfo(shopOwnerName=");
        h.append(this.f23349a);
        h.append(", shopName=");
        h.append(this.f23350b);
        h.append(", imageUrl=");
        h.append(this.f23351c);
        h.append(", shopId=");
        h.append(this.f23352d);
        h.append(", showContactSellerButton=");
        h.append(this.f23353e);
        h.append(", listingId=");
        h.append(this.f23354f);
        h.append(", shopOwnerUsername=");
        h.append(this.f23355g);
        h.append(", subject=");
        h.append(this.f23356h);
        h.append(", message=");
        h.append(this.f23357i);
        h.append(", favoriteInfo=");
        h.append(this.f23358j);
        h.append(", traderDistinction=");
        h.append(this.f23359k);
        h.append(')');
        return h.toString();
    }

    public C10635b(String str, String str2, String str3, long j, boolean z, long j2, String str4, String str5, String str6, C10639c cVar, Spanned spanned) {
        C19383o.m32797g(str, "shopOwnerName");
        C19383o.m32797g(str2, "shopName");
        C19383o.m32797g(str4, "shopOwnerUsername");
        C19383o.m32797g(str5, ResponseConstants.SUBJECT);
        C19383o.m32797g(str6, "message");
        this.f23349a = str;
        this.f23350b = str2;
        this.f23351c = str3;
        this.f23352d = j;
        this.f23353e = z;
        this.f23354f = j2;
        this.f23355g = str4;
        this.f23356h = str5;
        this.f23357i = str6;
        this.f23358j = cVar;
        this.f23359k = spanned;
    }
}
