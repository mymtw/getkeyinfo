package com.etsy.android.p327ui.home.editorspicks.viewholder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.OneShotPreDrawListener;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.stylekit.views.CollageBottomSheet;
import com.etsy.android.stylekit.views.pageindicator.LoopingCirclePageIndicator;
import com.etsy.android.uikit.ClickableViewPager;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;
import p442sc.C13371a;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.home.editorspicks.viewholder.g */
public final class C9948g extends C12086e<C9950i> {

    /* renamed from: c */
    public final ViewGroup f21925c;

    /* renamed from: d */
    public final C13371a f21926d;

    /* renamed from: e */
    public final ConstraintLayout f21927e;

    /* renamed from: f */
    public final TextView f21928f;

    /* renamed from: g */
    public final TextView f21929g;

    /* renamed from: h */
    public final Button f21930h;

    /* renamed from: i */
    public final CollageBottomSheet f21931i;

    /* renamed from: j */
    public final TextView f21932j;

    /* renamed from: k */
    public final TextView f21933k;

    /* renamed from: l */
    public final LoopingCirclePageIndicator f21934l;

    /* renamed from: m */
    public final ClickableViewPager f21935m;

    public C9948g(ViewGroup viewGroup, C13371a aVar) {
        super(C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.list_item_card_view_finds_hero_carousel, viewGroup, false));
        this.f21925c = viewGroup;
        this.f21926d = aVar;
        View findViewById = this.itemView.findViewById(R.id.root_container);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.root_container)");
        this.f21927e = (ConstraintLayout) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.title);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.title)");
        this.f21928f = (TextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.subtitle);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.id.subtitle)");
        this.f21929g = (TextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.keep_reading);
        C19383o.m32796f(findViewById4, "itemView.findViewById(R.id.keep_reading)");
        this.f21930h = (Button) findViewById4;
        Context context = this.itemView.getContext();
        C19383o.m32796f(context, "itemView.context");
        CollageBottomSheet collageBottomSheet = new CollageBottomSheet(context);
        collageBottomSheet.setContentView((int) R.layout.title_body_bottomsheet);
        this.f21931i = collageBottomSheet;
        this.f21932j = (TextView) collageBottomSheet.findViewById(R.id.bottomsheet_title);
        this.f21933k = (TextView) collageBottomSheet.findViewById(R.id.bottomsheet_body);
        View findViewById5 = this.itemView.findViewById(R.id.page_indicator);
        C19383o.m32796f(findViewById5, "itemView.findViewById(R.id.page_indicator)");
        this.f21934l = (LoopingCirclePageIndicator) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.hero_images_pager);
        C19383o.m32796f(findViewById6, "itemView.findViewById(R.id.hero_images_pager)");
        this.f21935m = (ClickableViewPager) findViewById6;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        C9950i iVar = (C9950i) obj;
        C19383o.m32797g(iVar, "data");
        ViewGroup.LayoutParams layoutParams = this.f21927e.getLayoutParams();
        C19383o.m32795e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(this.f21925c.getPaddingLeft() * -1, marginLayoutParams.topMargin, this.f21925c.getPaddingRight() * -1, marginLayoutParams.bottomMargin);
        ViewExtensions.m12870n(this.f21928f, new EditorsPicksHeroCarouselViewHolder$bind$1(iVar));
        this.f21928f.setText(iVar.f21938b);
        this.f21929g.setText(iVar.f21939c);
        Boolean bool = iVar.f21941e;
        if (bool != null) {
            mo33133g(bool);
        } else {
            TextView textView = this.f21929g;
            C19383o.m32796f(OneShotPreDrawListener.add(textView, new C9947f(textView, this, iVar)), "View.doOnPreDraw(\n    crossinline action: (view: View) -> Unit\n): OneShotPreDrawListener = OneShotPreDrawListener.add(this) { action(this) }");
        }
        ViewExtensions.m12866j(this.f21930h, new EditorsPicksHeroCarouselViewHolder$bind$2(this, iVar));
        this.f21935m.setAdapter(new LoopingPagerAdapter(iVar.f21940d, this.f21926d));
        this.f21935m.setCurrentItem(iVar.f21942f);
        this.f21935m.addOnPageChangeListener(this.f21934l);
        this.f21935m.addOnPageChangeListener(new C9945d(this, iVar));
        this.f21934l.setPagerCallback(new C9946e(iVar));
    }

    /* renamed from: g */
    public final void mo33133g(Boolean bool) {
        if (C19383o.m32792b(bool, Boolean.TRUE)) {
            ViewExtensions.m12869m(this.f21930h);
            this.f21927e.setPadding(0, 0, 0, this.f21925c.getResources().getDimensionPixelSize(R.dimen.clg_space_4));
            return;
        }
        ViewExtensions.m12860d(this.f21930h);
        this.f21927e.setPadding(0, 0, 0, this.f21925c.getResources().getDimensionPixelSize(R.dimen.clg_space_16));
    }
}
