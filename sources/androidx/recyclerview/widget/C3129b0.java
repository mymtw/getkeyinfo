package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.b0 */
public abstract class C3129b0 {

    /* renamed from: a */
    public final RecyclerView.C3100o f7191a;

    /* renamed from: b */
    public int f7192b = Integer.MIN_VALUE;

    /* renamed from: c */
    public final Rect f7193c = new Rect();

    public C3129b0(RecyclerView.C3100o oVar) {
        this.f7191a = oVar;
    }

    /* renamed from: a */
    public static C3129b0 m7653a(RecyclerView.C3100o oVar, int i) {
        if (i == 0) {
            return new C3205z(oVar);
        }
        if (i == 1) {
            return new C3127a0(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: b */
    public abstract int mo11802b(View view);

    /* renamed from: c */
    public abstract int mo11803c(View view);

    /* renamed from: d */
    public abstract int mo11804d(View view);

    /* renamed from: e */
    public abstract int mo11805e(View view);

    /* renamed from: f */
    public abstract int mo11806f();

    /* renamed from: g */
    public abstract int mo11807g();

    /* renamed from: h */
    public abstract int mo11808h();

    /* renamed from: i */
    public abstract int mo11809i();

    /* renamed from: j */
    public abstract int mo11810j();

    /* renamed from: k */
    public abstract int mo11811k();

    /* renamed from: l */
    public abstract int mo11812l();

    /* renamed from: m */
    public abstract int mo11813m(View view);

    /* renamed from: n */
    public abstract int mo11814n(View view);

    /* renamed from: o */
    public abstract void mo11815o(int i);
}
