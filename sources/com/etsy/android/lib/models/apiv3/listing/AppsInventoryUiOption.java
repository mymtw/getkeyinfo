package com.etsy.android.lib.models.apiv3.listing;

import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.commons.lang3.StringEscapeUtils;

@C17403o(generateAdapter = true)
public final class AppsInventoryUiOption {
    public static final int $stable = 8;
    private final FormattedMoney displayValue;
    private final Boolean enabled;
    private final String rawDisplayValue;
    private final Boolean selected;
    private final Long value;

    public AppsInventoryUiOption() {
        this((Long) null, (Boolean) null, (Boolean) null, (FormattedMoney) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public AppsInventoryUiOption(@C17402n(name = "value") Long l, @C17402n(name = "selected") Boolean bool, @C17402n(name = "enabled") Boolean bool2, @C17402n(name = "display_value") FormattedMoney formattedMoney, @C17402n(name = "raw_display_value") String str) {
        this.value = l;
        this.selected = bool;
        this.enabled = bool2;
        this.displayValue = formattedMoney;
        this.rawDisplayValue = str;
    }

    public static /* synthetic */ AppsInventoryUiOption copy$default(AppsInventoryUiOption appsInventoryUiOption, Long l, Boolean bool, Boolean bool2, FormattedMoney formattedMoney, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            l = appsInventoryUiOption.value;
        }
        if ((i & 2) != 0) {
            bool = appsInventoryUiOption.selected;
        }
        Boolean bool3 = bool;
        if ((i & 4) != 0) {
            bool2 = appsInventoryUiOption.enabled;
        }
        Boolean bool4 = bool2;
        if ((i & 8) != 0) {
            formattedMoney = appsInventoryUiOption.displayValue;
        }
        FormattedMoney formattedMoney2 = formattedMoney;
        if ((i & 16) != 0) {
            str = appsInventoryUiOption.rawDisplayValue;
        }
        return appsInventoryUiOption.copy(l, bool3, bool4, formattedMoney2, str);
    }

    public final Long component1() {
        return this.value;
    }

    public final Boolean component2() {
        return this.selected;
    }

    public final Boolean component3() {
        return this.enabled;
    }

    public final FormattedMoney component4() {
        return this.displayValue;
    }

    public final String component5() {
        return this.rawDisplayValue;
    }

    public final AppsInventoryUiOption copy(@C17402n(name = "value") Long l, @C17402n(name = "selected") Boolean bool, @C17402n(name = "enabled") Boolean bool2, @C17402n(name = "display_value") FormattedMoney formattedMoney, @C17402n(name = "raw_display_value") String str) {
        return new AppsInventoryUiOption(l, bool, bool2, formattedMoney, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsInventoryUiOption)) {
            return false;
        }
        AppsInventoryUiOption appsInventoryUiOption = (AppsInventoryUiOption) obj;
        return C19383o.m32792b(this.value, appsInventoryUiOption.value) && C19383o.m32792b(this.selected, appsInventoryUiOption.selected) && C19383o.m32792b(this.enabled, appsInventoryUiOption.enabled) && C19383o.m32792b(this.displayValue, appsInventoryUiOption.displayValue) && C19383o.m32792b(this.rawDisplayValue, appsInventoryUiOption.rawDisplayValue);
    }

    public final FormattedMoney getDisplayValue() {
        return this.displayValue;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final String getRawDisplayValue() {
        return this.rawDisplayValue;
    }

    public final Boolean getSelected() {
        return this.selected;
    }

    public final Long getValue() {
        return this.value;
    }

    public int hashCode() {
        Long l = this.value;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Boolean bool = this.selected;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.enabled;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        FormattedMoney formattedMoney = this.displayValue;
        int hashCode4 = (hashCode3 + (formattedMoney == null ? 0 : formattedMoney.hashCode())) * 31;
        String str = this.rawDisplayValue;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        FormattedMoney formattedMoney = this.displayValue;
        String unescapeHtml4 = StringEscapeUtils.unescapeHtml4(formattedMoney != null ? formattedMoney.toString() : null);
        return unescapeHtml4 == null ? "" : unescapeHtml4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AppsInventoryUiOption(java.lang.Long r5, java.lang.Boolean r6, java.lang.Boolean r7, com.etsy.android.lib.models.apiv3.listing.FormattedMoney r8, java.lang.String r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption.<init>(java.lang.Long, java.lang.Boolean, java.lang.Boolean, com.etsy.android.lib.models.apiv3.listing.FormattedMoney, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
