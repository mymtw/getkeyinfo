package p340ea;

import java.util.concurrent.Callable;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p340ea.C12674o;

/* renamed from: ea.e */
public final /* synthetic */ class C12664e implements Callable {

    /* renamed from: b */
    public final /* synthetic */ C12673n f27929b;

    /* renamed from: c */
    public final /* synthetic */ String f27930c;

    public /* synthetic */ C12664e(C12673n nVar, String str) {
        this.f27929b = nVar;
        this.f27930c = str;
    }

    public final Object call() {
        C12673n nVar = this.f27929b;
        String str = this.f27930c;
        C19383o.m32797g(nVar, "this$0");
        C19383o.m32797g(str, "$message");
        C12658b bVar = nVar.f27944b;
        String str2 = nVar.f27945c.f28897c;
        C19383o.m32796f(str2, "installInfo.packageName");
        String str3 = nVar.f27945c.f28896b;
        C19383o.m32796f(str3, "installInfo.version");
        String str4 = nVar.f27945c.f28895a;
        C19383o.m32796f(str4, "installInfo.uuid");
        nVar.f27946d.getClass();
        bVar.mo45441d(new C12663d(0, new C12657a(str2, str3, str4, System.currentTimeMillis(), new C12674o.C12676b("ElkLogger$info", str)).mo45436a()));
        return C19394m.f43287a;
    }
}
