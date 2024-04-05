package p687uj;

import com.google.firebase.messaging.reporting.MessagingClientEvent;
import java.util.HashMap;
import p524cn.C14172a;

/* renamed from: uj.d */
public abstract class C18588d {

    /* renamed from: a */
    public static final C18600p f41058a;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        C18599o oVar = C18599o.f41076a;
        Class<C18588d> cls = C18588d.class;
        hashMap.put(cls, C18587c.f41056a);
        hashMap2.remove(cls);
        Class<C14172a> cls2 = C14172a.class;
        hashMap.put(cls2, C18586b.f41054a);
        hashMap2.remove(cls2);
        Class<MessagingClientEvent> cls3 = MessagingClientEvent.class;
        hashMap.put(cls3, C18585a.f41038a);
        hashMap2.remove(cls3);
        f41058a = new C18600p(new HashMap(hashMap), new HashMap(hashMap2), oVar);
    }

    /* renamed from: a */
    public abstract C14172a mo70087a();
}
