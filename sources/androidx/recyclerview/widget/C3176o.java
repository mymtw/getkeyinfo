package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;
import java.util.WeakHashMap;

/* renamed from: androidx.recyclerview.widget.o */
public final class C3176o extends RecyclerView.C3099n implements RecyclerView.C3107r {

    /* renamed from: C */
    public static final int[] f7326C = {16842919};

    /* renamed from: D */
    public static final int[] f7327D = new int[0];

    /* renamed from: A */
    public int f7328A;

    /* renamed from: B */
    public final C3177a f7329B;

    /* renamed from: a */
    public final int f7330a;

    /* renamed from: b */
    public final int f7331b;

    /* renamed from: c */
    public final StateListDrawable f7332c;

    /* renamed from: d */
    public final Drawable f7333d;

    /* renamed from: e */
    public final int f7334e;

    /* renamed from: f */
    public final int f7335f;

    /* renamed from: g */
    public final StateListDrawable f7336g;

    /* renamed from: h */
    public final Drawable f7337h;

    /* renamed from: i */
    public final int f7338i;

    /* renamed from: j */
    public final int f7339j;

    /* renamed from: k */
    public int f7340k;

    /* renamed from: l */
    public int f7341l;

    /* renamed from: m */
    public float f7342m;

    /* renamed from: n */
    public int f7343n;

    /* renamed from: o */
    public int f7344o;

    /* renamed from: p */
    public float f7345p;

    /* renamed from: q */
    public int f7346q = 0;

    /* renamed from: r */
    public int f7347r = 0;

    /* renamed from: s */
    public RecyclerView f7348s;

    /* renamed from: t */
    public boolean f7349t = false;

    /* renamed from: u */
    public boolean f7350u = false;

    /* renamed from: v */
    public int f7351v = 0;

    /* renamed from: w */
    public int f7352w = 0;

    /* renamed from: x */
    public final int[] f7353x = new int[2];

    /* renamed from: y */
    public final int[] f7354y = new int[2];

    /* renamed from: z */
    public final ValueAnimator f7355z;

    /* renamed from: androidx.recyclerview.widget.o$a */
    public class C3177a implements Runnable {
        public C3177a() {
        }

        public final void run() {
            C3176o oVar = C3176o.this;
            int i = oVar.f7328A;
            if (i == 1) {
                oVar.f7355z.cancel();
            } else if (i != 2) {
                return;
            }
            oVar.f7328A = 3;
            ValueAnimator valueAnimator = oVar.f7355z;
            valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
            oVar.f7355z.setDuration((long) 500);
            oVar.f7355z.start();
        }
    }

    /* renamed from: androidx.recyclerview.widget.o$b */
    public class C3178b extends RecyclerView.C3108s {
        public C3178b() {
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C3176o oVar = C3176o.this;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int computeVerticalScrollRange = oVar.f7348s.computeVerticalScrollRange();
            int i3 = oVar.f7347r;
            oVar.f7349t = computeVerticalScrollRange - i3 > 0 && i3 >= oVar.f7330a;
            int computeHorizontalScrollRange = oVar.f7348s.computeHorizontalScrollRange();
            int i4 = oVar.f7346q;
            boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= oVar.f7330a;
            oVar.f7350u = z;
            boolean z2 = oVar.f7349t;
            if (z2 || z) {
                if (z2) {
                    float f = (float) i3;
                    oVar.f7341l = (int) ((((f / 2.0f) + ((float) computeVerticalScrollOffset)) * f) / ((float) computeVerticalScrollRange));
                    oVar.f7340k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
                }
                if (oVar.f7350u) {
                    float f2 = (float) computeHorizontalScrollOffset;
                    float f3 = (float) i4;
                    oVar.f7344o = (int) ((((f3 / 2.0f) + f2) * f3) / ((float) computeHorizontalScrollRange));
                    oVar.f7343n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
                }
                int i5 = oVar.f7351v;
                if (i5 == 0 || i5 == 1) {
                    oVar.mo11905h(1);
                }
            } else if (oVar.f7351v != 0) {
                oVar.mo11905h(0);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.o$c */
    public class C3179c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f7358a = false;

        public C3179c() {
        }

        public final void onAnimationCancel(Animator animator) {
            this.f7358a = true;
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f7358a) {
                this.f7358a = false;
            } else if (((Float) C3176o.this.f7355z.getAnimatedValue()).floatValue() == 0.0f) {
                C3176o oVar = C3176o.this;
                oVar.f7328A = 0;
                oVar.mo11905h(0);
            } else {
                C3176o oVar2 = C3176o.this;
                oVar2.f7328A = 2;
                oVar2.f7348s.invalidate();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.o$d */
    public class C3180d implements ValueAnimator.AnimatorUpdateListener {
        public C3180d() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C3176o.this.f7332c.setAlpha(floatValue);
            C3176o.this.f7333d.setAlpha(floatValue);
            C3176o.this.f7348s.invalidate();
        }
    }

    public C3176o(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f7355z = ofFloat;
        this.f7328A = 0;
        C3177a aVar = new C3177a();
        this.f7329B = aVar;
        C3178b bVar = new C3178b();
        this.f7332c = stateListDrawable;
        this.f7333d = drawable;
        this.f7336g = stateListDrawable2;
        this.f7337h = drawable2;
        this.f7334e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f7335f = Math.max(i, drawable.getIntrinsicWidth());
        this.f7338i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f7339j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f7330a = i2;
        this.f7331b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C3179c());
        ofFloat.addUpdateListener(new C3180d());
        RecyclerView recyclerView2 = this.f7348s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.removeItemDecoration(this);
                this.f7348s.removeOnItemTouchListener(this);
                this.f7348s.removeOnScrollListener(bVar);
                this.f7348s.removeCallbacks(aVar);
            }
            this.f7348s = recyclerView;
            if (recyclerView != null) {
                recyclerView.addItemDecoration(this);
                this.f7348s.addOnItemTouchListener(this);
                this.f7348s.addOnScrollListener(bVar);
            }
        }
    }

    /* renamed from: c */
    public final void mo11685c(boolean z) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bb, code lost:
        if (r8 >= 0) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0114, code lost:
        if (r5 >= 0) goto L_0x0116;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11686d(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r11.f7351v
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r0 = r12.getAction()
            r1 = 2
            r2 = 1
            if (r0 != 0) goto L_0x0047
            float r0 = r12.getX()
            float r3 = r12.getY()
            boolean r0 = r11.mo11904g(r0, r3)
            float r3 = r12.getX()
            float r4 = r12.getY()
            boolean r3 = r11.mo11903f(r3, r4)
            if (r0 != 0) goto L_0x0029
            if (r3 == 0) goto L_0x011f
        L_0x0029:
            if (r3 == 0) goto L_0x0036
            r11.f7352w = r2
            float r12 = r12.getX()
            int r12 = (int) r12
            float r12 = (float) r12
            r11.f7345p = r12
            goto L_0x0042
        L_0x0036:
            if (r0 == 0) goto L_0x0042
            r11.f7352w = r1
            float r12 = r12.getY()
            int r12 = (int) r12
            float r12 = (float) r12
            r11.f7342m = r12
        L_0x0042:
            r11.mo11905h(r1)
            goto L_0x011f
        L_0x0047:
            int r0 = r12.getAction()
            r3 = 0
            if (r0 != r2) goto L_0x005e
            int r0 = r11.f7351v
            if (r0 != r1) goto L_0x005e
            r12 = 0
            r11.f7342m = r12
            r11.f7345p = r12
            r11.mo11905h(r2)
            r11.f7352w = r3
            goto L_0x011f
        L_0x005e:
            int r0 = r12.getAction()
            if (r0 != r1) goto L_0x011f
            int r0 = r11.f7351v
            if (r0 != r1) goto L_0x011f
            r11.mo11906i()
            int r0 = r11.f7352w
            r4 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L_0x00c6
            float r0 = r12.getX()
            int[] r5 = r11.f7354y
            int r6 = r11.f7331b
            r5[r3] = r6
            int r7 = r11.f7346q
            int r7 = r7 - r6
            r5[r2] = r7
            float r6 = (float) r6
            float r7 = (float) r7
            float r0 = java.lang.Math.min(r7, r0)
            float r0 = java.lang.Math.max(r6, r0)
            int r6 = r11.f7344o
            float r6 = (float) r6
            float r6 = r6 - r0
            float r6 = java.lang.Math.abs(r6)
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0097
            goto L_0x00c6
        L_0x0097:
            float r6 = r11.f7345p
            androidx.recyclerview.widget.RecyclerView r7 = r11.f7348s
            int r7 = r7.computeHorizontalScrollRange()
            androidx.recyclerview.widget.RecyclerView r8 = r11.f7348s
            int r8 = r8.computeHorizontalScrollOffset()
            int r9 = r11.f7346q
            r10 = r5[r2]
            r5 = r5[r3]
            int r10 = r10 - r5
            if (r10 != 0) goto L_0x00b0
        L_0x00ae:
            r5 = r3
            goto L_0x00bd
        L_0x00b0:
            float r5 = r0 - r6
            float r6 = (float) r10
            float r5 = r5 / r6
            int r7 = r7 - r9
            float r6 = (float) r7
            float r5 = r5 * r6
            int r5 = (int) r5
            int r8 = r8 + r5
            if (r8 >= r7) goto L_0x00ae
            if (r8 < 0) goto L_0x00ae
        L_0x00bd:
            if (r5 == 0) goto L_0x00c4
            androidx.recyclerview.widget.RecyclerView r6 = r11.f7348s
            r6.scrollBy(r5, r3)
        L_0x00c4:
            r11.f7345p = r0
        L_0x00c6:
            int r0 = r11.f7352w
            if (r0 != r1) goto L_0x011f
            float r12 = r12.getY()
            int[] r0 = r11.f7353x
            int r1 = r11.f7331b
            r0[r3] = r1
            int r5 = r11.f7347r
            int r5 = r5 - r1
            r0[r2] = r5
            float r1 = (float) r1
            float r5 = (float) r5
            float r12 = java.lang.Math.min(r5, r12)
            float r12 = java.lang.Math.max(r1, r12)
            int r1 = r11.f7341l
            float r1 = (float) r1
            float r1 = r1 - r12
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x00f0
            goto L_0x011f
        L_0x00f0:
            float r1 = r11.f7342m
            androidx.recyclerview.widget.RecyclerView r4 = r11.f7348s
            int r4 = r4.computeVerticalScrollRange()
            androidx.recyclerview.widget.RecyclerView r5 = r11.f7348s
            int r5 = r5.computeVerticalScrollOffset()
            int r6 = r11.f7347r
            r2 = r0[r2]
            r0 = r0[r3]
            int r2 = r2 - r0
            if (r2 != 0) goto L_0x0109
        L_0x0107:
            r0 = r3
            goto L_0x0116
        L_0x0109:
            float r0 = r12 - r1
            float r1 = (float) r2
            float r0 = r0 / r1
            int r4 = r4 - r6
            float r1 = (float) r4
            float r0 = r0 * r1
            int r0 = (int) r0
            int r5 = r5 + r0
            if (r5 >= r4) goto L_0x0107
            if (r5 < 0) goto L_0x0107
        L_0x0116:
            if (r0 == 0) goto L_0x011d
            androidx.recyclerview.widget.RecyclerView r1 = r11.f7348s
            r1.scrollBy(r3, r0)
        L_0x011d:
            r11.f7342m = r12
        L_0x011f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C3176o.mo11686d(android.view.MotionEvent):void");
    }

    /* renamed from: e */
    public final boolean mo11687e(MotionEvent motionEvent) {
        int i = this.f7351v;
        if (i == 1) {
            boolean g = mo11904g(motionEvent.getX(), motionEvent.getY());
            boolean f = mo11903f(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (g || f)) {
                if (f) {
                    this.f7352w = 1;
                    this.f7345p = (float) ((int) motionEvent.getX());
                } else if (g) {
                    this.f7352w = 2;
                    this.f7342m = (float) ((int) motionEvent.getY());
                }
                mo11905h(2);
                return true;
            }
        } else if (i == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo11903f(float f, float f2) {
        if (f2 >= ((float) (this.f7347r - this.f7338i))) {
            int i = this.f7344o;
            int i2 = this.f7343n;
            return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
        }
    }

    /* renamed from: g */
    public final boolean mo11904g(float f, float f2) {
        RecyclerView recyclerView = this.f7348s;
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        if (C2364y.C2369e.m5233d(recyclerView) == 1) {
            if (f > ((float) this.f7334e)) {
                return false;
            }
        } else if (f < ((float) (this.f7346q - this.f7334e))) {
            return false;
        }
        int i = this.f7341l;
        int i2 = this.f7340k / 2;
        return f2 >= ((float) (i - i2)) && f2 <= ((float) (i2 + i));
    }

    /* renamed from: h */
    public final void mo11905h(int i) {
        if (i == 2 && this.f7351v != 2) {
            this.f7332c.setState(f7326C);
            this.f7348s.removeCallbacks(this.f7329B);
        }
        if (i == 0) {
            this.f7348s.invalidate();
        } else {
            mo11906i();
        }
        if (this.f7351v == 2 && i != 2) {
            this.f7332c.setState(f7327D);
            this.f7348s.removeCallbacks(this.f7329B);
            this.f7348s.postDelayed(this.f7329B, (long) 1200);
        } else if (i == 1) {
            this.f7348s.removeCallbacks(this.f7329B);
            this.f7348s.postDelayed(this.f7329B, (long) ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.f7351v = i;
    }

    /* renamed from: i */
    public final void mo11906i() {
        int i = this.f7328A;
        if (i != 0) {
            if (i == 3) {
                this.f7355z.cancel();
            } else {
                return;
            }
        }
        this.f7328A = 1;
        ValueAnimator valueAnimator = this.f7355z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f7355z.setDuration(500);
        this.f7355z.setStartDelay(0);
        this.f7355z.start();
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C3117y yVar) {
        if (this.f7346q != this.f7348s.getWidth() || this.f7347r != this.f7348s.getHeight()) {
            this.f7346q = this.f7348s.getWidth();
            this.f7347r = this.f7348s.getHeight();
            mo11905h(0);
        } else if (this.f7328A != 0) {
            if (this.f7349t) {
                int i = this.f7346q;
                int i2 = this.f7334e;
                int i3 = i - i2;
                int i4 = this.f7341l;
                int i5 = this.f7340k;
                int i6 = i4 - (i5 / 2);
                this.f7332c.setBounds(0, 0, i2, i5);
                this.f7333d.setBounds(0, 0, this.f7335f, this.f7347r);
                RecyclerView recyclerView2 = this.f7348s;
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                boolean z = true;
                if (C2364y.C2369e.m5233d(recyclerView2) != 1) {
                    z = false;
                }
                if (z) {
                    this.f7333d.draw(canvas);
                    canvas.translate((float) this.f7334e, (float) i6);
                    canvas.scale(-1.0f, 1.0f);
                    this.f7332c.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate((float) (-this.f7334e), (float) (-i6));
                } else {
                    canvas.translate((float) i3, 0.0f);
                    this.f7333d.draw(canvas);
                    canvas.translate(0.0f, (float) i6);
                    this.f7332c.draw(canvas);
                    canvas.translate((float) (-i3), (float) (-i6));
                }
            }
            if (this.f7350u) {
                int i7 = this.f7347r;
                int i8 = this.f7338i;
                int i9 = i7 - i8;
                int i10 = this.f7344o;
                int i11 = this.f7343n;
                int i12 = i10 - (i11 / 2);
                this.f7336g.setBounds(0, 0, i11, i8);
                this.f7337h.setBounds(0, 0, this.f7346q, this.f7339j);
                canvas.translate(0.0f, (float) i9);
                this.f7337h.draw(canvas);
                canvas.translate((float) i12, 0.0f);
                this.f7336g.draw(canvas);
                canvas.translate((float) (-i12), (float) (-i9));
            }
        }
    }
}
