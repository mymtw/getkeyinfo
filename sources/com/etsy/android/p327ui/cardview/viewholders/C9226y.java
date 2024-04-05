package com.etsy.android.p327ui.cardview.viewholders;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.apiv3.vespa.FormattedTopicFirstFeatured;
import com.etsy.android.lib.models.apiv3.vespa.Topic;
import com.etsy.android.p327ui.cardview.clickhandlers.C9145z;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p415of.C13184m;
import p415of.C13186o;

/* renamed from: com.etsy.android.ui.cardview.viewholders.y */
public final class C9226y extends RecyclerView.Adapter<C9202o> {

    /* renamed from: b */
    public final C13184m f20368b;

    /* renamed from: c */
    public final C9145z f20369c;

    public C9226y(C13184m mVar, C9145z zVar) {
        C19383o.m32797g(mVar, "data");
        C19383o.m32797g(zVar, "clickHandler");
        this.f20368b = mVar;
        this.f20369c = zVar;
    }

    public final int getItemCount() {
        return this.f20368b.getItems().size();
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C9202o oVar = (C9202o) b0Var;
        C19383o.m32797g(oVar, "holder");
        C13186o oVar2 = this.f20368b.getItems().get(i);
        C19383o.m32795e(oVar2, "null cannot be cast to non-null type com.etsy.android.lib.models.apiv3.vespa.FormattedTopicFirstFeatured");
        FormattedTopicFirstFeatured formattedTopicFirstFeatured = (FormattedTopicFirstFeatured) oVar2;
        ViewExtensions.m12866j(oVar.f20313c, new FeaturableTopicViewHolder$bindTopic$1(oVar, formattedTopicFirstFeatured));
        Topic topic = formattedTopicFirstFeatured.getTopic();
        String str = null;
        List<ListingImage> images = topic != null ? topic.getImages() : null;
        if (images != null && (!images.isEmpty())) {
            C0114h.m272C0(oVar.itemView).load(images.get(0).getUrl()).mo16816M(oVar.f20314d);
        }
        TextView textView = oVar.f20315e;
        Topic topic2 = formattedTopicFirstFeatured.getTopic();
        if (topic2 != null) {
            str = topic2.getTopicName();
        }
        textView.setText(str);
        if (formattedTopicFirstFeatured.isFeatured()) {
            oVar.f20313c.getLayoutParams().height = oVar.itemView.getResources().getDimensionPixelSize(R.dimen.mosaic_content_tall_height);
            oVar.f20315e.setMinHeight(oVar.itemView.getResources().getDimensionPixelSize(R.dimen.mosaic_content_tall_mid_height));
        }
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        return new C9202o(viewGroup, this.f20369c);
    }

    public final void onViewRecycled(RecyclerView.C3084b0 b0Var) {
        C9202o oVar = (C9202o) b0Var;
        C19383o.m32797g(oVar, "holder");
        oVar.f20313c.getLayoutParams().height = oVar.itemView.getResources().getDimensionPixelSize(R.dimen.mosaic_content_short_height);
        oVar.f20314d.setImageResource(0);
        oVar.f20315e.setMinHeight(oVar.itemView.getResources().getDimensionPixelSize(R.dimen.mosaic_content_short_mid_height));
        super.onViewRecycled(oVar);
    }
}
