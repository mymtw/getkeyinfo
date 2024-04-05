package com.etsy.android.lib.models.apiv3.sdl;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class ColorPair {
    public static final int $stable = 0;
    private final String backgroundColorDark;
    private final String backgroundColorLight;

    public ColorPair(@C17402n(name = "default") String str, @C17402n(name = "dark") String str2) {
        C19383o.m32797g(str, "backgroundColorLight");
        C19383o.m32797g(str2, "backgroundColorDark");
        this.backgroundColorLight = str;
        this.backgroundColorDark = str2;
    }

    public static /* synthetic */ ColorPair copy$default(ColorPair colorPair, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = colorPair.backgroundColorLight;
        }
        if ((i & 2) != 0) {
            str2 = colorPair.backgroundColorDark;
        }
        return colorPair.copy(str, str2);
    }

    public final String component1() {
        return this.backgroundColorLight;
    }

    public final String component2() {
        return this.backgroundColorDark;
    }

    public final ColorPair copy(@C17402n(name = "default") String str, @C17402n(name = "dark") String str2) {
        C19383o.m32797g(str, "backgroundColorLight");
        C19383o.m32797g(str2, "backgroundColorDark");
        return new ColorPair(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorPair)) {
            return false;
        }
        ColorPair colorPair = (ColorPair) obj;
        return C19383o.m32792b(this.backgroundColorLight, colorPair.backgroundColorLight) && C19383o.m32792b(this.backgroundColorDark, colorPair.backgroundColorDark);
    }

    public final String getBackgroundColorDark() {
        return this.backgroundColorDark;
    }

    public final String getBackgroundColorLight() {
        return this.backgroundColorLight;
    }

    public int hashCode() {
        return this.backgroundColorDark.hashCode() + (this.backgroundColorLight.hashCode() * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ColorPair(backgroundColorLight=");
        h.append(this.backgroundColorLight);
        h.append(", backgroundColorDark=");
        return C0391c.m1057c(h, this.backgroundColorDark, ')');
    }
}
