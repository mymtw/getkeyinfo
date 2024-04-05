package kotlin.jvm.internal;

import kotlin.reflect.C19403f;
import kotlin.reflect.C19410j;

public abstract class MutablePropertyReference extends PropertyReference {
    public MutablePropertyReference() {
    }

    public abstract /* synthetic */ C19410j.C19411a getGetter();

    public abstract /* synthetic */ C19403f getSetter();

    public MutablePropertyReference(Object obj) {
        super(obj);
    }

    public MutablePropertyReference(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
