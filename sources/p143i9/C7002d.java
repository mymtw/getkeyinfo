package p143i9;

import android.app.Activity;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.util.C8901g0;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p143i9.C7003e;
import p248tp.C8072t;
import p689ul.C18603a;
import p689ul.C18606d;

/* renamed from: i9.d */
public final /* synthetic */ class C7002d implements C18603a {

    /* renamed from: b */
    public final /* synthetic */ C7003e f15552b;

    /* renamed from: c */
    public final /* synthetic */ Activity f15553c;

    /* renamed from: d */
    public final /* synthetic */ C8072t f15554d;

    public /* synthetic */ C7002d(C7003e eVar, Activity activity, C8072t tVar) {
        this.f15552b = eVar;
        this.f15553c = activity;
        this.f15554d = tVar;
    }

    /* renamed from: b */
    public final void mo5885b(C18606d dVar) {
        C7003e eVar = this.f15552b;
        Activity activity = this.f15553c;
        C8072t tVar = this.f15554d;
        C19383o.m32797g(eVar, "this$0");
        C19383o.m32797g(tVar, "$emitter");
        C19383o.m32797g(dVar, "it");
        if (dVar.mo70121h()) {
            eVar.f15556b.mo21333d("google_play_in_all_review_prompt_attempted", (Map<? extends AnalyticsProperty, Object>) null);
            if (C0326j.m869n(BuildTarget.Companion)) {
                C8901g0.m17337c(activity.getApplicationContext(), R.string.in_app_review_shown_debug_message);
            }
            C7003e.C7004a.C7005a aVar = C7003e.C7004a.C7005a.f15559a;
            if (!tVar.isDisposed()) {
                tVar.onSuccess(aVar);
                return;
            }
            return;
        }
        C7003e.C7004a.C7006b bVar = C7003e.C7004a.C7006b.f15560a;
        if (!tVar.isDisposed()) {
            tVar.onSuccess(bVar);
        }
    }
}
