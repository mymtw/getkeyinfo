package com.google.android.play.core.ktx;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p689ul.C18606d;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: com.google.android.play.core.ktx.TaskUtilsKt$runTask$$inlined$suspendCancellableCoroutine$lambda$1 */
final class C15727xa6fc3b2a extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ C19846a $onCanceled$inlined;
    public final /* synthetic */ C18606d $task$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15727xa6fc3b2a(C19846a aVar, C18606d dVar) {
        super(1);
        this.$onCanceled$inlined = aVar;
        this.$task$inlined = dVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        this.$onCanceled$inlined.invoke();
    }
}
