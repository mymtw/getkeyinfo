package com.etsy.android.uikit.viewholder;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.cardview.widget.CardView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.ILink;
import com.etsy.android.lib.models.apiv3.ILinkCollection;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.vespa.viewholders.C12094i;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.C19322o;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import p423pf.C13232c;
import p435rb.C13351b;
import p568fn.C17782b;

/* renamed from: com.etsy.android.uikit.viewholder.w */
public final class C12014w extends C12094i {

    /* renamed from: e */
    public final C8618c f26777e;

    /* renamed from: f */
    public final boolean f26778f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12014w(ViewGroup viewGroup, C8623e eVar, C13232c cVar, boolean z) {
        super(viewGroup, cVar);
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        this.f26777e = eVar;
        this.f26778f = z;
    }

    /* renamed from: g */
    public final void mo38896g(LinearLayout linearLayout, ILink iLink) {
        C19383o.m32797g(iLink, "segment");
        if (this.f26778f && this.f26777e.mo21132b(C8592b.f18768X0)) {
            CardView cardView = (CardView) C0114h.m305j0(linearLayout, R.layout.view_query_reformulation_card, false);
            ViewExtensions.m12866j(cardView, new QueryReformulationsListViewHolder$addCard$1(this, iLink));
            ((TextView) cardView.findViewById(R.id.title)).setText(iLink.getTitle());
            Iterable<ListingImage> images = iLink.getImages();
            if (images == null) {
                images = EmptyList.INSTANCE;
            }
            ArrayList arrayList = new ArrayList(C19322o.m32624F0(images));
            for (ListingImage url300x300 : images) {
                arrayList.add(url300x300.getUrl300x300());
            }
            Iterator it = C19327t.m32667w1(C17782b.m29865e0((ImageView) cardView.findViewById(R.id.image_slot_1), (ImageView) cardView.findViewById(R.id.image_slot_2), (ImageView) cardView.findViewById(R.id.image_slot_3)), arrayList).iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                ImageView imageView = (ImageView) pair.component1();
                C0114h.m270B0(imageView.getContext()).load((String) pair.component2()).mo16816M(imageView);
            }
            linearLayout.addView(cardView);
        } else if (this.f26777e.mo21132b(C8592b.f18756R0)) {
            TextView textView = (TextView) C0114h.m305j0(linearLayout, R.layout.view_query_reformulation_pill, false);
            textView.setText(iLink.getTitle());
            ViewExtensions.m12866j(textView, new QueryReformulationsListViewHolder$addPill$1$1(this, iLink));
            linearLayout.addView(textView);
        } else {
            super.mo38896g(linearLayout, iLink);
        }
    }

    /* renamed from: h */
    public final void mo19450a(ILinkCollection iLinkCollection) {
        LinearLayout.LayoutParams layoutParams;
        C19383o.m32797g(iLinkCollection, "deepLinkSegmentList");
        super.mo19450a(iLinkCollection);
        if (this.f26777e.mo21132b(C8592b.f18756R0)) {
            Resources resources = this.itemView.getResources();
            TextView textView = (TextView) this.itemView.findViewById(R.id.deep_link_segment_list_title);
            C19383o.m32796f(textView, "itemView.deep_link_segment_list_title");
            C13351b.m21018b(textView, R.style.clg_text_title);
            TextView textView2 = (TextView) this.itemView.findViewById(R.id.deep_link_segment_list_title);
            textView2.setAllCaps(false);
            textView2.setPaddingRelative(resources.getDimensionPixelSize(R.dimen.clg_space_16), 0, textView2.getPaddingEnd(), resources.getDimensionPixelSize(R.dimen.clg_space_4));
            View view = this.itemView;
            C19383o.m32796f(view, "itemView");
            view.setPaddingRelative(view.getPaddingStart(), 0, view.getPaddingEnd(), view.getPaddingBottom());
            Iterator<ViewGroup> it = this.f26978d.iterator();
            while (it.hasNext()) {
                ViewGroup next = it.next();
                C19383o.m32796f(next, "container");
                next.setPaddingRelative(resources.getDimensionPixelSize(R.dimen.clg_space_12), next.getPaddingTop(), resources.getDimensionPixelSize(R.dimen.clg_space_16), next.getPaddingBottom());
                ViewParent parent = next.getParent();
                LinearLayout.LayoutParams layoutParams2 = null;
                HorizontalScrollView horizontalScrollView = parent instanceof HorizontalScrollView ? (HorizontalScrollView) parent : null;
                Object layoutParams3 = horizontalScrollView != null ? horizontalScrollView.getLayoutParams() : null;
                if (layoutParams3 instanceof LinearLayout.LayoutParams) {
                    layoutParams2 = (LinearLayout.LayoutParams) layoutParams3;
                }
                if (horizontalScrollView != null) {
                    if (layoutParams2 != null) {
                        layoutParams2.bottomMargin = 0;
                        layoutParams = layoutParams2;
                    } else {
                        layoutParams = horizontalScrollView.getLayoutParams();
                    }
                    horizontalScrollView.setLayoutParams(layoutParams);
                }
            }
        }
    }
}
