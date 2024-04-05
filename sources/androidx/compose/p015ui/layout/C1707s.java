package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.layout.C1704r;
import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.p015ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p174m0.C7280a;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.layout.s */
public final class C1707s extends LayoutNode.C1723d {

    /* renamed from: b */
    public final /* synthetic */ C1704r f3760b;

    /* renamed from: c */
    public final /* synthetic */ C19861p<C1696m0, C7280a, C1712w> f3761c;

    /* renamed from: androidx.compose.ui.layout.s$a */
    public static final class C1708a implements C1712w {

        /* renamed from: a */
        public final /* synthetic */ C1712w f3762a;

        /* renamed from: b */
        public final /* synthetic */ C1704r f3763b;

        /* renamed from: c */
        public final /* synthetic */ int f3764c;

        public C1708a(C1712w wVar, C1704r rVar, int i) {
            this.f3762a = wVar;
            this.f3763b = rVar;
            this.f3764c = i;
        }

        /* renamed from: c */
        public final void mo4344c() {
            this.f3763b.f3742d = this.f3764c;
            this.f3762a.mo4344c();
            C1704r rVar = this.f3763b;
            rVar.mo6718a(rVar.f3742d);
        }

        /* renamed from: d */
        public final Map<C1665a, Integer> mo4345d() {
            return this.f3762a.mo4345d();
        }

        public final int getHeight() {
            return this.f3762a.getHeight();
        }

        public final int getWidth() {
            return this.f3762a.getWidth();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1707s(C1704r rVar, C19861p<? super C1696m0, ? super C7280a, ? extends C1712w> pVar, String str) {
        super(str);
        this.f3760b = rVar;
        this.f3761c = pVar;
    }

    /* renamed from: b */
    public final C1712w mo3260b(C1713x xVar, List<? extends C1710u> list, long j) {
        C19383o.m32797g(xVar, "$this$measure");
        C19383o.m32797g(list, "measurables");
        C1704r.C1706b bVar = this.f3760b.f3745g;
        LayoutDirection layoutDirection = xVar.getLayoutDirection();
        bVar.getClass();
        C19383o.m32797g(layoutDirection, "<set-?>");
        bVar.f3756b = layoutDirection;
        this.f3760b.f3745g.f3757c = xVar.getDensity();
        this.f3760b.f3745g.f3758d = xVar.mo3800w0();
        C1704r rVar = this.f3760b;
        rVar.f3742d = 0;
        C1704r rVar2 = this.f3760b;
        return new C1708a(this.f3761c.invoke(rVar.f3745g, new C7280a(j)), rVar2, rVar2.f3742d);
    }
}
