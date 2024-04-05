package com.etsy.android.lib.useraction;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class UserActionBus$removeOutdatedUserActions$2 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ UserActionBus this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserActionBus$removeOutdatedUserActions$2(UserActionBus userActionBus) {
        super(1);
        this.this$0 = userActionBus;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        this.this$0.f19590e.mo45474a("user_action.delete_outdated_user_actions_db_failure");
    }
}
