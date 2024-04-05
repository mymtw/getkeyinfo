package p244t5;

import android.support.p013v4.media.C0072d;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.C6148s;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: t5.c0 */
public final class C7967c0 implements C8011q1 {

    /* renamed from: b */
    public C8029w0 f17448b;

    public C7967c0(C8029w0 w0Var) {
        this.f17448b = w0Var;
    }

    /* renamed from: b */
    public final InputStream mo20530b() {
        return this.f17448b;
    }

    /* renamed from: e */
    public final C8018s1 mo20527e() {
        return new C7964b0(this.f17448b.mo20583d());
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        try {
            return mo20527e();
        } catch (IOException e) {
            StringBuilder h = C0072d.m201h("IOException converting stream to byte array: ");
            h.append(e.getMessage());
            throw new C6148s(h.toString(), e);
        }
    }
}
