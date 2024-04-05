package com.etsy.android.lib.models.apiv3.listing;

import java.util.List;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import p628nj.C18263b;

public final class ShopIconKt {
    public static final String urlForSize(ShopIcon shopIcon, int i, int i2) {
        List<ImageSize> l1;
        C19383o.m32797g(shopIcon, "<this>");
        List<ImageSize> sources = shopIcon.getSources();
        if (!(sources == null || (l1 = C19327t.m32656l1(sources, new ShopIconKt$urlForSize$$inlined$sortedBy$1())) == null)) {
            for (ImageSize imageSize : l1) {
                int width = imageSize.getWidth();
                int height = imageSize.getHeight();
                if (i <= width && i2 <= height) {
                    return imageSize.getUrl();
                }
            }
        }
        return (!C19457k.m33020X0("") || !C18263b.m30837c0(shopIcon.getUrl())) ? "" : shopIcon.getUrl();
    }
}
