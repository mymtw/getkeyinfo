package com.etsy.android.util;

import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import androidx.compose.foundation.layout.C0761x;
import androidx.work.C3376c;
import androidx.work.C3380e;
import androidx.work.C3434o;
import androidx.work.C3437q;
import androidx.work.NetworkType;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.logger.AnalyticsLogDatabaseHelper;
import com.etsy.android.lib.logger.analytics.AnalyticsQueueTooLongException;
import com.etsy.android.lib.logger.analytics.AnalyticsUploadWorker;
import com.etsy.android.lib.logger.elk.uploading.C8680a;
import com.etsy.android.lib.logger.elk.uploading.C8687h;
import com.etsy.android.lib.logger.elk.uploading.C8689j;
import com.etsy.android.lib.logger.elk.uploading.ElkLogUploadWorker;
import com.etsy.android.lib.logger.elk.uploading.LogsQueueTooLongException;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import p334da.C12630a;
import p334da.C12633d;
import p334da.C12639h;
import p568fn.C17782b;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.util.ForegroundBackgroundEventListener$onBackground$1", mo70541f = "ForegroundBackgroundEventListener.kt", mo70542l = {}, mo70543m = "invokeSuspend")
final class ForegroundBackgroundEventListener$onBackground$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public int label;
    public final /* synthetic */ C12062s this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ForegroundBackgroundEventListener$onBackground$1(C12062s sVar, C19340c<? super ForegroundBackgroundEventListener$onBackground$1> cVar) {
        super(2, cVar);
        this.this$0 = sVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new ForegroundBackgroundEventListener$onBackground$1(this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((ForegroundBackgroundEventListener$onBackground$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            C12633d dVar = this.this$0.f26893d;
            Timer timer = dVar.f27863d;
            if (timer != null) {
                timer.cancel();
            }
            dVar.f27863d = null;
            C8689j jVar = this.this$0.f26897h;
            Timer timer2 = jVar.f19090d;
            if (timer2 != null) {
                timer2.cancel();
            }
            jVar.f19090d = null;
            C12630a aVar = this.this$0.f26894e;
            SQLiteDatabase readableDatabase = aVar.f27853a.getReadableDatabase();
            C19383o.m32796f(readableDatabase, "db");
            long queryNumEntries = DatabaseUtils.queryNumEntries(readableDatabase, AnalyticsLogDatabaseHelper.TABLE);
            if (queryNumEntries > 0) {
                long e = aVar.f27855c.mo21135e(C8592b.f18761U);
                if (queryNumEntries >= e) {
                    aVar.f27854b.mo30458c(new AnalyticsQueueTooLongException(queryNumEntries, e), C8592b.f18759T);
                }
            }
            C8680a aVar2 = this.this$0.f26896g;
            long count = aVar2.f19069a.count();
            if (count > 0) {
                long e2 = aVar2.f19071c.mo21135e(C8592b.f18757S);
                if (count >= e2) {
                    aVar2.f19070b.mo30458c(new LogsQueueTooLongException(count, e2), C8592b.f18755R);
                }
            }
            C12639h hVar = this.this$0.f26895f;
            hVar.f27879b.mo12961b("analytics");
            boolean b = hVar.f27878a.mo21132b(C8592b.f18763V);
            long e3 = hVar.f27878a.mo21135e(C8592b.f18739J);
            C3437q qVar = hVar.f27879b;
            C3434o.C3435a aVar3 = new C3434o.C3435a(AnalyticsUploadWorker.class, e3, TimeUnit.SECONDS);
            C3376c.C3377a aVar4 = new C3376c.C3377a();
            aVar4.f7890a = NetworkType.CONNECTED;
            C3434o.C3435a aVar5 = (C3434o.C3435a) aVar3.mo12966e(new C3376c(aVar4));
            Pair pair = new Pair("should_drain_queue", Boolean.valueOf(b));
            int i = 0;
            Pair[] pairArr = {pair};
            C3380e.C3381a aVar6 = new C3380e.C3381a();
            int i2 = 0;
            while (i2 < 1) {
                Pair pair2 = pairArr[i2];
                i2++;
                aVar6.mo12847b(pair2.getSecond(), (String) pair2.getFirst());
            }
            aVar5.f8043c.f9648e = aVar6.mo12846a();
            aVar5.f8044d.add("analytics");
            qVar.mo12962c(C17782b.m29864d0(aVar5.mo12964a()));
            C8687h hVar2 = this.this$0.f26898i;
            if (hVar2.f19085a.mo21132b(C8592b.f18813n0)) {
                hVar2.f19086b.mo12961b("elk-logs");
                long e4 = hVar2.f19085a.mo21135e(C8592b.f18739J);
                C3376c.C3377a aVar7 = new C3376c.C3377a();
                aVar7.f7890a = NetworkType.CONNECTED;
                C3376c cVar = new C3376c(aVar7);
                boolean b2 = hVar2.f19085a.mo21132b(C8592b.f18765W);
                C3437q qVar2 = hVar2.f19086b;
                C3434o.C3435a aVar8 = new C3434o.C3435a(ElkLogUploadWorker.class, e4, TimeUnit.SECONDS);
                aVar8.f8044d.add("elk-logs");
                C3434o.C3435a aVar9 = (C3434o.C3435a) aVar8.mo12966e(cVar);
                Pair[] pairArr2 = {new Pair("should_drain_queue", Boolean.valueOf(b2))};
                C3380e.C3381a aVar10 = new C3380e.C3381a();
                while (i < 1) {
                    Pair pair3 = pairArr2[i];
                    i++;
                    aVar10.mo12847b(pair3.getSecond(), (String) pair3.getFirst());
                }
                aVar9.f8043c.f9648e = aVar10.mo12846a();
                qVar2.mo12962c(C17782b.m29864d0(aVar9.mo12964a()));
            }
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
