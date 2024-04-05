package androidx.compose.foundation;

import androidx.compose.p015ui.semantics.C1894a;
import androidx.compose.p015ui.semantics.C1900g;
import androidx.compose.p015ui.semantics.C1902i;
import androidx.compose.p015ui.semantics.C1908o;
import androidx.compose.p015ui.semantics.C1910q;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;

final class ClickableKt$genericClickableWithoutGesture$clickSemantics$1 extends Lambda implements C19857l<C1910q, C19394m> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C19846a<C19394m> $onClick;
    public final /* synthetic */ String $onClickLabel;
    public final /* synthetic */ C19846a<C19394m> $onLongClick;
    public final /* synthetic */ String $onLongClickLabel;
    public final /* synthetic */ C1900g $role;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableKt$genericClickableWithoutGesture$clickSemantics$1(C1900g gVar, String str, C19846a<C19394m> aVar, String str2, boolean z, C19846a<C19394m> aVar2) {
        super(1);
        this.$role = gVar;
        this.$onClickLabel = str;
        this.$onLongClick = aVar;
        this.$onLongClickLabel = str2;
        this.$enabled = z;
        this.$onClick = aVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1910q) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1910q qVar) {
        C19383o.m32797g(qVar, "$this$semantics");
        C1900g gVar = this.$role;
        if (gVar != null) {
            C1908o.m4202i(qVar, gVar.f4226a);
        }
        String str = this.$onClickLabel;
        final C19846a<C19394m> aVar = this.$onClick;
        C1908o.m4198e(qVar, str, new C19846a<Boolean>() {
            public final Boolean invoke() {
                aVar.invoke();
                return Boolean.TRUE;
            }
        });
        final C19846a<C19394m> aVar2 = this.$onLongClick;
        if (aVar2 != null) {
            qVar.mo7342a(C1902i.f4232c, new C1894a(this.$onLongClickLabel, new C19846a<Boolean>() {
                public final Boolean invoke() {
                    aVar2.invoke();
                    return Boolean.TRUE;
                }
            }));
        }
        if (!this.$enabled) {
            C1908o.m4195b(qVar);
        }
    }
}
