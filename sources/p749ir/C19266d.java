package p749ir;

import android.support.p013v4.media.C0073e;
import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19459m;
import kotlin.text.C19460n;

/* renamed from: ir.d */
public final class C19266d extends Handler {

    /* renamed from: a */
    public static final C19266d f43131a = new C19266d();

    public final void close() {
    }

    public final void flush() {
    }

    public final void publish(LogRecord logRecord) {
        int min;
        C19383o.m32797g(logRecord, "record");
        CopyOnWriteArraySet<Logger> copyOnWriteArraySet = C19265c.f43129a;
        String loggerName = logRecord.getLoggerName();
        C19383o.m32796f(loggerName, "record.loggerName");
        int i = logRecord.getLevel().intValue() > Level.INFO.intValue() ? 5 : logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        C19383o.m32796f(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String str = C19265c.f43130b.get(loggerName);
        if (str == null) {
            str = C19460n.m33059J1(23, loggerName);
        }
        if (Log.isLoggable(str, i)) {
            if (thrown != null) {
                StringBuilder k = C0073e.m211k(message, "\n");
                k.append(Log.getStackTraceString(thrown));
                message = k.toString();
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int k1 = C19459m.m33042k1(message, 10, i2, false, 4);
                if (k1 == -1) {
                    k1 = length;
                }
                while (true) {
                    min = Math.min(k1, i2 + 4000);
                    String substring = message.substring(i2, min);
                    C19383o.m32796f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i, str, substring);
                    if (min >= k1) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
        }
    }
}
