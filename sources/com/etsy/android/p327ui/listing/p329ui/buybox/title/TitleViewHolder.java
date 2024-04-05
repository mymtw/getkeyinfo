package com.etsy.android.p327ui.listing.p329ui.buybox.title;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import com.etsy.android.stylekit.views.CollageHeadingTextView;
import com.google.android.gms.common.api.Api;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.title.TitleViewHolder */
public final class TitleViewHolder extends C10424k {

    /* renamed from: b */
    public final boolean f22651b;

    /* renamed from: c */
    public final C10310b f22652c;

    /* renamed from: d */
    public final C13573c f22653d;

    /* renamed from: e */
    public final CollageHeadingTextView f22654e;

    static {
        int i = CollageHeadingTextView.$stable;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TitleViewHolder(ViewGroup viewGroup, boolean z, C10310b bVar, C13573c cVar) {
        super(C0114h.m305j0(viewGroup, R.layout.list_item_listing_title, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(bVar, "listingTitleExpander");
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f22651b = z;
        this.f22652c = bVar;
        this.f22653d = cVar;
        View findViewById = this.itemView.findViewById(R.id.listing_title);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.listing_title)");
        this.f22654e = (CollageHeadingTextView) findViewById;
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (jVar instanceof C10313d) {
            C10313d dVar = (C10313d) jVar;
            this.f22654e.setText(dVar.f22658a);
            int i = 1;
            if (dVar.f22660c) {
                C10310b bVar = this.f22652c;
                CollageHeadingTextView collageHeadingTextView = this.f22654e;
                bVar.getClass();
                C19383o.m32797g(collageHeadingTextView, "listingTitle");
                collageHeadingTextView.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                collageHeadingTextView.setEllipsize((TextUtils.TruncateAt) null);
                collageHeadingTextView.setOnClickListener((View.OnClickListener) null);
                collageHeadingTextView.setTextIsSelectable(true);
                return;
            }
            if (!this.f22651b) {
                i = 2;
            }
            C10310b bVar2 = this.f22652c;
            CollageHeadingTextView collageHeadingTextView2 = this.f22654e;
            TitleViewHolder$bind$1 titleViewHolder$bind$1 = new TitleViewHolder$bind$1(this);
            bVar2.getClass();
            C19383o.m32797g(collageHeadingTextView2, "listingTitle");
            collageHeadingTextView2.setMaxLines(i);
            collageHeadingTextView2.setEllipsize(TextUtils.TruncateAt.END);
            ViewExtensions.m12866j(collageHeadingTextView2, new ListingTitleExpander$setupExpansionListener$1(titleViewHolder$bind$1, bVar2, collageHeadingTextView2));
            return;
        }
        throw new IllegalArgumentException();
    }
}
