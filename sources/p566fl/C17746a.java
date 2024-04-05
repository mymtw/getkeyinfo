package p566fl;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.material.tabs.C15456a;
import com.google.android.material.tabs.TabLayout;
import p629nk.C18268a;

/* renamed from: fl.a */
public final class C17746a extends C15456a {
    /* renamed from: b */
    public final void mo54884b(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float f2;
        float f3;
        RectF a = C15456a.m25053a(tabLayout, view);
        RectF a2 = C15456a.m25053a(tabLayout, view2);
        if (a.left < a2.left) {
            double d = (((double) f) * 3.141592653589793d) / 2.0d;
            f3 = (float) (1.0d - Math.cos(d));
            f2 = (float) Math.sin(d);
        } else {
            double d2 = (((double) f) * 3.141592653589793d) / 2.0d;
            f2 = (float) (1.0d - Math.cos(d2));
            f3 = (float) Math.sin(d2);
        }
        int i = (int) a.left;
        LinearInterpolator linearInterpolator = C18268a.f40091a;
        int round = Math.round(f3 * ((float) (((int) a2.left) - i))) + i;
        int i2 = drawable.getBounds().top;
        int i3 = (int) a.right;
        drawable.setBounds(round, i2, Math.round(f2 * ((float) (((int) a2.right) - i3))) + i3, drawable.getBounds().bottom);
    }
}
