package com.etsy.android.push;

import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.util.sharedprefs.UserIdStream;
import com.etsy.android.p327ui.conversation.details.C9532l;
import com.etsy.android.p327ui.conversation.list.legacy.C9599g;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.operators.flowable.FlowableCreate;
import p145io.reactivex.internal.operators.flowable.FlowableObserveOn;
import p145io.reactivex.internal.operators.flowable.FlowableSubscribeOn;
import p145io.reactivex.internal.subscribers.LambdaSubscriber;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8066r;
import p456ua.C13461f;

/* renamed from: com.etsy.android.push.a */
public final class C8938a {

    /* renamed from: a */
    public final UserIdStream f19714a;

    /* renamed from: b */
    public final C13461f f19715b;

    /* renamed from: c */
    public final C8694h f19716c;

    /* renamed from: d */
    public final C9532l f19717d;

    /* renamed from: e */
    public final C9599g f19718e;

    /* renamed from: f */
    public LambdaSubscriber f19719f;

    /* renamed from: g */
    public C7091a f19720g;

    /* renamed from: h */
    public long f19721h;

    public C8938a(UserIdStream userIdStream, C13461f fVar, C8694h hVar, C9532l lVar, C9599g gVar) {
        C19383o.m32797g(userIdStream, "userIdStream");
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(hVar, "logCat");
        C19383o.m32797g(lVar, "notificationRepository");
        C19383o.m32797g(gVar, "conversationListRepository");
        this.f19714a = userIdStream;
        this.f19715b = fVar;
        this.f19716c = hVar;
        this.f19717d = lVar;
        this.f19718e = gVar;
    }

    /* renamed from: a */
    public final void mo30553a() {
        LambdaSubscriber lambdaSubscriber = this.f19719f;
        if (lambdaSubscriber != null) {
            lambdaSubscriber.dispose();
        }
        FlowableObserveOn flowableObserveOn = this.f19714a.f19681b;
        this.f19715b.getClass();
        C8066r b = C13461f.m21235b();
        flowableObserveOn.getClass();
        this.f19719f = SubscribersKt.m32502g(new FlowableSubscribeOn(flowableObserveOn, b, !(flowableObserveOn instanceof FlowableCreate)), new ConversationPushNotificationWatcher$subscribeToUserIdChanges$1(this.f19716c), new ConversationPushNotificationWatcher$subscribeToUserIdChanges$2(this));
    }
}
