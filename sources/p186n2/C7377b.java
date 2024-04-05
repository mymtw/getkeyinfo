package p186n2;

import android.animation.AnimatorListenerAdapter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import java.util.WeakHashMap;

/* renamed from: n2.b */
public final class C7377b extends C7418m {

    /* renamed from: A */
    public static final C7379b f16493A = new C7379b(PointF.class);

    /* renamed from: B */
    public static final C7380c f16494B = new C7380c(PointF.class);

    /* renamed from: C */
    public static final C7381d f16495C = new C7381d(PointF.class);

    /* renamed from: D */
    public static final C7382e f16496D = new C7382e(PointF.class);

    /* renamed from: E */
    public static final C7383f f16497E = new C7383f(PointF.class);

    /* renamed from: z */
    public static final String[] f16498z = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: n2.b$a */
    public static class C7378a extends Property<Drawable, PointF> {

        /* renamed from: a */
        public Rect f16499a = new Rect();

        public C7378a(Class cls) {
            super(cls, "boundsOrigin");
        }

        public final Object get(Object obj) {
            ((Drawable) obj).copyBounds(this.f16499a);
            Rect rect = this.f16499a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        public final void set(Object obj, Object obj2) {
            Drawable drawable = (Drawable) obj;
            PointF pointF = (PointF) obj2;
            drawable.copyBounds(this.f16499a);
            this.f16499a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f16499a);
        }
    }

    /* renamed from: n2.b$b */
    public static class C7379b extends Property<C7386i, PointF> {
        public C7379b(Class cls) {
            super(cls, "topLeft");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            C7386i iVar = (C7386i) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            C7386i iVar = (C7386i) obj;
            PointF pointF = (PointF) obj2;
            iVar.getClass();
            iVar.f16502a = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            iVar.f16503b = round;
            int i = iVar.f16507f + 1;
            iVar.f16507f = i;
            if (i == iVar.f16508g) {
                C7439y.m14373a(iVar.f16506e, iVar.f16502a, round, iVar.f16504c, iVar.f16505d);
                iVar.f16507f = 0;
                iVar.f16508g = 0;
            }
        }
    }

    /* renamed from: n2.b$c */
    public static class C7380c extends Property<C7386i, PointF> {
        public C7380c(Class cls) {
            super(cls, "bottomRight");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            C7386i iVar = (C7386i) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            C7386i iVar = (C7386i) obj;
            PointF pointF = (PointF) obj2;
            iVar.getClass();
            iVar.f16504c = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            iVar.f16505d = round;
            int i = iVar.f16508g + 1;
            iVar.f16508g = i;
            if (iVar.f16507f == i) {
                C7439y.m14373a(iVar.f16506e, iVar.f16502a, iVar.f16503b, iVar.f16504c, round);
                iVar.f16507f = 0;
                iVar.f16508g = 0;
            }
        }
    }

    /* renamed from: n2.b$d */
    public static class C7381d extends Property<View, PointF> {
        public C7381d(Class cls) {
            super(cls, "bottomRight");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            C7439y.m14373a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: n2.b$e */
    public static class C7382e extends Property<View, PointF> {
        public C7382e(Class cls) {
            super(cls, "topLeft");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            C7439y.m14373a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: n2.b$f */
    public static class C7383f extends Property<View, PointF> {
        public C7383f(Class cls) {
            super(cls, "position");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C7439y.m14373a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: n2.b$g */
    public class C7384g extends AnimatorListenerAdapter {
        private C7386i mViewBounds;

        public C7384g(C7386i iVar) {
            this.mViewBounds = iVar;
        }
    }

    /* renamed from: n2.b$h */
    public class C7385h extends C7425p {

        /* renamed from: a */
        public boolean f16500a = false;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f16501b;

        public C7385h(ViewGroup viewGroup) {
            this.f16501b = viewGroup;
        }

        public final void onTransitionCancel(C7418m mVar) {
            C7437w.m14371a(this.f16501b, false);
            this.f16500a = true;
        }

        public final void onTransitionEnd(C7418m mVar) {
            if (!this.f16500a) {
                C7437w.m14371a(this.f16501b, false);
            }
            mVar.mo19793z(this);
        }

        public final void onTransitionPause(C7418m mVar) {
            C7437w.m14371a(this.f16501b, false);
        }

        public final void onTransitionResume(C7418m mVar) {
            C7437w.m14371a(this.f16501b, true);
        }
    }

    /* renamed from: n2.b$i */
    public static class C7386i {

        /* renamed from: a */
        public int f16502a;

        /* renamed from: b */
        public int f16503b;

        /* renamed from: c */
        public int f16504c;

        /* renamed from: d */
        public int f16505d;

        /* renamed from: e */
        public View f16506e;

        /* renamed from: f */
        public int f16507f;

        /* renamed from: g */
        public int f16508g;

        public C7386i(View view) {
            this.f16506e = view;
        }
    }

    static {
        new C7378a(PointF.class);
    }

    /* renamed from: M */
    public final void mo19718M(C7433t tVar) {
        View view = tVar.f16607b;
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        if (C2364y.C2371g.m5246c(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            tVar.f16606a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            tVar.f16606a.put("android:changeBounds:parent", tVar.f16607b.getParent());
        }
    }

    /* renamed from: d */
    public final void mo19719d(C7433t tVar) {
        mo19718M(tVar);
    }

    /* renamed from: i */
    public final void mo19720i(C7433t tVar) {
        mo19718M(tVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: android.animation.ObjectAnimator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator mo19721m(android.view.ViewGroup r19, p186n2.C7433t r20, p186n2.C7433t r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            if (r1 == 0) goto L_0x0139
            if (r2 != 0) goto L_0x000c
            goto L_0x0139
        L_0x000c:
            java.util.HashMap r4 = r1.f16606a
            java.util.HashMap r5 = r2.f16606a
            java.lang.String r6 = "android:changeBounds:parent"
            java.lang.Object r4 = r4.get(r6)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            java.lang.Object r5 = r5.get(r6)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r4 == 0) goto L_0x0137
            if (r5 != 0) goto L_0x0024
            goto L_0x0137
        L_0x0024:
            android.view.View r4 = r2.f16607b
            java.util.HashMap r5 = r1.f16606a
            java.lang.String r6 = "android:changeBounds:bounds"
            java.lang.Object r5 = r5.get(r6)
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            java.util.HashMap r7 = r2.f16606a
            java.lang.Object r6 = r7.get(r6)
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            int r7 = r5.left
            int r8 = r6.left
            int r9 = r5.top
            int r10 = r6.top
            int r11 = r5.right
            int r12 = r6.right
            int r5 = r5.bottom
            int r6 = r6.bottom
            int r13 = r11 - r7
            int r14 = r5 - r9
            int r15 = r12 - r8
            int r3 = r6 - r10
            java.util.HashMap r1 = r1.f16606a
            java.lang.String r0 = "android:changeBounds:clip"
            java.lang.Object r1 = r1.get(r0)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            java.util.HashMap r2 = r2.f16606a
            java.lang.Object r0 = r2.get(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r2 = 1
            if (r13 == 0) goto L_0x0067
            if (r14 != 0) goto L_0x006b
        L_0x0067:
            if (r15 == 0) goto L_0x007c
            if (r3 == 0) goto L_0x007c
        L_0x006b:
            if (r7 != r8) goto L_0x0073
            if (r9 == r10) goto L_0x0070
            goto L_0x0073
        L_0x0070:
            r16 = 0
            goto L_0x0075
        L_0x0073:
            r16 = r2
        L_0x0075:
            if (r11 != r12) goto L_0x0079
            if (r5 == r6) goto L_0x007e
        L_0x0079:
            int r16 = r16 + 1
            goto L_0x007e
        L_0x007c:
            r16 = 0
        L_0x007e:
            if (r1 == 0) goto L_0x0086
            boolean r17 = r1.equals(r0)
            if (r17 == 0) goto L_0x008a
        L_0x0086:
            if (r1 != 0) goto L_0x008c
            if (r0 == 0) goto L_0x008c
        L_0x008a:
            int r16 = r16 + 1
        L_0x008c:
            r0 = r16
            if (r0 <= 0) goto L_0x0133
            p186n2.C7439y.m14373a(r4, r7, r9, r11, r5)
            r1 = 2
            if (r0 != r1) goto L_0x00ef
            if (r13 != r15) goto L_0x00ae
            if (r14 != r3) goto L_0x00ae
            r0 = r18
            com.google.protobuf.l r1 = r0.f16580v
            float r3 = (float) r7
            float r5 = (float) r9
            float r6 = (float) r8
            float r7 = (float) r10
            android.graphics.Path r1 = r1.mo19794g(r3, r5, r6, r7)
            n2.b$f r3 = f16497E
            r5 = 0
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofObject(r4, r3, r5, r1)
            goto L_0x0119
        L_0x00ae:
            r0 = r18
            n2.b$i r3 = new n2.b$i
            r3.<init>(r4)
            com.google.protobuf.l r13 = r0.f16580v
            float r7 = (float) r7
            float r9 = (float) r9
            float r8 = (float) r8
            float r10 = (float) r10
            android.graphics.Path r7 = r13.mo19794g(r7, r9, r8, r10)
            n2.b$b r8 = f16493A
            r9 = 0
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofObject(r3, r8, r9, r7)
            com.google.protobuf.l r8 = r0.f16580v
            float r10 = (float) r11
            float r5 = (float) r5
            float r11 = (float) r12
            float r6 = (float) r6
            android.graphics.Path r5 = r8.mo19794g(r10, r5, r11, r6)
            n2.b$c r6 = f16494B
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofObject(r3, r6, r9, r5)
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            r8 = 0
            r1[r8] = r7
            r1[r2] = r5
            r6.playTogether(r1)
            n2.b$g r1 = new n2.b$g
            r1.<init>(r3)
            r6.addListener(r1)
            r1 = r6
            goto L_0x0119
        L_0x00ef:
            r0 = r18
            if (r7 != r8) goto L_0x0108
            if (r9 == r10) goto L_0x00f6
            goto L_0x0108
        L_0x00f6:
            com.google.protobuf.l r1 = r0.f16580v
            float r3 = (float) r11
            float r5 = (float) r5
            float r7 = (float) r12
            float r6 = (float) r6
            android.graphics.Path r1 = r1.mo19794g(r3, r5, r7, r6)
            n2.b$d r3 = f16495C
            r5 = 0
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofObject(r4, r3, r5, r1)
            goto L_0x0119
        L_0x0108:
            r5 = 0
            com.google.protobuf.l r1 = r0.f16580v
            float r3 = (float) r7
            float r6 = (float) r9
            float r7 = (float) r8
            float r8 = (float) r10
            android.graphics.Path r1 = r1.mo19794g(r3, r6, r7, r8)
            n2.b$e r3 = f16496D
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofObject(r4, r3, r5, r1)
        L_0x0119:
            android.view.ViewParent r3 = r4.getParent()
            boolean r3 = r3 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x0132
            android.view.ViewParent r3 = r4.getParent()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            p186n2.C7437w.m14371a(r3, r2)
            n2.b$h r2 = new n2.b$h
            r2.<init>(r3)
            r0.mo19776a(r2)
        L_0x0132:
            return r1
        L_0x0133:
            r0 = r18
            r1 = 0
            return r1
        L_0x0137:
            r1 = 0
            return r1
        L_0x0139:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p186n2.C7377b.mo19721m(android.view.ViewGroup, n2.t, n2.t):android.animation.Animator");
    }

    /* renamed from: t */
    public final String[] mo19722t() {
        return f16498z;
    }
}
