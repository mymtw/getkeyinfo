package com.paypal.checkout.merchanttoken;

import androidx.recyclerview.widget.RecyclerView;
import com.paypal.checkout.merchanttoken.UpgradeLsatTokenResponse;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.services.Repository;
import kotlin.C19394m;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.C19343e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineDispatcher;

public final class UpgradeLsatTokenAction {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String ERROR_LSAT_UPGRADE_FAILED = "LSAT token upgrade failed.";
    private final CoroutineDispatcher defaultDispatcher;
    private final Repository repository;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UpgradeLsatTokenAction(Repository repository2, CoroutineDispatcher coroutineDispatcher) {
        C19383o.m32797g(repository2, "repository");
        C19383o.m32797g(coroutineDispatcher, "defaultDispatcher");
        this.repository = repository2;
        this.defaultDispatcher = coroutineDispatcher;
    }

    /* access modifiers changed from: private */
    public final void logError(String str) {
        PLog.error$default(PEnums.ErrorType.WARNING, PEnums.EventCode.E505, ERROR_LSAT_UPGRADE_FAILED, str, (Throwable) null, PEnums.TransitionName.NATIVE_XO_POST_LSAT_UPGRADE_TOKEN, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, RecyclerView.MAX_SCROLL_DURATION, (Object) null);
    }

    /* access modifiers changed from: private */
    public final Object upgradeLsatToken(C19340c<? super UpgradeLsatTokenResponse> cVar) {
        C19394m mVar;
        C19343e eVar = new C19343e(C19388s.m32873m0(cVar));
        String lsatToken = this.repository.getLsatToken();
        if (lsatToken == null) {
            mVar = null;
        } else {
            if (!this.repository.wasLsatTokenUpgraded()) {
                this.repository.fetchLsatUpgradeStatus(new UpgradeLsatTokenAction$upgradeLsatToken$2$1$1(eVar, lsatToken, this));
            } else {
                eVar.resumeWith(Result.m35480constructorimpl(new UpgradeLsatTokenResponse.Success(lsatToken)));
            }
            mVar = C19394m.f43287a;
        }
        if (mVar == null) {
            logError("lsat Token Null");
            eVar.resumeWith(Result.m35480constructorimpl(UpgradeLsatTokenResponse.Failed.INSTANCE));
        }
        Object a = eVar.mo71808a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return a;
    }

    public final Object execute(C19340c<? super UpgradeLsatTokenResponse> cVar) {
        return C19697g.m33471i(cVar, this.defaultDispatcher, new UpgradeLsatTokenAction$execute$2(this, (C19340c<? super UpgradeLsatTokenAction$execute$2>) null));
    }
}
