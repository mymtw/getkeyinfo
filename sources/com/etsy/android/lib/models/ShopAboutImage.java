package com.etsy.android.lib.models;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.logger.C8697k;
import com.etsy.android.lib.logger.C8699m;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.apiv3.Image;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import kotlin.text.C19457k;
import p628nj.C18263b;

@C17403o(generateAdapter = true)
public final class ShopAboutImage implements BaseModelImageCompat, C8697k {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int DEFAULT_LOADING_COLOR = -1842209;
    /* access modifiers changed from: private */
    public static final Pair<Integer, String>[] IMG_SIZES_ARRAY = {ImageSizes.IMG_SIZE_178, ImageSizes.IMG_SIZE_545, ImageSizes.IMG_SIZE_760};
    private String altText;
    private final String caption;
    private int fullHeight;
    private final String fullSizedImage;
    private int fullWidth;
    private int imageColor;
    private EtsyId imageId;
    private final String imageUrl;
    private final String imageUrl178x178;
    private final String imageUrl545xN;
    private final String imageUrl760xN;
    private final String key;
    private final int rank;
    private final Image shopAboutImage;
    private final List<Image.Source> sources;
    private C8699m trackingData;
    private final String url;
    private String url170x135;
    private String url224xN;
    private String url300x300;
    private String url340x270;
    private String url570xN;
    private String url680x540;
    private String url75x75;
    private String urlFullxFull;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Pair<Integer, String>[] getIMG_SIZES_ARRAY() {
            return ShopAboutImage.IMG_SIZES_ARRAY;
        }
    }

    public ShopAboutImage(@C17402n(name = "image_id") EtsyId etsyId, @C17402n(name = "url_178x178") String str, @C17402n(name = "url_545xN") String str2, @C17402n(name = "url_760xN") String str3, @C17402n(name = "caption") String str4, @C17402n(name = "rank") int i, @C17402n(name = "image") Image image, @C17402n(name = "key") String str5, @C17402n(name = "url") String str6, @C17402n(name = "sources") List<? extends Image.Source> list, @C17402n(ignore = true) String str7, @C17402n(name = "url_75x75") String str8, @C17402n(name = "url_170x135") String str9, @C17402n(name = "url_224xN") String str10, @C17402n(name = "url_340x270") String str11, @C17402n(name = "url_680x540") String str12, @C17402n(name = "url_570xN") String str13, @C17402n(name = "url_300x300") String str14, @C17402n(name = "url_fullxfull") String str15, @C17402n(name = "full_height") int i2, @C17402n(name = "full_width") int i3, @C17402n(name = "alt_text") String str16) {
        String str17 = str2;
        String str18 = str15;
        C19383o.m32797g(etsyId, "imageId");
        C19383o.m32797g(str18, "urlFullxFull");
        this.imageId = etsyId;
        this.imageUrl178x178 = str;
        this.imageUrl545xN = str17;
        this.imageUrl760xN = str3;
        this.caption = str4;
        this.rank = i;
        this.shopAboutImage = image;
        this.key = str5;
        this.url = str6;
        this.sources = list;
        this.fullSizedImage = str7;
        this.url75x75 = str8;
        this.url170x135 = str9;
        this.url224xN = str10;
        this.url340x270 = str11;
        this.url680x540 = str12;
        this.url570xN = str13;
        this.url300x300 = str14;
        this.urlFullxFull = str18;
        this.fullHeight = i2;
        this.fullWidth = i3;
        this.altText = str16;
        this.imageUrl = str17;
        this.imageColor = -1842209;
        this.trackingData = new C8699m(C19421p.m32931U(new Pair(PredefinedAnalyticsProperty.IMAGE_ID, getImageId())), 14);
    }

    public static /* synthetic */ ShopAboutImage copy$default(ShopAboutImage shopAboutImage2, EtsyId etsyId, String str, String str2, String str3, String str4, int i, Image image, String str5, String str6, List list, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i2, int i3, String str16, int i4, Object obj) {
        ShopAboutImage shopAboutImage3 = shopAboutImage2;
        int i5 = i4;
        return shopAboutImage2.copy((i5 & 1) != 0 ? shopAboutImage2.getImageId() : etsyId, (i5 & 2) != 0 ? shopAboutImage3.imageUrl178x178 : str, (i5 & 4) != 0 ? shopAboutImage3.imageUrl545xN : str2, (i5 & 8) != 0 ? shopAboutImage3.imageUrl760xN : str3, (i5 & 16) != 0 ? shopAboutImage3.caption : str4, (i5 & 32) != 0 ? shopAboutImage3.rank : i, (i5 & 64) != 0 ? shopAboutImage3.shopAboutImage : image, (i5 & 128) != 0 ? shopAboutImage3.key : str5, (i5 & 256) != 0 ? shopAboutImage3.url : str6, (i5 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? shopAboutImage3.sources : list, (i5 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? shopAboutImage2.getFullSizedImage() : str7, (i5 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? shopAboutImage2.getUrl75x75() : str8, (i5 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? shopAboutImage2.getUrl170x135() : str9, (i5 & 8192) != 0 ? shopAboutImage2.getUrl224xN() : str10, (i5 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? shopAboutImage2.getUrl340x270() : str11, (i5 & 32768) != 0 ? shopAboutImage2.getUrl680x540() : str12, (i5 & 65536) != 0 ? shopAboutImage2.getUrl570xN() : str13, (i5 & 131072) != 0 ? shopAboutImage2.getUrl300x300() : str14, (i5 & PrimitiveArrayBuilder.MAX_CHUNK_SIZE) != 0 ? shopAboutImage2.getUrlFullxFull() : str15, (i5 & 524288) != 0 ? shopAboutImage2.getFullHeight() : i2, (i5 & 1048576) != 0 ? shopAboutImage2.getFullWidth() : i3, (i5 & 2097152) != 0 ? shopAboutImage2.getAltText() : str16);
    }

    private final String getLargestDimension() {
        return ImageSizes.IMG_SIZE_545.getSecond();
    }

    @C17402n(ignore = true)
    private static /* synthetic */ void getLargestDimension$annotations() {
    }

    private final String getReplaceDimensionForWidth(int i) {
        String str;
        int length = IMG_SIZES_ARRAY.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                str = null;
                break;
            }
            Pair<Integer, String>[] pairArr = IMG_SIZES_ARRAY;
            if (i <= pairArr[i2].getFirst().intValue()) {
                str = pairArr[i2].getSecond();
                break;
            }
            i2++;
        }
        return str == null ? getLargestDimension() : str;
    }

    @C17402n(ignore = true)
    public static /* synthetic */ void getTrackingData$annotations() {
    }

    public final EtsyId component1() {
        return getImageId();
    }

    public final List<Image.Source> component10() {
        return this.sources;
    }

    public final String component11() {
        return getFullSizedImage();
    }

    public final String component12() {
        return getUrl75x75();
    }

    public final String component13() {
        return getUrl170x135();
    }

    public final String component14() {
        return getUrl224xN();
    }

    public final String component15() {
        return getUrl340x270();
    }

    public final String component16() {
        return getUrl680x540();
    }

    public final String component17() {
        return getUrl570xN();
    }

    public final String component18() {
        return getUrl300x300();
    }

    public final String component19() {
        return getUrlFullxFull();
    }

    public final String component2() {
        return this.imageUrl178x178;
    }

    public final int component20() {
        return getFullHeight();
    }

    public final int component21() {
        return getFullWidth();
    }

    public final String component22() {
        return getAltText();
    }

    public final String component3() {
        return this.imageUrl545xN;
    }

    public final String component4() {
        return this.imageUrl760xN;
    }

    public final String component5() {
        return this.caption;
    }

    public final int component6() {
        return this.rank;
    }

    public final Image component7() {
        return this.shopAboutImage;
    }

    public final String component8() {
        return this.key;
    }

    public final String component9() {
        return this.url;
    }

    public final ShopAboutImage copy(@C17402n(name = "image_id") EtsyId etsyId, @C17402n(name = "url_178x178") String str, @C17402n(name = "url_545xN") String str2, @C17402n(name = "url_760xN") String str3, @C17402n(name = "caption") String str4, @C17402n(name = "rank") int i, @C17402n(name = "image") Image image, @C17402n(name = "key") String str5, @C17402n(name = "url") String str6, @C17402n(name = "sources") List<? extends Image.Source> list, @C17402n(ignore = true) String str7, @C17402n(name = "url_75x75") String str8, @C17402n(name = "url_170x135") String str9, @C17402n(name = "url_224xN") String str10, @C17402n(name = "url_340x270") String str11, @C17402n(name = "url_680x540") String str12, @C17402n(name = "url_570xN") String str13, @C17402n(name = "url_300x300") String str14, @C17402n(name = "url_fullxfull") String str15, @C17402n(name = "full_height") int i2, @C17402n(name = "full_width") int i3, @C17402n(name = "alt_text") String str16) {
        EtsyId etsyId2 = etsyId;
        C19383o.m32797g(etsyId2, "imageId");
        C19383o.m32797g(str15, "urlFullxFull");
        return new ShopAboutImage(etsyId2, str, str2, str3, str4, i, image, str5, str6, list, str7, str8, str9, str10, str11, str12, str13, str14, str15, i2, i3, str16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopAboutImage)) {
            return false;
        }
        ShopAboutImage shopAboutImage2 = (ShopAboutImage) obj;
        return C19383o.m32792b(getImageId(), shopAboutImage2.getImageId()) && C19383o.m32792b(this.imageUrl178x178, shopAboutImage2.imageUrl178x178) && C19383o.m32792b(this.imageUrl545xN, shopAboutImage2.imageUrl545xN) && C19383o.m32792b(this.imageUrl760xN, shopAboutImage2.imageUrl760xN) && C19383o.m32792b(this.caption, shopAboutImage2.caption) && this.rank == shopAboutImage2.rank && C19383o.m32792b(this.shopAboutImage, shopAboutImage2.shopAboutImage) && C19383o.m32792b(this.key, shopAboutImage2.key) && C19383o.m32792b(this.url, shopAboutImage2.url) && C19383o.m32792b(this.sources, shopAboutImage2.sources) && C19383o.m32792b(getFullSizedImage(), shopAboutImage2.getFullSizedImage()) && C19383o.m32792b(getUrl75x75(), shopAboutImage2.getUrl75x75()) && C19383o.m32792b(getUrl170x135(), shopAboutImage2.getUrl170x135()) && C19383o.m32792b(getUrl224xN(), shopAboutImage2.getUrl224xN()) && C19383o.m32792b(getUrl340x270(), shopAboutImage2.getUrl340x270()) && C19383o.m32792b(getUrl680x540(), shopAboutImage2.getUrl680x540()) && C19383o.m32792b(getUrl570xN(), shopAboutImage2.getUrl570xN()) && C19383o.m32792b(getUrl300x300(), shopAboutImage2.getUrl300x300()) && C19383o.m32792b(getUrlFullxFull(), shopAboutImage2.getUrlFullxFull()) && getFullHeight() == shopAboutImage2.getFullHeight() && getFullWidth() == shopAboutImage2.getFullWidth() && C19383o.m32792b(getAltText(), shopAboutImage2.getAltText());
    }

    public String get4to3ImageUrlForPixelWidth(int i) {
        return null;
    }

    public String getAltText() {
        return this.altText;
    }

    public final String getCaption() {
        return this.caption;
    }

    public int getFullHeight() {
        return this.fullHeight;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.pickBestImageSource(r3, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getFullHeightImageUrlForPixelWidth(int r3) {
        /*
            r2 = this;
            com.etsy.android.lib.models.apiv3.Image r0 = r2.shopAboutImage
            if (r0 == 0) goto L_0x000b
            r1 = 0
            java.lang.String r0 = r0.pickBestImageSource(r3, r1)
            if (r0 != 0) goto L_0x000f
        L_0x000b:
            java.lang.String r0 = r2.getImageUrlForPixelWidth(r3)
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.ShopAboutImage.getFullHeightImageUrlForPixelWidth(int):java.lang.String");
    }

    public String getFullSizedImage() {
        return this.fullSizedImage;
    }

    public int getFullWidth() {
        return this.fullWidth;
    }

    public final Image getImage() {
        Image image = this.shopAboutImage;
        if (image != null) {
            return image;
        }
        if (this.key == null || this.sources == null || this.url == null) {
            return null;
        }
        return new Image(this.key, this.url, this.sources, (Integer) null, (Integer) null, (Integer) null);
    }

    public int getImageColor() {
        return this.imageColor;
    }

    public EtsyId getImageId() {
        return this.imageId;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public final String getImageUrl178x178() {
        return this.imageUrl178x178;
    }

    public final String getImageUrl545xN() {
        return this.imageUrl545xN;
    }

    public final String getImageUrl760xN() {
        return this.imageUrl760xN;
    }

    public String getImageUrlForPixelWidth(int i) {
        Image image = this.shopAboutImage;
        if (image != null) {
            return image.pickBestImageSource(i, 0);
        }
        if (C18263b.m30837c0(this.imageUrl178x178)) {
            return C19457k.m33023a1(this.imageUrl178x178, ImageSizes.IMG_SIZE_178.getSecond(), getReplaceDimensionForWidth(i), false);
        }
        if (C18263b.m30837c0(this.imageUrl545xN)) {
            return C19457k.m33023a1(this.imageUrl545xN, ImageSizes.IMG_SIZE_545.getSecond(), getReplaceDimensionForWidth(i), false);
        }
        Image image2 = getImage();
        if (image2 != null) {
            return image2.pickBestImageSource(i, 0);
        }
        return null;
    }

    public final String getKey() {
        return this.key;
    }

    public final int getRank() {
        return this.rank;
    }

    public final Image getShopAboutImage() {
        return this.shopAboutImage;
    }

    public final List<Image.Source> getSources() {
        return this.sources;
    }

    public C8699m getTrackingData() {
        return this.trackingData;
    }

    public final String getUrl() {
        return this.url;
    }

    public String getUrl170x135() {
        return this.url170x135;
    }

    public String getUrl224xN() {
        return this.url224xN;
    }

    public String getUrl300x300() {
        return this.url300x300;
    }

    public String getUrl340x270() {
        return this.url340x270;
    }

    public String getUrl570xN() {
        return this.url570xN;
    }

    public String getUrl680x540() {
        return this.url680x540;
    }

    public String getUrl75x75() {
        return this.url75x75;
    }

    public String getUrlFullxFull() {
        return this.urlFullxFull;
    }

    public int hashCode() {
        int hashCode = getImageId().hashCode() * 31;
        String str = this.imageUrl178x178;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageUrl545xN;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageUrl760xN;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.caption;
        int a = C0069a.m170a(this.rank, (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        Image image = this.shopAboutImage;
        int hashCode5 = (a + (image == null ? 0 : image.hashCode())) * 31;
        String str5 = this.key;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.url;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<Image.Source> list = this.sources;
        int hashCode8 = (Integer.hashCode(getFullWidth()) + ((Integer.hashCode(getFullHeight()) + ((getUrlFullxFull().hashCode() + ((((((((((((((((((hashCode7 + (list == null ? 0 : list.hashCode())) * 31) + (getFullSizedImage() == null ? 0 : getFullSizedImage().hashCode())) * 31) + (getUrl75x75() == null ? 0 : getUrl75x75().hashCode())) * 31) + (getUrl170x135() == null ? 0 : getUrl170x135().hashCode())) * 31) + (getUrl224xN() == null ? 0 : getUrl224xN().hashCode())) * 31) + (getUrl340x270() == null ? 0 : getUrl340x270().hashCode())) * 31) + (getUrl680x540() == null ? 0 : getUrl680x540().hashCode())) * 31) + (getUrl570xN() == null ? 0 : getUrl570xN().hashCode())) * 31) + (getUrl300x300() == null ? 0 : getUrl300x300().hashCode())) * 31)) * 31)) * 31)) * 31;
        if (getAltText() != null) {
            i = getAltText().hashCode();
        }
        return hashCode8 + i;
    }

    public void setAltText(String str) {
        this.altText = str;
    }

    public void setFullHeight(int i) {
        this.fullHeight = i;
    }

    public void setFullWidth(int i) {
        this.fullWidth = i;
    }

    public void setImageColor(int i) {
        this.imageColor = i;
    }

    public void setImageId(EtsyId etsyId) {
        C19383o.m32797g(etsyId, "<set-?>");
        this.imageId = etsyId;
    }

    public void setTrackingData(C8699m mVar) {
        C19383o.m32797g(mVar, "<set-?>");
        this.trackingData = mVar;
    }

    public void setUrl170x135(String str) {
        this.url170x135 = str;
    }

    public void setUrl224xN(String str) {
        this.url224xN = str;
    }

    public void setUrl300x300(String str) {
        this.url300x300 = str;
    }

    public void setUrl340x270(String str) {
        this.url340x270 = str;
    }

    public void setUrl570xN(String str) {
        this.url570xN = str;
    }

    public void setUrl680x540(String str) {
        this.url680x540 = str;
    }

    public void setUrl75x75(String str) {
        this.url75x75 = str;
    }

    public void setUrlFullxFull(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.urlFullxFull = str;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ShopAboutImage(imageId=");
        h.append(getImageId());
        h.append(", imageUrl178x178=");
        h.append(this.imageUrl178x178);
        h.append(", imageUrl545xN=");
        h.append(this.imageUrl545xN);
        h.append(", imageUrl760xN=");
        h.append(this.imageUrl760xN);
        h.append(", caption=");
        h.append(this.caption);
        h.append(", rank=");
        h.append(this.rank);
        h.append(", shopAboutImage=");
        h.append(this.shopAboutImage);
        h.append(", key=");
        h.append(this.key);
        h.append(", url=");
        h.append(this.url);
        h.append(", sources=");
        h.append(this.sources);
        h.append(", fullSizedImage=");
        h.append(getFullSizedImage());
        h.append(", url75x75=");
        h.append(getUrl75x75());
        h.append(", url170x135=");
        h.append(getUrl170x135());
        h.append(", url224xN=");
        h.append(getUrl224xN());
        h.append(", url340x270=");
        h.append(getUrl340x270());
        h.append(", url680x540=");
        h.append(getUrl680x540());
        h.append(", url570xN=");
        h.append(getUrl570xN());
        h.append(", url300x300=");
        h.append(getUrl300x300());
        h.append(", urlFullxFull=");
        h.append(getUrlFullxFull());
        h.append(", fullHeight=");
        h.append(getFullHeight());
        h.append(", fullWidth=");
        h.append(getFullWidth());
        h.append(", altText=");
        h.append(getAltText());
        h.append(')');
        return h.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ShopAboutImage(com.etsy.android.lib.models.datatypes.EtsyId r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, int r33, com.etsy.android.lib.models.apiv3.Image r34, java.lang.String r35, java.lang.String r36, java.util.List r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, int r47, int r48, java.lang.String r49, int r50, kotlin.jvm.internal.DefaultConstructorMarker r51) {
        /*
            r27 = this;
            r0 = r50
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x000f
            com.etsy.android.lib.models.datatypes.EtsyId r1 = new com.etsy.android.lib.models.datatypes.EtsyId
            r3 = 1
            r1.<init>(r2, r3, r2)
            r5 = r1
            goto L_0x0011
        L_0x000f:
            r5 = r28
        L_0x0011:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0017
            r6 = r2
            goto L_0x0019
        L_0x0017:
            r6 = r29
        L_0x0019:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x001f
            r7 = r2
            goto L_0x0021
        L_0x001f:
            r7 = r30
        L_0x0021:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0027
            r8 = r2
            goto L_0x0029
        L_0x0027:
            r8 = r31
        L_0x0029:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x002f
            r9 = r2
            goto L_0x0031
        L_0x002f:
            r9 = r32
        L_0x0031:
            r1 = r0 & 32
            r3 = 0
            if (r1 == 0) goto L_0x0038
            r10 = r3
            goto L_0x003a
        L_0x0038:
            r10 = r33
        L_0x003a:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0040
            r12 = r2
            goto L_0x0042
        L_0x0040:
            r12 = r35
        L_0x0042:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0048
            r13 = r2
            goto L_0x004a
        L_0x0048:
            r13 = r36
        L_0x004a:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0050
            r14 = r2
            goto L_0x0052
        L_0x0050:
            r14 = r37
        L_0x0052:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0058
            r15 = r2
            goto L_0x005a
        L_0x0058:
            r15 = r38
        L_0x005a:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0061
            r16 = r2
            goto L_0x0063
        L_0x0061:
            r16 = r39
        L_0x0063:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x006a
            r17 = r2
            goto L_0x006c
        L_0x006a:
            r17 = r40
        L_0x006c:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0073
            r18 = r2
            goto L_0x0075
        L_0x0073:
            r18 = r41
        L_0x0075:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x007c
            r19 = r2
            goto L_0x007e
        L_0x007c:
            r19 = r42
        L_0x007e:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0087
            r20 = r2
            goto L_0x0089
        L_0x0087:
            r20 = r43
        L_0x0089:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0091
            r21 = r2
            goto L_0x0093
        L_0x0091:
            r21 = r44
        L_0x0093:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x009b
            r22 = r2
            goto L_0x009d
        L_0x009b:
            r22 = r45
        L_0x009d:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00a7
            java.lang.String r1 = ""
            r23 = r1
            goto L_0x00a9
        L_0x00a7:
            r23 = r46
        L_0x00a9:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00b1
            r24 = r3
            goto L_0x00b3
        L_0x00b1:
            r24 = r47
        L_0x00b3:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00bb
            r25 = r3
            goto L_0x00bd
        L_0x00bb:
            r25 = r48
        L_0x00bd:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00c5
            r26 = r2
            goto L_0x00c7
        L_0x00c5:
            r26 = r49
        L_0x00c7:
            r4 = r27
            r11 = r34
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.ShopAboutImage.<init>(com.etsy.android.lib.models.datatypes.EtsyId, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, com.etsy.android.lib.models.apiv3.Image, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
