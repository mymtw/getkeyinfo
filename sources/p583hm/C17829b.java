package p583hm;

import android.text.TextUtils;
import com.google.firebase.abt.AbtException;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p607km.C18144a;
import p722ym.C18895a;

/* renamed from: hm.b */
public final class C17829b {

    /* renamed from: a */
    public final C18895a<C18144a> f38740a;

    /* renamed from: b */
    public final String f38741b = "frc";

    /* renamed from: c */
    public Integer f38742c = null;

    public C17829b(C18895a aVar) {
        this.f38740a = aVar;
    }

    /* renamed from: a */
    public final List<C18144a.C18145a> mo69064a() {
        return this.f38740a.get().mo69691c(this.f38741b);
    }

    /* renamed from: b */
    public final void mo69065b(ArrayList arrayList) throws AbtException {
        if (this.f38740a.get() != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Map map = (Map) it.next();
                String[] strArr = C17828a.f38732g;
                ArrayList arrayList3 = new ArrayList();
                String[] strArr2 = C17828a.f38732g;
                for (int i = 0; i < 5; i++) {
                    String str = strArr2[i];
                    if (!map.containsKey(str)) {
                        arrayList3.add(str);
                    }
                }
                if (arrayList3.isEmpty()) {
                    try {
                        arrayList2.add(new C17828a((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", C17828a.f38733h.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis"))));
                    } catch (ParseException e) {
                        throw new AbtException("Could not process experiment: parsing experiment start time failed.", e);
                    } catch (NumberFormatException e2) {
                        throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e2);
                    }
                } else {
                    throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", new Object[]{arrayList3}));
                }
            }
            if (!arrayList2.isEmpty()) {
                HashSet hashSet = new HashSet();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    hashSet.add(((C17828a) it2.next()).f38734a);
                }
                List<C18144a.C18145a> a = mo69064a();
                HashSet hashSet2 = new HashSet();
                for (C18144a.C18145a aVar : a) {
                    hashSet2.add(aVar.f39611b);
                }
                ArrayList<C18144a.C18145a> arrayList4 = new ArrayList<>();
                for (C18144a.C18145a next : a) {
                    if (!hashSet.contains(next.f39611b)) {
                        arrayList4.add(next);
                    }
                }
                for (C18144a.C18145a aVar2 : arrayList4) {
                    this.f38740a.get().mo69689a(aVar2.f39611b);
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    C17828a aVar3 = (C17828a) it3.next();
                    if (!hashSet2.contains(aVar3.f38734a)) {
                        arrayList5.add(aVar3);
                    }
                }
                ArrayDeque arrayDeque = new ArrayDeque(mo69064a());
                if (this.f38742c == null) {
                    this.f38742c = Integer.valueOf(this.f38740a.get().mo69694f(this.f38741b));
                }
                int intValue = this.f38742c.intValue();
                Iterator it4 = arrayList5.iterator();
                while (it4.hasNext()) {
                    C17828a aVar4 = (C17828a) it4.next();
                    while (arrayDeque.size() >= intValue) {
                        this.f38740a.get().mo69689a(((C18144a.C18145a) arrayDeque.pollFirst()).f39611b);
                    }
                    String str2 = this.f38741b;
                    aVar4.getClass();
                    C18144a.C18145a aVar5 = new C18144a.C18145a();
                    aVar5.f39610a = str2;
                    aVar5.f39622m = aVar4.f38737d.getTime();
                    aVar5.f39611b = aVar4.f38734a;
                    aVar5.f39612c = aVar4.f38735b;
                    aVar5.f39613d = TextUtils.isEmpty(aVar4.f38736c) ? null : aVar4.f38736c;
                    aVar5.f39614e = aVar4.f38738e;
                    aVar5.f39619j = aVar4.f38739f;
                    this.f38740a.get().mo69692d(aVar5);
                    arrayDeque.offer(aVar5);
                }
            } else if (this.f38740a.get() != null) {
                for (C18144a.C18145a aVar6 : mo69064a()) {
                    this.f38740a.get().mo69689a(aVar6.f39611b);
                }
            } else {
                throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
            }
        } else {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }
}
