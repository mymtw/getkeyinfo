package com.etsy.android.p327ui.common.listingreview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C5959e;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.C6085i;
import com.bumptech.glide.load.resource.bitmap.C6105w;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ReviewVideo;
import com.etsy.android.lib.models.apiv3.listing.Video;
import java.util.ArrayList;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p075d.C6614a;
import p628nj.C18263b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.common.listingreview.c */
public final class C9441c extends RecyclerView.Adapter<C9442d> {

    /* renamed from: b */
    public final C19857l<Integer, C19394m> f20936b;

    /* renamed from: c */
    public ArrayList<ReviewVideo> f20937c = new ArrayList<>();

    public C9441c(C19857l<? super Integer, C19394m> lVar) {
        this.f20936b = lVar;
    }

    public final int getItemCount() {
        return this.f20937c.size();
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C9442d dVar = (C9442d) b0Var;
        C19383o.m32797g(dVar, "viewHolder");
        int i2 = 0;
        boolean z = i == this.f20937c.size() - 1;
        ReviewVideo reviewVideo = this.f20937c.get(i);
        C19383o.m32796f(reviewVideo, "reviewVideos[position]");
        ReviewVideo reviewVideo2 = reviewVideo;
        Context context = dVar.itemView.getContext();
        Video video = reviewVideo2.getVideo();
        String str = null;
        String url = video != null ? video.getUrl() : null;
        View view = dVar.itemView;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.clg_space_8);
        Drawable a = C6614a.m12981a(context, R.drawable.video_review_thumbnail_skeleton);
        ((C5959e) ((C5959e) ((C5959e) Glide.with(context).load(url).mo17160t(a)).mo17152j(a)).mo17143F(new C6085i(), new C6105w(dimensionPixelSize))).mo16816M((ImageView) view.findViewById(R.id.video_thumbnail));
        Float rating = reviewVideo2.getRating();
        if (rating != null) {
            str = Integer.valueOf((int) rating.floatValue()).toString();
        }
        if (C18263b.m30839d0(str)) {
            TextView textView = (TextView) dVar.itemView.findViewById(R.id.video_review_numeric_rating);
            if (textView != null) {
                ViewExtensions.m12869m(textView);
                textView.setText(str);
                ImageView imageView = (ImageView) dVar.itemView.findViewById(R.id.video_review_numeric_rating_star);
                if (imageView != null) {
                    ViewExtensions.m12869m(imageView);
                }
            }
        } else {
            TextView textView2 = (TextView) dVar.itemView.findViewById(R.id.video_review_numeric_rating);
            if (textView2 != null) {
                ViewExtensions.m12860d(textView2);
            }
            ImageView imageView2 = (ImageView) dVar.itemView.findViewById(R.id.video_review_numeric_rating_star);
            if (imageView2 != null) {
                ViewExtensions.m12860d(imageView2);
            }
        }
        View view2 = dVar.itemView;
        C19383o.m32796f(view2, "itemView");
        ViewExtensions.m12866j(view2, new ReviewVideoViewHolder$bind$2(dVar, i));
        ViewGroup.LayoutParams layoutParams = dVar.itemView.getLayoutParams();
        C19383o.m32795e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(z ? dVar.itemView.getResources().getDimensionPixelSize(R.dimen.clg_space_16) : dVar.itemView.getResources().getDimensionPixelSize(R.dimen.clg_space_12));
        if (i == 0) {
            i2 = dVar.itemView.getResources().getDimensionPixelSize(R.dimen.clg_space_16);
        }
        marginLayoutParams.setMarginStart(i2);
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        return new C9442d(C0114h.m305j0(viewGroup, R.layout.list_item_review_video_thumbnail, false), this.f20936b);
    }
}
