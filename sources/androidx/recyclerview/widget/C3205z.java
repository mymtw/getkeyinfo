package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.z */
public final class C3205z extends C3129b0 {
    public C3205z(RecyclerView.C3100o oVar) {
        super(oVar);
    }

    /* renamed from: b */
    public final int mo11802b(View view) {
        this.f7191a.getClass();
        return RecyclerView.C3100o.m7398K(view) + view.getRight() + ((RecyclerView.LayoutParams) view.getLayoutParams()).rightMargin;
    }

    /* renamed from: c */
    public final int mo11803c(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        this.f7191a.getClass();
        Rect rect = ((RecyclerView.LayoutParams) view.getLayoutParams()).mDecorInsets;
        return view.getMeasuredWidth() + rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
    }

    /* renamed from: d */
    public final int mo11804d(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        this.f7191a.getClass();
        Rect rect = ((RecyclerView.LayoutParams) view.getLayoutParams()).mDecorInsets;
        return view.getMeasuredHeight() + rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: e */
    public final int mo11805e(View view) {
        this.f7191a.getClass();
        return (view.getLeft() - RecyclerView.C3100o.m7395D(view)) - ((RecyclerView.LayoutParams) view.getLayoutParams()).leftMargin;
    }

    /* renamed from: f */
    public final int mo11806f() {
        return this.f7191a.f7084n;
    }

    /* renamed from: g */
    public final int mo11807g() {
        RecyclerView.C3100o oVar = this.f7191a;
        return oVar.f7084n - oVar.mo11651G();
    }

    /* renamed from: h */
    public final int mo11808h() {
        return this.f7191a.mo11651G();
    }

    /* renamed from: i */
    public final int mo11809i() {
        return this.f7191a.f7082l;
    }

    /* renamed from: j */
    public final int mo11810j() {
        return this.f7191a.f7083m;
    }

    /* renamed from: k */
    public final int mo11811k() {
        return this.f7191a.mo11649F();
    }

    /* renamed from: l */
    public final int mo11812l() {
        RecyclerView.C3100o oVar = this.f7191a;
        return (oVar.f7084n - oVar.mo11649F()) - this.f7191a.mo11651G();
    }

    /* renamed from: m */
    public final int mo11813m(View view) {
        this.f7191a.mo11653N(view, this.f7193c);
        return this.f7193c.right;
    }

    /* renamed from: n */
    public final int mo11814n(View view) {
        this.f7191a.mo11653N(view, this.f7193c);
        return this.f7193c.left;
    }

    /* renamed from: o */
    public final void mo11815o(int i) {
        this.f7191a.mo11655S(i);
    }
}
