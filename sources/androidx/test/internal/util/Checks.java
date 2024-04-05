package androidx.test.internal.util;

import android.os.Looper;
import android.os.StrictMode;
import androidx.test.internal.platform.ThreadChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;

public final class Checks {

    /* renamed from: a */
    public static final ThreadChecker f7689a;

    static {
        Class<ThreadChecker> cls = ThreadChecker.class;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        ArrayList arrayList = new ArrayList();
        Iterator<S> it = ServiceLoader.load(cls).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        if (arrayList.isEmpty()) {
            f7689a = new ThreadChecker() {
                /* renamed from: a */
                public final void mo12345a() {
                    boolean z = !Thread.currentThread().equals(Looper.getMainLooper().getThread());
                    int i = 0;
                    Object[] objArr = {Thread.currentThread().getName()};
                    ThreadChecker threadChecker = Checks.f7689a;
                    if (!z) {
                        StringBuilder sb = new StringBuilder("Method cannot be called on the main application thread (on: %s)".length() + 16);
                        int i2 = 0;
                        while (i < 1) {
                            int indexOf = "Method cannot be called on the main application thread (on: %s)".indexOf("%s", i2);
                            if (indexOf == -1) {
                                break;
                            }
                            sb.append("Method cannot be called on the main application thread (on: %s)".substring(i2, indexOf));
                            sb.append(objArr[i]);
                            i2 = indexOf + 2;
                            i++;
                        }
                        sb.append("Method cannot be called on the main application thread (on: %s)".substring(i2));
                        if (i < 1) {
                            sb.append(" [");
                            sb.append(objArr[i]);
                            for (int i3 = i + 1; i3 < 1; i3++) {
                                sb.append(", ");
                                sb.append(objArr[i3]);
                            }
                            sb.append(']');
                        }
                        throw new IllegalStateException(sb.toString());
                    }
                }
            };
        } else if (arrayList.size() == 1) {
            f7689a = (ThreadChecker) arrayList.get(0);
        } else {
            throw new IllegalStateException(String.format("Found more than one %s implementations.", new Object[]{cls.getName()}));
        }
    }
}
