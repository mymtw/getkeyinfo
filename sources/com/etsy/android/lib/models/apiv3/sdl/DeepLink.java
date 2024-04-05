package com.etsy.android.lib.models.apiv3.sdl;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class DeepLink {
    public static final int $stable = 8;
    private String url;

    public DeepLink(@C17402n(name = "url") String str) {
        this.url = str;
    }

    public static /* synthetic */ DeepLink copy$default(DeepLink deepLink, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deepLink.url;
        }
        return deepLink.copy(str);
    }

    public final String component1() {
        return this.url;
    }

    public final DeepLink copy(@C17402n(name = "url") String str) {
        return new DeepLink(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeepLink) && C19383o.m32792b(this.url, ((DeepLink) obj).url);
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        return C0391c.m1057c(C0072d.m201h("DeepLink(url="), this.url, ')');
    }
}
