package com.bugsnag.android.repackaged.dslplatform.json;

import androidx.recyclerview.widget.RecyclerView;
import com.bugsnag.android.repackaged.dslplatform.json.C5840c;
import com.bugsnag.android.repackaged.dslplatform.json.C5858h;
import com.bugsnag.android.repackaged.dslplatform.json.C5865j;
import com.bugsnag.android.repackaged.dslplatform.json.C5895k;
import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p149j3.C7107h;

/* renamed from: com.bugsnag.android.repackaged.dslplatform.json.e */
public final class C5847e<TContext> {

    /* renamed from: a */
    public final C5852e<TContext> f12508a;

    /* renamed from: b */
    public final C5855h f12509b;

    /* renamed from: c */
    public final CopyOnWriteArrayList f12510c;

    /* renamed from: d */
    public final JsonReader.ErrorInfo f12511d;

    /* renamed from: e */
    public final JsonReader.DoublePrecision f12512e;

    /* renamed from: f */
    public final JsonReader.UnknownNumberParsing f12513f;

    /* renamed from: g */
    public final int f12514g;

    /* renamed from: h */
    public final int f12515h;

    /* renamed from: i */
    public final C5849b f12516i;

    /* renamed from: j */
    public final C7107h f12517j;

    /* renamed from: k */
    public final ConcurrentHashMap f12518k = new ConcurrentHashMap();

    /* renamed from: l */
    public final ConcurrentHashMap f12519l = new ConcurrentHashMap();

    /* renamed from: m */
    public final ConcurrentHashMap f12520m = new ConcurrentHashMap();

    /* renamed from: n */
    public final ConcurrentHashMap f12521n;

    /* renamed from: o */
    public final ConcurrentHashMap f12522o;

    /* renamed from: com.bugsnag.android.repackaged.dslplatform.json.e$a */
    public class C5848a extends ThreadLocal<C5858h> {
        public C5848a(C5847e eVar) {
        }

        public final Object initialValue() {
            return new C5858h();
        }
    }

    /* renamed from: com.bugsnag.android.repackaged.dslplatform.json.e$b */
    public class C5849b extends ThreadLocal<JsonReader> {
        public C5849b() {
        }

        public final Object initialValue() {
            byte[] bArr = new byte[RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT];
            C5847e.this.getClass();
            C5847e eVar = C5847e.this;
            return new JsonReader(bArr, new char[64], eVar.f12509b, eVar.f12511d, eVar.f12512e, eVar.f12513f, eVar.f12514g, eVar.f12515h);
        }
    }

    /* renamed from: com.bugsnag.android.repackaged.dslplatform.json.e$c */
    public class C5850c implements C5858h.C5859a<Map> {
    }

    /* renamed from: com.bugsnag.android.repackaged.dslplatform.json.e$d */
    public interface C5851d<T> {
        /* renamed from: a */
        Object mo16662a();
    }

    /* renamed from: com.bugsnag.android.repackaged.dslplatform.json.e$e */
    public interface C5852e<TContext> {
        /* renamed from: a */
        Object mo16543a(Type type, C5853f fVar) throws IOException;
    }

    /* renamed from: com.bugsnag.android.repackaged.dslplatform.json.e$g */
    public static class C5854g<TContext> {

        /* renamed from: a */
        public C5852e<TContext> f12528a;

        /* renamed from: b */
        public C5855h f12529b = new C5855h();

        /* renamed from: c */
        public JsonReader.ErrorInfo f12530c = JsonReader.ErrorInfo.WITH_STACK_TRACE;

        /* renamed from: d */
        public JsonReader.DoublePrecision f12531d = JsonReader.DoublePrecision.DEFAULT;

        /* renamed from: e */
        public JsonReader.UnknownNumberParsing f12532e = JsonReader.UnknownNumberParsing.LONG_AND_BIGDECIMAL;

        /* renamed from: f */
        public int f12533f = RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN;

        /* renamed from: g */
        public int f12534g = 134217728;

        /* renamed from: h */
        public final ArrayList f12535h = new ArrayList();

        /* renamed from: i */
        public final ArrayList f12536i = new ArrayList();

        /* renamed from: j */
        public final ArrayList f12537j = new ArrayList();

        /* renamed from: k */
        public final ArrayList f12538k = new ArrayList();

        /* renamed from: l */
        public final HashSet f12539l = new HashSet();

        /* renamed from: m */
        public final HashMap f12540m = new HashMap();
    }

    /* renamed from: com.bugsnag.android.repackaged.dslplatform.json.e$h */
    public static class C5855h implements C5897l {

        /* renamed from: a */
        public final int f12541a;

        /* renamed from: b */
        public final String[] f12542b;

        public C5855h() {
            int i = 2;
            for (int i2 = 1; i2 < 10; i2++) {
                i *= 2;
            }
            this.f12541a = i - 1;
            this.f12542b = new String[i];
        }

        /* renamed from: a */
        public final String mo16666a(char[] cArr, int i) {
            long j = -2128831035;
            for (int i2 = 0; i2 < i; i2++) {
                j = (j ^ ((long) ((byte) cArr[i2]))) * 16777619;
            }
            int i3 = ((int) j) & this.f12541a;
            String str = this.f12542b[i3];
            if (str == null) {
                String str2 = new String(cArr, 0, i);
                this.f12542b[i3] = str2;
                return str2;
            } else if (str.length() != i) {
                String str3 = new String(cArr, 0, i);
                this.f12542b[i3] = str3;
                return str3;
            } else {
                for (int i4 = 0; i4 < str.length(); i4++) {
                    if (str.charAt(i4) != cArr[i4]) {
                        String str4 = new String(cArr, 0, i);
                        this.f12542b[i3] = str4;
                        return str4;
                    }
                }
                return str;
            }
        }
    }

    static {
        Charset.forName("UTF-8");
    }

    public C5847e(C5854g<TContext> gVar) {
        C5854g<TContext> gVar2 = gVar;
        Class<short[]> cls = short[].class;
        Class<Integer> cls2 = Integer.class;
        Class<int[]> cls3 = int[].class;
        Class<Float> cls4 = Float.class;
        Class<float[]> cls5 = float[].class;
        Class<Double> cls6 = Double.class;
        Class<double[]> cls7 = double[].class;
        Class<Boolean> cls8 = Boolean.class;
        Class<boolean[]> cls9 = boolean[].class;
        Class<byte[]> cls10 = byte[].class;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.f12510c = copyOnWriteArrayList2;
        CopyOnWriteArrayList copyOnWriteArrayList3 = new CopyOnWriteArrayList();
        new ConcurrentHashMap();
        this.f12521n = new ConcurrentHashMap();
        this.f12522o = new ConcurrentHashMap();
        new C5848a(this);
        this.f12516i = new C5849b();
        this.f12508a = gVar2.f12528a;
        this.f12509b = gVar2.f12529b;
        this.f12513f = gVar2.f12532e;
        this.f12511d = gVar2.f12530c;
        this.f12512e = gVar2.f12531d;
        this.f12514g = gVar2.f12533f;
        this.f12515h = gVar2.f12534g;
        copyOnWriteArrayList.addAll(gVar2.f12536i);
        gVar2.f12536i.size();
        copyOnWriteArrayList2.addAll(gVar2.f12537j);
        gVar2.f12537j.size();
        copyOnWriteArrayList3.addAll(gVar2.f12538k);
        gVar2.f12538k.size();
        this.f12517j = new C7107h(gVar2.f12539l);
        new HashMap(gVar2.f12540m);
        mo16657j(cls10, C5837b.f12500a);
        mo16658k(cls10, C5837b.f12501b);
        Class cls11 = Boolean.TYPE;
        mo16657j(cls11, C5840c.f12503b);
        C5840c.C5843c cVar = C5840c.f12505d;
        mo16658k(cls11, cVar);
        mo16656i(cls11, Boolean.FALSE);
        mo16657j(cls9, C5840c.f12506e);
        mo16658k(cls9, C5840c.f12507f);
        mo16657j(cls8, C5840c.f12504c);
        mo16658k(cls8, cVar);
        C5895k.C5896a aVar = C5895k.f12592a;
        mo16657j(LinkedHashMap.class, aVar);
        mo16657j(HashMap.class, aVar);
        mo16657j(Map.class, aVar);
        mo16658k(Map.class, new C5850c());
        mo16657j(URI.class, C5860i.f12546a);
        mo16658k(URI.class, C5860i.f12547b);
        mo16657j(InetAddress.class, C5860i.f12548c);
        mo16658k(InetAddress.class, C5860i.f12549d);
        mo16657j(Double.TYPE, C5865j.f12574k);
        Class cls12 = Double.TYPE;
        C5865j.C5890v vVar = C5865j.f12576m;
        mo16658k(cls12, vVar);
        mo16656i(Double.TYPE, Double.valueOf(ShadowDrawableWrapper.COS_45));
        mo16657j(cls7, C5865j.f12577n);
        mo16658k(cls7, C5865j.f12578o);
        mo16657j(cls6, C5865j.f12575l);
        mo16658k(cls6, vVar);
        Class cls13 = Float.TYPE;
        mo16657j(cls13, C5865j.f12579p);
        C5865j.C5867a0 a0Var = C5865j.f12581r;
        mo16658k(cls13, a0Var);
        mo16656i(cls13, Float.valueOf(0.0f));
        mo16657j(cls5, C5865j.f12582s);
        mo16658k(cls5, C5865j.f12583t);
        mo16657j(cls4, C5865j.f12580q);
        mo16658k(cls4, a0Var);
        Class cls14 = Integer.TYPE;
        mo16657j(cls14, C5865j.f12584u);
        C5865j.C5872d dVar = C5865j.f12586w;
        mo16658k(cls14, dVar);
        mo16656i(cls14, 0);
        mo16657j(cls3, C5865j.f12587x);
        mo16658k(cls3, C5865j.f12588y);
        mo16657j(cls2, C5865j.f12585v);
        mo16658k(cls2, dVar);
        mo16657j(Short.TYPE, C5865j.f12589z);
        Class cls15 = Short.TYPE;
        C5865j.C5877i iVar = C5865j.f12551B;
        mo16658k(cls15, iVar);
        mo16656i(Short.TYPE, (short) 0);
        mo16657j(cls, C5865j.f12552C);
        mo16658k(cls, C5865j.f12553D);
        Class<Short> cls16 = Short.class;
        mo16657j(cls16, C5865j.f12550A);
        mo16658k(cls16, iVar);
        Class cls17 = Long.TYPE;
        mo16657j(cls17, C5865j.f12554E);
        C5865j.C5883o oVar = C5865j.f12556G;
        mo16658k(cls17, oVar);
        mo16656i(cls17, 0L);
        Class<long[]> cls18 = long[].class;
        mo16657j(cls18, C5865j.f12557H);
        mo16658k(cls18, C5865j.f12558I);
        Class<Long> cls19 = Long.class;
        mo16657j(cls19, C5865j.f12555F);
        mo16658k(cls19, oVar);
        mo16657j(BigDecimal.class, C5865j.f12559J);
        mo16658k(BigDecimal.class, C5865j.f12560K);
        Class<String> cls20 = String.class;
        mo16657j(cls20, C5898m.f12593a);
        mo16658k(cls20, C5898m.f12594b);
        mo16657j(UUID.class, C5904n.f12598a);
        mo16658k(UUID.class, C5904n.f12599b);
        mo16657j(Number.class, C5865j.f12561L);
        mo16658k(CharSequence.class, C5898m.f12595c);
        mo16657j(StringBuilder.class, C5898m.f12596d);
        mo16657j(StringBuffer.class, C5898m.f12597e);
        Iterator it = gVar2.f12535h.iterator();
        while (it.hasNext()) {
            ((C5846d) it.next()).mo16652a();
        }
        if (!gVar2.f12539l.isEmpty()) {
            m11637g(this, gVar2.f12539l, "dsl_json_Annotation_Processor_External_Serialization");
            m11637g(this, gVar2.f12539l, "dsl_json.json.ExternalSerialization");
            m11637g(this, gVar2.f12539l, "dsl_json_ExternalSerialization");
        }
    }

    /* renamed from: b */
    public static Object m11634b(Class cls, ArrayList arrayList) {
        int i = 0;
        if (cls.isPrimitive()) {
            if (Boolean.TYPE.equals(cls)) {
                boolean[] zArr = new boolean[arrayList.size()];
                while (i < arrayList.size()) {
                    zArr[i] = ((Boolean) arrayList.get(i)).booleanValue();
                    i++;
                }
                return zArr;
            } else if (Integer.TYPE.equals(cls)) {
                int[] iArr = new int[arrayList.size()];
                while (i < arrayList.size()) {
                    iArr[i] = ((Integer) arrayList.get(i)).intValue();
                    i++;
                }
                return iArr;
            } else if (Long.TYPE.equals(cls)) {
                long[] jArr = new long[arrayList.size()];
                while (i < arrayList.size()) {
                    jArr[i] = ((Long) arrayList.get(i)).longValue();
                    i++;
                }
                return jArr;
            } else if (Short.TYPE.equals(cls)) {
                short[] sArr = new short[arrayList.size()];
                while (i < arrayList.size()) {
                    sArr[i] = ((Short) arrayList.get(i)).shortValue();
                    i++;
                }
                return sArr;
            } else if (Byte.TYPE.equals(cls)) {
                byte[] bArr = new byte[arrayList.size()];
                while (i < arrayList.size()) {
                    bArr[i] = ((Byte) arrayList.get(i)).byteValue();
                    i++;
                }
                return bArr;
            } else if (Float.TYPE.equals(cls)) {
                float[] fArr = new float[arrayList.size()];
                while (i < arrayList.size()) {
                    fArr[i] = ((Float) arrayList.get(i)).floatValue();
                    i++;
                }
                return fArr;
            } else if (Double.TYPE.equals(cls)) {
                double[] dArr = new double[arrayList.size()];
                while (i < arrayList.size()) {
                    dArr[i] = ((Double) arrayList.get(i)).doubleValue();
                    i++;
                }
                return dArr;
            } else if (Character.TYPE.equals(cls)) {
                char[] cArr = new char[arrayList.size()];
                while (i < arrayList.size()) {
                    cArr[i] = ((Character) arrayList.get(i)).charValue();
                    i++;
                }
                return cArr;
            }
        }
        return arrayList.toArray((Object[]) Array.newInstance(cls, 0));
    }

    /* renamed from: d */
    public static Type m11635d(Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return (wildcardType.getUpperBounds().length == 1 && wildcardType.getLowerBounds().length == 0) ? wildcardType.getUpperBounds()[0] : type;
    }

    /* renamed from: e */
    public static void m11636e(Class<?> cls, ArrayList<Class<?>> arrayList) {
        if (!arrayList.contains(cls)) {
            arrayList.add(cls);
            Class<? super Object> superclass = cls.getSuperclass();
            if (!(superclass == null || superclass == Object.class)) {
                m11636e(superclass, arrayList);
            }
            for (Class e : cls.getInterfaces()) {
                m11636e(e, arrayList);
            }
        }
    }

    /* renamed from: g */
    public static void m11637g(C5847e eVar, HashSet hashSet, String str) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                ((C5846d) ((ClassLoader) it.next()).loadClass(str).newInstance()).mo16652a();
            } catch (Exception | NoClassDefFoundError unused) {
            }
        }
    }

    /* renamed from: h */
    public static JsonReader.C5833b m11638h(Class cls, Object obj) {
        Object obj2;
        try {
            obj2 = cls.getField("JSON_READER").get(obj);
        } catch (Exception unused) {
            try {
                obj2 = cls.getMethod("JSON_READER", new Class[0]).invoke(obj, new Object[0]);
            } catch (Exception unused2) {
                try {
                    obj2 = cls.getMethod("getJSON_READER", new Class[0]).invoke(obj, new Object[0]);
                } catch (Exception unused3) {
                }
            }
        }
        if (obj2 instanceof JsonReader.C5833b) {
            return (JsonReader.C5833b) obj2;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo16653a(Type type, ConcurrentHashMap concurrentHashMap) {
        Type d;
        if (type instanceof Class) {
            this.f12517j.mo19436b((Class) type, this);
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            this.f12517j.mo19436b((Class) parameterizedType.getRawType(), this);
            for (Type type2 : parameterizedType.getActualTypeArguments()) {
                if (!concurrentHashMap.containsKey(type2) && (d = m11635d(type2)) != type2 && !concurrentHashMap.containsKey(d)) {
                    mo16653a(d, concurrentHashMap);
                }
            }
        }
    }

    /* renamed from: c */
    public final Object mo16654c(Class cls, JsonReader jsonReader, FileInputStream fileInputStream) throws IOException {
        IOException iOException;
        IOException iOException2;
        JsonReader.C5833b<C5857g> f;
        jsonReader.mo16626c();
        JsonReader.C5834c l = mo16659l(cls);
        if (l != null) {
            return l.mo16650a(jsonReader);
        }
        if (cls.isArray()) {
            if (jsonReader.mo16645u()) {
                return null;
            }
            if (jsonReader.f12475d == 91) {
                Class<?> componentType = cls.getComponentType();
                if (jsonReader.mo16626c() == 93) {
                    return Array.newInstance(componentType, 0);
                }
                if (!C5857g.class.isAssignableFrom(componentType) || (f = mo16655f(componentType)) == null) {
                    JsonReader.C5834c<?> l2 = mo16659l(componentType);
                    if (l2 != null) {
                        ArrayList arrayList = new ArrayList(4);
                        if (jsonReader.mo16645u()) {
                            arrayList.add((Object) null);
                        } else {
                            arrayList.add(l2.mo16650a(jsonReader));
                        }
                        while (jsonReader.mo16626c() == 44) {
                            jsonReader.mo16626c();
                            if (jsonReader.mo16645u()) {
                                arrayList.add((Object) null);
                            } else {
                                arrayList.add(l2.mo16650a(jsonReader));
                            }
                        }
                        jsonReader.mo16625b();
                        return m11634b(componentType, arrayList);
                    }
                } else {
                    ArrayList arrayList2 = new ArrayList(4);
                    if (jsonReader.f12475d == 123) {
                        jsonReader.mo16626c();
                        arrayList2.add(f.mo16649a());
                    } else if (jsonReader.mo16645u()) {
                        arrayList2.add((Object) null);
                    } else {
                        throw jsonReader.mo16629f("Expecting '{' as collection start");
                    }
                    while (jsonReader.mo16626c() == 44) {
                        if (jsonReader.mo16626c() == 123) {
                            jsonReader.mo16626c();
                            arrayList2.add(f.mo16649a());
                        } else if (jsonReader.mo16645u()) {
                            arrayList2.add((Object) null);
                        } else {
                            throw jsonReader.mo16629f("Expecting '{' as object start within a collection");
                        }
                    }
                    jsonReader.mo16625b();
                    return m11634b(componentType, arrayList2);
                }
            } else {
                throw jsonReader.mo16629f("Expecting '[' for array start");
            }
        }
        C5852e<TContext> eVar = this.f12508a;
        if (eVar != null) {
            return eVar.mo16543a(cls, new C5853f(fileInputStream, jsonReader.f12479h));
        }
        Class<C5847e> cls2 = C5847e.class;
        ArrayList arrayList3 = new ArrayList();
        m11636e(cls, arrayList3);
        Iterator it = arrayList3.iterator();
        while (true) {
            if (!it.hasNext()) {
                iOException = new IOException("Unable to find reader for provided type: " + cls + " and fallback serialization is not registered.\nTry initializing DslJson with custom fallback in case of unsupported objects or register specified type using registerReader into " + cls2);
                break;
            }
            Class cls3 = (Class) it.next();
            if (this.f12520m.containsKey(cls3)) {
                if (cls3.equals(cls)) {
                    iOException2 = new IOException("Reader for provided type: " + cls + " is disabled and fallback serialization is not registered (converter is registered as null).\nTry initializing system with custom fallback or don't register null for " + cls);
                } else {
                    iOException = new IOException("Unable to find reader for provided type: " + cls + " and fallback serialization is not registered.\nFound reader for: " + cls3 + " so try deserializing into that instead?\nAlternatively, try initializing system with custom fallback or register specified type using registerReader into " + cls2);
                }
            }
        }
        iOException2 = iOException;
        throw iOException2;
    }

    /* renamed from: f */
    public final JsonReader.C5833b<C5857g> mo16655f(Class<?> cls) {
        try {
            JsonReader.C5833b<C5857g> bVar = (JsonReader.C5833b) this.f12519l.get(cls);
            if (bVar == null) {
                bVar = m11638h(cls, (Object) null);
                if (bVar == null) {
                    try {
                        Object obj = cls.getField("Companion").get((Object) null);
                        bVar = m11638h(obj.getClass(), obj);
                    } catch (Exception unused) {
                        return null;
                    }
                }
                if (bVar != null) {
                    this.f12519l.putIfAbsent(cls, bVar);
                }
            }
            return bVar;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: i */
    public final <T> void mo16656i(Class<T> cls, T t) {
        this.f12518k.put(cls, t);
    }

    /* renamed from: j */
    public final <T, S extends T> void mo16657j(Class<T> cls, JsonReader.C5834c<S> cVar) {
        if (cVar == null) {
            this.f12520m.remove(cls);
        } else {
            this.f12520m.put(cls, cVar);
        }
    }

    /* renamed from: k */
    public final <T> void mo16658k(Class<T> cls, C5858h.C5859a<T> aVar) {
        if (aVar == null) {
            this.f12522o.remove(cls);
            this.f12521n.remove(cls);
            return;
        }
        this.f12522o.put(cls, cls);
        this.f12521n.put(cls, aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (r0 != null) goto L_0x007b;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> com.bugsnag.android.repackaged.dslplatform.json.JsonReader.C5834c<T> mo16659l(java.lang.Class<T> r6) {
        /*
            r5 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r5.f12520m
            java.lang.Object r0 = r0.get(r6)
            com.bugsnag.android.repackaged.dslplatform.json.JsonReader$c r0 = (com.bugsnag.android.repackaged.dslplatform.json.JsonReader.C5834c) r0
            if (r0 == 0) goto L_0x000c
            goto L_0x007d
        L_0x000c:
            java.lang.reflect.Type r0 = m11635d(r6)
            if (r0 == r6) goto L_0x0023
            java.util.concurrent.ConcurrentHashMap r1 = r5.f12520m
            java.lang.Object r1 = r1.get(r0)
            com.bugsnag.android.repackaged.dslplatform.json.JsonReader$c r1 = (com.bugsnag.android.repackaged.dslplatform.json.JsonReader.C5834c) r1
            if (r1 == 0) goto L_0x0023
            java.util.concurrent.ConcurrentHashMap r0 = r5.f12520m
            r0.putIfAbsent(r6, r1)
            r0 = r1
            goto L_0x007d
        L_0x0023:
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 == 0) goto L_0x0043
            r2 = r0
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.Class<com.bugsnag.android.repackaged.dslplatform.json.g> r3 = com.bugsnag.android.repackaged.dslplatform.json.C5857g.class
            boolean r3 = r3.isAssignableFrom(r2)
            if (r3 == 0) goto L_0x0043
            com.bugsnag.android.repackaged.dslplatform.json.JsonReader$b r2 = r5.mo16655f(r2)
            if (r2 == 0) goto L_0x0043
            com.bugsnag.android.repackaged.dslplatform.json.f r0 = new com.bugsnag.android.repackaged.dslplatform.json.f
            r0.<init>(r2)
            java.util.concurrent.ConcurrentHashMap r1 = r5.f12520m
            r1.putIfAbsent(r6, r0)
            goto L_0x007d
        L_0x0043:
            java.util.concurrent.CopyOnWriteArrayList r2 = r5.f12510c
            java.util.concurrent.ConcurrentHashMap r3 = r5.f12520m
            if (r1 == 0) goto L_0x0058
            j3.h r1 = r5.f12517j
            r4 = r0
            java.lang.Class r4 = (java.lang.Class) r4
            r1.mo19436b(r4, r5)
            java.lang.Object r0 = r3.get(r0)
            if (r0 == 0) goto L_0x005f
            goto L_0x007b
        L_0x0058:
            boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L_0x005f
            r5.mo16653a(r0, r3)
        L_0x005f:
            java.util.Iterator r0 = r2.iterator()
        L_0x0063:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x007a
            java.lang.Object r1 = r0.next()
            com.bugsnag.android.repackaged.dslplatform.json.e$d r1 = (com.bugsnag.android.repackaged.dslplatform.json.C5847e.C5851d) r1
            java.lang.Object r1 = r1.mo16662a()
            if (r1 == 0) goto L_0x0063
            r3.putIfAbsent(r6, r1)
            r0 = r1
            goto L_0x007b
        L_0x007a:
            r0 = 0
        L_0x007b:
            com.bugsnag.android.repackaged.dslplatform.json.JsonReader$c r0 = (com.bugsnag.android.repackaged.dslplatform.json.JsonReader.C5834c) r0
        L_0x007d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.repackaged.dslplatform.json.C5847e.mo16659l(java.lang.Class):com.bugsnag.android.repackaged.dslplatform.json.JsonReader$c");
    }

    /* renamed from: com.bugsnag.android.repackaged.dslplatform.json.e$f */
    public static class C5853f extends InputStream {

        /* renamed from: b */
        public final byte[] f12524b;

        /* renamed from: c */
        public final InputStream f12525c;

        /* renamed from: d */
        public boolean f12526d = true;

        /* renamed from: e */
        public int f12527e;

        public C5853f(FileInputStream fileInputStream, byte[] bArr) {
            this.f12524b = bArr;
            this.f12525c = fileInputStream;
        }

        public final int read() throws IOException {
            if (this.f12526d) {
                int i = this.f12527e;
                byte[] bArr = this.f12524b;
                if (i < bArr.length) {
                    this.f12527e = i + 1;
                    return bArr[i];
                }
                this.f12526d = false;
            }
            return this.f12525c.read();
        }

        public final int read(byte[] bArr) throws IOException {
            if (this.f12526d) {
                return super.read(bArr);
            }
            return this.f12525c.read(bArr);
        }

        public final int read(byte[] bArr, int i, int i2) throws IOException {
            if (this.f12526d) {
                return super.read(bArr, i, i2);
            }
            return this.f12525c.read(bArr, i, i2);
        }
    }
}
