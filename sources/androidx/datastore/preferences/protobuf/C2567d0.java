package androidx.datastore.preferences.protobuf;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import java.nio.charset.Charset;

/* renamed from: androidx.datastore.preferences.protobuf.d0 */
public final class C2567d0 {

    /* renamed from: b */
    public static final C2568a f5846b = new C2568a();

    /* renamed from: a */
    public final C2600j0 f5847a;

    /* renamed from: androidx.datastore.preferences.protobuf.d0$a */
    public static class C2568a implements C2600j0 {
        /* renamed from: a */
        public final C2596i0 mo9620a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        /* renamed from: b */
        public final boolean mo9621b(Class<?> cls) {
            return false;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.d0$b */
    public static class C2569b implements C2600j0 {

        /* renamed from: a */
        public C2600j0[] f5848a;

        public C2569b(C2600j0... j0VarArr) {
            this.f5848a = j0VarArr;
        }

        /* renamed from: a */
        public final C2596i0 mo9620a(Class<?> cls) {
            for (C2600j0 j0Var : this.f5848a) {
                if (j0Var.mo9621b(cls)) {
                    return j0Var.mo9620a(cls);
                }
            }
            throw new UnsupportedOperationException(C0326j.m862g(cls, C0072d.m201h("No factory is available for message type: ")));
        }

        /* renamed from: b */
        public final boolean mo9621b(Class<?> cls) {
            for (C2600j0 b : this.f5848a) {
                if (b.mo9621b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C2567d0() {
        C2600j0 j0Var;
        C2600j0[] j0VarArr = new C2600j0[2];
        j0VarArr[0] = C2627u.f5964a;
        try {
            j0Var = (C2600j0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            j0Var = f5846b;
        }
        j0VarArr[1] = j0Var;
        C2569b bVar = new C2569b(j0VarArr);
        Charset charset = C2631w.f5973a;
        this.f5847a = bVar;
    }
}
