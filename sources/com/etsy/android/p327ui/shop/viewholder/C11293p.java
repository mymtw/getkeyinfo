package com.etsy.android.p327ui.shop.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.util.C8914m;
import p260v0.C8184a;

/* renamed from: com.etsy.android.ui.shop.viewholder.p */
public final class C11293p extends RecyclerView.C3099n {

    /* renamed from: a */
    public final int f24931a;

    /* renamed from: b */
    public final int f24932b;

    /* renamed from: c */
    public final Drawable f24933c;

    /* renamed from: d */
    public final Drawable f24934d;

    /* renamed from: e */
    public final int f24935e;

    /* renamed from: f */
    public final int f24936f;

    public C11293p(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.shop2_horizontal_circular_image_size);
        this.f24931a = resources.getDimensionPixelOffset(R.dimen.fixed_large) + resources.getDimensionPixelOffset(R.dimen.fixed_medium_large) + dimensionPixelSize;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        if (C8914m.f19669c == 0.0f) {
            C8914m.m17348f(context);
        }
        this.f24932b = displayMetrics.widthPixels;
        Object obj = C8184a.f17966a;
        this.f24933c = C8184a.C8187c.m16466b(context, R.drawable.divider);
        this.f24934d = C8184a.C8187c.m16466b(context, R.drawable.reviews_vertical_divider);
        this.f24935e = resources.getDimensionPixelOffset(R.dimen.fixed_large) + (resources.getDimensionPixelOffset(R.dimen.shop2_horizontal_circular_image_size) >> 1);
        this.f24936f = resources.getDimensionPixelOffset(R.dimen.clg_space_8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDrawOver(android.graphics.Canvas r18, androidx.recyclerview.widget.RecyclerView r19, androidx.recyclerview.widget.RecyclerView.C3117y r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            int r3 = r19.getChildCount()
            r5 = 0
        L_0x000b:
            if (r5 >= r3) goto L_0x0111
            android.view.View r6 = r2.getChildAt(r5)
            androidx.recyclerview.widget.RecyclerView$b0 r7 = r2.getChildViewHolder(r6)
            int r7 = r7.getItemViewType()
            android.graphics.drawable.Drawable r8 = r0.f24933c
            int r9 = r0.f24931a
            int r10 = r0.f24932b
            r11 = 2131430589(0x7f0b0cbd, float:1.8482883E38)
            r12 = 2131430588(0x7f0b0cbc, float:1.8482881E38)
            r13 = 2131430587(0x7f0b0cbb, float:1.848288E38)
            if (r7 == r13) goto L_0x006b
            r14 = 2131430584(0x7f0b0cb8, float:1.8482873E38)
            if (r7 == r14) goto L_0x006b
            if (r7 == r12) goto L_0x006b
            if (r7 != r11) goto L_0x0034
            goto L_0x006b
        L_0x0034:
            r9 = 2131430596(0x7f0b0cc4, float:1.8482897E38)
            if (r7 != r9) goto L_0x003e
            int r9 = r6.getTop()
            goto L_0x005b
        L_0x003e:
            r9 = 2131430562(0x7f0b0ca2, float:1.8482828E38)
            if (r7 == r9) goto L_0x005d
            r9 = 2131430604(0x7f0b0ccc, float:1.8482914E38)
            if (r7 != r9) goto L_0x0049
            goto L_0x005d
        L_0x0049:
            r9 = 2131430555(0x7f0b0c9b, float:1.8482814E38)
            if (r7 != r9) goto L_0x008f
            int r9 = r6.getBottom()
            android.view.ViewGroup$LayoutParams r14 = r6.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r14 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r14
            int r14 = r14.bottomMargin
            int r9 = r9 + r14
        L_0x005b:
            r14 = 0
            goto L_0x0074
        L_0x005d:
            int r9 = r6.getPaddingLeft()
            int r14 = r6.getLeft()
            int r14 = r14 + r9
            int r9 = r6.getTop()
            goto L_0x0074
        L_0x006b:
            int r14 = r6.getLeft()
            int r14 = r14 + r9
            int r9 = r6.getBottom()
        L_0x0074:
            float r15 = r6.getTranslationY()
            int r15 = java.lang.Math.round(r15)
            int r16 = r8.getIntrinsicHeight()
            int r9 = r9 + r15
            int r4 = r9 + r16
            r8.setBounds(r14, r9, r10, r4)
            r8.draw(r1)
            if (r7 == r13) goto L_0x0091
            if (r7 == r12) goto L_0x0091
            if (r7 == r11) goto L_0x0091
        L_0x008f:
            r11 = 0
            goto L_0x009f
        L_0x0091:
            int r4 = r6.getTop()
            int r4 = r4 + r15
            int r9 = r16 + r4
            r11 = 0
            r8.setBounds(r11, r4, r10, r9)
            r8.draw(r1)
        L_0x009f:
            android.graphics.drawable.Drawable r4 = r0.f24934d
            int r8 = r0.f24935e
            int r9 = r0.f24936f
            int r10 = r2.getChildAdapterPosition(r6)
            androidx.recyclerview.widget.RecyclerView$Adapter r12 = r19.getAdapter()
            com.etsy.android.ui.shop.a0 r12 = (com.etsy.android.p327ui.shop.C11127a0) r12
            r13 = 2131430585(0x7f0b0cb9, float:1.8482875E38)
            if (r7 != r13) goto L_0x010d
            r7 = -1
            if (r10 == r7) goto L_0x010d
            int r10 = r10 + 1
            int r7 = r12.getItemCount()
            if (r10 >= r7) goto L_0x010d
            int r7 = r12.getItemViewType(r10)
            r10 = 2131430564(0x7f0b0ca4, float:1.8482833E38)
            if (r7 == r10) goto L_0x00da
            r10 = 2131430565(0x7f0b0ca5, float:1.8482835E38)
            if (r7 == r10) goto L_0x00da
            r10 = 2131430566(0x7f0b0ca6, float:1.8482837E38)
            if (r7 == r10) goto L_0x00da
            r10 = 2131430567(0x7f0b0ca7, float:1.8482839E38)
            if (r7 != r10) goto L_0x00d8
            goto L_0x00da
        L_0x00d8:
            r7 = r11
            goto L_0x00db
        L_0x00da:
            r7 = 1
        L_0x00db:
            if (r7 != 0) goto L_0x00de
            goto L_0x010d
        L_0x00de:
            int r7 = r6.getTop()
            int r10 = r6.getPaddingTop()
            int r10 = r10 + r7
            int r10 = r10 - r9
            float r7 = r6.getTranslationY()
            int r7 = java.lang.Math.round(r7)
            int r7 = r7 + r10
            int r9 = r6.getBottom()
            int r10 = r6.getPaddingBottom()
            int r9 = r9 - r10
            int r10 = r4.getIntrinsicWidth()
            int r6 = r6.getLeft()
            int r6 = r6 + r8
            int r8 = r10 >> 1
            int r6 = r6 - r8
            int r10 = r10 + r6
            r4.setBounds(r6, r7, r10, r9)
            r4.draw(r1)
        L_0x010d:
            int r5 = r5 + 1
            goto L_0x000b
        L_0x0111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.shop.viewholder.C11293p.onDrawOver(android.graphics.Canvas, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$y):void");
    }
}
