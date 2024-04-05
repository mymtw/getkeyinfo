package androidx.compose.foundation;

import androidx.compose.p015ui.graphics.C1546t;
import androidx.compose.p015ui.graphics.C1604x;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p288y.C8345d;
import p297z.C8410c;
import p297z.C8412e;
import p297z.C8413f;
import p753kq.C19857l;

final class BorderKt$drawGenericBorder$3 extends Lambda implements C19857l<C8410c, C19394m> {
    public final /* synthetic */ Ref$ObjectRef<C1604x> $cacheImageBitmap;
    public final /* synthetic */ C1546t $colorFilter;
    public final /* synthetic */ C8345d $pathBounds;
    public final /* synthetic */ long $pathBoundsSize;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BorderKt$drawGenericBorder$3(C8345d dVar, Ref$ObjectRef<C1604x> ref$ObjectRef, long j, C1546t tVar) {
        super(1);
        this.$pathBounds = dVar;
        this.$cacheImageBitmap = ref$ObjectRef;
        this.$pathBoundsSize = j;
        this.$colorFilter = tVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8410c) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C8410c cVar) {
        C19383o.m32797g(cVar, "$this$onDrawWithContent");
        cVar.mo6911O0();
        C8345d dVar = this.$pathBounds;
        float f = dVar.f18301a;
        float f2 = dVar.f18302b;
        Ref$ObjectRef<C1604x> ref$ObjectRef = this.$cacheImageBitmap;
        long j = this.$pathBoundsSize;
        C1546t tVar = this.$colorFilter;
        cVar.mo6900C0().f18430a.mo21000g(f, f2);
        C8412e.m16786S(cVar, (C1604x) ref$ObjectRef.element, 0, j, 0, 0, 0.0f, (C8413f) null, tVar, 0, 0, 890);
        cVar.mo6900C0().f18430a.mo21000g(-f, -f2);
    }
}
