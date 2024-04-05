package p385kg;

import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.instrument.InstrumentData;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p365hg.C12869i0;
import p378jg.C12984d;
import p401mg.C13080a;
import p568fn.C17782b;
import p764pq.C20056h;

/* renamed from: kg.b */
public final class C12999b {

    /* renamed from: a */
    public static final AtomicBoolean f28620a = new AtomicBoolean(false);

    /* renamed from: kg.b$a */
    public static final class C13000a implements GraphRequest.C12195b {

        /* renamed from: a */
        public final /* synthetic */ List f28621a;

        public C13000a(List list) {
            this.f28621a = list;
        }

        /* renamed from: a */
        public final void mo39238a(GraphResponse graphResponse) {
            JSONObject jSONObject;
            try {
                if (graphResponse.f27247d == null && (jSONObject = graphResponse.f27244a) != null && jSONObject.getBoolean("success")) {
                    for (InstrumentData instrumentData : this.f28621a) {
                        C17782b.m29854T(instrumentData.f27374a);
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: kg.b$b */
    public static final class C13001b<T> implements Comparator {

        /* renamed from: b */
        public static final C13001b f28622b = new C13001b();

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

    static {
        new C12999b();
    }

    /* renamed from: a */
    public static final void m20709a() {
        File[] fileArr;
        Class<C12999b> cls = C12999b.class;
        if (!C13080a.m20762b(cls)) {
            try {
                if (!C12869i0.m20587z()) {
                    File X = C17782b.m29858X();
                    if (X == null || (fileArr = X.listFiles(C12984d.f28597a)) == null) {
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
                    List l1 = C19327t.m32656l1(arrayList2, C13001b.f28622b);
                    JSONArray jSONArray = new JSONArray();
                    C20056h l = C19388s.m32816D0(0, Math.min(l1.size(), 5)).iterator();
                    while (l.f44419d) {
                        jSONArray.put(l1.get(l.nextInt()));
                    }
                    C17782b.m29873l0("anr_reports", jSONArray, new C13000a(l1));
                }
            } catch (Throwable th) {
                C13080a.m20761a(cls, th);
            }
        }
    }
}
