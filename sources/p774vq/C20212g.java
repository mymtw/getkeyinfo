package p774vq;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.time.DateUtils;

/* renamed from: vq.g */
public final class C20212g {

    /* renamed from: b */
    public static final Object f44816b = new Object();

    /* renamed from: c */
    public static C20212g f44817c;

    /* renamed from: a */
    public ThreadPoolExecutor f44818a;

    public C20212g() {
        try {
            this.f44818a = new ThreadPoolExecutor(10, 10, DateUtils.MILLIS_PER_MINUTE, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(256), new ThreadPoolExecutor.DiscardPolicy());
        } catch (Exception unused) {
        }
    }
}
