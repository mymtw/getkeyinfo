package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.C6556p;
import com.google.android.datatransport.runtime.C6611t;
import p144ih.C7008a;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onReceive$0() {
    }

    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        C6611t.m12980b(context);
        C6556p.C6557a priority = C6556p.builder().setBackendName(queryParameter).setPriority(C7008a.m13569b(intValue));
        if (queryParameter2 != null) {
            priority.setExtras(Base64.decode(queryParameter2, 0));
        }
        C6573i iVar = C6611t.m12979a().f14593d;
        iVar.f14523e.execute(new C6567c(iVar, priority.build(), i, new C6565a()));
    }
}
