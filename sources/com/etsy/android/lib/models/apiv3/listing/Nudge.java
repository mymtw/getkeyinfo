package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class Nudge {
    public static final int $stable = 8;
    private final String displayBody;
    private final String displayText;
    private final String displayTitle;
    private final List<String> eligibleNudgeTypes;
    private final List<String> eligibleNudges;
    private final Boolean fixedSaleEndsSoon;
    private final Boolean fixedSaleEndsToday;
    private final Boolean fixedSaleEndsTomorrow;
    private final String iconUrl;
    private final Integer quantity;
    private final Boolean showSingularMessage;
    private final Integer totalCarts;
    private final String type;

    public Nudge() {
        this((String) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, 8191, (DefaultConstructorMarker) null);
    }

    public Nudge(@C17402n(name = "type") String str, @C17402n(name = "quantity") Integer num, @C17402n(name = "total_carts") Integer num2, @C17402n(name = "display_text") String str2, @C17402n(name = "display_title") String str3, @C17402n(name = "display_body") String str4, @C17402n(name = "icon_url") String str5, @C17402n(name = "eligible_nudges") List<String> list, @C17402n(name = "eligible_nudge_types") List<String> list2, @C17402n(name = "fixed_sale_ends_today") Boolean bool, @C17402n(name = "fixed_sale_ends_tomorrow") Boolean bool2, @C17402n(name = "fixed_sale_ends_soon") Boolean bool3, @C17402n(name = "show_singular_message") Boolean bool4) {
        this.type = str;
        this.quantity = num;
        this.totalCarts = num2;
        this.displayText = str2;
        this.displayTitle = str3;
        this.displayBody = str4;
        this.iconUrl = str5;
        this.eligibleNudges = list;
        this.eligibleNudgeTypes = list2;
        this.fixedSaleEndsToday = bool;
        this.fixedSaleEndsTomorrow = bool2;
        this.fixedSaleEndsSoon = bool3;
        this.showSingularMessage = bool4;
    }

    public static /* synthetic */ Nudge copy$default(Nudge nudge, String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, List list, List list2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, Object obj) {
        Nudge nudge2 = nudge;
        int i2 = i;
        return nudge.copy((i2 & 1) != 0 ? nudge2.type : str, (i2 & 2) != 0 ? nudge2.quantity : num, (i2 & 4) != 0 ? nudge2.totalCarts : num2, (i2 & 8) != 0 ? nudge2.displayText : str2, (i2 & 16) != 0 ? nudge2.displayTitle : str3, (i2 & 32) != 0 ? nudge2.displayBody : str4, (i2 & 64) != 0 ? nudge2.iconUrl : str5, (i2 & 128) != 0 ? nudge2.eligibleNudges : list, (i2 & 256) != 0 ? nudge2.eligibleNudgeTypes : list2, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? nudge2.fixedSaleEndsToday : bool, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? nudge2.fixedSaleEndsTomorrow : bool2, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? nudge2.fixedSaleEndsSoon : bool3, (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? nudge2.showSingularMessage : bool4);
    }

    public final String component1() {
        return this.type;
    }

    public final Boolean component10() {
        return this.fixedSaleEndsToday;
    }

    public final Boolean component11() {
        return this.fixedSaleEndsTomorrow;
    }

    public final Boolean component12() {
        return this.fixedSaleEndsSoon;
    }

    public final Boolean component13() {
        return this.showSingularMessage;
    }

    public final Integer component2() {
        return this.quantity;
    }

    public final Integer component3() {
        return this.totalCarts;
    }

    public final String component4() {
        return this.displayText;
    }

    public final String component5() {
        return this.displayTitle;
    }

    public final String component6() {
        return this.displayBody;
    }

    public final String component7() {
        return this.iconUrl;
    }

    public final List<String> component8() {
        return this.eligibleNudges;
    }

    public final List<String> component9() {
        return this.eligibleNudgeTypes;
    }

    public final Nudge copy(@C17402n(name = "type") String str, @C17402n(name = "quantity") Integer num, @C17402n(name = "total_carts") Integer num2, @C17402n(name = "display_text") String str2, @C17402n(name = "display_title") String str3, @C17402n(name = "display_body") String str4, @C17402n(name = "icon_url") String str5, @C17402n(name = "eligible_nudges") List<String> list, @C17402n(name = "eligible_nudge_types") List<String> list2, @C17402n(name = "fixed_sale_ends_today") Boolean bool, @C17402n(name = "fixed_sale_ends_tomorrow") Boolean bool2, @C17402n(name = "fixed_sale_ends_soon") Boolean bool3, @C17402n(name = "show_singular_message") Boolean bool4) {
        return new Nudge(str, num, num2, str2, str3, str4, str5, list, list2, bool, bool2, bool3, bool4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Nudge)) {
            return false;
        }
        Nudge nudge = (Nudge) obj;
        return C19383o.m32792b(this.type, nudge.type) && C19383o.m32792b(this.quantity, nudge.quantity) && C19383o.m32792b(this.totalCarts, nudge.totalCarts) && C19383o.m32792b(this.displayText, nudge.displayText) && C19383o.m32792b(this.displayTitle, nudge.displayTitle) && C19383o.m32792b(this.displayBody, nudge.displayBody) && C19383o.m32792b(this.iconUrl, nudge.iconUrl) && C19383o.m32792b(this.eligibleNudges, nudge.eligibleNudges) && C19383o.m32792b(this.eligibleNudgeTypes, nudge.eligibleNudgeTypes) && C19383o.m32792b(this.fixedSaleEndsToday, nudge.fixedSaleEndsToday) && C19383o.m32792b(this.fixedSaleEndsTomorrow, nudge.fixedSaleEndsTomorrow) && C19383o.m32792b(this.fixedSaleEndsSoon, nudge.fixedSaleEndsSoon) && C19383o.m32792b(this.showSingularMessage, nudge.showSingularMessage);
    }

    public final String getDisplayBody() {
        return this.displayBody;
    }

    public final String getDisplayText() {
        return this.displayText;
    }

    public final String getDisplayTitle() {
        return this.displayTitle;
    }

    public final List<String> getEligibleNudgeTypes() {
        return this.eligibleNudgeTypes;
    }

    public final List<String> getEligibleNudges() {
        return this.eligibleNudges;
    }

    public final Boolean getFixedSaleEndsSoon() {
        return this.fixedSaleEndsSoon;
    }

    public final Boolean getFixedSaleEndsToday() {
        return this.fixedSaleEndsToday;
    }

    public final Boolean getFixedSaleEndsTomorrow() {
        return this.fixedSaleEndsTomorrow;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final Integer getQuantity() {
        return this.quantity;
    }

    public final Boolean getShowSingularMessage() {
        return this.showSingularMessage;
    }

    public final Integer getTotalCarts() {
        return this.totalCarts;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.quantity;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalCarts;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.displayText;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displayTitle;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.displayBody;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.iconUrl;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list = this.eligibleNudges;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.eligibleNudgeTypes;
        int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.fixedSaleEndsToday;
        int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.fixedSaleEndsTomorrow;
        int hashCode11 = (hashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.fixedSaleEndsSoon;
        int hashCode12 = (hashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.showSingularMessage;
        if (bool4 != null) {
            i = bool4.hashCode();
        }
        return hashCode12 + i;
    }

    public final boolean isQuantityRelated() {
        String str = this.type;
        if (str != null) {
            return C19383o.m32792b(str, "quantity_only") || C19383o.m32792b(str, "only_one_available");
        }
        return false;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("Nudge(type=");
        h.append(this.type);
        h.append(", quantity=");
        h.append(this.quantity);
        h.append(", totalCarts=");
        h.append(this.totalCarts);
        h.append(", displayText=");
        h.append(this.displayText);
        h.append(", displayTitle=");
        h.append(this.displayTitle);
        h.append(", displayBody=");
        h.append(this.displayBody);
        h.append(", iconUrl=");
        h.append(this.iconUrl);
        h.append(", eligibleNudges=");
        h.append(this.eligibleNudges);
        h.append(", eligibleNudgeTypes=");
        h.append(this.eligibleNudgeTypes);
        h.append(", fixedSaleEndsToday=");
        h.append(this.fixedSaleEndsToday);
        h.append(", fixedSaleEndsTomorrow=");
        h.append(this.fixedSaleEndsTomorrow);
        h.append(", fixedSaleEndsSoon=");
        h.append(this.fixedSaleEndsSoon);
        h.append(", showSingularMessage=");
        h.append(this.showSingularMessage);
        h.append(')');
        return h.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Nudge(java.lang.String r15, java.lang.Integer r16, java.lang.Integer r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.util.List r22, java.util.List r23, java.lang.Boolean r24, java.lang.Boolean r25, java.lang.Boolean r26, java.lang.Boolean r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r14 = this;
            r0 = r28
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r15
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0012
        L_0x0010:
            r3 = r16
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r2
            goto L_0x001a
        L_0x0018:
            r4 = r17
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = r2
            goto L_0x0022
        L_0x0020:
            r5 = r18
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = r2
            goto L_0x002a
        L_0x0028:
            r6 = r19
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = r2
            goto L_0x0032
        L_0x0030:
            r7 = r20
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = r2
            goto L_0x003a
        L_0x0038:
            r8 = r21
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = r2
            goto L_0x0042
        L_0x0040:
            r9 = r22
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = r2
            goto L_0x004a
        L_0x0048:
            r10 = r23
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = r2
            goto L_0x0052
        L_0x0050:
            r11 = r24
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = r2
            goto L_0x005a
        L_0x0058:
            r12 = r25
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = r2
            goto L_0x0062
        L_0x0060:
            r13 = r26
        L_0x0062:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r2 = r27
        L_0x0069:
            r15 = r14
            r16 = r1
            r17 = r3
            r18 = r4
            r19 = r5
            r20 = r6
            r21 = r7
            r22 = r8
            r23 = r9
            r24 = r10
            r25 = r11
            r26 = r12
            r27 = r13
            r28 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.Nudge.<init>(java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
