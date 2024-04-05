package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import android.text.Spanned;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.models.apiv3.StructuredShopPayments;
import com.etsy.android.lib.models.apiv3.StructuredShopRefunds;
import com.etsy.android.lib.models.apiv3.StructuredShopShipping;
import com.etsy.android.lib.models.apiv3.listing.ListingLevelReturnPolicies;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.C10563f;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.C10564g;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p498zc.C13949d;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.structured.a */
public final class C10590a extends C10423j implements C13949d {

    /* renamed from: A */
    public final CharSequence f23219A;

    /* renamed from: B */
    public final String f23220B;

    /* renamed from: C */
    public final C10564g f23221C;

    /* renamed from: D */
    public final Map<AnalyticsProperty, Object> f23222D;

    /* renamed from: E */
    public final Spanned f23223E;

    /* renamed from: F */
    public final Spanned f23224F;

    /* renamed from: a */
    public final boolean f23225a;

    /* renamed from: b */
    public final String f23226b;

    /* renamed from: c */
    public final String f23227c;

    /* renamed from: d */
    public final boolean f23228d;

    /* renamed from: e */
    public final boolean f23229e;

    /* renamed from: f */
    public final String f23230f;

    /* renamed from: g */
    public final boolean f23231g;

    /* renamed from: h */
    public final String f23232h;

    /* renamed from: i */
    public final CharSequence f23233i;

    /* renamed from: j */
    public final int f23234j;

    /* renamed from: k */
    public final CharSequence f23235k;

    /* renamed from: l */
    public final boolean f23236l;

    /* renamed from: m */
    public final boolean f23237m;

    /* renamed from: n */
    public final CharSequence f23238n;

    /* renamed from: o */
    public final CharSequence f23239o;

    /* renamed from: p */
    public final C10563f f23240p;

    /* renamed from: q */
    public final StructuredShopShipping f23241q;

    /* renamed from: r */
    public final boolean f23242r;

    /* renamed from: s */
    public final StructuredShopPayments f23243s;

    /* renamed from: t */
    public final boolean f23244t;

    /* renamed from: u */
    public final boolean f23245u;

    /* renamed from: v */
    public final boolean f23246v;

    /* renamed from: w */
    public final StructuredShopRefunds f23247w;

    /* renamed from: x */
    public final ListingLevelReturnPolicies f23248x;

    /* renamed from: y */
    public final boolean f23249y;

    /* renamed from: z */
    public final String f23250z;

    /* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.structured.a$a */
    public static final class C10591a {
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x01d6, code lost:
            if ((r2 != null && r2.getAcceptsExchanges()) != false) goto L_0x01d8;
         */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x01ef  */
        /* JADX WARNING: Removed duplicated region for block: B:108:0x01f6  */
        /* JADX WARNING: Removed duplicated region for block: B:113:0x0204  */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x020b  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x0136  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x013d  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x014b  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x0152  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x0167  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x016a  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0172  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x0194  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01a0  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x01a5  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x01b0  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x01b5  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x01c2  */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x01c4  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x01c7  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.C10590a m18531a(com.etsy.android.lib.models.apiv3.listing.ListingFetch r30, com.etsy.android.p327ui.util.C11786n r31, com.etsy.android.p327ui.listing.C10156h r32) {
            /*
                r0 = r31
                r1 = r32
                java.lang.String r2 = "resourceProvider"
                kotlin.jvm.internal.C19383o.m32797g(r0, r2)
                java.lang.String r2 = "eligibility"
                kotlin.jvm.internal.C19383o.m32797g(r1, r2)
                com.etsy.android.lib.models.apiv3.listing.Shop r2 = r30.getShop()
                r3 = 0
                if (r2 == 0) goto L_0x0020
                java.lang.Boolean r2 = r2.isUsingStructuredPolicies()
                java.lang.Boolean r4 = java.lang.Boolean.TRUE
                boolean r2 = kotlin.jvm.internal.C19383o.m32792b(r2, r4)
                goto L_0x0021
            L_0x0020:
                r2 = r3
            L_0x0021:
                if (r2 == 0) goto L_0x0225
                com.etsy.android.lib.models.apiv3.listing.ShopStructuredPolicies r2 = r30.getStructuredPolicies()
                if (r2 == 0) goto L_0x0225
                com.etsy.android.lib.models.apiv3.listing.Listing r2 = r30.getListing()
                boolean r8 = r2.isDigital()
                com.etsy.android.lib.models.apiv3.listing.Listing r2 = r30.getListing()
                boolean r9 = r2.isSoldOut()
                com.etsy.android.lib.models.apiv3.listing.Shop r2 = r30.getShop()
                com.etsy.android.lib.models.apiv3.listing.ShopStructuredPolicies r5 = r30.getStructuredPolicies()
                kotlin.jvm.internal.C19383o.m32794d(r5)
                if (r8 == 0) goto L_0x0050
                r6 = 2131953516(0x7f13076c, float:1.9543505E38)
                java.lang.Object[] r7 = new java.lang.Object[r3]
                java.lang.String r6 = r0.mo38059c(r6, r7)
                goto L_0x0059
            L_0x0050:
                r6 = 2131953455(0x7f13072f, float:1.9543381E38)
                java.lang.Object[] r7 = new java.lang.Object[r3]
                java.lang.String r6 = r0.mo38059c(r6, r7)
            L_0x0059:
                r7 = r6
                java.lang.Boolean r6 = r5.getIncludeDisputeFormLink()
                java.lang.Boolean r10 = java.lang.Boolean.TRUE
                boolean r11 = kotlin.jvm.internal.C19383o.m32792b(r6, r10)
                java.lang.String r6 = ""
                r12 = 1
                if (r8 == 0) goto L_0x0073
                r13 = 2131953623(0x7f1307d7, float:1.9543722E38)
                java.lang.Object[] r14 = new java.lang.Object[r3]
                java.lang.String r13 = r0.mo38059c(r13, r14)
                goto L_0x00ad
            L_0x0073:
                com.etsy.android.lib.models.apiv3.listing.Shipping r13 = r30.getShipping()
                if (r13 == 0) goto L_0x007e
                java.util.List r13 = r13.getShipsTo()
                goto L_0x007f
            L_0x007e:
                r13 = 0
            L_0x007f:
                boolean r13 = kotlinx.coroutines.C19543e0.m33306Y(r13)
                if (r13 == 0) goto L_0x00a4
                r13 = 2131953476(0x7f130744, float:1.9543424E38)
                java.lang.Object[] r14 = new java.lang.Object[r12]
                com.etsy.android.lib.models.apiv3.listing.Shipping r15 = r30.getShipping()
                if (r15 == 0) goto L_0x0095
                java.lang.String r15 = r15.getShipsFrom()
                goto L_0x0096
            L_0x0095:
                r15 = 0
            L_0x0096:
                java.lang.String r15 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r15)
                if (r15 != 0) goto L_0x009d
                r15 = r6
            L_0x009d:
                r14[r3] = r15
                java.lang.String r13 = r0.mo38059c(r13, r14)
                goto L_0x00ad
            L_0x00a4:
                r13 = 2131953617(0x7f1307d1, float:1.954371E38)
                java.lang.Object[] r14 = new java.lang.Object[r3]
                java.lang.String r13 = r0.mo38059c(r13, r14)
            L_0x00ad:
                com.etsy.android.lib.models.apiv3.listing.Shipping r14 = r30.getShipping()
                r15 = -1
                if (r8 == 0) goto L_0x00d4
                com.etsy.android.lib.config.e r1 = r1.f22335a
                com.etsy.android.lib.config.EtsyConfigKey r10 = p409o9.C13131k.f28868a
                java.lang.String r1 = r1.mo21136f(r10)
                java.lang.String r10 = "configMap.getStringValue…OE.DIGITAL_DOWNLOAD_LINK)"
                kotlin.jvm.internal.C19383o.m32796f(r1, r10)
                r10 = 2131953621(0x7f1307d5, float:1.9543718E38)
                java.lang.Object[] r14 = new java.lang.Object[r12]
                r14[r3] = r1
                java.lang.String r1 = r0.mo38059c(r10, r14)
                android.text.Spanned r1 = p628nj.C18263b.m30818M(r1)
                r16 = r3
                r14 = 0
                goto L_0x0103
            L_0x00d4:
                if (r14 == 0) goto L_0x00df
                java.lang.Boolean r1 = r14.getHasProcessingTimeRange()
                boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r1, r10)
                goto L_0x00e0
            L_0x00df:
                r1 = r3
            L_0x00e0:
                if (r1 == 0) goto L_0x00ee
                r1 = 2131953474(0x7f130742, float:1.954342E38)
                java.lang.String r10 = r14.getProcessingTimeRange()
                r15 = r1
                r16 = r3
                r14 = r10
                goto L_0x0102
            L_0x00ee:
                r1 = 2131953627(0x7f1307db, float:1.954373E38)
                r10 = 2131953625(0x7f1307d9, float:1.9543726E38)
                java.lang.Object[] r14 = new java.lang.Object[r3]
                java.lang.String r10 = r0.mo38059c(r10, r14)
                android.text.Spanned r10 = p628nj.C18263b.m30818M(r10)
                r15 = r1
                r14 = r10
                r16 = r12
            L_0x0102:
                r1 = 0
            L_0x0103:
                if (r8 != 0) goto L_0x0128
                com.etsy.android.lib.models.apiv3.listing.ShopStructuredPolicies r10 = r30.getStructuredPolicies()
                if (r10 == 0) goto L_0x0116
                com.etsy.android.lib.models.apiv3.listing.StructuredPolicyShipping r10 = r10.getShipping()
                if (r10 == 0) goto L_0x0116
                com.etsy.android.lib.models.apiv3.StructuredShopShipping r10 = com.etsy.android.lib.models.apiv3.listing.extensions.StructuredPolicyShippingExtensionsKt.convertToV2(r10)
                goto L_0x0117
            L_0x0116:
                r10 = 0
            L_0x0117:
                if (r10 == 0) goto L_0x0128
                boolean r17 = r10.hasSetEstimates()
                if (r17 != 0) goto L_0x0125
                boolean r17 = r10.shipsInternational()
                if (r17 == 0) goto L_0x0128
            L_0x0125:
                r17 = r10
                goto L_0x012a
            L_0x0128:
                r17 = 0
            L_0x012a:
                com.etsy.android.lib.models.apiv3.listing.ShopStructuredPolicies r10 = r30.getStructuredPolicies()
                if (r10 == 0) goto L_0x013d
                com.etsy.android.lib.models.apiv3.listing.StructuredPolicyPayments r10 = r10.getPayments()
                if (r10 == 0) goto L_0x013d
                com.etsy.android.lib.models.apiv3.StructuredShopPayments r10 = com.etsy.android.lib.models.apiv3.listing.extensions.StructuredPolicyPaymentsExtensionsKt.convertToV2(r10)
                r18 = r10
                goto L_0x013f
            L_0x013d:
                r18 = 0
            L_0x013f:
                com.etsy.android.lib.models.apiv3.listing.ShopStructuredPolicies r10 = r30.getStructuredPolicies()
                if (r10 == 0) goto L_0x0152
                com.etsy.android.lib.models.apiv3.listing.StructuredPolicyRefunds r10 = r10.getRefunds()
                if (r10 == 0) goto L_0x0152
                com.etsy.android.lib.models.apiv3.StructuredShopRefunds r10 = com.etsy.android.lib.models.apiv3.listing.extensions.StructuredPolicyRefundsExtensionKt.convertToV2(r10)
                r20 = r10
                goto L_0x0154
            L_0x0152:
                r20 = 0
            L_0x0154:
                r10 = 2131953645(0x7f1307ed, float:1.9543767E38)
                java.lang.Object[] r4 = new java.lang.Object[r3]
                java.lang.String r22 = r0.mo38059c(r10, r4)
                java.lang.String r4 = r5.getAdditionalTermsAndConditions()
                java.lang.String r4 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r4)
                if (r4 != 0) goto L_0x016a
                r24 = r6
                goto L_0x016c
            L_0x016a:
                r24 = r4
            L_0x016c:
                boolean r4 = p628nj.C18263b.m30839d0(r24)
                if (r4 == 0) goto L_0x0194
                r4 = 2131953644(0x7f1307ec, float:1.9543765E38)
                java.lang.Object[] r5 = new java.lang.Object[r12]
                if (r2 == 0) goto L_0x0187
                java.lang.String r2 = r2.getShopName()
                if (r2 == 0) goto L_0x0187
                java.lang.String r2 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r2)
                if (r2 != 0) goto L_0x0186
                goto L_0x0187
            L_0x0186:
                r6 = r2
            L_0x0187:
                r5[r3] = r6
                java.lang.String r0 = r0.mo38059c(r4, r5)
                android.text.Spanned r0 = p628nj.C18263b.m30818M(r0)
                r23 = r0
                goto L_0x0196
            L_0x0194:
                r23 = 0
            L_0x0196:
                com.etsy.android.ui.listing.ui.panels.shippingandpolicies.g r25 = com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.C10564g.C10565a.m18516a(r30)
                com.etsy.android.lib.models.apiv3.listing.User r0 = r30.getSeller()
                if (r0 == 0) goto L_0x01a5
                java.lang.String r0 = r0.getLoginName()
                goto L_0x01a6
            L_0x01a5:
                r0 = 0
            L_0x01a6:
                java.lang.String r6 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r0)
                java.lang.Boolean r0 = r30.getShouldUseListingLevelReturnPolicies()
                if (r0 == 0) goto L_0x01b5
                boolean r0 = r0.booleanValue()
                goto L_0x01b6
            L_0x01b5:
                r0 = r3
            L_0x01b6:
                com.etsy.android.lib.models.apiv3.listing.ListingLevelReturnPolicies r2 = r30.getListingLevelReturnPolicies()
                if (r2 == 0) goto L_0x01c4
                boolean r2 = r2.getAcceptsReturns()
                if (r2 != r12) goto L_0x01c4
                r2 = r12
                goto L_0x01c5
            L_0x01c4:
                r2 = r3
            L_0x01c5:
                if (r2 != 0) goto L_0x01d8
                com.etsy.android.lib.models.apiv3.listing.ListingLevelReturnPolicies r2 = r30.getListingLevelReturnPolicies()
                if (r2 == 0) goto L_0x01d5
                boolean r2 = r2.getAcceptsExchanges()
                if (r2 != r12) goto L_0x01d5
                r2 = r12
                goto L_0x01d6
            L_0x01d5:
                r2 = r3
            L_0x01d6:
                if (r2 == 0) goto L_0x01d9
            L_0x01d8:
                r3 = r12
            L_0x01d9:
                com.etsy.android.lib.models.apiv3.listing.ListingLevelReturnPolicies r21 = r30.getListingLevelReturnPolicies()
                java.util.Map r26 = kotlin.jvm.internal.C19388s.m32882r0(r30)
                com.etsy.android.lib.models.apiv3.listing.ShopsSellerPersonalDetails r2 = r30.getSellerDetails()
                r4 = 63
                if (r2 == 0) goto L_0x01f6
                java.lang.String r2 = r2.getTraderDistinction()
                if (r2 == 0) goto L_0x01f6
                android.text.Spanned r2 = android.text.Html.fromHtml(r2, r4)
                r27 = r2
                goto L_0x01f8
            L_0x01f6:
                r27 = 0
            L_0x01f8:
                com.etsy.android.lib.models.apiv3.listing.ShopsSellerPersonalDetails r2 = r30.getSellerDetails()
                if (r2 == 0) goto L_0x020b
                java.lang.String r2 = r2.getFormattedString()
                if (r2 == 0) goto L_0x020b
                android.text.Spanned r4 = android.text.Html.fromHtml(r2, r4)
                r28 = r4
                goto L_0x020d
            L_0x020b:
                r28 = 0
            L_0x020d:
                r29 = 61472(0xf020, float:8.614E-41)
                com.etsy.android.ui.listing.ui.panels.shippingandpolicies.structured.a r4 = new com.etsy.android.ui.listing.ui.panels.shippingandpolicies.structured.a
                r5 = r4
                r10 = r11
                r11 = r13
                r12 = r1
                r13 = r15
                r15 = r16
                r16 = r17
                r17 = r18
                r18 = r0
                r19 = r3
                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
                goto L_0x0226
            L_0x0225:
                r4 = 0
            L_0x0226:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.C10590a.C10591a.m18531a(com.etsy.android.lib.models.apiv3.listing.ListingFetch, com.etsy.android.ui.util.n, com.etsy.android.ui.listing.h):com.etsy.android.ui.listing.ui.panels.shippingandpolicies.structured.a");
        }
    }

    public C10590a() {
        this((String) null, (String) null, false, false, false, (String) null, (Spanned) null, 0, (CharSequence) null, false, (StructuredShopShipping) null, (StructuredShopPayments) null, false, false, (StructuredShopRefunds) null, (ListingLevelReturnPolicies) null, (String) null, (Spanned) null, (String) null, (C10564g) null, (Map) null, (Spanned) null, (Spanned) null, -1);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C10590a(java.lang.String r38, java.lang.String r39, boolean r40, boolean r41, boolean r42, java.lang.String r43, android.text.Spanned r44, int r45, java.lang.CharSequence r46, boolean r47, com.etsy.android.lib.models.apiv3.StructuredShopShipping r48, com.etsy.android.lib.models.apiv3.StructuredShopPayments r49, boolean r50, boolean r51, com.etsy.android.lib.models.apiv3.StructuredShopRefunds r52, com.etsy.android.lib.models.apiv3.listing.ListingLevelReturnPolicies r53, java.lang.String r54, android.text.Spanned r55, java.lang.String r56, com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.C10564g r57, java.util.Map r58, android.text.Spanned r59, android.text.Spanned r60, int r61) {
        /*
            r37 = this;
            r0 = r61
            r1 = 0
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0009
            r2 = 0
            goto L_0x000b
        L_0x0009:
            r2 = r38
        L_0x000b:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0011
            r4 = 0
            goto L_0x0013
        L_0x0011:
            r4 = r39
        L_0x0013:
            r5 = r0 & 8
            r6 = 0
            if (r5 == 0) goto L_0x001a
            r5 = r6
            goto L_0x001c
        L_0x001a:
            r5 = r40
        L_0x001c:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x0022
            r7 = r6
            goto L_0x0024
        L_0x0022:
            r7 = r41
        L_0x0024:
            r8 = 0
            r9 = r0 & 64
            if (r9 == 0) goto L_0x002b
            r9 = r6
            goto L_0x002d
        L_0x002b:
            r9 = r42
        L_0x002d:
            r10 = r0 & 128(0x80, float:1.794E-43)
            java.lang.String r11 = ""
            if (r10 == 0) goto L_0x0035
            r10 = r11
            goto L_0x0037
        L_0x0035:
            r10 = r43
        L_0x0037:
            r12 = r0 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x003d
            r12 = 0
            goto L_0x003f
        L_0x003d:
            r12 = r44
        L_0x003f:
            r13 = r0 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x0045
            r13 = -1
            goto L_0x0047
        L_0x0045:
            r13 = r45
        L_0x0047:
            r14 = r0 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x004d
            r14 = 0
            goto L_0x004f
        L_0x004d:
            r14 = r46
        L_0x004f:
            r15 = r0 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L_0x0055
            r15 = r6
            goto L_0x0057
        L_0x0055:
            r15 = r47
        L_0x0057:
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 32768(0x8000, float:4.5918E-41)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x006c
            com.etsy.android.ui.listing.ui.panels.shippingandpolicies.f r3 = new com.etsy.android.ui.listing.ui.panels.shippingandpolicies.f
            r3.<init>(r6)
            r20 = r3
            goto L_0x006e
        L_0x006c:
            r20 = 0
        L_0x006e:
            r3 = 65536(0x10000, float:9.18355E-41)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x0076
            r21 = 0
            goto L_0x0078
        L_0x0076:
            r21 = r48
        L_0x0078:
            r22 = 0
            r3 = 262144(0x40000, float:3.67342E-40)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x0082
            r23 = 0
            goto L_0x0084
        L_0x0082:
            r23 = r49
        L_0x0084:
            r24 = 0
            r3 = 1048576(0x100000, float:1.469368E-39)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x008e
            r25 = r6
            goto L_0x0090
        L_0x008e:
            r25 = r50
        L_0x0090:
            r3 = 2097152(0x200000, float:2.938736E-39)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x0098
            r26 = r6
            goto L_0x009a
        L_0x0098:
            r26 = r51
        L_0x009a:
            r3 = 4194304(0x400000, float:5.877472E-39)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x00a2
            r27 = 0
            goto L_0x00a4
        L_0x00a2:
            r27 = r52
        L_0x00a4:
            r3 = 8388608(0x800000, float:1.17549435E-38)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x00ac
            r28 = 0
            goto L_0x00ae
        L_0x00ac:
            r28 = r53
        L_0x00ae:
            r29 = 0
            r3 = 33554432(0x2000000, float:9.403955E-38)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x00b8
            r30 = r11
            goto L_0x00ba
        L_0x00b8:
            r30 = r54
        L_0x00ba:
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x00c2
            r31 = 0
            goto L_0x00c4
        L_0x00c2:
            r31 = r55
        L_0x00c4:
            r3 = 134217728(0x8000000, float:3.85186E-34)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x00cc
            r32 = 0
            goto L_0x00ce
        L_0x00cc:
            r32 = r56
        L_0x00ce:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x00db
            com.etsy.android.ui.listing.ui.panels.shippingandpolicies.g r3 = new com.etsy.android.ui.listing.ui.panels.shippingandpolicies.g
            r3.<init>(r6)
            r33 = r3
            goto L_0x00dd
        L_0x00db:
            r33 = r57
        L_0x00dd:
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x00e9
            java.util.Map r3 = kotlin.collections.C19294b0.m32559p0()
            r34 = r3
            goto L_0x00eb
        L_0x00e9:
            r34 = r58
        L_0x00eb:
            r3 = 1073741824(0x40000000, float:2.0)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x00f3
            r35 = 0
            goto L_0x00f5
        L_0x00f3:
            r35 = r59
        L_0x00f5:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x00fd
            r36 = 0
            goto L_0x00ff
        L_0x00fd:
            r36 = r60
        L_0x00ff:
            r0 = r37
            r3 = r4
            r4 = r5
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r12
            r10 = r13
            r11 = r14
            r12 = r15
            r13 = r16
            r14 = r17
            r15 = r18
            r16 = r20
            r17 = r21
            r18 = r22
            r19 = r23
            r20 = r24
            r21 = r25
            r22 = r26
            r23 = r27
            r24 = r28
            r25 = r29
            r26 = r30
            r27 = r31
            r28 = r32
            r29 = r33
            r30 = r34
            r31 = r35
            r32 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.C10590a.<init>(java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, android.text.Spanned, int, java.lang.CharSequence, boolean, com.etsy.android.lib.models.apiv3.StructuredShopShipping, com.etsy.android.lib.models.apiv3.StructuredShopPayments, boolean, boolean, com.etsy.android.lib.models.apiv3.StructuredShopRefunds, com.etsy.android.lib.models.apiv3.listing.ListingLevelReturnPolicies, java.lang.String, android.text.Spanned, java.lang.String, com.etsy.android.ui.listing.ui.panels.shippingandpolicies.g, java.util.Map, android.text.Spanned, android.text.Spanned, int):void");
    }

    /* renamed from: b */
    public static C10590a m18529b(C10590a aVar, boolean z, String str, boolean z2, Spanned spanned, Spanned spanned2, C10563f fVar, boolean z3, boolean z4, boolean z5, int i) {
        CharSequence charSequence;
        Map<AnalyticsProperty, Object> map;
        Spanned spanned3;
        int i2;
        C10590a aVar2 = aVar;
        int i3 = i;
        boolean z6 = (i3 & 1) != 0 ? aVar2.f23225a : z;
        String str2 = (i3 & 2) != 0 ? aVar2.f23226b : null;
        String str3 = (i3 & 4) != 0 ? aVar2.f23227c : null;
        boolean z7 = (i3 & 8) != 0 ? aVar2.f23228d : false;
        boolean z8 = (i3 & 16) != 0 ? aVar2.f23229e : false;
        String str4 = (i3 & 32) != 0 ? aVar2.f23230f : str;
        boolean z9 = (i3 & 64) != 0 ? aVar2.f23231g : false;
        String str5 = (i3 & 128) != 0 ? aVar2.f23232h : null;
        CharSequence charSequence2 = (i3 & 256) != 0 ? aVar2.f23233i : null;
        int i4 = (i3 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? aVar2.f23234j : 0;
        CharSequence charSequence3 = (i3 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? aVar2.f23235k : null;
        boolean z10 = (i3 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? aVar2.f23236l : false;
        boolean z11 = (i3 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? aVar2.f23237m : z2;
        CharSequence charSequence4 = (i3 & 8192) != 0 ? aVar2.f23238n : spanned;
        CharSequence charSequence5 = (i3 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? aVar2.f23239o : spanned2;
        C10563f fVar2 = (32768 & i3) != 0 ? aVar2.f23240p : fVar;
        StructuredShopShipping structuredShopShipping = (i3 & 65536) != 0 ? aVar2.f23241q : null;
        boolean z12 = (131072 & i3) != 0 ? aVar2.f23242r : z3;
        StructuredShopPayments structuredShopPayments = (262144 & i3) != 0 ? aVar2.f23243s : null;
        boolean z13 = (524288 & i3) != 0 ? aVar2.f23244t : z4;
        boolean z14 = (1048576 & i3) != 0 ? aVar2.f23245u : false;
        boolean z15 = (2097152 & i3) != 0 ? aVar2.f23246v : false;
        StructuredShopRefunds structuredShopRefunds = (4194304 & i3) != 0 ? aVar2.f23247w : null;
        ListingLevelReturnPolicies listingLevelReturnPolicies = (8388608 & i3) != 0 ? aVar2.f23248x : null;
        boolean z16 = (16777216 & i3) != 0 ? aVar2.f23249y : z5;
        String str6 = (33554432 & i3) != 0 ? aVar2.f23250z : null;
        boolean z17 = z10;
        CharSequence charSequence6 = (i3 & 67108864) != 0 ? aVar2.f23219A : null;
        String str7 = (134217728 & i3) != 0 ? aVar2.f23220B : null;
        C10564g gVar = (268435456 & i3) != 0 ? aVar2.f23221C : null;
        if ((i3 & 536870912) != 0) {
            charSequence = charSequence3;
            map = aVar2.f23222D;
        } else {
            charSequence = charSequence3;
            map = null;
        }
        if ((i3 & 1073741824) != 0) {
            i2 = i4;
            spanned3 = aVar2.f23223E;
        } else {
            i2 = i4;
            spanned3 = null;
        }
        Spanned spanned4 = (i3 & Integer.MIN_VALUE) != 0 ? aVar2.f23224F : null;
        C19383o.m32797g(fVar2, "calculatedShipping");
        C19383o.m32797g(str6, "termsAndConditionsTitle");
        C19383o.m32797g(gVar, "giftInfo");
        C19383o.m32797g(map, "listingFetchAnalyticsLogAttribute");
        return new C10590a(z6, str2, str3, z7, z8, str4, z9, str5, charSequence2, i2, charSequence, z17, z11, charSequence4, charSequence5, fVar2, structuredShopShipping, z12, structuredShopPayments, z13, z14, z15, structuredShopRefunds, listingLevelReturnPolicies, z16, str6, charSequence6, str7, gVar, map, spanned3, spanned4);
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.SHIPPING_AND_POLICIES_PANEL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10590a)) {
            return false;
        }
        C10590a aVar = (C10590a) obj;
        return this.f23225a == aVar.f23225a && C19383o.m32792b(this.f23226b, aVar.f23226b) && C19383o.m32792b(this.f23227c, aVar.f23227c) && this.f23228d == aVar.f23228d && this.f23229e == aVar.f23229e && C19383o.m32792b(this.f23230f, aVar.f23230f) && this.f23231g == aVar.f23231g && C19383o.m32792b(this.f23232h, aVar.f23232h) && C19383o.m32792b(this.f23233i, aVar.f23233i) && this.f23234j == aVar.f23234j && C19383o.m32792b(this.f23235k, aVar.f23235k) && this.f23236l == aVar.f23236l && this.f23237m == aVar.f23237m && C19383o.m32792b(this.f23238n, aVar.f23238n) && C19383o.m32792b(this.f23239o, aVar.f23239o) && C19383o.m32792b(this.f23240p, aVar.f23240p) && C19383o.m32792b(this.f23241q, aVar.f23241q) && this.f23242r == aVar.f23242r && C19383o.m32792b(this.f23243s, aVar.f23243s) && this.f23244t == aVar.f23244t && this.f23245u == aVar.f23245u && this.f23246v == aVar.f23246v && C19383o.m32792b(this.f23247w, aVar.f23247w) && C19383o.m32792b(this.f23248x, aVar.f23248x) && this.f23249y == aVar.f23249y && C19383o.m32792b(this.f23250z, aVar.f23250z) && C19383o.m32792b(this.f23219A, aVar.f23219A) && C19383o.m32792b(this.f23220B, aVar.f23220B) && C19383o.m32792b(this.f23221C, aVar.f23221C) && C19383o.m32792b(this.f23222D, aVar.f23222D) && C19383o.m32792b(this.f23223E, aVar.f23223E) && C19383o.m32792b(this.f23224F, aVar.f23224F);
    }

    public final int hashCode() {
        boolean z = this.f23225a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.f23226b;
        int i2 = 0;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f23227c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z3 = this.f23228d;
        if (z3) {
            z3 = true;
        }
        int i3 = (hashCode2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f23229e;
        if (z4) {
            z4 = true;
        }
        int i4 = (i3 + (z4 ? 1 : 0)) * 31;
        String str3 = this.f23230f;
        int hashCode3 = (i4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z5 = this.f23231g;
        if (z5) {
            z5 = true;
        }
        int i5 = (hashCode3 + (z5 ? 1 : 0)) * 31;
        String str4 = this.f23232h;
        int hashCode4 = (i5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        CharSequence charSequence = this.f23233i;
        int a = C0069a.m170a(this.f23234j, (hashCode4 + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31);
        CharSequence charSequence2 = this.f23235k;
        int hashCode5 = (a + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        boolean z6 = this.f23236l;
        if (z6) {
            z6 = true;
        }
        int i6 = (hashCode5 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.f23237m;
        if (z7) {
            z7 = true;
        }
        int i7 = (i6 + (z7 ? 1 : 0)) * 31;
        CharSequence charSequence3 = this.f23238n;
        int hashCode6 = (i7 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        CharSequence charSequence4 = this.f23239o;
        int hashCode7 = (this.f23240p.hashCode() + ((hashCode6 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31)) * 31;
        StructuredShopShipping structuredShopShipping = this.f23241q;
        int hashCode8 = (hashCode7 + (structuredShopShipping == null ? 0 : structuredShopShipping.hashCode())) * 31;
        boolean z8 = this.f23242r;
        if (z8) {
            z8 = true;
        }
        int i8 = (hashCode8 + (z8 ? 1 : 0)) * 31;
        StructuredShopPayments structuredShopPayments = this.f23243s;
        int hashCode9 = (i8 + (structuredShopPayments == null ? 0 : structuredShopPayments.hashCode())) * 31;
        boolean z9 = this.f23244t;
        if (z9) {
            z9 = true;
        }
        int i9 = (hashCode9 + (z9 ? 1 : 0)) * 31;
        boolean z10 = this.f23245u;
        if (z10) {
            z10 = true;
        }
        int i10 = (i9 + (z10 ? 1 : 0)) * 31;
        boolean z11 = this.f23246v;
        if (z11) {
            z11 = true;
        }
        int i11 = (i10 + (z11 ? 1 : 0)) * 31;
        StructuredShopRefunds structuredShopRefunds = this.f23247w;
        int hashCode10 = (i11 + (structuredShopRefunds == null ? 0 : structuredShopRefunds.hashCode())) * 31;
        ListingLevelReturnPolicies listingLevelReturnPolicies = this.f23248x;
        int hashCode11 = (hashCode10 + (listingLevelReturnPolicies == null ? 0 : listingLevelReturnPolicies.hashCode())) * 31;
        boolean z12 = this.f23249y;
        if (!z12) {
            z2 = z12;
        }
        int e = C0023f.m105e(this.f23250z, (hashCode11 + (z2 ? 1 : 0)) * 31, 31);
        CharSequence charSequence5 = this.f23219A;
        int hashCode12 = (e + (charSequence5 == null ? 0 : charSequence5.hashCode())) * 31;
        String str5 = this.f23220B;
        int hashCode13 = (this.f23222D.hashCode() + ((this.f23221C.hashCode() + ((hashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31)) * 31;
        Spanned spanned = this.f23223E;
        int hashCode14 = (hashCode13 + (spanned == null ? 0 : spanned.hashCode())) * 31;
        Spanned spanned2 = this.f23224F;
        if (spanned2 != null) {
            i2 = spanned2.hashCode();
        }
        return hashCode14 + i2;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ShippingAndPoliciesPanel(isExpanded=");
        h.append(this.f23225a);
        h.append(", sellerLoginName=");
        h.append(this.f23226b);
        h.append(", panelTitle=");
        h.append(this.f23227c);
        h.append(", isDigitalDownload=");
        h.append(this.f23228d);
        h.append(", isSoldOut=");
        h.append(this.f23229e);
        h.append(", panelDescription=");
        h.append(this.f23230f);
        h.append(", shouldIncludeResolutionLink=");
        h.append(this.f23231g);
        h.append(", shippingHeading=");
        h.append(this.f23232h);
        h.append(", fileDelivery=");
        h.append(this.f23233i);
        h.append(", processingTimeHeading=");
        h.append(this.f23234j);
        h.append(", processingTime=");
        h.append(this.f23235k);
        h.append(", addProcessingTimeClickableLinks=");
        h.append(this.f23236l);
        h.append(", regionsLoaded=");
        h.append(this.f23237m);
        h.append(", estimatedDeliveryDatePrimaryText=");
        h.append(this.f23238n);
        h.append(", estimatedDeliveryDateSubtext=");
        h.append(this.f23239o);
        h.append(", calculatedShipping=");
        h.append(this.f23240p);
        h.append(", structuredShopShipping=");
        h.append(this.f23241q);
        h.append(", isStructuredShopShippingExpanded=");
        h.append(this.f23242r);
        h.append(", structuredShopPayments=");
        h.append(this.f23243s);
        h.append(", isStructuredShopPaymentsExpanded=");
        h.append(this.f23244t);
        h.append(", shouldUseListingLevelReturnPolicies=");
        h.append(this.f23245u);
        h.append(", showReturnDeadline=");
        h.append(this.f23246v);
        h.append(", structuredShopRefunds=");
        h.append(this.f23247w);
        h.append(", listingLevelReturnPolicies=");
        h.append(this.f23248x);
        h.append(", isRefundsExpanded=");
        h.append(this.f23249y);
        h.append(", termsAndConditionsTitle=");
        h.append(this.f23250z);
        h.append(", termsAndConditionsText=");
        h.append(this.f23219A);
        h.append(", termsAndConditions=");
        h.append(this.f23220B);
        h.append(", giftInfo=");
        h.append(this.f23221C);
        h.append(", listingFetchAnalyticsLogAttribute=");
        h.append(this.f23222D);
        h.append(", traderDistinction=");
        h.append(this.f23223E);
        h.append(", sellerContactDetails=");
        h.append(this.f23224F);
        h.append(')');
        return h.toString();
    }

    public C10590a(boolean z, String str, String str2, boolean z2, boolean z3, String str3, boolean z4, String str4, CharSequence charSequence, int i, CharSequence charSequence2, boolean z5, boolean z6, CharSequence charSequence3, CharSequence charSequence4, C10563f fVar, StructuredShopShipping structuredShopShipping, boolean z7, StructuredShopPayments structuredShopPayments, boolean z8, boolean z9, boolean z10, StructuredShopRefunds structuredShopRefunds, ListingLevelReturnPolicies listingLevelReturnPolicies, boolean z11, String str5, CharSequence charSequence5, String str6, C10564g gVar, Map<AnalyticsProperty, ? extends Object> map, Spanned spanned, Spanned spanned2) {
        C10563f fVar2 = fVar;
        String str7 = str5;
        C10564g gVar2 = gVar;
        Map<AnalyticsProperty, ? extends Object> map2 = map;
        C19383o.m32797g(fVar2, "calculatedShipping");
        C19383o.m32797g(str7, "termsAndConditionsTitle");
        C19383o.m32797g(gVar2, "giftInfo");
        C19383o.m32797g(map2, "listingFetchAnalyticsLogAttribute");
        this.f23225a = z;
        this.f23226b = str;
        this.f23227c = str2;
        this.f23228d = z2;
        this.f23229e = z3;
        this.f23230f = str3;
        this.f23231g = z4;
        this.f23232h = str4;
        this.f23233i = charSequence;
        this.f23234j = i;
        this.f23235k = charSequence2;
        this.f23236l = z5;
        this.f23237m = z6;
        this.f23238n = charSequence3;
        this.f23239o = charSequence4;
        this.f23240p = fVar2;
        this.f23241q = structuredShopShipping;
        this.f23242r = z7;
        this.f23243s = structuredShopPayments;
        this.f23244t = z8;
        this.f23245u = z9;
        this.f23246v = z10;
        this.f23247w = structuredShopRefunds;
        this.f23248x = listingLevelReturnPolicies;
        this.f23249y = z11;
        this.f23250z = str7;
        this.f23219A = charSequence5;
        this.f23220B = str6;
        this.f23221C = gVar2;
        this.f23222D = map2;
        this.f23223E = spanned;
        this.f23224F = spanned2;
    }
}
