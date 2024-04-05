package androidx.test.internal.util;

import android.util.Log;
import androidx.compose.animation.C0391c;
import androidx.test.internal.util.ProcSummary;

public final class LogUtil {
    /* renamed from: a */
    public static void m7977a(String str, Object... objArr) {
        String str2;
        if (Log.isLoggable("InstrConnection", 3)) {
            try {
                str2 = ProcSummary.m7979b().f7694e;
            } catch (ProcSummary.SummaryException unused) {
                str2 = "unknown";
            }
            if (str2.length() > 64 && str2.contains("-classpath")) {
                str2 = "robolectric";
            }
            StringBuilder sb = new StringBuilder(str2.length() + C0391c.m1055a(str, 4));
            sb.append(str);
            sb.append(" in ");
            sb.append(str2);
            Log.d("InstrConnection", String.format(sb.toString(), objArr));
        }
    }
}
