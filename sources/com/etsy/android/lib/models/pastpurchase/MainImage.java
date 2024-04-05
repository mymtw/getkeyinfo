package com.etsy.android.lib.models.pastpurchase;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class MainImage {
    public static final int $stable = 0;
    private final String urlFullxfull;

    public MainImage(@C17402n(name = "url_fullxfull") String str) {
        this.urlFullxfull = str;
    }

    public static /* synthetic */ MainImage copy$default(MainImage mainImage, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mainImage.urlFullxfull;
        }
        return mainImage.copy(str);
    }

    public final String component1() {
        return this.urlFullxfull;
    }

    public final MainImage copy(@C17402n(name = "url_fullxfull") String str) {
        return new MainImage(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MainImage) && C19383o.m32792b(this.urlFullxfull, ((MainImage) obj).urlFullxfull);
    }

    public final String getUrlFullxfull() {
        return this.urlFullxfull;
    }

    public int hashCode() {
        String str = this.urlFullxfull;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return C0391c.m1057c(C0072d.m201h("MainImage(urlFullxfull="), this.urlFullxfull, ')');
    }
}
