package p365hg;

import java.io.File;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C19394m;
import p365hg.C12889o;
import p453tf.C13418j;

/* renamed from: hg.q */
public final class C12901q implements C12889o.C12897f {

    /* renamed from: a */
    public final /* synthetic */ C12889o f28446a;

    /* renamed from: b */
    public final /* synthetic */ long f28447b;

    /* renamed from: c */
    public final /* synthetic */ File f28448c;

    /* renamed from: d */
    public final /* synthetic */ String f28449d;

    public C12901q(C12889o oVar, long j, File file, String str) {
        this.f28446a = oVar;
        this.f28447b = j;
        this.f28448c = file;
        this.f28449d = str;
    }

    public final void onClose() {
        if (this.f28447b < this.f28446a.f28431e.get()) {
            this.f28448c.delete();
            return;
        }
        C12889o oVar = this.f28446a;
        String str = this.f28449d;
        File file = this.f28448c;
        oVar.getClass();
        if (!file.renameTo(new File(oVar.f28427a, C12869i0.m20553I(str)))) {
            file.delete();
        }
        ReentrantLock reentrantLock = oVar.f28429c;
        reentrantLock.lock();
        try {
            if (!oVar.f28428b) {
                oVar.f28428b = true;
                C13418j.m21108d().execute(new C12902r(oVar));
            }
            C19394m mVar = C19394m.f43287a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
