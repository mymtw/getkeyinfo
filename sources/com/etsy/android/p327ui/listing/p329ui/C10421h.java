package com.etsy.android.p327ui.listing.p329ui;

import com.etsy.android.R;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartUi;
import com.etsy.android.lib.models.apiv3.listing.FormattedMoney;
import com.etsy.android.lib.models.apiv3.listing.ListingCard;
import com.etsy.android.lib.models.apiv3.listing.ListingFetch;
import com.etsy.android.lib.models.apiv3.listing.Money;
import com.etsy.android.lib.models.apiv3.listing.SellerMarketingBOEMessage;
import com.etsy.android.lib.util.C8890e0;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.p327ui.core.listingnomapper.listingvariations.C9684a;
import com.etsy.android.p327ui.listing.C10156h;
import com.etsy.android.p327ui.listing.p329ui.C10409f;
import com.etsy.android.p327ui.listing.p329ui.morefromshop.button.C10450b;
import com.etsy.android.p327ui.listing.p329ui.morefromshop.row.C10455c;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.C10563f;
import com.etsy.android.p327ui.util.C11786n;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p375jd.C12971a;
import p375jd.C12974d;
import p443sd.C13373a;
import p467vd.C13780a;
import p568fn.C17782b;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.listing.ui.h */
public final class C10421h {

    /* renamed from: a */
    public final C10156h f22878a;

    /* renamed from: b */
    public final NumberFormat f22879b;

    /* renamed from: c */
    public final C8630b f22880c;

    /* renamed from: d */
    public final C8890e0 f22881d;

    /* renamed from: e */
    public final C11786n f22882e;

    /* renamed from: f */
    public final C8923u f22883f;

    /* renamed from: g */
    public final C9684a f22884g;

    public C10421h(C10156h hVar, NumberFormat numberFormat, C8630b bVar, C8890e0 e0Var, C11786n nVar, C8923u uVar, C9684a aVar) {
        C19383o.m32797g(hVar, "listingViewEligibility");
        C19383o.m32797g(numberFormat, "numberFormat");
        C19383o.m32797g(bVar, "etsyMoneyFactory");
        C19383o.m32797g(e0Var, "systemTime");
        C19383o.m32797g(nVar, "resourceProvider");
        C19383o.m32797g(uVar, "machineTranslationHelper");
        C19383o.m32797g(aVar, "listingImagesByVariationHelper");
        this.f22878a = hVar;
        this.f22879b = numberFormat;
        this.f22880c = bVar;
        this.f22881d = e0Var;
        this.f22882e = nVar;
        this.f22883f = uVar;
        this.f22884g = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r11.getType();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.etsy.android.p327ui.listing.p329ui.buybox.lottienudge.C10266c m18420a(com.etsy.android.lib.models.apiv3.listing.Nudge r11, boolean r12) {
        /*
            r0 = 0
            if (r11 == 0) goto L_0x000e
            java.lang.String r1 = r11.getType()
            if (r1 == 0) goto L_0x000e
            java.lang.String r1 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r1)
            goto L_0x000f
        L_0x000e:
            r1 = r0
        L_0x000f:
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x0014
            r1 = r2
        L_0x0014:
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r4 = "US"
            kotlin.jvm.internal.C19383o.m32796f(r3, r4)
            java.lang.String r1 = r1.toUpperCase(r3)
            java.lang.String r3 = "this as java.lang.String).toUpperCase(locale)"
            kotlin.jvm.internal.C19383o.m32796f(r1, r3)
            com.etsy.android.ui.core.nudge.NudgeType r1 = com.etsy.android.p327ui.core.nudge.NudgeType.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x002a }
            r5 = r1
            goto L_0x002b
        L_0x002a:
            r5 = r0
        L_0x002b:
            if (r11 == 0) goto L_0x0032
            java.lang.String r1 = r11.getDisplayTitle()
            goto L_0x0033
        L_0x0032:
            r1 = r0
        L_0x0033:
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0040
            int r1 = r1.length()
            if (r1 != 0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r1 = r3
            goto L_0x0041
        L_0x0040:
            r1 = r4
        L_0x0041:
            if (r1 != 0) goto L_0x005c
            if (r11 == 0) goto L_0x004a
            java.lang.String r1 = r11.getDisplayBody()
            goto L_0x004b
        L_0x004a:
            r1 = r0
        L_0x004b:
            if (r1 == 0) goto L_0x0056
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r1 = r3
            goto L_0x0057
        L_0x0056:
            r1 = r4
        L_0x0057:
            if (r1 == 0) goto L_0x005a
            goto L_0x005c
        L_0x005a:
            r10 = r3
            goto L_0x005d
        L_0x005c:
            r10 = r4
        L_0x005d:
            if (r12 == 0) goto L_0x0083
            if (r11 == 0) goto L_0x0083
            if (r5 == 0) goto L_0x0083
            com.etsy.android.ui.listing.ui.buybox.lottienudge.c r12 = new com.etsy.android.ui.listing.ui.buybox.lottienudge.c
            java.lang.String r1 = r11.getDisplayText()
            if (r1 == 0) goto L_0x006f
            java.lang.String r0 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r1)
        L_0x006f:
            if (r0 != 0) goto L_0x0073
            r4 = r2
            goto L_0x0074
        L_0x0073:
            r4 = r0
        L_0x0074:
            java.lang.String r8 = r11.getDisplayTitle()
            java.lang.String r9 = r11.getDisplayBody()
            r6 = 0
            r7 = 0
            r3 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0 = r12
        L_0x0083:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.C10421h.m18420a(com.etsy.android.lib.models.apiv3.listing.Nudge, boolean):com.etsy.android.ui.listing.ui.buybox.lottienudge.c");
    }

    /* renamed from: b */
    public static C10409f.C10412b m18421b(C10421h hVar, List list, C10156h hVar2) {
        C13780a aVar;
        hVar.getClass();
        C19383o.m32797g(hVar2, "listingViewEligibility");
        List m1 = list != null ? C19327t.m32657m1(C19327t.m32666v1(list, 2, false), 3) : null;
        if ((m1 != null ? (List) C19327t.m32640V0(m1) : null) == null) {
            return null;
        }
        C13373a aVar2 = new C13373a(false);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object next : m1) {
            int i2 = i + 1;
            if (i >= 0) {
                List list2 = (List) next;
                ListingCard listingCard = (ListingCard) list2.get(0);
                ListingCard listingCard2 = (ListingCard) list2.get(1);
                if (i < m1.size() - 1) {
                    C11786n nVar = hVar.f22882e;
                    C19383o.m32797g(nVar, "resourceProvider");
                    aVar = new C13780a(nVar.mo38057a(R.dimen.clg_space_4));
                    new C13780a(nVar.mo38057a(R.dimen.clg_space_8));
                    new C13780a(nVar.mo38057a(R.dimen.clg_space_12));
                    new C13780a(nVar.mo38057a(R.dimen.clg_space_16));
                } else {
                    aVar = null;
                }
                C8630b bVar = hVar.f22880c;
                C11786n nVar2 = hVar.f22882e;
                C19383o.m32797g(nVar2, "resourcesProvider");
                C19383o.m32797g(bVar, "etsyMoneyFactory");
                C10455c cVar = (listingCard == null || listingCard2 == null) ? null : new C10455c(C10455c.C10456a.m18449a(listingCard, nVar2, bVar, hVar2), C10455c.C10456a.m18449a(listingCard2, nVar2, bVar, hVar2), aVar);
                if (cVar != null) {
                    arrayList.add(cVar);
                }
                i = i2;
            } else {
                C17782b.m29877o0();
                throw null;
            }
        }
        return new C10409f.C10412b(aVar2, arrayList, C10450b.f22928a);
    }

    /* renamed from: c */
    public final C10423j mo33972c(AppsInventoryAddToCartUi appsInventoryAddToCartUi, ListingFetch listingFetch, C10563f fVar) {
        FormattedMoney discountDescription;
        String formattedMoney;
        C19383o.m32797g(listingFetch, "listingFetch");
        String str = null;
        if (listingFetch.getListing().isSoldOut()) {
            return null;
        }
        boolean z = true;
        if (appsInventoryAddToCartUi == null) {
            SellerMarketingBOEMessage promoMessage = listingFetch.getPromoMessage();
            if ((promoMessage != null ? promoMessage.getDiscountedPrice() : null) != null) {
                C8630b bVar = this.f22880c;
                C19383o.m32797g(bVar, "etsyMoneyFactory");
                EtsyMoney a = bVar.mo21248a(listingFetch.getListing().getPrice(), listingFetch.getListing().getCurrencyCode());
                SellerMarketingBOEMessage promoMessage2 = listingFetch.getPromoMessage();
                C19383o.m32794d(promoMessage2);
                Money discountedPrice = promoMessage2.getDiscountedPrice();
                C19383o.m32794d(discountedPrice);
                String format = discountedPrice.asEtsyMoney().format();
                String format2 = a.format();
                SellerMarketingBOEMessage promoMessage3 = listingFetch.getPromoMessage();
                if (!(promoMessage3 == null || (discountDescription = promoMessage3.getDiscountDescription()) == null)) {
                    str = discountDescription.toString();
                }
                String str2 = str;
                if (listingFetch.hasVariations() && listingFetch.hasPriceDiffVariation()) {
                    format = format + '+';
                    format2 = format2 + '+';
                }
                return new C12974d(format, format2, (C10563f) null, listingFetch.getDetailedFreeShipping() != null, str2, 36);
            }
            C8630b bVar2 = this.f22880c;
            C19383o.m32797g(bVar2, "etsyMoneyFactory");
            String format3 = bVar2.mo21248a(listingFetch.getListing().getPrice(), listingFetch.getListing().getCurrencyCode()).format();
            if (listingFetch.hasVariations() && listingFetch.hasPriceDiffVariation()) {
                format3 = format3 + '+';
            }
            if (listingFetch.getDetailedFreeShipping() == null) {
                z = false;
            }
            return new C12971a(format3, (C10563f) null, z, 10);
        } else if (appsInventoryAddToCartUi.getDiscountedPrice() != null) {
            FormattedMoney price = appsInventoryAddToCartUi.getPrice();
            FormattedMoney discountedPrice2 = appsInventoryAddToCartUi.getDiscountedPrice();
            if (price == null || discountedPrice2 == null) {
                return null;
            }
            ListingCard listingCard = listingFetch.getListingCard();
            FormattedMoney discountDescription2 = listingCard != null ? listingCard.getDiscountDescription() : null;
            SellerMarketingBOEMessage promoMessage4 = listingFetch.getPromoMessage();
            if (promoMessage4 != null) {
                str = promoMessage4.getDescription();
            }
            return new C12974d(discountedPrice2.toString(), price.toString(), fVar, listingFetch.getDetailedFreeShipping() != null, (!C18263b.m30839d0(str) || discountDescription2 == null) ? String.valueOf(appsInventoryAddToCartUi.getDiscountedDescription()) : discountDescription2.toString(), 32);
        } else {
            FormattedMoney price2 = appsInventoryAddToCartUi.getPrice();
            if (price2 == null || (formattedMoney = price2.toString()) == null) {
                return null;
            }
            return new C12971a(formattedMoney, fVar, false, 12);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v33, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v47, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v50, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v51, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v53, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v54, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v56, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v40, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v41, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v43, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v63, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v65, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v88, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v89, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: type inference failed for: r8v43 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r8v79 */
    /* JADX WARNING: type inference failed for: r37v5, types: [com.etsy.android.ui.listing.ui.buybox.personalization.optional.a] */
    /* JADX WARNING: type inference failed for: r26v5, types: [com.etsy.android.ui.listing.ui.buybox.personalization.required.a] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0268, code lost:
        if (r6 != null) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x026a, code lost:
        r6 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x026b, code lost:
        r10 = new com.etsy.android.p327ui.listing.p329ui.shop.shopheader.C10644a.C10646b.C10647a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x026f, code lost:
        r6 = r59.getShop();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0273, code lost:
        if (r6 == null) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0275, code lost:
        r6 = kotlin.jvm.internal.C19383o.m32792b(r6.getHasIcon(), java.lang.Boolean.TRUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0280, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0283, code lost:
        if (r6 == false) goto L_0x0296;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0285, code lost:
        r6 = r59.getShop();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0289, code lost:
        if (r6 == null) goto L_0x02a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x028b, code lost:
        r6 = r6.getIcon();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x028f, code lost:
        if (r6 == null) goto L_0x02a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0291, code lost:
        r6 = com.etsy.android.lib.models.apiv3.listing.ShopIconKt.urlForSize(r6, 25, 25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0296, code lost:
        r6 = r59.getSeller();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x029a, code lost:
        if (r6 == null) goto L_0x02a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x029c, code lost:
        r6 = r6.getAvatar();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02a0, code lost:
        if (r6 == null) goto L_0x02a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02a2, code lost:
        r6 = com.etsy.android.lib.models.apiv3.listing.extensions.ImageExtensionsKt.pickBestImageSource(r6, 25, 25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02a6, code lost:
        r23 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02a9, code lost:
        r23 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02ab, code lost:
        r8 = r59.getShop();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02b1, code lost:
        if (r8 == null) goto L_0x02b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02b3, code lost:
        r12 = r8.getShopName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02b7, code lost:
        r8 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02bb, code lost:
        if (r8 != null) goto L_0x02c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02bd, code lost:
        r17 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02c0, code lost:
        r17 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02c2, code lost:
        r8 = r59.getShopRating();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02c6, code lost:
        if (r8 == null) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02c8, code lost:
        r8 = r8.getRating();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02cc, code lost:
        if (r8 == null) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02ce, code lost:
        r8 = r8.floatValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02d3, code lost:
        r8 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02d4, code lost:
        r19 = r8;
        r8 = r59.getShopRating();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02da, code lost:
        if (r8 == null) goto L_0x02e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02dc, code lost:
        r8 = r8.getRatingCount();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02e0, code lost:
        if (r8 == null) goto L_0x02e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02e2, code lost:
        r8 = r8.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02e7, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02e8, code lost:
        r20 = r8;
        r21 = com.etsy.android.uikit.p331ui.core.NumericRatingView.ReviewCountDisplayType.FULL;
        r22 = com.etsy.android.uikit.p331ui.core.NumericRatingView.ReviewCountColor.BLUE;
        r8 = r59.getShop();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02f6, code lost:
        if (r8 == null) goto L_0x0346;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02f8, code lost:
        r8 = r8.getStarSeller();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02fc, code lost:
        if (r8 == null) goto L_0x0346;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02fe, code lost:
        r8 = r8.getBadge();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0302, code lost:
        if (r8 == null) goto L_0x0346;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0304, code lost:
        r26 = r8.getLabel();
        r27 = r8.getModalTitle();
        r28 = r8.getModalBody();
        r62 = "";
        r9 = new java.lang.StringBuilder();
        r32 = r15;
        r9.append(r8.getEventName());
        r9.append("_badge_clicked");
        r24 = new com.etsy.android.p327ui.listing.p329ui.shop.shopheader.C10644a.C10645a(true, r26, r27, r28, r9.toString(), r8.getEventName() + "_badge_viewed", 64);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0346, code lost:
        r62 = "";
        r32 = r15;
        r24 = new com.etsy.android.p327ui.listing.p329ui.shop.shopheader.C10644a.C10645a(false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 127);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0361, code lost:
        r5 = new com.etsy.android.p327ui.listing.p329ui.C10409f.C10415d(new com.etsy.android.p327ui.listing.p329ui.shop.shopheader.C10644a(r17, r18, r19, r20, r21, r22, r23, r24));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x036b, code lost:
        if (r2.f22893a == false) goto L_0x037c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x036f, code lost:
        if (r2.f22894b == false) goto L_0x037c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0371, code lost:
        r6 = r2.f22895c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0373, code lost:
        if (r6 != null) goto L_0x0379;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0375, code lost:
        r6 = r59.getTitle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0379, code lost:
        r8 = r2.f22896d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x037c, code lost:
        r6 = r59.getTitle();
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0381, code lost:
        r6 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0387, code lost:
        if (r6 != null) goto L_0x038b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0389, code lost:
        r6 = r62;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x038b, code lost:
        r13 = new com.etsy.android.p327ui.listing.p329ui.buybox.title.C10313d(r6, org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r8), false);
        r8 = r59.getShop();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0399, code lost:
        if (r8 == null) goto L_0x03a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x039b, code lost:
        r8 = r8.getShopName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03a0, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03a1, code lost:
        r8 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03a5, code lost:
        if (r8 != null) goto L_0x03a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03a7, code lost:
        r8 = r62;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03a9, code lost:
        r9 = r59.getShop();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03ad, code lost:
        if (r9 == null) goto L_0x03fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03af, code lost:
        r9 = r9.getStarSeller();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03b3, code lost:
        if (r9 == null) goto L_0x03fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03b5, code lost:
        r9 = r9.getBadge();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03b9, code lost:
        if (r9 == null) goto L_0x03fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03bb, code lost:
        r17 = r9.getLabel();
        r18 = r9.getModalTitle();
        r19 = r9.getModalBody();
        r15 = new java.lang.StringBuilder();
        r35 = r7;
        r15.append(r9.getEventName());
        r15.append("_badge_clicked");
        r15 = new com.etsy.android.p327ui.listing.p329ui.buybox.shopname.C10304a.C10305a(true, r17, r18, r19, r15.toString(), r9.getEventName() + "_badge_viewed", 64);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03fb, code lost:
        r35 = r7;
        r24 = new com.etsy.android.p327ui.listing.p329ui.buybox.shopname.C10304a.C10305a(false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 127);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0412, code lost:
        r6 = new com.etsy.android.p327ui.listing.p329ui.buybox.shopname.C10304a(r8, r23);
        r7 = com.etsy.android.p327ui.listing.p329ui.buybox.stockindicator.StockIndicator.C10306a.m18362a(r1, r59.getOfferings(), r0.f22878a.f22335a.mo21132b(com.etsy.android.lib.config.C8592b.C8601i.f18891e), r0.f22881d);
        r8 = r16.f22631b;
        r9 = r59.getOfferings();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0431, code lost:
        if (r9 == null) goto L_0x0438;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0433, code lost:
        r9 = r9.getUi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0438, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0439, code lost:
        r15 = mo33972c(r9, r1, r8);
        r8 = p382kd.C12992a.f28602c;
        r16 = p382kd.C12992a.C12993a.m20687a(r1, r0.f22881d);
        r8 = r59.getOfferings();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0449, code lost:
        if (r8 == null) goto L_0x0456;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x044b, code lost:
        r8 = r8.getUi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x044f, code lost:
        if (r8 == null) goto L_0x0456;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0451, code lost:
        r8 = r8.getUnitPriceString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0456, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0457, code lost:
        r8 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x045f, code lost:
        if (p628nj.C18263b.m30839d0(r8) == false) goto L_0x046e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0461, code lost:
        kotlin.jvm.internal.C19383o.m32796f(r8, "unitPrice");
        r17 = new p406nd.C13111a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x046e, code lost:
        r17 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0471, code lost:
        r8 = p421pd.C13217a.f29062a;
        r8.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x047a, code lost:
        if (r59.isVatInclusive() == false) goto L_0x047d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x047d, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x047e, code lost:
        r18 = r8;
        r8 = r59.getPriceMessaging();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0484, code lost:
        if (r8 == null) goto L_0x0491;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0486, code lost:
        r8 = r8.getTransparentPriceMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x048a, code lost:
        if (r8 == null) goto L_0x0491;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x048c, code lost:
        r8 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0491, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0492, code lost:
        if (r8 != null) goto L_0x0496;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0494, code lost:
        r8 = r62;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x049a, code lost:
        if (p628nj.C18263b.m30839d0(r8) == false) goto L_0x04a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x049c, code lost:
        r19 = new p398md.C13048a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x04a4, code lost:
        r19 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04a7, code lost:
        r10 = null;
        r8 = com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.C10334a.C10335a.m18380a(r59.getOfferings(), (com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption) null, r3, r0.f22884g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04b2, code lost:
        if (r8 != null) goto L_0x04cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x04b4, code lost:
        r8 = r59.getVariations();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x04b8, code lost:
        if (r8 == null) goto L_0x04c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x04ba, code lost:
        r8 = (com.etsy.android.lib.models.apiv3.listing.Variation) kotlin.collections.C19327t.m32640V0(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x04c0, code lost:
        if (r8 == null) goto L_0x04c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04c2, code lost:
        r9 = new com.etsy.android.p327ui.listing.p329ui.buybox.variations.listing.C10349a(r8, (com.etsy.android.lib.models.apiv3.listing.VariationValue) null, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04c8, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x04c9, code lost:
        r20 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04cc, code lost:
        r20 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04ce, code lost:
        r8 = com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.C10336b.C10337a.m18383a(r59.getOfferings(), (com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption) null, r3, r0.f22884g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04d8, code lost:
        if (r8 != null) goto L_0x04f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x04da, code lost:
        r8 = r59.getVariations();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04de, code lost:
        if (r8 == null) goto L_0x04ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04e0, code lost:
        r8 = (com.etsy.android.lib.models.apiv3.listing.Variation) kotlin.collections.C19327t.m32641W0(1, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04e7, code lost:
        if (r8 == null) goto L_0x04ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04e9, code lost:
        r9 = new com.etsy.android.p327ui.listing.p329ui.buybox.variations.listing.C10350b(r8, (com.etsy.android.lib.models.apiv3.listing.VariationValue) null, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04ef, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04f0, code lost:
        r21 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04f3, code lost:
        r21 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04f5, code lost:
        r8 = r59.getSingleListingCheckout();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04f9, code lost:
        if (r8 == null) goto L_0x0509;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04fb, code lost:
        r8 = r8.getKlarnaMessaging();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04ff, code lost:
        if (r8 == null) goto L_0x0509;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0501, code lost:
        r22 = new com.etsy.android.p327ui.listing.p329ui.buybox.klarna.C10260a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0509, code lost:
        r22 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x050b, code lost:
        r8 = r59.getDetailedFreeShipping();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x050f, code lost:
        if (r8 == null) goto L_0x053d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0511, code lost:
        r9 = r8.getFormattedMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0515, code lost:
        if (r9 == null) goto L_0x0527;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0517, code lost:
        r9 = r9.getBody();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x051b, code lost:
        if (r9 == null) goto L_0x0527;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x051d, code lost:
        r9 = r9.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0521, code lost:
        if (r9 == null) goto L_0x0527;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0523, code lost:
        r10 = p628nj.C18263b.m30818M(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0527, code lost:
        r8 = r8.getFormattedMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x052d, code lost:
        if (r8 == null) goto L_0x0535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x052f, code lost:
        r8 = r8.getTitle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0533, code lost:
        if (r8 != null) goto L_0x0537;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0535, code lost:
        r8 = r62;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0537, code lost:
        r23 = new com.etsy.android.p327ui.listing.p329ui.buybox.freeshipping.C10258a(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x053d, code lost:
        r23 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0540, code lost:
        r8 = r59.getListing();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x054c, code lost:
        if (r59.getListing().isSoldOut() == false) goto L_0x0557;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x054e, code lost:
        r36 = r5;
        r24 = null;
        r25 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0557, code lost:
        r9 = r59.getOfferings();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x055b, code lost:
        if (r9 == null) goto L_0x0562;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x055d, code lost:
        r9 = r9.getUi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0562, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0563, code lost:
        if (r9 == null) goto L_0x05dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0565, code lost:
        r10 = r9.getHasVariableQuantity();
        r12 = java.lang.Boolean.TRUE;
        r10 = kotlin.jvm.internal.C19383o.m32792b(r10, r12);
        r24 = r8.isDigital();
        r8 = r8.getPriceUsd();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0577, code lost:
        if (r8 == null) goto L_0x0580;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0579, code lost:
        r8 = r8.intValue();
        r25 = androidx.recyclerview.widget.RecyclerView.MAX_SCROLL_DURATION;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0580, code lost:
        r25 = androidx.recyclerview.widget.RecyclerView.MAX_SCROLL_DURATION;
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0583, code lost:
        r57 = r25;
        r25 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0589, code lost:
        if (r8 >= r57) goto L_0x058d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x058b, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x058d, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x058e, code lost:
        if (r24 != false) goto L_0x0596;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0590, code lost:
        if (r10 == false) goto L_0x0596;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0592, code lost:
        if (r8 == false) goto L_0x0596;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0594, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0596, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0597, code lost:
        if (r8 == false) goto L_0x05da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0599, code lost:
        r8 = r9.getQuantity();
        r10 = new java.lang.Integer[]{1};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x05a7, code lost:
        if (r8 == null) goto L_0x05b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x05a9, code lost:
        r10 = r8.integerSequence();
        r8 = kotlin.jvm.internal.C19383o.m32792b(r8.getEnabled(), r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x05b6, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x05b7, code lost:
        kotlin.jvm.internal.C19383o.m32797g(r10, "<this>");
        r12 = r10.length;
        r14 = new int[r12];
        r36 = r5;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x05c7, code lost:
        if (r5 >= r12) goto L_0x05d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x05c9, code lost:
        r14[r5] = r10[r5].intValue();
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x05d4, code lost:
        r9 = new com.etsy.android.p327ui.listing.p329ui.buybox.quantity.C10299a(1, r8, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x05da, code lost:
        r36 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x05dd, code lost:
        r36 = r5;
        r25 = r3;
        r9 = r8.getQuantity();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x05e6, code lost:
        if (r9 == null) goto L_0x05ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x05e8, code lost:
        r9 = r9.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x05ed, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x05ee, code lost:
        if (r9 <= 1) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x05f0, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x05f2, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x05f3, code lost:
        r9 = r8.isDigital();
        r10 = r8.getPriceUsd();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x05fb, code lost:
        if (r10 == null) goto L_0x0604;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x05fd, code lost:
        r10 = r10.intValue();
        r12 = androidx.recyclerview.widget.RecyclerView.MAX_SCROLL_DURATION;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0604, code lost:
        r12 = androidx.recyclerview.widget.RecyclerView.MAX_SCROLL_DURATION;
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0607, code lost:
        if (r10 >= r12) goto L_0x060b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0609, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x060b, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x060c, code lost:
        if (r9 != false) goto L_0x0614;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x060e, code lost:
        if (r5 == false) goto L_0x0614;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0610, code lost:
        if (r10 == false) goto L_0x0614;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0612, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0614, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0615, code lost:
        if (r5 == false) goto L_0x0635;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0617, code lost:
        r5 = r8.getQuantity();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x061b, code lost:
        if (r5 == null) goto L_0x0622;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x061d, code lost:
        r5 = r5.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0622, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0623, code lost:
        r8 = new int[r5];
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0626, code lost:
        if (r9 >= r5) goto L_0x062e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0628, code lost:
        r10 = r9 + 1;
        r8[r9] = r10;
        r9 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x062e, code lost:
        r9 = new com.etsy.android.p327ui.listing.p329ui.buybox.quantity.C10299a(1, true, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0635, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0636, code lost:
        r24 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0638, code lost:
        r5 = r59.getPersonalization();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x063c, code lost:
        if (r5 == null) goto L_0x06a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x063e, code lost:
        r8 = r5.isPersonalizable();
        r9 = java.lang.Boolean.TRUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0648, code lost:
        if (kotlin.jvm.internal.C19383o.m32792b(r8, r9) == false) goto L_0x06a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x064a, code lost:
        r8 = kotlin.jvm.internal.C19383o.m32792b(r5.isRequired(), r9);
        r9 = 256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0654, code lost:
        if (r8 == false) goto L_0x067f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0656, code lost:
        r10 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r5.getPersonalizationInstructions());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0660, code lost:
        if (r10 != null) goto L_0x0665;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0662, code lost:
        r28 = r62;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0665, code lost:
        r28 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0667, code lost:
        r5 = r5.getBuyerPersonalizationCharCountMax();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x066b, code lost:
        if (r5 == null) goto L_0x0671;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x066d, code lost:
        r9 = r5.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0671, code lost:
        r26 = new com.etsy.android.p327ui.listing.p329ui.buybox.personalization.required.C10285a(false, r28, r9, (java.lang.Integer) null, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x067f, code lost:
        r10 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r5.getPersonalizationInstructions());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0689, code lost:
        if (r10 != null) goto L_0x068e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x068b, code lost:
        r39 = r62;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x068e, code lost:
        r39 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0690, code lost:
        r5 = r5.getBuyerPersonalizationCharCountMax();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0694, code lost:
        if (r5 == null) goto L_0x069a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0696, code lost:
        r9 = r5.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x069a, code lost:
        r37 = new com.etsy.android.p327ui.listing.p329ui.buybox.personalization.optional.C10279a(false, r39, r9, (java.lang.Integer) null, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x06a8, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x06aa, code lost:
        r5 = com.etsy.android.p327ui.listing.p329ui.buybox.buynow.gpay.C10223a.C10224a.m18299a(r1, r60.getIdAsLongDeprecated());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x06b2, code lost:
        if (r5 == null) goto L_0x06b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x06b5, code lost:
        r5 = com.etsy.android.p327ui.listing.p329ui.buybox.buynow.expresscheckout.C10212a.C10213a.m18292a(r1, r60.getIdAsLongDeprecated());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x06bd, code lost:
        r26 = r5;
        r27 = com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.C10225a.C10226a.m18303a(r1, java.lang.Long.valueOf(r60.getIdAsLongDeprecated()));
        r5 = r59.getSingleListingCheckout();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x06cf, code lost:
        if (r5 == null) goto L_0x06d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x06d1, code lost:
        r5 = r5.getPurchaseAcceptTermsText();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x06d6, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x06d7, code lost:
        r9 = r59.getSingleListingCheckout();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x06db, code lost:
        if (r9 == null) goto L_0x06e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x06dd, code lost:
        r9 = kotlin.jvm.internal.C19383o.m32792b(r9.getAcceptsGooglePay(), java.lang.Boolean.TRUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x06e8, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x06e9, code lost:
        r10 = r59.getSingleListingCheckout();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x06ed, code lost:
        if (r10 == null) goto L_0x06fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x06ef, code lost:
        r10 = kotlin.jvm.internal.C19383o.m32792b(r10.isExpressCheckoutEligible(), java.lang.Boolean.TRUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x06fa, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x06fb, code lost:
        if (r10 == false) goto L_0x0773;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x06fd, code lost:
        if (r9 == false) goto L_0x0773;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0703, code lost:
        if (p628nj.C18263b.m30839d0(r5) == false) goto L_0x0773;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0705, code lost:
        r5 = p628nj.C18263b.m30867s0(r5);
        r12 = 0;
        r9 = (android.text.style.URLSpan[]) r5.getSpans(0, r5.length(), android.text.style.URLSpan.class);
        r10 = new android.text.SpannableStringBuilder(r5);
        kotlin.jvm.internal.C19383o.m32796f(r9, "urlSpans");
        r5 = r9.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0721, code lost:
        if (r12 >= r5) goto L_0x076b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0723, code lost:
        r14 = r9[r12];
        r28 = r5;
        r5 = r10.getSpanStart(r14);
        r29 = r9;
        r9 = r10.getSpanEnd(r14);
        r10.removeSpan(r14);
        r14 = r14.getURL();
        r30 = com.etsy.android.lib.util.C8915n.f19672a;
        r37 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:?, code lost:
        r2 = "www.etsy.com".equals(new java.net.URL(r14).getHost());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x074c, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x076b, code lost:
        r37 = r4;
        r2 = new com.etsy.android.p327ui.listing.p329ui.buybox.termsandconditions.C10307a(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0773, code lost:
        r37 = r4;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0776, code lost:
        r28 = r2;
        r2 = p362hd.C12812a.f28297a;
        r4 = r60.getIdAsLongDeprecated();
        r2.getClass();
        r9 = r59.getSeller();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0785, code lost:
        if (r9 == null) goto L_0x0798;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0787, code lost:
        r9 = r9.getUserId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x078b, code lost:
        if (r9 != null) goto L_0x078e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0794, code lost:
        if (r9.longValue() != r4) goto L_0x0798;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0796, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0798, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0799, code lost:
        if (r4 == false) goto L_0x07a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x079b, code lost:
        r2 = 1;
        r29 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x07a0, code lost:
        r4 = r59.getSingleListingCheckout();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x07a4, code lost:
        if (r4 == null) goto L_0x07ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x07a6, code lost:
        r5 = r4.isExpressCheckoutEligible();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x07aa, code lost:
        if (r5 == null) goto L_0x07b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x07ac, code lost:
        r5 = r5.booleanValue();
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x07b2, code lost:
        r9 = true;
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x07b6, code lost:
        if ((!r5) == false) goto L_0x07cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x07b8, code lost:
        r4 = r4.getIneligibilityErrorCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x07bc, code lost:
        if (r4 != null) goto L_0x07bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x07c5, code lost:
        if (438 != r4.intValue()) goto L_0x07c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x07c7, code lost:
        r4 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x07c9, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x07ca, code lost:
        if (r4 == false) goto L_0x07cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x07cc, code lost:
        r4 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x07ce, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x07cf, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x07d0, code lost:
        if (r4 == false) goto L_0x07d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x07d3, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x07d4, code lost:
        r29 = r2;
        r2 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x07d7, code lost:
        r4 = r59.getListingNudge();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x07db, code lost:
        if (r4 != null) goto L_0x07e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x07dd, code lost:
        r4 = r59.getOfferings();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x07e1, code lost:
        if (r4 == null) goto L_0x07e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x07e3, code lost:
        r4 = r4.getNudge();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x07e8, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x07e9, code lost:
        r30 = m18420a(r4, r59.getListing().canAddToCart());
        r4 = com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.C10225a.C10226a.m18303a(r1, java.lang.Long.valueOf(r60.getIdAsLongDeprecated()));
        r5 = com.etsy.android.p327ui.listing.p329ui.buybox.buynow.gpay.C10223a.C10224a.m18299a(r1, r60.getIdAsLongDeprecated());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0809, code lost:
        if (r5 == null) goto L_0x080c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x080c, code lost:
        r5 = com.etsy.android.p327ui.listing.p329ui.buybox.buynow.expresscheckout.C10212a.C10213a.m18292a(r1, r60.getIdAsLongDeprecated());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0814, code lost:
        r34 = r9;
        r9 = new com.etsy.android.p327ui.listing.p329ui.bottombuybuttoms.C10196a(r5, r4);
        r10 = r25;
        r14 = r7;
        r7 = r32;
        r12 = new com.etsy.android.p327ui.listing.p329ui.C10409f.C10410a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r8, r26, r27, r28, r29, r30, r7, r6, r16, r34);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0838, code lost:
        if (r0.f22878a.mo33537a() != false) goto L_0x086f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x083a, code lost:
        r3 = r59.getOverview();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x083e, code lost:
        if (r3 == null) goto L_0x0865;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0840, code lost:
        r6 = new java.util.ArrayList(kotlin.collections.C19322o.m32624F0(r3));
        r3 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0851, code lost:
        if (r3.hasNext() == false) goto L_0x0867;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0853, code lost:
        r6.add(java.lang.String.valueOf(org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r3.next())));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0865, code lost:
        r6 = kotlin.collections.EmptyList.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x0867, code lost:
        r39 = new com.etsy.android.p327ui.listing.p329ui.panels.overview.C10518b(r6, r2, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x086f, code lost:
        r39 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0871, code lost:
        r3 = r0.f22882e;
        kotlin.jvm.internal.C19383o.m32797g(r3, "resourceProvider");
        r6 = r59.getShop();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x087a, code lost:
        if (r6 == null) goto L_0x0887;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x087c, code lost:
        r6 = kotlin.jvm.internal.C19383o.m32792b(r6.isUsingStructuredPolicies(), java.lang.Boolean.FALSE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0887, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0888, code lost:
        if (r6 == false) goto L_0x0a62;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x088a, code lost:
        r42 = r59.getListing().isDigital();
        r43 = r59.getListing().isSoldOut();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x089a, code lost:
        if (r42 == false) goto L_0x08a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x089c, code lost:
        r6 = r3.mo38059c(com.etsy.android.R.string.shop_policies, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x08a6, code lost:
        r6 = r3.mo38059c(com.etsy.android.R.string.shipping_and_policies, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x08af, code lost:
        r41 = r6;
        r6 = r59.getListing().getPaymentMethods();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x08b9, code lost:
        if (r6 != null) goto L_0x08bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x08bb, code lost:
        r6 = kotlin.collections.EmptyList.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x08c1, code lost:
        if ((r6 instanceof java.util.Collection) == false) goto L_0x08ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x08c7, code lost:
        if (r6.isEmpty() == false) goto L_0x08ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x08ca, code lost:
        r8 = r6.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x08d2, code lost:
        if (r8.hasNext() == false) goto L_0x08f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x08d4, code lost:
        r13 = (java.lang.String) r8.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x08e0, code lost:
        if (kotlin.jvm.internal.C19383o.m32792b(r13, "paypal") != false) goto L_0x08eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x08e6, code lost:
        if (kotlin.jvm.internal.C19383o.m32792b(r13, "cc") == false) goto L_0x08e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x08e9, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x08eb, code lost:
        r13 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x08ec, code lost:
        if (r13 == false) goto L_0x08ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x08ee, code lost:
        r45 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x08f1, code lost:
        r45 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x08f3, code lost:
        r8 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x08fe, code lost:
        if (r6.contains("other") == false) goto L_0x090c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x0900, code lost:
        r8.add(r3.mo38059c(com.etsy.android.R.string.payment_method_label_other, new java.lang.Object[0]));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x0912, code lost:
        if (r6.contains(com.etsy.android.lib.models.apiv3.cart.PaymentMethod.TYPE_CHECK) == false) goto L_0x0920;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x0914, code lost:
        r8.add(r3.mo38059c(com.etsy.android.R.string.payment_method_label_check, new java.lang.Object[0]));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x0926, code lost:
        if (r6.contains("mo") == false) goto L_0x0934;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0928, code lost:
        r8.add(r3.mo38059c(com.etsy.android.R.string.payment_method_label_money_order, new java.lang.Object[0]));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x093a, code lost:
        if (r6.contains("bt") == false) goto L_0x0948;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x093c, code lost:
        r8.add(r3.mo38059c(com.etsy.android.R.string.payment_method_label_bank_transfer, new java.lang.Object[0]));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x0948, code lost:
        r8 = kotlin.collections.C19327t.m32644Z0(r8, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (p753kq.C19857l) null, 63);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x095c, code lost:
        if (p628nj.C18263b.m30839d0(r8) == false) goto L_0x0961;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x095e, code lost:
        r46 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x0961, code lost:
        r46 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x0963, code lost:
        r47 = com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.C10564g.C10565a.m18516a(r59);
        r8 = r59.getShipping();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x096b, code lost:
        if (r8 == null) goto L_0x0999;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x0975, code lost:
        if (r59.getListing().isDigital() != false) goto L_0x0995;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x097f, code lost:
        if (kotlinx.coroutines.C19543e0.m33306Y(r8.getShipsTo()) == false) goto L_0x0995;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0981, code lost:
        r14 = new java.lang.Object[r2];
        r14[0] = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r8.getShipsFrom());
        r8 = r3.mo38059c(com.etsy.android.R.string.shipping_ships_from, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0995, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0996, code lost:
        r48 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x0999, code lost:
        r48 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x099b, code lost:
        r8 = r59.getShipping();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x09a7, code lost:
        if (r59.getListing().isDigital() == false) goto L_0x09b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x09a9, code lost:
        r3 = r3.mo38059c(com.etsy.android.R.string.file_delivery_message, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x09b3, code lost:
        if (r8 == null) goto L_0x09c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x09b5, code lost:
        r13 = kotlin.jvm.internal.C19383o.m32792b(r8.getHasProcessingTimeRange(), java.lang.Boolean.TRUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x09c0, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x09c1, code lost:
        if (r13 == false) goto L_0x09e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x09c3, code lost:
        r3 = r3.mo38059c(com.etsy.android.R.string.shipping_processing_label, new java.lang.Object[0]) + ' ' + r8.getProcessingTimeRange();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x09e4, code lost:
        r49 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x09e7, code lost:
        r49 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x09e9, code lost:
        r44 = r6.contains("cc");
        r50 = kotlin.jvm.internal.C19388s.m32882r0(r59);
        r3 = r59.getSellerDetails();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x09f7, code lost:
        if (r3 == null) goto L_0x0a06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x09f9, code lost:
        r3 = r3.getTraderDistinction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x09fd, code lost:
        if (r3 == null) goto L_0x0a06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x09ff, code lost:
        r51 = android.text.Html.fromHtml(r3, 63);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0a06, code lost:
        r51 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0a08, code lost:
        r3 = r59.getSellerDetails();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0a0c, code lost:
        if (r3 == null) goto L_0x0a1b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x0a0e, code lost:
        r3 = r3.getFormattedString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0a12, code lost:
        if (r3 == null) goto L_0x0a1b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0a14, code lost:
        r52 = android.text.Html.fromHtml(r3, 63);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0a1b, code lost:
        r52 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0a1d, code lost:
        r3 = r59.getShouldUseListingLevelReturnPolicies();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0a21, code lost:
        if (r3 == null) goto L_0x0a2a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0a23, code lost:
        r53 = r3.booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0a2a, code lost:
        r53 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0a2c, code lost:
        r54 = r59.getListingLevelReturnPolicies();
        r3 = r59.getListingLevelReturnPolicies();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0a34, code lost:
        if (r3 == null) goto L_0x0a3e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x0a3a, code lost:
        if (r3.getAcceptsReturns() != r2) goto L_0x0a3e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0a3c, code lost:
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0a3e, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0a3f, code lost:
        if (r3 != false) goto L_0x0a56;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0a41, code lost:
        r3 = r59.getListingLevelReturnPolicies();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0a45, code lost:
        if (r3 == null) goto L_0x0a4f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x0a4b, code lost:
        if (r3.getAcceptsExchanges() != r2) goto L_0x0a4f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0a4d, code lost:
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x0a4f, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x0a50, code lost:
        if (r3 == false) goto L_0x0a53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x0a53, code lost:
        r55 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0a56, code lost:
        r55 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x0a58, code lost:
        r40 = new com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.unstructured.C10615a(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, 9089);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x0a62, code lost:
        r40 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x0a64, code lost:
        r41 = com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.C10590a.C10591a.m18531a(r1, r0.f22882e, r0.f22878a);
        kotlin.jvm.internal.C19383o.m32797g(r0.f22883f, "machineTranslationHelper");
        r3 = r59.getFaqs();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x0a77, code lost:
        if (r3 == null) goto L_0x0ad5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x0a79, code lost:
        r6 = new java.util.ArrayList();
        r3 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x0a86, code lost:
        if (r3.hasNext() == false) goto L_0x0ad0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0a88, code lost:
        r8 = r3.next();
        r12 = r8.getFaqId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0a92, code lost:
        if (r12 == null) goto L_0x0ac9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0a94, code lost:
        r20 = r12.longValue();
        r13 = r8.getLanguage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0a9e, code lost:
        if (r13 != null) goto L_0x0aa3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0aa0, code lost:
        r22 = r62;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x0aa3, code lost:
        r22 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x0aa5, code lost:
        r13 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r8.getQuestion());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0aad, code lost:
        if (r13 != null) goto L_0x0ab2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x0aaf, code lost:
        r23 = r62;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0ab2, code lost:
        r23 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x0ab4, code lost:
        r8 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r8.getAnswer());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x0abc, code lost:
        if (r8 != null) goto L_0x0ac1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0abe, code lost:
        r24 = r62;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0ac1, code lost:
        r24 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0ac3, code lost:
        r19 = new com.etsy.android.p327ui.listing.p329ui.panels.faqs.FaqsPanel.C10461a(r20, r22, r23, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0ac9, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x0aca, code lost:
        if (r12 == null) goto L_0x0a82;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0acc, code lost:
        r6.add(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0ad0, code lost:
        r3 = r61;
        r20 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0ad5, code lost:
        r3 = r61;
        r20 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x0ad9, code lost:
        r6 = r3.f22900h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0adb, code lost:
        if (r6 != null) goto L_0x0adf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x0add, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x0adf, code lost:
        r6 = com.etsy.android.lib.util.C8923u.m17363b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x0ae3, code lost:
        if (r20 == null) goto L_0x0b04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0ae5, code lost:
        r8 = (com.etsy.android.p327ui.listing.p329ui.panels.faqs.FaqsPanel.C10461a) kotlin.collections.C19327t.m32640V0(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x0aeb, code lost:
        if (r8 == null) goto L_0x0b04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x0aed, code lost:
        r8 = r8.f22981b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x0aef, code lost:
        if (r8 == null) goto L_0x0b04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x0af5, code lost:
        if (p628nj.C18263b.m30837c0(r8) == false) goto L_0x0b00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:547:0x0afb, code lost:
        if (kotlin.jvm.internal.C19383o.m32792b(r8, r6) != false) goto L_0x0b00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x0afd, code lost:
        r6 = com.etsy.android.p327ui.listing.p329ui.MachineTranslationViewState.VISIBLE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x0b00, code lost:
        r6 = com.etsy.android.p327ui.listing.p329ui.MachineTranslationViewState.GONE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x0b02, code lost:
        if (r6 != null) goto L_0x0b06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x0b04, code lost:
        r6 = com.etsy.android.p327ui.listing.p329ui.MachineTranslationViewState.GONE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:0x0b06, code lost:
        r23 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x0b08, code lost:
        if (r20 == null) goto L_0x0b21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x0b0e, code lost:
        if (r20.isEmpty() == false) goto L_0x0b11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x0b11, code lost:
        r42 = new com.etsy.android.p327ui.listing.p329ui.panels.faqs.FaqsPanel(r20, kotlin.collections.EmptyList.INSTANCE, com.etsy.android.p327ui.listing.p329ui.panels.faqs.FaqsPanel.LanguageState.ORIGINAL, r23, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x0b21, code lost:
        r42 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x0b23, code lost:
        r43 = com.etsy.android.p327ui.listing.p329ui.panels.reviews.C10521a.C10522a.m18494a(r59);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:0x0b2d, code lost:
        if (r0.f22878a.mo33537a() == false) goto L_0x0b3a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:560:0x0b2f, code lost:
        r3 = com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.ItemDetailsPanel.Companion.m18464a(r1, r3, r0.f22882e, r0.f22883f, java.lang.Boolean.TRUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:0x0b3a, code lost:
        r3 = com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.ItemDetailsPanel.Companion.m18464a(r1, r3, r0.f22882e, r0.f22883f, java.lang.Boolean.FALSE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x0b44, code lost:
        r38 = new com.etsy.android.p327ui.listing.p329ui.C10409f.C10413c(r39, r40, r41, r42, r43, r3);
        r19 = com.etsy.android.p327ui.listing.p329ui.sellerinfo.C10635b.C10636a.m18562a(r0.f22882e, r1, r60);
        r3 = r59.getPromoMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:563:0x0b57, code lost:
        if (r3 == null) goto L_0x0b64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:0x0b59, code lost:
        r6 = r3.getDescription();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x0b5d, code lost:
        if (r6 == null) goto L_0x0b64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:566:0x0b5f, code lost:
        r6 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:0x0b64, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x0b65, code lost:
        if (r6 != null) goto L_0x0b6a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x0b67, code lost:
        r27 = r62;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:0x0b6a, code lost:
        r27 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x0b6c, code lost:
        if (r3 == null) goto L_0x0b79;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:0x0b6e, code lost:
        r3 = r3.getDisclaimer();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:573:0x0b72, code lost:
        if (r3 == null) goto L_0x0b79;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:574:0x0b74, code lost:
        r3 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:0x0b79, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:0x0b7a, code lost:
        if (r3 != null) goto L_0x0b7f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:577:0x0b7c, code lost:
        r28 = r62;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:0x0b7f, code lost:
        r28 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x0b85, code lost:
        if (r27.length() != 0) goto L_0x0b89;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x0b87, code lost:
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x0b89, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:0x0b8a, code lost:
        if (r3 == false) goto L_0x0b8f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:584:0x0b8c, code lost:
        r20 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:0x0b8f, code lost:
        r3 = r59.getShop();
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:586:0x0b95, code lost:
        if (r3 == null) goto L_0x0ba4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:587:0x0b97, code lost:
        r3 = r3.getShopId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:588:0x0b9b, code lost:
        if (r3 == null) goto L_0x0ba4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:589:0x0b9d, code lost:
        r21 = r3.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:590:0x0ba4, code lost:
        r21 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:591:0x0ba6, code lost:
        r3 = r59.getSeller();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:592:0x0baa, code lost:
        if (r3 == null) goto L_0x0bb6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:0x0bac, code lost:
        r3 = r3.getUserId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:594:0x0bb0, code lost:
        if (r3 == null) goto L_0x0bb6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:595:0x0bb2, code lost:
        r12 = r3.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:596:0x0bb6, code lost:
        r20 = new com.etsy.android.p327ui.listing.p329ui.listingpromotion.C10447a(r21, r12, r59.getListing().getListingId(), r27, r28);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:597:0x0bc7, code lost:
        r3 = r59.getProductSafetyNotice();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:598:0x0bcb, code lost:
        if (r3 == null) goto L_0x0be7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:600:0x0bd5, code lost:
        if (kotlinx.coroutines.C19543e0.m33306Y(r3.getMessages()) == false) goto L_0x0be7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:601:0x0bd7, code lost:
        r23 = new com.etsy.android.p327ui.listing.p329ui.productwarninginfo.C10621a(false, r3.getTitle(), r3.getMessages());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:602:0x0be7, code lost:
        r23 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:603:0x0be9, code lost:
        r3 = r0.f22882e;
        kotlin.jvm.internal.C19383o.m32797g(r3, "resourceProvider");
        r8 = java.lang.String.valueOf(r59.getListing().getListingId());
        r11 = r59.getListing().getUrl();
        r2 = new java.lang.Object[r2];
        r12 = com.etsy.android.lib.util.C8885d0.m17321e(new java.util.Date(java.util.concurrent.TimeUnit.SECONDS.toMillis(r59.getListing().getCreateDate())));
        kotlin.jvm.internal.C19383o.m32796f(r12, "formatShortDate(listingCreationDate)");
        r2[0] = r12;
        r6 = new com.etsy.android.p327ui.listing.p329ui.footer.C10417a(r8, r11, r3.mo38059c(com.etsy.android.R.string.listed_on_detailed, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:604:0x0c2e, code lost:
        if (r63 == false) goto L_0x0c33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:605:0x0c30, code lost:
        r2 = p459ud.C13473a.C13477d.f29499b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:606:0x0c33, code lost:
        r2 = p459ud.C13473a.C13475b.f29497b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:607:0x0c35, code lost:
        r22 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:608:0x0c37, code lost:
        if (r63 == false) goto L_0x0c46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:609:0x0c39, code lost:
        r21 = m18421b(r0, r59.getRecentListings(), r0.f22878a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:610:0x0c46, code lost:
        r21 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:612:0x0c5e, code lost:
        return new com.etsy.android.p327ui.listing.p329ui.C10409f(r37, r36, r35, r10, r12, r38, r19, r20, r21, r22, r23, r6, r7, p429qd.C13298a.f29204a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:618:0x0867, code lost:
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0204, code lost:
        if (kotlin.jvm.internal.C19383o.m32792b(r6 != null ? r6.getUserId() : null, r5) != false) goto L_0x0212;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x020f, code lost:
        if (r59.getListing().isVisible() != false) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0212, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0213, code lost:
        r7 = new com.etsy.android.p327ui.listing.p329ui.toppanel.C10658e(r8, r13, r9);
        r6 = r0.f22879b;
        kotlin.jvm.internal.C19383o.m32797g(r6, "numberFormat");
        r8 = r59.getShop();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0223, code lost:
        if (r8 == null) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0225, code lost:
        r8 = r8.getSoldCount();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0229, code lost:
        if (r8 == null) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x022b, code lost:
        r8 = r8.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0230, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0231, code lost:
        r9 = r59.getShop();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0235, code lost:
        if (r9 == null) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0237, code lost:
        r9 = r9.getSoldCount();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x023b, code lost:
        if (r9 == null) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x023d, code lost:
        r9 = r9.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0242, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0243, code lost:
        r6 = r6.format(java.lang.Integer.valueOf(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x024d, code lost:
        if (r8 <= 0) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x024f, code lost:
        kotlin.jvm.internal.C19383o.m32796f(r6, "formattedNumberOfSales");
        r10 = new com.etsy.android.p327ui.listing.p329ui.shop.shopheader.C10644a.C10646b.C10648b(r6, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0259, code lost:
        r18 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x025c, code lost:
        r6 = r59.getShop();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0262, code lost:
        if (r6 == null) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0264, code lost:
        r6 = r6.getLocation();
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r2v3, types: [boolean, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.etsy.android.p327ui.listing.p329ui.C10409f mo33973d(com.etsy.android.lib.models.apiv3.listing.ListingFetch r59, com.etsy.android.lib.models.datatypes.EtsyId r60, com.etsy.android.p327ui.listing.p329ui.C10425l r61, java.lang.Integer r62, boolean r63) {
        /*
            r58 = this;
            r0 = r58
            r1 = r59
            r2 = r61
            com.etsy.android.ui.util.n r3 = r0.f22882e
            java.lang.String r11 = "resourceProvider"
            kotlin.jvm.internal.C19383o.m32797g(r3, r11)
            vd.c r15 = new vd.c
            vd.a r4 = new vd.a
            r5 = 2131165394(0x7f0700d2, float:1.7945004E38)
            int r5 = r3.mo38057a(r5)
            r4.<init>(r5)
            vd.a r5 = new vd.a
            r6 = 2131165398(0x7f0700d6, float:1.7945012E38)
            int r6 = r3.mo38057a(r6)
            r5.<init>(r6)
            vd.a r6 = new vd.a
            r7 = 2131165386(0x7f0700ca, float:1.7944988E38)
            int r7 = r3.mo38057a(r7)
            r6.<init>(r7)
            vd.a r7 = new vd.a
            r8 = 2131165387(0x7f0700cb, float:1.794499E38)
            int r3 = r3.mo38057a(r8)
            r7.<init>(r3)
            r15.<init>(r4, r5, r6, r7)
            com.etsy.android.ui.util.n r3 = r0.f22882e
            kotlin.jvm.internal.C19383o.m32797g(r3, r11)
            java.util.List r3 = com.etsy.android.lib.models.apiv3.listing.extensions.ListingFetchExtensionsKt.convertListingImagesToV2(r59)
            java.util.ArrayList r4 = kotlin.collections.C19327t.m32661q1(r3)
            boolean r3 = kotlinx.coroutines.C19543e0.m33306Y(r4)
            if (r3 == 0) goto L_0x0057
            r3 = 0
            goto L_0x0058
        L_0x0057:
            r3 = -1
        L_0x0058:
            r6 = r3
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Map r3 = r59.getVariationImages()
            if (r3 == 0) goto L_0x0067
            r5.putAll(r3)
        L_0x0067:
            rd.a r14 = new rd.a
            boolean r3 = kotlinx.coroutines.C19543e0.m33306Y(r4)
            r12 = 0
            r7 = 1
            if (r3 == 0) goto L_0x0106
            com.etsy.android.lib.models.apiv3.listing.ListingVideo r3 = r59.getListingVideo()
            if (r3 == 0) goto L_0x0106
            java.lang.String r8 = r3.getUrl()
            boolean r8 = p628nj.C18263b.m30837c0(r8)
            if (r8 == 0) goto L_0x0106
            java.lang.String r8 = r3.getThumbnailUrl()
            boolean r8 = p628nj.C18263b.m30837c0(r8)
            if (r8 == 0) goto L_0x0106
            java.lang.String r49 = r3.getUrl()
            java.lang.String r50 = r3.getThumbnailUrl()
            com.etsy.android.lib.models.apiv3.listing.ListingImage r8 = new com.etsy.android.lib.models.apiv3.listing.ListingImage
            r16 = r8
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r9 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r51 = 1
            r52 = -1
            r53 = 0
            r54 = 0
            r22 = 0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
            r4.add(r7, r8)
            com.etsy.android.uikit.adapter.ListingVideoPosition r7 = new com.etsy.android.uikit.adapter.ListingVideoPosition
            java.lang.String r3 = r3.getUrl()
            kotlin.jvm.internal.C19383o.m32794d(r3)
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.lang.String r8 = "parse(this)"
            kotlin.jvm.internal.C19383o.m32796f(r3, r8)
            r24 = 0
            r26 = 2
            r22 = r7
            r23 = r3
            r27 = r9
            r22.<init>(r23, r24, r26, r27)
            goto L_0x0107
        L_0x0106:
            r7 = r12
        L_0x0107:
            java.lang.String r8 = r59.getVisuallySimilarApiPath()
            com.etsy.android.lib.models.apiv3.listing.Listing r3 = r59.getListing()
            boolean r9 = r3.isDigital()
            r3 = r14
            r10 = r63
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            com.etsy.android.ui.listing.ui.buybox.signal.ListingSignalColumns r3 = new com.etsy.android.ui.listing.ui.buybox.signal.ListingSignalColumns
            com.etsy.android.lib.models.apiv3.listing.ListingDetailedFreeShipping r4 = r59.getDetailedFreeShipping()
            if (r4 == 0) goto L_0x0123
            r4 = 1
            goto L_0x0124
        L_0x0123:
            r4 = 0
        L_0x0124:
            r19 = r4
            com.etsy.android.lib.models.apiv3.listing.ShopRating r4 = r59.getShopRating()
            if (r4 == 0) goto L_0x0137
            java.lang.Float r4 = r4.getRating()
            if (r4 == 0) goto L_0x0137
            float r4 = r4.floatValue()
            goto L_0x0138
        L_0x0137:
            r4 = 0
        L_0x0138:
            r20 = r4
            com.etsy.android.lib.models.apiv3.listing.ShopRating r4 = r59.getShopRating()
            if (r4 == 0) goto L_0x014b
            java.lang.Integer r4 = r4.getRatingCount()
            if (r4 == 0) goto L_0x014b
            int r4 = r4.intValue()
            goto L_0x014c
        L_0x014b:
            r4 = 0
        L_0x014c:
            r21 = r4
            com.etsy.android.uikit.ui.core.NumericRatingView$ReviewCountDisplayType r22 = com.etsy.android.uikit.p331ui.core.NumericRatingView.ReviewCountDisplayType.COMPACT
            r17 = 0
            r18 = 0
            com.etsy.android.ui.listing.ui.buybox.signal.ListingSignalColumns$SignalsState r23 = com.etsy.android.p327ui.listing.p329ui.buybox.signal.ListingSignalColumns.SignalsState.INITIAL
            r16 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            if (r62 != 0) goto L_0x015f
            r4 = r12
            goto L_0x0171
        L_0x015f:
            vd.d r4 = new vd.d
            int r5 = r62.intValue()
            com.etsy.android.ui.util.n r6 = r0.f22882e
            r7 = 2131165267(0x7f070053, float:1.7944746E38)
            int r6 = r6.mo38057a(r7)
            r4.<init>(r5, r6)
        L_0x0171:
            long r5 = r60.getIdAsLongDeprecated()
            com.etsy.android.ui.listing.ui.toppanel.e r7 = new com.etsy.android.ui.listing.ui.toppanel.e
            com.etsy.android.lib.models.apiv3.listing.Shop r8 = r59.getShop()
            if (r8 == 0) goto L_0x018e
            java.lang.Long r8 = r8.getShopId()
            if (r8 != 0) goto L_0x0184
            goto L_0x018e
        L_0x0184:
            long r8 = r8.longValue()
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x018e
            r8 = 1
            goto L_0x018f
        L_0x018e:
            r8 = 0
        L_0x018f:
            if (r8 == 0) goto L_0x0193
            r8 = r12
            goto L_0x01c4
        L_0x0193:
            com.etsy.android.ui.listing.ui.toppanel.favoriteinfo.a r8 = new com.etsy.android.ui.listing.ui.toppanel.favoriteinfo.a
            com.etsy.android.lib.models.apiv3.listing.ListingCard r9 = r59.getListingCard()
            if (r9 == 0) goto L_0x01a6
            java.lang.Boolean r9 = r9.isFavorite()
            if (r9 == 0) goto L_0x01a6
            boolean r9 = r9.booleanValue()
            goto L_0x01a7
        L_0x01a6:
            r9 = 0
        L_0x01a7:
            com.etsy.android.lib.models.apiv3.listing.ListingCard r10 = r59.getListingCard()
            if (r10 == 0) goto L_0x01b8
            java.lang.Boolean r10 = r10.isInCollections()
            if (r10 == 0) goto L_0x01b8
            boolean r10 = r10.booleanValue()
            goto L_0x01b9
        L_0x01b8:
            r10 = 0
        L_0x01b9:
            com.etsy.android.lib.models.apiv3.listing.Listing r13 = r59.getListing()
            java.lang.String r13 = r13.getTitle()
            r8.<init>(r9, r10, r12, r13)
        L_0x01c4:
            com.etsy.android.lib.models.apiv3.listing.Listing r9 = r59.getListing()
            java.lang.String r9 = r9.getUrl()
            if (r9 != 0) goto L_0x01d0
            r13 = r12
            goto L_0x01e9
        L_0x01d0:
            java.util.List r10 = r59.getListingImages()
            if (r10 == 0) goto L_0x01e3
            java.lang.Object r10 = kotlin.collections.C19327t.m32640V0(r10)
            com.etsy.android.lib.models.apiv3.listing.ListingImage r10 = (com.etsy.android.lib.models.apiv3.listing.ListingImage) r10
            if (r10 == 0) goto L_0x01e3
            java.lang.String r10 = r10.getUrl570xN()
            goto L_0x01e4
        L_0x01e3:
            r10 = r12
        L_0x01e4:
            xd.a r13 = new xd.a
            r13.<init>(r9, r10)
        L_0x01e9:
            com.etsy.android.ui.listing.ui.toppanel.contactShopInfo.b r9 = com.etsy.android.p327ui.listing.p329ui.toppanel.contactShopInfo.C10655b.f23425a
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r9.getClass()
            if (r5 == 0) goto L_0x0207
            com.etsy.android.lib.models.apiv3.listing.User r6 = r59.getSeller()
            if (r6 == 0) goto L_0x01ff
            java.lang.Long r6 = r6.getUserId()
            goto L_0x0200
        L_0x01ff:
            r6 = r12
        L_0x0200:
            boolean r5 = kotlin.jvm.internal.C19383o.m32792b(r6, r5)
            if (r5 == 0) goto L_0x0207
            goto L_0x0212
        L_0x0207:
            com.etsy.android.lib.models.apiv3.listing.Listing r5 = r59.getListing()
            boolean r5 = r5.isVisible()
            if (r5 == 0) goto L_0x0212
            goto L_0x0213
        L_0x0212:
            r9 = r12
        L_0x0213:
            r7.<init>(r8, r13, r9)
            com.etsy.android.ui.listing.ui.f$d r5 = new com.etsy.android.ui.listing.ui.f$d
            java.text.NumberFormat r6 = r0.f22879b
            java.lang.String r8 = "numberFormat"
            kotlin.jvm.internal.C19383o.m32797g(r6, r8)
            com.etsy.android.lib.models.apiv3.listing.Shop r8 = r59.getShop()
            if (r8 == 0) goto L_0x0230
            java.lang.Integer r8 = r8.getSoldCount()
            if (r8 == 0) goto L_0x0230
            int r8 = r8.intValue()
            goto L_0x0231
        L_0x0230:
            r8 = 0
        L_0x0231:
            com.etsy.android.lib.models.apiv3.listing.Shop r9 = r59.getShop()
            if (r9 == 0) goto L_0x0242
            java.lang.Integer r9 = r9.getSoldCount()
            if (r9 == 0) goto L_0x0242
            int r9 = r9.intValue()
            goto L_0x0243
        L_0x0242:
            r9 = 0
        L_0x0243:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r6 = r6.format(r9)
            java.lang.String r9 = ""
            if (r8 <= 0) goto L_0x025c
            com.etsy.android.ui.listing.ui.shop.shopheader.a$b$b r10 = new com.etsy.android.ui.listing.ui.shop.shopheader.a$b$b
            java.lang.String r13 = "formattedNumberOfSales"
            kotlin.jvm.internal.C19383o.m32796f(r6, r13)
            r10.<init>(r6, r8)
        L_0x0259:
            r18 = r10
            goto L_0x026f
        L_0x025c:
            com.etsy.android.ui.listing.ui.shop.shopheader.a$b$a r10 = new com.etsy.android.ui.listing.ui.shop.shopheader.a$b$a
            com.etsy.android.lib.models.apiv3.listing.Shop r6 = r59.getShop()
            if (r6 == 0) goto L_0x026a
            java.lang.String r6 = r6.getLocation()
            if (r6 != 0) goto L_0x026b
        L_0x026a:
            r6 = r9
        L_0x026b:
            r10.<init>(r6)
            goto L_0x0259
        L_0x026f:
            com.etsy.android.lib.models.apiv3.listing.Shop r6 = r59.getShop()
            if (r6 == 0) goto L_0x0280
            java.lang.Boolean r6 = r6.getHasIcon()
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r6, r8)
            goto L_0x0281
        L_0x0280:
            r6 = 0
        L_0x0281:
            r8 = 25
            if (r6 == 0) goto L_0x0296
            com.etsy.android.lib.models.apiv3.listing.Shop r6 = r59.getShop()
            if (r6 == 0) goto L_0x02a9
            com.etsy.android.lib.models.apiv3.listing.ShopIcon r6 = r6.getIcon()
            if (r6 == 0) goto L_0x02a9
            java.lang.String r6 = com.etsy.android.lib.models.apiv3.listing.ShopIconKt.urlForSize(r6, r8, r8)
            goto L_0x02a6
        L_0x0296:
            com.etsy.android.lib.models.apiv3.listing.User r6 = r59.getSeller()
            if (r6 == 0) goto L_0x02a9
            com.etsy.android.lib.models.apiv3.listing.Image r6 = r6.getAvatar()
            if (r6 == 0) goto L_0x02a9
            java.lang.String r6 = com.etsy.android.lib.models.apiv3.listing.extensions.ImageExtensionsKt.pickBestImageSource(r6, r8, r8)
        L_0x02a6:
            r23 = r6
            goto L_0x02ab
        L_0x02a9:
            r23 = r12
        L_0x02ab:
            com.etsy.android.ui.listing.ui.shop.shopheader.a r6 = new com.etsy.android.ui.listing.ui.shop.shopheader.a
            com.etsy.android.lib.models.apiv3.listing.Shop r8 = r59.getShop()
            if (r8 == 0) goto L_0x02b7
            java.lang.String r12 = r8.getShopName()
        L_0x02b7:
            java.lang.String r8 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r12)
            if (r8 != 0) goto L_0x02c0
            r17 = r9
            goto L_0x02c2
        L_0x02c0:
            r17 = r8
        L_0x02c2:
            com.etsy.android.lib.models.apiv3.listing.ShopRating r8 = r59.getShopRating()
            if (r8 == 0) goto L_0x02d3
            java.lang.Float r8 = r8.getRating()
            if (r8 == 0) goto L_0x02d3
            float r8 = r8.floatValue()
            goto L_0x02d4
        L_0x02d3:
            r8 = 0
        L_0x02d4:
            r19 = r8
            com.etsy.android.lib.models.apiv3.listing.ShopRating r8 = r59.getShopRating()
            if (r8 == 0) goto L_0x02e7
            java.lang.Integer r8 = r8.getRatingCount()
            if (r8 == 0) goto L_0x02e7
            int r8 = r8.intValue()
            goto L_0x02e8
        L_0x02e7:
            r8 = 0
        L_0x02e8:
            r20 = r8
            com.etsy.android.uikit.ui.core.NumericRatingView$ReviewCountDisplayType r21 = com.etsy.android.uikit.p331ui.core.NumericRatingView.ReviewCountDisplayType.FULL
            com.etsy.android.uikit.ui.core.NumericRatingView$ReviewCountColor r22 = com.etsy.android.uikit.p331ui.core.NumericRatingView.ReviewCountColor.BLUE
            com.etsy.android.lib.models.apiv3.listing.Shop r8 = r59.getShop()
            java.lang.String r10 = "_badge_viewed"
            java.lang.String r12 = "_badge_clicked"
            if (r8 == 0) goto L_0x0346
            com.etsy.android.lib.models.apiv3.StarSeller r8 = r8.getStarSeller()
            if (r8 == 0) goto L_0x0346
            com.etsy.android.lib.models.apiv3.StarSellerBadge r8 = r8.getBadge()
            if (r8 == 0) goto L_0x0346
            com.etsy.android.ui.listing.ui.shop.shopheader.a$a r13 = new com.etsy.android.ui.listing.ui.shop.shopheader.a$a
            r25 = 1
            java.lang.String r26 = r8.getLabel()
            java.lang.String r27 = r8.getModalTitle()
            java.lang.String r28 = r8.getModalBody()
            r62 = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r32 = r15
            java.lang.String r15 = r8.getEventName()
            r9.append(r15)
            r9.append(r12)
            java.lang.String r29 = r9.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r8 = r8.getEventName()
            r9.append(r8)
            r9.append(r10)
            java.lang.String r30 = r9.toString()
            r31 = 64
            r24 = r13
            r24.<init>((boolean) r25, (java.lang.String) r26, (java.lang.String) r27, (java.lang.String) r28, (java.lang.String) r29, (java.lang.String) r30, (int) r31)
            goto L_0x0361
        L_0x0346:
            r62 = r9
            r32 = r15
            com.etsy.android.ui.listing.ui.shop.shopheader.a$a r8 = new com.etsy.android.ui.listing.ui.shop.shopheader.a$a
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 127(0x7f, float:1.78E-43)
            r33 = r8
            r33.<init>((boolean) r34, (java.lang.String) r35, (java.lang.String) r36, (java.lang.String) r37, (java.lang.String) r38, (java.lang.String) r39, (int) r40)
            r24 = r8
        L_0x0361:
            r16 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r5.<init>(r6)
            boolean r6 = r2.f22893a
            if (r6 == 0) goto L_0x037c
            boolean r6 = r2.f22894b
            if (r6 == 0) goto L_0x037c
            java.lang.String r6 = r2.f22895c
            if (r6 != 0) goto L_0x0379
            java.lang.String r6 = r59.getTitle()
        L_0x0379:
            java.lang.String r8 = r2.f22896d
            goto L_0x0381
        L_0x037c:
            java.lang.String r6 = r59.getTitle()
            r8 = 0
        L_0x0381:
            com.etsy.android.ui.listing.ui.buybox.title.d r13 = new com.etsy.android.ui.listing.ui.buybox.title.d
            java.lang.String r6 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r6)
            if (r6 != 0) goto L_0x038b
            r6 = r62
        L_0x038b:
            java.lang.String r8 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r8)
            r9 = 0
            r13.<init>(r6, r8, r9)
            com.etsy.android.ui.listing.ui.buybox.shopname.a r6 = new com.etsy.android.ui.listing.ui.buybox.shopname.a
            com.etsy.android.lib.models.apiv3.listing.Shop r8 = r59.getShop()
            if (r8 == 0) goto L_0x03a0
            java.lang.String r8 = r8.getShopName()
            goto L_0x03a1
        L_0x03a0:
            r8 = 0
        L_0x03a1:
            java.lang.String r8 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r8)
            if (r8 != 0) goto L_0x03a9
            r8 = r62
        L_0x03a9:
            com.etsy.android.lib.models.apiv3.listing.Shop r9 = r59.getShop()
            if (r9 == 0) goto L_0x03fb
            com.etsy.android.lib.models.apiv3.StarSeller r9 = r9.getStarSeller()
            if (r9 == 0) goto L_0x03fb
            com.etsy.android.lib.models.apiv3.StarSellerBadge r9 = r9.getBadge()
            if (r9 == 0) goto L_0x03fb
            com.etsy.android.ui.listing.ui.buybox.shopname.a$a r23 = new com.etsy.android.ui.listing.ui.buybox.shopname.a$a
            r16 = 1
            java.lang.String r17 = r9.getLabel()
            java.lang.String r18 = r9.getModalTitle()
            java.lang.String r19 = r9.getModalBody()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r35 = r7
            java.lang.String r7 = r9.getEventName()
            r15.append(r7)
            r15.append(r12)
            java.lang.String r20 = r15.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = r9.getEventName()
            r7.append(r9)
            r7.append(r10)
            java.lang.String r21 = r7.toString()
            r22 = 64
            r15 = r23
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0412
        L_0x03fb:
            r35 = r7
            com.etsy.android.ui.listing.ui.buybox.shopname.a$a r23 = new com.etsy.android.ui.listing.ui.buybox.shopname.a$a
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 127(0x7f, float:1.78E-43)
            r24 = r23
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
        L_0x0412:
            r7 = r23
            r6.<init>(r8, r7)
            com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext r7 = r59.getOfferings()
            com.etsy.android.ui.listing.h r8 = r0.f22878a
            com.etsy.android.lib.config.e r8 = r8.f22335a
            com.etsy.android.lib.config.EtsyConfigKey r9 = com.etsy.android.lib.config.C8592b.C8601i.f18891e
            boolean r8 = r8.mo21132b(r9)
            com.etsy.android.lib.util.e0 r9 = r0.f22881d
            com.etsy.android.ui.listing.ui.buybox.stockindicator.StockIndicator r7 = com.etsy.android.p327ui.listing.p329ui.buybox.stockindicator.StockIndicator.C10306a.m18362a(r1, r7, r8, r9)
            com.etsy.android.ui.listing.ui.panels.shippingandpolicies.f r8 = r3.f22631b
            com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext r9 = r59.getOfferings()
            if (r9 == 0) goto L_0x0438
            com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartUi r9 = r9.getUi()
            goto L_0x0439
        L_0x0438:
            r9 = 0
        L_0x0439:
            com.etsy.android.ui.listing.ui.j r15 = r0.mo33972c(r9, r1, r8)
            int r8 = p382kd.C12992a.f28602c
            com.etsy.android.lib.util.e0 r8 = r0.f22881d
            kd.a r16 = p382kd.C12992a.C12993a.m20687a(r1, r8)
            com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext r8 = r59.getOfferings()
            if (r8 == 0) goto L_0x0456
            com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartUi r8 = r8.getUi()
            if (r8 == 0) goto L_0x0456
            java.lang.String r8 = r8.getUnitPriceString()
            goto L_0x0457
        L_0x0456:
            r8 = 0
        L_0x0457:
            java.lang.String r8 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r8)
            boolean r9 = p628nj.C18263b.m30839d0(r8)
            if (r9 == 0) goto L_0x046e
            nd.a r9 = new nd.a
            java.lang.String r10 = "unitPrice"
            kotlin.jvm.internal.C19383o.m32796f(r8, r10)
            r9.<init>(r8)
            r17 = r9
            goto L_0x0471
        L_0x046e:
            r8 = 0
            r17 = r8
        L_0x0471:
            pd.a r8 = p421pd.C13217a.f29062a
            r8.getClass()
            boolean r9 = r59.isVatInclusive()
            if (r9 == 0) goto L_0x047d
            goto L_0x047e
        L_0x047d:
            r8 = 0
        L_0x047e:
            r18 = r8
            com.etsy.android.lib.models.apiv3.listing.PriceMessaging r8 = r59.getPriceMessaging()
            if (r8 == 0) goto L_0x0491
            java.lang.String r8 = r8.getTransparentPriceMessage()
            if (r8 == 0) goto L_0x0491
            java.lang.String r8 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r8)
            goto L_0x0492
        L_0x0491:
            r8 = 0
        L_0x0492:
            if (r8 != 0) goto L_0x0496
            r8 = r62
        L_0x0496:
            boolean r9 = p628nj.C18263b.m30839d0(r8)
            if (r9 == 0) goto L_0x04a4
            md.a r9 = new md.a
            r9.<init>(r8)
            r19 = r9
            goto L_0x04a7
        L_0x04a4:
            r8 = 0
            r19 = r8
        L_0x04a7:
            com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext r8 = r59.getOfferings()
            com.etsy.android.ui.core.listingnomapper.listingvariations.a r9 = r0.f22884g
            r10 = 0
            com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.a r8 = com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.C10334a.C10335a.m18380a(r8, r10, r14, r9)
            if (r8 != 0) goto L_0x04cc
            java.util.List r8 = r59.getVariations()
            if (r8 == 0) goto L_0x04c8
            java.lang.Object r8 = kotlin.collections.C19327t.m32640V0(r8)
            com.etsy.android.lib.models.apiv3.listing.Variation r8 = (com.etsy.android.lib.models.apiv3.listing.Variation) r8
            if (r8 == 0) goto L_0x04c8
            com.etsy.android.ui.listing.ui.buybox.variations.listing.a r9 = new com.etsy.android.ui.listing.ui.buybox.variations.listing.a
            r9.<init>(r8, r10, r10)
            goto L_0x04c9
        L_0x04c8:
            r9 = r10
        L_0x04c9:
            r20 = r9
            goto L_0x04ce
        L_0x04cc:
            r20 = r8
        L_0x04ce:
            com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext r8 = r59.getOfferings()
            com.etsy.android.ui.core.listingnomapper.listingvariations.a r9 = r0.f22884g
            com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.b r8 = com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.C10336b.C10337a.m18383a(r8, r10, r14, r9)
            if (r8 != 0) goto L_0x04f3
            java.util.List r8 = r59.getVariations()
            if (r8 == 0) goto L_0x04ef
            r9 = 1
            java.lang.Object r8 = kotlin.collections.C19327t.m32641W0(r9, r8)
            com.etsy.android.lib.models.apiv3.listing.Variation r8 = (com.etsy.android.lib.models.apiv3.listing.Variation) r8
            if (r8 == 0) goto L_0x04ef
            com.etsy.android.ui.listing.ui.buybox.variations.listing.b r9 = new com.etsy.android.ui.listing.ui.buybox.variations.listing.b
            r9.<init>(r8, r10, r10)
            goto L_0x04f0
        L_0x04ef:
            r9 = r10
        L_0x04f0:
            r21 = r9
            goto L_0x04f5
        L_0x04f3:
            r21 = r8
        L_0x04f5:
            com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckout r8 = r59.getSingleListingCheckout()
            if (r8 == 0) goto L_0x0509
            com.etsy.android.lib.models.apiv3.listing.KlarnaOnSiteMessaging r8 = r8.getKlarnaMessaging()
            if (r8 == 0) goto L_0x0509
            com.etsy.android.ui.listing.ui.buybox.klarna.a r9 = new com.etsy.android.ui.listing.ui.buybox.klarna.a
            r9.<init>(r8)
            r22 = r9
            goto L_0x050b
        L_0x0509:
            r22 = r10
        L_0x050b:
            com.etsy.android.lib.models.apiv3.listing.ListingDetailedFreeShipping r8 = r59.getDetailedFreeShipping()
            if (r8 == 0) goto L_0x053d
            com.etsy.android.lib.models.apiv3.DetailedFreeShipping r9 = r8.getFormattedMessage()
            if (r9 == 0) goto L_0x0527
            com.etsy.android.lib.models.apiv3.listing.FormattedMoney r9 = r9.getBody()
            if (r9 == 0) goto L_0x0527
            java.lang.String r9 = r9.toString()
            if (r9 == 0) goto L_0x0527
            android.text.Spanned r10 = p628nj.C18263b.m30818M(r9)
        L_0x0527:
            com.etsy.android.ui.listing.ui.buybox.freeshipping.a r9 = new com.etsy.android.ui.listing.ui.buybox.freeshipping.a
            com.etsy.android.lib.models.apiv3.DetailedFreeShipping r8 = r8.getFormattedMessage()
            if (r8 == 0) goto L_0x0535
            java.lang.String r8 = r8.getTitle()
            if (r8 != 0) goto L_0x0537
        L_0x0535:
            r8 = r62
        L_0x0537:
            r9.<init>(r10, r8)
            r23 = r9
            goto L_0x0540
        L_0x053d:
            r8 = 0
            r23 = r8
        L_0x0540:
            com.etsy.android.lib.models.apiv3.listing.Listing r8 = r59.getListing()
            com.etsy.android.lib.models.apiv3.listing.Listing r9 = r59.getListing()
            boolean r9 = r9.isSoldOut()
            if (r9 == 0) goto L_0x0557
            r8 = 0
            r36 = r5
            r24 = r8
            r25 = r14
            goto L_0x0638
        L_0x0557:
            com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext r9 = r59.getOfferings()
            if (r9 == 0) goto L_0x0562
            com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartUi r9 = r9.getUi()
            goto L_0x0563
        L_0x0562:
            r9 = 0
        L_0x0563:
            if (r9 == 0) goto L_0x05dd
            java.lang.Boolean r10 = r9.getHasVariableQuantity()
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            boolean r10 = kotlin.jvm.internal.C19383o.m32792b(r10, r12)
            boolean r24 = r8.isDigital()
            java.lang.Integer r8 = r8.getPriceUsd()
            if (r8 == 0) goto L_0x0580
            int r8 = r8.intValue()
            r25 = 2000(0x7d0, float:2.803E-42)
            goto L_0x0583
        L_0x0580:
            r25 = 2000(0x7d0, float:2.803E-42)
            r8 = 0
        L_0x0583:
            r57 = r25
            r25 = r14
            r14 = r57
            if (r8 >= r14) goto L_0x058d
            r8 = 1
            goto L_0x058e
        L_0x058d:
            r8 = 0
        L_0x058e:
            if (r24 != 0) goto L_0x0596
            if (r10 == 0) goto L_0x0596
            if (r8 == 0) goto L_0x0596
            r8 = 1
            goto L_0x0597
        L_0x0596:
            r8 = 0
        L_0x0597:
            if (r8 == 0) goto L_0x05da
            com.etsy.android.lib.models.apiv3.listing.RangeSelect r8 = r9.getQuantity()
            r9 = 1
            java.lang.Integer[] r10 = new java.lang.Integer[r9]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r14 = 0
            r10[r14] = r9
            if (r8 == 0) goto L_0x05b6
            java.lang.Integer[] r10 = r8.integerSequence()
            java.lang.Boolean r8 = r8.getEnabled()
            boolean r8 = kotlin.jvm.internal.C19383o.m32792b(r8, r12)
            goto L_0x05b7
        L_0x05b6:
            r8 = 0
        L_0x05b7:
            com.etsy.android.ui.listing.ui.buybox.quantity.a r9 = new com.etsy.android.ui.listing.ui.buybox.quantity.a
            java.lang.String r12 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r10, r12)
            int r12 = r10.length
            int[] r14 = new int[r12]
            r24 = 0
            r36 = r5
            r5 = r24
        L_0x05c7:
            if (r5 >= r12) goto L_0x05d4
            r24 = r10[r5]
            int r24 = r24.intValue()
            r14[r5] = r24
            int r5 = r5 + 1
            goto L_0x05c7
        L_0x05d4:
            r5 = 1
            r9.<init>(r5, r8, r14)
            goto L_0x0636
        L_0x05da:
            r36 = r5
            goto L_0x0635
        L_0x05dd:
            r36 = r5
            r25 = r14
            r5 = 1
            java.lang.Integer r9 = r8.getQuantity()
            if (r9 == 0) goto L_0x05ed
            int r9 = r9.intValue()
            goto L_0x05ee
        L_0x05ed:
            r9 = 0
        L_0x05ee:
            if (r9 <= r5) goto L_0x05f2
            r5 = 1
            goto L_0x05f3
        L_0x05f2:
            r5 = 0
        L_0x05f3:
            boolean r9 = r8.isDigital()
            java.lang.Integer r10 = r8.getPriceUsd()
            if (r10 == 0) goto L_0x0604
            int r10 = r10.intValue()
            r12 = 2000(0x7d0, float:2.803E-42)
            goto L_0x0607
        L_0x0604:
            r12 = 2000(0x7d0, float:2.803E-42)
            r10 = 0
        L_0x0607:
            if (r10 >= r12) goto L_0x060b
            r10 = 1
            goto L_0x060c
        L_0x060b:
            r10 = 0
        L_0x060c:
            if (r9 != 0) goto L_0x0614
            if (r5 == 0) goto L_0x0614
            if (r10 == 0) goto L_0x0614
            r5 = 1
            goto L_0x0615
        L_0x0614:
            r5 = 0
        L_0x0615:
            if (r5 == 0) goto L_0x0635
            java.lang.Integer r5 = r8.getQuantity()
            if (r5 == 0) goto L_0x0622
            int r5 = r5.intValue()
            goto L_0x0623
        L_0x0622:
            r5 = 0
        L_0x0623:
            int[] r8 = new int[r5]
            r9 = 0
        L_0x0626:
            if (r9 >= r5) goto L_0x062e
            int r10 = r9 + 1
            r8[r9] = r10
            r9 = r10
            goto L_0x0626
        L_0x062e:
            com.etsy.android.ui.listing.ui.buybox.quantity.a r9 = new com.etsy.android.ui.listing.ui.buybox.quantity.a
            r5 = 1
            r9.<init>(r5, r5, r8)
            goto L_0x0636
        L_0x0635:
            r9 = 0
        L_0x0636:
            r24 = r9
        L_0x0638:
            com.etsy.android.lib.models.apiv3.listing.ListingPersonalization r5 = r59.getPersonalization()
            if (r5 == 0) goto L_0x06a8
            java.lang.Boolean r8 = r5.isPersonalizable()
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            boolean r8 = kotlin.jvm.internal.C19383o.m32792b(r8, r9)
            if (r8 == 0) goto L_0x06a8
            java.lang.Boolean r8 = r5.isRequired()
            boolean r8 = kotlin.jvm.internal.C19383o.m32792b(r8, r9)
            r9 = 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L_0x067f
            com.etsy.android.ui.listing.ui.buybox.personalization.required.a r8 = new com.etsy.android.ui.listing.ui.buybox.personalization.required.a
            java.lang.String r10 = r5.getPersonalizationInstructions()
            java.lang.String r10 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r10)
            if (r10 != 0) goto L_0x0665
            r28 = r62
            goto L_0x0667
        L_0x0665:
            r28 = r10
        L_0x0667:
            java.lang.Integer r5 = r5.getBuyerPersonalizationCharCountMax()
            if (r5 == 0) goto L_0x0671
            int r9 = r5.intValue()
        L_0x0671:
            r29 = r9
            r30 = 0
            r31 = 0
            r27 = 0
            r26 = r8
            r26.<init>(r27, r28, r29, r30, r31)
            goto L_0x06aa
        L_0x067f:
            com.etsy.android.ui.listing.ui.buybox.personalization.optional.a r8 = new com.etsy.android.ui.listing.ui.buybox.personalization.optional.a
            java.lang.String r10 = r5.getPersonalizationInstructions()
            java.lang.String r10 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r10)
            if (r10 != 0) goto L_0x068e
            r39 = r62
            goto L_0x0690
        L_0x068e:
            r39 = r10
        L_0x0690:
            java.lang.Integer r5 = r5.getBuyerPersonalizationCharCountMax()
            if (r5 == 0) goto L_0x069a
            int r9 = r5.intValue()
        L_0x069a:
            r40 = r9
            r41 = 0
            r42 = 0
            r38 = 0
            r37 = r8
            r37.<init>(r38, r39, r40, r41, r42)
            goto L_0x06aa
        L_0x06a8:
            r5 = 0
            r8 = r5
        L_0x06aa:
            long r9 = r60.getIdAsLongDeprecated()
            com.etsy.android.ui.listing.ui.buybox.buynow.gpay.a r5 = com.etsy.android.p327ui.listing.p329ui.buybox.buynow.gpay.C10223a.C10224a.m18299a(r1, r9)
            if (r5 == 0) goto L_0x06b5
            goto L_0x06bd
        L_0x06b5:
            long r9 = r60.getIdAsLongDeprecated()
            com.etsy.android.ui.listing.ui.buybox.buynow.expresscheckout.a r5 = com.etsy.android.p327ui.listing.p329ui.buybox.buynow.expresscheckout.C10212a.C10213a.m18292a(r1, r9)
        L_0x06bd:
            r26 = r5
            long r9 = r60.getIdAsLongDeprecated()
            java.lang.Long r5 = java.lang.Long.valueOf(r9)
            com.etsy.android.ui.listing.ui.buybox.cartbutton.a r27 = com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.C10225a.C10226a.m18303a(r1, r5)
            com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckout r5 = r59.getSingleListingCheckout()
            if (r5 == 0) goto L_0x06d6
            java.lang.String r5 = r5.getPurchaseAcceptTermsText()
            goto L_0x06d7
        L_0x06d6:
            r5 = 0
        L_0x06d7:
            com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckout r9 = r59.getSingleListingCheckout()
            if (r9 == 0) goto L_0x06e8
            java.lang.Boolean r9 = r9.getAcceptsGooglePay()
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            boolean r9 = kotlin.jvm.internal.C19383o.m32792b(r9, r10)
            goto L_0x06e9
        L_0x06e8:
            r9 = 0
        L_0x06e9:
            com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckout r10 = r59.getSingleListingCheckout()
            if (r10 == 0) goto L_0x06fa
            java.lang.Boolean r10 = r10.isExpressCheckoutEligible()
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            boolean r10 = kotlin.jvm.internal.C19383o.m32792b(r10, r12)
            goto L_0x06fb
        L_0x06fa:
            r10 = 0
        L_0x06fb:
            if (r10 == 0) goto L_0x0773
            if (r9 == 0) goto L_0x0773
            boolean r9 = p628nj.C18263b.m30839d0(r5)
            if (r9 == 0) goto L_0x0773
            android.text.Spanned r5 = p628nj.C18263b.m30867s0(r5)
            int r9 = r5.length()
            java.lang.Class<android.text.style.URLSpan> r10 = android.text.style.URLSpan.class
            r12 = 0
            java.lang.Object[] r9 = r5.getSpans(r12, r9, r10)
            android.text.style.URLSpan[] r9 = (android.text.style.URLSpan[]) r9
            android.text.SpannableStringBuilder r10 = new android.text.SpannableStringBuilder
            r10.<init>(r5)
            java.lang.String r5 = "urlSpans"
            kotlin.jvm.internal.C19383o.m32796f(r9, r5)
            int r5 = r9.length
        L_0x0721:
            if (r12 >= r5) goto L_0x076b
            r14 = r9[r12]
            r28 = r5
            int r5 = r10.getSpanStart(r14)
            r29 = r9
            int r9 = r10.getSpanEnd(r14)
            r10.removeSpan(r14)
            java.lang.String r14 = r14.getURL()
            java.util.List<java.lang.String> r30 = com.etsy.android.lib.util.C8915n.f19672a
            r37 = r4
            java.net.URL r4 = new java.net.URL     // Catch:{ MalformedURLException -> 0x074c }
            r4.<init>(r14)     // Catch:{ MalformedURLException -> 0x074c }
            java.lang.String r2 = "www.etsy.com"
            java.lang.String r4 = r4.getHost()     // Catch:{ MalformedURLException -> 0x074c }
            boolean r2 = r2.equals(r4)     // Catch:{ MalformedURLException -> 0x074c }
            goto L_0x074d
        L_0x074c:
            r2 = 0
        L_0x074d:
            if (r2 != 0) goto L_0x0755
            java.lang.String r2 = "http://www.etsy.com"
            java.lang.String r14 = androidx.appcompat.widget.C0326j.m864i(r2, r14)
        L_0x0755:
            com.etsy.android.uikit.util.EtsyLinkify$UnderlineURLSpan r2 = new com.etsy.android.uikit.util.EtsyLinkify$UnderlineURLSpan
            r4 = 1
            r2.<init>(r14, r4, r4)
            r4 = 33
            r10.setSpan(r2, r5, r9, r4)
            int r12 = r12 + 1
            r2 = r61
            r5 = r28
            r9 = r29
            r4 = r37
            goto L_0x0721
        L_0x076b:
            r37 = r4
            com.etsy.android.ui.listing.ui.buybox.termsandconditions.a r2 = new com.etsy.android.ui.listing.ui.buybox.termsandconditions.a
            r2.<init>(r10)
            goto L_0x0776
        L_0x0773:
            r37 = r4
            r2 = 0
        L_0x0776:
            r28 = r2
            hd.a r2 = p362hd.C12812a.f28297a
            long r4 = r60.getIdAsLongDeprecated()
            r2.getClass()
            com.etsy.android.lib.models.apiv3.listing.User r9 = r59.getSeller()
            if (r9 == 0) goto L_0x0798
            java.lang.Long r9 = r9.getUserId()
            if (r9 != 0) goto L_0x078e
            goto L_0x0798
        L_0x078e:
            long r9 = r9.longValue()
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0798
            r4 = 1
            goto L_0x0799
        L_0x0798:
            r4 = 0
        L_0x0799:
            if (r4 == 0) goto L_0x07a0
            r2 = 1
            r4 = 0
            r29 = r4
            goto L_0x07d7
        L_0x07a0:
            com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckout r4 = r59.getSingleListingCheckout()
            if (r4 == 0) goto L_0x07ce
            java.lang.Boolean r5 = r4.isExpressCheckoutEligible()
            if (r5 == 0) goto L_0x07b2
            boolean r5 = r5.booleanValue()
            r9 = 1
            goto L_0x07b4
        L_0x07b2:
            r9 = 1
            r5 = 0
        L_0x07b4:
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x07cf
            java.lang.Integer r4 = r4.getIneligibilityErrorCode()
            if (r4 != 0) goto L_0x07bf
            goto L_0x07c9
        L_0x07bf:
            int r4 = r4.intValue()
            r5 = 438(0x1b6, float:6.14E-43)
            if (r5 != r4) goto L_0x07c9
            r4 = r9
            goto L_0x07ca
        L_0x07c9:
            r4 = 0
        L_0x07ca:
            if (r4 == 0) goto L_0x07cf
            r4 = r9
            goto L_0x07d0
        L_0x07ce:
            r9 = 1
        L_0x07cf:
            r4 = 0
        L_0x07d0:
            if (r4 == 0) goto L_0x07d3
            goto L_0x07d4
        L_0x07d3:
            r2 = 0
        L_0x07d4:
            r29 = r2
            r2 = r9
        L_0x07d7:
            com.etsy.android.lib.models.apiv3.listing.Nudge r4 = r59.getListingNudge()
            if (r4 != 0) goto L_0x07e9
            com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext r4 = r59.getOfferings()
            if (r4 == 0) goto L_0x07e8
            com.etsy.android.lib.models.apiv3.listing.Nudge r4 = r4.getNudge()
            goto L_0x07e9
        L_0x07e8:
            r4 = 0
        L_0x07e9:
            com.etsy.android.lib.models.apiv3.listing.Listing r5 = r59.getListing()
            boolean r5 = r5.canAddToCart()
            com.etsy.android.ui.listing.ui.buybox.lottienudge.c r30 = m18420a(r4, r5)
            long r4 = r60.getIdAsLongDeprecated()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            com.etsy.android.ui.listing.ui.buybox.cartbutton.a r4 = com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.C10225a.C10226a.m18303a(r1, r4)
            long r9 = r60.getIdAsLongDeprecated()
            com.etsy.android.ui.listing.ui.buybox.buynow.gpay.a r5 = com.etsy.android.p327ui.listing.p329ui.buybox.buynow.gpay.C10223a.C10224a.m18299a(r1, r9)
            if (r5 == 0) goto L_0x080c
            goto L_0x0814
        L_0x080c:
            long r9 = r60.getIdAsLongDeprecated()
            com.etsy.android.ui.listing.ui.buybox.buynow.expresscheckout.a r5 = com.etsy.android.p327ui.listing.p329ui.buybox.buynow.expresscheckout.C10212a.C10213a.m18292a(r1, r9)
        L_0x0814:
            com.etsy.android.ui.listing.ui.bottombuybuttoms.a r9 = new com.etsy.android.ui.listing.ui.bottombuybuttoms.a
            r34 = r9
            r9.<init>(r5, r4)
            com.etsy.android.ui.listing.ui.f$a r4 = new com.etsy.android.ui.listing.ui.f$a
            r12 = r4
            r5 = 0
            r9 = 0
            r10 = r25
            r14 = r7
            r7 = r32
            r25 = r8
            r31 = r7
            r32 = r6
            r33 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            com.etsy.android.ui.listing.ui.f$c r18 = new com.etsy.android.ui.listing.ui.f$c
            com.etsy.android.ui.listing.h r3 = r0.f22878a
            boolean r3 = r3.mo33537a()
            if (r3 != 0) goto L_0x086f
            java.util.List r3 = r59.getOverview()
            if (r3 == 0) goto L_0x0865
            java.util.ArrayList r6 = new java.util.ArrayList
            int r8 = kotlin.collections.C19322o.m32624F0(r3)
            r6.<init>(r8)
            java.util.Iterator r3 = r3.iterator()
        L_0x084d:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x0867
            java.lang.Object r8 = r3.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r8)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r6.add(r8)
            goto L_0x084d
        L_0x0865:
            kotlin.collections.EmptyList r6 = kotlin.collections.EmptyList.INSTANCE
        L_0x0867:
            com.etsy.android.ui.listing.ui.panels.overview.b r3 = new com.etsy.android.ui.listing.ui.panels.overview.b
            r3.<init>(r6, r2, r9)
            r39 = r3
            goto L_0x0871
        L_0x086f:
            r39 = r5
        L_0x0871:
            com.etsy.android.ui.util.n r3 = r0.f22882e
            kotlin.jvm.internal.C19383o.m32797g(r3, r11)
            com.etsy.android.lib.models.apiv3.listing.Shop r6 = r59.getShop()
            if (r6 == 0) goto L_0x0887
            java.lang.Boolean r6 = r6.isUsingStructuredPolicies()
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r6, r8)
            goto L_0x0888
        L_0x0887:
            r6 = r9
        L_0x0888:
            if (r6 == 0) goto L_0x0a62
            com.etsy.android.lib.models.apiv3.listing.Listing r6 = r59.getListing()
            boolean r42 = r6.isDigital()
            com.etsy.android.lib.models.apiv3.listing.Listing r6 = r59.getListing()
            boolean r43 = r6.isSoldOut()
            if (r42 == 0) goto L_0x08a6
            r6 = 2131953516(0x7f13076c, float:1.9543505E38)
            java.lang.Object[] r8 = new java.lang.Object[r9]
            java.lang.String r6 = r3.mo38059c(r6, r8)
            goto L_0x08af
        L_0x08a6:
            r6 = 2131953455(0x7f13072f, float:1.9543381E38)
            java.lang.Object[] r8 = new java.lang.Object[r9]
            java.lang.String r6 = r3.mo38059c(r6, r8)
        L_0x08af:
            r41 = r6
            com.etsy.android.lib.models.apiv3.listing.Listing r6 = r59.getListing()
            java.util.List r6 = r6.getPaymentMethods()
            if (r6 != 0) goto L_0x08bd
            kotlin.collections.EmptyList r6 = kotlin.collections.EmptyList.INSTANCE
        L_0x08bd:
            boolean r8 = r6 instanceof java.util.Collection
            java.lang.String r12 = "cc"
            if (r8 == 0) goto L_0x08ca
            boolean r8 = r6.isEmpty()
            if (r8 == 0) goto L_0x08ca
            goto L_0x08f1
        L_0x08ca:
            java.util.Iterator r8 = r6.iterator()
        L_0x08ce:
            boolean r13 = r8.hasNext()
            if (r13 == 0) goto L_0x08f1
            java.lang.Object r13 = r8.next()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r14 = "paypal"
            boolean r14 = kotlin.jvm.internal.C19383o.m32792b(r13, r14)
            if (r14 != 0) goto L_0x08eb
            boolean r13 = kotlin.jvm.internal.C19383o.m32792b(r13, r12)
            if (r13 == 0) goto L_0x08e9
            goto L_0x08eb
        L_0x08e9:
            r13 = r9
            goto L_0x08ec
        L_0x08eb:
            r13 = r2
        L_0x08ec:
            if (r13 == 0) goto L_0x08ce
            r45 = r2
            goto L_0x08f3
        L_0x08f1:
            r45 = r9
        L_0x08f3:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.String r13 = "other"
            boolean r13 = r6.contains(r13)
            if (r13 == 0) goto L_0x090c
            r13 = 2131952752(0x7f130470, float:1.9541956E38)
            java.lang.Object[] r14 = new java.lang.Object[r9]
            java.lang.String r13 = r3.mo38059c(r13, r14)
            r8.add(r13)
        L_0x090c:
            java.lang.String r13 = "check"
            boolean r13 = r6.contains(r13)
            if (r13 == 0) goto L_0x0920
            r13 = 2131952745(0x7f130469, float:1.9541941E38)
            java.lang.Object[] r14 = new java.lang.Object[r9]
            java.lang.String r13 = r3.mo38059c(r13, r14)
            r8.add(r13)
        L_0x0920:
            java.lang.String r13 = "mo"
            boolean r13 = r6.contains(r13)
            if (r13 == 0) goto L_0x0934
            r13 = 2131952751(0x7f13046f, float:1.9541954E38)
            java.lang.Object[] r14 = new java.lang.Object[r9]
            java.lang.String r13 = r3.mo38059c(r13, r14)
            r8.add(r13)
        L_0x0934:
            java.lang.String r13 = "bt"
            boolean r13 = r6.contains(r13)
            if (r13 == 0) goto L_0x0948
            r13 = 2131952744(0x7f130468, float:1.954194E38)
            java.lang.Object[] r14 = new java.lang.Object[r9]
            java.lang.String r13 = r3.mo38059c(r13, r14)
            r8.add(r13)
        L_0x0948:
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 63
            r19 = r8
            java.lang.String r8 = kotlin.collections.C19327t.m32644Z0(r19, r20, r21, r22, r23, r24)
            boolean r13 = p628nj.C18263b.m30839d0(r8)
            if (r13 == 0) goto L_0x0961
            r46 = r8
            goto L_0x0963
        L_0x0961:
            r46 = r5
        L_0x0963:
            com.etsy.android.ui.listing.ui.panels.shippingandpolicies.g r47 = com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.C10564g.C10565a.m18516a(r59)
            com.etsy.android.lib.models.apiv3.listing.Shipping r8 = r59.getShipping()
            if (r8 == 0) goto L_0x0999
            com.etsy.android.lib.models.apiv3.listing.Listing r13 = r59.getListing()
            boolean r13 = r13.isDigital()
            if (r13 != 0) goto L_0x0995
            java.util.List r13 = r8.getShipsTo()
            boolean r13 = kotlinx.coroutines.C19543e0.m33306Y(r13)
            if (r13 == 0) goto L_0x0995
            r13 = 2131953476(0x7f130744, float:1.9543424E38)
            java.lang.Object[] r14 = new java.lang.Object[r2]
            java.lang.String r8 = r8.getShipsFrom()
            java.lang.String r8 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r8)
            r14[r9] = r8
            java.lang.String r8 = r3.mo38059c(r13, r14)
            goto L_0x0996
        L_0x0995:
            r8 = r5
        L_0x0996:
            r48 = r8
            goto L_0x099b
        L_0x0999:
            r48 = r5
        L_0x099b:
            com.etsy.android.lib.models.apiv3.listing.Shipping r8 = r59.getShipping()
            com.etsy.android.lib.models.apiv3.listing.Listing r13 = r59.getListing()
            boolean r13 = r13.isDigital()
            if (r13 == 0) goto L_0x09b3
            r8 = 2131952272(0x7f130290, float:1.9540982E38)
            java.lang.Object[] r13 = new java.lang.Object[r9]
            java.lang.String r3 = r3.mo38059c(r8, r13)
            goto L_0x09e4
        L_0x09b3:
            if (r8 == 0) goto L_0x09c0
            java.lang.Boolean r13 = r8.getHasProcessingTimeRange()
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            boolean r13 = kotlin.jvm.internal.C19383o.m32792b(r13, r14)
            goto L_0x09c1
        L_0x09c0:
            r13 = r9
        L_0x09c1:
            if (r13 == 0) goto L_0x09e7
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r14 = 2131953474(0x7f130742, float:1.954342E38)
            java.lang.Object[] r15 = new java.lang.Object[r9]
            java.lang.String r3 = r3.mo38059c(r14, r15)
            r13.append(r3)
            r3 = 32
            r13.append(r3)
            java.lang.String r3 = r8.getProcessingTimeRange()
            r13.append(r3)
            java.lang.String r3 = r13.toString()
        L_0x09e4:
            r49 = r3
            goto L_0x09e9
        L_0x09e7:
            r49 = r5
        L_0x09e9:
            boolean r44 = r6.contains(r12)
            java.util.Map r50 = kotlin.jvm.internal.C19388s.m32882r0(r59)
            com.etsy.android.lib.models.apiv3.listing.ShopsSellerPersonalDetails r3 = r59.getSellerDetails()
            r6 = 63
            if (r3 == 0) goto L_0x0a06
            java.lang.String r3 = r3.getTraderDistinction()
            if (r3 == 0) goto L_0x0a06
            android.text.Spanned r3 = android.text.Html.fromHtml(r3, r6)
            r51 = r3
            goto L_0x0a08
        L_0x0a06:
            r51 = r5
        L_0x0a08:
            com.etsy.android.lib.models.apiv3.listing.ShopsSellerPersonalDetails r3 = r59.getSellerDetails()
            if (r3 == 0) goto L_0x0a1b
            java.lang.String r3 = r3.getFormattedString()
            if (r3 == 0) goto L_0x0a1b
            android.text.Spanned r3 = android.text.Html.fromHtml(r3, r6)
            r52 = r3
            goto L_0x0a1d
        L_0x0a1b:
            r52 = r5
        L_0x0a1d:
            java.lang.Boolean r3 = r59.getShouldUseListingLevelReturnPolicies()
            if (r3 == 0) goto L_0x0a2a
            boolean r3 = r3.booleanValue()
            r53 = r3
            goto L_0x0a2c
        L_0x0a2a:
            r53 = r9
        L_0x0a2c:
            com.etsy.android.lib.models.apiv3.listing.ListingLevelReturnPolicies r54 = r59.getListingLevelReturnPolicies()
            com.etsy.android.lib.models.apiv3.listing.ListingLevelReturnPolicies r3 = r59.getListingLevelReturnPolicies()
            if (r3 == 0) goto L_0x0a3e
            boolean r3 = r3.getAcceptsReturns()
            if (r3 != r2) goto L_0x0a3e
            r3 = r2
            goto L_0x0a3f
        L_0x0a3e:
            r3 = r9
        L_0x0a3f:
            if (r3 != 0) goto L_0x0a56
            com.etsy.android.lib.models.apiv3.listing.ListingLevelReturnPolicies r3 = r59.getListingLevelReturnPolicies()
            if (r3 == 0) goto L_0x0a4f
            boolean r3 = r3.getAcceptsExchanges()
            if (r3 != r2) goto L_0x0a4f
            r3 = r2
            goto L_0x0a50
        L_0x0a4f:
            r3 = r9
        L_0x0a50:
            if (r3 == 0) goto L_0x0a53
            goto L_0x0a56
        L_0x0a53:
            r55 = r9
            goto L_0x0a58
        L_0x0a56:
            r55 = r2
        L_0x0a58:
            r56 = 9089(0x2381, float:1.2736E-41)
            com.etsy.android.ui.listing.ui.panels.shippingandpolicies.unstructured.a r3 = new com.etsy.android.ui.listing.ui.panels.shippingandpolicies.unstructured.a
            r40 = r3
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)
            goto L_0x0a64
        L_0x0a62:
            r40 = r5
        L_0x0a64:
            com.etsy.android.ui.util.n r3 = r0.f22882e
            com.etsy.android.ui.listing.h r6 = r0.f22878a
            com.etsy.android.ui.listing.ui.panels.shippingandpolicies.structured.a r41 = com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.C10590a.C10591a.m18531a(r1, r3, r6)
            com.etsy.android.lib.util.u r3 = r0.f22883f
            java.lang.String r6 = "machineTranslationHelper"
            kotlin.jvm.internal.C19383o.m32797g(r3, r6)
            java.util.List r3 = r59.getFaqs()
            if (r3 == 0) goto L_0x0ad5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0a82:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x0ad0
            java.lang.Object r8 = r3.next()
            com.etsy.android.lib.models.apiv3.listing.ShopsFrequentlyAskedQuestion r8 = (com.etsy.android.lib.models.apiv3.listing.ShopsFrequentlyAskedQuestion) r8
            java.lang.Long r12 = r8.getFaqId()
            if (r12 == 0) goto L_0x0ac9
            long r20 = r12.longValue()
            com.etsy.android.ui.listing.ui.panels.faqs.FaqsPanel$a r12 = new com.etsy.android.ui.listing.ui.panels.faqs.FaqsPanel$a
            java.lang.String r13 = r8.getLanguage()
            if (r13 != 0) goto L_0x0aa3
            r22 = r62
            goto L_0x0aa5
        L_0x0aa3:
            r22 = r13
        L_0x0aa5:
            java.lang.String r13 = r8.getQuestion()
            java.lang.String r13 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r13)
            if (r13 != 0) goto L_0x0ab2
            r23 = r62
            goto L_0x0ab4
        L_0x0ab2:
            r23 = r13
        L_0x0ab4:
            java.lang.String r8 = r8.getAnswer()
            java.lang.String r8 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r8)
            if (r8 != 0) goto L_0x0ac1
            r24 = r62
            goto L_0x0ac3
        L_0x0ac1:
            r24 = r8
        L_0x0ac3:
            r19 = r12
            r19.<init>(r20, r22, r23, r24)
            goto L_0x0aca
        L_0x0ac9:
            r12 = r5
        L_0x0aca:
            if (r12 == 0) goto L_0x0a82
            r6.add(r12)
            goto L_0x0a82
        L_0x0ad0:
            r3 = r61
            r20 = r6
            goto L_0x0ad9
        L_0x0ad5:
            r3 = r61
            r20 = r5
        L_0x0ad9:
            java.lang.String r6 = r3.f22900h
            if (r6 != 0) goto L_0x0adf
            r6 = r5
            goto L_0x0ae3
        L_0x0adf:
            java.lang.String r6 = com.etsy.android.lib.util.C8923u.m17363b(r6)
        L_0x0ae3:
            if (r20 == 0) goto L_0x0b04
            java.lang.Object r8 = kotlin.collections.C19327t.m32640V0(r20)
            com.etsy.android.ui.listing.ui.panels.faqs.FaqsPanel$a r8 = (com.etsy.android.p327ui.listing.p329ui.panels.faqs.FaqsPanel.C10461a) r8
            if (r8 == 0) goto L_0x0b04
            java.lang.String r8 = r8.f22981b
            if (r8 == 0) goto L_0x0b04
            boolean r12 = p628nj.C18263b.m30837c0(r8)
            if (r12 == 0) goto L_0x0b00
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r8, r6)
            if (r6 != 0) goto L_0x0b00
            com.etsy.android.ui.listing.ui.MachineTranslationViewState r6 = com.etsy.android.p327ui.listing.p329ui.MachineTranslationViewState.VISIBLE
            goto L_0x0b02
        L_0x0b00:
            com.etsy.android.ui.listing.ui.MachineTranslationViewState r6 = com.etsy.android.p327ui.listing.p329ui.MachineTranslationViewState.GONE
        L_0x0b02:
            if (r6 != 0) goto L_0x0b06
        L_0x0b04:
            com.etsy.android.ui.listing.ui.MachineTranslationViewState r6 = com.etsy.android.p327ui.listing.p329ui.MachineTranslationViewState.GONE
        L_0x0b06:
            r23 = r6
            if (r20 == 0) goto L_0x0b21
            boolean r6 = r20.isEmpty()
            if (r6 == 0) goto L_0x0b11
            goto L_0x0b21
        L_0x0b11:
            com.etsy.android.ui.listing.ui.panels.faqs.FaqsPanel r6 = new com.etsy.android.ui.listing.ui.panels.faqs.FaqsPanel
            kotlin.collections.EmptyList r21 = kotlin.collections.EmptyList.INSTANCE
            com.etsy.android.ui.listing.ui.panels.faqs.FaqsPanel$LanguageState r22 = com.etsy.android.p327ui.listing.p329ui.panels.faqs.FaqsPanel.LanguageState.ORIGINAL
            r24 = 0
            r19 = r6
            r19.<init>(r20, r21, r22, r23, r24)
            r42 = r6
            goto L_0x0b23
        L_0x0b21:
            r42 = r5
        L_0x0b23:
            com.etsy.android.ui.listing.ui.panels.reviews.a r43 = com.etsy.android.p327ui.listing.p329ui.panels.reviews.C10521a.C10522a.m18494a(r59)
            com.etsy.android.ui.listing.h r6 = r0.f22878a
            boolean r6 = r6.mo33537a()
            if (r6 == 0) goto L_0x0b3a
            com.etsy.android.ui.util.n r6 = r0.f22882e
            com.etsy.android.lib.util.u r8 = r0.f22883f
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            com.etsy.android.ui.listing.ui.panels.itemdetailspanel.ItemDetailsPanel r3 = com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.ItemDetailsPanel.Companion.m18464a(r1, r3, r6, r8, r12)
            goto L_0x0b44
        L_0x0b3a:
            com.etsy.android.ui.util.n r6 = r0.f22882e
            com.etsy.android.lib.util.u r8 = r0.f22883f
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            com.etsy.android.ui.listing.ui.panels.itemdetailspanel.ItemDetailsPanel r3 = com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.ItemDetailsPanel.Companion.m18464a(r1, r3, r6, r8, r12)
        L_0x0b44:
            r44 = r3
            r38 = r18
            r38.<init>(r39, r40, r41, r42, r43, r44)
            com.etsy.android.ui.util.n r3 = r0.f22882e
            r6 = r60
            com.etsy.android.ui.listing.ui.sellerinfo.b r19 = com.etsy.android.p327ui.listing.p329ui.sellerinfo.C10635b.C10636a.m18562a(r3, r1, r6)
            com.etsy.android.lib.models.apiv3.listing.SellerMarketingBOEMessage r3 = r59.getPromoMessage()
            if (r3 == 0) goto L_0x0b64
            java.lang.String r6 = r3.getDescription()
            if (r6 == 0) goto L_0x0b64
            java.lang.String r6 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r6)
            goto L_0x0b65
        L_0x0b64:
            r6 = r5
        L_0x0b65:
            if (r6 != 0) goto L_0x0b6a
            r27 = r62
            goto L_0x0b6c
        L_0x0b6a:
            r27 = r6
        L_0x0b6c:
            if (r3 == 0) goto L_0x0b79
            java.lang.String r3 = r3.getDisclaimer()
            if (r3 == 0) goto L_0x0b79
            java.lang.String r3 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r3)
            goto L_0x0b7a
        L_0x0b79:
            r3 = r5
        L_0x0b7a:
            if (r3 != 0) goto L_0x0b7f
            r28 = r62
            goto L_0x0b81
        L_0x0b7f:
            r28 = r3
        L_0x0b81:
            int r3 = r27.length()
            if (r3 != 0) goto L_0x0b89
            r3 = r2
            goto L_0x0b8a
        L_0x0b89:
            r3 = r9
        L_0x0b8a:
            if (r3 == 0) goto L_0x0b8f
            r20 = r5
            goto L_0x0bc7
        L_0x0b8f:
            com.etsy.android.lib.models.apiv3.listing.Shop r3 = r59.getShop()
            r12 = 0
            if (r3 == 0) goto L_0x0ba4
            java.lang.Long r3 = r3.getShopId()
            if (r3 == 0) goto L_0x0ba4
            long r14 = r3.longValue()
            r21 = r14
            goto L_0x0ba6
        L_0x0ba4:
            r21 = r12
        L_0x0ba6:
            com.etsy.android.lib.models.apiv3.listing.User r3 = r59.getSeller()
            if (r3 == 0) goto L_0x0bb6
            java.lang.Long r3 = r3.getUserId()
            if (r3 == 0) goto L_0x0bb6
            long r12 = r3.longValue()
        L_0x0bb6:
            r23 = r12
            com.etsy.android.lib.models.apiv3.listing.Listing r3 = r59.getListing()
            long r25 = r3.getListingId()
            com.etsy.android.ui.listing.ui.listingpromotion.a r3 = new com.etsy.android.ui.listing.ui.listingpromotion.a
            r20 = r3
            r20.<init>(r21, r23, r25, r27, r28)
        L_0x0bc7:
            com.etsy.android.lib.models.apiv3.listing.ProductSafetyNotice r3 = r59.getProductSafetyNotice()
            if (r3 == 0) goto L_0x0be7
            java.util.List r6 = r3.getMessages()
            boolean r6 = kotlinx.coroutines.C19543e0.m33306Y(r6)
            if (r6 == 0) goto L_0x0be7
            com.etsy.android.ui.listing.ui.productwarninginfo.a r6 = new com.etsy.android.ui.listing.ui.productwarninginfo.a
            java.lang.String r8 = r3.getTitle()
            java.util.List r3 = r3.getMessages()
            r6.<init>(r9, r8, r3)
            r23 = r6
            goto L_0x0be9
        L_0x0be7:
            r23 = r5
        L_0x0be9:
            com.etsy.android.ui.util.n r3 = r0.f22882e
            kotlin.jvm.internal.C19383o.m32797g(r3, r11)
            com.etsy.android.ui.listing.ui.footer.a r6 = new com.etsy.android.ui.listing.ui.footer.a
            com.etsy.android.lib.models.apiv3.listing.Listing r8 = r59.getListing()
            long r11 = r8.getListingId()
            java.lang.String r8 = java.lang.String.valueOf(r11)
            com.etsy.android.lib.models.apiv3.listing.Listing r11 = r59.getListing()
            java.lang.String r11 = r11.getUrl()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.etsy.android.lib.models.apiv3.listing.Listing r12 = r59.getListing()
            long r12 = r12.getCreateDate()
            java.util.Date r14 = new java.util.Date
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.SECONDS
            long r12 = r15.toMillis(r12)
            r14.<init>(r12)
            java.lang.String r12 = com.etsy.android.lib.util.C8885d0.m17321e(r14)
            java.lang.String r13 = "formatShortDate(listingCreationDate)"
            kotlin.jvm.internal.C19383o.m32796f(r12, r13)
            r2[r9] = r12
            r9 = 2131952429(0x7f13032d, float:1.95413E38)
            java.lang.String r2 = r3.mo38059c(r9, r2)
            r6.<init>(r8, r11, r2)
            if (r63 == 0) goto L_0x0c33
            ud.a$d r2 = p459ud.C13473a.C13477d.f29499b
            goto L_0x0c35
        L_0x0c33:
            ud.a$b r2 = p459ud.C13473a.C13475b.f29497b
        L_0x0c35:
            r22 = r2
            if (r63 == 0) goto L_0x0c46
            java.util.List r1 = r59.getRecentListings()
            com.etsy.android.ui.listing.h r2 = r0.f22878a
            com.etsy.android.ui.listing.ui.f$b r1 = m18421b(r0, r1, r2)
            r21 = r1
            goto L_0x0c48
        L_0x0c46:
            r21 = r5
        L_0x0c48:
            qd.a r26 = p429qd.C13298a.f29204a
            com.etsy.android.ui.listing.ui.f r1 = new com.etsy.android.ui.listing.ui.f
            r12 = r1
            r13 = r37
            r14 = r36
            r15 = r35
            r16 = r10
            r17 = r4
            r24 = r6
            r25 = r7
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.C10421h.mo33973d(com.etsy.android.lib.models.apiv3.listing.ListingFetch, com.etsy.android.lib.models.datatypes.EtsyId, com.etsy.android.ui.listing.ui.l, java.lang.Integer, boolean):com.etsy.android.ui.listing.ui.f");
    }
}
