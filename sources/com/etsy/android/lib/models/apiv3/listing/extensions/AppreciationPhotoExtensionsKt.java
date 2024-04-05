package com.etsy.android.lib.models.apiv3.listing.extensions;

import com.etsy.android.lib.models.ImageSizes;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.AppreciationPhoto;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import p628nj.C18263b;

public final class AppreciationPhotoExtensionsKt {
    public static final String getImageUrlForPixelWidth(AppreciationPhoto appreciationPhoto, int i) {
        C19383o.m32797g(appreciationPhoto, "<this>");
        Pair<Integer, String>[] pairArr = com.etsy.android.lib.models.apiv3.AppreciationPhoto.IMG_SIZES_ARR;
        C19383o.m32796f(pairArr, "sizes");
        for (Pair<Integer, String> pair : pairArr) {
            Integer first = pair.getFirst();
            C19383o.m32796f(first, "size.first");
            if (i <= first.intValue()) {
                String second = pair.getSecond();
                C19383o.m32796f(second, "size.second");
                return replaceImageUrlWithSize(appreciationPhoto, second);
            }
        }
        return appreciationPhoto.getUrlFullxfull();
    }

    public static final String replaceImageUrlWithSize(AppreciationPhoto appreciationPhoto, String str) {
        C19383o.m32797g(appreciationPhoto, "<this>");
        C19383o.m32797g(str, ResponseConstants.SIZE);
        return C18263b.m30837c0(appreciationPhoto.getUrl75x75()) ? C19457k.m33023a1(appreciationPhoto.getUrl75x75(), ImageSizes.IMG_SIZE_75.getSecond(), str, false) : C18263b.m30837c0(appreciationPhoto.getUrl170x135()) ? C19457k.m33023a1(appreciationPhoto.getUrl170x135(), ImageSizes.IMG_SIZE_170.getSecond(), str, false) : C18263b.m30837c0(appreciationPhoto.getUrl570xN()) ? C19457k.m33023a1(appreciationPhoto.getUrl570xN(), ImageSizes.IMG_SIZE_570.getSecond(), str, false) : C18263b.m30837c0(appreciationPhoto.getUrlFullxfull()) ? C19457k.m33023a1(appreciationPhoto.getUrlFullxfull(), ImageSizes.IMG_SIZE_FULL.getSecond(), str, false) : appreciationPhoto.getUrlFullxfull();
    }
}
