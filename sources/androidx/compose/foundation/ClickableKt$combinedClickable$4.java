package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.interaction.C0642l;
import androidx.compose.foundation.interaction.C0643m;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p015ui.semantics.C1900g;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.C1358r;
import androidx.compose.runtime.C1360s;
import androidx.compose.runtime.C1415u;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p098f0.C6764b;
import p098f0.C6766d;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19862q;

final class ClickableKt$combinedClickable$4 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0871p $indication;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ C19846a<C19394m> $onClick;
    public final /* synthetic */ String $onClickLabel;
    public final /* synthetic */ C19846a<C19394m> $onDoubleClick;
    public final /* synthetic */ C19846a<C19394m> $onLongClick;
    public final /* synthetic */ String $onLongClickLabel;
    public final /* synthetic */ C1900g $role;

    /* renamed from: androidx.compose.foundation.ClickableKt$combinedClickable$4$a */
    public static final class C0503a implements C6764b {

        /* renamed from: b */
        public final /* synthetic */ C1338j0<Boolean> f1263b;

        public C0503a(C1338j0<Boolean> j0Var) {
            this.f1263b = j0Var;
        }

        /* renamed from: M */
        public final void mo3622M(C6766d dVar) {
            C19383o.m32797g(dVar, "scope");
            this.f1263b.setValue(dVar.mo6818a(ScrollableKt.f1341b));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableKt$combinedClickable$4(C19846a<C19394m> aVar, C19846a<C19394m> aVar2, C19846a<C19394m> aVar3, boolean z, C0640j jVar, C0871p pVar, String str, C1900g gVar, String str2) {
        super(3);
        this.$onClick = aVar;
        this.$onLongClick = aVar2;
        this.$onDoubleClick = aVar3;
        this.$enabled = z;
        this.$interactionSource = jVar;
        this.$indication = pVar;
        this.$onClickLabel = str;
        this.$role = gVar;
        this.$onLongClickLabel = str2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C1302d dVar3 = dVar2;
        C19383o.m32797g(dVar, "$this$composed");
        dVar3.mo5465u(1841718000);
        C1338j0 E0 = C0761x.m1664E0(this.$onClick, dVar3);
        C1338j0 E02 = C0761x.m1664E0(this.$onLongClick, dVar3);
        C1338j0 E03 = C0761x.m1664E0(this.$onDoubleClick, dVar3);
        boolean z = this.$onLongClick != null;
        boolean z2 = this.$onDoubleClick != null;
        dVar3.mo5465u(-492369756);
        Object v = dVar2.mo5467v();
        Object obj = C1302d.C1303a.f2828a;
        if (v == obj) {
            v = C0761x.m1751w0((Object) null, C1351n1.f2948a);
            dVar3.mo5454o(v);
        }
        dVar2.mo5406H();
        final C1338j0 j0Var = (C1338j0) v;
        dVar3.mo5465u(1321106866);
        if (this.$enabled) {
            Boolean valueOf = Boolean.valueOf(z);
            final C0640j jVar = this.$interactionSource;
            C1415u.m3028b(valueOf, new C19857l<C1360s, C1358r>() {

                /* renamed from: androidx.compose.foundation.ClickableKt$combinedClickable$4$1$a */
                public static final class C0502a implements C1358r {

                    /* renamed from: a */
                    public final /* synthetic */ C1338j0 f1261a;

                    /* renamed from: b */
                    public final /* synthetic */ C0640j f1262b;

                    public C0502a(C1338j0 j0Var, C0640j jVar) {
                        this.f1261a = j0Var;
                        this.f1262b = jVar;
                    }

                    public final void dispose() {
                        C0643m mVar = (C0643m) this.f1261a.getValue();
                        if (mVar != null) {
                            this.f1262b.mo3871b(new C0642l(mVar));
                            this.f1261a.setValue(null);
                        }
                    }
                }

                public final C1358r invoke(C1360s sVar) {
                    C19383o.m32797g(sVar, "$this$DisposableEffect");
                    return new C0502a(j0Var, jVar);
                }
            }, dVar3);
            ClickableKt.m1295a(this.$interactionSource, j0Var, dVar3, 48);
        }
        dVar2.mo5406H();
        C19846a a = C0620h.m1437a(dVar2);
        dVar3.mo5465u(-492369756);
        Object v2 = dVar2.mo5467v();
        if (v2 == obj) {
            v2 = C0761x.m1751w0(Boolean.TRUE, C1351n1.f2948a);
            dVar3.mo5454o(v2);
        }
        dVar2.mo5406H();
        C1338j0 j0Var2 = (C1338j0) v2;
        C1338j0 E04 = C0761x.m1664E0(new ClickableKt$combinedClickable$4$delayPressInteraction$1(j0Var2, a), dVar3);
        C1436d.C1437a aVar = C1436d.C1437a.f3125b;
        Object[] objArr = {this.$interactionSource, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(this.$enabled)};
        boolean z3 = this.$enabled;
        ClickableKt$combinedClickable$4$gesture$1 clickableKt$combinedClickable$4$gesture$1 = r3;
        C1338j0 j0Var3 = j0Var2;
        ClickableKt$combinedClickable$4$gesture$1 clickableKt$combinedClickable$4$gesture$12 = new ClickableKt$combinedClickable$4$gesture$1(z2, z3, z, E03, E02, this.$interactionSource, j0Var, E04, E0, (C19340c<? super ClickableKt$combinedClickable$4$gesture$1>) null);
        C1436d c = SuspendingPointerInputFilterKt.m3485c(aVar, objArr, clickableKt$combinedClickable$4$gesture$1);
        dVar3.mo5465u(-492369756);
        Object v3 = dVar2.mo5467v();
        if (v3 == obj) {
            v3 = new C0503a(j0Var3);
            dVar3.mo5454o(v3);
        }
        dVar2.mo5406H();
        C1436d dVar4 = (C1436d) v3;
        C19383o.m32797g(dVar4, "other");
        C1436d f = ClickableKt.m1300f(dVar4, c, this.$interactionSource, this.$indication, this.$enabled, this.$onClickLabel, this.$role, this.$onLongClickLabel, this.$onLongClick, this.$onClick);
        dVar2.mo5406H();
        return f;
    }
}
