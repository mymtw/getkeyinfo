package com.etsy.android.vespa.viewholders;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.ILink;
import com.etsy.android.lib.models.apiv3.ILinkCollection;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p423pf.C13232c;

/* renamed from: com.etsy.android.vespa.viewholders.i */
public class C12094i extends C12086e<ILinkCollection> {

    /* renamed from: c */
    public final C13232c f26977c;

    /* renamed from: d */
    public final ArrayList<ViewGroup> f26978d = new ArrayList<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12094i(ViewGroup viewGroup, C13232c cVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_deep_link_segment_list, viewGroup, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(cVar, "clickHandler");
        this.f26977c = cVar;
    }

    /* renamed from: g */
    public void mo38896g(LinearLayout linearLayout, ILink iLink) {
        C19383o.m32797g(iLink, "segment");
        TextView textView = (TextView) C0114h.m305j0(linearLayout, R.layout.view_explore_segment_chip, false);
        textView.setText(iLink.getTitle());
        Integer backgroundColor = iLink.getBackgroundColor();
        if (backgroundColor != null) {
            int intValue = backgroundColor.intValue();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius((float) textView.getContext().getResources().getDimensionPixelSize(R.dimen.clg_space_4));
            gradientDrawable.setColor(intValue);
            textView.setBackground(gradientDrawable);
        }
        ViewExtensions.m12866j(textView, new DeepLinkSegmentListViewHolder$addSegmentChip$1$2(this, iLink));
        linearLayout.addView(textView);
    }

    /* renamed from: h */
    public void mo19450a(ILinkCollection iLinkCollection) {
        C19383o.m32797g(iLinkCollection, "deepLinkSegmentList");
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.deep_link_segment_row_container);
        C19383o.m32795e(linearLayout, "null cannot be cast to non-null type android.widget.LinearLayout");
        linearLayout.removeAllViews();
        this.f26978d.clear();
        String title = iLinkCollection.getTitle();
        int numberOfRows = iLinkCollection.getNumberOfRows();
        List<? extends ILink> links = iLinkCollection.getLinks();
        TextView textView = (TextView) this.itemView.findViewById(R.id.deep_link_segment_list_title);
        textView.setText(title);
        textView.setVisibility(TextUtils.isEmpty(title) ? 8 : 0);
        int ceil = (int) Math.ceil(((double) links.size()) / ((double) numberOfRows));
        for (int i = 0; i < numberOfRows; i++) {
            View j0 = C0114h.m305j0(linearLayout, R.layout.explore_segment_list_row, false);
            LinearLayout linearLayout2 = (LinearLayout) j0.findViewById(R.id.chips_container);
            this.f26978d.add(linearLayout2);
            int i2 = i * ceil;
            for (ILink g : links.subList(i2, Math.min(i2 + ceil, links.size()))) {
                C19383o.m32796f(linearLayout2, "chipsContainer");
                mo38896g(linearLayout2, g);
            }
            linearLayout.addView(j0);
        }
        this.itemView.requestLayout();
    }
}
