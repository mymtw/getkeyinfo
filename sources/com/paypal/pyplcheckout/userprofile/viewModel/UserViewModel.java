package com.paypal.pyplcheckout.userprofile.viewModel;

import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2895z;
import androidx.lifecycle.LiveData;
import com.paypal.pyplcheckout.billingagreements.view.customview.C17198a;
import com.paypal.pyplcheckout.billingagreements.viewmodel.C17203a;
import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.fundingOptions.usecase.C17225b;
import com.paypal.pyplcheckout.pojo.User;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.userprofile.model.UserState;
import com.paypal.pyplcheckout.userprofile.model.UserStateKt;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import kotlin.jvm.internal.C19383o;

public final class UserViewModel extends C2866i0 {
    private final C2895z<UserState> _userState = new C2895z<>();
    private final Events events;
    private final EventListener fetchUserAttemptedListener = new C17198a(this, 10);
    private final EventListener fetchUserCompleteListener = new C17225b(this, 8);
    private final PYPLCheckoutUtils pyplCheckoutUtils;
    private final Repository repository;
    private final EventListener userLogoutListener = new C17203a(this, 9);

    public UserViewModel(Events events2, Repository repository2, PYPLCheckoutUtils pYPLCheckoutUtils) {
        C19383o.m32797g(events2, "events");
        C19383o.m32797g(repository2, "repository");
        C19383o.m32797g(pYPLCheckoutUtils, "pyplCheckoutUtils");
        this.events = events2;
        this.repository = repository2;
        this.pyplCheckoutUtils = pYPLCheckoutUtils;
    }

    /* access modifiers changed from: private */
    /* renamed from: fetchUserAttemptedListener$lambda-2  reason: not valid java name */
    public static final void m35458fetchUserAttemptedListener$lambda2(UserViewModel userViewModel, EventType eventType, ResultData resultData) {
        C19383o.m32797g(userViewModel, "this$0");
        C19383o.m32797g(eventType, "type");
        userViewModel._userState.postValue(UserState.Empty.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.paypal.pyplcheckout.pojo.User} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: com.paypal.pyplcheckout.pojo.User} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: com.paypal.pyplcheckout.pojo.User} */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: fetchUserCompleteListener$lambda-0  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m35459fetchUserCompleteListener$lambda0(com.paypal.pyplcheckout.userprofile.viewModel.UserViewModel r1, com.paypal.pyplcheckout.events.EventType r2, com.paypal.pyplcheckout.events.ResultData r3) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.C19383o.m32797g(r1, r0)
            java.lang.String r0 = "type"
            kotlin.jvm.internal.C19383o.m32797g(r2, r0)
            boolean r2 = r3 instanceof com.paypal.pyplcheckout.events.Success
            r0 = 0
            if (r2 == 0) goto L_0x0035
            com.paypal.pyplcheckout.events.Success r3 = (com.paypal.pyplcheckout.events.Success) r3
            java.lang.Object r2 = r3.getData()
            boolean r3 = r2 instanceof com.paypal.pyplcheckout.pojo.UserCheckoutResponse
            if (r3 == 0) goto L_0x001c
            com.paypal.pyplcheckout.pojo.UserCheckoutResponse r2 = (com.paypal.pyplcheckout.pojo.UserCheckoutResponse) r2
            goto L_0x001d
        L_0x001c:
            r2 = r0
        L_0x001d:
            androidx.lifecycle.z<com.paypal.pyplcheckout.userprofile.model.UserState> r1 = r1._userState
            if (r2 != 0) goto L_0x0022
            goto L_0x002d
        L_0x0022:
            com.paypal.pyplcheckout.pojo.Data r2 = r2.getData()
            if (r2 != 0) goto L_0x0029
            goto L_0x002d
        L_0x0029:
            com.paypal.pyplcheckout.pojo.User r0 = r2.getUser()
        L_0x002d:
            com.paypal.pyplcheckout.userprofile.model.UserState r2 = com.paypal.pyplcheckout.userprofile.model.UserStateKt.toState(r0)
            r1.postValue(r2)
            goto L_0x0059
        L_0x0035:
            boolean r2 = r3 instanceof com.paypal.pyplcheckout.events.Error
            if (r2 == 0) goto L_0x0059
            com.paypal.pyplcheckout.events.Error r3 = (com.paypal.pyplcheckout.events.Error) r3
            java.lang.Object r2 = r3.getData()
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L_0x0046
            r0 = r2
            java.lang.String r0 = (java.lang.String) r0
        L_0x0046:
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = "Unknown api error"
        L_0x004a:
            androidx.lifecycle.z<com.paypal.pyplcheckout.userprofile.model.UserState> r1 = r1._userState
            com.paypal.pyplcheckout.userprofile.model.UserState$Error r2 = new com.paypal.pyplcheckout.userprofile.model.UserState$Error
            com.paypal.pyplcheckout.services.ApiErrorException r3 = new com.paypal.pyplcheckout.services.ApiErrorException
            r3.<init>(r0)
            r2.<init>(r3)
            r1.postValue(r2)
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.userprofile.viewModel.UserViewModel.m35459fetchUserCompleteListener$lambda0(com.paypal.pyplcheckout.userprofile.viewModel.UserViewModel, com.paypal.pyplcheckout.events.EventType, com.paypal.pyplcheckout.events.ResultData):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: userLogoutListener$lambda-1  reason: not valid java name */
    public static final void m35460userLogoutListener$lambda1(UserViewModel userViewModel, EventType eventType, ResultData resultData) {
        C19383o.m32797g(userViewModel, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        userViewModel._userState.postValue(UserState.Empty.INSTANCE);
    }

    public final User getUser() {
        UserState value = this._userState.getValue();
        UserState.Success success = value instanceof UserState.Success ? (UserState.Success) value : null;
        if (success == null) {
            return null;
        }
        return success.getUser();
    }

    public final LiveData<UserState> getUserState() {
        return this._userState;
    }

    public final void initialize() {
        this._userState.postValue(UserStateKt.toState(this.repository.getUser()));
        this.events.listen(PayPalEventTypes.FINISHED_USER_CHECKOUT_RESPONSE, this.fetchUserCompleteListener);
        this.events.listen(PayPalEventTypes.USER_LOGOUT, this.userLogoutListener);
        this.events.listen(PayPalEventTypes.FETCH_USER_AND_CHECKOUT_ATTEMPTED, this.fetchUserAttemptedListener);
    }
}
