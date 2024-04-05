package p077d1;

import com.google.android.play.core.assetpacks.C15604g1;
import com.google.android.play.core.assetpacks.C15608h1;

/* renamed from: d1.e */
public class C6621e implements C6620d, C15604g1 {

    /* renamed from: b */
    public int f14608b;

    /* renamed from: c */
    public final Object f14609c;

    public /* synthetic */ C6621e(int i) {
        if (i > 0) {
            this.f14609c = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: a */
    public boolean mo18806a(Object obj) {
        int i;
        boolean z;
        int i2 = 0;
        while (true) {
            i = this.f14608b;
            if (i2 >= i) {
                z = false;
                break;
            } else if (((Object[]) this.f14609c)[i2] == obj) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (!z) {
            Object obj2 = this.f14609c;
            if (i >= ((Object[]) obj2).length) {
                return false;
            }
            ((Object[]) obj2)[i] = obj;
            this.f14608b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    /* renamed from: b */
    public Object mo18807b() {
        int i = this.f14608b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object obj = this.f14609c;
        Object obj2 = ((Object[]) obj)[i2];
        ((Object[]) obj)[i2] = null;
        this.f14608b = i - 1;
        return obj2;
    }

    public final Object zza() {
        ((C15608h1) this.f14609c).mo55409a(this.f14608b);
        return null;
    }
}
