package p461uf;

import android.preference.PreferenceManager;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p453tf.C13418j;

/* renamed from: uf.b */
public final class C13501b {

    /* renamed from: a */
    public static final String f29538a = C13501b.class.getSimpleName();

    /* renamed from: b */
    public static final ReentrantReadWriteLock f29539b = new ReentrantReadWriteLock();

    /* renamed from: c */
    public static String f29540c;

    /* renamed from: d */
    public static volatile boolean f29541d;

    /* renamed from: e */
    public static final C13501b f29542e = new C13501b();

    /* renamed from: a */
    public static void m21264a() {
        if (!f29541d) {
            ReentrantReadWriteLock reentrantReadWriteLock = f29539b;
            reentrantReadWriteLock.writeLock().lock();
            try {
                if (!f29541d) {
                    f29540c = PreferenceManager.getDefaultSharedPreferences(C13418j.m21106b()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", (String) null);
                    f29541d = true;
                }
                reentrantReadWriteLock.writeLock().unlock();
            } catch (Throwable th) {
                f29539b.writeLock().unlock();
                throw th;
            }
        }
    }
}
