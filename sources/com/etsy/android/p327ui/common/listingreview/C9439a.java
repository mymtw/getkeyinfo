package com.etsy.android.p327ui.common.listingreview;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.activity.C0114h;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.resource.bitmap.C6105w;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.Image;
import com.etsy.android.lib.models.apiv3.listing.ReviewImage;
import com.etsy.android.lib.models.apiv3.listing.extensions.ImageExtensionsKt;
import java.util.ArrayList;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p455u9.C13448b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.common.listingreview.a */
public final class C9439a extends RecyclerView.Adapter<C9440b> {

    /* renamed from: b */
    public final boolean f20931b = true;

    /* renamed from: c */
    public final C19857l<Integer, C19394m> f20932c;

    /* renamed from: d */
    public ArrayList<ReviewImage> f20933d;

    public C9439a(C19857l lVar) {
        this.f20932c = lVar;
        this.f20933d = new ArrayList<>();
    }

    public final int getItemCount() {
        return this.f20933d.size();
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C9440b bVar = (C9440b) b0Var;
        C19383o.m32797g(bVar, "viewHolder");
        boolean z = true;
        int i2 = 0;
        if (i != this.f20933d.size() - 1) {
            z = false;
        }
        ReviewImage reviewImage = this.f20933d.get(i);
        C19383o.m32796f(reviewImage, "reviewImages[position]");
        boolean z2 = this.f20931b;
        Context context = bVar.itemView.getContext();
        Image image = reviewImage.getImage();
        C13448b j0 = C0114h.m270B0(context).load(image != null ? ImageExtensionsKt.getFullHeightImageUrlForPixelWidth(image, C9440b.f20934c) : null).mo17160t(new ColorDrawable(0));
        C19383o.m32796f(j0, "with(context)\n          …wable(Color.TRANSPARENT))");
        if (z2) {
            j0.mo17139B(new C6105w(context.getResources().getDimensionPixelSize(R.dimen.clg_space_8)));
        }
        j0.mo16816M((ImageView) bVar.itemView.findViewById(R.id.img_thumbnail));
        bVar.itemView.setTag(Integer.valueOf(i));
        View view = bVar.itemView;
        C19383o.m32796f(view, "itemView");
        ViewExtensions.m12866j(view, new ReviewImageViewHolder$bind$2(bVar));
        ViewGroup.LayoutParams layoutParams = bVar.itemView.getLayoutParams();
        C19383o.m32795e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(z ? bVar.itemView.getResources().getDimensionPixelSize(R.dimen.clg_space_16) : bVar.itemView.getResources().getDimensionPixelSize(R.dimen.clg_space_12));
        if (i == 0) {
            i2 = bVar.itemView.getResources().getDimensionPixelSize(R.dimen.clg_space_16);
        }
        marginLayoutParams.setMarginStart(i2);
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        return new C9440b(C0114h.m305j0(viewGroup, R.layout.list_item_review_thumbnail, false), this.f20932c);
    }
}
