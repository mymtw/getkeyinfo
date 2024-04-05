package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.p054a;

import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;
import p267v7.C8217e;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.a.c */
public class C6162c extends BasicPermission {

    /* renamed from: a */
    private final String f13297a;

    /* renamed from: b */
    private final int f13298b;

    public C6162c(String str, String str2) {
        super(str, str2);
        this.f13297a = str2;
        StringTokenizer stringTokenizer = new StringTokenizer(C8217e.m16510b(str2), " ,");
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals("threadlocalecimplicitlyca")) {
                i |= 1;
            } else if (nextToken.equals("ecimplicitlyca")) {
                i |= 2;
            } else if (nextToken.equals("threadlocaldhdefaultparams")) {
                i |= 4;
            } else if (nextToken.equals("dhdefaultparams")) {
                i |= 8;
            } else if (nextToken.equals("acceptableeccurves")) {
                i |= 16;
            } else if (nextToken.equals("additionalecparameters")) {
                i |= 32;
            } else if (nextToken.equals("all")) {
                i |= 63;
            }
        }
        if (i != 0) {
            this.f13298b = i;
            return;
        }
        throw new IllegalArgumentException("unknown permissions passed to mask");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6162c)) {
            return false;
        }
        C6162c cVar = (C6162c) obj;
        return this.f13298b == cVar.f13298b && getName().equals(cVar.getName());
    }

    public String getActions() {
        return this.f13297a;
    }

    public int hashCode() {
        return getName().hashCode() + this.f13298b;
    }

    public boolean implies(Permission permission) {
        if (!(permission instanceof C6162c) || !getName().equals(permission.getName())) {
            return false;
        }
        int i = this.f13298b;
        int i2 = ((C6162c) permission).f13298b;
        return (i & i2) == i2;
    }
}
