package com.etsy.android.p327ui.user.review;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.review.ReviewIconViewHolder */
public final class ReviewIconViewHolder extends RecyclerView.C3084b0 {

    /* renamed from: b */
    public final C19857l<String, Drawable> f26032b;

    /* renamed from: c */
    public final C19285c f26033c;

    /* renamed from: d */
    public final C19285c f26034d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReviewIconViewHolder(View view, C19857l<? super String, ? extends Drawable> lVar) {
        super(view);
        C19383o.m32797g(lVar, "getDisplayIconDrawable");
        this.f26032b = lVar;
        this.f26033c = C19350d.m32677b(new ReviewIconViewHolder$textView$2(view));
        this.f26034d = C19350d.m32677b(new ReviewIconViewHolder$iconView$2(view));
    }
}
