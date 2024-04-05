package androidx.fragment.app;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.g0 */
public final class C2763g0 implements Transition.TransitionListener {

    /* renamed from: a */
    public final /* synthetic */ Object f6293a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f6294b;

    /* renamed from: c */
    public final /* synthetic */ Object f6295c = null;

    /* renamed from: d */
    public final /* synthetic */ ArrayList f6296d = null;

    /* renamed from: e */
    public final /* synthetic */ Object f6297e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList f6298f;

    /* renamed from: g */
    public final /* synthetic */ C2759f0 f6299g;

    public C2763g0(C2759f0 f0Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f6299g = f0Var;
        this.f6293a = obj;
        this.f6294b = arrayList;
        this.f6297e = obj2;
        this.f6298f = arrayList2;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
        Object obj = this.f6293a;
        if (obj != null) {
            this.f6299g.mo10554t(obj, this.f6294b, (ArrayList<View>) null);
        }
        Object obj2 = this.f6295c;
        if (obj2 != null) {
            this.f6299g.mo10554t(obj2, this.f6296d, (ArrayList<View>) null);
        }
        Object obj3 = this.f6297e;
        if (obj3 != null) {
            this.f6299g.mo10554t(obj3, this.f6298f, (ArrayList<View>) null);
        }
    }
}
