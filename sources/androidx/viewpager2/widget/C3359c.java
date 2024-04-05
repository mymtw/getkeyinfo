package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: androidx.viewpager2.widget.c */
public final class C3359c extends ViewPager2.C3349i {

    /* renamed from: a */
    public final ArrayList f7821a = new ArrayList(3);

    /* renamed from: a */
    public final void mo12762a(int i) {
        try {
            Iterator it = this.f7821a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.C3349i) it.next()).mo12762a(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    /* renamed from: b */
    public final void mo12781b(int i, float f, int i2) {
        try {
            Iterator it = this.f7821a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.C3349i) it.next()).mo12781b(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    /* renamed from: c */
    public final void mo12763c(int i) {
        try {
            Iterator it = this.f7821a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.C3349i) it.next()).mo12763c(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }
}
