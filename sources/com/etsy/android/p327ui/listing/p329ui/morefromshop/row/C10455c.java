package com.etsy.android.p327ui.listing.p329ui.morefromshop.row;

import android.support.p013v4.media.C0072d;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import kotlin.jvm.internal.C19383o;
import p467vd.C13780a;
import p498zc.C13949d;

/* renamed from: com.etsy.android.ui.listing.ui.morefromshop.row.c */
public final class C10455c extends C10423j implements C13949d {

    /* renamed from: a */
    public final C10453a f22954a;

    /* renamed from: b */
    public final C10453a f22955b;

    /* renamed from: c */
    public final C13780a f22956c;

    /* renamed from: com.etsy.android.ui.listing.ui.morefromshop.row.c$a */
    public static final class C10456a {
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x003d, code lost:
            r1 = r19.getDiscountedPrice();
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.etsy.android.p327ui.listing.p329ui.morefromshop.row.C10453a m18449a(com.etsy.android.lib.models.apiv3.listing.ListingCard r19, com.etsy.android.p327ui.util.C11786n r20, com.etsy.android.lib.currency.C8630b r21, com.etsy.android.p327ui.listing.C10156h r22) {
            /*
                r0 = r22
                java.lang.String r1 = "listingViewEligibility"
                kotlin.jvm.internal.C19383o.m32797g(r0, r1)
                java.lang.String r1 = r19.getTitle()
                java.lang.String r6 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r1)
                java.lang.Boolean r1 = r19.isSoldOut()
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r1, r2)
                r3 = 0
                if (r1 != 0) goto L_0x002c
                java.lang.String r1 = r19.getPrice()
                java.lang.String r4 = r19.getCurrencyCode()
                r5 = r21
                com.etsy.android.lib.currency.EtsyMoney r1 = r5.mo21248a(r1, r4)
                r7 = r1
                goto L_0x002d
            L_0x002c:
                r7 = r3
            L_0x002d:
                java.lang.Boolean r1 = r19.isSoldOut()
                boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r1, r2)
                if (r1 != 0) goto L_0x0049
                com.etsy.android.lib.models.apiv3.listing.Money r1 = r19.getDiscountedPrice()
                if (r1 == 0) goto L_0x0049
                com.etsy.android.lib.models.apiv3.listing.Money r1 = r19.getDiscountedPrice()
                if (r1 == 0) goto L_0x0049
                com.etsy.android.lib.currency.EtsyMoney r1 = r1.asEtsyMoney()
                r8 = r1
                goto L_0x004a
            L_0x0049:
                r8 = r3
            L_0x004a:
                r1 = 0
                if (r8 == 0) goto L_0x0060
                com.etsy.android.lib.config.e r0 = r0.f22335a
                com.etsy.android.lib.config.EtsyConfigKey r2 = com.etsy.android.lib.config.C8592b.C8601i.f18893g
                boolean r0 = r0.mo21132b(r2)
                if (r0 == 0) goto L_0x0060
                r0 = 1
                java.lang.String r2 = r8.format()
                r16 = r0
                r9 = r2
                goto L_0x0075
            L_0x0060:
                if (r7 == 0) goto L_0x0067
                java.lang.String r0 = r7.format()
                goto L_0x0072
            L_0x0067:
                r0 = 2131953574(0x7f1307a6, float:1.9543623E38)
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r3 = r20
                java.lang.String r0 = r3.mo38059c(r0, r2)
            L_0x0072:
                r9 = r0
                r16 = r1
            L_0x0075:
                java.lang.Long r0 = r19.getListingId()
                kotlin.jvm.internal.C19383o.m32794d(r0)
                long r3 = r0.longValue()
                java.lang.Boolean r0 = r19.isFavorite()
                if (r0 == 0) goto L_0x008c
                boolean r0 = r0.booleanValue()
                r5 = r0
                goto L_0x008d
            L_0x008c:
                r5 = r1
            L_0x008d:
                com.etsy.android.lib.models.apiv3.listing.ListingImage r10 = r19.getImg()
                java.lang.String r11 = r19.getUrl()
                java.lang.Long r12 = r19.getShopId()
                java.lang.String r0 = r19.getShopName()
                java.lang.String r13 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r0)
                java.lang.String r14 = r19.getContentSource()
                com.etsy.android.ui.listing.ui.morefromshop.row.a r0 = new com.etsy.android.ui.listing.ui.morefromshop.row.a
                r2 = r0
                r15 = 0
                r17 = 0
                r18 = 10240(0x2800, float:1.4349E-41)
                r2.<init>(r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.morefromshop.row.C10455c.C10456a.m18449a(com.etsy.android.lib.models.apiv3.listing.ListingCard, com.etsy.android.ui.util.n, com.etsy.android.lib.currency.b, com.etsy.android.ui.listing.h):com.etsy.android.ui.listing.ui.morefromshop.row.a");
        }
    }

    public C10455c(C10453a aVar, C10453a aVar2, C13780a aVar3) {
        this.f22954a = aVar;
        this.f22955b = aVar2;
        this.f22956c = aVar3;
    }

    /* renamed from: b */
    public static C10455c m18447b(C10455c cVar, C10453a aVar, C10453a aVar2, int i) {
        if ((i & 1) != 0) {
            aVar = cVar.f22954a;
        }
        if ((i & 2) != 0) {
            aVar2 = cVar.f22955b;
        }
        C13780a aVar3 = (i & 4) != 0 ? cVar.f22956c : null;
        C19383o.m32797g(aVar, "first");
        C19383o.m32797g(aVar2, "second");
        return new C10455c(aVar, aVar2, aVar3);
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.MORE_FROM_SHOP_ROW;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10455c)) {
            return false;
        }
        C10455c cVar = (C10455c) obj;
        return C19383o.m32792b(this.f22954a, cVar.f22954a) && C19383o.m32792b(this.f22955b, cVar.f22955b) && C19383o.m32792b(this.f22956c, cVar.f22956c);
    }

    public final int hashCode() {
        int hashCode = (this.f22955b.hashCode() + (this.f22954a.hashCode() * 31)) * 31;
        C13780a aVar = this.f22956c;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("MoreFromShopRow(first=");
        h.append(this.f22954a);
        h.append(", second=");
        h.append(this.f22955b);
        h.append(", bottomSpace=");
        h.append(this.f22956c);
        h.append(')');
        return h.toString();
    }
}
