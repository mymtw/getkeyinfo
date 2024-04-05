package p616ln;

import com.google.firebase.perf.p530v1.ApplicationProcessState;
import com.google.firebase.perf.p530v1.C16669g;
import com.google.firebase.perf.p530v1.C16676i;

/* renamed from: ln.d */
public final /* synthetic */ class C18206d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C18208f f39875b;

    /* renamed from: c */
    public final /* synthetic */ C16676i f39876c;

    /* renamed from: d */
    public final /* synthetic */ ApplicationProcessState f39877d;

    public /* synthetic */ C18206d(C18208f fVar, C16676i iVar, ApplicationProcessState applicationProcessState) {
        this.f39875b = fVar;
        this.f39876c = iVar;
        this.f39877d = applicationProcessState;
    }

    public final void run() {
        C18208f fVar = this.f39875b;
        C16676i iVar = this.f39876c;
        ApplicationProcessState applicationProcessState = this.f39877d;
        fVar.getClass();
        C16669g.C16671b F = C16669g.m27601F();
        F.mo59761u();
        C16669g.m27599B((C16669g) F.f37158c, iVar);
        fVar.mo69737d(F, applicationProcessState);
    }
}
