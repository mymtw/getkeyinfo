package p498zc;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import p466vc.C13573c;

/* renamed from: zc.c */
public final class C13948c extends RecyclerView.C3108s {

    /* renamed from: b */
    public final C13573c f30667b;

    /* renamed from: c */
    public final Rect f30668c = new Rect();

    public C13948c(C13573c cVar) {
        this.f30667b = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0096, code lost:
        if (r5 == null) goto L_0x0098;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScrolled(androidx.recyclerview.widget.RecyclerView r5, int r6, int r7) {
        /*
            r4 = this;
            java.lang.String r6 = "recyclerView"
            kotlin.jvm.internal.C19383o.m32797g(r5, r6)
            if (r7 == 0) goto L_0x000e
            vc.c r6 = r4.f30667b
            vc.g$o r7 = p466vc.C13597g.C13696o.f30201a
            r6.mo38043a(r7)
        L_0x000e:
            androidx.recyclerview.widget.RecyclerView$o r6 = r5.getLayoutManager()
            boolean r7 = r6 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r7 == 0) goto L_0x0019
            androidx.recyclerview.widget.LinearLayoutManager r6 = (androidx.recyclerview.widget.LinearLayoutManager) r6
            goto L_0x001a
        L_0x0019:
            r6 = 0
        L_0x001a:
            r7 = -1
            if (r6 == 0) goto L_0x0022
            int r0 = r6.mo11279P0()
            goto L_0x0023
        L_0x0022:
            r0 = r7
        L_0x0023:
            if (r6 == 0) goto L_0x002a
            int r6 = r6.mo11283T0()
            goto L_0x002b
        L_0x002a:
            r6 = r7
        L_0x002b:
            if (r0 == r7) goto L_0x0039
            if (r6 == r7) goto L_0x0039
            vc.c r7 = r4.f30667b
            vc.g$p r1 = new vc.g$p
            r1.<init>(r0, r6)
            r7.mo38043a(r1)
        L_0x0039:
            com.etsy.android.ui.listing.ListingViewState$ImageVisibility r6 = com.etsy.android.p327ui.listing.ListingViewState.ImageVisibility.NONE
            androidx.recyclerview.widget.RecyclerView$Adapter r7 = r5.getAdapter()
            if (r7 == 0) goto L_0x009f
            int r0 = r7.getItemCount()
            r1 = 0
        L_0x0046:
            if (r1 >= r0) goto L_0x009f
            int r2 = r7.getItemViewType(r1)
            com.etsy.android.ui.listing.ListingViewTypes r3 = com.etsy.android.p327ui.listing.ListingViewTypes.IMAGES
            int r3 = r3.ordinal()
            if (r2 != r3) goto L_0x009c
            androidx.recyclerview.widget.RecyclerView$b0 r7 = r5.findViewHolderForAdapterPosition(r1)
            if (r7 == 0) goto L_0x009f
            android.view.View r0 = r7.itemView
            int r0 = r0.getHeight()
            if (r0 <= 0) goto L_0x009f
            android.view.View r6 = r7.itemView
            android.graphics.Rect r7 = r4.f30668c
            r7.setEmpty()
            android.graphics.Rect r7 = r4.f30668c
            r5.getHitRect(r7)
            if (r6 == 0) goto L_0x0098
            android.graphics.Rect r5 = r4.f30668c
            boolean r5 = r6.getLocalVisibleRect(r5)
            if (r5 == 0) goto L_0x0094
            android.graphics.Rect r5 = r4.f30668c
            int r5 = r5.height()
            double r0 = (double) r5
            int r5 = r6.getHeight()
            double r5 = (double) r5
            r2 = 4599075939470750515(0x3fd3333333333333, double:0.3)
            double r5 = r5 * r2
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x0091
            com.etsy.android.ui.listing.ListingViewState$ImageVisibility r5 = com.etsy.android.p327ui.listing.ListingViewState.ImageVisibility.NONE
            goto L_0x0096
        L_0x0091:
            com.etsy.android.ui.listing.ListingViewState$ImageVisibility r5 = com.etsy.android.p327ui.listing.ListingViewState.ImageVisibility.VISIBLE
            goto L_0x0096
        L_0x0094:
            com.etsy.android.ui.listing.ListingViewState$ImageVisibility r5 = com.etsy.android.p327ui.listing.ListingViewState.ImageVisibility.NONE
        L_0x0096:
            if (r5 != 0) goto L_0x009a
        L_0x0098:
            com.etsy.android.ui.listing.ListingViewState$ImageVisibility r5 = com.etsy.android.p327ui.listing.ListingViewState.ImageVisibility.NONE
        L_0x009a:
            r6 = r5
            goto L_0x009f
        L_0x009c:
            int r1 = r1 + 1
            goto L_0x0046
        L_0x009f:
            vc.c r5 = r4.f30667b
            vc.g$n1 r7 = new vc.g$n1
            r7.<init>(r6)
            r5.mo38043a(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p498zc.C13948c.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
