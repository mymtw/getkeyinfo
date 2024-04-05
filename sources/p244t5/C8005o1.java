package p244t5;

import java.io.ByteArrayOutputStream;

/* renamed from: t5.o1 */
public abstract class C8005o1 implements C7984h1 {
    /* renamed from: a */
    public final byte[] mo20561a(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (str.equals("DER")) {
            byteArrayOutputStream = new ByteArrayOutputStream();
            new C7970d0(byteArrayOutputStream).mo20535d(this);
        } else if (!str.equals("DL")) {
            return mo19527c();
        } else {
            byteArrayOutputStream = new ByteArrayOutputStream();
            new C8017s0(byteArrayOutputStream).mo20535d(this);
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: c */
    public byte[] mo19527c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new C8014r1(byteArrayOutputStream).mo20535d(this);
        return byteArrayOutputStream.toByteArray();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7984h1)) {
            return false;
        }
        return mo12996i().equals(((C7984h1) obj).mo12996i());
    }

    public int hashCode() {
        return mo12996i().hashCode();
    }

    /* renamed from: i */
    public abstract C8018s1 mo12996i();
}
