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

/* renamed from: com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.b */
public final class C10336b extends C10423j {

    /* renamed from: a */
    public final String f22684a;

    /* renamed from: b */
    public final boolean f22685b;

    /* renamed from: c */
    public final List<AppsInventoryUiOption> f22686c;

    /* renamed from: d */
    public final AppsInventoryUiOption f22687d;

    /* renamed from: e */
    public final String f22688e;

    /* renamed from: f */
    public final Map<Long, ListingImage> f22689f;

    /* renamed from: com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.b$a */
    public static final class C10337a {
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
        public static com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.C10336b m18383a(com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext r9, com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption r10, p437rd.C13354a r11, com.etsy.android.p327ui.core.listingnomapper.listingvariations.C9684a r12) {
            /*
                java.lang.String r0 = "listingImagesByVariationHelper"
                kotlin.jvm.internal.C19383o.m32797g(r12, r0)
                r12 = 0
                if (r9 == 0) goto L_0x001c
                com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartUi r9 = r9.getUi()
                if (r9 == 0) goto L_0x001c
                java.util.List r9 = r9.getSelects()
                if (r9 == 0) goto L_0x001c
                r0 = 1
                java.lang.Object r9 = kotlin.collections.C19327t.m32641W0(r0, r9)
                com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiSelect r9 = (com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiSelect) r9
                goto L_0x001d
            L_0x001c:
                r9 = r12
            L_0x001d:
                if (r11 == 0) goto L_0x0028
                java.util.LinkedHashMap r11 = r11.mo46040d()
                java.util.LinkedHashMap r11 = kotlin.collections.C19294b0.m32558A0(r11)
                goto L_0x0029
            L_0x0028:
                r11 = r12
            L_0x0029:
                if (r9 == 0) goto L_0x005f
                java.util.List r0 = r9.getOptions()
                if (r0 == 0) goto L_0x005f
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = kotlin.collections.C19322o.m32624F0(r0)
                r1.<init>(r2)
                java.util.Iterator r0 = r0.iterator()
            L_0x003e:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0060
                java.lang.Object r2 = r0.next()
                com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption r2 = (com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption) r2
                java.lang.Long r2 = r2.getValue()
                if (r2 == 0) goto L_0x0055
                long r2 = r2.longValue()
                goto L_0x0057
            L_0x0055:
                r2 = -1
            L_0x0057:
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r1.add(r2)
                goto L_0x003e
            L_0x005f:
                r1 = r12
            L_0x0060:
                if (r1 != 0) goto L_0x0064
                kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.INSTANCE
            L_0x0064:
                java.util.Map r8 = com.etsy.android.p327ui.core.listingnomapper.listingvariations.C9684a.m18020a(r1, r11)
                if (r9 == 0) goto L_0x0090
                com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.b r12 = new com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.b
                java.lang.String r11 = r9.getLabel()
                java.lang.String r11 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r11)
                if (r11 != 0) goto L_0x0078
                java.lang.String r11 = ""
            L_0x0078:
                r3 = r11
                java.lang.Boolean r11 = r9.getEnabled()
                if (r11 == 0) goto L_0x0084
                boolean r11 = r11.booleanValue()
                goto L_0x0085
            L_0x0084:
                r11 = 0
            L_0x0085:
                r4 = r11
                java.util.List r5 = r9.getOptions()
                r7 = 0
                r2 = r12
                r6 = r10
                r2.<init>(r3, r4, r5, r6, r7, r8)
            L_0x0090:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.C10336b.C10337a.m18383a(com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext, com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption, rd.a, com.etsy.android.ui.core.listingnomapper.listingvariations.a):com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.b");
        }
    }

    public C10336b(String str, boolean z, List<AppsInventoryUiOption> list, AppsInventoryUiOption appsInventoryUiOption, String str2, Map<Long, ListingImage> map) {
        C19383o.m32797g(list, ResponseConstants.OPTIONS);
        this.f22684a = str;
        this.f22685b = z;
        this.f22686c = list;
        this.f22687d = appsInventoryUiOption;
        this.f22688e = str2;
        this.f22689f = map;
    }

    /* renamed from: b */
    public static C10336b m18381b(C10336b bVar, AppsInventoryUiOption appsInventoryUiOption, String str, int i) {
        Map<Long, ListingImage> map = null;
        String str2 = (i & 1) != 0 ? bVar.f22684a : null;
        boolean z = (i & 2) != 0 ? bVar.f22685b : false;
        List<AppsInventoryUiOption> list = (i & 4) != 0 ? bVar.f22686c : null;
        if ((i & 8) != 0) {
            appsInventoryUiOption = bVar.f22687d;
        }
        AppsInventoryUiOption appsInventoryUiOption2 = appsInventoryUiOption;
        if ((i & 16) != 0) {
            str = bVar.f22688e;
        }
        String str3 = str;
        if ((i & 32) != 0) {
            map = bVar.f22689f;
        }
        bVar.getClass();
        C19383o.m32797g(str2, ResponseConstants.LABEL);
        C19383o.m32797g(list, ResponseConstants.OPTIONS);
        return new C10336b(str2, z, list, appsInventoryUiOption2, str3, map);
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.VARIATION_TWO_FROM_INVENTORY_UI;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10336b)) {
            return false;
        }
        C10336b bVar = (C10336b) obj;
        return C19383o.m32792b(this.f22684a, bVar.f22684a) && this.f22685b == bVar.f22685b && C19383o.m32792b(this.f22686c, bVar.f22686c) && C19383o.m32792b(this.f22687d, bVar.f22687d) && C19383o.m32792b(this.f22688e, bVar.f22688e) && C19383o.m32792b(this.f22689f, bVar.f22689f);
    }

    public final int hashCode() {
        int hashCode = this.f22684a.hashCode() * 31;
        boolean z = this.f22685b;
        if (z) {
            z = true;
        }
        int g = C13983i.m21488g(this.f22686c, (hashCode + (z ? 1 : 0)) * 31, 31);
        AppsInventoryUiOption appsInventoryUiOption = this.f22687d;
        int i = 0;
        int hashCode2 = (g + (appsInventoryUiOption == null ? 0 : appsInventoryUiOption.hashCode())) * 31;
        String str = this.f22688e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Map<Long, ListingImage> map = this.f22689f;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("VariationTwoFromInventoryUi(label=");
        h.append(this.f22684a);
        h.append(", isEnabled=");
        h.append(this.f22685b);
        h.append(", options=");
        h.append(this.f22686c);
        h.append(", selectedOption=");
        h.append(this.f22687d);
        h.append(", errorMessage=");
        h.append(this.f22688e);
        h.append(", imagesByVariation=");
        h.append(this.f22689f);
        h.append(')');
        return h.toString();
    }
}
