package p108fh;

import com.google.android.datatransport.runtime.dagger.internal.C6539b;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import p132hh.C6963a;
import p132hh.C6964b;
import p740eq.C19011a;

/* renamed from: fh.f */
public final class C6822f implements C6539b<SchedulerConfig> {

    /* renamed from: a */
    public final C19011a<C6963a> f15021a = C6964b.C6965a.f15449a;

    public final Object get() {
        SchedulerConfig schedulerConfig = SchedulerConfig.getDefault(this.f15021a.get());
        if (schedulerConfig != null) {
            return schedulerConfig;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
