package p002a1;

import android.os.Build;
import android.os.Trace;
import android.util.Log;

@Deprecated
/* renamed from: a1.g */
public final class C0013g {

    /* renamed from: a */
    public static final /* synthetic */ int f24a = 0;

    static {
        Class<String> cls = String.class;
        if (Build.VERSION.SDK_INT < 29) {
            try {
                Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                Class cls2 = Long.TYPE;
                Trace.class.getMethod("isTagEnabled", new Class[]{cls2});
                Class cls3 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceBegin", new Class[]{cls2, cls, cls3});
                Trace.class.getMethod("asyncTraceEnd", new Class[]{cls2, cls, cls3});
                Trace.class.getMethod("traceCounter", new Class[]{cls2, cls, cls3});
            } catch (Exception e) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e);
            }
        }
    }
}
