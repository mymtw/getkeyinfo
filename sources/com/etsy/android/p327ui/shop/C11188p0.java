package com.etsy.android.p327ui.shop;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.util.C8914m;
import com.etsy.android.uikit.viewholder.C11997k;

/* renamed from: com.etsy.android.ui.shop.p0 */
public final class C11188p0 {

    /* renamed from: com.etsy.android.ui.shop.p0$a */
    public static class C11189a extends C11190b {

        /* renamed from: e */
        public final int f24735e;

        public C11189a(Resources resources) {
            super(resources);
            this.f24735e = resources.getDimensionPixelOffset(R.dimen.edge_edge_listing_spacing);
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C3117y yVar) {
            super.getItemOffsets(rect, view, recyclerView, yVar);
            RecyclerView.C3084b0 childViewHolder = recyclerView.getChildViewHolder(view);
            int itemViewType = childViewHolder.getItemViewType();
            if (itemViewType == R.id.view_type_shop_home_featured_listing || itemViewType == R.id.view_type_shop_home_listing) {
                int i = this.f24735e;
                GridLayoutManager.LayoutParams layoutParams = (GridLayoutManager.LayoutParams) childViewHolder.itemView.getLayoutParams();
                int spanIndex = layoutParams.getSpanIndex();
                int spanSize = layoutParams.getSpanSize();
                int i2 = ((GridLayoutManager) recyclerView.getLayoutManager()).f7003F;
                int i3 = spanIndex % i2;
                boolean z = true;
                boolean z2 = i3 == 0;
                if (i3 != layoutParams.getSpanSize()) {
                    z = false;
                }
                int i4 = i >> 1;
                rect.bottom = i4;
                rect.top = i4;
                if (z2) {
                    rect.left = 0;
                    rect.right = ((i3 + spanSize) * i) / i2;
                } else if (z) {
                    rect.left = ((i2 - i3) * i) / i2;
                    rect.right = 0;
                }
            }
        }
    }

    /* renamed from: com.etsy.android.ui.shop.p0$b */
    public static class C11190b extends RecyclerView.C3099n {

        /* renamed from: a */
        public final int f24736a;

        /* renamed from: b */
        public final int f24737b;

        /* renamed from: c */
        public final int f24738c;

        /* renamed from: d */
        public final GradientDrawable f24739d = new GradientDrawable();

        public C11190b(Resources resources) {
            this.f24736a = resources.getDimensionPixelOffset(R.dimen.fixed_large);
            this.f24737b = resources.getDimensionPixelOffset(R.dimen.shop2_home_neg_icon_margin);
            this.f24738c = resources.getDimensionPixelOffset(R.dimen.margin_medium);
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C3117y yVar) {
            int i;
            int i2;
            RecyclerView.C3084b0 childViewHolder = recyclerView.getChildViewHolder(view);
            int itemViewType = childViewHolder.getItemViewType();
            if (itemViewType == R.id.view_type_shop_home_featured_listing || itemViewType == R.id.view_type_shop_home_listing) {
                int i3 = this.f24736a;
                GridLayoutManager.LayoutParams layoutParams = (GridLayoutManager.LayoutParams) childViewHolder.itemView.getLayoutParams();
                int spanIndex = layoutParams.getSpanIndex();
                int spanSize = layoutParams.getSpanSize();
                int i4 = ((GridLayoutManager) recyclerView.getLayoutManager()).f7003F;
                int i5 = spanIndex % i4;
                rect.left = ((i4 - i5) * i3) / i4;
                rect.right = ((i5 + spanSize) * i3) / i4;
                int i6 = i3 >> 1;
                rect.bottom = i6;
                rect.top = i6;
            } else if (itemViewType == R.id.view_type_shop_home_icon) {
                int i7 = this.f24737b;
                C11127a0 a0Var = (C11127a0) recyclerView.getAdapter();
                int adapterPosition = childViewHolder.getAdapterPosition();
                if (!C8914m.m17345c(recyclerView.getContext()) && adapterPosition - 1 >= 0 && a0Var.getItemViewType(i2) == R.id.view_type_shop_home_cover_photo) {
                    rect.set(0, i7, 0, 0);
                }
            } else if (itemViewType == R.id.view_type_shop_home_load_button_listings || itemViewType == R.id.view_type_shop_home_load_button_reviews) {
                int i8 = this.f24738c;
                C11127a0 a0Var2 = (C11127a0) recyclerView.getAdapter();
                int adapterPosition2 = childViewHolder.getAdapterPosition();
                if (adapterPosition2 != -1) {
                    Object obj = ((C11202t0) a0Var2.getItem(adapterPosition2)).f24766b;
                    if ((obj instanceof C11997k.C11998a) && (((C11997k.C11998a) obj).f26736c & 1) != 1) {
                        rect.set(0, 0, 0, i8);
                    }
                }
            } else if (itemViewType == R.id.view_type_shop_home_cover_photo) {
                rect.left = -recyclerView.getPaddingLeft();
                rect.right = -recyclerView.getPaddingRight();
            } else if (itemViewType == R.id.view_type_shop_home_info) {
                int i9 = this.f24738c;
                int adapterPosition3 = childViewHolder.getAdapterPosition();
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if (adapterPosition3 != -1 && (i = adapterPosition3 + 1) < adapter.getItemCount() && adapter.getItemViewType(i) == R.id.view_type_shop_home_featured_listing) {
                    rect.bottom = i9;
                }
            }
        }

        public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C3117y yVar) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                Drawable background = childAt.getBackground();
                if (background instanceof ColorDrawable) {
                    ColorDrawable colorDrawable = (ColorDrawable) background;
                    if (colorDrawable.getColor() != 0) {
                        int round = Math.round(childAt.getTranslationY());
                        GradientDrawable gradientDrawable = this.f24739d;
                        gradientDrawable.setColor(colorDrawable.getColor());
                        int top = childAt.getTop() + round;
                        int bottom = childAt.getBottom() + round;
                        gradientDrawable.setBounds(0, top, childAt.getLeft(), bottom);
                        gradientDrawable.draw(canvas);
                        gradientDrawable.setBounds(childAt.getRight(), top, recyclerView.getRight(), bottom);
                        gradientDrawable.draw(canvas);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m19137a(View view) {
        Resources resources = view.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.shop2_horizontal_circular_image_size);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.fixed_large);
        view.setPadding(view.getPaddingLeft() + dimensionPixelOffset + resources.getDimensionPixelOffset(R.dimen.fixed_medium_large) + dimensionPixelSize, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }
}
