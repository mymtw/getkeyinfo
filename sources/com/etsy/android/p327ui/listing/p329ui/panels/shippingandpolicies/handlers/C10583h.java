package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.handlers;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.util.C11786n;
import kotlin.jvm.internal.C19383o;
import p309ad.C8505b;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.handlers.h */
public final class C10583h {

    /* renamed from: a */
    public final C8505b f23192a;

    /* renamed from: b */
    public final C11786n f23193b;

    /* renamed from: c */
    public final C13573c f23194c;

    public C10583h(C8505b bVar, C11786n nVar, C13573c cVar) {
        C19383o.m32797g(bVar, "postalCodeHelperFactory");
        C19383o.m32797g(nVar, "resourceProvider");
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f23192a = bVar;
        this.f23193b = nVar;
        this.f23194c = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r2 = r17.getShippingOption();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d1, code lost:
        if ((r2.compareTo(java.math.BigDecimal.ZERO) != 0) != true) goto L_0x00d4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.C10563f mo34187a(com.etsy.android.lib.models.apiv3.ListingShippingDetails r17, boolean r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = 0
            if (r17 == 0) goto L_0x0011
            com.etsy.android.lib.models.apiv3.ShippingOption r2 = r17.getShippingOption()
            if (r2 == 0) goto L_0x0011
            java.lang.String r2 = r2.getOptionId()
            r6 = r2
            goto L_0x0012
        L_0x0011:
            r6 = r1
        L_0x0012:
            if (r17 == 0) goto L_0x0020
            com.etsy.android.lib.models.apiv3.ShippingOption r2 = r17.getShippingOption()
            if (r2 == 0) goto L_0x0020
            com.etsy.android.lib.currency.EtsyMoney r2 = r2.getCost()
            r7 = r2
            goto L_0x0021
        L_0x0020:
            r7 = r1
        L_0x0021:
            if (r17 == 0) goto L_0x0029
            java.util.List r2 = r17.getCountries()
            r8 = r2
            goto L_0x002a
        L_0x0029:
            r8 = r1
        L_0x002a:
            if (r17 == 0) goto L_0x003d
            com.etsy.android.lib.models.apiv3.ShippingAddressPreference r2 = r17.getShippingAddress()
            if (r2 == 0) goto L_0x003d
            com.etsy.android.lib.models.Country r3 = r2.getCountry()
            java.lang.String r2 = r2.getPostalCode()
            r5 = r2
            r4 = r3
            goto L_0x003f
        L_0x003d:
            r4 = r1
            r5 = r4
        L_0x003f:
            if (r4 == 0) goto L_0x0060
            java.lang.String r2 = r4.getIsoCountryCode()
            if (r2 == 0) goto L_0x0051
            ad.b r3 = r0.f23192a
            r3.getClass()
            ad.e r3 = p309ad.C8505b.m16924b(r2)
            goto L_0x0052
        L_0x0051:
            r3 = r1
        L_0x0052:
            if (r2 == 0) goto L_0x005e
            ad.b r9 = r0.f23192a
            r9.getClass()
            ad.d r2 = p309ad.C8505b.m16923a(r2)
            goto L_0x0062
        L_0x005e:
            r2 = r1
            goto L_0x0062
        L_0x0060:
            r2 = r1
            r3 = r2
        L_0x0062:
            java.lang.String r9 = ""
            if (r18 != 0) goto L_0x0165
            if (r19 == 0) goto L_0x006a
            goto L_0x0165
        L_0x006a:
            r10 = 0
            r11 = 1
            if (r4 != 0) goto L_0x0070
            r12 = r10
            goto L_0x0078
        L_0x0070:
            if (r3 == 0) goto L_0x0077
            boolean r12 = r3.mo14c(r5)
            goto L_0x0078
        L_0x0077:
            r12 = r11
        L_0x0078:
            if (r12 == 0) goto L_0x00f6
            boolean r12 = p628nj.C18263b.m30839d0(r6)
            if (r12 == 0) goto L_0x00f6
            com.etsy.android.ui.listing.ui.panels.shippingandpolicies.CalculateShippingState r12 = com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.CalculateShippingState.VIEW_ONLY
            vc.c r13 = r0.f23194c
            vc.g$f r14 = new vc.g$f
            java.lang.String r15 = "shipping_costs_view"
            r14.<init>(r15)
            r13.mo38043a(r14)
            com.etsy.android.ui.util.n r13 = r0.f23193b
            r14 = 2131953467(0x7f13073b, float:1.9543406E38)
            java.lang.Object[] r15 = new java.lang.Object[r10]
            java.lang.String r13 = r13.mo38059c(r14, r15)
            if (r4 == 0) goto L_0x00a0
            java.lang.String r14 = r4.getName()
            goto L_0x00a1
        L_0x00a0:
            r14 = r1
        L_0x00a1:
            java.lang.String r14 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r14)
            boolean r15 = p628nj.C18263b.m30839d0(r5)
            if (r15 == 0) goto L_0x00bb
            if (r3 == 0) goto L_0x00b1
            if (r2 == 0) goto L_0x00b1
            r2 = r11
            goto L_0x00b2
        L_0x00b1:
            r2 = r10
        L_0x00b2:
            if (r2 == 0) goto L_0x00bb
            java.lang.String r2 = ", "
            java.lang.String r14 = p010a9.C0048b.m163a(r14, r2, r5)
            goto L_0x00be
        L_0x00bb:
            if (r14 != 0) goto L_0x00be
            r14 = r9
        L_0x00be:
            if (r7 == 0) goto L_0x00d4
            java.math.BigDecimal r2 = r7.getAmount()
            if (r2 == 0) goto L_0x00d4
            java.math.BigDecimal r3 = java.math.BigDecimal.ZERO
            int r2 = r2.compareTo(r3)
            if (r2 != 0) goto L_0x00d0
            r2 = r11
            goto L_0x00d1
        L_0x00d0:
            r2 = r10
        L_0x00d1:
            if (r2 != r11) goto L_0x00d4
            goto L_0x00d5
        L_0x00d4:
            r11 = r10
        L_0x00d5:
            if (r11 == 0) goto L_0x00e3
            com.etsy.android.ui.util.n r2 = r0.f23193b
            r3 = 2131952287(0x7f13029f, float:1.9541012E38)
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.String r2 = r2.mo38059c(r3, r10)
            goto L_0x00ee
        L_0x00e3:
            if (r7 == 0) goto L_0x00ea
            java.lang.String r2 = r7.format()
            goto L_0x00eb
        L_0x00ea:
            r2 = r1
        L_0x00eb:
            if (r2 != 0) goto L_0x00ee
            r2 = r9
        L_0x00ee:
            r11 = r9
            r9 = r12
            r10 = r13
            r12 = r14
            r14 = r1
            r13 = r2
            goto L_0x016d
        L_0x00f6:
            if (r4 != 0) goto L_0x00fa
            r2 = r10
            goto L_0x0102
        L_0x00fa:
            if (r3 == 0) goto L_0x0101
            boolean r2 = r3.mo14c(r5)
            goto L_0x0102
        L_0x0101:
            r2 = r11
        L_0x0102:
            r3 = 2131953466(0x7f13073a, float:1.9543404E38)
            if (r2 == 0) goto L_0x0149
            if (r6 == 0) goto L_0x0112
            int r2 = r6.length()
            if (r2 != 0) goto L_0x0110
            goto L_0x0112
        L_0x0110:
            r2 = r10
            goto L_0x0113
        L_0x0112:
            r2 = r11
        L_0x0113:
            if (r2 == 0) goto L_0x0149
            com.etsy.android.ui.listing.ui.panels.shippingandpolicies.CalculateShippingState r1 = com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.CalculateShippingState.HEADER
            com.etsy.android.ui.util.n r2 = r0.f23193b
            java.lang.Object[] r12 = new java.lang.Object[r10]
            java.lang.String r2 = r2.mo38059c(r3, r12)
            com.etsy.android.ui.util.n r3 = r0.f23193b
            r12 = 2131953458(0x7f130732, float:1.9543388E38)
            java.lang.Object[] r13 = new java.lang.Object[r10]
            java.lang.String r3 = r3.mo38059c(r12, r13)
            com.etsy.android.ui.util.n r12 = r0.f23193b
            r13 = 2131953461(0x7f130735, float:1.9543394E38)
            java.lang.Object[] r11 = new java.lang.Object[r11]
            kotlin.jvm.internal.C19383o.m32794d(r4)
            java.lang.String r14 = r4.getName()
            java.lang.String r14 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r14)
            r11[r10] = r14
            java.lang.String r10 = r12.mo38059c(r13, r11)
            r11 = r3
            r12 = r9
            r13 = r12
            r14 = r10
            r9 = r1
            r10 = r2
            goto L_0x016d
        L_0x0149:
            com.etsy.android.ui.listing.ui.panels.shippingandpolicies.CalculateShippingState r2 = com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.CalculateShippingState.HEADER
            com.etsy.android.ui.util.n r11 = r0.f23193b
            java.lang.Object[] r12 = new java.lang.Object[r10]
            java.lang.String r3 = r11.mo38059c(r3, r12)
            com.etsy.android.ui.util.n r11 = r0.f23193b
            r12 = 2131953457(0x7f130731, float:1.9543386E38)
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.String r10 = r11.mo38059c(r12, r10)
            r14 = r1
            r12 = r9
            r13 = r12
            r11 = r10
            r9 = r2
            r10 = r3
            goto L_0x016d
        L_0x0165:
            com.etsy.android.ui.listing.ui.panels.shippingandpolicies.CalculateShippingState r2 = com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.CalculateShippingState.GONE
            r14 = r1
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r9 = r2
        L_0x016d:
            com.etsy.android.ui.listing.ui.panels.shippingandpolicies.f r1 = new com.etsy.android.ui.listing.ui.panels.shippingandpolicies.f
            r15 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.handlers.C10583h.mo34187a(com.etsy.android.lib.models.apiv3.ListingShippingDetails, boolean, boolean):com.etsy.android.ui.listing.ui.panels.shippingandpolicies.f");
    }

    /* renamed from: b */
    public final C13574d.C13594c mo34188b(ListingViewState.C10092d dVar, C13597g.C13735t3 t3Var) {
        C19383o.m32797g(t3Var, "event");
        return C0761x.m1709a1(dVar, new ShippingDetailsReceivedHandler$handle$1(this, t3Var, dVar));
    }
}
