package com.paypal.pyplcheckout.userprofile.usecase;

import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.home.view.customviews.C17249m;
import com.paypal.pyplcheckout.pojo.UserCheckoutResponse;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.userprofile.model.UserState;
import com.paypal.pyplcheckout.userprofile.model.UserStateKt;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C19656n1;
import kotlinx.coroutines.flow.C19689x1;

public final class GetUserUseCase {
    private final Events events;
    private final EventListener fetchUserCompleteListener = new C17249m(this, 2);
    /* access modifiers changed from: private */
    public final Repository repository;
    private final C19525d0 scope;
    /* access modifiers changed from: private */
    public final C19656n1<UserState> state;

    public GetUserUseCase(Repository repository2, Events events2, C19525d0 d0Var) {
        C19383o.m32797g(repository2, "repository");
        C19383o.m32797g(events2, "events");
        C19383o.m32797g(d0Var, "scope");
        this.repository = repository2;
        this.events = events2;
        this.scope = d0Var;
        this.state = C19388s.m32862g(UserStateKt.toState(repository2.getUser()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.paypal.pyplcheckout.pojo.UserCheckoutResponse} */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: fetchUserCompleteListener$lambda-0  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m35448fetchUserCompleteListener$lambda0(com.paypal.pyplcheckout.userprofile.usecase.GetUserUseCase r1, com.paypal.pyplcheckout.events.EventType r2, com.paypal.pyplcheckout.events.ResultData r3) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.C19383o.m32797g(r1, r0)
            java.lang.String r0 = "$noName_0"
            kotlin.jvm.internal.C19383o.m32797g(r2, r0)
            boolean r2 = r3 instanceof com.paypal.pyplcheckout.events.Success
            r0 = 0
            if (r2 == 0) goto L_0x0020
            com.paypal.pyplcheckout.events.Success r3 = (com.paypal.pyplcheckout.events.Success) r3
            java.lang.Object r2 = r3.getData()
            boolean r3 = r2 instanceof com.paypal.pyplcheckout.pojo.UserCheckoutResponse
            if (r3 == 0) goto L_0x001c
            r0 = r2
            com.paypal.pyplcheckout.pojo.UserCheckoutResponse r0 = (com.paypal.pyplcheckout.pojo.UserCheckoutResponse) r0
        L_0x001c:
            r1.onUserSuccess(r0)
            goto L_0x0034
        L_0x0020:
            boolean r2 = r3 instanceof com.paypal.pyplcheckout.events.Error
            if (r2 == 0) goto L_0x0034
            com.paypal.pyplcheckout.events.Error r3 = (com.paypal.pyplcheckout.events.Error) r3
            java.lang.Object r2 = r3.getData()
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L_0x0031
            r0 = r2
            java.lang.String r0 = (java.lang.String) r0
        L_0x0031:
            r1.onUserError(r0)
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.userprofile.usecase.GetUserUseCase.m35448fetchUserCompleteListener$lambda0(com.paypal.pyplcheckout.userprofile.usecase.GetUserUseCase, com.paypal.pyplcheckout.events.EventType, com.paypal.pyplcheckout.events.ResultData):void");
    }

    private final void listenToEvents() {
        this.events.listen(PayPalEventTypes.FINISHED_USER_CHECKOUT_RESPONSE, this.fetchUserCompleteListener);
    }

    private final C19699g1 onUserError(String str) {
        return C19697g.m33468f(this.scope, (CoroutineContext) null, (CoroutineStart) null, new GetUserUseCase$onUserError$1(str, this, (C19340c<? super GetUserUseCase$onUserError$1>) null), 3);
    }

    private final C19699g1 onUserSuccess(UserCheckoutResponse userCheckoutResponse) {
        return C19697g.m33468f(this.scope, (CoroutineContext) null, (CoroutineStart) null, new GetUserUseCase$onUserSuccess$1(userCheckoutResponse, this, (C19340c<? super GetUserUseCase$onUserSuccess$1>) null), 3);
    }

    public final C19689x1<UserState> invoke() {
        C19697g.m33468f(this.scope, (CoroutineContext) null, (CoroutineStart) null, new GetUserUseCase$invoke$1(this, (C19340c<? super GetUserUseCase$invoke$1>) null), 3);
        listenToEvents();
        return this.state;
    }
}
