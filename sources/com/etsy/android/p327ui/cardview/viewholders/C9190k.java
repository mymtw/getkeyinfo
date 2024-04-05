package com.etsy.android.p327ui.cardview.viewholders;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.etsy.android.R;
import com.etsy.android.lib.core.img.GlideRequests;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.EditorialCard;
import com.etsy.android.lib.models.apiv3.Image;
import com.etsy.android.p327ui.util.ImageLoaderOnPreDrawListener;
import com.etsy.android.vespa.viewholders.C12086e;
import com.google.android.material.card.MaterialCardView;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p260v0.C8184a;
import p350fe.C12724a;
import p350fe.C12741o;
import p435rb.C13350a;
import p435rb.C13351b;
import p439rf.C13363b;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.cardview.viewholders.k */
public final class C9190k extends C12086e<EditorialCard> {

    /* renamed from: c */
    public final ViewGroup f20265c;

    /* renamed from: d */
    public final C8672b f20266d;

    /* renamed from: e */
    public final C12741o f20267e;

    /* renamed from: f */
    public final C12724a f20268f;

    /* renamed from: g */
    public final ConstraintLayout f20269g;

    /* renamed from: h */
    public final MaterialCardView f20270h;

    /* renamed from: i */
    public final TextView f20271i;

    /* renamed from: j */
    public final TextView f20272j;

    /* renamed from: k */
    public final TextView f20273k;

    /* renamed from: l */
    public final TextView f20274l;

    /* renamed from: m */
    public final ImageView f20275m;

    /* renamed from: n */
    public final ImageView f20276n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9190k(ViewGroup viewGroup, C8703p pVar, C12741o oVar, C12724a aVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_card_view_finds_editorial, viewGroup, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(pVar, "analyticsTracker");
        C19383o.m32797g(oVar, "routeInspector");
        C19383o.m32797g(aVar, "deepLinkEligibility");
        this.f20265c = viewGroup;
        this.f20266d = pVar;
        this.f20267e = oVar;
        this.f20268f = aVar;
        View findViewById = this.itemView.findViewById(R.id.root_constraints);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.root_constraints)");
        this.f20269g = (ConstraintLayout) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.card);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.card)");
        this.f20270h = (MaterialCardView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.header);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.id.header)");
        this.f20271i = (TextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.title);
        C19383o.m32796f(findViewById4, "itemView.findViewById(R.id.title)");
        this.f20272j = (TextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.body);
        C19383o.m32796f(findViewById5, "itemView.findViewById(R.id.body)");
        this.f20273k = (TextView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.call_to_action);
        C19383o.m32796f(findViewById6, "itemView.findViewById(R.id.call_to_action)");
        this.f20274l = (TextView) findViewById6;
        View findViewById7 = this.itemView.findViewById(R.id.foreground_image);
        C19383o.m32796f(findViewById7, "itemView.findViewById(R.id.foreground_image)");
        this.f20275m = (ImageView) findViewById7;
        View findViewById8 = this.itemView.findViewById(R.id.background_image);
        C19383o.m32796f(findViewById8, "itemView.findViewById(R.id.background_image)");
        this.f20276n = (ImageView) findViewById8;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        String backgroundImageColorDark;
        EditorialCard editorialCard = (EditorialCard) obj;
        this.f20272j.setText(editorialCard != null ? editorialCard.getTitle() : null);
        this.f20273k.setText(editorialCard != null ? editorialCard.getText() : null);
        if ((editorialCard != null ? editorialCard.getSubtitle() : null) != null) {
            this.f20271i.setVisibility(0);
            this.f20271i.setText(editorialCard.getSubtitle());
        } else {
            this.f20271i.setVisibility(8);
        }
        if ((editorialCard != null ? editorialCard.getBackgroundImage() : null) != null) {
            this.f20276n.setVisibility(0);
            this.f20276n.getLayoutParams().height = this.itemView.getResources().getDimensionPixelSize(R.dimen.styled_banner_background_height_large);
            Image backgroundImage = editorialCard.getBackgroundImage();
            ImageView imageView = this.f20276n;
            if (!(imageView == null || backgroundImage == null)) {
                ViewTreeObserver viewTreeObserver = this.itemView.getViewTreeObserver();
                View view = this.itemView;
                C19383o.m32796f(view, "itemView");
                viewTreeObserver.addOnPreDrawListener(new ImageLoaderOnPreDrawListener(backgroundImage, view, imageView, (C13363b) null, 8, (DefaultConstructorMarker) null));
            }
            ViewGroup.LayoutParams layoutParams = this.f20269g.getLayoutParams();
            C19383o.m32795e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(this.f20265c.getPaddingLeft() * -1, marginLayoutParams.topMargin, this.f20265c.getPaddingRight() * -1, marginLayoutParams.bottomMargin);
            String backgroundImageColorLight = editorialCard.getBackgroundImageColorLight();
            if (!(backgroundImageColorLight == null || (backgroundImageColorDark = editorialCard.getBackgroundImageColorDark()) == null)) {
                ImageView imageView2 = this.f20276n;
                imageView2.setColorFilter((ColorFilter) null);
                Context context = this.itemView.getContext();
                C19383o.m32796f(context, "itemView.context");
                int d = C13350a.m21013d(context, R.attr.clg_color_bg_edge);
                Configuration configuration = this.itemView.getContext().getResources().getConfiguration();
                C19383o.m32796f(configuration, "itemView.context.resources.configuration");
                if (C19382n.m32762o0(configuration) && C18263b.m30839d0(backgroundImageColorDark)) {
                    backgroundImageColorLight = backgroundImageColorDark;
                }
                try {
                    if (C18263b.m30839d0(backgroundImageColorLight)) {
                        d = Color.parseColor(backgroundImageColorLight);
                    }
                } catch (IllegalArgumentException unused) {
                }
                imageView2.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_ATOP));
            }
        } else {
            this.f20276n.setVisibility(8);
        }
        if ((editorialCard != null ? editorialCard.getImage() : null) != null) {
            this.f20275m.setVisibility(0);
            GlideRequests B0 = C0114h.m270B0(this.itemView.getContext());
            Image image = editorialCard.getImage();
            B0.load(image != null ? image.pickBestImageSource(this.itemView.getWidth(), 0) : null).mo46136d0().mo16816M(this.f20275m);
        } else {
            this.f20275m.setVisibility(8);
        }
        if (C18263b.m30839d0(editorialCard != null ? editorialCard.getUrl() : null)) {
            String url = editorialCard != null ? editorialCard.getUrl() : null;
            C19383o.m32794d(url);
            MaterialCardView materialCardView = this.f20270h;
            Context context2 = this.itemView.getContext();
            Object obj2 = C8184a.f17966a;
            materialCardView.setForeground(C8184a.C8187c.m16466b(context2, R.drawable.clg_touch_feedback));
            this.f20270h.setOnClickListener(new C9186j(this, 0, url, editorialCard));
        } else {
            this.f20270h.setForeground((Drawable) null);
            this.f20270h.setOnClickListener((View.OnClickListener) null);
        }
        if (C18263b.m30839d0(editorialCard != null ? editorialCard.getCta() : null)) {
            this.f20274l.setVisibility(0);
            this.f20274l.setText(editorialCard != null ? editorialCard.getCta() : null);
            C13351b.m21017a(this.f20274l, (Integer) null);
            return;
        }
        this.f20274l.setVisibility(8);
    }
}
