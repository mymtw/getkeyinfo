package p597jl;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.RectF;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.ArrayList;
import java.util.List;
import p597jl.C18036w;
import p629nk.C18268a;
import p712xk.C18787a;

/* renamed from: jl.m */
public abstract class C18026m<P extends C18036w> extends Visibility {
    private final List<C18036w> additionalAnimatorProviders = new ArrayList();
    private final P primaryAnimatorProvider;
    private C18036w secondaryAnimatorProvider;

    public C18026m(P p, C18036w wVar) {
        this.primaryAnimatorProvider = p;
        this.secondaryAnimatorProvider = wVar;
    }

    private static void addAnimatorIfNeeded(List<Animator> list, C18036w wVar, ViewGroup viewGroup, View view, boolean z) {
        if (wVar != null) {
            Animator b = z ? wVar.mo69585b(viewGroup, view) : wVar.mo69584a(viewGroup, view);
            if (b != null) {
                list.add(b);
            }
        }
    }

    private Animator createAnimator(ViewGroup viewGroup, View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        addAnimatorIfNeeded(arrayList, this.primaryAnimatorProvider, viewGroup, view, z);
        addAnimatorIfNeeded(arrayList, this.secondaryAnimatorProvider, viewGroup, view, z);
        for (C18036w addAnimatorIfNeeded : this.additionalAnimatorProviders) {
            addAnimatorIfNeeded(arrayList, addAnimatorIfNeeded, viewGroup, view, z);
        }
        maybeApplyThemeValues(viewGroup.getContext(), z);
        C15588c1.m25289K0(animatorSet, arrayList);
        return animatorSet;
    }

    private void maybeApplyThemeValues(Context context, boolean z) {
        int c;
        int durationThemeAttrResId = getDurationThemeAttrResId(z);
        RectF rectF = C18035v.f39454a;
        if (!(durationThemeAttrResId == 0 || getDuration() != -1 || (c = C18787a.m31705c(durationThemeAttrResId, context, -1)) == -1)) {
            setDuration((long) c);
        }
        int easingThemeAttrResId = getEasingThemeAttrResId(z);
        TimeInterpolator defaultEasingInterpolator = getDefaultEasingInterpolator(z);
        if (easingThemeAttrResId != 0 && getInterpolator() == null) {
            setInterpolator(C18787a.m31706d(context, easingThemeAttrResId, defaultEasingInterpolator));
        }
    }

    public void addAdditionalAnimatorProvider(C18036w wVar) {
        this.additionalAnimatorProviders.add(wVar);
    }

    public void clearAdditionalAnimatorProvider() {
        this.additionalAnimatorProviders.clear();
    }

    public TimeInterpolator getDefaultEasingInterpolator(boolean z) {
        return C18268a.f40092b;
    }

    public int getDurationThemeAttrResId(boolean z) {
        return 0;
    }

    public int getEasingThemeAttrResId(boolean z) {
        return 0;
    }

    public P getPrimaryAnimatorProvider() {
        return this.primaryAnimatorProvider;
    }

    public C18036w getSecondaryAnimatorProvider() {
        return this.secondaryAnimatorProvider;
    }

    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return createAnimator(viewGroup, view, true);
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return createAnimator(viewGroup, view, false);
    }

    public boolean removeAdditionalAnimatorProvider(C18036w wVar) {
        return this.additionalAnimatorProviders.remove(wVar);
    }

    public void setSecondaryAnimatorProvider(C18036w wVar) {
        this.secondaryAnimatorProvider = wVar;
    }
}
