package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;

@C17403o(generateAdapter = true)
public final class AppreciationPhoto {
    public static final int $stable = 0;
    private final Integer createDate;
    private final String createSource;
    private final Long imageId;
    private final ImageKey imageKey;
    private final Boolean isSellerApproved;
    private final String status;
    private final Long transactionId;
    private final String url;
    private final String url1140xN;
    private final String url170x135;
    private final String url224xN;
    private final String url300x300;
    private final String url340x270;
    private final String url570xN;
    private final String url600x600;
    private final String url642xN;
    private final String url680x540;
    private final String url75x75;
    private final String urlFullxfull;

    public AppreciationPhoto(@C17402n(name = "create_date") Integer num, @C17402n(name = "create_source") String str, @C17402n(name = "image_id") Long l, @C17402n(name = "image_key") ImageKey imageKey2, @C17402n(name = "is_seller_approved") Boolean bool, @C17402n(name = "status") String str2, @C17402n(name = "transaction_id") Long l2, @C17402n(name = "url") String str3, @C17402n(name = "url_1140xN") String str4, @C17402n(name = "url_170x135") String str5, @C17402n(name = "url_224xN") String str6, @C17402n(name = "url_300x300") String str7, @C17402n(name = "url_340x270") String str8, @C17402n(name = "url_570xN") String str9, @C17402n(name = "url_600x600") String str10, @C17402n(name = "url_642xN") String str11, @C17402n(name = "url_680x540") String str12, @C17402n(name = "url_75x75") String str13, @C17402n(name = "url_fullxfull") String str14) {
        this.createDate = num;
        this.createSource = str;
        this.imageId = l;
        this.imageKey = imageKey2;
        this.isSellerApproved = bool;
        this.status = str2;
        this.transactionId = l2;
        this.url = str3;
        this.url1140xN = str4;
        this.url170x135 = str5;
        this.url224xN = str6;
        this.url300x300 = str7;
        this.url340x270 = str8;
        this.url570xN = str9;
        this.url600x600 = str10;
        this.url642xN = str11;
        this.url680x540 = str12;
        this.url75x75 = str13;
        this.urlFullxfull = str14;
    }

    public static /* synthetic */ AppreciationPhoto copy$default(AppreciationPhoto appreciationPhoto, Integer num, String str, Long l, ImageKey imageKey2, Boolean bool, String str2, Long l2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, Object obj) {
        AppreciationPhoto appreciationPhoto2 = appreciationPhoto;
        int i2 = i;
        return appreciationPhoto.copy((i2 & 1) != 0 ? appreciationPhoto2.createDate : num, (i2 & 2) != 0 ? appreciationPhoto2.createSource : str, (i2 & 4) != 0 ? appreciationPhoto2.imageId : l, (i2 & 8) != 0 ? appreciationPhoto2.imageKey : imageKey2, (i2 & 16) != 0 ? appreciationPhoto2.isSellerApproved : bool, (i2 & 32) != 0 ? appreciationPhoto2.status : str2, (i2 & 64) != 0 ? appreciationPhoto2.transactionId : l2, (i2 & 128) != 0 ? appreciationPhoto2.url : str3, (i2 & 256) != 0 ? appreciationPhoto2.url1140xN : str4, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? appreciationPhoto2.url170x135 : str5, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? appreciationPhoto2.url224xN : str6, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? appreciationPhoto2.url300x300 : str7, (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? appreciationPhoto2.url340x270 : str8, (i2 & 8192) != 0 ? appreciationPhoto2.url570xN : str9, (i2 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? appreciationPhoto2.url600x600 : str10, (i2 & 32768) != 0 ? appreciationPhoto2.url642xN : str11, (i2 & 65536) != 0 ? appreciationPhoto2.url680x540 : str12, (i2 & 131072) != 0 ? appreciationPhoto2.url75x75 : str13, (i2 & PrimitiveArrayBuilder.MAX_CHUNK_SIZE) != 0 ? appreciationPhoto2.urlFullxfull : str14);
    }

    public final Integer component1() {
        return this.createDate;
    }

    public final String component10() {
        return this.url170x135;
    }

    public final String component11() {
        return this.url224xN;
    }

    public final String component12() {
        return this.url300x300;
    }

    public final String component13() {
        return this.url340x270;
    }

    public final String component14() {
        return this.url570xN;
    }

    public final String component15() {
        return this.url600x600;
    }

    public final String component16() {
        return this.url642xN;
    }

    public final String component17() {
        return this.url680x540;
    }

    public final String component18() {
        return this.url75x75;
    }

    public final String component19() {
        return this.urlFullxfull;
    }

    public final String component2() {
        return this.createSource;
    }

    public final Long component3() {
        return this.imageId;
    }

    public final ImageKey component4() {
        return this.imageKey;
    }

    public final Boolean component5() {
        return this.isSellerApproved;
    }

    public final String component6() {
        return this.status;
    }

    public final Long component7() {
        return this.transactionId;
    }

    public final String component8() {
        return this.url;
    }

    public final String component9() {
        return this.url1140xN;
    }

    public final AppreciationPhoto copy(@C17402n(name = "create_date") Integer num, @C17402n(name = "create_source") String str, @C17402n(name = "image_id") Long l, @C17402n(name = "image_key") ImageKey imageKey2, @C17402n(name = "is_seller_approved") Boolean bool, @C17402n(name = "status") String str2, @C17402n(name = "transaction_id") Long l2, @C17402n(name = "url") String str3, @C17402n(name = "url_1140xN") String str4, @C17402n(name = "url_170x135") String str5, @C17402n(name = "url_224xN") String str6, @C17402n(name = "url_300x300") String str7, @C17402n(name = "url_340x270") String str8, @C17402n(name = "url_570xN") String str9, @C17402n(name = "url_600x600") String str10, @C17402n(name = "url_642xN") String str11, @C17402n(name = "url_680x540") String str12, @C17402n(name = "url_75x75") String str13, @C17402n(name = "url_fullxfull") String str14) {
        return new AppreciationPhoto(num, str, l, imageKey2, bool, str2, l2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppreciationPhoto)) {
            return false;
        }
        AppreciationPhoto appreciationPhoto = (AppreciationPhoto) obj;
        return C19383o.m32792b(this.createDate, appreciationPhoto.createDate) && C19383o.m32792b(this.createSource, appreciationPhoto.createSource) && C19383o.m32792b(this.imageId, appreciationPhoto.imageId) && C19383o.m32792b(this.imageKey, appreciationPhoto.imageKey) && C19383o.m32792b(this.isSellerApproved, appreciationPhoto.isSellerApproved) && C19383o.m32792b(this.status, appreciationPhoto.status) && C19383o.m32792b(this.transactionId, appreciationPhoto.transactionId) && C19383o.m32792b(this.url, appreciationPhoto.url) && C19383o.m32792b(this.url1140xN, appreciationPhoto.url1140xN) && C19383o.m32792b(this.url170x135, appreciationPhoto.url170x135) && C19383o.m32792b(this.url224xN, appreciationPhoto.url224xN) && C19383o.m32792b(this.url300x300, appreciationPhoto.url300x300) && C19383o.m32792b(this.url340x270, appreciationPhoto.url340x270) && C19383o.m32792b(this.url570xN, appreciationPhoto.url570xN) && C19383o.m32792b(this.url600x600, appreciationPhoto.url600x600) && C19383o.m32792b(this.url642xN, appreciationPhoto.url642xN) && C19383o.m32792b(this.url680x540, appreciationPhoto.url680x540) && C19383o.m32792b(this.url75x75, appreciationPhoto.url75x75) && C19383o.m32792b(this.urlFullxfull, appreciationPhoto.urlFullxfull);
    }

    public final Integer getCreateDate() {
        return this.createDate;
    }

    public final String getCreateSource() {
        return this.createSource;
    }

    public final Long getImageId() {
        return this.imageId;
    }

    public final ImageKey getImageKey() {
        return this.imageKey;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Long getTransactionId() {
        return this.transactionId;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getUrl1140xN() {
        return this.url1140xN;
    }

    public final String getUrl170x135() {
        return this.url170x135;
    }

    public final String getUrl224xN() {
        return this.url224xN;
    }

    public final String getUrl300x300() {
        return this.url300x300;
    }

    public final String getUrl340x270() {
        return this.url340x270;
    }

    public final String getUrl570xN() {
        return this.url570xN;
    }

    public final String getUrl600x600() {
        return this.url600x600;
    }

    public final String getUrl642xN() {
        return this.url642xN;
    }

    public final String getUrl680x540() {
        return this.url680x540;
    }

    public final String getUrl75x75() {
        return this.url75x75;
    }

    public final String getUrlFullxfull() {
        return this.urlFullxfull;
    }

    public int hashCode() {
        Integer num = this.createDate;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.createSource;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.imageId;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        ImageKey imageKey2 = this.imageKey;
        int hashCode4 = (hashCode3 + (imageKey2 == null ? 0 : imageKey2.hashCode())) * 31;
        Boolean bool = this.isSellerApproved;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.status;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.transactionId;
        int hashCode7 = (hashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.url;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.url1140xN;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.url170x135;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.url224xN;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.url300x300;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.url340x270;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.url570xN;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.url600x600;
        int hashCode15 = (hashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.url642xN;
        int hashCode16 = (hashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.url680x540;
        int hashCode17 = (hashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.url75x75;
        int hashCode18 = (hashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.urlFullxfull;
        if (str14 != null) {
            i = str14.hashCode();
        }
        return hashCode18 + i;
    }

    public final Boolean isSellerApproved() {
        return this.isSellerApproved;
    }

    public final String pickBestSquareImage(int i) {
        return (i > 75 || !C18263b.m30837c0(this.url75x75)) ? (i > 300 || !C18263b.m30837c0(this.url300x300)) ? (i > 600 || !C18263b.m30837c0(this.url600x600)) ? this.urlFullxfull : this.url600x600 : this.url300x300 : this.url75x75;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("AppreciationPhoto(createDate=");
        h.append(this.createDate);
        h.append(", createSource=");
        h.append(this.createSource);
        h.append(", imageId=");
        h.append(this.imageId);
        h.append(", imageKey=");
        h.append(this.imageKey);
        h.append(", isSellerApproved=");
        h.append(this.isSellerApproved);
        h.append(", status=");
        h.append(this.status);
        h.append(", transactionId=");
        h.append(this.transactionId);
        h.append(", url=");
        h.append(this.url);
        h.append(", url1140xN=");
        h.append(this.url1140xN);
        h.append(", url170x135=");
        h.append(this.url170x135);
        h.append(", url224xN=");
        h.append(this.url224xN);
        h.append(", url300x300=");
        h.append(this.url300x300);
        h.append(", url340x270=");
        h.append(this.url340x270);
        h.append(", url570xN=");
        h.append(this.url570xN);
        h.append(", url600x600=");
        h.append(this.url600x600);
        h.append(", url642xN=");
        h.append(this.url642xN);
        h.append(", url680x540=");
        h.append(this.url680x540);
        h.append(", url75x75=");
        h.append(this.url75x75);
        h.append(", urlFullxfull=");
        return C0391c.m1057c(h, this.urlFullxfull, ')');
    }
}
