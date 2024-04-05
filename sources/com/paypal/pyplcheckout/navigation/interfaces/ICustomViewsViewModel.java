package com.paypal.pyplcheckout.navigation.interfaces;

import android.content.Context;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C2887s;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.play.core.assetpacks.C15588c1;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import kotlin.jvm.internal.C19383o;

public interface ICustomViewsViewModel {

    public static final class DefaultImpls {
        public static ComponentActivity getComponentActivity(ICustomViewsViewModel iCustomViewsViewModel, Context context) {
            C19383o.m32797g(iCustomViewsViewModel, "this");
            C19383o.m32797g(context, "receiver");
            if (context instanceof ComponentActivity) {
                return (ComponentActivity) context;
            }
            PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
            throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
        }

        public static C2887s getLifecycleOwner(ICustomViewsViewModel iCustomViewsViewModel, View view) {
            C19383o.m32797g(iCustomViewsViewModel, "this");
            C19383o.m32797g(view, "receiver");
            C2887s f0 = C15588c1.m25325f0(view);
            if (f0 != null) {
                return f0;
            }
            Context context = view.getContext();
            C19383o.m32796f(context, ResponseConstants.CONTEXT);
            return iCustomViewsViewModel.getComponentActivity(context);
        }
    }

    ComponentActivity getComponentActivity(Context context);

    C2887s getLifecycleOwner(View view);

    void initViewModelObservers();
}
