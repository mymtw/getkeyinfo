package kotlin.jvm.internal;

import kotlin.reflect.C19400c;
import kotlin.reflect.C19401d;

public class PropertyReference0Impl extends PropertyReference0 {
    public PropertyReference0Impl(C19401d dVar, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((C19378j) dVar).mo71917a(), str, str2, (dVar instanceof C19400c) ^ true ? 1 : 0);
    }

    public Object get() {
        return getGetter().call(new Object[0]);
    }

    public PropertyReference0Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    public PropertyReference0Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
