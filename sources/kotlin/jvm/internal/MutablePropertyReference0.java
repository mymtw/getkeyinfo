package kotlin.jvm.internal;

import kotlin.reflect.C19399b;
import kotlin.reflect.C19404g;
import kotlin.reflect.C19412k;

public abstract class MutablePropertyReference0 extends MutablePropertyReference implements C19404g {
    public MutablePropertyReference0() {
    }

    public C19399b computeReflected() {
        C19386q.f43269a.getClass();
        return this;
    }

    public abstract /* synthetic */ Object get();

    public Object getDelegate() {
        return ((C19404g) getReflected()).getDelegate();
    }

    public Object invoke() {
        return get();
    }

    public abstract /* synthetic */ void set(Object obj);

    public MutablePropertyReference0(Object obj) {
        super(obj);
    }

    public C19412k.C19413a getGetter() {
        return ((C19404g) getReflected()).getGetter();
    }

    public C19404g.C19405a getSetter() {
        return ((C19404g) getReflected()).getSetter();
    }

    public MutablePropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
