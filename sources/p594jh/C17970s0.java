package p594jh;

import com.google.android.exoplayer2.source.C14344i;
import com.google.common.collect.ImmutableList;
import p602kh.C18086u0;

/* renamed from: jh.s0 */
public final /* synthetic */ class C17970s0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C17972t0 f39258b;

    /* renamed from: c */
    public final /* synthetic */ ImmutableList.C15953a f39259c;

    /* renamed from: d */
    public final /* synthetic */ C14344i.C14345a f39260d;

    public /* synthetic */ C17970s0(C17972t0 t0Var, ImmutableList.C15953a aVar, C14344i.C14345a aVar2) {
        this.f39258b = t0Var;
        this.f39259c = aVar;
        this.f39260d = aVar2;
    }

    public final void run() {
        C17972t0 t0Var = this.f39258b;
        ImmutableList.C15953a aVar = this.f39259c;
        C14344i.C14345a aVar2 = this.f39260d;
        C18086u0 u0Var = t0Var.f39264c;
        ImmutableList e = aVar.mo56664e();
        C18086u0.C18087a aVar3 = u0Var.f39481d;
        C17884a1 a1Var = u0Var.f39484g;
        a1Var.getClass();
        aVar3.getClass();
        aVar3.f39487b = ImmutableList.copyOf(e);
        if (!e.isEmpty()) {
            aVar3.f39490e = (C14344i.C14345a) e.get(0);
            aVar2.getClass();
            aVar3.f39491f = aVar2;
        }
        if (aVar3.f39489d == null) {
            aVar3.f39489d = C18086u0.C18087a.m30547b(a1Var, aVar3.f39487b, aVar3.f39490e, aVar3.f39486a);
        }
        aVar3.mo69623d(a1Var.mo69338r());
    }
}
