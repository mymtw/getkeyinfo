package com.etsy.android.lib.models.apiv3;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;

@C17403o(generateAdapter = true)
public final class MainImage {
    public static final int $stable = 0;
    private final String url170x135;
    private final String url75x75;
    private final String urlFullxFull;

    public MainImage(@C17402n(name = "url_fullxfull") String str, @C17402n(name = "url_75x75") String str2, @C17402n(name = "url_170x135") String str3) {
        C19383o.m32797g(str, "urlFullxFull");
        this.urlFullxFull = str;
        this.url75x75 = str2;
        this.url170x135 = str3;
    }

    public static /* synthetic */ MainImage copy$default(MainImage mainImage, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mainImage.urlFullxFull;
        }
        if ((i & 2) != 0) {
            str2 = mainImage.url75x75;
        }
        if ((i & 4) != 0) {
            str3 = mainImage.url170x135;
        }
        return mainImage.copy(str, str2, str3);
    }

    public final String component1() {
        return this.urlFullxFull;
    }

    public final String component2() {
        return this.url75x75;
    }

    public final String component3() {
        return this.url170x135;
    }

    public final MainImage copy(@C17402n(name = "url_fullxfull") String str, @C17402n(name = "url_75x75") String str2, @C17402n(name = "url_170x135") String str3) {
        C19383o.m32797g(str, "urlFullxFull");
        return new MainImage(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MainImage)) {
            return false;
        }
        MainImage mainImage = (MainImage) obj;
        return C19383o.m32792b(this.urlFullxFull, mainImage.urlFullxFull) && C19383o.m32792b(this.url75x75, mainImage.url75x75) && C19383o.m32792b(this.url170x135, mainImage.url170x135);
    }

    public final String getSquareImageUrl(int i) {
        return (i > 75 || !C18263b.m30839d0(this.url75x75)) ? this.urlFullxFull : this.url75x75;
    }

    public final String getUrl170x135() {
        return this.url170x135;
    }

    public final String getUrl75x75() {
        return this.url75x75;
    }

    public final String getUrlFullxFull() {
        return this.urlFullxFull;
    }

    public int hashCode() {
        int hashCode = this.urlFullxFull.hashCode() * 31;
        String str = this.url75x75;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url170x135;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("MainImage(urlFullxFull=");
        h.append(this.urlFullxFull);
        h.append(", url75x75=");
        h.append(this.url75x75);
        h.append(", url170x135=");
        return C0391c.m1057c(h, this.url170x135, ')');
    }
}
