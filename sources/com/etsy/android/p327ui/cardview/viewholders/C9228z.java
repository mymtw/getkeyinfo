package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.apiv3.vespa.FormattedTopic;
import com.etsy.android.lib.models.apiv3.vespa.Topic;
import com.etsy.android.p327ui.cardview.clickhandlers.C9145z;
import com.etsy.android.vespa.viewholders.C12086e;
import com.google.android.material.card.MaterialCardView;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.cardview.viewholders.z */
public final class C9228z extends C12086e<FormattedTopic> {

    /* renamed from: c */
    public final C9145z f20372c;

    /* renamed from: d */
    public final LinearLayout f20373d;

    /* renamed from: e */
    public final MaterialCardView f20374e;

    /* renamed from: f */
    public ImageView f20375f;

    /* renamed from: g */
    public TextView f20376g;

    public C9228z(ViewGroup viewGroup, C9145z zVar) {
        super(C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.list_item_mosaic_card, viewGroup, false));
        this.f20372c = zVar;
        View findViewById = this.itemView.findViewById(R.id.mosaic_container);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.mosaic_container)");
        this.f20373d = (LinearLayout) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.card);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.card)");
        this.f20374e = (MaterialCardView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.image);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.id.image)");
        this.f20375f = (ImageView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.title);
        C19383o.m32796f(findViewById4, "itemView.findViewById(R.id.title)");
        this.f20376g = (TextView) findViewById4;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        FormattedTopic formattedTopic = (FormattedTopic) obj;
        C19383o.m32797g(formattedTopic, FormattedTopic.ITEM_TYPE);
        ViewExtensions.m12866j(this.f20374e, new FormattedTopicViewHolder$bind$1(this, formattedTopic));
        Topic topic = formattedTopic.getTopic();
        String str = null;
        List<ListingImage> images = topic != null ? topic.getImages() : null;
        if (images != null && (!images.isEmpty())) {
            C0114h.m272C0(this.itemView).load(images.get(0).getUrl()).mo16816M(this.f20375f);
        }
        TextView textView = this.f20376g;
        Topic topic2 = formattedTopic.getTopic();
        if (topic2 != null) {
            str = topic2.getTopicName();
        }
        textView.setText(str);
        this.f20374e.getLayoutParams().width = this.itemView.getResources().getDimensionPixelSize(R.dimen.mosaic_content_width);
        this.f20374e.getLayoutParams().height = this.itemView.getResources().getDimensionPixelSize(R.dimen.mosaic_content_short_height);
        this.f20373d.getLayoutParams().width = -2;
        for (FormattedTopic.Format format : formattedTopic.getFormats()) {
            if (format == FormattedTopic.Format.FIRST_FEATURED_TRIPLET && getAdapterPosition() % 3 == 0) {
                this.f20374e.getLayoutParams().height = this.itemView.getResources().getDimensionPixelSize(R.dimen.mosaic_content_tall_height);
                this.f20376g.setMinHeight(this.itemView.getResources().getDimensionPixelSize(R.dimen.mosaic_content_tall_mid_height));
            }
        }
    }

    /* renamed from: b */
    public final void mo31374b() {
        this.f20374e.getLayoutParams().height = this.itemView.getResources().getDimensionPixelSize(R.dimen.mosaic_content_short_height);
        this.f20375f.setImageResource(0);
        this.f20376g.setMinHeight(this.itemView.getResources().getDimensionPixelSize(R.dimen.mosaic_content_short_mid_height));
    }
}
