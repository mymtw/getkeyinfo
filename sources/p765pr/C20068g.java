package p765pr;

import androidx.compose.animation.C0388a;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p248tp.C8048a;
import p248tp.C8054g;
import p248tp.C8057j;
import p248tp.C8061n;
import p248tp.C8066r;
import p248tp.C8071s;
import retrofit2.C20085a0;
import retrofit2.C20090c;
import retrofit2.C20145v;

/* renamed from: pr.g */
public final class C20068g extends C20090c.C20091a {

    /* renamed from: a */
    public final C8066r f44446a = null;

    /* renamed from: b */
    public final boolean f44447b = false;

    /* renamed from: a */
    public final C20090c mo74332a(Type type, Annotation[] annotationArr) {
        boolean z;
        boolean z2;
        Type type2;
        Class<?> f = C20085a0.m34343f(type);
        if (f == C8048a.class) {
            return new C20067f(Void.class, this.f44446a, this.f44447b, false, true, false, false, false, true);
        }
        boolean z3 = f == C8054g.class;
        boolean z4 = f == C8071s.class;
        boolean z5 = f == C8057j.class;
        if (f != C8061n.class && !z3 && !z4 && !z5) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            String str = !z3 ? !z4 ? z5 ? "Maybe" : "Observable" : "Single" : "Flowable";
            StringBuilder f2 = C0388a.m1050f(str, " return type must be parameterized as ", str, "<Foo> or ", str);
            f2.append("<? extends Foo>");
            throw new IllegalStateException(f2.toString());
        }
        Type e = C20085a0.m34342e(0, (ParameterizedType) type);
        Class<?> f3 = C20085a0.m34343f(e);
        if (f3 == C20145v.class) {
            if (e instanceof ParameterizedType) {
                type2 = C20085a0.m34342e(0, (ParameterizedType) e);
                z2 = false;
                z = false;
            } else {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
        } else if (f3 != C20064d.class) {
            type2 = e;
            z = true;
            z2 = false;
        } else if (e instanceof ParameterizedType) {
            type2 = C20085a0.m34342e(0, (ParameterizedType) e);
            z2 = true;
            z = false;
        } else {
            throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
        }
        return new C20067f(type2, this.f44446a, this.f44447b, z2, z, z3, z4, z5, false);
    }
}
