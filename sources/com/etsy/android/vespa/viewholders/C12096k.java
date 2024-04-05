package com.etsy.android.vespa.viewholders;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.ExploreHeader;
import com.etsy.android.lib.models.apiv3.Image;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p415of.C13186o;
import p504ai.C13983i;

/* renamed from: com.etsy.android.vespa.viewholders.k */
public final class C12096k extends C12086e<C13186o> {

    /* renamed from: c */
    public final TextView f26981c;

    /* renamed from: d */
    public final TextView f26982d;

    /* renamed from: e */
    public final ImageView f26983e;

    public C12096k(ViewGroup viewGroup) {
        super(C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.list_item_explore_header, viewGroup, false));
        View findViewById = this.itemView.findViewById(R.id.title);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.title)");
        this.f26981c = (TextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.subtitle);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.subtitle)");
        this.f26982d = (TextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.image);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.id.image)");
        this.f26983e = (ImageView) findViewById3;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        C19394m mVar;
        String url;
        C13186o oVar = (C13186o) obj;
        C19383o.m32797g(oVar, "data");
        ExploreHeader exploreHeader = (ExploreHeader) oVar;
        this.itemView.setBackgroundColor(exploreHeader.getBackgroundColor());
        this.f26981c.setText(exploreHeader.getTitle());
        this.f26981c.setTextColor(exploreHeader.getTitleTextColor());
        this.f26982d.setText(exploreHeader.getSubtitle());
        this.f26982d.setTextColor(exploreHeader.getSubtitleTextColor());
        TextView textView = this.f26982d;
        String subtitle = exploreHeader.getSubtitle();
        int i = 0;
        if (subtitle == null || subtitle.length() == 0) {
            i = 8;
        }
        textView.setVisibility(i);
        Image image = exploreHeader.getImage();
        if (image != null) {
            List<Image.Source> sources = image.getSources();
            C19383o.m32796f(sources, "imageData.sources");
            Image.Source source = (Image.Source) C19327t.m32646b1(sources);
            if (source == null || (url = source.getUrl()) == null) {
                mVar = null;
            } else {
                C0114h.m270B0(this.f26983e.getContext()).load(url).mo16816M(this.f26983e);
                ViewExtensions.m12869m(this.f26983e);
                mVar = C19394m.f43287a;
            }
            if (mVar == null) {
                ViewExtensions.m12860d(this.f26983e);
                return;
            }
            return;
        }
        ViewExtensions.m12860d(this.f26983e);
    }
}
