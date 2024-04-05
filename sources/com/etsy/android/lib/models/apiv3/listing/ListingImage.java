package com.etsy.android.lib.models.apiv3.listing;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.compose.foundation.layout.C0761x;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.BaseModelImageCompat;
import com.etsy.android.lib.models.IFullImage;
import com.etsy.android.lib.models.ISupportsListingVideo;
import com.etsy.android.lib.models.ImageSizes;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.google.android.play.core.assetpacks.C15588c1;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import com.squareup.moshi.C17414y;
import java.io.Serializable;
import java.util.Objects;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19457k;
import p504ai.C13983i;
import p628nj.C18263b;

@C17403o(generateAdapter = true)
public final class ListingImage implements IFullImage, BaseModelImageCompat, ISupportsListingVideo, Parcelable, Serializable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ListingImage> CREATOR = new Creator();
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int DEFAULT_LOADING_COLOR = -1842209;
    /* access modifiers changed from: private */
    public static final Pair<Integer, String>[] IMG_SIZES_ARRAY = {ImageSizes.IMG_SIZE_75, ImageSizes.IMG_SIZE_170, ImageSizes.IMG_SIZE_224, ImageSizes.IMG_SIZE_300, ImageSizes.IMG_SIZE_340, ImageSizes.IMG_SIZE_570, ImageSizes.IMG_SIZE_680};
    private static final long serialVersionUID = -6151322843636900736L;
    private String altText;
    private int blue;
    private String color;
    private String extension;
    private String extraData;
    private int fullHeight;
    private int fullWidth;
    private int green;
    private final Integer height;
    private Integer hue;
    private int imageColor;
    private EtsyId imageId;
    private boolean isVideo;
    private Long listingId;
    private Integer ownerId;
    private int postCalculatedColor;
    private int rank;
    private int red;
    private Integer saturation;
    private final String url;
    private final String url1140xN;
    private String url170x135;
    private String url224xN;
    private String url300x300;
    private String url340x270;
    private String url570xN;
    private final String url600x600;
    private final String url642xN;
    private String url680x540;
    private String url75x75;
    private String v3UrlFullxFull;
    private final Integer version;
    private String videoThumbnailUrl;
    private String videoUrl;
    private Integer volume;
    private final Integer width;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ListingImage createCompat(String str, int i) {
            return new ListingImage((String) null, 0, 0, 0, (String) null, (String) null, 0, (Integer) null, (EtsyId) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, 0, 0, (Integer) null, (Integer) null, (Long) null, (String) null, i, (String) null, (String) null, false, 2147352575, 7, (DefaultConstructorMarker) null);
        }

        public final ListingImage fake() {
            C17414y yVar = C18263b.f40059X;
            if (yVar != null) {
                return yVar.mo68556a(ListingImage.class).fromJson("{\n                      \"image_id\": 1450154361,\n                      \"owner_id\": 13846987,\n                      \"url\": \"https:\\/\\/i.etsystatic.com\\/13846987\\/r\\/il\\/43de1d\\/1450154361\\/il_fullxfull.1450154361_179j.jpg\",\n                      \"url_75x75\": \"https:\\/\\/i.etsystatic.com\\/13846987\\/d\\/il\\/43de1d\\/1450154361\\/il_75x75.1450154361_179j.jpg?version=0\",\n                      \"url_170x135\": \"https:\\/\\/i.etsystatic.com\\/13846987\\/d\\/il\\/43de1d\\/1450154361\\/il_170x135.1450154361_179j.jpg?version=0\",\n                      \"url_224xN\": \"https:\\/\\/i.etsystatic.com\\/13846987\\/r\\/il\\/43de1d\\/1450154361\\/il_224xN.1450154361_179j.jpg\",\n                      \"url_300x300\": \"https:\\/\\/i.etsystatic.com\\/13846987\\/r\\/il\\/43de1d\\/1450154361\\/il_300x300.1450154361_179j.jpg\",\n                      \"url_340x270\": \"https:\\/\\/i.etsystatic.com\\/13846987\\/d\\/il\\/43de1d\\/1450154361\\/il_340x270.1450154361_179j.jpg?version=0\",\n                      \"url_680x540\": \"https:\\/\\/i.etsystatic.com\\/13846987\\/d\\/il\\/43de1d\\/1450154361\\/il_680x540.1450154361_179j.jpg?version=0\",\n                      \"url_570xN\": \"https:\\/\\/i.etsystatic.com\\/13846987\\/r\\/il\\/43de1d\\/1450154361\\/il_570xN.1450154361_179j.jpg\",\n                      \"url_642xN\": \"https:\\/\\/i.etsystatic.com\\/13846987\\/r\\/il\\/43de1d\\/1450154361\\/il_642xN.1450154361_179j.jpg\",\n                      \"url_794xN\": \"https:\\/\\/i.etsystatic.com\\/13846987\\/r\\/il\\/43de1d\\/1450154361\\/il_794xN.1450154361_179j.jpg\",\n                      \"url_1588xN\": \"https:\\/\\/i.etsystatic.com\\/13846987\\/r\\/il\\/43de1d\\/1450154361\\/il_1588xN.1450154361_179j.jpg\",\n                      \"url_600x600\": \"https:\\/\\/i.etsystatic.com\\/13846987\\/r\\/il\\/43de1d\\/1450154361\\/il_600x600.1450154361_179j.jpg\",\n                      \"url_1140xN\": \"https:\\/\\/i.etsystatic.com\\/13846987\\/r\\/il\\/43de1d\\/1450154361\\/il_1140xN.1450154361_179j.jpg\",\n                      \"url_1000x1000\": \"https:\\/\\/i.etsystatic.com\\/13846987\\/r\\/il\\/43de1d\\/1450154361\\/il_1000x1000.1450154361_179j.jpg\",\n                      \"url_500x500\": \"https:\\/\\/i.etsystatic.com\\/13846987\\/r\\/il\\/43de1d\\/1450154361\\/il_500x500.1450154361_179j.jpg\",\n                      \"color\": \"938172\",\n                      \"blur_hash\": null,\n                      \"hue\": 27,\n                      \"saturation\": 22,\n                      \"height\": 2250,\n                      \"width\": 3000,\n                      \"volume\": 201,\n                      \"version\": 0,\n                      \"extra_data\": \"179j\",\n                      \"extension\": \"\",\n                      \"alt_text\": \"Text alternative\"\n                }");
            }
            C19383o.m32805o("moshi");
            throw null;
        }

        public final Pair<Integer, String>[] getIMG_SIZES_ARRAY() {
            return ListingImage.IMG_SIZES_ARRAY;
        }
    }

    public static final class Creator implements Parcelable.Creator<ListingImage> {
        public final ListingImage createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt4 = parcel.readInt();
            Long l = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            EtsyId etsyId = (EtsyId) parcel.readSerializable();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            String readString15 = parcel.readString();
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int readInt5 = parcel.readInt();
            int readInt6 = parcel.readInt();
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                l = Long.valueOf(parcel.readLong());
            }
            return new ListingImage(readString, readInt, readInt2, readInt3, readString2, readString3, readInt4, valueOf, etsyId, valueOf2, valueOf3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readString13, readString14, readString15, valueOf4, valueOf5, readInt5, readInt6, valueOf6, valueOf7, l, parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        public final ListingImage[] newArray(int i) {
            return new ListingImage[i];
        }
    }

    public ListingImage() {
        this((String) null, 0, 0, 0, (String) null, (String) null, 0, (Integer) null, (EtsyId) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, 0, 0, (Integer) null, (Integer) null, (Long) null, (String) null, 0, (String) null, (String) null, false, -1, 7, (DefaultConstructorMarker) null);
    }

    public ListingImage(@C17402n(name = "color") String str, @C17402n(name = "red") int i, @C17402n(name = "green") int i2, @C17402n(name = "blue") int i3, @C17402n(name = "extension") String str2, @C17402n(name = "extra_data") String str3, @C17402n(name = "rank") int i4, @C17402n(name = "hue") Integer num, @C17402n(name = "image_id") EtsyId etsyId, @C17402n(name = "owner_id") Integer num2, @C17402n(name = "saturation") Integer num3, @C17402n(name = "url") String str4, @C17402n(name = "url_1140xN") String str5, @C17402n(name = "url_170x135") String str6, @C17402n(name = "url_224xN") String str7, @C17402n(name = "url_300x300") String str8, @C17402n(name = "url_340x270") String str9, @C17402n(name = "url_570xN") String str10, @C17402n(name = "url_600x600") String str11, @C17402n(name = "url_642xN") String str12, @C17402n(name = "url_680x540") String str13, @C17402n(name = "url_75x75") String str14, @C17402n(name = "url_fullxfull") String str15, @C17402n(name = "version") Integer num4, @C17402n(name = "volume") Integer num5, @C17402n(name = "full_width") int i5, @C17402n(name = "full_height") int i6, @C17402n(name = "width") Integer num6, @C17402n(name = "height") Integer num7, @C17402n(name = "listing_id") Long l, @C17402n(name = "alt_text") String str16, @C17402n(ignore = true) int i7, @C17402n(ignore = true) String str17, @C17402n(ignore = true) String str18, @C17402n(ignore = true) boolean z) {
        C19383o.m32797g(etsyId, "imageId");
        this.color = str;
        this.red = i;
        this.green = i2;
        this.blue = i3;
        this.extension = str2;
        this.extraData = str3;
        this.rank = i4;
        this.hue = num;
        this.imageId = etsyId;
        this.ownerId = num2;
        this.saturation = num3;
        this.url = str4;
        this.url1140xN = str5;
        this.url170x135 = str6;
        this.url224xN = str7;
        this.url300x300 = str8;
        this.url340x270 = str9;
        this.url570xN = str10;
        this.url600x600 = str11;
        this.url642xN = str12;
        this.url680x540 = str13;
        this.url75x75 = str14;
        this.v3UrlFullxFull = str15;
        this.version = num4;
        this.volume = num5;
        this.fullWidth = i5;
        this.fullHeight = i6;
        this.width = num6;
        this.height = num7;
        this.listingId = l;
        this.altText = str16;
        this.postCalculatedColor = i7;
        this.videoUrl = str17;
        this.videoThumbnailUrl = str18;
        this.isVideo = z;
    }

    public static /* synthetic */ ListingImage copy$default(ListingImage listingImage, String str, int i, int i2, int i3, String str2, String str3, int i4, Integer num, EtsyId etsyId, Integer num2, Integer num3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Integer num4, Integer num5, int i5, int i6, Integer num6, Integer num7, Long l, String str16, int i7, String str17, String str18, boolean z, int i8, int i9, Object obj) {
        ListingImage listingImage2 = listingImage;
        int i10 = i8;
        String str19 = (i10 & 1) != 0 ? listingImage2.color : str;
        int i11 = (i10 & 2) != 0 ? listingImage2.red : i;
        int i12 = (i10 & 4) != 0 ? listingImage2.green : i2;
        int i13 = (i10 & 8) != 0 ? listingImage2.blue : i3;
        String str20 = (i10 & 16) != 0 ? listingImage2.extension : str2;
        String str21 = (i10 & 32) != 0 ? listingImage2.extraData : str3;
        int i14 = (i10 & 64) != 0 ? listingImage2.rank : i4;
        Integer num8 = (i10 & 128) != 0 ? listingImage2.hue : num;
        EtsyId imageId2 = (i10 & 256) != 0 ? listingImage.getImageId() : etsyId;
        Integer num9 = (i10 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? listingImage2.ownerId : num2;
        Integer num10 = (i10 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? listingImage2.saturation : num3;
        String str22 = (i10 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? listingImage2.url : str4;
        String str23 = (i10 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? listingImage2.url1140xN : str5;
        String url170x1352 = (i10 & 8192) != 0 ? listingImage.getUrl170x135() : str6;
        String url224xN2 = (i10 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? listingImage.getUrl224xN() : str7;
        String url300x3002 = (i10 & 32768) != 0 ? listingImage.getUrl300x300() : str8;
        String url340x2702 = (i10 & 65536) != 0 ? listingImage.getUrl340x270() : str9;
        String url570xN2 = (i10 & 131072) != 0 ? listingImage.getUrl570xN() : str10;
        String str24 = url224xN2;
        String str25 = (i10 & PrimitiveArrayBuilder.MAX_CHUNK_SIZE) != 0 ? listingImage2.url600x600 : str11;
        String str26 = (i10 & 524288) != 0 ? listingImage2.url642xN : str12;
        return listingImage.copy(str19, i11, i12, i13, str20, str21, i14, num8, imageId2, num9, num10, str22, str23, url170x1352, str24, url300x3002, url340x2702, url570xN2, str25, str26, (i10 & 1048576) != 0 ? listingImage.getUrl680x540() : str13, (i10 & 2097152) != 0 ? listingImage.getUrl75x75() : str14, (i10 & 4194304) != 0 ? listingImage2.v3UrlFullxFull : str15, (i10 & 8388608) != 0 ? listingImage2.version : num4, (i10 & 16777216) != 0 ? listingImage2.volume : num5, (i10 & 33554432) != 0 ? listingImage.getFullWidth() : i5, (i10 & 67108864) != 0 ? listingImage.getFullHeight() : i6, (i10 & 134217728) != 0 ? listingImage2.width : num6, (i10 & 268435456) != 0 ? listingImage2.height : num7, (i10 & 536870912) != 0 ? listingImage2.listingId : l, (i10 & 1073741824) != 0 ? listingImage.getAltText() : str16, (i10 & Integer.MIN_VALUE) != 0 ? listingImage2.postCalculatedColor : i7, (i9 & 1) != 0 ? listingImage.getVideoUrl() : str17, (i9 & 2) != 0 ? listingImage.getVideoThumbnailUrl() : str18, (i9 & 4) != 0 ? listingImage.isVideo() : z);
    }

    public static final ListingImage createCompat(String str, int i) {
        return Companion.createCompat(str, i);
    }

    @C17402n(ignore = true)
    public static /* synthetic */ void getFullSizedImage$annotations() {
    }

    @C17402n(ignore = true)
    public static /* synthetic */ void getHexColor$annotations() {
    }

    @C17402n(ignore = true)
    public static /* synthetic */ void getImageColor$annotations() {
    }

    @C17402n(ignore = true)
    public static /* synthetic */ void getImageUrl$annotations() {
    }

    private final String getLargestDimension() {
        return ImageSizes.IMG_SIZE_FULL.getSecond();
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
        return str == null ? "fullxfull" : str;
    }

    @C17402n(ignore = true)
    public static /* synthetic */ void getUrlFullxFull$annotations() {
    }

    public final String component1() {
        return this.color;
    }

    public final Integer component10() {
        return this.ownerId;
    }

    public final Integer component11() {
        return this.saturation;
    }

    public final String component12() {
        return this.url;
    }

    public final String component13() {
        return this.url1140xN;
    }

    public final String component14() {
        return getUrl170x135();
    }

    public final String component15() {
        return getUrl224xN();
    }

    public final String component16() {
        return getUrl300x300();
    }

    public final String component17() {
        return getUrl340x270();
    }

    public final String component18() {
        return getUrl570xN();
    }

    public final String component19() {
        return this.url600x600;
    }

    public final int component2() {
        return this.red;
    }

    public final String component20() {
        return this.url642xN;
    }

    public final String component21() {
        return getUrl680x540();
    }

    public final String component22() {
        return getUrl75x75();
    }

    public final String component23() {
        return this.v3UrlFullxFull;
    }

    public final Integer component24() {
        return this.version;
    }

    public final Integer component25() {
        return this.volume;
    }

    public final int component26() {
        return getFullWidth();
    }

    public final int component27() {
        return getFullHeight();
    }

    public final Integer component28() {
        return this.width;
    }

    public final Integer component29() {
        return this.height;
    }

    public final int component3() {
        return this.green;
    }

    public final Long component30() {
        return this.listingId;
    }

    public final String component31() {
        return getAltText();
    }

    public final int component32() {
        return this.postCalculatedColor;
    }

    public final String component33() {
        return getVideoUrl();
    }

    public final String component34() {
        return getVideoThumbnailUrl();
    }

    public final boolean component35() {
        return isVideo();
    }

    public final int component4() {
        return this.blue;
    }

    public final String component5() {
        return this.extension;
    }

    public final String component6() {
        return this.extraData;
    }

    public final int component7() {
        return this.rank;
    }

    public final Integer component8() {
        return this.hue;
    }

    public final EtsyId component9() {
        return getImageId();
    }

    public final ListingImage copy(@C17402n(name = "color") String str, @C17402n(name = "red") int i, @C17402n(name = "green") int i2, @C17402n(name = "blue") int i3, @C17402n(name = "extension") String str2, @C17402n(name = "extra_data") String str3, @C17402n(name = "rank") int i4, @C17402n(name = "hue") Integer num, @C17402n(name = "image_id") EtsyId etsyId, @C17402n(name = "owner_id") Integer num2, @C17402n(name = "saturation") Integer num3, @C17402n(name = "url") String str4, @C17402n(name = "url_1140xN") String str5, @C17402n(name = "url_170x135") String str6, @C17402n(name = "url_224xN") String str7, @C17402n(name = "url_300x300") String str8, @C17402n(name = "url_340x270") String str9, @C17402n(name = "url_570xN") String str10, @C17402n(name = "url_600x600") String str11, @C17402n(name = "url_642xN") String str12, @C17402n(name = "url_680x540") String str13, @C17402n(name = "url_75x75") String str14, @C17402n(name = "url_fullxfull") String str15, @C17402n(name = "version") Integer num4, @C17402n(name = "volume") Integer num5, @C17402n(name = "full_width") int i5, @C17402n(name = "full_height") int i6, @C17402n(name = "width") Integer num6, @C17402n(name = "height") Integer num7, @C17402n(name = "listing_id") Long l, @C17402n(name = "alt_text") String str16, @C17402n(ignore = true) int i7, @C17402n(ignore = true) String str17, @C17402n(ignore = true) String str18, @C17402n(ignore = true) boolean z) {
        String str19 = str;
        C19383o.m32797g(etsyId, "imageId");
        return new ListingImage(str, i, i2, i3, str2, str3, i4, num, etsyId, num2, num3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, num4, num5, i5, i6, num6, num7, l, str16, i7, str17, str18, z);
    }

    public final ListingImage copyCompat() {
        return copy$default(this, (String) null, 0, 0, 0, (String) null, (String) null, 0, (Integer) null, (EtsyId) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, 0, 0, (Integer) null, (Integer) null, (Long) null, (String) null, 0, (String) null, (String) null, false, -1, 7, (Object) null);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingImage)) {
            return false;
        }
        return C19383o.m32792b(getImageId(), ((ListingImage) obj).getImageId());
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0097 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String get4to3ImageUrlForPixelWidth(int r4) {
        /*
            r3 = this;
            boolean r0 = r3.isVideo()
            if (r0 == 0) goto L_0x000e
            java.lang.String r4 = r3.getVideoThumbnailUrl()
            kotlin.jvm.internal.C19383o.m32794d(r4)
            return r4
        L_0x000e:
            java.lang.String r0 = "IMG_SIZE_170.first"
            if (r4 <= 0) goto L_0x003b
            kotlin.Pair<java.lang.Integer, java.lang.String> r1 = com.etsy.android.lib.models.BaseModelImage.IMG_SIZE_170
            java.lang.Object r2 = r1.getFirst()
            kotlin.jvm.internal.C19383o.m32796f(r2, r0)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r4 > r2) goto L_0x003b
            java.lang.String r4 = r3.getUrl170x135()
            boolean r4 = p628nj.C18263b.m30837c0(r4)
            if (r4 == 0) goto L_0x0035
            java.lang.String r4 = r3.getUrl170x135()
            kotlin.jvm.internal.C19383o.m32794d(r4)
            return r4
        L_0x0035:
            java.lang.String r4 = "IMG_SIZE_170"
            kotlin.jvm.internal.C19383o.m32796f(r1, r4)
            goto L_0x008b
        L_0x003b:
            kotlin.Pair<java.lang.Integer, java.lang.String> r1 = com.etsy.android.lib.models.BaseModelImage.IMG_SIZE_170
            java.lang.Object r1 = r1.getFirst()
            kotlin.jvm.internal.C19383o.m32796f(r1, r0)
            java.lang.Number r1 = (java.lang.Number) r1
            int r0 = r1.intValue()
            if (r4 <= r0) goto L_0x0077
            kotlin.Pair<java.lang.Integer, java.lang.String> r1 = com.etsy.android.lib.models.BaseModelImage.IMG_SIZE_340
            java.lang.Object r0 = r1.getFirst()
            java.lang.String r2 = "IMG_SIZE_340.first"
            kotlin.jvm.internal.C19383o.m32796f(r0, r2)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r4 > r0) goto L_0x0077
            java.lang.String r4 = r3.getUrl340x270()
            boolean r4 = p628nj.C18263b.m30837c0(r4)
            if (r4 == 0) goto L_0x0071
            java.lang.String r4 = r3.getUrl340x270()
            kotlin.jvm.internal.C19383o.m32794d(r4)
            return r4
        L_0x0071:
            java.lang.String r4 = "IMG_SIZE_340"
            kotlin.jvm.internal.C19383o.m32796f(r1, r4)
            goto L_0x008b
        L_0x0077:
            java.lang.String r4 = r3.getUrl680x540()
            boolean r4 = p628nj.C18263b.m30837c0(r4)
            if (r4 == 0) goto L_0x0089
            java.lang.String r4 = r3.getUrl680x540()
            kotlin.jvm.internal.C19383o.m32794d(r4)
            return r4
        L_0x0089:
            kotlin.Pair<java.lang.Integer, java.lang.String> r1 = com.etsy.android.lib.models.ImageSizes.IMG_SIZE_680
        L_0x008b:
            java.lang.Object r4 = r1.getSecond()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r3.replaceImageUrlWithSize(r4)
            if (r4 != 0) goto L_0x0099
            java.lang.String r4 = ""
        L_0x0099:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.ListingImage.get4to3ImageUrlForPixelWidth(int):java.lang.String");
    }

    public String getAltText() {
        return this.altText;
    }

    public final int getBlue() {
        return this.blue;
    }

    public final String getColor() {
        return this.color;
    }

    public final String getExtension() {
        return this.extension;
    }

    public final String getExtraData() {
        return this.extraData;
    }

    public int getFullHeight() {
        return this.fullHeight;
    }

    public String getFullHeightImageUrlForPixelWidth(int i) {
        if (!isVideo()) {
            return C0761x.m1711b1(this, i);
        }
        String videoThumbnailUrl2 = getVideoThumbnailUrl();
        C19383o.m32794d(videoThumbnailUrl2);
        return videoThumbnailUrl2;
    }

    public String getFullSizedImage() {
        return replaceImageUrlWithSize(ImageSizes.IMG_SIZE_FULL.getSecond());
    }

    public int getFullWidth() {
        return this.fullWidth;
    }

    public final int getGreen() {
        return this.green;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final int getHexColor() {
        int i;
        if (!C18263b.m30837c0(this.color)) {
            return -16777216;
        }
        String str = this.color;
        if (str == null || str.length() == 0) {
            return -1;
        }
        if (str.charAt(0) == '#') {
            i = Color.parseColor(str);
        } else {
            try {
                i = Color.parseColor('#' + str);
            } catch (IllegalArgumentException unused) {
                i = -1;
            }
        }
        if (i == -1) {
            return i;
        }
        return Color.rgb((int) ((((float) Color.red(i)) * 0.33f) + 170.84999f), (int) ((((float) Color.green(i)) * 0.33f) + 170.84999f), (int) ((((float) Color.blue(i)) * 0.33f) + 170.84999f));
    }

    public final Integer getHue() {
        return this.hue;
    }

    public int getImageColor() {
        int i = this.postCalculatedColor;
        if (i > 0) {
            return i;
        }
        if (getHexColor() != -16777216) {
            return getHexColor();
        }
        if (hasImageColor()) {
            return Color.rgb((int) ((((float) this.red) * 0.33f) + 170.84999f), (int) ((((float) this.green) * 0.33f) + 170.84999f), (int) ((((float) this.blue) * 0.33f) + 170.84999f));
        } else if (C15588c1.m25273C0(this.hue) <= 0 || C15588c1.m25273C0(this.saturation) <= 0) {
            return -1842209;
        } else {
            return Color.HSVToColor(16, new float[]{(float) C15588c1.m25273C0(this.hue), (float) C15588c1.m25273C0(this.saturation), 0.5f});
        }
    }

    public EtsyId getImageId() {
        return this.imageId;
    }

    public String getImageUrl() {
        if (isVideo()) {
            String videoThumbnailUrl2 = getVideoThumbnailUrl();
            C19383o.m32794d(videoThumbnailUrl2);
            return videoThumbnailUrl2;
        }
        String url570xN2 = getUrl570xN();
        return url570xN2 == null ? "" : url570xN2;
    }

    public String getImageUrlForPixelWidth(int i) {
        return isVideo() ? getVideoThumbnailUrl() : replaceImageUrlWithSize(getReplaceDimensionForWidth(i));
    }

    public final Long getListingId() {
        return this.listingId;
    }

    public final Integer getOwnerId() {
        return this.ownerId;
    }

    public final int getPostCalculatedColor() {
        return this.postCalculatedColor;
    }

    public final int getRank() {
        return this.rank;
    }

    public final int getRed() {
        return this.red;
    }

    public final Integer getSaturation() {
        return this.saturation;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getUrl1140xN() {
        return this.url1140xN;
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

    public final String getUrl600x600() {
        return this.url600x600;
    }

    public final String getUrl642xN() {
        return this.url642xN;
    }

    public String getUrl680x540() {
        return this.url680x540;
    }

    public String getUrl75x75() {
        return this.url75x75;
    }

    public String getUrlFullxFull() {
        if (C18263b.m30837c0(this.v3UrlFullxFull)) {
            String str = this.v3UrlFullxFull;
            C19383o.m32794d(str);
            return str;
        }
        String str2 = this.url;
        return str2 == null ? "" : str2;
    }

    public final String getV3UrlFullxFull() {
        return this.v3UrlFullxFull;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public String getVideoThumbnailUrl() {
        return this.videoThumbnailUrl;
    }

    public String getVideoUrl() {
        return this.videoUrl;
    }

    public final Integer getVolume() {
        return this.volume;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public final boolean hasImageColor() {
        return (this.red > 0 && this.green > 0 && this.blue > 0) || this.postCalculatedColor != 0;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{getImageId()});
    }

    public boolean isVideo() {
        return this.isVideo;
    }

    public final String replaceImageUrlWithSize(String str) {
        C19383o.m32797g(str, ResponseConstants.SIZE);
        if (C18263b.m30837c0(getUrl75x75())) {
            String url75x752 = getUrl75x75();
            C19383o.m32794d(url75x752);
            return C19457k.m33023a1(url75x752, ImageSizes.IMG_SIZE_75.getSecond(), str, false);
        } else if (C18263b.m30837c0(getUrl170x135())) {
            String url170x1352 = getUrl170x135();
            C19383o.m32794d(url170x1352);
            return C19457k.m33023a1(url170x1352, ImageSizes.IMG_SIZE_170.getSecond(), str, false);
        } else if (C18263b.m30837c0(getUrl570xN())) {
            String url570xN2 = getUrl570xN();
            C19383o.m32794d(url570xN2);
            return C19457k.m33023a1(url570xN2, ImageSizes.IMG_SIZE_570.getSecond(), str, false);
        } else if (C18263b.m30837c0(getUrlFullxFull())) {
            return C19457k.m33023a1(getUrlFullxFull(), ImageSizes.IMG_SIZE_FULL.getSecond(), str, false);
        } else {
            return null;
        }
    }

    public void setAltText(String str) {
        this.altText = str;
    }

    public final void setBlue(int i) {
        this.blue = i;
    }

    public final void setColor(String str) {
        this.color = str;
    }

    public final void setExtension(String str) {
        this.extension = str;
    }

    public final void setExtraData(String str) {
        this.extraData = str;
    }

    public void setFullHeight(int i) {
        this.fullHeight = i;
    }

    public void setFullWidth(int i) {
        this.fullWidth = i;
    }

    public final void setGreen(int i) {
        this.green = i;
    }

    public final void setHue(Integer num) {
        this.hue = num;
    }

    public void setImageColor(int i) {
        this.imageColor = i;
    }

    public void setImageId(EtsyId etsyId) {
        C19383o.m32797g(etsyId, "<set-?>");
        this.imageId = etsyId;
    }

    public final void setListingId(Long l) {
        this.listingId = l;
    }

    public final void setOwnerId(Integer num) {
        this.ownerId = num;
    }

    public final void setPostCalculatedColor(int i) {
        this.postCalculatedColor = i;
    }

    public final void setRank(int i) {
        this.rank = i;
    }

    public final void setRed(int i) {
        this.red = i;
    }

    public final void setSaturation(Integer num) {
        this.saturation = num;
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
        C19383o.m32797g(str, "value");
        this.v3UrlFullxFull = str;
    }

    public final void setV3UrlFullxFull(String str) {
        this.v3UrlFullxFull = str;
    }

    public void setVideo(boolean z) {
        this.isVideo = z;
    }

    public void setVideoThumbnailUrl(String str) {
        this.videoThumbnailUrl = str;
    }

    public void setVideoUrl(String str) {
        this.videoUrl = str;
    }

    public final void setVolume(Integer num) {
        this.volume = num;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ListingImage(color=");
        h.append(this.color);
        h.append(", red=");
        h.append(this.red);
        h.append(", green=");
        h.append(this.green);
        h.append(", blue=");
        h.append(this.blue);
        h.append(", extension=");
        h.append(this.extension);
        h.append(", extraData=");
        h.append(this.extraData);
        h.append(", rank=");
        h.append(this.rank);
        h.append(", hue=");
        h.append(this.hue);
        h.append(", imageId=");
        h.append(getImageId());
        h.append(", ownerId=");
        h.append(this.ownerId);
        h.append(", saturation=");
        h.append(this.saturation);
        h.append(", url=");
        h.append(this.url);
        h.append(", url1140xN=");
        h.append(this.url1140xN);
        h.append(", url170x135=");
        h.append(getUrl170x135());
        h.append(", url224xN=");
        h.append(getUrl224xN());
        h.append(", url300x300=");
        h.append(getUrl300x300());
        h.append(", url340x270=");
        h.append(getUrl340x270());
        h.append(", url570xN=");
        h.append(getUrl570xN());
        h.append(", url600x600=");
        h.append(this.url600x600);
        h.append(", url642xN=");
        h.append(this.url642xN);
        h.append(", url680x540=");
        h.append(getUrl680x540());
        h.append(", url75x75=");
        h.append(getUrl75x75());
        h.append(", v3UrlFullxFull=");
        h.append(this.v3UrlFullxFull);
        h.append(", version=");
        h.append(this.version);
        h.append(", volume=");
        h.append(this.volume);
        h.append(", fullWidth=");
        h.append(getFullWidth());
        h.append(", fullHeight=");
        h.append(getFullHeight());
        h.append(", width=");
        h.append(this.width);
        h.append(", height=");
        h.append(this.height);
        h.append(", listingId=");
        h.append(this.listingId);
        h.append(", altText=");
        h.append(getAltText());
        h.append(", postCalculatedColor=");
        h.append(this.postCalculatedColor);
        h.append(", videoUrl=");
        h.append(getVideoUrl());
        h.append(", videoThumbnailUrl=");
        h.append(getVideoThumbnailUrl());
        h.append(", isVideo=");
        h.append(isVideo());
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.color);
        parcel.writeInt(this.red);
        parcel.writeInt(this.green);
        parcel.writeInt(this.blue);
        parcel.writeString(this.extension);
        parcel.writeString(this.extraData);
        parcel.writeInt(this.rank);
        Integer num = this.hue;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            C13983i.m21499r(parcel, 1, num);
        }
        parcel.writeSerializable(this.imageId);
        Integer num2 = this.ownerId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            C13983i.m21499r(parcel, 1, num2);
        }
        Integer num3 = this.saturation;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            C13983i.m21499r(parcel, 1, num3);
        }
        parcel.writeString(this.url);
        parcel.writeString(this.url1140xN);
        parcel.writeString(this.url170x135);
        parcel.writeString(this.url224xN);
        parcel.writeString(this.url300x300);
        parcel.writeString(this.url340x270);
        parcel.writeString(this.url570xN);
        parcel.writeString(this.url600x600);
        parcel.writeString(this.url642xN);
        parcel.writeString(this.url680x540);
        parcel.writeString(this.url75x75);
        parcel.writeString(this.v3UrlFullxFull);
        Integer num4 = this.version;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            C13983i.m21499r(parcel, 1, num4);
        }
        Integer num5 = this.volume;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            C13983i.m21499r(parcel, 1, num5);
        }
        parcel.writeInt(this.fullWidth);
        parcel.writeInt(this.fullHeight);
        Integer num6 = this.width;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            C13983i.m21499r(parcel, 1, num6);
        }
        Integer num7 = this.height;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            C13983i.m21499r(parcel, 1, num7);
        }
        Long l = this.listingId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            C0069a.m180k(parcel, 1, l);
        }
        parcel.writeString(this.altText);
        parcel.writeInt(this.postCalculatedColor);
        parcel.writeString(this.videoUrl);
        parcel.writeString(this.videoThumbnailUrl);
        parcel.writeInt(this.isVideo ? 1 : 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ListingImage(java.lang.String r37, int r38, int r39, int r40, java.lang.String r41, java.lang.String r42, int r43, java.lang.Integer r44, com.etsy.android.lib.models.datatypes.EtsyId r45, java.lang.Integer r46, java.lang.Integer r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.Integer r60, java.lang.Integer r61, int r62, int r63, java.lang.Integer r64, java.lang.Integer r65, java.lang.Long r66, java.lang.String r67, int r68, java.lang.String r69, java.lang.String r70, boolean r71, int r72, int r73, kotlin.jvm.internal.DefaultConstructorMarker r74) {
        /*
            r36 = this;
            r0 = r72
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000b
        L_0x0009:
            r1 = r37
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = 0
            goto L_0x0013
        L_0x0011:
            r3 = r38
        L_0x0013:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x0019
            r5 = 0
            goto L_0x001b
        L_0x0019:
            r5 = r39
        L_0x001b:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0021
            r6 = 0
            goto L_0x0023
        L_0x0021:
            r6 = r40
        L_0x0023:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x0029
            r7 = r2
            goto L_0x002b
        L_0x0029:
            r7 = r41
        L_0x002b:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0031
            r8 = r2
            goto L_0x0033
        L_0x0031:
            r8 = r42
        L_0x0033:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x0039
            r9 = 0
            goto L_0x003b
        L_0x0039:
            r9 = r43
        L_0x003b:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0041
            r10 = r2
            goto L_0x0043
        L_0x0041:
            r10 = r44
        L_0x0043:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004e
            com.etsy.android.lib.models.datatypes.EtsyId r11 = new com.etsy.android.lib.models.datatypes.EtsyId
            r12 = 1
            r11.<init>(r2, r12, r2)
            goto L_0x0050
        L_0x004e:
            r11 = r45
        L_0x0050:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0056
            r12 = r2
            goto L_0x0058
        L_0x0056:
            r12 = r46
        L_0x0058:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x005e
            r13 = r2
            goto L_0x0060
        L_0x005e:
            r13 = r47
        L_0x0060:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0066
            r14 = r2
            goto L_0x0068
        L_0x0066:
            r14 = r48
        L_0x0068:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x006e
            r15 = r2
            goto L_0x0070
        L_0x006e:
            r15 = r49
        L_0x0070:
            r2 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x0076
            r2 = 0
            goto L_0x0078
        L_0x0076:
            r2 = r50
        L_0x0078:
            r4 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x007e
            r4 = 0
            goto L_0x0080
        L_0x007e:
            r4 = r51
        L_0x0080:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x008a
            r16 = 0
            goto L_0x008c
        L_0x008a:
            r16 = r52
        L_0x008c:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x0095
            r17 = 0
            goto L_0x0097
        L_0x0095:
            r17 = r53
        L_0x0097:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x00a0
            r18 = 0
            goto L_0x00a2
        L_0x00a0:
            r18 = r54
        L_0x00a2:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00ab
            r19 = 0
            goto L_0x00ad
        L_0x00ab:
            r19 = r55
        L_0x00ad:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00b6
            r20 = 0
            goto L_0x00b8
        L_0x00b6:
            r20 = r56
        L_0x00b8:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00c1
            r21 = 0
            goto L_0x00c3
        L_0x00c1:
            r21 = r57
        L_0x00c3:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00cc
            r22 = 0
            goto L_0x00ce
        L_0x00cc:
            r22 = r58
        L_0x00ce:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00d7
            java.lang.String r23 = ""
            goto L_0x00d9
        L_0x00d7:
            r23 = r59
        L_0x00d9:
            r24 = 8388608(0x800000, float:1.17549435E-38)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00e2
            r24 = 0
            goto L_0x00e4
        L_0x00e2:
            r24 = r60
        L_0x00e4:
            r25 = 16777216(0x1000000, float:2.3509887E-38)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x00ed
            r25 = 0
            goto L_0x00ef
        L_0x00ed:
            r25 = r61
        L_0x00ef:
            r26 = 33554432(0x2000000, float:9.403955E-38)
            r26 = r0 & r26
            if (r26 == 0) goto L_0x00f8
            r26 = 0
            goto L_0x00fa
        L_0x00f8:
            r26 = r62
        L_0x00fa:
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            r27 = r0 & r27
            if (r27 == 0) goto L_0x0103
            r27 = 0
            goto L_0x0105
        L_0x0103:
            r27 = r63
        L_0x0105:
            r28 = 134217728(0x8000000, float:3.85186E-34)
            r28 = r0 & r28
            if (r28 == 0) goto L_0x0112
            r28 = 0
            java.lang.Integer r29 = java.lang.Integer.valueOf(r28)
            goto L_0x0116
        L_0x0112:
            r28 = 0
            r29 = r64
        L_0x0116:
            r30 = 268435456(0x10000000, float:2.5243549E-29)
            r30 = r0 & r30
            if (r30 == 0) goto L_0x0121
            java.lang.Integer r30 = java.lang.Integer.valueOf(r28)
            goto L_0x0123
        L_0x0121:
            r30 = r65
        L_0x0123:
            r31 = 536870912(0x20000000, float:1.0842022E-19)
            r31 = r0 & r31
            if (r31 == 0) goto L_0x012c
            r31 = 0
            goto L_0x012e
        L_0x012c:
            r31 = r66
        L_0x012e:
            r32 = 1073741824(0x40000000, float:2.0)
            r32 = r0 & r32
            if (r32 == 0) goto L_0x0137
            r32 = 0
            goto L_0x0139
        L_0x0137:
            r32 = r67
        L_0x0139:
            r33 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r33
            if (r0 == 0) goto L_0x0142
            r0 = r28
            goto L_0x0144
        L_0x0142:
            r0 = r68
        L_0x0144:
            r33 = r73 & 1
            if (r33 == 0) goto L_0x014b
            r33 = 0
            goto L_0x014d
        L_0x014b:
            r33 = r69
        L_0x014d:
            r34 = r73 & 2
            if (r34 == 0) goto L_0x0154
            r34 = 0
            goto L_0x0156
        L_0x0154:
            r34 = r70
        L_0x0156:
            r35 = r73 & 4
            if (r35 == 0) goto L_0x015b
            goto L_0x015d
        L_0x015b:
            r28 = r71
        L_0x015d:
            r37 = r36
            r38 = r1
            r39 = r3
            r40 = r5
            r41 = r6
            r42 = r7
            r43 = r8
            r44 = r9
            r45 = r10
            r46 = r11
            r47 = r12
            r48 = r13
            r49 = r14
            r50 = r15
            r51 = r2
            r52 = r4
            r53 = r16
            r54 = r17
            r55 = r18
            r56 = r19
            r57 = r20
            r58 = r21
            r59 = r22
            r60 = r23
            r61 = r24
            r62 = r25
            r63 = r26
            r64 = r27
            r65 = r29
            r66 = r30
            r67 = r31
            r68 = r32
            r69 = r0
            r70 = r33
            r71 = r34
            r72 = r28
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.ListingImage.<init>(java.lang.String, int, int, int, java.lang.String, java.lang.String, int, java.lang.Integer, com.etsy.android.lib.models.datatypes.EtsyId, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, int, int, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String, int, java.lang.String, java.lang.String, boolean, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
