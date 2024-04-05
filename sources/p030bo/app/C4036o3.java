package p030bo.app;

import kotlin.jvm.internal.C19383o;

/* renamed from: bo.app.o3 */
public final class C4036o3 extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4036o3(String str, Throwable th) {
        super(str, th);
        C19383o.m32797g(str, "message");
        C19383o.m32797g(th, "innerException");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4036o3(String str) {
        super(str);
        C19383o.m32797g(str, "message");
    }
}
