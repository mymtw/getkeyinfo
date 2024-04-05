package com.etsy.android.push;

import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.datatypes.EtsyId;
import java.util.Objects;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.LambdaObserver;
import p145io.reactivex.internal.operators.observable.C19179q;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8061n;
import p425q9.C13261l;
import p456ua.C13461f;
import p753kq.C19857l;

final class ConversationPushNotificationWatcher$subscribeToUserIdChanges$2 extends Lambda implements C19857l<EtsyId, C19394m> {
    public final /* synthetic */ C8938a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationPushNotificationWatcher$subscribeToUserIdChanges$2(C8938a aVar) {
        super(1);
        this.this$0 = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((EtsyId) obj);
        return C19394m.f43287a;
    }

    public final void invoke(EtsyId etsyId) {
        C8694h hVar = this.this$0.f19716c;
        Objects.toString(etsyId);
        hVar.mo21308c();
        this.this$0.f19721h = etsyId.getIdAsLongDeprecated();
        C8938a aVar = this.this$0;
        long j = aVar.f19721h;
        C7091a aVar2 = aVar.f19720g;
        if (aVar2 != null) {
            aVar2.dispose();
        }
        C7091a aVar3 = new C7091a();
        aVar.f19720g = aVar3;
        if (j > 0) {
            C19179q a = aVar.f19717d.mo32082a();
            aVar.f19715b.getClass();
            C8061n d = a.mo20639i(C13461f.m21235b()).mo20634d(new C13261l(aVar, 2));
            ConversationPushNotificationWatcher$subscribeToNotifications$2 conversationPushNotificationWatcher$subscribeToNotifications$2 = new ConversationPushNotificationWatcher$subscribeToNotifications$2(aVar.f19716c);
            C19383o.m32796f(d, "flatMap {\n              …vable()\n                }");
            LambdaObserver f = SubscribersKt.m32501f(d, conversationPushNotificationWatcher$subscribeToNotifications$2, ConversationPushNotificationWatcher$subscribeToNotifications$3.INSTANCE, 2);
            C7091a aVar4 = aVar.f19720g;
            C19383o.m32794d(aVar4);
            aVar4.mo19403b(f);
            return;
        }
        aVar3.dispose();
    }
}
