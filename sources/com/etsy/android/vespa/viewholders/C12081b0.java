package com.etsy.android.vespa.viewholders;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.p013v4.media.session.C0087d;
import android.view.View;
import android.view.ViewGroup;
import com.appboy.p043ui.widget.C4955a;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.cardviewelement.SectionFooter;
import com.etsy.android.lib.models.cardviewelement.TooltipButton;
import com.etsy.android.p327ui.cardview.clickhandlers.C9143x;
import com.etsy.android.stylekit.views.CollageButton;
import kotlin.jvm.internal.C19383o;
import p260v0.C8184a;
import p415of.C13171a;
import p504ai.C13983i;
import p628nj.C18263b;

/* renamed from: com.etsy.android.vespa.viewholders.b0 */
public final class C12081b0 extends C12086e<SectionFooter> {

    /* renamed from: d */
    public static final /* synthetic */ int f26950d = 0;

    /* renamed from: c */
    public final C13171a<TooltipButton> f26951c;

    public C12081b0(ViewGroup viewGroup, C9143x xVar) {
        super(C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.list_item_section_footer, viewGroup, false));
        this.f26951c = xVar;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        SectionFooter sectionFooter = (SectionFooter) obj;
        C19383o.m32797g(sectionFooter, "data");
        View view = this.itemView;
        CollageButton collageButton = (CollageButton) view.findViewById(R.id.tooltip_button);
        TooltipButton tooltipButton = sectionFooter.getTooltipButton();
        String str = null;
        collageButton.setText(tooltipButton != null ? tooltipButton.getTitle() : null);
        TooltipButton tooltipButton2 = sectionFooter.getTooltipButton();
        if (C18263b.m30839d0(tooltipButton2 != null ? tooltipButton2.getIconName() : null)) {
            Context context = view.getContext();
            Resources resources = view.getContext().getResources();
            TooltipButton tooltipButton3 = sectionFooter.getTooltipButton();
            if (tooltipButton3 != null) {
                str = tooltipButton3.getIconName();
            }
            int identifier = resources.getIdentifier(str, "drawable", view.getContext().getPackageName());
            Object obj2 = C8184a.f17966a;
            Drawable b = C8184a.C8187c.m16466b(context, identifier);
            if (b != null) {
                b.setBounds(0, 0, C0087d.m233b(view, R.dimen.clg_icon_size_smaller), C0087d.m233b(view, R.dimen.clg_icon_size_smaller));
            }
            collageButton.setIcon(b);
            collageButton.setIconPadding(view.getContext().getResources().getDimensionPixelSize(R.dimen.clg_space_4));
            collageButton.setIconGravity(3);
        }
        collageButton.setOnClickListener(new C4955a(1, sectionFooter, this));
    }
}
