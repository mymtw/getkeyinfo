package com.etsy.android.p327ui.shop.homesection;

import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.etsy.android.lib.models.ShopAboutImage;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.etsy.android.ui.shop.homesection.d */
public final class C11154d implements ViewPager.C3334i {

    /* renamed from: b */
    public final /* synthetic */ List f24657b;

    /* renamed from: c */
    public final /* synthetic */ TextView f24658c;

    public C11154d(ArrayList arrayList, TextView textView) {
        this.f24657b = arrayList;
        this.f24658c = textView;
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageScrolled(int i, float f, int i2) {
    }

    public final void onPageSelected(int i) {
        String str = "";
        if (this.f24657b.get(i) instanceof ShopAboutImage) {
            String caption = ((ShopAboutImage) this.f24657b.get(i)).getCaption();
            TextView textView = this.f24658c;
            if (caption != null) {
                str = caption;
            }
            textView.setText(str);
            return;
        }
        this.f24658c.setText(str);
    }
}
