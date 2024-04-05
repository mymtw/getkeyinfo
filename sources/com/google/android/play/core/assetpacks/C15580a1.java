package com.google.android.play.core.assetpacks;

import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.play.core.assetpacks.a1 */
public final /* synthetic */ class C15580a1 implements C15604g1 {

    /* renamed from: b */
    public final /* synthetic */ C15608h1 f35060b;

    /* renamed from: c */
    public final /* synthetic */ List f35061c;

    public /* synthetic */ C15580a1(C15608h1 h1Var, List list) {
        this.f35060b = h1Var;
        this.f35061c = list;
    }

    public final Object zza() {
        C15608h1 h1Var = this.f35060b;
        List list = this.f35061c;
        h1Var.getClass();
        HashMap hashMap = new HashMap();
        for (C15596e1 e1Var : h1Var.f35174e.values()) {
            String str = e1Var.f35123c.f35103a;
            if (list.contains(str)) {
                C15596e1 e1Var2 = (C15596e1) hashMap.get(str);
                if ((e1Var2 == null ? -1 : e1Var2.f35121a) < e1Var.f35121a) {
                    hashMap.put(str, e1Var);
                }
            }
        }
        return hashMap;
    }
}
