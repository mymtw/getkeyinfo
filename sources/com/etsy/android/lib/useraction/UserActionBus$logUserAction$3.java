package com.etsy.android.lib.useraction;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p145io.reactivex.internal.operators.single.C19206h;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p456ua.C13461f;
import p753kq.C19857l;

public final class UserActionBus$logUserAction$3 extends Lambda implements C19857l<C19394m, C19394m> {
    public final /* synthetic */ UserActionBus this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserActionBus$logUserAction$3(UserActionBus userActionBus) {
        super(1);
        this.this$0 = userActionBus;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C19394m) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C19394m mVar) {
        UserActionBus userActionBus = this.this$0;
        byte[] bArr = UserActionBus.f19585f;
        userActionBus.getClass();
        C19206h hVar = new C19206h(new C8866a(userActionBus));
        userActionBus.f19589d.getClass();
        SubscribersKt.m32500e(hVar.mo20660i(C13461f.m21235b()), new UserActionBus$removeOutdatedUserActions$2(userActionBus), SubscribersKt.f43062a);
    }
}
