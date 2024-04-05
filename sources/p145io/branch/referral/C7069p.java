package p145io.branch.referral;

import android.content.DialogInterface;
import p145io.branch.referral.C7063o;

/* renamed from: io.branch.referral.p */
public final class C7069p implements DialogInterface.OnDismissListener {

    /* renamed from: b */
    public final /* synthetic */ C7063o.C7066c f15739b;

    /* renamed from: c */
    public final /* synthetic */ C7063o.C7065b f15740c;

    /* renamed from: d */
    public final /* synthetic */ C7063o f15741d;

    public C7069p(C7063o oVar, C7063o.C7066c cVar, C7063o.C7065b bVar) {
        this.f15741d = oVar;
        this.f15739b = cVar;
        this.f15740c = bVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C7063o oVar = this.f15741d;
        oVar.f15719a = false;
        oVar.f15725g = null;
        C7063o.C7066c cVar = this.f15739b;
        if (cVar == null) {
            return;
        }
        if (oVar.f15720b) {
            C7063o.C7065b bVar = this.f15740c;
            String str = bVar.f15731b;
            String str2 = bVar.f15730a;
            Branch branch = (Branch) cVar;
            branch.getClass();
            if (C7087w.m13721t(str)) {
                branch.mo19194c();
                return;
            }
            return;
        }
        C7063o.C7065b bVar2 = this.f15740c;
        String str3 = bVar2.f15731b;
        String str4 = bVar2.f15730a;
        Branch branch2 = (Branch) cVar;
        branch2.getClass();
        if (C7087w.m13721t(str3)) {
            branch2.mo19194c();
        }
    }
}
