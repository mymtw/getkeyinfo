package com.paypal.pyplcheckout.common.instrumentation.amplitude.dao;

import com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeEvent;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeSession;
import java.util.List;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;

public interface AmplitudeDao {
    void cacheAmplitudeSession(AmplitudeSession amplitudeSession);

    Object cachePendingEvents(List<AmplitudeEvent> list, C19340c<? super C19394m> cVar);

    Object clearPendingEvents(C19340c<? super C19394m> cVar);

    AmplitudeSession getAmplitudeSession();

    List<AmplitudeEvent> getPendingEvents();
}
