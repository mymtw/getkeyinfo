package kotlin.jvm.internal;

import kotlin.reflect.C19400c;
import kotlin.reflect.C19401d;

public class MutablePropertyReference1Impl extends MutablePropertyReference1 {
    public MutablePropertyReference1Impl(C19401d dVar, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((C19378j) dVar).mo71917a(), str, str2, (dVar instanceof C19400c) ^ true ? 1 : 0);
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public void set(Object obj, Object obj2) {
        getSetter().call(obj, obj2);
    }

    public MutablePropertyReference1Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    public MutablePropertyReference1Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
