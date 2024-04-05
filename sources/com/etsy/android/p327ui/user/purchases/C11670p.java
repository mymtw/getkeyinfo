package com.etsy.android.p327ui.user.purchases;

import com.etsy.android.p327ui.user.purchases.module.C11666g;
import java.util.ArrayList;
import kotlin.C19394m;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import p400mf.C13074b;
import p400mf.C13078c;

/* renamed from: com.etsy.android.ui.user.purchases.p */
public final class C11670p implements C13078c {

    /* renamed from: a */
    public final /* synthetic */ C11672r f25837a;

    public C11670p(C11672r rVar) {
        this.f25837a = rVar;
    }

    /* renamed from: a */
    public final void mo31411a(C13074b bVar) {
        C19383o.m32797g(bVar, "update");
        boolean z = false;
        if (bVar instanceof C13074b.C13076b) {
            C11679u uVar = this.f25837a.f25839b;
            C13074b.C13076b bVar2 = (C13074b.C13076b) bVar;
            uVar.getClass();
            ArrayList<C11666g> b = C11679u.m19385b(uVar.mo37790c(), bVar2.f28749a);
            if (b != null) {
                ArrayList arrayList = new ArrayList(C19322o.m32624F0(b));
                for (C11666g gVar : b) {
                    gVar.f25826e = bVar2.f28750b;
                    arrayList.add(C19394m.f43287a);
                    z = true;
                }
            }
            if (z) {
                this.f25837a.f25838a.updateModuleListItem();
            }
        } else if (bVar instanceof C13074b.C13075a) {
            C11679u uVar2 = this.f25837a.f25839b;
            C13074b.C13075a aVar = (C13074b.C13075a) bVar;
            uVar2.getClass();
            ArrayList<C11666g> b2 = C11679u.m19385b(uVar2.mo37790c(), aVar.f28745a);
            if (b2 != null) {
                ArrayList arrayList2 = new ArrayList(C19322o.m32624F0(b2));
                for (C11666g gVar2 : b2) {
                    gVar2.f25827f = aVar.f28746b;
                    arrayList2.add(C19394m.f43287a);
                    z = true;
                }
            }
            if (z) {
                this.f25837a.f25838a.updateModuleListItem();
            }
        }
    }
}
