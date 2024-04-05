package p393lg;

import com.appboy.Constants;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.instrument.InstrumentData;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.reflect.C19421p;
import kotlin.text.C19457k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p365hg.C12869i0;
import p378jg.C12986f;
import p568fn.C17782b;
import p764pq.C20056h;

/* renamed from: lg.a */
public final class C13022a implements Thread.UncaughtExceptionHandler {

    /* renamed from: b */
    public static final String f28675b = C13022a.class.getCanonicalName();

    /* renamed from: c */
    public static C13022a f28676c;

    /* renamed from: d */
    public static final C13023a f28677d = new C13023a();

    /* renamed from: a */
    public final Thread.UncaughtExceptionHandler f28678a;

    /* renamed from: lg.a$a */
    public static final class C13023a {

        /* renamed from: lg.a$a$a */
        public static final class C13024a implements GraphRequest.C12195b {

            /* renamed from: a */
            public final /* synthetic */ List f28679a;

            public C13024a(List list) {
                this.f28679a = list;
            }

            /* renamed from: a */
            public final void mo39238a(GraphResponse graphResponse) {
                JSONObject jSONObject;
                try {
                    if (graphResponse.f27247d == null && (jSONObject = graphResponse.f27244a) != null && jSONObject.getBoolean("success")) {
                        for (InstrumentData instrumentData : this.f28679a) {
                            C17782b.m29854T(instrumentData.f27374a);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
        }

        /* renamed from: lg.a$a$b */
        public static final class C13025b<T> implements Comparator {

            /* renamed from: b */
            public static final C13025b f28680b = new C13025b();

            public final int compare(Object obj, Object obj2) {
                InstrumentData instrumentData = (InstrumentData) obj;
                InstrumentData instrumentData2 = (InstrumentData) obj2;
                C19383o.m32796f(instrumentData2, "o2");
                instrumentData.getClass();
                Long l = instrumentData.f27380g;
                if (l == null) {
                    return -1;
                }
                long longValue = l.longValue();
                Long l2 = instrumentData2.f27380g;
                if (l2 != null) {
                    return (l2.longValue() > longValue ? 1 : (l2.longValue() == longValue ? 0 : -1));
                }
                return 1;
            }
        }

        /* renamed from: a */
        public static void m20734a() {
            File[] fileArr;
            if (!C12869i0.m20587z()) {
                File X = C17782b.m29858X();
                if (X == null || (fileArr = X.listFiles(C12986f.f28599a)) == null) {
                    fileArr = new File[0];
                }
                ArrayList arrayList = new ArrayList(fileArr.length);
                for (File file : fileArr) {
                    C19383o.m32797g(file, ResponseConstants.FILE);
                    arrayList.add(new InstrumentData(file));
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((InstrumentData) next).mo39441a()) {
                        arrayList2.add(next);
                    }
                }
                List l1 = C19327t.m32656l1(arrayList2, C13025b.f28680b);
                JSONArray jSONArray = new JSONArray();
                C20056h l = C19388s.m32816D0(0, Math.min(l1.size(), 5)).iterator();
                while (l.f44419d) {
                    jSONArray.put(l1.get(l.nextInt()));
                }
                C17782b.m29873l0("crash_reports", jSONArray, new C13024a(l1));
            }
        }
    }

    public C13022a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f28678a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        boolean z;
        C19383o.m32797g(thread, Constants.APPBOY_PUSH_TITLE_KEY);
        C19383o.m32797g(th, "e");
        Throwable th2 = null;
        Throwable th3 = th;
        loop0:
        while (true) {
            z = false;
            if (th3 == null || th3 == th2) {
                break;
            }
            for (StackTraceElement stackTraceElement : th3.getStackTrace()) {
                C19383o.m32796f(stackTraceElement, "element");
                String className = stackTraceElement.getClassName();
                C19383o.m32796f(className, "element.className");
                if (C19457k.m33025c1(className, "com.facebook", false)) {
                    z = true;
                    break loop0;
                }
            }
            th2 = th3;
            th3 = th3.getCause();
        }
        if (z) {
            C19421p.m32918F(th);
            InstrumentData.Type type = InstrumentData.Type.CrashReport;
            C19383o.m32797g(type, Constants.APPBOY_PUSH_TITLE_KEY);
            new InstrumentData(th, type).mo39442b();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f28678a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
