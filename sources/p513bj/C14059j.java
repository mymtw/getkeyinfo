package p513bj;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
import p513bj.C14055g;
import p513bj.C14060k;

/* renamed from: bj.j */
public final /* synthetic */ class C14059j implements Handler.Callback {

    /* renamed from: b */
    public final /* synthetic */ C14060k f30939b;

    public /* synthetic */ C14059j(C14060k kVar) {
        this.f30939b = kVar;
    }

    public final boolean handleMessage(Message message) {
        C14060k kVar = this.f30939b;
        kVar.getClass();
        int i = message.what;
        if (i == 0) {
            Iterator<C14060k.C14063c<T>> it = kVar.f30943d.iterator();
            while (it.hasNext()) {
                C14060k.C14063c next = it.next();
                C14060k.C14062b<T> bVar = kVar.f30942c;
                if (!next.f30950d && next.f30949c) {
                    C14055g b = next.f30948b.mo46879b();
                    next.f30948b = new C14055g.C14056a();
                    next.f30949c = false;
                    bVar.mo36b(next.f30947a, b);
                }
                if (((C14083w) kVar.f30941b).f31011a.hasMessages(0)) {
                    break;
                }
            }
        } else if (i == 1) {
            kVar.mo46883b(message.arg1, (C14060k.C14061a) message.obj);
            kVar.mo46882a();
            kVar.mo46884c();
        }
        return true;
    }
}
