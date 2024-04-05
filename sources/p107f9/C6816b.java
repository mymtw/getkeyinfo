package p107f9;

import androidx.viewpager.widget.ViewPager;
import kotlin.C19394m;
import p753kq.C19857l;

/* renamed from: f9.b */
public final class C6816b implements ViewPager.C3334i {

    /* renamed from: b */
    public final /* synthetic */ C19857l<Integer, C19394m> f15002b;

    public C6816b(C19857l<? super Integer, C19394m> lVar) {
        this.f15002b = lVar;
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageScrolled(int i, float f, int i2) {
    }

    public final void onPageSelected(int i) {
        this.f15002b.invoke(Integer.valueOf(i));
    }
}
