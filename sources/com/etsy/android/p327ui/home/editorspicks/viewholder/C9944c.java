package com.etsy.android.p327ui.home.editorspicks.viewholder;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.cardviewelement.FindsHeroBanner;
import com.etsy.android.lib.util.C8914m;
import com.etsy.android.uikit.view.FullImageView;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.home.editorspicks.viewholder.c */
public final class C9944c extends C12086e<FindsHeroBanner> {

    /* renamed from: c */
    public final TextView f21916c;

    /* renamed from: d */
    public final TextView f21917d;

    /* renamed from: e */
    public final FullImageView f21918e;

    /* renamed from: f */
    public final C8914m f21919f;

    public C9944c(ViewGroup viewGroup) {
        super(C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.list_item_card_view_finds_hero_banner_tall, viewGroup, false));
        View findViewById = this.itemView.findViewById(R.id.txt_title);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.txt_title)");
        this.f21916c = (TextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.txt_subtitle);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.txt_subtitle)");
        this.f21917d = (TextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.image);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.id.image)");
        this.f21918e = (FullImageView) findViewById3;
        this.f21919f = new C8914m(viewGroup.getContext());
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        FindsHeroBanner findsHeroBanner = (FindsHeroBanner) obj;
        C19383o.m32797g(findsHeroBanner, "data");
        this.f21916c.setText(findsHeroBanner.getTitle());
        ViewExtensions.m12870n(this.f21917d, new EditorsPicksHeroBannerViewHolder$bind$1(findsHeroBanner));
        this.f21917d.setText(findsHeroBanner.getSubtitle());
        FullImageView fullImageView = this.f21918e;
        DisplayMetrics displayMetrics = this.f21919f.f19670a;
        int min = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
        DisplayMetrics displayMetrics2 = this.f21919f.f19670a;
        fullImageView.setImageInfo(findsHeroBanner.formattedBannerImage(min, displayMetrics2.heightPixels < displayMetrics2.widthPixels));
    }

    /* renamed from: b */
    public final void mo31374b() {
        this.f21918e.cleanUp();
    }
}
