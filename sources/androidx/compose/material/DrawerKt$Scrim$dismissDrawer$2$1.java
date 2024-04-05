package androidx.compose.material;

import androidx.compose.p015ui.semantics.C1908o;
import androidx.compose.p015ui.semantics.C1910q;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;

final class DrawerKt$Scrim$dismissDrawer$2$1 extends Lambda implements C19857l<C1910q, C19394m> {
    public final /* synthetic */ String $closeDrawer;
    public final /* synthetic */ C19846a<C19394m> $onClose;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$Scrim$dismissDrawer$2$1(String str, C19846a<C19394m> aVar) {
        super(1);
        this.$closeDrawer = str;
        this.$onClose = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1910q) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1910q qVar) {
        C19383o.m32797g(qVar, "$this$semantics");
        C1908o.m4200g(qVar, this.$closeDrawer);
        final C19846a<C19394m> aVar = this.$onClose;
        C1908o.m4198e(qVar, (String) null, new C19846a<Boolean>() {
            public final Boolean invoke() {
                aVar.invoke();
                return Boolean.TRUE;
            }
        });
    }
}
