package p186n2;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import java.util.WeakHashMap;

/* renamed from: n2.l */
public final class C7408l extends C7398f0 {

    /* renamed from: C */
    public static final DecelerateInterpolator f16548C = new DecelerateInterpolator();

    /* renamed from: D */
    public static final AccelerateInterpolator f16549D = new AccelerateInterpolator();

    /* renamed from: E */
    public static final C7409a f16550E = new C7409a();

    /* renamed from: F */
    public static final C7410b f16551F = new C7410b();

    /* renamed from: G */
    public static final C7411c f16552G = new C7411c();

    /* renamed from: H */
    public static final C7412d f16553H = new C7412d();

    /* renamed from: I */
    public static final C7413e f16554I = new C7413e();

    /* renamed from: J */
    public static final C7414f f16555J = new C7414f();

    /* renamed from: B */
    public C7415g f16556B = f16555J;

    /* renamed from: n2.l$a */
    public static class C7409a extends C7416h {
        /* renamed from: b */
        public final float mo19763b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: n2.l$b */
    public static class C7410b extends C7416h {
        /* renamed from: b */
        public final float mo19763b(ViewGroup viewGroup, View view) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            boolean z = true;
            if (C2364y.C2369e.m5233d(viewGroup) != 1) {
                z = false;
            }
            return z ? view.getTranslationX() + ((float) viewGroup.getWidth()) : view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: n2.l$c */
    public static class C7411c extends C7417i {
        /* renamed from: a */
        public final float mo19764a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - ((float) viewGroup.getHeight());
        }
    }

    /* renamed from: n2.l$d */
    public static class C7412d extends C7416h {
        /* renamed from: b */
        public final float mo19763b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: n2.l$e */
    public static class C7413e extends C7416h {
        /* renamed from: b */
        public final float mo19763b(ViewGroup viewGroup, View view) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            boolean z = true;
            if (C2364y.C2369e.m5233d(viewGroup) != 1) {
                z = false;
            }
            return z ? view.getTranslationX() - ((float) viewGroup.getWidth()) : view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: n2.l$f */
    public static class C7414f extends C7417i {
        /* renamed from: a */
        public final float mo19764a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + ((float) viewGroup.getHeight());
        }
    }

    /* renamed from: n2.l$g */
    public interface C7415g {
        /* renamed from: a */
        float mo19764a(ViewGroup viewGroup, View view);

        /* renamed from: b */
        float mo19763b(ViewGroup viewGroup, View view);
    }

    /* renamed from: n2.l$h */
    public static abstract class C7416h implements C7415g {
        /* renamed from: a */
        public final float mo19764a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    /* renamed from: n2.l$i */
    public static abstract class C7417i implements C7415g {
        /* renamed from: b */
        public final float mo19763b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    public C7408l() {
        mo19762Q(80);
    }

    /* renamed from: O */
    public final Animator mo19741O(ViewGroup viewGroup, View view, C7433t tVar, C7433t tVar2) {
        if (tVar2 == null) {
            return null;
        }
        int[] iArr = (int[]) tVar2.f16606a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return C7435v.m14370a(view, tVar2, iArr[0], iArr[1], this.f16556B.mo19763b(viewGroup, view), this.f16556B.mo19764a(viewGroup, view), translationX, translationY, f16548C, this);
    }

    /* renamed from: P */
    public final Animator mo19742P(ViewGroup viewGroup, View view, C7433t tVar) {
        if (tVar == null) {
            return null;
        }
        int[] iArr = (int[]) tVar.f16606a.get("android:slide:screenPosition");
        return C7435v.m14370a(view, tVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f16556B.mo19763b(viewGroup, view), this.f16556B.mo19764a(viewGroup, view), f16549D, this);
    }

    /* renamed from: Q */
    public final void mo19762Q(int i) {
        if (i == 3) {
            this.f16556B = f16550E;
        } else if (i == 5) {
            this.f16556B = f16553H;
        } else if (i == 48) {
            this.f16556B = f16552G;
        } else if (i == 80) {
            this.f16556B = f16555J;
        } else if (i == 8388611) {
            this.f16556B = f16551F;
        } else if (i == 8388613) {
            this.f16556B = f16554I;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        C7407k kVar = new C7407k();
        kVar.f16547c = i;
        this.f16578t = kVar;
    }

    /* renamed from: d */
    public final void mo19719d(C7433t tVar) {
        mo19751M(tVar);
        int[] iArr = new int[2];
        tVar.f16607b.getLocationOnScreen(iArr);
        tVar.f16606a.put("android:slide:screenPosition", iArr);
    }

    /* renamed from: i */
    public final void mo19720i(C7433t tVar) {
        mo19751M(tVar);
        int[] iArr = new int[2];
        tVar.f16607b.getLocationOnScreen(iArr);
        tVar.f16606a.put("android:slide:screenPosition", iArr);
    }

    public C7408l(int i) {
        mo19762Q(80);
    }
}
