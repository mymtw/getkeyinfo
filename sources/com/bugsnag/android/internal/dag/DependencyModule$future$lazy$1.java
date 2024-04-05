package com.bugsnag.android.internal.dag;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class DependencyModule$future$lazy$1 extends Lambda implements C19846a<T> {
    public final /* synthetic */ C19846a $initializer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DependencyModule$future$lazy$1(C19846a aVar) {
        super(0);
        this.$initializer = aVar;
    }

    public final T invoke() {
        return this.$initializer.invoke();
    }
}
