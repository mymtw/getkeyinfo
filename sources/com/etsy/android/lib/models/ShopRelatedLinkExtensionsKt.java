package com.etsy.android.lib.models;

import kotlin.jvm.internal.C19383o;

public final class ShopRelatedLinkExtensionsKt {
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int getTypeVectorIcon(com.etsy.android.lib.models.ShopRelatedLink r1) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r1, r0)
            java.lang.String r1 = r1.getTitle()
            int r0 = r1.hashCode()
            switch(r0) {
                case -916346253: goto L_0x0038;
                case -1034342: goto L_0x002b;
                case 28903346: goto L_0x001e;
                case 497130182: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0045
        L_0x0011:
            java.lang.String r0 = "facebook"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x001a
            goto L_0x0045
        L_0x001a:
            r1 = 2131231532(0x7f08032c, float:1.8079148E38)
            goto L_0x0048
        L_0x001e:
            java.lang.String r0 = "instagram"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0027
            goto L_0x0045
        L_0x0027:
            r1 = 2131231539(0x7f080333, float:1.8079162E38)
            goto L_0x0048
        L_0x002b:
            java.lang.String r0 = "pinterest"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0034
            goto L_0x0045
        L_0x0034:
            r1 = 2131231547(0x7f08033b, float:1.8079178E38)
            goto L_0x0048
        L_0x0038:
            java.lang.String r0 = "twitter"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0041
            goto L_0x0045
        L_0x0041:
            r1 = 2131231552(0x7f080340, float:1.8079188E38)
            goto L_0x0048
        L_0x0045:
            r1 = 2131231425(0x7f0802c1, float:1.807893E38)
        L_0x0048:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.ShopRelatedLinkExtensionsKt.getTypeVectorIcon(com.etsy.android.lib.models.ShopRelatedLink):int");
    }

    public static final boolean isValid(ShopRelatedLink shopRelatedLink) {
        C19383o.m32797g(shopRelatedLink, "<this>");
        String title = shopRelatedLink.getTitle();
        for (ShopRelatedLinkType fieldTitle : ShopRelatedLinkType.values()) {
            if (C19383o.m32792b(fieldTitle.getFieldTitle(), title)) {
                return true;
            }
        }
        return false;
    }
}
