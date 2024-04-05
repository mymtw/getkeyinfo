package com.etsy.android.p327ui.user.inappnotifications;

/* renamed from: com.etsy.android.ui.user.inappnotifications.m */
public final class C11560m {
    /* JADX WARNING: type inference failed for: r12v7, types: [androidx.recyclerview.widget.RecyclerView$o] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m19346a(android.view.View r10, com.etsy.android.p327ui.user.inappnotifications.C11558k r11, com.etsy.android.p327ui.user.inappnotifications.C11561n r12) {
        /*
            com.etsy.android.lib.models.apiv3.listing.ShopIcon r0 = r11.f25601c
            java.lang.String r1 = "context"
            r2 = 0
            r3 = 2131429696(0x7f0b0940, float:1.8481072E38)
            if (r0 == 0) goto L_0x0069
            android.content.Context r0 = r10.getContext()
            com.etsy.android.lib.core.img.GlideRequests r0 = androidx.activity.C0114h.m270B0(r0)
            com.etsy.android.lib.models.apiv3.listing.ShopIcon r4 = r11.f25601c
            int r5 = r11.f25599a
            java.lang.String r4 = com.etsy.android.lib.models.apiv3.listing.ShopIconKt.urlForSize(r4, r5, r5)
            u9.b r0 = r0.load((java.lang.String) r4)
            com.bumptech.glide.request.g r4 = new com.bumptech.glide.request.g
            r4.<init>()
            r5 = 2
            j4.h[] r5 = new p150j4.C7117h[r5]
            com.bumptech.glide.load.resource.bitmap.i r6 = new com.bumptech.glide.load.resource.bitmap.i
            r6.<init>()
            r5[r2] = r6
            r6 = 1
            com.bumptech.glide.load.resource.bitmap.w r7 = new com.bumptech.glide.load.resource.bitmap.w
            r8 = 4
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            android.content.Context r9 = r10.getContext()
            kotlin.jvm.internal.C19383o.m32796f(r9, r1)
            int r8 = kotlinx.coroutines.C19543e0.m33295K(r8, r9)
            r7.<init>(r8)
            r5[r6] = r7
            com.bumptech.glide.request.a r4 = r4.mo17143F(r5)
            u9.b r0 = r0.mo16829a(r4)
            android.graphics.drawable.ColorDrawable r4 = new android.graphics.drawable.ColorDrawable
            r4.<init>(r2)
            u9.b r0 = r0.mo17160t(r4)
            android.view.View r4 = r10.findViewById(r3)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0.mo16816M(r4)
            android.view.View r0 = r10.findViewById(r3)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            com.etsy.android.extensions.ViewExtensions.m12869m(r0)
            goto L_0x007a
        L_0x0069:
            android.view.View r0 = r10.findViewById(r3)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 == 0) goto L_0x007a
            android.view.View r0 = r10.findViewById(r3)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            com.etsy.android.extensions.ViewExtensions.m12860d(r0)
        L_0x007a:
            android.content.Context r0 = r10.getContext()
            java.lang.String r3 = "itemView.context"
            kotlin.jvm.internal.C19383o.m32796f(r0, r3)
            r3 = 2130968945(0x7f040171, float:1.7546558E38)
            int r0 = p435rb.C13350a.m21013d(r0, r3)
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>()
            java.lang.String r4 = r11.f25602d
            r5 = 0
            if (r4 == 0) goto L_0x0099
            android.text.Spanned r4 = p628nj.C18263b.m30867s0(r4)
            goto L_0x009a
        L_0x0099:
            r4 = r5
        L_0x009a:
            android.text.SpannableStringBuilder r4 = r3.append(r4)
            java.lang.String r6 = " "
            android.text.SpannableStringBuilder r4 = r4.append(r6)
            java.lang.String r6 = "append(uiModel.notificat…             .append(\" \")"
            kotlin.jvm.internal.C19383o.m32796f(r4, r6)
            android.text.style.ForegroundColorSpan r6 = new android.text.style.ForegroundColorSpan
            r6.<init>(r0)
            int r0 = r4.length()
            java.lang.String r7 = r11.f25603e
            r4.append(r7)
            int r7 = r4.length()
            r8 = 17
            r4.setSpan(r6, r0, r7, r8)
            android.text.SpannedString r0 = new android.text.SpannedString
            r0.<init>(r3)
            r3 = 2131429114(0x7f0b06fa, float:1.8479892E38)
            android.view.View r3 = r10.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3.setText(r0)
            java.util.List<com.etsy.android.lib.models.apiv3.inappnotifications.IANListingCard> r0 = r11.f25605g
            boolean r0 = kotlinx.coroutines.C19543e0.m33306Y(r0)
            r3 = 2131428694(0x7f0b0556, float:1.847904E38)
            if (r0 == 0) goto L_0x012a
            android.content.Context r0 = r10.getContext()
            kotlin.jvm.internal.C19383o.m32796f(r0, r1)
            android.view.View r0 = r10.findViewById(r3)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            java.lang.String r1 = "in_app_notify_recyclerview"
            kotlin.jvm.internal.C19383o.m32796f(r0, r1)
            kotlin.jvm.internal.C19383o.m32794d(r12)
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            r1.<init>(r2, r2)
            r0.setLayoutManager(r1)
            com.etsy.android.extensions.ViewExtensions.m12869m(r0)
            com.etsy.android.ui.user.inappnotifications.c r1 = new com.etsy.android.ui.user.inappnotifications.c
            java.util.List<com.etsy.android.lib.models.apiv3.inappnotifications.IANListingCard> r2 = r11.f25605g
            com.etsy.android.lib.logger.b r4 = r12.f25606a
            com.etsy.android.ui.user.inappnotifications.IANViewHolderBinder$showRecyclerView$1 r6 = new com.etsy.android.ui.user.inappnotifications.IANViewHolderBinder$showRecyclerView$1
            r6.<init>(r12)
            r1.<init>(r2, r4, r6)
            r0.setAdapter(r1)
            int r12 = r11.f25600b
            if (r12 <= 0) goto L_0x0133
            android.view.View r12 = r10.findViewById(r3)
            androidx.recyclerview.widget.RecyclerView r12 = (androidx.recyclerview.widget.RecyclerView) r12
            androidx.recyclerview.widget.RecyclerView$o r12 = r12.getLayoutManager()
            boolean r0 = r12 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x0122
            r5 = r12
            androidx.recyclerview.widget.LinearLayoutManager r5 = (androidx.recyclerview.widget.LinearLayoutManager) r5
        L_0x0122:
            if (r5 == 0) goto L_0x0133
            int r12 = r11.f25600b
            r5.mo11315u0(r12)
            goto L_0x0133
        L_0x012a:
            android.view.View r12 = r10.findViewById(r3)
            androidx.recyclerview.widget.RecyclerView r12 = (androidx.recyclerview.widget.RecyclerView) r12
            com.etsy.android.extensions.ViewExtensions.m12860d(r12)
        L_0x0133:
            boolean r11 = r11.f25604f
            r12 = 2131430308(0x7f0b0ba4, float:1.8482313E38)
            if (r11 == 0) goto L_0x0142
            android.view.View r10 = r10.findViewById(r12)
            com.etsy.android.extensions.ViewExtensions.m12860d(r10)
            goto L_0x0149
        L_0x0142:
            android.view.View r10 = r10.findViewById(r12)
            com.etsy.android.extensions.ViewExtensions.m12869m(r10)
        L_0x0149:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.inappnotifications.C11560m.m19346a(android.view.View, com.etsy.android.ui.user.inappnotifications.k, com.etsy.android.ui.user.inappnotifications.n):void");
    }
}
