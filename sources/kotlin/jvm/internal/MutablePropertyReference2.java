package kotlin.jvm.internal;

import kotlin.reflect.C19399b;
import kotlin.reflect.C19408i;
import kotlin.reflect.C19416m;

public abstract class MutablePropertyReference2 extends MutablePropertyReference implements C19408i {
    public MutablePropertyReference2() {
    }

    public C19399b computeReflected() {
        C19386q.f43269a.getClass();
        return this;
    }

    public abstract /* synthetic */ Object get(Object obj, Object obj2);

    public Object getDelegate(Object obj, Object obj2) {
        return ((C19408i) getReflected()).getDelegate(obj, obj2);
    }

    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    public abstract /* synthetic */ void set(Object obj, Object obj2, Object obj3);

    public MutablePropertyReference2(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    public C19416m.C19417a getGetter() {
        return ((C19408i) getReflected()).getGetter();
    }

    public C19408i.C19409a getSetter() {
        return ((C19408i) getReflected()).getSetter();
    }
}
