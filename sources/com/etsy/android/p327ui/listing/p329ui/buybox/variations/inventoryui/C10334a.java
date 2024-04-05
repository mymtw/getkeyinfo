package com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.a */
public final class C10334a extends C10423j {

    /* renamed from: a */
    public final String f22678a;

    /* renamed from: b */
    public final boolean f22679b;

    /* renamed from: c */
    public final List<AppsInventoryUiOption> f22680c;

    /* renamed from: d */
    public final AppsInventoryUiOption f22681d;

    /* renamed from: e */
    public final String f22682e;

    /* renamed from: f */
    public final Map<Long, ListingImage> f22683f;

    /* renamed from: com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.a$a */
    public static final class C10335a {
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: kotlin.collections.EmptyList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: kotlin.collections.EmptyList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: kotlin.collections.EmptyList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: kotlin.collections.EmptyList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: kotlin.collections.EmptyList} */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
            r9 = (r9 = r9.getUi()).getSelects();
         */
        /* JADX WARNING: Failed to insert additional move for type inference */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.C10334a m18380a(com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext r9, com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption r10, p437rd.C13354a r11, com.etsy.android.p327ui.core.listingnomapper.listingvariations.C9684a r12) {
            /*
                java.lang.String r0 = "listingImagesByVariationHelper"
                kotlin.jvm.internal.C19383o.m32797g(r12, r0)
                r12 = 0
                if (r9 == 0) goto L_0x001b
                com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartUi r9 = r9.getUi()
                if (r9 == 0) goto L_0x001b
                java.util.List r9 = r9.getSelects()
                if (r9 == 0) goto L_0x001b
                java.lang.Object r9 = kotlin.collections.C19327t.m32640V0(r9)
                com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiSelect r9 = (com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiSelect) r9
                goto L_0x001c
            L_0x001b:
                r9 = r12
            L_0x001c:
                if (r11 == 0) goto L_0x0027
                java.util.LinkedHashMap r11 = r11.mo46040d()
                java.util.LinkedHashMap r11 = kotlin.collections.C19294b0.m32558A0(r11)
                goto L_0x0028
            L_0x0027:
                r11 = r12
            L_0x0028:
                if (r9 == 0) goto L_0x005e
                java.util.List r0 = r9.getOptions()
                if (r0 == 0) goto L_0x005e
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = kotlin.collections.C19322o.m32624F0(r0)
                r1.<init>(r2)
                java.util.Iterator r0 = r0.iterator()
            L_0x003d:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x005f
                java.lang.Object r2 = r0.next()
                com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption r2 = (com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption) r2
                java.lang.Long r2 = r2.getValue()
                if (r2 == 0) goto L_0x0054
                long r2 = r2.longValue()
                goto L_0x0056
            L_0x0054:
                r2 = -1
            L_0x0056:
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r1.add(r2)
                goto L_0x003d
            L_0x005e:
                r1 = r12
            L_0x005f:
                if (r1 != 0) goto L_0x0063
                kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.INSTANCE
            L_0x0063:
                java.util.Map r8 = com.etsy.android.p327ui.core.listingnomapper.listingvariations.C9684a.m18020a(r1, r11)
                if (r9 == 0) goto L_0x008f
                com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.a r12 = new com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.a
                java.lang.String r11 = r9.getLabel()
                java.lang.String r11 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r11)
                if (r11 != 0) goto L_0x0077
                java.lang.String r11 = ""
            L_0x0077:
                r3 = r11
                java.lang.Boolean r11 = r9.getEnabled()
                if (r11 == 0) goto L_0x0083
                boolean r11 = r11.booleanValue()
                goto L_0x0084
            L_0x0083:
                r11 = 0
            L_0x0084:
                r4 = r11
                java.util.List r5 = r9.getOptions()
                r7 = 0
                r2 = r12
                r6 = r10
                r2.<init>(r3, r4, r5, r6, r7, r8)
            L_0x008f:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.C10334a.C10335a.m18380a(com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext, com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption, rd.a, com.etsy.android.ui.core.listingnomapper.listingvariations.a):com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.a");
        }
    }

    public C10334a(String str, boolean z, List<AppsInventoryUiOption> list, AppsInventoryUiOption appsInventoryUiOption, String str2, Map<Long, ListingImage> map) {
        C19383o.m32797g(list, ResponseConstants.OPTIONS);
        this.f22678a = str;
        this.f22679b = z;
        this.f22680c = list;
        this.f22681d = appsInventoryUiOption;
        this.f22682e = str2;
        this.f22683f = map;
    }

    /* renamed from: b */
    public static C10334a m18378b(C10334a aVar, AppsInventoryUiOption appsInventoryUiOption, String str, int i) {
        Map<Long, ListingImage> map = null;
        String str2 = (i & 1) != 0 ? aVar.f22678a : null;
        boolean z = (i & 2) != 0 ? aVar.f22679b : false;
        List<AppsInventoryUiOption> list = (i & 4) != 0 ? aVar.f22680c : null;
        if ((i & 8) != 0) {
            appsInventoryUiOption = aVar.f22681d;
        }
        AppsInventoryUiOption appsInventoryUiOption2 = appsInventoryUiOption;
        if ((i & 16) != 0) {
            str = aVar.f22682e;
        }
        String str3 = str;
        if ((i & 32) != 0) {
            map = aVar.f22683f;
        }
        aVar.getClass();
        C19383o.m32797g(str2, ResponseConstants.LABEL);
        C19383o.m32797g(list, ResponseConstants.OPTIONS);
        return new C10334a(str2, z, list, appsInventoryUiOption2, str3, map);
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.VARIATION_ONE_FROM_INVENTORY_UI;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10334a)) {
            return false;
        }
        C10334a aVar = (C10334a) obj;
        return C19383o.m32792b(this.f22678a, aVar.f22678a) && this.f22679b == aVar.f22679b && C19383o.m32792b(this.f22680c, aVar.f22680c) && C19383o.m32792b(this.f22681d, aVar.f22681d) && C19383o.m32792b(this.f22682e, aVar.f22682e) && C19383o.m32792b(this.f22683f, aVar.f22683f);
    }

    public final int hashCode() {
        int hashCode = this.f22678a.hashCode() * 31;
        boolean z = this.f22679b;
        if (z) {
            z = true;
        }
        int g = C13983i.m21488g(this.f22680c, (hashCode + (z ? 1 : 0)) * 31, 31);
        AppsInventoryUiOption appsInventoryUiOption = this.f22681d;
        int i = 0;
        int hashCode2 = (g + (appsInventoryUiOption == null ? 0 : appsInventoryUiOption.hashCode())) * 31;
        String str = this.f22682e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Map<Long, ListingImage> map = this.f22683f;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("VariationOneFromInventoryUi(label=");
        h.append(this.f22678a);
        h.append(", isEnabled=");
        h.append(this.f22679b);
        h.append(", options=");
        h.append(this.f22680c);
        h.append(", selectedOption=");
        h.append(this.f22681d);
        h.append(", errorMessage=");
        h.append(this.f22682e);
        h.append(", imagesByVariation=");
        h.append(this.f22683f);
        h.append(')');
        return h.toString();
    }
}
