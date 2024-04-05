package androidx.test.internal.platform.app;

import android.os.Bundle;
import androidx.test.internal.platform.ThreadChecker;
import androidx.test.internal.util.Checks;
import androidx.test.platform.app.InstrumentationRegistry;
import java.util.concurrent.TimeUnit;

public class ActivityLifecycleTimeout {
    /* renamed from: a */
    public static long m7963a() {
        ThreadChecker threadChecker = Checks.f7689a;
        Bundle bundle = InstrumentationRegistry.f7703b.get();
        if (bundle != null) {
            long parseLong = Long.parseLong(new Bundle(bundle).getString("activityLifecycleChangeTimeoutMillis", "0"));
            if (parseLong == 0) {
                parseLong = 45000;
            }
            return parseLong < 0 ? TimeUnit.DAYS.toMillis(1) : parseLong;
        }
        throw new IllegalStateException("No instrumentation arguments registered! Are you running under an Instrumentation which registers arguments?");
    }
}
