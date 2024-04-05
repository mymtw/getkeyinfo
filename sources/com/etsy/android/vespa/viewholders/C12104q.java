package com.etsy.android.vespa.viewholders;

import android.animation.PropertyValuesHolder;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.OvershootInterpolator;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.Banner;
import com.etsy.android.lib.models.apiv3.vespa.CardActionableItem;
import com.etsy.android.uikit.util.C11914o;
import com.google.logging.type.LogSeverity;
import p364hf.C12826b;
import p423pf.C13230a;

/* renamed from: com.etsy.android.vespa.viewholders.q */
public final class C12104q extends C12076a {

    /* renamed from: com.etsy.android.vespa.viewholders.q$a */
    public class C12105a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b */
        public final /* synthetic */ ViewTreeObserver f26999b;

        public C12105a(ViewTreeObserver viewTreeObserver) {
            this.f26999b = viewTreeObserver;
        }

        public final void onGlobalLayout() {
            C11914o.m19630b(this.f26999b, this);
            if (C12104q.this.f26938g.getMeasuredHeight() > C12104q.this.f26934c.getMeasuredHeight()) {
                ViewGroup.LayoutParams layoutParams = C12104q.this.f26934c.getLayoutParams();
                layoutParams.height = C12104q.this.f26938g.getMeasuredHeight();
                C12104q.this.f26934c.setLayoutParams(layoutParams);
            }
        }
    }

    public C12104q(ViewGroup viewGroup, C13230a aVar) {
        super(viewGroup, aVar, R.layout.list_item_card_view_banner_icon);
    }

    /* renamed from: j */
    public final void mo38980j(String str) {
        if (Banner.ANIMATION_SLIDE_FROM_LEFT.equals(str)) {
            float f = (float) (-(this.f26938g.getWidth() * 2));
            this.f26938g.setTranslationX(f);
            C12826b bVar = new C12826b(this.f26938g);
            bVar.f28308c.add(new C12826b.C12827a(5, PropertyValuesHolder.ofFloat("translationX", new float[]{f, 0.0f})));
            bVar.f28309d = (long) LogSeverity.WARNING_VALUE;
            bVar.f28310e = (long) LogSeverity.CRITICAL_VALUE;
            bVar.f28312g = new OvershootInterpolator(1.0f);
            bVar.mo45610a();
        }
    }

    /* renamed from: k */
    public final void mo19450a(CardActionableItem cardActionableItem) {
        super.mo19450a(cardActionableItem);
        ViewTreeObserver viewTreeObserver = this.itemView.getViewTreeObserver();
        C11914o.m19629a(viewTreeObserver, new C12105a(viewTreeObserver));
    }
}
