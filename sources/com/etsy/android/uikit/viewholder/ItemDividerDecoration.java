package com.etsy.android.uikit.viewholder;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.core.EtsyApplication;
import com.etsy.android.lib.util.C8914m;
import p260v0.C8184a;

public final class ItemDividerDecoration extends RecyclerView.C3099n {

    /* renamed from: g */
    public static C11963a f26562g = new C11963a();

    /* renamed from: a */
    public final Drawable f26563a;

    /* renamed from: b */
    public final int f26564b;

    /* renamed from: c */
    public C11965c f26565c;

    /* renamed from: d */
    public int f26566d;

    /* renamed from: e */
    public int f26567e;

    /* renamed from: f */
    public int f26568f;

    public enum Alignment {
        ALIGN_CHILD,
        ALIGN_PARENT,
        ALIGN_SCREEN
    }

    /* renamed from: com.etsy.android.uikit.viewholder.ItemDividerDecoration$a */
    public class C11963a extends C11965c {
        /* renamed from: a */
        public final Alignment mo31549a() {
            return Alignment.ALIGN_PARENT;
        }

        /* renamed from: b */
        public final boolean mo31550b(int i) {
            return true;
        }
    }

    /* renamed from: com.etsy.android.uikit.viewholder.ItemDividerDecoration$b */
    public static /* synthetic */ class C11964b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26569a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.etsy.android.uikit.viewholder.ItemDividerDecoration$Alignment[] r0 = com.etsy.android.uikit.viewholder.ItemDividerDecoration.Alignment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26569a = r0
                com.etsy.android.uikit.viewholder.ItemDividerDecoration$Alignment r1 = com.etsy.android.uikit.viewholder.ItemDividerDecoration.Alignment.ALIGN_CHILD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26569a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.etsy.android.uikit.viewholder.ItemDividerDecoration$Alignment r1 = com.etsy.android.uikit.viewholder.ItemDividerDecoration.Alignment.ALIGN_SCREEN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26569a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.etsy.android.uikit.viewholder.ItemDividerDecoration$Alignment r1 = com.etsy.android.uikit.viewholder.ItemDividerDecoration.Alignment.ALIGN_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.uikit.viewholder.ItemDividerDecoration.C11964b.<clinit>():void");
        }
    }

    /* renamed from: com.etsy.android.uikit.viewholder.ItemDividerDecoration$c */
    public static abstract class C11965c {
        /* renamed from: a */
        public abstract Alignment mo31549a();

        /* renamed from: b */
        public abstract boolean mo31550b(int i);
    }

    public ItemDividerDecoration(Drawable drawable, C11965c cVar, int i) {
        this.f26563a = drawable;
        this.f26564b = drawable.getAlpha();
        this.f26565c = cVar;
        this.f26568f = i;
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C3117y yVar) {
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C3117y yVar) {
        int i;
        int i2;
        RecyclerView.C3100o oVar;
        int i3;
        int i4;
        int i5;
        Canvas canvas2 = canvas;
        RecyclerView recyclerView2 = recyclerView;
        if (this.f26566d == 0) {
            Context context = recyclerView.getContext();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            if (C8914m.f19669c == 0.0f) {
                C8914m.m17348f(context);
            }
            this.f26566d = displayMetrics.widthPixels;
        }
        RecyclerView.C3100o layoutManager = recyclerView.getLayoutManager();
        int i6 = this.f26566d;
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        GridLayoutManager gridLayoutManager = null;
        if (recyclerView.getLayoutManager() instanceof GridLayoutManager) {
            gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            i = gridLayoutManager.f7003F;
        } else {
            i = -1;
        }
        int childCount = recyclerView.getChildCount();
        int i7 = 0;
        int i8 = 0;
        while (i7 < childCount) {
            View childAt = recyclerView2.getChildAt(i7);
            recyclerView2.getChildViewHolder(childAt).getItemViewType();
            int childAdapterPosition = recyclerView2.getChildAdapterPosition(childAt);
            if (!this.f26565c.mo31550b(childAdapterPosition)) {
                oVar = layoutManager;
                i3 = i6;
                i2 = paddingLeft;
            } else {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                int i9 = C11964b.f26569a[this.f26565c.mo31549a().ordinal()];
                i3 = i6;
                if (i9 == 1) {
                    int left = childAt.getLeft();
                    layoutManager.getClass();
                    i5 = RecyclerView.C3100o.m7395D(childAt) + left;
                    i4 = RecyclerView.C3100o.m7398K(childAt) + childAt.getRight();
                } else if (i9 != 2) {
                    i5 = paddingLeft;
                    i4 = width;
                } else {
                    i4 = i3;
                    i5 = 0;
                }
                int bottom = childAt.getBottom() + layoutParams.bottomMargin;
                layoutManager.getClass();
                int w = RecyclerView.C3100o.m7403w(childAt) + bottom + ((int) childAt.getTranslationY());
                int intrinsicHeight = this.f26563a.getIntrinsicHeight() + w;
                int i10 = this.f26567e;
                int i11 = i5 + i10;
                int i12 = i4 - i10;
                if (gridLayoutManager != null) {
                    int i13 = this.f26568f;
                    i11 += i13;
                    i12 -= i13;
                }
                int i14 = i11;
                oVar = layoutManager;
                int i15 = i12;
                i2 = paddingLeft;
                this.f26563a.setBounds(i14, w, i15, intrinsicHeight);
                this.f26563a.setAlpha((int) (childAt.getAlpha() * ((float) this.f26564b)));
                this.f26563a.draw(canvas2);
                if (!(gridLayoutManager == null || childAdapterPosition == -1)) {
                    int max = Math.max(this.f26563a.getIntrinsicWidth() / 2, 1);
                    i8 += gridLayoutManager.f7008K.mo11265d(childAdapterPosition);
                    if (i8 % i != 0) {
                        this.f26563a.setBounds(childAt.getRight() - max, RecyclerView.C3100o.m7399M(childAt) + childAt.getTop() + layoutParams.topMargin + ((int) childAt.getTranslationY()) + this.f26568f, childAt.getRight() + max, w - this.f26568f);
                        this.f26563a.setAlpha((int) (childAt.getAlpha() * ((float) this.f26564b)));
                        this.f26563a.draw(canvas2);
                    }
                }
            }
            i7++;
            recyclerView2 = recyclerView;
            i6 = i3;
            layoutManager = oVar;
            paddingLeft = i2;
        }
    }

    public ItemDividerDecoration(Drawable drawable, C11965c cVar) {
        this(drawable, cVar, EtsyApplication.get().getResources().getDimensionPixelSize(R.dimen.clg_space_16));
    }

    public ItemDividerDecoration(Drawable drawable, int i) {
        this(drawable, (C11965c) f26562g);
        this.f26567e = i;
    }

    public ItemDividerDecoration(Context context, int i) {
        this(context, f26562g);
        this.f26567e = i;
    }

    public ItemDividerDecoration(Context context) {
        this(context, f26562g);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ItemDividerDecoration(Context context, C11963a aVar) {
        this(C8184a.C8187c.m16466b(context, R.drawable.list_divider), aVar, context.getResources().getDimensionPixelSize(R.dimen.clg_space_16));
        Object obj = C8184a.f17966a;
    }
}
