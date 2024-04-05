package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class AppsInventoryUiSelect {
    public static final int $stable = 8;
    private final UiOption defaultOption;
    private final Boolean enabled;
    private final String errorText;
    private final String label;
    private final List<AppsInventoryUiOption> options;
    private final String prompt;

    public AppsInventoryUiSelect(@C17402n(name = "label") String str, @C17402n(name = "prompt") String str2, @C17402n(name = "enabled") Boolean bool, @C17402n(name = "error_text") String str3, @C17402n(name = "defaultOption") UiOption uiOption, @C17402n(name = "options") List<AppsInventoryUiOption> list) {
        C19383o.m32797g(list, ResponseConstants.OPTIONS);
        this.label = str;
        this.prompt = str2;
        this.enabled = bool;
        this.errorText = str3;
        this.defaultOption = uiOption;
        this.options = list;
    }

    public static /* synthetic */ AppsInventoryUiSelect copy$default(AppsInventoryUiSelect appsInventoryUiSelect, String str, String str2, Boolean bool, String str3, UiOption uiOption, List<AppsInventoryUiOption> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appsInventoryUiSelect.label;
        }
        if ((i & 2) != 0) {
            str2 = appsInventoryUiSelect.prompt;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            bool = appsInventoryUiSelect.enabled;
        }
        Boolean bool2 = bool;
        if ((i & 8) != 0) {
            str3 = appsInventoryUiSelect.errorText;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            uiOption = appsInventoryUiSelect.defaultOption;
        }
        UiOption uiOption2 = uiOption;
        if ((i & 32) != 0) {
            list = appsInventoryUiSelect.options;
        }
        return appsInventoryUiSelect.copy(str, str4, bool2, str5, uiOption2, list);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.prompt;
    }

    public final Boolean component3() {
        return this.enabled;
    }

    public final String component4() {
        return this.errorText;
    }

    public final UiOption component5() {
        return this.defaultOption;
    }

    public final List<AppsInventoryUiOption> component6() {
        return this.options;
    }

    public final AppsInventoryUiSelect copy(@C17402n(name = "label") String str, @C17402n(name = "prompt") String str2, @C17402n(name = "enabled") Boolean bool, @C17402n(name = "error_text") String str3, @C17402n(name = "defaultOption") UiOption uiOption, @C17402n(name = "options") List<AppsInventoryUiOption> list) {
        C19383o.m32797g(list, ResponseConstants.OPTIONS);
        return new AppsInventoryUiSelect(str, str2, bool, str3, uiOption, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsInventoryUiSelect)) {
            return false;
        }
        AppsInventoryUiSelect appsInventoryUiSelect = (AppsInventoryUiSelect) obj;
        return C19383o.m32792b(this.label, appsInventoryUiSelect.label) && C19383o.m32792b(this.prompt, appsInventoryUiSelect.prompt) && C19383o.m32792b(this.enabled, appsInventoryUiSelect.enabled) && C19383o.m32792b(this.errorText, appsInventoryUiSelect.errorText) && C19383o.m32792b(this.defaultOption, appsInventoryUiSelect.defaultOption) && C19383o.m32792b(this.options, appsInventoryUiSelect.options);
    }

    public final UiOption getDefaultOption() {
        return this.defaultOption;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final String getErrorText() {
        return this.errorText;
    }

    public final String getLabel() {
        return this.label;
    }

    public final List<AppsInventoryUiOption> getOptions() {
        return this.options;
    }

    public final String getPrompt() {
        return this.prompt;
    }

    public int hashCode() {
        String str = this.label;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.prompt;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.enabled;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.errorText;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UiOption uiOption = this.defaultOption;
        if (uiOption != null) {
            i = uiOption.hashCode();
        }
        return this.options.hashCode() + ((hashCode4 + i) * 31);
    }

    public final AppsInventoryUiOption selectedOption() {
        T t;
        Iterator<T> it = this.options.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C19383o.m32792b(((AppsInventoryUiOption) t).getSelected(), Boolean.TRUE)) {
                break;
            }
        }
        return (AppsInventoryUiOption) t;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("AppsInventoryUiSelect(label=");
        h.append(this.label);
        h.append(", prompt=");
        h.append(this.prompt);
        h.append(", enabled=");
        h.append(this.enabled);
        h.append(", errorText=");
        h.append(this.errorText);
        h.append(", defaultOption=");
        h.append(this.defaultOption);
        h.append(", options=");
        return C0070b.m186i(h, this.options, ')');
    }
}
