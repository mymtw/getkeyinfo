package com.etsy.android.push;

import com.etsy.android.lib.logger.C8694h;
import kotlin.C19394m;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p753kq.C19857l;

final /* synthetic */ class ConversationPushNotificationWatcher$subscribeToUserIdChanges$1 extends FunctionReferenceImpl implements C19857l<Throwable, C19394m> {
    public ConversationPushNotificationWatcher$subscribeToUserIdChanges$1(Object obj) {
        super(1, obj, C8694h.class, "error", "error(Ljava/lang/Throwable;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        ((C8694h) this.receiver).error(th);
    }
}
