package com.google.android.gms.internal.icing;

import android.support.p013v4.media.C0069a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.icing.f */
public final class C14494f extends C14491e0<C14494f, C14482c> implements C14484c1 {
    /* access modifiers changed from: private */
    public static final C14494f zze;
    private C14511j0<C14490e> zzb = C14516k1.f32657e;

    static {
        C14494f fVar = new C14494f();
        zze = fVar;
        C14491e0.m22950g(C14494f.class, fVar);
    }

    /* renamed from: i */
    public static C14482c m22989i() {
        return (C14482c) ((C14479b0) zze.mo49756e(5));
    }

    /* renamed from: k */
    public static void m22991k(C14494f fVar, List list) {
        C14511j0<C14490e> j0Var = fVar.zzb;
        if (!j0Var.zza()) {
            int size = j0Var.size();
            fVar.zzb = j0Var.mo49798r(size == 0 ? 10 : size + size);
        }
        C14511j0<C14490e> j0Var2 = fVar.zzb;
        Charset charset = C14515k0.f32655a;
        list.getClass();
        if (list instanceof C14527n0) {
            List<?> zzh = ((C14527n0) list).zzh();
            C14527n0 n0Var = (C14527n0) j0Var2;
            int size2 = j0Var2.size();
            for (Object next : zzh) {
                if (next == null) {
                    int size3 = n0Var.size();
                    StringBuilder g = C0069a.m176g(37, "Element at index ");
                    g.append(size3 - size2);
                    g.append(" is null.");
                    String sb = g.toString();
                    int size4 = n0Var.size();
                    while (true) {
                        size4--;
                        if (size4 >= size2) {
                            n0Var.remove(size4);
                        } else {
                            throw new NullPointerException(sb);
                        }
                    }
                } else if (next instanceof zzcf) {
                    n0Var.mo49752u((zzcf) next);
                } else {
                    n0Var.add((String) next);
                }
            }
        } else if (!(list instanceof C14508i1)) {
            if (j0Var2 instanceof ArrayList) {
                ((ArrayList) j0Var2).ensureCapacity(list.size() + j0Var2.size());
            }
            int size5 = j0Var2.size();
            for (Object next2 : list) {
                if (next2 == null) {
                    int size6 = j0Var2.size();
                    StringBuilder g2 = C0069a.m176g(37, "Element at index ");
                    g2.append(size6 - size5);
                    g2.append(" is null.");
                    String sb2 = g2.toString();
                    int size7 = j0Var2.size();
                    while (true) {
                        size7--;
                        if (size7 >= size5) {
                            j0Var2.remove(size7);
                        } else {
                            throw new NullPointerException(sb2);
                        }
                    }
                } else {
                    j0Var2.add(next2);
                }
            }
        } else {
            j0Var2.addAll(list);
        }
    }

    /* renamed from: e */
    public final Object mo49756e(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C14520l1(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", C14490e.class});
        } else if (i2 == 3) {
            return new C14494f();
        } else {
            if (i2 == 4) {
                return new C14482c(0);
            }
            if (i2 != 5) {
                return null;
            }
            return zze;
        }
    }
}
