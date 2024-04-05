package p364hf;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.etsy.android.uikit.util.HardwareAnimatorListener;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: hf.b */
public final class C12826b {

    /* renamed from: a */
    public final View f28306a;

    /* renamed from: b */
    public ObjectAnimator f28307b;

    /* renamed from: c */
    public ArrayList<C12827a> f28308c = new ArrayList<>();

    /* renamed from: d */
    public long f28309d = 300;

    /* renamed from: e */
    public long f28310e = 0;

    /* renamed from: f */
    public HardwareAnimatorListener f28311f;

    /* renamed from: g */
    public TimeInterpolator f28312g;

    /* renamed from: hf.b$a */
    public static class C12827a {

        /* renamed from: a */
        public final int f28313a;

        /* renamed from: b */
        public final PropertyValuesHolder f28314b;

        public C12827a(int i, PropertyValuesHolder propertyValuesHolder) {
            this.f28313a = i;
            this.f28314b = propertyValuesHolder;
        }
    }

    public C12826b(View view) {
        this.f28306a = view;
        this.f28311f = new HardwareAnimatorListener(view);
        this.f28312g = new AccelerateDecelerateInterpolator();
    }

    /* renamed from: a */
    public final void mo45610a() {
        ObjectAnimator objectAnimator;
        if (this.f28308c.isEmpty()) {
            objectAnimator = null;
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<C12827a> it = this.f28308c.iterator();
            while (it.hasNext()) {
                C12827a next = it.next();
                int i = next.f28313a;
                if (i == 0) {
                    this.f28306a.setAlpha(0.0f);
                } else if (i == 1) {
                    this.f28306a.setAlpha(1.0f);
                } else if (i == 3) {
                    next.f28314b.setFloatValues(new float[]{(float) (-this.f28306a.getHeight())});
                } else if (i == 4) {
                    next.f28314b.setFloatValues(new float[]{(float) this.f28306a.getHeight()});
                } else if (i == 9) {
                    arrayList2.add(new C12825a(this));
                }
                PropertyValuesHolder propertyValuesHolder = next.f28314b;
                if (propertyValuesHolder != null) {
                    arrayList.add(propertyValuesHolder);
                }
            }
            if (!arrayList.isEmpty()) {
                this.f28307b = ObjectAnimator.ofPropertyValuesHolder(this.f28306a, (PropertyValuesHolder[]) arrayList.toArray(new PropertyValuesHolder[arrayList.size()]));
            } else {
                ObjectAnimator objectAnimator2 = new ObjectAnimator();
                this.f28307b = objectAnimator2;
                objectAnimator2.setTarget(this.f28306a);
            }
            this.f28307b.setDuration(this.f28309d);
            this.f28307b.setStartDelay(this.f28310e);
            this.f28307b.addListener(this.f28311f);
            this.f28307b.setInterpolator(this.f28312g);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                this.f28307b.addUpdateListener((ValueAnimator.AnimatorUpdateListener) it2.next());
            }
            objectAnimator = this.f28307b;
        }
        if (objectAnimator != null) {
            objectAnimator.start();
        }
    }
}
