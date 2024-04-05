package com.etsy.android.p327ui.cardview.viewholders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.etsy.android.R;
import com.etsy.android.lib.models.ISearchSuggestion;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;
import p415of.C13171a;

/* renamed from: com.etsy.android.ui.cardview.viewholders.i1 */
public final class C9185i1 extends C12086e<ISearchSuggestion> {

    /* renamed from: c */
    public final C13171a<ISearchSuggestion> f20222c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9185i1(ViewGroup viewGroup, C13171a<ISearchSuggestion> aVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.search_suggestion_with_image, viewGroup, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(aVar, "clickHandler");
        this.f20222c = aVar;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        ISearchSuggestion iSearchSuggestion = (ISearchSuggestion) obj;
        C19383o.m32797g(iSearchSuggestion, ResponseConstants.SUGGESTION);
        View view = this.itemView;
        ((TextView) view.findViewById(R.id.query)).setText(iSearchSuggestion.getQuery());
        ListingImage image = iSearchSuggestion.getImage();
        if (image != null) {
            Glide.with(this.itemView.getContext()).load(image.getUrl300x300()).mo16816M((ImageView) view.findViewById(R.id.previewImage));
        }
        view.setOnClickListener(new C9182h1(0, this, iSearchSuggestion));
    }

    /* renamed from: b */
    public final void mo31374b() {
        ((ImageView) this.itemView.findViewById(R.id.previewImage)).setImageResource(0);
    }
}
