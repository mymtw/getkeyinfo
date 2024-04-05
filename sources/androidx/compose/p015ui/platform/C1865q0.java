package androidx.compose.p015ui.platform;

import android.graphics.Matrix;
import androidx.compose.foundation.layout.C0761x;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.platform.q0 */
public final class C1865q0<T> {

    /* renamed from: a */
    public final C19861p<T, Matrix, C19394m> f4121a;

    /* renamed from: b */
    public Matrix f4122b;

    /* renamed from: c */
    public Matrix f4123c;

    /* renamed from: d */
    public float[] f4124d;

    /* renamed from: e */
    public float[] f4125e;

    /* renamed from: f */
    public boolean f4126f = true;

    /* renamed from: g */
    public boolean f4127g = true;

    /* renamed from: h */
    public boolean f4128h = true;

    public C1865q0(C19861p<? super T, ? super Matrix, C19394m> pVar) {
        C19383o.m32797g(pVar, "getMatrix");
        this.f4121a = pVar;
    }

    /* renamed from: a */
    public final float[] mo7274a(T t) {
        float[] fArr = this.f4125e;
        if (fArr == null) {
            fArr = C0761x.m1671I();
            this.f4125e = fArr;
        }
        if (this.f4127g) {
            this.f4128h = C15588c1.m25342q0(mo7275b(t), fArr);
            this.f4127g = false;
        }
        if (this.f4128h) {
            return fArr;
        }
        return null;
    }

    /* renamed from: b */
    public final float[] mo7275b(T t) {
        float[] fArr = this.f4124d;
        if (fArr == null) {
            fArr = C0761x.m1671I();
            this.f4124d = fArr;
        }
        if (!this.f4126f) {
            return fArr;
        }
        Matrix matrix = this.f4122b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f4122b = matrix;
        }
        this.f4121a.invoke(t, matrix);
        Matrix matrix2 = this.f4123c;
        if (matrix2 == null || !C19383o.m32792b(matrix, matrix2)) {
            C18263b.m30855m0(matrix, fArr);
            this.f4122b = matrix2;
            this.f4123c = matrix;
        }
        this.f4126f = false;
        return fArr;
    }

    /* renamed from: c */
    public final void mo7276c() {
        this.f4126f = true;
        this.f4127g = true;
    }
}
