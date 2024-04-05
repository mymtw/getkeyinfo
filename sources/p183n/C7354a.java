package p183n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import androidx.cardview.widget.CardView;

/* renamed from: n.a */
public final class C7354a implements C7356c {
    /* renamed from: o */
    public static C7357d m14127o(C7355b bVar) {
        return (C7357d) ((CardView.C0370a) bVar).f958a;
    }

    /* renamed from: a */
    public final float mo19620a(C7355b bVar) {
        return mo19628i(bVar) * 2.0f;
    }

    /* renamed from: b */
    public final void mo19621b(C7355b bVar) {
        mo19631l(bVar, mo19627h(bVar));
    }

    /* renamed from: c */
    public final void mo19622c(C7355b bVar) {
        float f;
        CardView.C0370a aVar = (CardView.C0370a) bVar;
        if (!CardView.this.getUseCompatPadding()) {
            aVar.mo3245a(0, 0, 0, 0);
            return;
        }
        float h = mo19627h(aVar);
        float i = mo19628i(aVar);
        if (CardView.this.getPreventCornerOverlap()) {
            f = (float) (((1.0d - C7358e.f16383a) * ((double) i)) + ((double) h));
        } else {
            int i2 = C7358e.f16384b;
            f = h;
        }
        int ceil = (int) Math.ceil((double) f);
        int ceil2 = (int) Math.ceil((double) C7358e.m14159a(h, i, CardView.this.getPreventCornerOverlap()));
        aVar.mo3245a(ceil, ceil2, ceil, ceil2);
    }

    /* renamed from: d */
    public final void mo19623d(C7355b bVar) {
        mo19631l(bVar, mo19627h(bVar));
    }

    /* renamed from: e */
    public final void mo19624e(C7355b bVar, float f) {
        C7357d o = m14127o(bVar);
        if (f != o.f16372a) {
            o.f16372a = f;
            o.mo19636c((Rect) null);
            o.invalidateSelf();
        }
    }

    /* renamed from: f */
    public final void mo19625f(CardView.C0370a aVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C7357d dVar = new C7357d(f, colorStateList);
        aVar.f958a = dVar;
        CardView.this.setBackgroundDrawable(dVar);
        CardView cardView = CardView.this;
        cardView.setClipToOutline(true);
        cardView.setElevation(f2);
        mo19631l(aVar, f3);
    }

    /* renamed from: g */
    public final ColorStateList mo19626g(C7355b bVar) {
        return m14127o(bVar).f16379h;
    }

    /* renamed from: h */
    public final float mo19627h(C7355b bVar) {
        return m14127o(bVar).f16376e;
    }

    /* renamed from: i */
    public final float mo19628i(C7355b bVar) {
        return m14127o(bVar).f16372a;
    }

    /* renamed from: j */
    public final float mo19629j(C7355b bVar) {
        return CardView.this.getElevation();
    }

    /* renamed from: k */
    public final void mo19630k(C7355b bVar, float f) {
        CardView.this.setElevation(f);
    }

    /* renamed from: l */
    public final void mo19631l(C7355b bVar, float f) {
        C7357d o = m14127o(bVar);
        CardView.C0370a aVar = (CardView.C0370a) bVar;
        boolean useCompatPadding = CardView.this.getUseCompatPadding();
        boolean preventCornerOverlap = CardView.this.getPreventCornerOverlap();
        if (!(f == o.f16376e && o.f16377f == useCompatPadding && o.f16378g == preventCornerOverlap)) {
            o.f16376e = f;
            o.f16377f = useCompatPadding;
            o.f16378g = preventCornerOverlap;
            o.mo19636c((Rect) null);
            o.invalidateSelf();
        }
        mo19622c(aVar);
    }

    /* renamed from: m */
    public final void mo19632m(C7355b bVar, ColorStateList colorStateList) {
        C7357d o = m14127o(bVar);
        o.mo19635b(colorStateList);
        o.invalidateSelf();
    }

    /* renamed from: n */
    public final float mo19633n(C7355b bVar) {
        return mo19628i(bVar) * 2.0f;
    }
}
