package p415of;

import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.stylekit.views.CollageCheckbox;
import java.util.Iterator;
import kotlin.jvm.internal.C19383o;

/* renamed from: of.f */
public final class C13177f implements CollageCheckbox.C9027c {

    /* renamed from: a */
    public final /* synthetic */ C13178g f29000a;

    public C13177f(C13178g gVar) {
        this.f29000a = gVar;
    }

    /* renamed from: a */
    public final void mo30790a(boolean z, CollageCheckbox collageCheckbox) {
        T t;
        C19383o.m32797g(collageCheckbox, "selectedButton");
        if (z) {
            C13178g gVar = this.f29000a;
            gVar.f29006f.mo21333d("add_gift_wrap_checked", C13178g.m20856a(gVar));
        }
        C13178g gVar2 = this.f29000a;
        Iterator<T> it = gVar2.f29004d.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C19383o.m32792b(((ServerDrivenAction) t).getType(), "gift_wrap")) {
                break;
            }
        }
        ServerDrivenAction serverDrivenAction = (ServerDrivenAction) t;
        if (serverDrivenAction != null) {
            serverDrivenAction.addParam("value", String.valueOf(z));
            gVar2.f29005e.mo31328c(serverDrivenAction);
        }
    }
}
