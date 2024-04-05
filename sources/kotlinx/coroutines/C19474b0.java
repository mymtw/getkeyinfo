package kotlinx.coroutines;

import kotlin.coroutines.C19338a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19459m;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@IgnoreJRERequirement
/* renamed from: kotlinx.coroutines.b0 */
public final class C19474b0 extends C19338a implements C19841y1<String> {

    /* renamed from: b */
    public static final C19475a f43410b = new C19475a();

    /* renamed from: kotlinx.coroutines.b0$a */
    public static final class C19475a implements CoroutineContext.C19337b<C19474b0> {
    }

    public C19474b0() {
        throw null;
    }

    /* renamed from: G */
    public final void mo72118G(Object obj) {
        Thread.currentThread().setName((String) obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19474b0)) {
            return false;
        }
        ((C19474b0) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(0);
    }

    public final String toString() {
        return "CoroutineId(0)";
    }

    /* renamed from: x0 */
    public final Object mo72122x0(CoroutineContext coroutineContext) {
        C19479c0 c0Var = (C19479c0) coroutineContext.get(C19479c0.f43413b);
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int o1 = C19459m.m33046o1(name, " @", 0, 6);
        if (o1 < 0) {
            o1 = name.length();
        }
        StringBuilder sb = new StringBuilder(o1 + 9 + 10);
        String substring = name.substring(0, o1);
        C19383o.m32796f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append(" @");
        sb.append("coroutine");
        sb.append('#');
        sb.append(0);
        String sb2 = sb.toString();
        C19383o.m32796f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        currentThread.setName(sb2);
        return name;
    }
}
