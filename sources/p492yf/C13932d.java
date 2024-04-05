package p492yf;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import p401mg.C13080a;
import p492yf.C13923b;

/* renamed from: yf.d */
public final class C13932d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C13926c f30630b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f30631c;

    public C13932d(C13926c cVar) {
        C13923b.C13924a aVar = C13923b.C13924a.f30600b;
        this.f30630b = cVar;
        this.f30631c = aVar;
    }

    public final void run() {
        C13926c cVar;
        CopyOnWriteArraySet copyOnWriteArraySet;
        Class<C13926c> cls = C13926c.class;
        if (!C13080a.m20762b(this)) {
            try {
                cVar = this.f30630b;
                C13926c cVar2 = this.f30630b;
                copyOnWriteArraySet = null;
                if (!C13080a.m20762b(cls)) {
                    copyOnWriteArraySet = cVar2.f30608a;
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
                return;
            }
            ArrayList arrayList = new ArrayList(copyOnWriteArraySet);
            Runnable runnable = this.f30631c;
            if (!C13080a.m20762b(cls)) {
                try {
                    cVar.mo46736d(arrayList, runnable);
                } catch (Throwable th2) {
                    C13080a.m20761a(cls, th2);
                }
            }
        }
    }
}
