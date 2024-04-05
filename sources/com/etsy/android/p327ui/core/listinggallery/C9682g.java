package com.etsy.android.p327ui.core.listinggallery;

import android.content.Context;
import android.widget.ImageView;
import androidx.activity.C0114h;
import com.bumptech.glide.load.resource.bitmap.C6085i;
import com.bumptech.glide.load.resource.bitmap.C6105w;
import com.etsy.android.lib.models.apiv3.listing.AppreciationPhoto;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p455u9.C13448b;

/* renamed from: com.etsy.android.ui.core.listinggallery.g */
public final class C9682g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ReviewViewHolder f21448b;

    /* renamed from: c */
    public final /* synthetic */ AppreciationPhoto f21449c;

    public C9682g(ImageView imageView, ReviewViewHolder reviewViewHolder, AppreciationPhoto appreciationPhoto) {
        this.f21448b = reviewViewHolder;
        this.f21449c = appreciationPhoto;
    }

    public final void run() {
        C13448b b0 = C0114h.m270B0(this.f21448b.itemView.getContext()).load(this.f21449c.pickBestSquareImage(this.f21448b.f21340e.getMeasuredWidth())).mo16812I(new C9681f(this.f21448b));
        Context context = this.f21448b.itemView.getContext();
        C19383o.m32796f(context, "itemView.context");
        b0.mo46144l0(new C6085i(), new C6105w(C19543e0.m33295K(8, context))).mo16816M(this.f21448b.f21340e);
    }
}
