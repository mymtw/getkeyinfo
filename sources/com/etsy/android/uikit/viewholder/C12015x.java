package com.etsy.android.uikit.viewholder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.lib.core.img.GlideRequests;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.SearchBannerMessage;
import com.etsy.android.stylekit.views.C9061l;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;
import p415of.C13171a;

/* renamed from: com.etsy.android.uikit.viewholder.x */
public final class C12015x extends C12086e<SearchBannerMessage> {

    /* renamed from: g */
    public static final /* synthetic */ int f26779g = 0;

    /* renamed from: c */
    public final C13171a<SearchBannerMessage> f26780c;

    /* renamed from: d */
    public TextView f26781d = ((TextView) this.itemView.findViewById(R.id.search_results_banner_title));

    /* renamed from: e */
    public TextView f26782e = ((TextView) this.itemView.findViewById(R.id.search_results_banner_subtitle));

    /* renamed from: f */
    public ImageView f26783f = ((ImageView) this.itemView.findViewById(R.id.search_results_banner_image));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12015x(ViewGroup viewGroup, C13171a<SearchBannerMessage> aVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.search_results_banner_1, viewGroup, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(aVar, "clickHandler");
        this.f26780c = aVar;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        SearchBannerMessage.Images images;
        SearchBannerMessage searchBannerMessage = (SearchBannerMessage) obj;
        this.itemView.setOnClickListener(new C9061l(2, this, searchBannerMessage));
        TextView textView = this.f26781d;
        String str = null;
        if (textView != null) {
            textView.setText(searchBannerMessage != null ? searchBannerMessage.getText() : null);
        }
        TextView textView2 = this.f26782e;
        if (textView2 != null) {
            textView2.setText(searchBannerMessage != null ? searchBannerMessage.getSubtext() : null);
        }
        ImageView imageView = this.f26783f;
        if (imageView != null) {
            GlideRequests C0 = C0114h.m272C0(imageView);
            if (!(searchBannerMessage == null || (images = searchBannerMessage.getImages()) == null)) {
                Context context = imageView.getContext();
                C19383o.m32796f(context, "it.context");
                str = images.getImageForDensity(context);
            }
            C0.load(str).mo16816M(imageView);
        }
    }
}
