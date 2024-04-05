package com.etsy.android.p327ui.home.editorspicks.viewholder;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.Listing;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.finds.FindsSearchCategory;
import com.etsy.android.uikit.view.ImageViewWithAspectRatio;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;
import p442sc.C13372b;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.home.editorspicks.viewholder.a */
public final class C9942a extends C12086e<FindsSearchCategory> {

    /* renamed from: c */
    public final C13372b f21912c;

    /* renamed from: d */
    public final ImageViewWithAspectRatio f21913d;

    /* renamed from: e */
    public final TextView f21914e;

    public C9942a(ViewGroup viewGroup, C13372b bVar) {
        super(C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.finds_category_card, viewGroup, false));
        this.f21912c = bVar;
        View findViewById = this.itemView.findViewById(R.id.listing_image);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.listing_image)");
        this.f21913d = (ImageViewWithAspectRatio) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.txt_title);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.txt_title)");
        this.f21914e = (TextView) findViewById2;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        FindsSearchCategory findsSearchCategory = (FindsSearchCategory) obj;
        C19383o.m32797g(findsSearchCategory, ResponseConstants.CATEGORY);
        this.f21914e.setText(findsSearchCategory.getTitle());
        Listing listing = findsSearchCategory.getListing();
        if (!(listing == null || listing.getImage() == null)) {
            this.f21913d.setImageInfo(listing.getImage());
        }
        View view = this.itemView;
        C19383o.m32796f(view, "rootView");
        ViewExtensions.m12866j(view, new EditorsPicksCategoryViewHolder$bind$1(this, findsSearchCategory));
    }

    /* renamed from: b */
    public final void mo31374b() {
        this.f21913d.setImageDrawable((Drawable) null);
    }
}
