package com.etsy.android.p327ui.shop.viewholder;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.util.C8885d0;
import com.etsy.android.stylekit.views.C9064o;
import com.etsy.android.stylekit.views.CollageAlert;
import com.etsy.android.vespa.viewholders.C12086e;
import p452te.C13397f;

/* renamed from: com.etsy.android.ui.shop.viewholder.e0 */
public final class C11271e0 extends C12086e<C13397f> {

    /* renamed from: d */
    public static final /* synthetic */ int f24883d = 0;

    /* renamed from: c */
    public final CollageAlert f24884c = ((CollageAlert) this.itemView);

    public C11271e0(ViewGroup viewGroup) {
        super(C0326j.m859c(viewGroup, R.layout.shop_vacation_banner, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        C13397f fVar = (C13397f) obj;
        this.f24884c.setTitleText(fVar.f29341c);
        String str = fVar.f29342d;
        if (C8885d0.m17323g(str)) {
            this.f24884c.setBodyText(str, (Drawable) null);
        }
        if (!fVar.f29339a) {
            this.f24884c.setMainButtonText(fVar.f29340b.f24756p ? fVar.f29344f : fVar.f29343e);
        }
        if (!fVar.f29340b.f24756p) {
            this.f24884c.setMainButtonIconDrawableRes(R.drawable.clg_icon_core_email_v1);
        } else {
            this.f24884c.setMainButtonIconDrawable((Drawable) null);
        }
        if (fVar.f29345g) {
            this.f24884c.setMainButtonClickListener(new C9064o(fVar, 3));
        }
    }
}
