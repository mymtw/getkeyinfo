package p039c8;

import com.cardinalcommerce.dependencies.internal.minidev.json.JSONArray;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import p039c8.C4430a;
import p305z7.C8458a;
import p305z7.C8459b;

/* renamed from: c8.e */
public final class C4449e {

    /* renamed from: a */
    public C4447c f9741a;

    /* renamed from: b */
    public C4448d f9742b = new C4448d(this);

    public C4449e() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(100);
        concurrentHashMap.put(Date.class, C4445b.f9740b);
        C4430a.C4436f fVar = C4430a.f9726b;
        concurrentHashMap.put(int[].class, fVar);
        C4430a.C4444n nVar = C4430a.f9727c;
        concurrentHashMap.put(Integer[].class, nVar);
        concurrentHashMap.put(short[].class, fVar);
        concurrentHashMap.put(Short[].class, nVar);
        concurrentHashMap.put(long[].class, C4430a.f9732h);
        concurrentHashMap.put(Long[].class, C4430a.f9733i);
        concurrentHashMap.put(byte[].class, C4430a.f9728d);
        concurrentHashMap.put(Byte[].class, C4430a.f9729e);
        concurrentHashMap.put(char[].class, C4430a.f9730f);
        concurrentHashMap.put(Character[].class, C4430a.f9731g);
        concurrentHashMap.put(float[].class, C4430a.f9734j);
        concurrentHashMap.put(Float[].class, C4430a.f9735k);
        concurrentHashMap.put(double[].class, C4430a.f9736l);
        concurrentHashMap.put(Double[].class, C4430a.f9737m);
        concurrentHashMap.put(boolean[].class, C4430a.f9738n);
        concurrentHashMap.put(Boolean[].class, C4430a.f9739o);
        C4447c cVar = new C4447c(this);
        this.f9741a = cVar;
        concurrentHashMap.put(C8459b.class, cVar);
        concurrentHashMap.put(C8458a.class, this.f9741a);
        concurrentHashMap.put(JSONArray.class, this.f9741a);
        concurrentHashMap.put(JSONObject.class, this.f9741a);
    }
}
