package com.etsy.android.p327ui.home.editorspicks.viewholder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.uikit.view.ListingFullImageView;
import com.google.android.gms.common.api.Api;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p213q2.C7717a;
import p442sc.C13371a;

/* renamed from: com.etsy.android.ui.home.editorspicks.viewholder.LoopingPagerAdapter */
public final class LoopingPagerAdapter extends C7717a {

    /* renamed from: d */
    public final List<ListingLike> f21910d;

    /* renamed from: e */
    public final C13371a f21911e;

    public LoopingPagerAdapter(List<? extends ListingLike> list, C13371a aVar) {
        C19383o.m32797g(list, "listings");
        C19383o.m32797g(aVar, "editorsPicksHeroEventHandler");
        this.f21910d = list;
        this.f21911e = aVar;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
    }

    /* renamed from: h */
    public final void mo10623h(ViewGroup viewGroup, int i, Object obj) {
        C19383o.m32797g(viewGroup, "container");
        C19383o.m32797g(obj, "view");
        viewGroup.removeView((View) obj);
    }

    /* renamed from: j */
    public final int mo20184j() {
        if (this.f21910d.isEmpty()) {
            return 0;
        }
        return Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* renamed from: n */
    public final Object mo10625n(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, "container");
        int size = i % this.f21910d.size();
        View inflate = View.inflate(viewGroup.getContext(), R.layout.editors_picks_carousel_item, (ViewGroup) null);
        ((ListingFullImageView) inflate.findViewById(R.id.listing_image)).setImageInfo(this.f21910d.get(size).getListingImage());
        ((TextView) inflate.findViewById(R.id.price)).setText(this.f21910d.get(size).getPrice().format());
        viewGroup.addView(inflate);
        ViewExtensions.m12866j(inflate, new LoopingPagerAdapter$instantiateItem$1(this, size));
        return inflate;
    }

    /* renamed from: o */
    public final boolean mo10626o(View view, Object obj) {
        C19383o.m32797g(view, "view");
        C19383o.m32797g(obj, ResponseConstants.OBJECT);
        return view == obj;
    }
}
