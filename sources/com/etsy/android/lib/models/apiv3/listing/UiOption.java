package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class UiOption {
    public static final int $stable = 0;
    private final String displayValue;
    private final Boolean enabled;
    private final Boolean selected;
    private final String value;

    public UiOption(@C17402n(name = "display_value") String str, @C17402n(name = "value") String str2, @C17402n(name = "selected") Boolean bool, @C17402n(name = "enabled") Boolean bool2) {
        this.displayValue = str;
        this.value = str2;
        this.selected = bool;
        this.enabled = bool2;
    }

    public static /* synthetic */ UiOption copy$default(UiOption uiOption, String str, String str2, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uiOption.displayValue;
        }
        if ((i & 2) != 0) {
            str2 = uiOption.value;
        }
        if ((i & 4) != 0) {
            bool = uiOption.selected;
        }
        if ((i & 8) != 0) {
            bool2 = uiOption.enabled;
        }
        return uiOption.copy(str, str2, bool, bool2);
    }

    public final String component1() {
        return this.displayValue;
    }

    public final String component2() {
        return this.value;
    }

    public final Boolean component3() {
        return this.selected;
    }

    public final Boolean component4() {
        return this.enabled;
    }

    public final UiOption copy(@C17402n(name = "display_value") String str, @C17402n(name = "value") String str2, @C17402n(name = "selected") Boolean bool, @C17402n(name = "enabled") Boolean bool2) {
        return new UiOption(str, str2, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UiOption)) {
            return false;
        }
        UiOption uiOption = (UiOption) obj;
        return C19383o.m32792b(this.displayValue, uiOption.displayValue) && C19383o.m32792b(this.value, uiOption.value) && C19383o.m32792b(this.selected, uiOption.selected) && C19383o.m32792b(this.enabled, uiOption.enabled);
    }

    public final String getDisplayValue() {
        return this.displayValue;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final Boolean getSelected() {
        return this.selected;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.displayValue;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.selected;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.enabled;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("UiOption(displayValue=");
        h.append(this.displayValue);
        h.append(", value=");
        h.append(this.value);
        h.append(", selected=");
        h.append(this.selected);
        h.append(", enabled=");
        h.append(this.enabled);
        h.append(')');
        return h.toString();
    }
}
