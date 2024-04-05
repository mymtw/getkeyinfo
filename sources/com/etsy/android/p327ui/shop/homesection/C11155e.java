package com.etsy.android.p327ui.shop.homesection;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import androidx.viewpager.widget.ViewPager;
import com.etsy.android.R;
import com.etsy.android.lib.models.ShopAboutImage;
import com.etsy.android.lib.models.ShopAboutVideo;
import com.etsy.android.lib.util.C8914m;
import com.etsy.android.p327ui.shop.C11178m0;
import com.etsy.android.stylekit.views.pageindicator.LoopingCirclePageIndicator;
import com.etsy.android.uikit.adapter.C11840k;
import com.etsy.android.vespa.viewholders.C12086e;
import java.util.ArrayList;
import p460ue.C13491a;
import p487ya.C13895a;

/* renamed from: com.etsy.android.ui.shop.homesection.e */
public final class C11155e extends C12086e<C13491a> {

    /* renamed from: c */
    public final C11840k f24659c;

    /* renamed from: d */
    public final TextView f24660d;

    /* renamed from: e */
    public final LoopingCirclePageIndicator f24661e;

    /* renamed from: f */
    public final ViewPager f24662f;

    /* renamed from: g */
    public final C11178m0 f24663g;

    public C11155e(ViewGroup viewGroup, C11178m0 m0Var, C13895a aVar) {
        super(C0326j.m859c(viewGroup, R.layout.shop_home_about_images, viewGroup, false));
        ViewPager viewPager = (ViewPager) this.itemView.findViewById(R.id.viewpager);
        this.f24662f = viewPager;
        Context context = this.itemView.getContext();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        if (C8914m.f19669c == 0.0f) {
            C8914m.m17348f(context);
        }
        int dimensionPixelOffset = (C8914m.m17345c(this.itemView.getContext()) || C8914m.m17347e(this.itemView.getContext())) ? displayMetrics.widthPixels - (this.itemView.getResources().getDimensionPixelOffset(R.dimen.margin_large) * 2) : dimensionPixelOffset;
        int i = (int) ((((float) dimensionPixelOffset) * 9.0f) / 16.0f);
        ViewGroup.LayoutParams layoutParams = viewPager.getLayoutParams();
        layoutParams.width = dimensionPixelOffset;
        layoutParams.height = i;
        C11840k kVar = new C11840k((Activity) this.itemView.getContext(), aVar);
        kVar.f26326i = dimensionPixelOffset;
        kVar.f26327j = i;
        kVar.mo20188p();
        viewPager.setAdapter(kVar);
        this.f24659c = kVar;
        LoopingCirclePageIndicator loopingCirclePageIndicator = (LoopingCirclePageIndicator) this.itemView.findViewById(R.id.vp_indicator);
        this.f24661e = loopingCirclePageIndicator;
        loopingCirclePageIndicator.setPagerCallback(new C11152b(kVar));
        viewPager.addOnPageChangeListener(loopingCirclePageIndicator);
        this.f24660d = (TextView) this.itemView.findViewById(R.id.caption);
        this.f24663g = m0Var;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        C13491a aVar = (C13491a) obj;
        ArrayList<T> arrayList = new ArrayList<>();
        arrayList.addAll(aVar.f29521c.getImages());
        boolean z = true;
        if (arrayList.size() == 1) {
            this.f24661e.setVisibility(8);
        }
        C11840k kVar = this.f24659c;
        ShopAboutVideo firstReadyVideo = aVar.f29521c.getFirstReadyVideo();
        if (firstReadyVideo == null) {
            z = false;
        }
        kVar.f26325h = z;
        if (firstReadyVideo != null) {
            arrayList.add(0, firstReadyVideo.getThumbnail());
            kVar.f26323f = new C11153c(this, firstReadyVideo);
        }
        ArrayList<T> arrayList2 = kVar.f26322e;
        if (arrayList != arrayList2) {
            arrayList2.clear();
            kVar.f26322e.addAll(arrayList);
            kVar.mo20188p();
            TextView textView = this.f24660d;
            if (arrayList.get(0) instanceof ShopAboutImage) {
                String caption = ((ShopAboutImage) arrayList.get(0)).getCaption();
                if (caption == null) {
                    caption = "";
                }
                textView.setText(caption);
            }
            this.f24662f.addOnPageChangeListener(new C11154d(arrayList, textView));
        }
    }
}
