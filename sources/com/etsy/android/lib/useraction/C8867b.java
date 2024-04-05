package com.etsy.android.lib.useraction;

import java.util.concurrent.Callable;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.lib.useraction.b */
public final /* synthetic */ class C8867b implements Callable {

    /* renamed from: b */
    public final /* synthetic */ UserActionBus f19594b;

    /* renamed from: c */
    public final /* synthetic */ ActionType f19595c;

    /* renamed from: d */
    public final /* synthetic */ SubjectType f19596d;

    /* renamed from: e */
    public final /* synthetic */ String f19597e;

    public /* synthetic */ C8867b(UserActionBus userActionBus, ActionType actionType, SubjectType subjectType, String str) {
        this.f19594b = userActionBus;
        this.f19595c = actionType;
        this.f19596d = subjectType;
        this.f19597e = str;
    }

    public final Object call() {
        UserActionBus userActionBus = this.f19594b;
        ActionType actionType = this.f19595c;
        SubjectType subjectType = this.f19596d;
        String str = this.f19597e;
        C19383o.m32797g(userActionBus, "this$0");
        C19383o.m32797g(actionType, "$action");
        C19383o.m32797g(subjectType, "$subject");
        C19383o.m32797g(str, "$subjectId");
        userActionBus.f19586a.mo30444c(new C8874g(actionType.getActionName(), subjectType.getSubjectName(), str, System.currentTimeMillis(), userActionBus.f19587b, 0));
        return C19394m.f43287a;
    }
}
