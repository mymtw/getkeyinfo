package com.etsy.android.lib.models.apiv3.listing;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class Image implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Image> CREATOR = new Creator();
    private final String key;
    private final List<ImageSize> sources;
    private final String url;

    public static final class Creator implements Parcelable.Creator<Image> {
        public final Image createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            C19383o.m32797g(parcel, "parcel");
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(ImageSize.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new Image(readString, arrayList, parcel.readString());
        }

        public final Image[] newArray(int i) {
            return new Image[i];
        }
    }

    public Image() {
        this((String) null, (List) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public Image(@C17402n(name = "key") String str, @C17402n(name = "sources") List<ImageSize> list, @C17402n(name = "url") String str2) {
        this.key = str;
        this.sources = list;
        this.url = str2;
    }

    public static /* synthetic */ Image copy$default(Image image, String str, List<ImageSize> list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = image.key;
        }
        if ((i & 2) != 0) {
            list = image.sources;
        }
        if ((i & 4) != 0) {
            str2 = image.url;
        }
        return image.copy(str, list, str2);
    }

    public final String component1() {
        return this.key;
    }

    public final List<ImageSize> component2() {
        return this.sources;
    }

    public final String component3() {
        return this.url;
    }

    public final Image copy(@C17402n(name = "key") String str, @C17402n(name = "sources") List<ImageSize> list, @C17402n(name = "url") String str2) {
        return new Image(str, list, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Image)) {
            return false;
        }
        Image image = (Image) obj;
        return C19383o.m32792b(this.key, image.key) && C19383o.m32792b(this.sources, image.sources) && C19383o.m32792b(this.url, image.url);
    }

    public final String getKey() {
        return this.key;
    }

    public final List<ImageSize> getSources() {
        return this.sources;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.key;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<ImageSize> list = this.sources;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.url;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("Image(key=");
        h.append(this.key);
        h.append(", sources=");
        h.append(this.sources);
        h.append(", url=");
        return C0391c.m1057c(h, this.url, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.key);
        List<ImageSize> list = this.sources;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (ImageSize writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.url);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Image(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2);
    }
}
