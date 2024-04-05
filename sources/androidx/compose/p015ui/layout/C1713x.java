package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.layout.x */
public interface C1713x extends C1683h {

    /* renamed from: androidx.compose.ui.layout.x$a */
    public static final class C1714a implements C1712w {

        /* renamed from: a */
        public final int f3767a;

        /* renamed from: b */
        public final int f3768b;

        /* renamed from: c */
        public final Map<C1665a, Integer> f3769c;

        /* renamed from: d */
        public final /* synthetic */ int f3770d;

        /* renamed from: e */
        public final /* synthetic */ C1713x f3771e;

        /* renamed from: f */
        public final /* synthetic */ C19857l<C1686i0.C1687a, C19394m> f3772f;

        public C1714a(int i, int i2, Map<C1665a, Integer> map, C1713x xVar, C19857l<? super C1686i0.C1687a, C19394m> lVar) {
            this.f3770d = i;
            this.f3771e = xVar;
            this.f3772f = lVar;
            this.f3767a = i;
            this.f3768b = i2;
            this.f3769c = map;
        }

        /* renamed from: c */
        public final void mo4344c() {
            C1686i0.C1687a.C1688a aVar = C1686i0.C1687a.f3726a;
            int i = this.f3770d;
            LayoutDirection layoutDirection = this.f3771e.getLayoutDirection();
            C19857l<C1686i0.C1687a, C19394m> lVar = this.f3772f;
            aVar.getClass();
            int i2 = C1686i0.C1687a.f3728c;
            aVar.getClass();
            LayoutDirection layoutDirection2 = C1686i0.C1687a.f3727b;
            C1686i0.C1687a.f3728c = i;
            C1686i0.C1687a.f3727b = layoutDirection;
            lVar.invoke(aVar);
            C1686i0.C1687a.f3728c = i2;
            C1686i0.C1687a.f3727b = layoutDirection2;
        }

        /* renamed from: d */
        public final Map<C1665a, Integer> mo4345d() {
            return this.f3769c;
        }

        public final int getHeight() {
            return this.f3768b;
        }

        public final int getWidth() {
            return this.f3767a;
        }
    }

    /* renamed from: Z */
    C1712w mo4387Z(int i, int i2, Map<C1665a, Integer> map, C19857l<? super C1686i0.C1687a, C19394m> lVar) {
        C19383o.m32797g(map, "alignmentLines");
        C19383o.m32797g(lVar, "placementBlock");
        return new C1714a(i, i2, map, this, lVar);
    }
}
