package com.etsy.android.lib.models.apiv3.circles;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class CircledUserProfile {
    public static final int $stable = 0;
    private final String imageUrl;

    public CircledUserProfile(@C17402n(name = "image_url_75x75") String str) {
        C19383o.m32797g(str, "imageUrl");
        this.imageUrl = str;
    }

    public static /* synthetic */ CircledUserProfile copy$default(CircledUserProfile circledUserProfile, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = circledUserProfile.imageUrl;
        }
        return circledUserProfile.copy(str);
    }

    public final String component1() {
        return this.imageUrl;
    }

    public final CircledUserProfile copy(@C17402n(name = "image_url_75x75") String str) {
        C19383o.m32797g(str, "imageUrl");
        return new CircledUserProfile(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CircledUserProfile) && C19383o.m32792b(this.imageUrl, ((CircledUserProfile) obj).imageUrl);
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public int hashCode() {
        return this.imageUrl.hashCode();
    }

    public String toString() {
        return C0391c.m1057c(C0072d.m201h("CircledUserProfile(imageUrl="), this.imageUrl, ')');
    }
}
