package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.vespa.SavableSearchQuery;
import com.etsy.android.p327ui.cardview.clickhandlers.SavableSearchQueryClickHandler;
import com.etsy.android.search.savedsearch.C8984h;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;

/* renamed from: com.etsy.android.ui.cardview.viewholders.u0 */
public final class C9218u0 extends C12086e<SavableSearchQuery> {

    /* renamed from: c */
    public final SavableSearchQueryClickHandler f20353c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9218u0(ViewGroup viewGroup, SavableSearchQueryClickHandler savableSearchQueryClickHandler) {
        super(C0114h.m305j0(viewGroup, R.layout.savable_search_query, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(savableSearchQueryClickHandler, "clickHandler");
        this.f20353c = savableSearchQueryClickHandler;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        SavableSearchQuery savableSearchQuery = (SavableSearchQuery) obj;
        C19383o.m32797g(savableSearchQuery, "savableSearchQuery");
        View view = this.itemView;
        ((TextView) view.findViewById(R.id.query)).setText(savableSearchQuery.getQuery());
        if (!C19457k.m33020X0(savableSearchQuery.getFiltersDisplayValue())) {
            ViewExtensions.m12869m((TextView) view.findViewById(R.id.displayFilters));
            ((TextView) view.findViewById(R.id.displayFilters)).setText(savableSearchQuery.getFiltersDisplayValue());
        } else {
            ViewExtensions.m12860d((TextView) view.findViewById(R.id.displayFilters));
        }
        ViewExtensions.m12866j(view, new SavableSearchQueryViewHolder$bind$1$1(this, savableSearchQuery));
        ImageView imageView = (ImageView) view.findViewById(R.id.favButton);
        C19383o.m32796f(imageView, "favButton");
        String str = imageView.getContext().getString(R.string.unsave_search) + ' ' + savableSearchQuery.getQuery();
        String str2 = imageView.getContext().getString(R.string.save_search) + ' ' + savableSearchQuery.getQuery();
        if (savableSearchQuery.isFavorite()) {
            imageView.setImageResource(R.drawable.clg_icon_favorited);
            imageView.setContentDescription(str);
        } else {
            imageView.setImageResource(R.drawable.clg_icon_unfavorited);
            imageView.setContentDescription(str2);
        }
        ViewExtensions.m12866j(imageView, new SavableSearchQueryViewHolder$bindSaveHeartButton$1(savableSearchQuery, imageView, R.drawable.clg_icon_favorited, str, R.drawable.clg_icon_unfavorited, str2, this));
    }

    /* renamed from: b */
    public final void mo31374b() {
        C8984h hVar = this.f20353c.f20031e;
        if (hVar != null) {
            hVar.f19830d.mo19405d();
        } else {
            C19383o.m32805o("savedSearchViewDelegate");
            throw null;
        }
    }
}
