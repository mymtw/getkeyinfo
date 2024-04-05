package com.cardinalcommerce.dependencies.internal.nimbusds.jose;

import androidx.recyclerview.widget.RecyclerView;

public final class EncryptionMethod extends C6236a {

    /* renamed from: b */
    public static final EncryptionMethod f13566b;

    /* renamed from: c */
    public static final EncryptionMethod f13567c;

    /* renamed from: d */
    public static final EncryptionMethod f13568d;

    /* renamed from: e */
    public static final EncryptionMethod f13569e;

    /* renamed from: f */
    public static final EncryptionMethod f13570f;

    /* renamed from: g */
    public static final EncryptionMethod f13571g;

    /* renamed from: h */
    public static final EncryptionMethod f13572h;

    /* renamed from: i */
    public static final EncryptionMethod f13573i;

    /* renamed from: j */
    private final int f13574j;

    static {
        C6255m mVar = C6255m.REQUIRED;
        f13566b = new EncryptionMethod("A128CBC-HS256", mVar, 256);
        C6255m mVar2 = C6255m.OPTIONAL;
        f13567c = new EncryptionMethod("A192CBC-HS384", mVar2, 384);
        f13568d = new EncryptionMethod("A256CBC-HS512", mVar, RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN);
        f13569e = new EncryptionMethod("A128CBC+HS256", mVar2, 256);
        f13570f = new EncryptionMethod("A256CBC+HS512", mVar2, RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN);
        C6255m mVar3 = C6255m.RECOMMENDED;
        f13571g = new EncryptionMethod("A128GCM", mVar3, 128);
        f13572h = new EncryptionMethod("A192GCM", mVar2, 192);
        f13573i = new EncryptionMethod("A256GCM", mVar3, 256);
    }

    public EncryptionMethod(String str) {
        this(str, (C6255m) null, 0);
    }

    public EncryptionMethod(String str, C6255m mVar, int i) {
        super(str, mVar);
        this.f13574j = i;
    }

    /* renamed from: b */
    public static EncryptionMethod m12449b(String str) {
        EncryptionMethod encryptionMethod = f13566b;
        if (str.equals(encryptionMethod.mo17701a())) {
            return encryptionMethod;
        }
        EncryptionMethod encryptionMethod2 = f13567c;
        if (str.equals(encryptionMethod2.mo17701a())) {
            return encryptionMethod2;
        }
        EncryptionMethod encryptionMethod3 = f13568d;
        if (str.equals(encryptionMethod3.mo17701a())) {
            return encryptionMethod3;
        }
        EncryptionMethod encryptionMethod4 = f13571g;
        if (str.equals(encryptionMethod4.mo17701a())) {
            return encryptionMethod4;
        }
        EncryptionMethod encryptionMethod5 = f13572h;
        if (str.equals(encryptionMethod5.mo17701a())) {
            return encryptionMethod5;
        }
        EncryptionMethod encryptionMethod6 = f13573i;
        if (str.equals(encryptionMethod6.mo17701a())) {
            return encryptionMethod6;
        }
        EncryptionMethod encryptionMethod7 = f13569e;
        if (str.equals(encryptionMethod7.mo17701a())) {
            return encryptionMethod7;
        }
        EncryptionMethod encryptionMethod8 = f13570f;
        return str.equals(encryptionMethod8.mo17701a()) ? encryptionMethod8 : new EncryptionMethod(str);
    }

    /* renamed from: b */
    public int mo17676b() {
        return this.f13574j;
    }
}
