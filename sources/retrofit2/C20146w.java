package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.C19928a0;
import okhttp3.C19944e;
import okhttp3.C19997p;
import okhttp3.C20009t;
import okhttp3.C20016y;
import p765pr.C20068g;
import retrofit2.C20090c;
import retrofit2.C20099f;

/* renamed from: retrofit2.w */
public final class C20146w {

    /* renamed from: a */
    public final ConcurrentHashMap f44617a = new ConcurrentHashMap();

    /* renamed from: b */
    public final C19944e.C19945a f44618b;

    /* renamed from: c */
    public final C19997p f44619c;

    /* renamed from: d */
    public final List<C20099f.C20100a> f44620d;

    /* renamed from: e */
    public final List<C20090c.C20091a> f44621e;

    /* renamed from: f */
    public final boolean f44622f;

    /* renamed from: retrofit2.w$a */
    public class C20147a implements InvocationHandler {

        /* renamed from: a */
        public final C20138s f44623a = C20138s.f44559c;

        /* renamed from: b */
        public final Object[] f44624b = new Object[0];

        /* renamed from: c */
        public final /* synthetic */ Class f44625c;

        public C20147a(Class cls) {
            this.f44625c = cls;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f44624b;
            }
            return this.f44623a.f44560a && method.isDefault() ? this.f44623a.mo74377b(this.f44625c, obj, method, objArr) : C20146w.this.mo74388c(method).mo74369a(objArr);
        }
    }

    /* renamed from: retrofit2.w$b */
    public static final class C20148b {

        /* renamed from: a */
        public final C20138s f44627a;

        /* renamed from: b */
        public C19944e.C19945a f44628b;

        /* renamed from: c */
        public C19997p f44629c;

        /* renamed from: d */
        public final ArrayList f44630d = new ArrayList();

        /* renamed from: e */
        public final ArrayList f44631e = new ArrayList();

        public C20148b() {
            C20138s sVar = C20138s.f44559c;
            this.f44627a = sVar;
        }

        /* renamed from: a */
        public final void mo74393a(C20068g gVar) {
            this.f44631e.add(gVar);
        }

        /* renamed from: b */
        public final void mo74394b(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            C19997p.f44238l.getClass();
            C19997p c = C19997p.C19999b.m34234c(str);
            List<String> list = c.f44245g;
            if ("".equals(list.get(list.size() - 1))) {
                this.f44629c = c;
                return;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + c);
        }

        /* renamed from: c */
        public final C20146w mo74395c() {
            if (this.f44629c != null) {
                C19944e.C19945a aVar = this.f44628b;
                if (aVar == null) {
                    aVar = new C20009t();
                }
                Executor a = this.f44627a.mo74376a();
                ArrayList arrayList = new ArrayList(this.f44631e);
                C20138s sVar = this.f44627a;
                sVar.getClass();
                C20102h hVar = new C20102h(a);
                arrayList.addAll(sVar.f44560a ? Arrays.asList(new C20090c.C20091a[]{C20093e.f44475a, hVar}) : Collections.singletonList(hVar));
                ArrayList arrayList2 = new ArrayList(this.f44630d.size() + 1 + (this.f44627a.f44560a ? 1 : 0));
                arrayList2.add(new C20078a());
                arrayList2.addAll(this.f44630d);
                arrayList2.addAll(this.f44627a.f44560a ? Collections.singletonList(C20118o.f44516a) : Collections.emptyList());
                return new C20146w(aVar, this.f44629c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList));
            }
            throw new IllegalStateException("Base URL required.");
        }
    }

    public C20146w(C19944e.C19945a aVar, C19997p pVar, List list, List list2) {
        this.f44618b = aVar;
        this.f44619c = pVar;
        this.f44620d = list;
        this.f44621e = list2;
        this.f44622f = false;
    }

    /* renamed from: a */
    public final C20090c<?, ?> mo74386a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f44621e.indexOf((Object) null) + 1;
        int size = this.f44621e.size();
        for (int i = indexOf; i < size; i++) {
            C20090c<?, ?> a = this.f44621e.get(i).mo74332a(type, annotationArr);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f44621e.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f44621e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public final <T> T mo74387b(Class<T> cls) {
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class<T> cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                    sb.append(cls2.getName());
                    if (cls2 != cls) {
                        sb.append(" which is an interface of ");
                        sb.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.f44622f) {
                C20138s sVar = C20138s.f44559c;
                for (Method method : cls.getDeclaredMethods()) {
                    if (!(sVar.f44560a && method.isDefault()) && !Modifier.isStatic(method.getModifiers())) {
                        mo74388c(method);
                    }
                }
            }
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C20147a(cls));
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    /* renamed from: c */
    public final C20149x<?> mo74388c(Method method) {
        C20149x<?> xVar;
        C20149x<?> xVar2 = (C20149x) this.f44617a.get(method);
        if (xVar2 != null) {
            return xVar2;
        }
        synchronized (this.f44617a) {
            xVar = (C20149x) this.f44617a.get(method);
            if (xVar == null) {
                xVar = C20149x.m34449b(this, method);
                this.f44617a.put(method, xVar);
            }
        }
        return xVar;
    }

    /* renamed from: d */
    public final <T> C20099f<T, C20016y> mo74389d(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f44620d.indexOf((Object) null) + 1;
        int size = this.f44620d.size();
        for (int i = indexOf; i < size; i++) {
            C20099f<T, C20016y> a = this.f44620d.get(i).mo74337a(type, annotationArr);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f44620d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f44620d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: e */
    public final <T> C20099f<C19928a0, T> mo74390e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f44620d.indexOf((Object) null) + 1;
        int size = this.f44620d.size();
        for (int i = indexOf; i < size; i++) {
            C20099f<C19928a0, ?> b = this.f44620d.get(i).mo74338b(type, annotationArr, this);
            if (b != null) {
                return b;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f44620d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f44620d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: f */
    public final void mo74391f(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        int size = this.f44620d.size();
        for (int i = 0; i < size; i++) {
            this.f44620d.get(i).getClass();
        }
    }
}
