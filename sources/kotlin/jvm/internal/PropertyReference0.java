package kotlin.jvm.internal;

import kotlin.reflect.C19399b;
import kotlin.reflect.C19412k;

public abstract class PropertyReference0 extends PropertyReference implements C19412k {
    public PropertyReference0() {
    }

    public C19399b computeReflected() {
        C19386q.f43269a.getClass();
        return this;
    }

    public abstract /* synthetic */ Object get();

    public Object getDelegate() {
        return ((C19412k) getReflected()).getDelegate();
    }

    public Object invoke() {
        return get();
    }

    public PropertyReference0(Object obj) {
        super(obj);
    }

    public C19412k.C19413a getGetter() {
        return ((C19412k) getReflected()).getGetter();
    }

    public PropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
