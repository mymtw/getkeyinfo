package p114g4;

import android.app.job.JobParameters;
import android.view.ViewGroup;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import p513bj.C14049b0;
import p520cj.C14164p;

/* renamed from: g4.h */
public final /* synthetic */ class C6868h implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f15192b;

    /* renamed from: c */
    public final /* synthetic */ Object f15193c;

    /* renamed from: d */
    public final /* synthetic */ Object f15194d;

    public /* synthetic */ C6868h(int i, Object obj, Object obj2) {
        this.f15192b = i;
        this.f15193c = obj;
        this.f15194d = obj2;
    }

    public final void run() {
        switch (this.f15192b) {
            case 0:
                C6869i iVar = C6869i.this;
                iVar.mo18996b((ViewGroup) this.f15194d, iVar.f15197b, iVar.f15196a, iVar.f15198c);
                return;
            case 1:
                ((JobInfoSchedulerService) this.f15193c).lambda$onStartJob$0((JobParameters) this.f15194d);
                return;
            default:
                C14164p pVar = ((C14164p.C14165a) this.f15193c).f31267b;
                int i = C14049b0.f30913a;
                pVar.mo47102h((Exception) this.f15194d);
                return;
        }
    }
}
