package p590il;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.etsy.android.R;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.ArrayList;
import java.util.Iterator;
import p186n2.C7398f0;
import p186n2.C7433t;
import p590il.C17866m;
import p629nk.C18268a;
import p712xk.C18787a;

/* renamed from: il.f */
public abstract class C17859f<P extends C17866m> extends C7398f0 {

    /* renamed from: B */
    public final P f38776B;

    /* renamed from: C */
    public C17866m f38777C;

    /* renamed from: D */
    public final ArrayList f38778D = new ArrayList();

    public C17859f(P p, C17866m mVar) {
        this.f38776B = p;
        this.f38777C = mVar;
    }

    /* renamed from: Q */
    public static void m29986Q(ArrayList arrayList, C17866m mVar, ViewGroup viewGroup, View view, boolean z) {
        if (mVar != null) {
            Animator b = z ? mVar.mo69086b(viewGroup, view) : mVar.mo69085a(viewGroup, view);
            if (b != null) {
                arrayList.add(b);
            }
        }
    }

    /* renamed from: O */
    public final Animator mo19741O(ViewGroup viewGroup, View view, C7433t tVar, C7433t tVar2) {
        return mo69089R(viewGroup, view, true);
    }

    /* renamed from: P */
    public final Animator mo19742P(ViewGroup viewGroup, View view, C7433t tVar) {
        return mo69089R(viewGroup, view, false);
    }

    /* renamed from: R */
    public final AnimatorSet mo69089R(ViewGroup viewGroup, View view, boolean z) {
        int c;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        m29986Q(arrayList, this.f38776B, viewGroup, view, z);
        m29986Q(arrayList, this.f38777C, viewGroup, view, z);
        Iterator it = this.f38778D.iterator();
        while (it.hasNext()) {
            m29986Q(arrayList, (C17866m) it.next(), viewGroup, view, z);
        }
        Context context = viewGroup.getContext();
        mo69087T();
        int i = C17865l.f38790a;
        if (this.f16562d == -1 && (c = C18787a.m31705c(R.attr.motionDurationLong1, context, -1)) != -1) {
            this.f16562d = (long) c;
        }
        mo69088U();
        FastOutSlowInInterpolator fastOutSlowInInterpolator = C18268a.f40092b;
        if (this.f16563e == null) {
            this.f16563e = C18787a.m31706d(context, R.attr.motionEasingStandard, fastOutSlowInInterpolator);
        }
        C15588c1.m25289K0(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: T */
    public abstract void mo69087T();

    /* renamed from: U */
    public abstract void mo69088U();
}
