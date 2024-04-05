package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.unstructured;

import android.support.p013v4.media.C0072d;
import android.text.Spanned;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.models.apiv3.listing.ListingLevelReturnPolicies;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.C10563f;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.C10564g;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p498zc.C13949d;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.unstructured.a */
public final class C10615a extends C10423j implements C13949d {

    /* renamed from: a */
    public final boolean f23286a;

    /* renamed from: b */
    public final String f23287b;

    /* renamed from: c */
    public final boolean f23288c;

    /* renamed from: d */
    public final boolean f23289d;

    /* renamed from: e */
    public final boolean f23290e;

    /* renamed from: f */
    public final boolean f23291f;

    /* renamed from: g */
    public final CharSequence f23292g;

    /* renamed from: h */
    public final String f23293h;

    /* renamed from: i */
    public final CharSequence f23294i;

    /* renamed from: j */
    public final CharSequence f23295j;

    /* renamed from: k */
    public final C10564g f23296k;

    /* renamed from: l */
    public final String f23297l;

    /* renamed from: m */
    public final String f23298m;

    /* renamed from: n */
    public final C10563f f23299n;

    /* renamed from: o */
    public final Map<AnalyticsProperty, Object> f23300o;

    /* renamed from: p */
    public final Spanned f23301p;

    /* renamed from: q */
    public final Spanned f23302q;

    /* renamed from: r */
    public final boolean f23303r;

    /* renamed from: s */
    public final ListingLevelReturnPolicies f23304s;

    /* renamed from: t */
    public final boolean f23305t;

    public C10615a() {
        this((String) null, false, false, false, false, (CharSequence) null, (C10564g) null, (String) null, (String) null, (Map) null, (Spanned) null, (Spanned) null, false, (ListingLevelReturnPolicies) null, false, 1048575);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C10615a(java.lang.String r25, boolean r26, boolean r27, boolean r28, boolean r29, java.lang.CharSequence r30, com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.C10564g r31, java.lang.String r32, java.lang.String r33, java.util.Map r34, android.text.Spanned r35, android.text.Spanned r36, boolean r37, com.etsy.android.lib.models.apiv3.listing.ListingLevelReturnPolicies r38, boolean r39, int r40) {
        /*
            r24 = this;
            r0 = r40
            r1 = 0
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0009
            r2 = 0
            goto L_0x000b
        L_0x0009:
            r2 = r25
        L_0x000b:
            r4 = r0 & 4
            r5 = 0
            if (r4 == 0) goto L_0x0012
            r4 = r5
            goto L_0x0014
        L_0x0012:
            r4 = r26
        L_0x0014:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x001a
            r6 = r5
            goto L_0x001c
        L_0x001a:
            r6 = r27
        L_0x001c:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x0022
            r7 = r5
            goto L_0x0024
        L_0x0022:
            r7 = r28
        L_0x0024:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x002a
            r8 = r5
            goto L_0x002c
        L_0x002a:
            r8 = r29
        L_0x002c:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x0032
            r9 = 0
            goto L_0x0034
        L_0x0032:
            r9 = r30
        L_0x0034:
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x0041
            com.etsy.android.ui.listing.ui.panels.shippingandpolicies.g r13 = new com.etsy.android.ui.listing.ui.panels.shippingandpolicies.g
            r13.<init>(r5)
            goto L_0x0043
        L_0x0041:
            r13 = r31
        L_0x0043:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0049
            r14 = 0
            goto L_0x004b
        L_0x0049:
            r14 = r32
        L_0x004b:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x0051
            r15 = 0
            goto L_0x0053
        L_0x0051:
            r15 = r33
        L_0x0053:
            r3 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x005f
            com.etsy.android.ui.listing.ui.panels.shippingandpolicies.f r3 = new com.etsy.android.ui.listing.ui.panels.shippingandpolicies.f
            r3.<init>(r5)
            r17 = r3
            goto L_0x0061
        L_0x005f:
            r17 = 0
        L_0x0061:
            r3 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r3 == 0) goto L_0x006c
            java.util.Map r3 = kotlin.collections.C19294b0.m32559p0()
            r18 = r3
            goto L_0x006e
        L_0x006c:
            r18 = r34
        L_0x006e:
            r3 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x0077
            r19 = 0
            goto L_0x0079
        L_0x0077:
            r19 = r35
        L_0x0079:
            r3 = 65536(0x10000, float:9.18355E-41)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x0081
            r20 = 0
            goto L_0x0083
        L_0x0081:
            r20 = r36
        L_0x0083:
            r3 = 131072(0x20000, float:1.83671E-40)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x008b
            r21 = r5
            goto L_0x008d
        L_0x008b:
            r21 = r37
        L_0x008d:
            r3 = 262144(0x40000, float:3.67342E-40)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x0095
            r22 = 0
            goto L_0x0097
        L_0x0095:
            r22 = r38
        L_0x0097:
            r3 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x009f
            r23 = r5
            goto L_0x00a1
        L_0x009f:
            r23 = r39
        L_0x00a1:
            r0 = r24
            r3 = r4
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r11
            r10 = r12
            r11 = r13
            r12 = r14
            r13 = r15
            r14 = r17
            r15 = r18
            r16 = r19
            r17 = r20
            r18 = r21
            r19 = r22
            r20 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.unstructured.C10615a.<init>(java.lang.String, boolean, boolean, boolean, boolean, java.lang.CharSequence, com.etsy.android.ui.listing.ui.panels.shippingandpolicies.g, java.lang.String, java.lang.String, java.util.Map, android.text.Spanned, android.text.Spanned, boolean, com.etsy.android.lib.models.apiv3.listing.ListingLevelReturnPolicies, boolean, int):void");
    }

    /* renamed from: b */
    public static C10615a m18544b(C10615a aVar, String str, Spanned spanned, Spanned spanned2, C10563f fVar, int i) {
        C10615a aVar2 = aVar;
        int i2 = i;
        boolean z = (i2 & 1) != 0 ? aVar2.f23286a : false;
        String str2 = (i2 & 2) != 0 ? aVar2.f23287b : null;
        boolean z2 = (i2 & 4) != 0 ? aVar2.f23288c : false;
        boolean z3 = (i2 & 8) != 0 ? aVar2.f23289d : false;
        boolean z4 = (i2 & 16) != 0 ? aVar2.f23290e : false;
        boolean z5 = (i2 & 32) != 0 ? aVar2.f23291f : false;
        CharSequence charSequence = (i2 & 64) != 0 ? aVar2.f23292g : null;
        String str3 = (i2 & 128) != 0 ? aVar2.f23293h : str;
        CharSequence charSequence2 = (i2 & 256) != 0 ? aVar2.f23294i : spanned;
        CharSequence charSequence3 = (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? aVar2.f23295j : spanned2;
        C10564g gVar = (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? aVar2.f23296k : null;
        String str4 = (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? aVar2.f23297l : null;
        String str5 = (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? aVar2.f23298m : null;
        C10563f fVar2 = (i2 & 8192) != 0 ? aVar2.f23299n : fVar;
        Map<AnalyticsProperty, Object> map = (i2 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? aVar2.f23300o : null;
        Spanned spanned3 = (i2 & 32768) != 0 ? aVar2.f23301p : null;
        Spanned spanned4 = (65536 & i2) != 0 ? aVar2.f23302q : null;
        boolean z6 = (131072 & i2) != 0 ? aVar2.f23303r : false;
        ListingLevelReturnPolicies listingLevelReturnPolicies = (262144 & i2) != 0 ? aVar2.f23304s : null;
        boolean z7 = (i2 & 524288) != 0 ? aVar2.f23305t : false;
        C19383o.m32797g(gVar, "giftInfo");
        C19383o.m32797g(fVar2, "calculatedShipping");
        C19383o.m32797g(map, "listingFetchAnalyticsLogAttribute");
        return new C10615a(z, str2, z2, z3, z4, z5, charSequence, str3, charSequence2, charSequence3, gVar, str4, str5, fVar2, map, spanned3, spanned4, z6, listingLevelReturnPolicies, z7);
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.SHIPPING_POLICIES_UNSTRUCTURED_PANEL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10615a)) {
            return false;
        }
        C10615a aVar = (C10615a) obj;
        return this.f23286a == aVar.f23286a && C19383o.m32792b(this.f23287b, aVar.f23287b) && this.f23288c == aVar.f23288c && this.f23289d == aVar.f23289d && this.f23290e == aVar.f23290e && this.f23291f == aVar.f23291f && C19383o.m32792b(this.f23292g, aVar.f23292g) && C19383o.m32792b(this.f23293h, aVar.f23293h) && C19383o.m32792b(this.f23294i, aVar.f23294i) && C19383o.m32792b(this.f23295j, aVar.f23295j) && C19383o.m32792b(this.f23296k, aVar.f23296k) && C19383o.m32792b(this.f23297l, aVar.f23297l) && C19383o.m32792b(this.f23298m, aVar.f23298m) && C19383o.m32792b(this.f23299n, aVar.f23299n) && C19383o.m32792b(this.f23300o, aVar.f23300o) && C19383o.m32792b(this.f23301p, aVar.f23301p) && C19383o.m32792b(this.f23302q, aVar.f23302q) && this.f23303r == aVar.f23303r && C19383o.m32792b(this.f23304s, aVar.f23304s) && this.f23305t == aVar.f23305t;
    }

    public final int hashCode() {
        boolean z = this.f23286a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.f23287b;
        int i2 = 0;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        boolean z3 = this.f23288c;
        if (z3) {
            z3 = true;
        }
        int i3 = (hashCode + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f23289d;
        if (z4) {
            z4 = true;
        }
        int i4 = (i3 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f23290e;
        if (z5) {
            z5 = true;
        }
        int i5 = (i4 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.f23291f;
        if (z6) {
            z6 = true;
        }
        int i6 = (i5 + (z6 ? 1 : 0)) * 31;
        CharSequence charSequence = this.f23292g;
        int hashCode2 = (i6 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str2 = this.f23293h;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CharSequence charSequence2 = this.f23294i;
        int hashCode4 = (hashCode3 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f23295j;
        int hashCode5 = (this.f23296k.hashCode() + ((hashCode4 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31)) * 31;
        String str3 = this.f23297l;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f23298m;
        int hashCode7 = (this.f23300o.hashCode() + ((this.f23299n.hashCode() + ((hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31)) * 31;
        Spanned spanned = this.f23301p;
        int hashCode8 = (hashCode7 + (spanned == null ? 0 : spanned.hashCode())) * 31;
        Spanned spanned2 = this.f23302q;
        int hashCode9 = (hashCode8 + (spanned2 == null ? 0 : spanned2.hashCode())) * 31;
        boolean z7 = this.f23303r;
        if (z7) {
            z7 = true;
        }
        int i7 = (hashCode9 + (z7 ? 1 : 0)) * 31;
        ListingLevelReturnPolicies listingLevelReturnPolicies = this.f23304s;
        if (listingLevelReturnPolicies != null) {
            i2 = listingLevelReturnPolicies.hashCode();
        }
        int i8 = (i7 + i2) * 31;
        boolean z8 = this.f23305t;
        if (!z8) {
            z2 = z8;
        }
        return i8 + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ShippingUnstructuredPoliciesPanel(isExpanded=");
        h.append(this.f23286a);
        h.append(", panelTitle=");
        h.append(this.f23287b);
        h.append(", isDigitalDownload=");
        h.append(this.f23288c);
        h.append(", isSoldOut=");
        h.append(this.f23289d);
        h.append(", isShowingCreditCardsPayments=");
        h.append(this.f23290e);
        h.append(", isShowingPayPalPayment=");
        h.append(this.f23291f);
        h.append(", otherPaymentOptions=");
        h.append(this.f23292g);
        h.append(", panelDescription=");
        h.append(this.f23293h);
        h.append(", estimatedDeliveryDatePrimaryText=");
        h.append(this.f23294i);
        h.append(", estimatedDeliveryDateSubtext=");
        h.append(this.f23295j);
        h.append(", giftInfo=");
        h.append(this.f23296k);
        h.append(", shippingOrigin=");
        h.append(this.f23297l);
        h.append(", shippingTime=");
        h.append(this.f23298m);
        h.append(", calculatedShipping=");
        h.append(this.f23299n);
        h.append(", listingFetchAnalyticsLogAttribute=");
        h.append(this.f23300o);
        h.append(", traderDistinction=");
        h.append(this.f23301p);
        h.append(", sellerContactDetails=");
        h.append(this.f23302q);
        h.append(", shouldUseListingLevelReturnPolicies=");
        h.append(this.f23303r);
        h.append(", listingLevelReturnPolicies=");
        h.append(this.f23304s);
        h.append(", showReturnDeadline=");
        return C0391c.m1058d(h, this.f23305t, ')');
    }

    public C10615a(boolean z, String str, boolean z2, boolean z3, boolean z4, boolean z5, CharSequence charSequence, String str2, CharSequence charSequence2, CharSequence charSequence3, C10564g gVar, String str3, String str4, C10563f fVar, Map<AnalyticsProperty, ? extends Object> map, Spanned spanned, Spanned spanned2, boolean z6, ListingLevelReturnPolicies listingLevelReturnPolicies, boolean z7) {
        C10564g gVar2 = gVar;
        C10563f fVar2 = fVar;
        Map<AnalyticsProperty, ? extends Object> map2 = map;
        C19383o.m32797g(gVar2, "giftInfo");
        C19383o.m32797g(fVar2, "calculatedShipping");
        C19383o.m32797g(map2, "listingFetchAnalyticsLogAttribute");
        this.f23286a = z;
        this.f23287b = str;
        this.f23288c = z2;
        this.f23289d = z3;
        this.f23290e = z4;
        this.f23291f = z5;
        this.f23292g = charSequence;
        this.f23293h = str2;
        this.f23294i = charSequence2;
        this.f23295j = charSequence3;
        this.f23296k = gVar2;
        this.f23297l = str3;
        this.f23298m = str4;
        this.f23299n = fVar2;
        this.f23300o = map2;
        this.f23301p = spanned;
        this.f23302q = spanned2;
        this.f23303r = z6;
        this.f23304s = listingLevelReturnPolicies;
        this.f23305t = z7;
    }
}
