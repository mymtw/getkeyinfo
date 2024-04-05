package com.etsy.android.p327ui.user.inappnotifications;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.p015ui.text.font.C1948d;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8672b;
import com.google.android.material.card.MaterialCardView;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.w */
public final class C11583w extends RecyclerView.C3084b0 {

    /* renamed from: b */
    public final C19857l<C11580v, C19394m> f25672b;

    /* renamed from: c */
    public final int f25673c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11583w(View view, C8672b bVar, C19857l<? super C11580v, C19394m> lVar) {
        super(view);
        C19383o.m32797g(bVar, "analyticsTracker");
        C19383o.m32797g(lVar, "clickHandler");
        this.f25672b = lVar;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.numeric_rating_star);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        Context context = this.itemView.getContext();
        C19383o.m32796f(context, "itemView.context");
        layoutParams.width = C19543e0.m33295K(12, context);
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        Context context2 = this.itemView.getContext();
        C19383o.m32796f(context2, "itemView.context");
        layoutParams2.height = C19543e0.m33295K(12, context2);
        Context context3 = this.itemView.getContext();
        C19383o.m32796f(context3, "itemView.context");
        int i = (int) (((float) context3.getResources().getDisplayMetrics().widthPixels) / (C1948d.m4275g(context3) ? 3.49f : 1.49f));
        int i2 = i / 2;
        this.f25673c = i2;
        ((MaterialCardView) this.itemView.findViewById(R.id.scrolling_shop_card)).getLayoutParams().width = i;
        ((ImageView) this.itemView.findViewById(R.id.img_item_1)).getLayoutParams().width = i2;
        ((ImageView) this.itemView.findViewById(R.id.img_item_2)).getLayoutParams().width = i2;
        ((ImageView) this.itemView.findViewById(R.id.img_item_3)).getLayoutParams().width = i2;
        ((ImageView) this.itemView.findViewById(R.id.img_item_4)).getLayoutParams().width = i2;
        ((ImageView) this.itemView.findViewById(R.id.shop_avatar)).getLayoutParams().width = i / 4;
    }
}
