package kotlin.jvm.internal;

import kotlin.reflect.C19399b;
import kotlin.reflect.C19406h;
import kotlin.reflect.C19414l;

public abstract class MutablePropertyReference1 extends MutablePropertyReference implements C19406h {
    public MutablePropertyReference1() {
    }

    public C19399b computeReflected() {
        C19386q.f43269a.getClass();
        return this;
    }

    public abstract /* synthetic */ Object get(Object obj);

    public Object getDelegate(Object obj) {
        return ((C19406h) getReflected()).getDelegate(obj);
    }

    public Object invoke(Object obj) {
        return get(obj);
    }

    public abstract /* synthetic */ void set(Object obj, Object obj2);

    public MutablePropertyReference1(Object obj) {
        super(obj);
    }

    public C19414l.C19415a getGetter() {
        return ((C19406h) getReflected()).getGetter();
    }

    public C19406h.C19407a getSetter() {
        return ((C19406h) getReflected()).getSetter();
    }

    public MutablePropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
