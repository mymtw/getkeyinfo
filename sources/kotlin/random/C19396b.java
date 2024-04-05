package kotlin.random;

import java.util.Random;
import kotlin.jvm.internal.C19383o;

/* renamed from: kotlin.random.b */
public final class C19396b extends C19395a {

    /* renamed from: c */
    public final C19397a f43294c = new C19397a();

    /* renamed from: kotlin.random.b$a */
    public static final class C19397a extends ThreadLocal<Random> {
        public final Object initialValue() {
            return new Random();
        }
    }

    public final Random getImpl() {
        Object obj = this.f43294c.get();
        C19383o.m32796f(obj, "implStorage.get()");
        return (Random) obj;
    }
}
