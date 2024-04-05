package com.etsy.android.lib.models.apiv3.pastpurchase;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class ModuleLandingPage {
    public static final int $stable = 0;
    private final String apiPath;
    private final String eventName;
    private final String linkLandingTitle;
    private final String linkTitle;

    public ModuleLandingPage(@C17402n(name = "link_title") String str, @C17402n(name = "api_path") String str2, @C17402n(name = "title") String str3, @C17402n(name = "event_name") String str4) {
        C19383o.m32797g(str, "linkTitle");
        C19383o.m32797g(str2, "apiPath");
        this.linkTitle = str;
        this.apiPath = str2;
        this.linkLandingTitle = str3;
        this.eventName = str4;
    }

    public static /* synthetic */ ModuleLandingPage copy$default(ModuleLandingPage moduleLandingPage, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = moduleLandingPage.linkTitle;
        }
        if ((i & 2) != 0) {
            str2 = moduleLandingPage.apiPath;
        }
        if ((i & 4) != 0) {
            str3 = moduleLandingPage.linkLandingTitle;
        }
        if ((i & 8) != 0) {
            str4 = moduleLandingPage.eventName;
        }
        return moduleLandingPage.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.linkTitle;
    }

    public final String component2() {
        return this.apiPath;
    }

    public final String component3() {
        return this.linkLandingTitle;
    }

    public final String component4() {
        return this.eventName;
    }

    public final ModuleLandingPage copy(@C17402n(name = "link_title") String str, @C17402n(name = "api_path") String str2, @C17402n(name = "title") String str3, @C17402n(name = "event_name") String str4) {
        C19383o.m32797g(str, "linkTitle");
        C19383o.m32797g(str2, "apiPath");
        return new ModuleLandingPage(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModuleLandingPage)) {
            return false;
        }
        ModuleLandingPage moduleLandingPage = (ModuleLandingPage) obj;
        return C19383o.m32792b(this.linkTitle, moduleLandingPage.linkTitle) && C19383o.m32792b(this.apiPath, moduleLandingPage.apiPath) && C19383o.m32792b(this.linkLandingTitle, moduleLandingPage.linkLandingTitle) && C19383o.m32792b(this.eventName, moduleLandingPage.eventName);
    }

    public final String getApiPath() {
        return this.apiPath;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final String getLinkLandingTitle() {
        return this.linkLandingTitle;
    }

    public final String getLinkTitle() {
        return this.linkTitle;
    }

    public int hashCode() {
        int e = C0023f.m105e(this.apiPath, this.linkTitle.hashCode() * 31, 31);
        String str = this.linkLandingTitle;
        int i = 0;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.eventName;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ModuleLandingPage(linkTitle=");
        h.append(this.linkTitle);
        h.append(", apiPath=");
        h.append(this.apiPath);
        h.append(", linkLandingTitle=");
        h.append(this.linkLandingTitle);
        h.append(", eventName=");
        return C0391c.m1057c(h, this.eventName, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ModuleLandingPage(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
