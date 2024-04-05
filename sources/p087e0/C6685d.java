package p087e0;

import com.appboy.Constants;
import kotlin.jvm.internal.C19383o;

/* renamed from: e0.d */
public final class C6685d {

    /* renamed from: a */
    public final int f14749a;

    /* renamed from: b */
    public final Float[] f14750b;

    public C6685d(int i) {
        this.f14749a = i;
        Float[] fArr = new Float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = Float.valueOf(0.0f);
        }
        this.f14750b = fArr;
    }

    /* renamed from: a */
    public final float mo18845a(C6685d dVar) {
        C19383o.m32797g(dVar, Constants.APPBOY_PUSH_CONTENT_KEY);
        int i = this.f14749a;
        float f = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            f += dVar.f14750b[i2].floatValue() * this.f14750b[i2].floatValue();
        }
        return f;
    }
}
