package com.etsy.android.lib.models.apiv3.listing.extensions;

import com.etsy.android.lib.models.apiv3.listing.Image;
import kotlin.jvm.internal.C19383o;

public final class ImageExtensionsKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.etsy.android.lib.models.apiv3.Image convertToV2Image(com.etsy.android.lib.models.apiv3.listing.Image r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r5, r0)
            com.etsy.android.lib.models.apiv3.Image r0 = new com.etsy.android.lib.models.apiv3.Image
            r0.<init>()
            java.lang.String r1 = r5.getKey()
            java.lang.String r1 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r1)
            r0.setKey(r1)
            java.lang.String r1 = r5.getUrl()
            java.lang.String r1 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r1)
            r0.setUrl(r1)
            java.util.List r5 = r5.getSources()
            if (r5 == 0) goto L_0x0061
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = kotlin.collections.C19322o.m32624F0(r5)
            r1.<init>(r2)
            java.util.Iterator r5 = r5.iterator()
        L_0x0033:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0063
            java.lang.Object r2 = r5.next()
            com.etsy.android.lib.models.apiv3.listing.ImageSize r2 = (com.etsy.android.lib.models.apiv3.listing.ImageSize) r2
            com.etsy.android.lib.models.apiv3.Image$Source r3 = new com.etsy.android.lib.models.apiv3.Image$Source
            r3.<init>()
            java.lang.String r4 = r2.getUrl()
            java.lang.String r4 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r4)
            r3.setUrl(r4)
            int r4 = r2.getHeight()
            r3.setHeight(r4)
            int r2 = r2.getWidth()
            r3.setWidth(r2)
            r1.add(r3)
            goto L_0x0033
        L_0x0061:
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.INSTANCE
        L_0x0063:
            r0.setSources(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.extensions.ImageExtensionsKt.convertToV2Image(com.etsy.android.lib.models.apiv3.listing.Image):com.etsy.android.lib.models.apiv3.Image");
    }

    public static final String getFullHeightImageUrlForPixelWidth(Image image, int i) {
        C19383o.m32797g(image, "<this>");
        return pickBestImageSource(image, i, 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.etsy.android.lib.models.apiv3.listing.ImageSize} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.etsy.android.lib.models.apiv3.listing.ImageSize} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.etsy.android.lib.models.apiv3.listing.ImageSize} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.etsy.android.lib.models.apiv3.listing.ImageSize} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.etsy.android.lib.models.apiv3.listing.ImageSize} */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        r6 = r1.getUrl();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String pickBestImageSource(com.etsy.android.lib.models.apiv3.listing.Image r5, int r6, int r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r5, r0)
            java.util.List r0 = r5.getSources()
            r1 = 0
            if (r0 == 0) goto L_0x003c
            com.etsy.android.lib.models.apiv3.listing.extensions.ImageExtensionsKt$pickBestImageSource$$inlined$sortedBy$1 r2 = new com.etsy.android.lib.models.apiv3.listing.extensions.ImageExtensionsKt$pickBestImageSource$$inlined$sortedBy$1
            r2.<init>()
            java.util.List r0 = kotlin.collections.C19327t.m32656l1(r0, r2)
            if (r0 == 0) goto L_0x003c
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x003a
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.etsy.android.lib.models.apiv3.listing.ImageSize r3 = (com.etsy.android.lib.models.apiv3.listing.ImageSize) r3
            int r4 = r3.getWidth()
            if (r6 > r4) goto L_0x0036
            int r3 = r3.getHeight()
            if (r7 > r3) goto L_0x0036
            r3 = 1
            goto L_0x0037
        L_0x0036:
            r3 = 0
        L_0x0037:
            if (r3 == 0) goto L_0x001b
            r1 = r2
        L_0x003a:
            com.etsy.android.lib.models.apiv3.listing.ImageSize r1 = (com.etsy.android.lib.models.apiv3.listing.ImageSize) r1
        L_0x003c:
            if (r1 == 0) goto L_0x0044
            java.lang.String r6 = r1.getUrl()
            if (r6 != 0) goto L_0x0048
        L_0x0044:
            java.lang.String r6 = r5.getUrl()
        L_0x0048:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.extensions.ImageExtensionsKt.pickBestImageSource(com.etsy.android.lib.models.apiv3.listing.Image, int, int):java.lang.String");
    }
}
