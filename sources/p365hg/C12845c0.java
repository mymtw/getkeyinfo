package p365hg;

import android.util.Log;
import androidx.appcompat.widget.C0326j;
import com.facebook.LoggingBehavior;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import p453tf.C13418j;

/* renamed from: hg.c0 */
public final class C12845c0 {

    /* renamed from: e */
    public static final HashMap<String, String> f28333e = new HashMap<>();

    /* renamed from: f */
    public static final C12846a f28334f = new C12846a();

    /* renamed from: a */
    public final LoggingBehavior f28335a;

    /* renamed from: b */
    public final String f28336b;

    /* renamed from: c */
    public StringBuilder f28337c;

    /* renamed from: d */
    public int f28338d = 3;

    /* renamed from: hg.c0$a */
    public static final class C12846a {
        /* renamed from: a */
        public final void mo45625a(LoggingBehavior loggingBehavior, int i, String str, String str2) {
            C19383o.m32797g(loggingBehavior, "behavior");
            C19383o.m32797g(str, "tag");
            C19383o.m32797g(str2, "string");
            if (C13418j.m21114j(loggingBehavior)) {
                synchronized (this) {
                    for (Map.Entry next : C12845c0.f28333e.entrySet()) {
                        str2 = C19457k.m33023a1(str2, (String) next.getKey(), (String) next.getValue(), false);
                    }
                }
                if (!C19457k.m33025c1(str, "FacebookSDK.", false)) {
                    str = C0326j.m864i("FacebookSDK.", str);
                }
                Log.println(i, str, str2);
                if (loggingBehavior == LoggingBehavior.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }

        /* renamed from: b */
        public final void mo45626b(LoggingBehavior loggingBehavior, String str, String str2) {
            C19383o.m32797g(loggingBehavior, "behavior");
            C19383o.m32797g(str, "tag");
            C19383o.m32797g(str2, "string");
            mo45625a(loggingBehavior, 3, str, str2);
        }

        /* renamed from: c */
        public final void mo45627c(LoggingBehavior loggingBehavior, String str, String str2, Object... objArr) {
            C19383o.m32797g(loggingBehavior, "behavior");
            C19383o.m32797g(str, "tag");
            if (C13418j.m21114j(loggingBehavior)) {
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                String format = String.format(str2, Arrays.copyOf(copyOf, copyOf.length));
                C19383o.m32796f(format, "java.lang.String.format(format, *args)");
                mo45625a(loggingBehavior, 3, str, format);
            }
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            	at java.base/java.util.Objects.checkIndex(Objects.java:372)
            	at java.base/java.util.ArrayList.get(ArrayList.java:458)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        /* renamed from: d */
        public final synchronized void mo45628d(java.lang.String r3) {
            /*
                r2 = this;
                monitor-enter(r2)
                java.lang.String r0 = "accessToken"
                kotlin.jvm.internal.C19383o.m32797g(r3, r0)     // Catch:{ all -> 0x001d }
                com.facebook.LoggingBehavior r0 = com.facebook.LoggingBehavior.INCLUDE_ACCESS_TOKENS     // Catch:{ all -> 0x001d }
                boolean r0 = p453tf.C13418j.m21114j(r0)     // Catch:{ all -> 0x001d }
                if (r0 != 0) goto L_0x001b
                java.lang.String r0 = "ACCESS_TOKEN_REMOVED"
                monitor-enter(r2)     // Catch:{ all -> 0x001d }
                java.util.HashMap<java.lang.String, java.lang.String> r1 = p365hg.C12845c0.f28333e     // Catch:{ all -> 0x0018 }
                r1.put(r3, r0)     // Catch:{ all -> 0x0018 }
                monitor-exit(r2)     // Catch:{ all -> 0x001d }
                goto L_0x001b
            L_0x0018:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x001d }
                throw r3     // Catch:{ all -> 0x001d }
            L_0x001b:
                monitor-exit(r2)
                return
            L_0x001d:
                r3 = move-exception
                monitor-exit(r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p365hg.C12845c0.C12846a.mo45628d(java.lang.String):void");
        }
    }

    public C12845c0(LoggingBehavior loggingBehavior) {
        C19383o.m32797g(loggingBehavior, "behavior");
        this.f28335a = loggingBehavior;
        C12879l0.m20602f("Request", "tag");
        this.f28336b = "FacebookSDK.Request";
        this.f28337c = new StringBuilder();
    }

    /* renamed from: d */
    public static final void m20491d(LoggingBehavior loggingBehavior, String str, Object... objArr) {
        f28334f.mo45627c(loggingBehavior, "b", str, objArr);
    }

    /* renamed from: a */
    public final void mo45622a(String str) {
        if (C13418j.m21114j(this.f28335a)) {
            this.f28337c.append(str);
        }
    }

    /* renamed from: b */
    public final void mo45623b(Object obj, String str) {
        C19383o.m32797g(str, "key");
        C19383o.m32797g(obj, "value");
        Object[] objArr = {str, obj};
        if (C13418j.m21114j(this.f28335a)) {
            StringBuilder sb = this.f28337c;
            Object[] copyOf = Arrays.copyOf(objArr, 2);
            String format = String.format("  %s:\t%s\n", Arrays.copyOf(copyOf, copyOf.length));
            C19383o.m32796f(format, "java.lang.String.format(format, *args)");
            sb.append(format);
        }
    }

    /* renamed from: c */
    public final void mo45624c() {
        String sb = this.f28337c.toString();
        C19383o.m32796f(sb, "contents.toString()");
        f28334f.mo45625a(this.f28335a, this.f28338d, this.f28336b, sb);
        this.f28337c = new StringBuilder();
    }
}
