package com.etsy.android.p327ui.listing.p329ui.bottomsheet;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.util.C8914m;

/* renamed from: com.etsy.android.ui.listing.ui.bottomsheet.AddToCartInterstitialHelper$recyclerViewGlobalLayoutListener$1 */
public final class AddToCartInterstitialHelper$recyclerViewGlobalLayoutListener$1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ AddToCartInterstitialHelper this$0;

    public AddToCartInterstitialHelper$recyclerViewGlobalLayoutListener$1(AddToCartInterstitialHelper addToCartInterstitialHelper) {
        this.this$0 = addToCartInterstitialHelper;
    }

    public void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver;
        ViewGroup viewGroup = this.this$0.f22421n;
        Resources resources = null;
        View findViewById = viewGroup != null ? viewGroup.findViewById(R.id.divider) : null;
        Rect rect = new Rect();
        if (findViewById != null) {
            findViewById.getDrawingRect(rect);
        }
        ViewGroup viewGroup2 = this.this$0.f22421n;
        if (viewGroup2 != null) {
            viewGroup2.offsetDescendantRectToMyCoords(findViewById, rect);
        }
        AddToCartInterstitialHelper addToCartInterstitialHelper = this.this$0;
        RecyclerView recyclerView = addToCartInterstitialHelper.f22424q;
        if (recyclerView != null) {
            ViewGroup viewGroup3 = addToCartInterstitialHelper.f22421n;
            if (viewGroup3 != null) {
                resources = viewGroup3.getResources();
            }
            recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), C8914m.m17344b(resources) + rect.top);
        }
        RecyclerView recyclerView2 = this.this$0.f22424q;
        if (recyclerView2 != null && (viewTreeObserver = recyclerView2.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }
}
