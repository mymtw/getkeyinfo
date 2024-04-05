package p340ea;

import android.annotation.SuppressLint;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.util.C8890e0;
import kotlin.jvm.internal.C19383o;
import p028b9.C3506b;
import p145io.reactivex.internal.operators.single.C19206h;
import p402n9.C13088h;
import p409o9.C13138q;
import p456ua.C13461f;
import p463v9.C13536a;

@SuppressLint({"CheckResult"})
/* renamed from: ea.n */
public final class C12673n {

    /* renamed from: a */
    public final C13461f f27943a;

    /* renamed from: b */
    public final C12658b f27944b;

    /* renamed from: c */
    public final C13138q f27945c;

    /* renamed from: d */
    public final C8890e0 f27946d;

    /* renamed from: e */
    public final C8694h f27947e;

    public C12673n(C13461f fVar, C12658b bVar, C13138q qVar, C8890e0 e0Var, C8694h hVar) {
        this.f27943a = fVar;
        this.f27944b = bVar;
        this.f27945c = qVar;
        this.f27946d = e0Var;
        this.f27947e = hVar;
    }

    /* renamed from: a */
    public final void mo45449a(String str) {
        C19383o.m32797g(str, "message");
        C19206h hVar = new C19206h(new C12672m(this, str));
        this.f27943a.getClass();
        hVar.mo20660i(C13461f.m21235b()).mo20658g(new C13088h(1), new C3506b(1));
    }

    /* renamed from: b */
    public final void mo45450b(String str, String str2) {
        C19383o.m32797g(str2, "message");
        C19206h hVar = new C19206h(new C12669j(this, str, str2));
        this.f27943a.getClass();
        hVar.mo20660i(C13461f.m21235b()).mo20658g(new C12670k(), new C12671l(0));
    }

    /* renamed from: c */
    public final void mo45451c(String str, String str2) {
        C19383o.m32797g(str, "namespace");
        C19383o.m32797g(str2, "message");
        C19206h hVar = new C19206h(new C12667h(this, str, str2));
        this.f27943a.getClass();
        hVar.mo20660i(C13461f.m21235b()).mo20658g(new C12668i(0), new C13536a(1));
    }
}
