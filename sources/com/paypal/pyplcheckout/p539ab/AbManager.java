package com.paypal.pyplcheckout.p539ab;

import com.facebook.login.LoginFragment;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.p539ab.elmo.ElmoAbExperiment;
import com.paypal.pyplcheckout.p539ab.experiment.ExperimentCallback;
import com.paypal.pyplcheckout.p539ab.experiment.ExperimentRequest;
import com.paypal.pyplcheckout.p539ab.experiment.ExperimentResponse;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.paypal.pyplcheckout.ab.AbManager */
public final class AbManager {

    /* renamed from: ab */
    private final C17172Ab f37682ab;
    private final DebugConfigManager debugConfigManager;
    private String uuid = "";

    public AbManager(C17172Ab ab, DebugConfigManager debugConfigManager2) {
        C19383o.m32797g(ab, "ab");
        C19383o.m32797g(debugConfigManager2, "debugConfigManager");
        this.f37682ab = ab;
        this.debugConfigManager = debugConfigManager2;
    }

    public final boolean evaluateExperimentResponse(ElmoAbExperiment elmoAbExperiment, String str, String str2) {
        ElmoAbExperiment elmoAbExperiment2 = elmoAbExperiment;
        String str3 = str;
        C19383o.m32797g(elmoAbExperiment2, "experiment");
        C19383o.m32797g(str3, "treatment");
        C19383o.m32797g(str2, "details");
        ExperimentResponse treatment = getTreatment(new ExperimentRequest(elmoAbExperiment2, (String) null, 2, (DefaultConstructorMarker) null));
        if (treatment instanceof ExperimentResponse.Success) {
            if (C19383o.m32792b(((ExperimentResponse.Success) treatment).getResponse().getTreatmentName(), str3)) {
                return true;
            }
        } else if (!(treatment instanceof ExperimentResponse.Disable) && (treatment instanceof ExperimentResponse.Failure)) {
            Exception error = ((ExperimentResponse.Failure) treatment).getError();
            PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E571, error.toString(), str2, error, PEnums.TransitionName.ELMO_PROCESS_CHECK, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1984, (Object) null);
        }
        return false;
    }

    public final ExperimentResponse getTreatment(ExperimentRequest experimentRequest) {
        C19383o.m32797g(experimentRequest, LoginFragment.EXTRA_REQUEST);
        if (this.uuid.length() == 0) {
            return new ExperimentResponse.Failure(new Exception("Must call initRemoteCache"));
        }
        if (C19383o.m32792b(experimentRequest.getExperiment().experimentName(), ElmoAbExperiment.NOT_IMPLEMENTED)) {
            return ExperimentResponse.Disable.INSTANCE;
        }
        if (this.debugConfigManager.isABConfigurationRequested()) {
            ExperimentResponse isExperimentDisabled = isExperimentDisabled(experimentRequest);
            ExperimentResponse.Disable disable = ExperimentResponse.Disable.INSTANCE;
            if (C19383o.m32792b(isExperimentDisabled, disable)) {
                return disable;
            }
        }
        return this.f37682ab.getCache() == null ? new ExperimentResponse.Failure(new Exception("Remote cache cannot be empty when calling get treatment")) : this.f37682ab.getTreatment(experimentRequest);
    }

    public final void getTreatmentRemote(ExperimentRequest experimentRequest, ExperimentCallback experimentCallback) {
        C19383o.m32797g(experimentRequest, LoginFragment.EXTRA_REQUEST);
        C19383o.m32797g(experimentCallback, "callback");
        if (this.uuid.length() == 0) {
            experimentCallback.onResponse(new ExperimentResponse.Failure(new Exception("Must call initRemoteCache")));
            return;
        }
        if (this.debugConfigManager.isABConfigurationRequested()) {
            ExperimentResponse isExperimentDisabled = isExperimentDisabled(experimentRequest);
            ExperimentResponse.Disable disable = ExperimentResponse.Disable.INSTANCE;
            if (C19383o.m32792b(isExperimentDisabled, disable)) {
                experimentCallback.onResponse(disable);
                return;
            }
        }
        this.f37682ab.getTreatmentRemote(experimentRequest, experimentCallback);
    }

    public final void initRemoteCache(String str) {
        C19383o.m32797g(str, "uuid");
        this.uuid = str;
        this.f37682ab.setup(str);
    }

    public final ExperimentResponse isExperimentDisabled(ExperimentRequest experimentRequest) {
        C19383o.m32797g(experimentRequest, LoginFragment.EXTRA_REQUEST);
        List<String> enabledElmoAbExperiment = this.debugConfigManager.getEnabledElmoAbExperiment();
        if ((enabledElmoAbExperiment == null || enabledElmoAbExperiment.isEmpty()) || !this.debugConfigManager.getEnabledElmoAbExperiment().contains(experimentRequest.getExperiment().experimentName()) || C19383o.m32792b(experimentRequest.getExperiment().experimentName(), ElmoAbExperiment.NOT_IMPLEMENTED)) {
            return ExperimentResponse.Disable.INSTANCE;
        }
        return null;
    }
}
