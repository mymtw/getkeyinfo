package p186n2;

import android.content.res.Resources;
import com.bumptech.glide.load.engine.C6051s;
import com.bumptech.glide.load.resource.bitmap.C6102t;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6177d;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6191n;
import p150j4.C7114e;
import p264v4.C8203c;

/* renamed from: n2.x */
public final class C7438x implements C8203c {

    /* renamed from: b */
    public final Object f16623b;

    public C7438x(C6191n nVar, byte[][] bArr) {
        boolean z;
        if (nVar != null) {
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= bArr.length) {
                    z = false;
                    break;
                } else if (bArr[i2] == null) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                throw new NullPointerException("publicKey byte array == null");
            } else if (bArr.length == nVar.f13465d) {
                while (i < bArr.length) {
                    if (bArr[i].length == nVar.f13463b) {
                        i++;
                    } else {
                        throw new IllegalArgumentException("wrong publicKey format");
                    }
                }
                this.f16623b = C6177d.m12381g(bArr);
            } else {
                throw new IllegalArgumentException("wrong publicKey size");
            }
        } else {
            throw new NullPointerException("params == null");
        }
    }

    /* renamed from: k */
    public final C6051s mo4161k(C6051s sVar, C7114e eVar) {
        Resources resources = (Resources) this.f16623b;
        if (sVar == null) {
            return null;
        }
        return new C6102t(resources, sVar);
    }

    public /* synthetic */ C7438x(Resources resources) {
        this.f16623b = resources;
    }
}
