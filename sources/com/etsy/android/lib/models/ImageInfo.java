package com.etsy.android.lib.models;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.Image2;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class ImageInfo {
    public static final int $stable = 8;
    private final long createDate;
    private final Image2 imageData;
    private final long imageId;
    private final int imageOrder;

    public ImageInfo(@C17402n(name = "image_id") long j, @C17402n(name = "create_date") long j2, @C17402n(name = "image_order") int i, @C17402n(name = "image_data") Image2 image2) {
        this.imageId = j;
        this.createDate = j2;
        this.imageOrder = i;
        this.imageData = image2;
    }

    public static /* synthetic */ ImageInfo copy$default(ImageInfo imageInfo, long j, long j2, int i, Image2 image2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = imageInfo.imageId;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = imageInfo.createDate;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            i = imageInfo.imageOrder;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            image2 = imageInfo.imageData;
        }
        return imageInfo.copy(j3, j4, i3, image2);
    }

    public final long component1() {
        return this.imageId;
    }

    public final long component2() {
        return this.createDate;
    }

    public final int component3() {
        return this.imageOrder;
    }

    public final Image2 component4() {
        return this.imageData;
    }

    public final ImageInfo copy(@C17402n(name = "image_id") long j, @C17402n(name = "create_date") long j2, @C17402n(name = "image_order") int i, @C17402n(name = "image_data") Image2 image2) {
        return new ImageInfo(j, j2, i, image2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageInfo)) {
            return false;
        }
        ImageInfo imageInfo = (ImageInfo) obj;
        return this.imageId == imageInfo.imageId && this.createDate == imageInfo.createDate && this.imageOrder == imageInfo.imageOrder && C19383o.m32792b(this.imageData, imageInfo.imageData);
    }

    public final long getCreateDate() {
        return this.createDate;
    }

    public final Image2 getImageData() {
        return this.imageData;
    }

    public final long getImageId() {
        return this.imageId;
    }

    public final int getImageOrder() {
        return this.imageOrder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        r0 = r0.getUrl();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getUrl75x75() {
        /*
            r6 = this;
            com.etsy.android.lib.models.apiv3.Image2 r0 = r6.imageData
            if (r0 == 0) goto L_0x003e
            java.util.List r0 = r0.getSources()
            if (r0 == 0) goto L_0x003e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0013:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0030
            java.lang.Object r2 = r0.next()
            r4 = r2
            com.etsy.android.lib.models.apiv3.Image2$Source r4 = (com.etsy.android.lib.models.apiv3.Image2.Source) r4
            int r4 = r4.getHeight()
            r5 = 75
            if (r4 != r5) goto L_0x002a
            r3 = 1
        L_0x002a:
            if (r3 == 0) goto L_0x0013
            r1.add(r2)
            goto L_0x0013
        L_0x0030:
            java.lang.Object r0 = kotlin.collections.C19327t.m32641W0(r3, r1)
            com.etsy.android.lib.models.apiv3.Image2$Source r0 = (com.etsy.android.lib.models.apiv3.Image2.Source) r0
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = r0.getUrl()
            if (r0 != 0) goto L_0x0040
        L_0x003e:
            java.lang.String r0 = ""
        L_0x0040:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.ImageInfo.getUrl75x75():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.getUrl();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getUrlFullxFull() {
        /*
            r1 = this;
            com.etsy.android.lib.models.apiv3.Image2 r0 = r1.imageData
            if (r0 == 0) goto L_0x000a
            java.lang.String r0 = r0.getUrl()
            if (r0 != 0) goto L_0x000c
        L_0x000a:
            java.lang.String r0 = ""
        L_0x000c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.ImageInfo.getUrlFullxFull():java.lang.String");
    }

    public int hashCode() {
        int a = C0069a.m170a(this.imageOrder, C0071c.m190b(this.createDate, Long.hashCode(this.imageId) * 31, 31), 31);
        Image2 image2 = this.imageData;
        return a + (image2 == null ? 0 : image2.hashCode());
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ImageInfo(imageId=");
        h.append(this.imageId);
        h.append(", createDate=");
        h.append(this.createDate);
        h.append(", imageOrder=");
        h.append(this.imageOrder);
        h.append(", imageData=");
        h.append(this.imageData);
        h.append(')');
        return h.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ImageInfo(long j, long j2, int i, Image2 image2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i2 & 2) != 0 ? 0 : j2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : image2);
    }
}
