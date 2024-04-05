package p166l1;

import android.view.View;
import java.util.ArrayList;
import p166l1.C7212a;
import p166l1.C7218b;

/* renamed from: l1.b */
public abstract class C7218b<T extends C7218b<T>> implements C7212a.C7214b {

    /* renamed from: l */
    public static final C7221c f16017l = new C7221c();

    /* renamed from: m */
    public static final C7222d f16018m = new C7222d();

    /* renamed from: n */
    public static final C7223e f16019n = new C7223e();

    /* renamed from: o */
    public static final C7224f f16020o = new C7224f();

    /* renamed from: p */
    public static final C7225g f16021p = new C7225g();

    /* renamed from: q */
    public static final C7226h f16022q = new C7226h();

    /* renamed from: r */
    public static final C7227i f16023r = new C7227i();

    /* renamed from: s */
    public static final C7219a f16024s = new C7219a();

    /* renamed from: t */
    public static final C7220b f16025t = new C7220b();

    /* renamed from: a */
    public float f16026a = 0.0f;

    /* renamed from: b */
    public float f16027b = Float.MAX_VALUE;

    /* renamed from: c */
    public boolean f16028c = false;

    /* renamed from: d */
    public final Object f16029d;

    /* renamed from: e */
    public final C7232c f16030e;

    /* renamed from: f */
    public boolean f16031f = false;

    /* renamed from: g */
    public float f16032g = -3.4028235E38f;

    /* renamed from: h */
    public long f16033h = 0;

    /* renamed from: i */
    public float f16034i;

    /* renamed from: j */
    public final ArrayList<C7229k> f16035j = new ArrayList<>();

    /* renamed from: k */
    public final ArrayList<C7230l> f16036k = new ArrayList<>();

    /* renamed from: l1.b$a */
    public static class C7219a extends C7231m {
        /* renamed from: a */
        public final float mo19502a(Object obj) {
            return ((View) obj).getY();
        }

        /* renamed from: b */
        public final void mo19503b(float f, Object obj) {
            ((View) obj).setY(f);
        }
    }

    /* renamed from: l1.b$b */
    public static class C7220b extends C7231m {
        /* renamed from: a */
        public final float mo19502a(Object obj) {
            return ((View) obj).getAlpha();
        }

        /* renamed from: b */
        public final void mo19503b(float f, Object obj) {
            ((View) obj).setAlpha(f);
        }
    }

    /* renamed from: l1.b$c */
    public static class C7221c extends C7231m {
        /* renamed from: a */
        public final float mo19502a(Object obj) {
            return ((View) obj).getTranslationY();
        }

        /* renamed from: b */
        public final void mo19503b(float f, Object obj) {
            ((View) obj).setTranslationY(f);
        }
    }

    /* renamed from: l1.b$d */
    public static class C7222d extends C7231m {
        /* renamed from: a */
        public final float mo19502a(Object obj) {
            return ((View) obj).getScaleX();
        }

        /* renamed from: b */
        public final void mo19503b(float f, Object obj) {
            ((View) obj).setScaleX(f);
        }
    }

    /* renamed from: l1.b$e */
    public static class C7223e extends C7231m {
        /* renamed from: a */
        public final float mo19502a(Object obj) {
            return ((View) obj).getScaleY();
        }

        /* renamed from: b */
        public final void mo19503b(float f, Object obj) {
            ((View) obj).setScaleY(f);
        }
    }

    /* renamed from: l1.b$f */
    public static class C7224f extends C7231m {
        /* renamed from: a */
        public final float mo19502a(Object obj) {
            return ((View) obj).getRotation();
        }

        /* renamed from: b */
        public final void mo19503b(float f, Object obj) {
            ((View) obj).setRotation(f);
        }
    }

    /* renamed from: l1.b$g */
    public static class C7225g extends C7231m {
        /* renamed from: a */
        public final float mo19502a(Object obj) {
            return ((View) obj).getRotationX();
        }

        /* renamed from: b */
        public final void mo19503b(float f, Object obj) {
            ((View) obj).setRotationX(f);
        }
    }

    /* renamed from: l1.b$h */
    public static class C7226h extends C7231m {
        /* renamed from: a */
        public final float mo19502a(Object obj) {
            return ((View) obj).getRotationY();
        }

        /* renamed from: b */
        public final void mo19503b(float f, Object obj) {
            ((View) obj).setRotationY(f);
        }
    }

    /* renamed from: l1.b$i */
    public static class C7227i extends C7231m {
        /* renamed from: a */
        public final float mo19502a(Object obj) {
            return ((View) obj).getX();
        }

        /* renamed from: b */
        public final void mo19503b(float f, Object obj) {
            ((View) obj).setX(f);
        }
    }

    /* renamed from: l1.b$j */
    public static class C7228j {

        /* renamed from: a */
        public float f16037a;

        /* renamed from: b */
        public float f16038b;
    }

    /* renamed from: l1.b$k */
    public interface C7229k {
        void onAnimationEnd();
    }

    /* renamed from: l1.b$l */
    public interface C7230l {
        /* renamed from: a */
        void mo19505a();
    }

    /* renamed from: l1.b$m */
    public static abstract class C7231m extends C7232c<View> {
    }

    public <K> C7218b(K k, C7232c<K> cVar) {
        this.f16029d = k;
        this.f16030e = cVar;
        if (cVar == f16020o || cVar == f16021p || cVar == f16022q) {
            this.f16034i = 0.1f;
        } else if (cVar == f16025t) {
            this.f16034i = 0.00390625f;
        } else if (cVar == f16018m || cVar == f16019n) {
            this.f16034i = 0.00390625f;
        } else {
            this.f16034i = 1.0f;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ec  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo19499a(long r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            long r3 = r0.f16033h
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r8 = 0
            if (r7 != 0) goto L_0x0015
            r0.f16033h = r1
            float r1 = r0.f16027b
            r0.mo19501b(r1)
            return r8
        L_0x0015:
            long r14 = r1 - r3
            r0.f16033h = r1
            r1 = r0
            l1.d r1 = (p166l1.C7233d) r1
            boolean r2 = r1.f16041w
            r3 = 0
            r4 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r7 = 1
            if (r2 == 0) goto L_0x003f
            float r2 = r1.f16040v
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x0032
            l1.e r9 = r1.f16039u
            double r10 = (double) r2
            r9.f16050i = r10
            r1.f16040v = r4
        L_0x0032:
            l1.e r2 = r1.f16039u
            double r9 = r2.f16050i
            float r2 = (float) r9
            r1.f16027b = r2
            r1.f16026a = r3
            r1.f16041w = r8
            goto L_0x00d4
        L_0x003f:
            float r2 = r1.f16040v
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0081
            l1.e r2 = r1.f16039u
            double r9 = r2.f16050i
            float r9 = r1.f16027b
            double r9 = (double) r9
            float r11 = r1.f16026a
            double r11 = (double) r11
            r16 = 2
            long r23 = r14 / r16
            r16 = r2
            r17 = r9
            r19 = r11
            r21 = r23
            l1.b$j r2 = r16.mo19508a(r17, r19, r21)
            l1.e r9 = r1.f16039u
            float r10 = r1.f16040v
            double r10 = (double) r10
            r9.f16050i = r10
            r1.f16040v = r4
            float r10 = r2.f16037a
            double r10 = (double) r10
            float r2 = r2.f16038b
            double r12 = (double) r2
            r18 = r9
            r19 = r10
            r21 = r12
            l1.b$j r2 = r18.mo19508a(r19, r21, r23)
            float r9 = r2.f16037a
            r1.f16027b = r9
            float r2 = r2.f16038b
            r1.f16026a = r2
            goto L_0x0095
        L_0x0081:
            l1.e r9 = r1.f16039u
            float r2 = r1.f16027b
            double r10 = (double) r2
            float r2 = r1.f16026a
            double r12 = (double) r2
            l1.b$j r2 = r9.mo19508a(r10, r12, r14)
            float r9 = r2.f16037a
            r1.f16027b = r9
            float r2 = r2.f16038b
            r1.f16026a = r2
        L_0x0095:
            float r2 = r1.f16027b
            float r9 = r1.f16032g
            float r2 = java.lang.Math.max(r2, r9)
            r1.f16027b = r2
            float r2 = java.lang.Math.min(r2, r4)
            r1.f16027b = r2
            float r9 = r1.f16026a
            l1.e r10 = r1.f16039u
            r10.getClass()
            float r9 = java.lang.Math.abs(r9)
            double r11 = (double) r9
            double r13 = r10.f16046e
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 >= 0) goto L_0x00c8
            double r11 = r10.f16050i
            float r9 = (float) r11
            float r2 = r2 - r9
            float r2 = java.lang.Math.abs(r2)
            double r11 = (double) r2
            double r9 = r10.f16045d
            int r2 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x00c8
            r2 = r7
            goto L_0x00c9
        L_0x00c8:
            r2 = r8
        L_0x00c9:
            if (r2 == 0) goto L_0x00d6
            l1.e r2 = r1.f16039u
            double r9 = r2.f16050i
            float r2 = (float) r9
            r1.f16027b = r2
            r1.f16026a = r3
        L_0x00d4:
            r1 = r7
            goto L_0x00d7
        L_0x00d6:
            r1 = r8
        L_0x00d7:
            float r2 = r0.f16027b
            float r2 = java.lang.Math.min(r2, r4)
            r0.f16027b = r2
            float r3 = r0.f16032g
            float r2 = java.lang.Math.max(r2, r3)
            r0.f16027b = r2
            r0.mo19501b(r2)
            if (r1 == 0) goto L_0x014f
            r0.f16031f = r8
            java.lang.ThreadLocal<l1.a> r2 = p166l1.C7212a.f16005g
            java.lang.Object r3 = r2.get()
            if (r3 != 0) goto L_0x00fe
            l1.a r3 = new l1.a
            r3.<init>()
            r2.set(r3)
        L_0x00fe:
            java.lang.Object r2 = r2.get()
            l1.a r2 = (p166l1.C7212a) r2
            o.i<l1.a$b, java.lang.Long> r3 = r2.f16006a
            r3.remove(r0)
            java.util.ArrayList<l1.a$b> r3 = r2.f16007b
            int r3 = r3.indexOf(r0)
            if (r3 < 0) goto L_0x0119
            java.util.ArrayList<l1.a$b> r4 = r2.f16007b
            r9 = 0
            r4.set(r3, r9)
            r2.f16011f = r7
        L_0x0119:
            r0.f16033h = r5
            r0.f16028c = r8
        L_0x011d:
            java.util.ArrayList<l1.b$k> r2 = r0.f16035j
            int r2 = r2.size()
            if (r8 >= r2) goto L_0x013b
            java.util.ArrayList<l1.b$k> r2 = r0.f16035j
            java.lang.Object r2 = r2.get(r8)
            if (r2 == 0) goto L_0x0138
            java.util.ArrayList<l1.b$k> r2 = r0.f16035j
            java.lang.Object r2 = r2.get(r8)
            l1.b$k r2 = (p166l1.C7218b.C7229k) r2
            r2.onAnimationEnd()
        L_0x0138:
            int r8 = r8 + 1
            goto L_0x011d
        L_0x013b:
            java.util.ArrayList<l1.b$k> r2 = r0.f16035j
            int r3 = r2.size()
        L_0x0141:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x014f
            java.lang.Object r4 = r2.get(r3)
            if (r4 != 0) goto L_0x0141
            r2.remove(r3)
            goto L_0x0141
        L_0x014f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p166l1.C7218b.mo19499a(long):boolean");
    }

    /* renamed from: b */
    public final void mo19501b(float f) {
        this.f16030e.mo19503b(f, this.f16029d);
        for (int i = 0; i < this.f16036k.size(); i++) {
            if (this.f16036k.get(i) != null) {
                this.f16036k.get(i).mo19505a();
            }
        }
        ArrayList<C7230l> arrayList = this.f16036k;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }
}
