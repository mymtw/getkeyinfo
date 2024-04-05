package androidx.compose.foundation.gestures;

import androidx.compose.foundation.FocusedBoundsKt;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.foundation.relocation.BringIntoViewResponderKt;
import androidx.compose.foundation.relocation.C0884f;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.layout.C1678e0;
import androidx.compose.p015ui.layout.C1680f0;
import androidx.compose.p015ui.layout.C1689j;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import p001a0.C0005b;
import p174m0.C7290i;
import p288y.C8343c;
import p288y.C8345d;
import p288y.C8347f;

public final class ContentInViewModifier implements C0884f, C1680f0, C1678e0 {

    /* renamed from: j */
    public static final /* synthetic */ int f1306j = 0;

    /* renamed from: b */
    public final C19525d0 f1307b;

    /* renamed from: c */
    public final Orientation f1308c;

    /* renamed from: d */
    public final C0615m f1309d;

    /* renamed from: e */
    public final boolean f1310e;

    /* renamed from: f */
    public C1689j f1311f;

    /* renamed from: g */
    public C1689j f1312g;

    /* renamed from: h */
    public C7290i f1313h;

    /* renamed from: i */
    public final C1436d f1314i = BringIntoViewResponderKt.m1932a(FocusedBoundsKt.m1307a(this, new ContentInViewModifier$modifier$1(this)), this);

    /* renamed from: androidx.compose.foundation.gestures.ContentInViewModifier$a */
    public /* synthetic */ class C0557a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1315a;

        static {
            int[] iArr = new int[Orientation.values().length];
            iArr[Orientation.Vertical.ordinal()] = 1;
            iArr[Orientation.Horizontal.ordinal()] = 2;
            f1315a = iArr;
        }
    }

    public ContentInViewModifier(C19525d0 d0Var, Orientation orientation, C0615m mVar, boolean z) {
        C19383o.m32797g(d0Var, "scope");
        C19383o.m32797g(orientation, "orientation");
        C19383o.m32797g(mVar, "scrollableState");
        this.f1307b = d0Var;
        this.f1308c = orientation;
        this.f1309d = mVar;
        this.f1310e = z;
    }

    /* renamed from: g */
    public static float m1345g(float f, float f2, float f3) {
        if ((f >= 0.0f && f2 <= f3) || (f < 0.0f && f2 > f3)) {
            return 0.0f;
        }
        float f4 = f2 - f3;
        return Math.abs(f) < Math.abs(f4) ? f : f4;
    }

    /* renamed from: D */
    public final void mo3725D(C1689j jVar) {
        C19383o.m32797g(jVar, "coordinates");
        this.f1312g = jVar;
    }

    /* renamed from: a */
    public final Object mo3726a(C8345d dVar, C19340c<? super C19394m> cVar) {
        Object e = mo3729e(dVar, mo3727b(dVar), cVar);
        return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : C19394m.f43287a;
    }

    /* renamed from: b */
    public final C8345d mo3727b(C8345d dVar) {
        C19383o.m32797g(dVar, "localRect");
        C7290i iVar = this.f1313h;
        if (iVar != null) {
            return mo3728d(iVar.f16171a, dVar);
        }
        throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
    }

    /* renamed from: d */
    public final C8345d mo3728d(long j, C8345d dVar) {
        long V0 = C0761x.m1698V0(j);
        int i = C0557a.f1315a[this.f1308c.ordinal()];
        if (i == 1) {
            return dVar.mo20929d(0.0f, m1345g(dVar.f18302b, dVar.f18304d, C8347f.m16654b(V0)));
        }
        if (i == 2) {
            return dVar.mo20929d(m1345g(dVar.f18301a, dVar.f18303c, C8347f.m16656d(V0)), 0.0f);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: e */
    public final Object mo3729e(C8345d dVar, C8345d dVar2, C19340c<? super C19394m> cVar) {
        float f;
        float f2;
        int i = C0557a.f1315a[this.f1308c.ordinal()];
        if (i == 1) {
            f2 = dVar.f18302b;
            f = dVar2.f18302b;
        } else if (i == 2) {
            f2 = dVar.f18301a;
            f = dVar2.f18301a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        float f3 = f2 - f;
        if (this.f1310e) {
            f3 = -f3;
        }
        Object b = ScrollExtensionsKt.m1395a(this.f1309d, f3, C0761x.m1678L0(0.0f, 0.0f, (Object) null, 7), cVar);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : C19394m.f43287a;
    }

    /* renamed from: z */
    public final void mo3730z(long j) {
        C1689j jVar;
        C8345d v;
        C1689j jVar2 = this.f1312g;
        C7290i iVar = this.f1313h;
        if (iVar != null && !C7290i.m13994a(iVar.f16171a, j)) {
            if (jVar2 != null && jVar2.mo6685c()) {
                long j2 = iVar.f16171a;
                if (!(!(this.f1308c != Orientation.Horizontal ? C7290i.m13995b(jVar2.mo6684a()) < C7290i.m13995b(j2) : ((int) (jVar2.mo6684a() >> 32)) < ((int) (j2 >> 32))) || (jVar = this.f1311f) == null || (v = jVar2.mo6689v(jVar, false)) == null)) {
                    C8345d h = C0005b.m40h(C8343c.f18295b, C0761x.m1698V0(j2));
                    C8345d d = mo3728d(jVar2.mo6684a(), v);
                    boolean c = h.mo20928c(v);
                    boolean b = true ^ C19383o.m32792b(d, v);
                    if (c && b) {
                        C19697g.m33468f(this.f1307b, (CoroutineContext) null, (CoroutineStart) null, new ContentInViewModifier$onSizeChanged$1(this, v, d, (C19340c<? super ContentInViewModifier$onSizeChanged$1>) null), 3);
                    }
                }
            }
        }
        this.f1313h = new C7290i(j);
    }
}
