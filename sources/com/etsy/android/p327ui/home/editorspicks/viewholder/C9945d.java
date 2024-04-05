package com.etsy.android.p327ui.home.editorspicks.viewholder;

import androidx.viewpager.widget.ViewPager;
import com.etsy.android.lib.logger.AnalyticsProperty;
import java.util.Map;
import p442sc.C13371a;

/* renamed from: com.etsy.android.ui.home.editorspicks.viewholder.d */
public final class C9945d implements ViewPager.C3334i {

    /* renamed from: b */
    public final /* synthetic */ C9950i f21920b;

    /* renamed from: c */
    public final /* synthetic */ C9948g f21921c;

    public C9945d(C9948g gVar, C9950i iVar) {
        this.f21920b = iVar;
        this.f21921c = gVar;
    }

    public final void onPageScrollStateChanged(int i) {
        if (i == 2) {
            C13371a aVar = this.f21921c.f21926d;
            if (!aVar.f29298d) {
                aVar.f29298d = true;
                aVar.f28980b.mo21333d("carousel_scrolled", (Map<? extends AnalyticsProperty, Object>) null);
            }
        }
    }

    public final void onPageScrolled(int i, float f, int i2) {
    }

    public final void onPageSelected(int i) {
        this.f21920b.f21942f = i;
    }
}
