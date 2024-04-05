package com.etsy.android.lib.models.apiv3.listing;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;
import p504ai.C13983i;

@C17403o(generateAdapter = true)
public final class Video implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Video> CREATOR = new Creator();
    private final Integer height;
    private final String key;
    private final String posterUrl;
    private final List<VideoSize> sources;
    private final String thumbnailUrl;
    private final String url;
    private final Integer width;

    public static final class Creator implements Parcelable.Creator<Video> {
        public final Video createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            C19383o.m32797g(parcel, "parcel");
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(VideoSize.CREATOR.createFromParcel(parcel));
                }
            }
            return new Video(readString, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        public final Video[] newArray(int i) {
            return new Video[i];
        }
    }

    public Video() {
        this((String) null, (List) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, 127, (DefaultConstructorMarker) null);
    }

    public Video(@C17402n(name = "key") String str, @C17402n(name = "sources") List<VideoSize> list, @C17402n(name = "url") String str2, @C17402n(name = "poster_url") String str3, @C17402n(name = "thumbnail_url") String str4, Integer num, Integer num2) {
        this.key = str;
        this.sources = list;
        this.url = str2;
        this.posterUrl = str3;
        this.thumbnailUrl = str4;
        this.width = num;
        this.height = num2;
    }

    public static /* synthetic */ Video copy$default(Video video, String str, List<VideoSize> list, String str2, String str3, String str4, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = video.key;
        }
        if ((i & 2) != 0) {
            list = video.sources;
        }
        List<VideoSize> list2 = list;
        if ((i & 4) != 0) {
            str2 = video.url;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = video.posterUrl;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = video.thumbnailUrl;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            num = video.width;
        }
        Integer num3 = num;
        if ((i & 64) != 0) {
            num2 = video.height;
        }
        return video.copy(str, list2, str5, str6, str7, num3, num2);
    }

    public final String component1() {
        return this.key;
    }

    public final List<VideoSize> component2() {
        return this.sources;
    }

    public final String component3() {
        return this.url;
    }

    public final String component4() {
        return this.posterUrl;
    }

    public final String component5() {
        return this.thumbnailUrl;
    }

    public final Integer component6() {
        return this.width;
    }

    public final Integer component7() {
        return this.height;
    }

    public final Video copy() {
        return copy();
    }

    public final Video copy(@C17402n(name = "key") String str, @C17402n(name = "sources") List<VideoSize> list, @C17402n(name = "url") String str2, @C17402n(name = "poster_url") String str3, @C17402n(name = "thumbnail_url") String str4, Integer num, Integer num2) {
        return new Video(str, list, str2, str3, str4, num, num2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Video)) {
            return false;
        }
        Video video = (Video) obj;
        return C19383o.m32792b(this.key, video.key) && C19383o.m32792b(this.sources, video.sources) && C19383o.m32792b(this.url, video.url) && C19383o.m32792b(this.posterUrl, video.posterUrl) && C19383o.m32792b(this.thumbnailUrl, video.thumbnailUrl) && C19383o.m32792b(this.width, video.width) && C19383o.m32792b(this.height, video.height);
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getPosterUrl() {
        return this.posterUrl;
    }

    public final List<VideoSize> getSources() {
        return this.sources;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.key;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<VideoSize> list = this.sources;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.url;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.posterUrl;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.thumbnailUrl;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.width;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("Video(key=");
        h.append(this.key);
        h.append(", sources=");
        h.append(this.sources);
        h.append(", url=");
        h.append(this.url);
        h.append(", posterUrl=");
        h.append(this.posterUrl);
        h.append(", thumbnailUrl=");
        h.append(this.thumbnailUrl);
        h.append(", width=");
        h.append(this.width);
        h.append(", height=");
        return C0023f.m109j(h, this.height, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.key);
        List<VideoSize> list = this.sources;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (VideoSize writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.url);
        parcel.writeString(this.posterUrl);
        parcel.writeString(this.thumbnailUrl);
        Integer num = this.width;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            C13983i.m21499r(parcel, 1, num);
        }
        Integer num2 = this.height;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            C13983i.m21499r(parcel, 1, num2);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Video(java.lang.String r7, java.util.List r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.Integer r12, java.lang.Integer r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto L_0x0007
            r15 = r0
            goto L_0x0008
        L_0x0007:
            r15 = r7
        L_0x0008:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r8
        L_0x000f:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r9
        L_0x0016:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r10
        L_0x001d:
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r11
        L_0x0024:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002a
            r5 = r0
            goto L_0x002b
        L_0x002a:
            r5 = r12
        L_0x002b:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0031
            r14 = r0
            goto L_0x0032
        L_0x0031:
            r14 = r13
        L_0x0032:
            r7 = r6
            r8 = r15
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.Video.<init>(java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
