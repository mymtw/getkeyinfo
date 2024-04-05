package p415of;

import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.stylekit.views.CollageCheckbox;
import java.util.Iterator;
import kotlin.jvm.internal.C19383o;

/* renamed from: of.d */
public final class C13175d implements CollageCheckbox.C9027c {

    /* renamed from: a */
    public final /* synthetic */ C13178g f28998a;

    public C13175d(C13178g gVar) {
        this.f28998a = gVar;
    }

    /* renamed from: a */
    public final void mo30790a(boolean z, CollageCheckbox collageCheckbox) {
        T t;
        C19383o.m32797g(collageCheckbox, "selectedButton");
        if (z) {
            this.f28998a.mo45899d();
            C13178g gVar = this.f28998a;
            Iterator<T> it = gVar.f29004d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C19383o.m32792b(((ServerDrivenAction) t).getType(), "is_gift")) {
                    break;
                }
            }
            ServerDrivenAction serverDrivenAction = (ServerDrivenAction) t;
            if (serverDrivenAction != null) {
                serverDrivenAction.addParam("value", String.valueOf(z));
                gVar.f29005e.mo31328c(serverDrivenAction);
            }
            C13178g gVar2 = this.f28998a;
            gVar2.f29006f.mo21333d("order_marked_as_gift", C13178g.m20856a(gVar2));
            return;
        }
        C13178g gVar3 = this.f28998a;
        ViewExtensions.m12860d(gVar3.f29008h);
        ViewExtensions.m12860d(gVar3.f29009i);
        ViewExtensions.m12860d(gVar3.f29010j);
    }
}
