package kotlin.jvm.internal;

import kotlin.reflect.C19399b;
import kotlin.reflect.C19414l;

public abstract class PropertyReference1 extends PropertyReference implements C19414l {
    public PropertyReference1() {
    }

    public C19399b computeReflected() {
        C19386q.f43269a.getClass();
        return this;
    }

    public abstract /* synthetic */ Object get(Object obj);

    public Object getDelegate(Object obj) {
        return ((C19414l) getReflected()).getDelegate(obj);
    }

    public Object invoke(Object obj) {
        return get(obj);
    }

    public PropertyReference1(Object obj) {
        super(obj);
    }

    public C19414l.C19415a getGetter() {
        return ((C19414l) getReflected()).getGetter();
    }

    public PropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
