package com.etsy.android.p327ui.cardview.viewholders;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.ExploreBanner;
import com.etsy.android.lib.models.apiv3.Image;
import com.etsy.android.p327ui.cardview.clickhandlers.C9118c;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;
import p415of.C13186o;

/* renamed from: com.etsy.android.ui.cardview.viewholders.n */
public final class C9199n extends C12086e<C13186o> {

    /* renamed from: c */
    public final C9118c f20301c;

    /* renamed from: d */
    public TextView f20302d;

    /* renamed from: e */
    public TextView f20303e;

    /* renamed from: f */
    public ImageView f20304f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9199n(ViewGroup viewGroup, C9118c cVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_explore_banner, viewGroup, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(cVar, "clickHandler");
        this.f20301c = cVar;
        TextView textView = (TextView) this.itemView.findViewById(R.id.explore_banner_title);
        C19383o.m32796f(textView, "itemView.explore_banner_title");
        this.f20302d = textView;
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.explore_banner_subtitle);
        C19383o.m32796f(textView2, "itemView.explore_banner_subtitle");
        this.f20303e = textView2;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.explore_banner_image);
        C19383o.m32796f(imageView, "itemView.explore_banner_image");
        this.f20304f = imageView;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        C13186o oVar = (C13186o) obj;
        C19383o.m32797g(oVar, "data");
        ExploreBanner exploreBanner = (ExploreBanner) oVar;
        this.f20302d.setText(exploreBanner.getTitle());
        this.f20302d.setTextColor(exploreBanner.getTitleColor());
        this.f20303e.setText(exploreBanner.getSubtitle());
        this.f20303e.setTextColor(exploreBanner.getSubtitleColor());
        TextView textView = this.f20303e;
        String subtitle = exploreBanner.getSubtitle();
        int i = 0;
        if (subtitle == null || subtitle.length() == 0) {
            i = 8;
        }
        textView.setVisibility(i);
        Image image = exploreBanner.getImage();
        if (image != null) {
            ViewExtensions.m12869m(this.f20304f);
            C0114h.m270B0(this.itemView.getContext()).load(image.pickBestImageSource(this.f20304f.getMeasuredWidth(), this.f20304f.getMeasuredHeight())).mo16816M(this.f20304f);
        } else {
            ViewExtensions.m12860d(this.f20304f);
        }
        this.itemView.setClipToOutline(true);
        Drawable background = this.itemView.getBackground();
        C19383o.m32796f(background, "itemView.background");
        int backgroundColor = exploreBanner.getBackgroundColor();
        if (background instanceof ShapeDrawable) {
            ((ShapeDrawable) background).getPaint().setColor(backgroundColor);
        } else if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(backgroundColor);
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background).setColor(backgroundColor);
        }
        this.itemView.setOnClickListener(new C9196m(this, exploreBanner));
    }
}
