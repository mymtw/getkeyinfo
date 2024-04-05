package p629nk;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import android.util.Property;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.C0326j;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;
import p193o.C7506i;

/* renamed from: nk.b */
public final class C18269b {

    /* renamed from: a */
    public final C7506i<String, C18270c> f40096a = new C7506i<>();

    /* renamed from: b */
    public final C7506i<String, PropertyValuesHolder[]> f40097b = new C7506i<>();

    /* renamed from: a */
    public static C18269b m30885a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m30886b(context, resourceId);
    }

    /* renamed from: b */
    public static C18269b m30886b(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m30887c(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m30887c(arrayList);
        } catch (Exception e) {
            StringBuilder h = C0072d.m201h("Can't load animation resource ID #0x");
            h.append(Integer.toHexString(i));
            Log.w("MotionSpec", h.toString(), e);
            return null;
        }
    }

    /* renamed from: c */
    public static C18269b m30887c(ArrayList arrayList) {
        C18269b bVar = new C18269b();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Animator animator = (Animator) arrayList.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                bVar.mo69814h(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = C18268a.f40092b;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = C18268a.f40093c;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = C18268a.f40094d;
                }
                C18270c cVar = new C18270c(startDelay, duration, interpolator);
                cVar.f40101d = objectAnimator.getRepeatCount();
                cVar.f40102e = objectAnimator.getRepeatMode();
                bVar.f40096a.put(propertyName, cVar);
                i++;
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return bVar;
    }

    /* renamed from: d */
    public final ObjectAnimator mo69809d(String str, ExtendedFloatingActionButton extendedFloatingActionButton, Property property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(extendedFloatingActionButton, mo69810e(str));
        ofPropertyValuesHolder.setProperty(property);
        mo69812f(str).mo69817a(ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    /* renamed from: e */
    public final PropertyValuesHolder[] mo69810e(String str) {
        if (mo69813g(str)) {
            PropertyValuesHolder[] orDefault = this.f40097b.getOrDefault(str, null);
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[orDefault.length];
            for (int i = 0; i < orDefault.length; i++) {
                propertyValuesHolderArr[i] = orDefault[i].clone();
            }
            return propertyValuesHolderArr;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18269b)) {
            return false;
        }
        return this.f40096a.equals(((C18269b) obj).f40096a);
    }

    /* renamed from: f */
    public final C18270c mo69812f(String str) {
        if (this.f40096a.getOrDefault(str, null) != null) {
            return this.f40096a.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: g */
    public final boolean mo69813g(String str) {
        return this.f40097b.getOrDefault(str, null) != null;
    }

    /* renamed from: h */
    public final void mo69814h(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f40097b.put(str, propertyValuesHolderArr);
    }

    public final int hashCode() {
        return this.f40096a.hashCode();
    }

    public final String toString() {
        StringBuilder k = C0326j.m866k(10);
        k.append(C18269b.class.getName());
        k.append('{');
        k.append(Integer.toHexString(System.identityHashCode(this)));
        k.append(" timings: ");
        k.append(this.f40096a);
        k.append("}\n");
        return k.toString();
    }
}
