package p461uf;

import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.PersistedEvents;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import kotlin.jvm.internal.C19383o;
import p312ag.C8527d;
import p401mg.C13080a;

/* renamed from: uf.g */
public final class C13509g {

    /* renamed from: a */
    public static final String f29560a = C13509g.class.getName();

    /* renamed from: uf.g$a */
    public static final class C13510a extends ObjectInputStream {
        public C13510a(BufferedInputStream bufferedInputStream) {
            super(bufferedInputStream);
        }

        public final ObjectStreamClass readClassDescriptor() throws IOException, ClassNotFoundException {
            ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
            C19383o.m32796f(readClassDescriptor, "resultClassDescriptor");
            if (C19383o.m32792b(readClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                readClassDescriptor = ObjectStreamClass.lookup(AccessTokenAppIdPair.SerializationProxyV1.class);
            } else if (C19383o.m32792b(readClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
                readClassDescriptor = ObjectStreamClass.lookup(AppEvent.SerializationProxyV2.class);
            }
            C19383o.m32796f(readClassDescriptor, "resultClassDescriptor");
            return readClassDescriptor;
        }
    }

    static {
        new C13509g();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        p401mg.C13080a.m20761a(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005f, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized void m21272a(androidx.appcompat.app.C0164l r5) {
        /*
            java.lang.Class<uf.g> r0 = p461uf.C13509g.class
            monitor-enter(r0)
            boolean r1 = p401mg.C13080a.m20762b(r0)     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r0)
            return
        L_0x000b:
            java.lang.String r1 = "eventsToPersist"
            kotlin.jvm.internal.C19383o.m32797g(r5, r1)     // Catch:{ all -> 0x0051 }
            int r1 = p312ag.C8527d.f18569a     // Catch:{ all -> 0x0051 }
            com.facebook.appevents.PersistedEvents r1 = m21274c()     // Catch:{ all -> 0x0051 }
            java.util.Set r2 = r5.mo1419r()     // Catch:{ all -> 0x0051 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0051 }
        L_0x001e:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0051 }
            if (r3 == 0) goto L_0x0056
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0051 }
            com.facebook.appevents.AccessTokenAppIdPair r3 = (com.facebook.appevents.AccessTokenAppIdPair) r3     // Catch:{ all -> 0x0051 }
            monitor-enter(r5)     // Catch:{ all -> 0x0051 }
            java.lang.String r4 = "accessTokenAppIdPair"
            kotlin.jvm.internal.C19383o.m32797g(r3, r4)     // Catch:{ all -> 0x0053 }
            java.lang.Object r4 = r5.f398b     // Catch:{ all -> 0x0053 }
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ all -> 0x0053 }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ all -> 0x0053 }
            uf.n r4 = (p461uf.C13521n) r4     // Catch:{ all -> 0x0053 }
            monitor-exit(r5)     // Catch:{ all -> 0x0051 }
            if (r4 == 0) goto L_0x0045
            java.util.List r4 = r4.mo46178c()     // Catch:{ all -> 0x0051 }
            r1.addEvents(r3, r4)     // Catch:{ all -> 0x0051 }
            goto L_0x001e
        L_0x0045:
            java.lang.String r5 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0051 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0051 }
            r1.<init>(r5)     // Catch:{ all -> 0x0051 }
            throw r1     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r5 = move-exception
            goto L_0x005b
        L_0x0053:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0051 }
            throw r1     // Catch:{ all -> 0x0051 }
        L_0x0056:
            m21275d(r1)     // Catch:{ all -> 0x0051 }
            monitor-exit(r0)
            return
        L_0x005b:
            p401mg.C13080a.m20761a(r0, r5)     // Catch:{ all -> 0x0060 }
            monitor-exit(r0)
            return
        L_0x0060:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p461uf.C13509g.m21272a(androidx.appcompat.app.l):void");
    }

    /* renamed from: b */
    public static final synchronized void m21273b(AccessTokenAppIdPair accessTokenAppIdPair, C13521n nVar) {
        Class<C13509g> cls = C13509g.class;
        synchronized (cls) {
            if (!C13080a.m20762b(cls)) {
                try {
                    C19383o.m32797g(accessTokenAppIdPair, "accessTokenAppIdPair");
                    C19383o.m32797g(nVar, "appEvents");
                    int i = C8527d.f18569a;
                    PersistedEvents c = m21274c();
                    c.addEvents(accessTokenAppIdPair, nVar.mo46178c());
                    m21275d(c);
                } catch (Throwable th) {
                    C13080a.m20761a(cls, th);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x009d A[Catch:{ Exception -> 0x003c, all -> 0x00a4 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized com.facebook.appevents.PersistedEvents m21274c() {
        /*
            java.lang.Class<uf.g> r0 = p461uf.C13509g.class
            monitor-enter(r0)
            boolean r1 = p401mg.C13080a.m20762b(r0)     // Catch:{ all -> 0x00aa }
            r2 = 0
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)
            return r2
        L_0x000c:
            int r1 = p312ag.C8527d.f18569a     // Catch:{ all -> 0x00a4 }
            android.content.Context r1 = p453tf.C13418j.m21106b()     // Catch:{ all -> 0x00a4 }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.FileInputStream r3 = r1.openFileInput(r3)     // Catch:{ FileNotFoundException -> 0x0085, Exception -> 0x0052, all -> 0x004f }
            java.lang.String r4 = "context.openFileInput(PERSISTED_EVENTS_FILENAME)"
            kotlin.jvm.internal.C19383o.m32796f(r3, r4)     // Catch:{ FileNotFoundException -> 0x0085, Exception -> 0x0052, all -> 0x004f }
            uf.g$a r4 = new uf.g$a     // Catch:{ FileNotFoundException -> 0x0085, Exception -> 0x0052, all -> 0x004f }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x0085, Exception -> 0x0052, all -> 0x004f }
            r5.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085, Exception -> 0x0052, all -> 0x004f }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0085, Exception -> 0x0052, all -> 0x004f }
            java.lang.Object r3 = r4.readObject()     // Catch:{ FileNotFoundException -> 0x0086, Exception -> 0x004d }
            if (r3 == 0) goto L_0x0045
            com.facebook.appevents.PersistedEvents r3 = (com.facebook.appevents.PersistedEvents) r3     // Catch:{ FileNotFoundException -> 0x0086, Exception -> 0x004d }
            p365hg.C12869i0.m20566e(r4)     // Catch:{ all -> 0x00a4 }
            java.lang.String r4 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r4)     // Catch:{ Exception -> 0x003c }
            r1.delete()     // Catch:{ Exception -> 0x003c }
            goto L_0x009b
        L_0x003c:
            r1 = move-exception
            java.lang.String r4 = f29560a     // Catch:{ all -> 0x00a4 }
            java.lang.String r5 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r4, r5, r1)     // Catch:{ all -> 0x00a4 }
            goto L_0x009b
        L_0x0045:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch:{ FileNotFoundException -> 0x0086, Exception -> 0x004d }
            java.lang.String r5 = "null cannot be cast to non-null type com.facebook.appevents.PersistedEvents"
            r3.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0086, Exception -> 0x004d }
            throw r3     // Catch:{ FileNotFoundException -> 0x0086, Exception -> 0x004d }
        L_0x004d:
            r3 = move-exception
            goto L_0x0054
        L_0x004f:
            r3 = move-exception
            r4 = r2
            goto L_0x006f
        L_0x0052:
            r3 = move-exception
            r4 = r2
        L_0x0054:
            java.lang.String r5 = f29560a     // Catch:{ all -> 0x006e }
            java.lang.String r6 = "Got unexpected exception while reading events: "
            android.util.Log.w(r5, r6, r3)     // Catch:{ all -> 0x006e }
            p365hg.C12869i0.m20566e(r4)     // Catch:{ all -> 0x00a4 }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x0068 }
            r1.delete()     // Catch:{ Exception -> 0x0068 }
            goto L_0x009a
        L_0x0068:
            r1 = move-exception
            java.lang.String r3 = f29560a     // Catch:{ all -> 0x00a4 }
        L_0x006b:
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            goto L_0x0097
        L_0x006e:
            r3 = move-exception
        L_0x006f:
            p365hg.C12869i0.m20566e(r4)     // Catch:{ all -> 0x00a4 }
            java.lang.String r4 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r4)     // Catch:{ Exception -> 0x007c }
            r1.delete()     // Catch:{ Exception -> 0x007c }
            goto L_0x0084
        L_0x007c:
            r1 = move-exception
            java.lang.String r4 = f29560a     // Catch:{ all -> 0x00a4 }
            java.lang.String r5 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r4, r5, r1)     // Catch:{ all -> 0x00a4 }
        L_0x0084:
            throw r3     // Catch:{ all -> 0x00a4 }
        L_0x0085:
            r4 = r2
        L_0x0086:
            p365hg.C12869i0.m20566e(r4)     // Catch:{ all -> 0x00a4 }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x0093 }
            r1.delete()     // Catch:{ Exception -> 0x0093 }
            goto L_0x009a
        L_0x0093:
            r1 = move-exception
            java.lang.String r3 = f29560a     // Catch:{ all -> 0x00a4 }
            goto L_0x006b
        L_0x0097:
            android.util.Log.w(r3, r4, r1)     // Catch:{ all -> 0x00a4 }
        L_0x009a:
            r3 = r2
        L_0x009b:
            if (r3 != 0) goto L_0x00a2
            com.facebook.appevents.PersistedEvents r3 = new com.facebook.appevents.PersistedEvents     // Catch:{ all -> 0x00a4 }
            r3.<init>()     // Catch:{ all -> 0x00a4 }
        L_0x00a2:
            monitor-exit(r0)
            return r3
        L_0x00a4:
            r1 = move-exception
            p401mg.C13080a.m20761a(r0, r1)     // Catch:{ all -> 0x00aa }
            monitor-exit(r0)
            return r2
        L_0x00aa:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p461uf.C13509g.m21274c():com.facebook.appevents.PersistedEvents");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0038 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m21275d(com.facebook.appevents.PersistedEvents r7) {
        /*
            java.lang.String r0 = "AppEventsLogger.persistedevents"
            java.lang.Class<uf.g> r1 = p461uf.C13509g.class
            boolean r2 = p401mg.C13080a.m20762b(r1)
            if (r2 == 0) goto L_0x000b
            return
        L_0x000b:
            r2 = 0
            android.content.Context r3 = p453tf.C13418j.m21106b()     // Catch:{ all -> 0x0041 }
            java.io.ObjectOutputStream r4 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0029 }
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0029 }
            r6 = 0
            java.io.FileOutputStream r6 = r3.openFileOutput(r0, r6)     // Catch:{ all -> 0x0029 }
            r5.<init>(r6)     // Catch:{ all -> 0x0029 }
            r4.<init>(r5)     // Catch:{ all -> 0x0029 }
            r4.writeObject(r7)     // Catch:{ all -> 0x0026 }
            p365hg.C12869i0.m20566e(r4)     // Catch:{ all -> 0x0041 }
            goto L_0x003b
        L_0x0026:
            r7 = move-exception
            r2 = r4
            goto L_0x002a
        L_0x0029:
            r7 = move-exception
        L_0x002a:
            java.lang.String r4 = f29560a     // Catch:{ all -> 0x003c }
            java.lang.String r5 = "Got unexpected exception while persisting events: "
            android.util.Log.w(r4, r5, r7)     // Catch:{ all -> 0x003c }
            java.io.File r7 = r3.getFileStreamPath(r0)     // Catch:{ Exception -> 0x0038 }
            r7.delete()     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            p365hg.C12869i0.m20566e(r2)     // Catch:{ all -> 0x0041 }
        L_0x003b:
            return
        L_0x003c:
            r7 = move-exception
            p365hg.C12869i0.m20566e(r2)     // Catch:{ all -> 0x0041 }
            throw r7     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r7 = move-exception
            p401mg.C13080a.m20761a(r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p461uf.C13509g.m21275d(com.facebook.appevents.PersistedEvents):void");
    }
}
