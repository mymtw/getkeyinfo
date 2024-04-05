package p689ul;

import java.util.concurrent.ExecutionException;

/* renamed from: ul.f */
public final class C18608f {
    /* renamed from: a */
    public static <ResultT> ResultT m31380a(C18606d<ResultT> dVar) throws ExecutionException, InterruptedException {
        if (dVar == null) {
            throw new NullPointerException("Task must not be null");
        } else if (!dVar.mo70120g()) {
            C18618p pVar = new C18618p();
            C18615m mVar = C18607e.f41091b;
            dVar.mo70116c(mVar, pVar);
            dVar.mo70114a(mVar, pVar);
            pVar.f41111b.await();
            if (dVar.mo70121h()) {
                return dVar.mo70119f();
            }
            throw new ExecutionException(dVar.mo70118e());
        } else if (dVar.mo70121h()) {
            return dVar.mo70119f();
        } else {
            throw new ExecutionException(dVar.mo70118e());
        }
    }
}
