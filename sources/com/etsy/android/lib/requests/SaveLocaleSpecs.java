package com.etsy.android.lib.requests;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.appsflyer.AppsFlyerProperties;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p010a9.C0048b;

public final class SaveLocaleSpecs {
    public static final int $stable = 0;
    private final String currencyCode;
    private final String language;
    private final String region;

    public SaveLocaleSpecs(String str, String str2, String str3) {
        C0048b.m167f(str, AppsFlyerProperties.CURRENCY_CODE, str2, "language", str3, "region");
        this.currencyCode = str;
        this.language = str2;
        this.region = str3;
    }

    public static /* synthetic */ SaveLocaleSpecs copy$default(SaveLocaleSpecs saveLocaleSpecs, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = saveLocaleSpecs.currencyCode;
        }
        if ((i & 2) != 0) {
            str2 = saveLocaleSpecs.language;
        }
        if ((i & 4) != 0) {
            str3 = saveLocaleSpecs.region;
        }
        return saveLocaleSpecs.copy(str, str2, str3);
    }

    public final String component1() {
        return this.currencyCode;
    }

    public final String component2() {
        return this.language;
    }

    public final String component3() {
        return this.region;
    }

    public final SaveLocaleSpecs copy(String str, String str2, String str3) {
        C19383o.m32797g(str, AppsFlyerProperties.CURRENCY_CODE);
        C19383o.m32797g(str2, "language");
        C19383o.m32797g(str3, "region");
        return new SaveLocaleSpecs(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveLocaleSpecs)) {
            return false;
        }
        SaveLocaleSpecs saveLocaleSpecs = (SaveLocaleSpecs) obj;
        return C19383o.m32792b(this.currencyCode, saveLocaleSpecs.currencyCode) && C19383o.m32792b(this.language, saveLocaleSpecs.language) && C19383o.m32792b(this.region, saveLocaleSpecs.region);
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getRegion() {
        return this.region;
    }

    public int hashCode() {
        return this.region.hashCode() + C0023f.m105e(this.language, this.currencyCode.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("SaveLocaleSpecs(currencyCode=");
        h.append(this.currencyCode);
        h.append(", language=");
        h.append(this.language);
        h.append(", region=");
        return C0391c.m1057c(h, this.region, ')');
    }
}
