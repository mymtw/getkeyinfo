package kotlin.jvm.internal;

import kotlin.reflect.C19399b;
import kotlin.reflect.C19416m;

public abstract class PropertyReference2 extends PropertyReference implements C19416m {
    public PropertyReference2() {
    }

    public C19399b computeReflected() {
        C19386q.f43269a.getClass();
        return this;
    }

    public abstract /* synthetic */ Object get(Object obj, Object obj2);

    public Object getDelegate(Object obj, Object obj2) {
        return ((C19416m) getReflected()).getDelegate(obj, obj2);
    }

    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    public PropertyReference2(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    public C19416m.C19417a getGetter() {
        return ((C19416m) getReflected()).getGetter();
    }
}
