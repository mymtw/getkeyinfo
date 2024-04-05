package com.etsy.android.p327ui.cardview.viewholders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.DeepLink;
import com.etsy.android.lib.models.apiv3.vespa.NavigationalPageHeader;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;
import p423pf.C13232c;

/* renamed from: com.etsy.android.ui.cardview.viewholders.p0 */
public final class C9206p0 extends C12086e<NavigationalPageHeader> {

    /* renamed from: c */
    public final C13232c f20321c;

    /* renamed from: d */
    public final C8672b f20322d;

    /* renamed from: e */
    public TextView f20323e = ((TextView) this.itemView.findViewById(R.id.title_header));

    /* renamed from: f */
    public Button f20324f = ((Button) this.itemView.findViewById(R.id.parent_header_link));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9206p0(ViewGroup viewGroup, C8703p pVar, C13232c cVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_expanded_header, viewGroup, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(cVar, "clickHandler");
        C19383o.m32797g(pVar, "analyticsTracker");
        this.f20321c = cVar;
        this.f20322d = pVar;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        String url;
        Button button;
        String title;
        Button button2;
        NavigationalPageHeader navigationalPageHeader = (NavigationalPageHeader) obj;
        C19383o.m32797g(navigationalPageHeader, "navigationalPage");
        TextView textView = this.f20323e;
        if (textView != null) {
            textView.setText(navigationalPageHeader.getTitle());
        }
        DeepLink deepLink = navigationalPageHeader.getDeepLink();
        if (!(deepLink == null || (title = deepLink.getTitle()) == null || (button2 = this.f20324f) == null)) {
            button2.setText(title);
        }
        DeepLink deepLink2 = navigationalPageHeader.getDeepLink();
        if (deepLink2 != null && (url = deepLink2.getUrl()) != null && (button = this.f20324f) != null) {
            button.setOnClickListener(new C9203o0(this, 0, url, navigationalPageHeader));
        }
    }

    /* renamed from: b */
    public final void mo31374b() {
        this.f20323e = null;
        this.f20324f = null;
    }
}
