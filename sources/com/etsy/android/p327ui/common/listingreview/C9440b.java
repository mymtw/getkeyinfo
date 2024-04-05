package com.etsy.android.p327ui.common.listingreview;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import kotlin.C19394m;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.common.listingreview.b */
public final class C9440b extends RecyclerView.C3084b0 {

    /* renamed from: c */
    public static int f20934c;

    /* renamed from: b */
    public final C19857l<Integer, C19394m> f20935b;

    public C9440b(View view, C19857l<? super Integer, C19394m> lVar) {
        super(view);
        this.f20935b = lVar;
        f20934c = view.getResources().getDimensionPixelSize(R.dimen.listing_review_thumbnail_size);
    }
}
