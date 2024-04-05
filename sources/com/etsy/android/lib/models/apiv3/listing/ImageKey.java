package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class ImageKey {
    public static final int $stable = 0;
    private final String color;
    private final String extension;
    private final Integer height;
    private final Integer hue;
    private final Long imageId;
    private final String imageType;
    private final Long ownerId;
    private final Integer saturation;
    private final String secret;
    private final Integer storage;
    private final Integer version;
    private final Integer width;

    public ImageKey(@C17402n(name = "color") String str, @C17402n(name = "extension") String str2, @C17402n(name = "height") Integer num, @C17402n(name = "hue") Integer num2, @C17402n(name = "image_id") Long l, @C17402n(name = "image_type") String str3, @C17402n(name = "owner_id") Long l2, @C17402n(name = "saturation") Integer num3, @C17402n(name = "secret") String str4, @C17402n(name = "storage") Integer num4, @C17402n(name = "version") Integer num5, @C17402n(name = "width") Integer num6) {
        this.color = str;
        this.extension = str2;
        this.height = num;
        this.hue = num2;
        this.imageId = l;
        this.imageType = str3;
        this.ownerId = l2;
        this.saturation = num3;
        this.secret = str4;
        this.storage = num4;
        this.version = num5;
        this.width = num6;
    }

    public static /* synthetic */ ImageKey copy$default(ImageKey imageKey, String str, String str2, Integer num, Integer num2, Long l, String str3, Long l2, Integer num3, String str4, Integer num4, Integer num5, Integer num6, int i, Object obj) {
        ImageKey imageKey2 = imageKey;
        int i2 = i;
        return imageKey.copy((i2 & 1) != 0 ? imageKey2.color : str, (i2 & 2) != 0 ? imageKey2.extension : str2, (i2 & 4) != 0 ? imageKey2.height : num, (i2 & 8) != 0 ? imageKey2.hue : num2, (i2 & 16) != 0 ? imageKey2.imageId : l, (i2 & 32) != 0 ? imageKey2.imageType : str3, (i2 & 64) != 0 ? imageKey2.ownerId : l2, (i2 & 128) != 0 ? imageKey2.saturation : num3, (i2 & 256) != 0 ? imageKey2.secret : str4, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? imageKey2.storage : num4, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? imageKey2.version : num5, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? imageKey2.width : num6);
    }

    public final String component1() {
        return this.color;
    }

    public final Integer component10() {
        return this.storage;
    }

    public final Integer component11() {
        return this.version;
    }

    public final Integer component12() {
        return this.width;
    }

    public final String component2() {
        return this.extension;
    }

    public final Integer component3() {
        return this.height;
    }

    public final Integer component4() {
        return this.hue;
    }

    public final Long component5() {
        return this.imageId;
    }

    public final String component6() {
        return this.imageType;
    }

    public final Long component7() {
        return this.ownerId;
    }

    public final Integer component8() {
        return this.saturation;
    }

    public final String component9() {
        return this.secret;
    }

    public final ImageKey copy(@C17402n(name = "color") String str, @C17402n(name = "extension") String str2, @C17402n(name = "height") Integer num, @C17402n(name = "hue") Integer num2, @C17402n(name = "image_id") Long l, @C17402n(name = "image_type") String str3, @C17402n(name = "owner_id") Long l2, @C17402n(name = "saturation") Integer num3, @C17402n(name = "secret") String str4, @C17402n(name = "storage") Integer num4, @C17402n(name = "version") Integer num5, @C17402n(name = "width") Integer num6) {
        return new ImageKey(str, str2, num, num2, l, str3, l2, num3, str4, num4, num5, num6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageKey)) {
            return false;
        }
        ImageKey imageKey = (ImageKey) obj;
        return C19383o.m32792b(this.color, imageKey.color) && C19383o.m32792b(this.extension, imageKey.extension) && C19383o.m32792b(this.height, imageKey.height) && C19383o.m32792b(this.hue, imageKey.hue) && C19383o.m32792b(this.imageId, imageKey.imageId) && C19383o.m32792b(this.imageType, imageKey.imageType) && C19383o.m32792b(this.ownerId, imageKey.ownerId) && C19383o.m32792b(this.saturation, imageKey.saturation) && C19383o.m32792b(this.secret, imageKey.secret) && C19383o.m32792b(this.storage, imageKey.storage) && C19383o.m32792b(this.version, imageKey.version) && C19383o.m32792b(this.width, imageKey.width);
    }

    public final String getColor() {
        return this.color;
    }

    public final String getExtension() {
        return this.extension;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final Integer getHue() {
        return this.hue;
    }

    public final Long getImageId() {
        return this.imageId;
    }

    public final String getImageType() {
        return this.imageType;
    }

    public final Long getOwnerId() {
        return this.ownerId;
    }

    public final Integer getSaturation() {
        return this.saturation;
    }

    public final String getSecret() {
        return this.secret;
    }

    public final Integer getStorage() {
        return this.storage;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.color;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.extension;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.height;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.hue;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.imageId;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.imageType;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.ownerId;
        int hashCode7 = (hashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num3 = this.saturation;
        int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.secret;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num4 = this.storage;
        int hashCode10 = (hashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.version;
        int hashCode11 = (hashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.width;
        if (num6 != null) {
            i = num6.hashCode();
        }
        return hashCode11 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ImageKey(color=");
        h.append(this.color);
        h.append(", extension=");
        h.append(this.extension);
        h.append(", height=");
        h.append(this.height);
        h.append(", hue=");
        h.append(this.hue);
        h.append(", imageId=");
        h.append(this.imageId);
        h.append(", imageType=");
        h.append(this.imageType);
        h.append(", ownerId=");
        h.append(this.ownerId);
        h.append(", saturation=");
        h.append(this.saturation);
        h.append(", secret=");
        h.append(this.secret);
        h.append(", storage=");
        h.append(this.storage);
        h.append(", version=");
        h.append(this.version);
        h.append(", width=");
        return C0023f.m109j(h, this.width, ')');
    }
}
