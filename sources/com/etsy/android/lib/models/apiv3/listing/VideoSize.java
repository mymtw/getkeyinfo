package com.etsy.android.lib.models.apiv3.listing;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class VideoSize implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<VideoSize> CREATOR = new Creator();
    private final String format;
    private final String type;
    private final String url;

    public static final class Creator implements Parcelable.Creator<VideoSize> {
        public final VideoSize createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new VideoSize(parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final VideoSize[] newArray(int i) {
            return new VideoSize[i];
        }
    }

    public VideoSize(String str, String str2, String str3) {
        C19383o.m32797g(str2, "type");
        this.format = str;
        this.type = str2;
        this.url = str3;
    }

    public static /* synthetic */ VideoSize copy$default(VideoSize videoSize, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoSize.format;
        }
        if ((i & 2) != 0) {
            str2 = videoSize.type;
        }
        if ((i & 4) != 0) {
            str3 = videoSize.url;
        }
        return videoSize.copy(str, str2, str3);
    }

    public final String component1() {
        return this.format;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.url;
    }

    public final VideoSize copy(String str, String str2, String str3) {
        C19383o.m32797g(str2, "type");
        return new VideoSize(str, str2, str3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSize)) {
            return false;
        }
        VideoSize videoSize = (VideoSize) obj;
        return C19383o.m32792b(this.format, videoSize.format) && C19383o.m32792b(this.type, videoSize.type) && C19383o.m32792b(this.url, videoSize.url);
    }

    public final String getFormat() {
        return this.format;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.format;
        int i = 0;
        int e = C0023f.m105e(this.type, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.url;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return e + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("VideoSize(format=");
        h.append(this.format);
        h.append(", type=");
        h.append(this.type);
        h.append(", url=");
        return C0391c.m1057c(h, this.url, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.format);
        parcel.writeString(this.type);
        parcel.writeString(this.url);
    }
}
