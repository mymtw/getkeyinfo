package androidx.work;

import android.content.Context;
import androidx.work.C3373b;
import java.util.Collections;
import java.util.List;
import p136i2.C6984b;
import p252u2.C8129j;

public final class WorkManagerInitializer implements C6984b<C3437q> {

    /* renamed from: a */
    public static final String f7860a = C3422l.m8214e("WrkMgrInitializer");

    /* renamed from: a */
    public final List<Class<? extends C6984b<?>>> mo10023a() {
        return Collections.emptyList();
    }

    public final Object create(Context context) {
        C3422l.m8213c().mo12926a(f7860a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        C8129j.m16346f(context, new C3373b(new C3373b.C3374a()));
        return C8129j.m16345e(context);
    }
}
