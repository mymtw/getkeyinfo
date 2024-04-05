package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.View;
import androidx.activity.C0114h;
import androidx.compose.p015ui.layout.C1674c0;
import androidx.compose.p015ui.layout.C1689j;
import androidx.compose.p015ui.node.LayoutNodeWrapper;
import java.util.List;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p173m.C7279a;
import p219r.C7734e;
import p288y.C8343c;
import p288y.C8345d;
import p628nj.C18263b;
import p753kq.C19857l;

/* renamed from: androidx.compose.foundation.l */
public final class C0649l implements C1674c0 {

    /* renamed from: b */
    public final View f1388b;

    /* renamed from: c */
    public final C19857l<C1689j, C8345d> f1389c;

    /* renamed from: d */
    public Rect f1390d;

    public C0649l(View view, C19857l<? super C1689j, C8345d> lVar) {
        C19383o.m32797g(view, "view");
        this.f1388b = view;
        this.f1389c = lVar;
    }

    /* renamed from: a */
    public final void mo3877a(Rect rect) {
        C7734e eVar = new C7734e(new Rect[16]);
        List b = this.f1388b.getSystemGestureExclusionRects();
        C19383o.m32796f(b, "view.systemGestureExclusionRects");
        int i = eVar.f17157d;
        boolean z = false;
        if (!b.isEmpty()) {
            eVar.mo20237k(b.size() + eVar.f17157d);
            T[] tArr = eVar.f17155b;
            if (i != eVar.f17157d) {
                C19318k.m32603U0(tArr, b.size() + i, tArr, i, eVar.f17157d);
            }
            int size = b.size();
            for (int i2 = 0; i2 < size; i2++) {
                tArr[i + i2] = b.get(i2);
            }
            eVar.f17157d = b.size() + eVar.f17157d;
        }
        Rect rect2 = this.f1390d;
        if (rect2 != null) {
            eVar.mo20241o(rect2);
        }
        if (rect != null && !rect.isEmpty()) {
            z = true;
        }
        if (z) {
            eVar.mo20232c(rect);
        }
        View view = this.f1388b;
        C7734e.C7735a aVar = eVar.f17156c;
        if (aVar == null) {
            aVar = new C7734e.C7735a(eVar);
            eVar.f17156c = aVar;
        }
        view.setSystemGestureExclusionRects(aVar);
        this.f1390d = rect;
    }

    /* renamed from: x0 */
    public final void mo3878x0(C1689j jVar) {
        Rect rect;
        C1689j jVar2 = jVar;
        C19383o.m32797g(jVar2, "coordinates");
        C19857l<C1689j, C8345d> lVar = this.f1389c;
        if (lVar == null) {
            rect = C0114h.m330y0(C0114h.m275F(jVar));
        } else {
            C8345d invoke = lVar.invoke(jVar2);
            LayoutNodeWrapper layoutNodeWrapper = jVar2;
            for (LayoutNodeWrapper O = jVar.mo6682O(); O != null; O = O.mo6682O()) {
                layoutNodeWrapper = O;
            }
            long m = layoutNodeWrapper.mo6686m(jVar2, C19421p.m32952q(invoke.f18301a, invoke.f18302b));
            long m2 = layoutNodeWrapper.mo6686m(jVar2, C19421p.m32952q(invoke.f18303c, invoke.f18302b));
            long m3 = layoutNodeWrapper.mo6686m(jVar2, C19421p.m32952q(invoke.f18301a, invoke.f18304d));
            long m4 = layoutNodeWrapper.mo6686m(jVar2, C19421p.m32952q(invoke.f18303c, invoke.f18304d));
            float c = C8343c.m16642c(m);
            float h0 = C18263b.m30846h0(new float[]{C8343c.m16642c(m2), C8343c.m16642c(m3), C8343c.m16642c(m4)}, c);
            float d = C8343c.m16643d(m);
            float h02 = C18263b.m30846h0(new float[]{C8343c.m16643d(m2), C8343c.m16643d(m3), C8343c.m16643d(m4)}, d);
            float c2 = C8343c.m16642c(m);
            float g0 = C18263b.m30845g0(new float[]{C8343c.m16642c(m2), C8343c.m16642c(m3), C8343c.m16642c(m4)}, c2);
            float d2 = C8343c.m16643d(m);
            rect = new Rect(C7279a.m13954l(h0), C7279a.m13954l(h02), C7279a.m13954l(g0), C7279a.m13954l(C18263b.m30845g0(new float[]{C8343c.m16643d(m2), C8343c.m16643d(m3), C8343c.m16643d(m4)}, d2)));
        }
        mo3877a(rect);
    }
}
