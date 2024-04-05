package kotlinx.coroutines.internal;

import kotlin.jvm.internal.PropertyReference0Impl;
import kotlinx.coroutines.C19543e0;

public /* synthetic */ class LockFreeLinkedListNode$toString$1 extends PropertyReference0Impl {
    public LockFreeLinkedListNode$toString$1(Object obj) {
        super(obj, C19543e0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
    }

    public Object get() {
        return this.receiver.getClass().getSimpleName();
    }
}
