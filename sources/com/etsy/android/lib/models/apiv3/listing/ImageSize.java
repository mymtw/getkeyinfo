package com.etsy.android.lib.models.apiv3.listing;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class ImageSize implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ImageSize> CREATOR = new Creator();
    private final int height;
    private final String url;
    private final int width;

    public static final class Creator implements Parcelable.Creator<ImageSize> {
        public final ImageSize createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new ImageSize(parcel.readInt(), parcel.readString(), parcel.readInt());
        }

        public final ImageSize[] newArray(int i) {
            return new ImageSize[i];
        }
    }

    public ImageSize(@C17402n(name = "height") int i, @C17402n(name = "url") String str, @C17402n(name = "width") int i2) {
        C19383o.m32797g(str, "url");
        this.height = i;
        this.url = str;
        this.width = i2;
    }

    public static /* synthetic */ ImageSize copy$default(ImageSize imageSize, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = imageSize.height;
        }
        if ((i3 & 2) != 0) {
            str = imageSize.url;
        }
        if ((i3 & 4) != 0) {
            i2 = imageSize.width;
        }
        return imageSize.copy(i, str, i2);
    }

    public final int component1() {
        return this.height;
    }

    public final String component2() {
        return this.url;
    }

    public final int component3() {
        return this.width;
    }

    public final ImageSize copy(@C17402n(name = "height") int i, @C17402n(name = "url") String str, @C17402n(name = "width") int i2) {
        C19383o.m32797g(str, "url");
        return new ImageSize(i, str, i2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageSize)) {
            return false;
        }
        ImageSize imageSize = (ImageSize) obj;
        return this.height == imageSize.height && C19383o.m32792b(this.url, imageSize.url) && this.width == imageSize.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Integer.hashCode(this.width) + C0023f.m105e(this.url, Integer.hashCode(this.height) * 31, 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ImageSize(height=");
        h.append(this.height);
        h.append(", url=");
        h.append(this.url);
        h.append(", width=");
        return C0073e.m208h(h, this.width, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeInt(this.height);
        parcel.writeString(this.url);
        parcel.writeInt(this.width);
    }
}
