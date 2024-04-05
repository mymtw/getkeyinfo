package kotlin.jvm.internal;

import kotlin.reflect.C19400c;
import kotlin.reflect.C19401d;

public class MutablePropertyReference2Impl extends MutablePropertyReference2 {
    public MutablePropertyReference2Impl(C19401d dVar, String str, String str2) {
        super(((C19378j) dVar).mo71917a(), str, str2, (dVar instanceof C19400c) ^ true ? 1 : 0);
    }

    public Object get(Object obj, Object obj2) {
        return getGetter().call(obj, obj2);
    }

    public void set(Object obj, Object obj2, Object obj3) {
        getSetter().call(obj, obj2, obj3);
    }

    public MutablePropertyReference2Impl(Class cls, String str, String str2, int i) {
        super(cls, str, str2, i);
    }
}
