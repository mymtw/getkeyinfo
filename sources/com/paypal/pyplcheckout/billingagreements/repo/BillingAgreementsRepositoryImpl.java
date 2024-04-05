package com.paypal.pyplcheckout.billingagreements.repo;

import com.paypal.pyplcheckout.billingagreements.model.BillingAgreementState;
import com.paypal.pyplcheckout.billingagreements.model.BillingAgreementType;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C19656n1;
import kotlinx.coroutines.flow.C19689x1;

public final class BillingAgreementsRepositoryImpl implements BillingAgreementsRepository {
    /* access modifiers changed from: private */
    public final C19656n1<Boolean> _balancePreferenceState = C19388s.m32862g(Boolean.TRUE);
    /* access modifiers changed from: private */
    public final C19656n1<BillingAgreementState> _state = C19388s.m32862g(BillingAgreementState.UnsupportedState.INSTANCE);
    /* access modifiers changed from: private */
    public final BillingAgreementsDao dao;
    private final C19525d0 scope;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BillingAgreementType.values().length];
            iArr[BillingAgreementType.NOT_SUPPORTED.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BillingAgreementsRepositoryImpl(BillingAgreementsDao billingAgreementsDao, C19525d0 d0Var) {
        C19383o.m32797g(billingAgreementsDao, "dao");
        C19383o.m32797g(d0Var, "scope");
        this.dao = billingAgreementsDao;
        this.scope = d0Var;
    }

    private final void emitState(BillingAgreementType billingAgreementType) {
        C19697g.m33468f(this.scope, (CoroutineContext) null, (CoroutineStart) null, new BillingAgreementsRepositoryImpl$emitState$1(this, WhenMappings.$EnumSwitchMapping$0[billingAgreementType.ordinal()] == 1 ? BillingAgreementState.UnsupportedState.INSTANCE : new BillingAgreementState.SupportedState(billingAgreementType), (C19340c<? super BillingAgreementsRepositoryImpl$emitState$1>) null), 3);
    }

    public void clear() {
        this.dao.clear();
        emitState(BillingAgreementType.NOT_SUPPORTED);
    }

    public C19689x1<Boolean> getAlwaysUseBalancePreference() {
        C19697g.m33468f(this.scope, (CoroutineContext) null, (CoroutineStart) null, new BillingAgreementsRepositoryImpl$getAlwaysUseBalancePreference$1(this, (C19340c<? super BillingAgreementsRepositoryImpl$getAlwaysUseBalancePreference$1>) null), 3);
        return this._balancePreferenceState;
    }

    public C19689x1<BillingAgreementState> getBillingAgreementSessionState() {
        emitState(this.dao.getBillingAgreementType());
        return this._state;
    }

    public String getBillingAgreementToken() {
        return this.dao.getBillingAgreementToken();
    }

    public final C19689x1<BillingAgreementState> getState() {
        return this._state;
    }

    public void setAlwaysUseBalancePreference(boolean z) {
        this.dao.setAlwaysUseBalancePreference(z);
        C19697g.m33468f(this.scope, (CoroutineContext) null, (CoroutineStart) null, new BillingAgreementsRepositoryImpl$setAlwaysUseBalancePreference$1(this, z, (C19340c<? super BillingAgreementsRepositoryImpl$setAlwaysUseBalancePreference$1>) null), 3);
    }

    public void setBillingAgreementSessionType(BillingAgreementType billingAgreementType) {
        C19383o.m32797g(billingAgreementType, "type");
        this.dao.setBillingAgreementType(billingAgreementType);
        emitState(billingAgreementType);
    }

    public void setBillingAgreementToken(String str) {
        this.dao.setBillingAgreementToken(str);
    }
}
