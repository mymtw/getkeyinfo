package p340ea;

import java.util.concurrent.Callable;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p340ea.C12674o;

/* renamed from: ea.j */
public final /* synthetic */ class C12669j implements Callable {

    /* renamed from: b */
    public final /* synthetic */ C12673n f27937b;

    /* renamed from: c */
    public final /* synthetic */ String f27938c;

    /* renamed from: d */
    public final /* synthetic */ String f27939d;

    public /* synthetic */ C12669j(C12673n nVar, String str, String str2) {
        this.f27937b = nVar;
        this.f27938c = str;
        this.f27939d = str2;
    }

    public final Object call() {
        C12673n nVar = this.f27937b;
        String str = this.f27938c;
        String str2 = this.f27939d;
        C19383o.m32797g(nVar, "this$0");
        C19383o.m32797g(str, "$namespace");
        C19383o.m32797g(str2, "$message");
        C12658b bVar = nVar.f27944b;
        String str3 = nVar.f27945c.f28897c;
        C19383o.m32796f(str3, "installInfo.packageName");
        String str4 = nVar.f27945c.f28896b;
        C19383o.m32796f(str4, "installInfo.version");
        String str5 = nVar.f27945c.f28895a;
        C19383o.m32796f(str5, "installInfo.uuid");
        nVar.f27946d.getClass();
        bVar.mo45441d(new C12663d(0, new C12657a(str3, str4, str5, System.currentTimeMillis(), new C12674o.C12675a(str, str2)).mo45436a()));
        return C19394m.f43287a;
    }
}
