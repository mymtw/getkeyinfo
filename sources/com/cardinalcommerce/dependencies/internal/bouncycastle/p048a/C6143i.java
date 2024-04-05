package com.cardinalcommerce.dependencies.internal.bouncycastle.p048a;

import java.security.Permission;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.a.i */
public class C6143i extends Permission {

    /* renamed from: a */
    private final Set<String> f13283a;

    public C6143i(String str) {
        super(str);
        HashSet hashSet = new HashSet();
        this.f13283a = hashSet;
        hashSet.add(str);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6143i) && this.f13283a.equals(((C6143i) obj).f13283a);
    }

    public String getActions() {
        return this.f13283a.toString();
    }

    public int hashCode() {
        return this.f13283a.hashCode();
    }

    public boolean implies(Permission permission) {
        if (!(permission instanceof C6143i)) {
            return false;
        }
        C6143i iVar = (C6143i) permission;
        return getName().equals(iVar.getName()) || this.f13283a.containsAll(iVar.f13283a);
    }
}
