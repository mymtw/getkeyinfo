package com.etsy.android.lib.models.apiv3.listing.extensions;

import com.etsy.android.lib.models.apiv3.listing.ImageSize;
import java.util.Comparator;
import p628nj.C18263b;

public final class ImageExtensionsKt$pickBestImageSource$$inlined$sortedBy$1<T> implements Comparator {
    public final int compare(T t, T t2) {
        return C18263b.m30880z(Integer.valueOf(((ImageSize) t).getWidth()), Integer.valueOf(((ImageSize) t2).getWidth()));
    }
}
