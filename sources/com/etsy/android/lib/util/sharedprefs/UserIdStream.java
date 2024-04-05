package com.etsy.android.lib.util.sharedprefs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.util.SharedPreferencesUtility;
import com.jakewharton.rxrelay2.C17038b;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.BackpressureStrategy;
import p145io.reactivex.internal.operators.flowable.FlowableCreate;
import p145io.reactivex.internal.operators.flowable.FlowableObserveOn;
import p145io.reactivex.internal.operators.flowable.FlowableSubscribeOn;
import p248tp.C8054g;
import p251u1.C8115a;
import p456ua.C13461f;

public final class UserIdStream {

    /* renamed from: a */
    public final C17038b<EtsyId> f19680a;

    /* renamed from: b */
    public final FlowableObserveOn f19681b;

    public UserIdStream(Context context, C13461f fVar) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(fVar, "rxSchedulers");
        EtsyId a = SharedPreferencesUtility.m17314a(context);
        C17038b<EtsyId> bVar = new C17038b<>();
        bVar.f37401b.lazySet(a);
        this.f19680a = bVar;
        C8054g<EtsyId> k = bVar.mo20640k(BackpressureStrategy.LATEST);
        this.f19681b = new FlowableSubscribeOn(k, C13461f.m21235b(), !(k instanceof FlowableCreate)).mo20617a(C13461f.m21235b());
        C8115a a2 = C8115a.m16322a(context);
        C19383o.m32796f(a2, "getInstance(context)");
        a2.mo20708b(new BroadcastReceiver(this) {
            public final /* synthetic */ UserIdStream this$0;

            {
                this.this$0 = r1;
            }

            public void onReceive(Context context, Intent intent) {
                C19383o.m32797g(context, "broadcastContext");
                this.this$0.f19680a.accept(SharedPreferencesUtility.m17314a(context.getApplicationContext()));
            }
        }, new IntentFilter("com.etsy.android.lib.action.PREFS_UPDATED"));
    }
}
