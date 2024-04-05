package com.zhuinden.simplestack;

import com.zhuinden.simplestack.C17518a;
import com.zhuinden.simplestack.PendingStateChange;
import java.util.Iterator;

/* renamed from: com.zhuinden.simplestack.h */
public final class C17531h {

    /* renamed from: a */
    public final /* synthetic */ PendingStateChange f38339a;

    /* renamed from: b */
    public final /* synthetic */ C17545o f38340b;

    /* renamed from: c */
    public final /* synthetic */ C17532i f38341c;

    public C17531h(C17532i iVar, PendingStateChange pendingStateChange, C17545o oVar) {
        this.f38341c = iVar;
        this.f38339a = pendingStateChange;
        this.f38340b = oVar;
    }

    /* renamed from: a */
    public final void mo68746a() {
        this.f38341c.mo68747a();
        PendingStateChange pendingStateChange = this.f38339a;
        if (!pendingStateChange.f38318g) {
            PendingStateChange.Status status = pendingStateChange.f38316e;
            PendingStateChange.Status status2 = PendingStateChange.Status.COMPLETED;
            if (status != status2) {
                C17532i iVar = this.f38341c;
                C17545o oVar = this.f38340b;
                if (iVar.f38344c == iVar.f38345d) {
                    iVar.f38345d = iVar.f38342a;
                }
                iVar.f38345d.clear();
                iVar.f38345d.addAll(oVar.f38379b);
                iVar.f38346e.removeFirst().mo68694a(status2);
                Iterator<C17518a.C17521c> it = iVar.f38349h.iterator();
                while (it.hasNext()) {
                    it.next().mo68707a(oVar);
                }
                iVar.mo68748b();
                return;
            }
            throw new IllegalStateException("State change completion cannot be called multiple times!");
        }
    }
}
