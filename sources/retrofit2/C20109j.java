package retrofit2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: retrofit2.j */
public final class C20109j {

    /* renamed from: a */
    public final Method f44495a;

    /* renamed from: b */
    public final List<?> f44496b;

    public C20109j(Method method, ArrayList arrayList) {
        this.f44495a = method;
        this.f44496b = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", new Object[]{this.f44495a.getDeclaringClass().getName(), this.f44495a.getName(), this.f44496b});
    }
}
