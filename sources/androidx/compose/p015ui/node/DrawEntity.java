package androidx.compose.p015ui.node;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.draw.C1439a;
import androidx.compose.p015ui.draw.C1442d;
import androidx.compose.p015ui.draw.C1444f;
import androidx.compose.p015ui.graphics.C1537o;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.unit.LayoutDirection;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p174m0.C7282b;
import p297z.C8406a;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.node.DrawEntity */
public final class DrawEntity extends C1742i<DrawEntity, C1444f> implements C1752q {

    /* renamed from: j */
    public static final C19857l<DrawEntity, C19394m> f3784j = DrawEntity$Companion$onCommitAffectingDrawEntity$1.INSTANCE;

    /* renamed from: f */
    public C1442d f3785f;

    /* renamed from: g */
    public final C1719a f3786g;

    /* renamed from: h */
    public boolean f3787h;

    /* renamed from: i */
    public final C19846a<C19394m> f3788i;

    /* renamed from: androidx.compose.ui.node.DrawEntity$a */
    public static final class C1719a implements C1439a {

        /* renamed from: a */
        public final C7282b f3789a;

        /* renamed from: b */
        public final /* synthetic */ DrawEntity f3790b;

        /* renamed from: c */
        public final /* synthetic */ LayoutNodeWrapper f3791c;

        public C1719a(DrawEntity drawEntity, LayoutNodeWrapper layoutNodeWrapper) {
            this.f3790b = drawEntity;
            this.f3791c = layoutNodeWrapper;
            this.f3789a = drawEntity.f3919b.f3850f.f3832q;
        }

        /* renamed from: b */
        public final long mo6165b() {
            return C0761x.m1698V0(this.f3791c.f3724d);
        }

        public final C7282b getDensity() {
            return this.f3789a;
        }

        public final LayoutDirection getLayoutDirection() {
            return this.f3790b.f3919b.f3850f.f3834s;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawEntity(LayoutNodeWrapper layoutNodeWrapper, C1444f fVar) {
        super(layoutNodeWrapper, fVar);
        C19383o.m32797g(layoutNodeWrapper, "layoutNodeWrapper");
        C19383o.m32797g(fVar, "modifier");
        C1444f fVar2 = (C1444f) this.f3920c;
        this.f3785f = fVar2 instanceof C1442d ? (C1442d) fVar2 : null;
        this.f3786g = new C1719a(this, layoutNodeWrapper);
        this.f3787h = true;
        this.f3788i = new DrawEntity$updateCache$1(this);
    }

    /* renamed from: a */
    public final void mo6735a() {
        C1444f fVar = (C1444f) this.f3920c;
        this.f3785f = fVar instanceof C1442d ? (C1442d) fVar : null;
        this.f3787h = true;
        this.f3922e = true;
    }

    /* renamed from: c */
    public final void mo6736c(C1537o oVar) {
        C19383o.m32797g(oVar, "canvas");
        long V0 = C0761x.m1698V0(this.f3919b.f3724d);
        if (this.f3785f != null && this.f3787h) {
            C15588c1.m25291L0(this.f3919b.f3850f).getSnapshotObserver().mo6824b(this, f3784j, this.f3788i);
        }
        LayoutNode layoutNode = this.f3919b.f3850f;
        layoutNode.getClass();
        C1741h sharedDrawScope = C15588c1.m25291L0(layoutNode).getSharedDrawScope();
        LayoutNodeWrapper layoutNodeWrapper = this.f3919b;
        DrawEntity drawEntity = sharedDrawScope.f3918c;
        sharedDrawScope.f3918c = this;
        C8406a aVar = sharedDrawScope.f3917b;
        C1713x a1 = layoutNodeWrapper.mo6790a1();
        LayoutDirection layoutDirection = layoutNodeWrapper.mo6790a1().getLayoutDirection();
        C8406a.C8407a aVar2 = aVar.f18422b;
        C7282b bVar = aVar2.f18426a;
        LayoutDirection layoutDirection2 = aVar2.f18427b;
        C1537o oVar2 = aVar2.f18428c;
        long j = aVar2.f18429d;
        C19383o.m32797g(a1, "<set-?>");
        aVar2.f18426a = a1;
        aVar2.mo20987a(layoutDirection);
        aVar2.f18428c = oVar;
        aVar2.f18429d = V0;
        oVar.mo6264r();
        ((C1444f) this.f3920c).mo3715P(sharedDrawScope);
        oVar.mo6261m();
        C8406a.C8407a aVar3 = aVar.f18422b;
        aVar3.getClass();
        C19383o.m32797g(bVar, "<set-?>");
        aVar3.f18426a = bVar;
        aVar3.mo20987a(layoutDirection2);
        C19383o.m32797g(oVar2, "<set-?>");
        aVar3.f18428c = oVar2;
        aVar3.f18429d = j;
        sharedDrawScope.f3918c = drawEntity;
    }

    public final boolean isValid() {
        return this.f3919b.mo6685c();
    }
}
