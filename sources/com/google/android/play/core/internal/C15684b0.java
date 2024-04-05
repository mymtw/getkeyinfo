package com.google.android.play.core.internal;

/* renamed from: com.google.android.play.core.internal.b0 */
public final class C15684b0 implements C15686c0, C15714z {

    /* renamed from: d */
    public static final Object f35443d = new Object();

    /* renamed from: b */
    public volatile C15686c0 f35444b;

    /* renamed from: c */
    public volatile Object f35445c = f35443d;

    public C15684b0(C15686c0 c0Var) {
        this.f35444b = c0Var;
    }

    /* renamed from: a */
    public static C15714z m25502a(C15686c0 c0Var) {
        if (c0Var instanceof C15714z) {
            return (C15714z) c0Var;
        }
        c0Var.getClass();
        return new C15684b0(c0Var);
    }

    /* renamed from: b */
    public static C15686c0 m25503b(C15686c0 c0Var) {
        return c0Var instanceof C15684b0 ? c0Var : new C15684b0(c0Var);
    }

    public final Object zza() {
        Object obj = this.f35445c;
        Object obj2 = f35443d;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f35445c;
                if (obj == obj2) {
                    obj = this.f35444b.zza();
                    Object obj3 = this.f35445c;
                    if (obj3 != obj2) {
                        if (obj3 != obj) {
                            String valueOf = String.valueOf(obj3);
                            String valueOf2 = String.valueOf(obj);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 118 + valueOf2.length());
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(valueOf);
                            sb.append(" & ");
                            sb.append(valueOf2);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.f35445c = obj;
                    this.f35444b = null;
                }
            }
        }
        return obj;
    }
}
