package p244t5;

import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.C6148s;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: t5.i */
public final class C7985i implements C8011q1 {

    /* renamed from: b */
    public C8033x1 f17471b;

    public C7985i(C8033x1 x1Var) {
        this.f17471b = x1Var;
    }

    /* renamed from: b */
    public final InputStream mo20530b() {
        return new C8006p(this.f17471b);
    }

    /* renamed from: e */
    public final C8018s1 mo20527e() {
        InputStream b = mo20530b();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT];
        while (true) {
            int read = b.read(bArr, 0, RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT);
            if (read < 0) {
                return new C7981h(byteArrayOutputStream.toByteArray());
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
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
