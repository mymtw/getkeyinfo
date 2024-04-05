package com.squareup.moshi;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.JsonAdapter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import p618lp.C18215a;

/* renamed from: com.squareup.moshi.y */
public final class C17414y {

    /* renamed from: d */
    public static final ArrayList f38021d;

    /* renamed from: a */
    public final List<JsonAdapter.C17360e> f38022a;

    /* renamed from: b */
    public final ThreadLocal<C17417c> f38023b = new ThreadLocal<>();

    /* renamed from: c */
    public final LinkedHashMap f38024c = new LinkedHashMap();

    /* renamed from: com.squareup.moshi.y$a */
    public static final class C17415a {

        /* renamed from: a */
        public final ArrayList f38025a = new ArrayList();

        /* renamed from: b */
        public int f38026b = 0;

        /* renamed from: a */
        public final void mo68560a(JsonAdapter.C17360e eVar) {
            if (eVar != null) {
                ArrayList arrayList = this.f38025a;
                int i = this.f38026b;
                this.f38026b = i + 1;
                arrayList.add(i, eVar);
                return;
            }
            throw new IllegalArgumentException("factory == null");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Class<?>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Class<?>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Class<?>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: java.lang.Class<?>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Class<?>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Class<?>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: com.squareup.moshi.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: com.squareup.moshi.e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: com.squareup.moshi.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: com.squareup.moshi.c} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: com.squareup.moshi.c} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: com.squareup.moshi.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v36, resolved type: com.squareup.moshi.c} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: com.squareup.moshi.d} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00d1  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x01a5  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x01aa A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x00d5 A[SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo68561b(java.lang.Object r24) {
            /*
                r23 = this;
                java.lang.Class<com.squareup.moshi.JsonAdapter> r0 = com.squareup.moshi.JsonAdapter.class
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.lang.Class r3 = r24.getClass()
            L_0x0010:
                java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
                if (r3 == r4) goto L_0x01f5
                java.lang.reflect.Method[] r4 = r3.getDeclaredMethods()
                int r5 = r4.length
                r6 = 0
                r7 = r6
            L_0x001b:
                if (r6 >= r5) goto L_0x01ed
                r15 = r4[r6]
                java.lang.Class<com.squareup.moshi.z> r8 = com.squareup.moshi.C17418z.class
                boolean r8 = r15.isAnnotationPresent(r8)
                java.lang.String r14 = "\n    "
                java.lang.String r13 = "Unexpected signature for "
                r9 = 1
                if (r8 == 0) goto L_0x010d
                r15.setAccessible(r9)
                java.lang.reflect.Type r12 = r15.getGenericReturnType()
                java.lang.reflect.Type[] r11 = r15.getGenericParameterTypes()
                java.lang.annotation.Annotation[][] r8 = r15.getParameterAnnotations()
                int r9 = r11.length
                r10 = 2
                if (r9 < r10) goto L_0x008b
                r7 = r11[r7]
                java.lang.Class<com.squareup.moshi.w> r9 = com.squareup.moshi.C17412w.class
                if (r7 != r9) goto L_0x008b
                java.lang.Class r7 = java.lang.Void.TYPE
                if (r12 != r7) goto L_0x008b
                int r7 = r11.length
                r9 = 2
            L_0x004b:
                if (r9 >= r7) goto L_0x0065
                r10 = r11[r9]
                r19 = r4
                boolean r4 = r10 instanceof java.lang.reflect.ParameterizedType
                if (r4 != 0) goto L_0x0056
                goto L_0x005e
            L_0x0056:
                java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
                java.lang.reflect.Type r4 = r10.getRawType()
                if (r4 == r0) goto L_0x0060
            L_0x005e:
                r4 = 0
                goto L_0x0068
            L_0x0060:
                int r9 = r9 + 1
                r4 = r19
                goto L_0x004b
            L_0x0065:
                r19 = r4
                r4 = 1
            L_0x0068:
                if (r4 == 0) goto L_0x0087
                r4 = 1
                r7 = r8[r4]
                java.util.Set r10 = p618lp.C18215a.m30727f(r7)
                com.squareup.moshi.b r7 = new com.squareup.moshi.b
                r9 = r11[r4]
                int r4 = r11.length
                r8 = r7
                r11 = r24
                r12 = r15
                r20 = r5
                r5 = r13
                r13 = r4
                r8.<init>(r9, r10, r11, r12, r13)
                r22 = r3
                r4 = r7
                r3 = r14
                r7 = r15
                goto L_0x00c7
            L_0x0087:
                r20 = r5
                r5 = r13
                goto L_0x008e
            L_0x008b:
                r19 = r4
                goto L_0x0087
            L_0x008e:
                r4 = 1
                int r7 = r11.length
                if (r7 != r4) goto L_0x00f2
                java.lang.Class r4 = java.lang.Void.TYPE
                if (r12 == r4) goto L_0x00f2
                java.util.Set<java.lang.annotation.Annotation> r4 = p618lp.C18215a.f39926a
                java.lang.annotation.Annotation[] r4 = r15.getAnnotations()
                java.util.Set r18 = p618lp.C18215a.m30727f(r4)
                r4 = 0
                r7 = r8[r4]
                java.util.Set r17 = p618lp.C18215a.m30727f(r7)
                r7 = r8[r4]
                boolean r7 = p618lp.C18215a.m30725d(r7)
                com.squareup.moshi.c r21 = new com.squareup.moshi.c
                r9 = r11[r4]
                int r13 = r11.length
                r8 = r21
                r10 = r17
                r4 = r11
                r11 = r24
                r16 = r12
                r12 = r15
                r22 = r3
                r3 = r14
                r14 = r7
                r7 = r15
                r15 = r4
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                r4 = r21
            L_0x00c7:
                java.lang.reflect.Type r8 = r4.f37938a
                java.util.Set<? extends java.lang.annotation.Annotation> r9 = r4.f37939b
                com.squareup.moshi.a$b r8 = com.squareup.moshi.C17384a.m29118a(r1, r8, r9)
                if (r8 != 0) goto L_0x00d5
                r1.add(r4)
                goto L_0x0116
            L_0x00d5:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Conflicting @ToJson methods:\n    "
                java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r1)
                java.lang.reflect.Method r2 = r8.f37941d
                r1.append(r2)
                r1.append(r3)
                java.lang.reflect.Method r2 = r4.f37941d
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00f2:
                r7 = r15
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r5)
                r1.append(r7)
                java.lang.String r2 = ".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x010d:
                r22 = r3
                r19 = r4
                r20 = r5
                r5 = r13
                r3 = r14
                r7 = r15
            L_0x0116:
                java.lang.Class<com.squareup.moshi.m> r4 = com.squareup.moshi.C17401m.class
                boolean r4 = r7.isAnnotationPresent(r4)
                if (r4 == 0) goto L_0x01e1
                r4 = 1
                r7.setAccessible(r4)
                java.lang.reflect.Type r15 = r7.getGenericReturnType()
                java.util.Set<java.lang.annotation.Annotation> r8 = p618lp.C18215a.f39926a
                java.lang.annotation.Annotation[] r8 = r7.getAnnotations()
                java.util.Set r18 = p618lp.C18215a.m30727f(r8)
                java.lang.reflect.Type[] r14 = r7.getGenericParameterTypes()
                java.lang.annotation.Annotation[][] r8 = r7.getParameterAnnotations()
                int r9 = r14.length
                if (r9 < r4) goto L_0x0170
                r4 = 0
                r4 = r14[r4]
                java.lang.Class<com.squareup.moshi.JsonReader> r9 = com.squareup.moshi.JsonReader.class
                if (r4 != r9) goto L_0x0170
                java.lang.Class r4 = java.lang.Void.TYPE
                if (r15 == r4) goto L_0x0170
                int r4 = r14.length
                r9 = 1
            L_0x0148:
                if (r9 >= r4) goto L_0x015e
                r10 = r14[r9]
                boolean r11 = r10 instanceof java.lang.reflect.ParameterizedType
                if (r11 != 0) goto L_0x0151
                goto L_0x0159
            L_0x0151:
                java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
                java.lang.reflect.Type r10 = r10.getRawType()
                if (r10 == r0) goto L_0x015b
            L_0x0159:
                r4 = 0
                goto L_0x015f
            L_0x015b:
                int r9 = r9 + 1
                goto L_0x0148
            L_0x015e:
                r4 = 1
            L_0x015f:
                if (r4 == 0) goto L_0x0170
                com.squareup.moshi.d r4 = new com.squareup.moshi.d
                int r13 = r14.length
                r8 = r4
                r9 = r15
                r10 = r18
                r11 = r24
                r12 = r7
                r8.<init>(r9, r10, r11, r12, r13)
                r5 = 0
                goto L_0x019b
            L_0x0170:
                int r4 = r14.length
                r9 = 1
                if (r4 != r9) goto L_0x01c7
                java.lang.Class r4 = java.lang.Void.TYPE
                if (r15 == r4) goto L_0x01c7
                r5 = 0
                r4 = r8[r5]
                java.util.Set r17 = p618lp.C18215a.m30727f(r4)
                r4 = r8[r5]
                boolean r4 = p618lp.C18215a.m30725d(r4)
                com.squareup.moshi.e r21 = new com.squareup.moshi.e
                int r13 = r14.length
                r8 = r21
                r9 = r15
                r10 = r18
                r11 = r24
                r12 = r7
                r7 = r14
                r14 = r4
                r4 = r15
                r15 = r7
                r16 = r4
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                r4 = r21
            L_0x019b:
                java.lang.reflect.Type r7 = r4.f37938a
                java.util.Set<? extends java.lang.annotation.Annotation> r8 = r4.f37939b
                com.squareup.moshi.a$b r7 = com.squareup.moshi.C17384a.m29118a(r2, r7, r8)
                if (r7 != 0) goto L_0x01aa
                r2.add(r4)
                r7 = r5
                goto L_0x01e3
            L_0x01aa:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Conflicting @FromJson methods:\n    "
                java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r1)
                java.lang.reflect.Method r2 = r7.f37941d
                r1.append(r2)
                r1.append(r3)
                java.lang.reflect.Method r2 = r4.f37941d
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x01c7:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r5)
                r1.append(r7)
                java.lang.String r2 = ".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x01e1:
                r3 = 0
                r7 = r3
            L_0x01e3:
                int r6 = r6 + 1
                r4 = r19
                r5 = r20
                r3 = r22
                goto L_0x001b
            L_0x01ed:
                r22 = r3
                java.lang.Class r3 = r22.getSuperclass()
                goto L_0x0010
            L_0x01f5:
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto L_0x0214
                boolean r0 = r2.isEmpty()
                if (r0 != 0) goto L_0x0202
                goto L_0x0214
            L_0x0202:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Expected at least one @ToJson or @FromJson method on "
                java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r1)
                r2 = r24
                java.lang.String r1 = p003a2.C0023f.m108i(r2, r1)
                r0.<init>(r1)
                throw r0
            L_0x0214:
                com.squareup.moshi.a r0 = new com.squareup.moshi.a
                r0.<init>(r1, r2)
                r1 = r23
                r1.mo68560a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C17414y.C17415a.mo68561b(java.lang.Object):void");
        }
    }

    /* renamed from: com.squareup.moshi.y$b */
    public static final class C17416b<T> extends JsonAdapter<T> {

        /* renamed from: a */
        public final Type f38027a;

        /* renamed from: b */
        public final String f38028b;

        /* renamed from: c */
        public final Object f38029c;

        /* renamed from: d */
        public JsonAdapter<T> f38030d;

        public C17416b(Type type, String str, Object obj) {
            this.f38027a = type;
            this.f38028b = str;
            this.f38029c = obj;
        }

        public final T fromJson(JsonReader jsonReader) throws IOException {
            JsonAdapter<T> jsonAdapter = this.f38030d;
            if (jsonAdapter != null) {
                return jsonAdapter.fromJson(jsonReader);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        public final void toJson(C17412w wVar, T t) throws IOException {
            JsonAdapter<T> jsonAdapter = this.f38030d;
            if (jsonAdapter != null) {
                jsonAdapter.toJson(wVar, t);
                return;
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        public final String toString() {
            JsonAdapter<T> jsonAdapter = this.f38030d;
            return jsonAdapter != null ? jsonAdapter.toString() : super.toString();
        }
    }

    /* renamed from: com.squareup.moshi.y$c */
    public final class C17417c {

        /* renamed from: a */
        public final ArrayList f38031a = new ArrayList();

        /* renamed from: b */
        public final ArrayDeque f38032b = new ArrayDeque();

        /* renamed from: c */
        public boolean f38033c;

        public C17417c() {
        }

        /* renamed from: a */
        public final IllegalArgumentException mo68563a(IllegalArgumentException illegalArgumentException) {
            if (this.f38033c) {
                return illegalArgumentException;
            }
            this.f38033c = true;
            if (this.f38032b.size() == 1 && ((C17416b) this.f38032b.getFirst()).f38028b == null) {
                return illegalArgumentException;
            }
            StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
            Iterator descendingIterator = this.f38032b.descendingIterator();
            while (descendingIterator.hasNext()) {
                C17416b bVar = (C17416b) descendingIterator.next();
                sb.append("\nfor ");
                sb.append(bVar.f38027a);
                if (bVar.f38028b != null) {
                    sb.append(' ');
                    sb.append(bVar.f38028b);
                }
            }
            return new IllegalArgumentException(sb.toString(), illegalArgumentException);
        }

        /* renamed from: b */
        public final void mo68564b(boolean z) {
            this.f38032b.removeLast();
            if (this.f38032b.isEmpty()) {
                C17414y.this.f38023b.remove();
                if (z) {
                    synchronized (C17414y.this.f38024c) {
                        int size = this.f38031a.size();
                        for (int i = 0; i < size; i++) {
                            C17416b bVar = (C17416b) this.f38031a.get(i);
                            JsonAdapter<T> jsonAdapter = (JsonAdapter) C17414y.this.f38024c.put(bVar.f38029c, bVar.f38030d);
                            if (jsonAdapter != null) {
                                bVar.f38030d = jsonAdapter;
                                C17414y.this.f38024c.put(bVar.f38029c, jsonAdapter);
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        f38021d = arrayList;
        arrayList.add(StandardJsonAdapters.f37920a);
        arrayList.add(CollectionJsonAdapter.FACTORY);
        arrayList.add(MapJsonAdapter.FACTORY);
        arrayList.add(ArrayJsonAdapter.FACTORY);
        arrayList.add(RecordJsonAdapter.FACTORY);
        arrayList.add(ClassJsonAdapter.FACTORY);
    }

    public C17414y(C17415a aVar) {
        int size = aVar.f38025a.size();
        ArrayList arrayList = f38021d;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(aVar.f38025a);
        arrayList2.addAll(arrayList);
        this.f38022a = Collections.unmodifiableList(arrayList2);
    }

    /* renamed from: a */
    public final <T> JsonAdapter<T> mo68556a(Class<T> cls) {
        return mo68558c(cls, C18215a.f39926a, (String) null);
    }

    /* renamed from: b */
    public final <T> JsonAdapter<T> mo68557b(Type type) {
        return mo68558c(type, C18215a.f39926a, (String) null);
    }

    /* JADX WARNING: type inference failed for: r11v7, types: [com.squareup.moshi.JsonAdapter<T>] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        r3 = r8.f38023b.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r3 != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        r3 = new com.squareup.moshi.C17414y.C17417c(r8);
        r8.f38023b.set(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        r4 = r3.f38031a.size();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        if (r5 >= r4) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        r6 = (com.squareup.moshi.C17414y.C17416b) r3.f38031a.get(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (r6.f38029c.equals(r0) == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        r3.f38032b.add(r6);
        r11 = r6.f38030d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        if (r11 == 0) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        r6 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        r4 = new com.squareup.moshi.C17414y.C17416b(r9, r11, r0);
        r3.f38031a.add(r4);
        r3.f38032b.add(r4);
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007c, code lost:
        if (r6 == null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        r3.mo68564b(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0081, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r11 = r8.f38022a.size();
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0089, code lost:
        if (r0 >= r11) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008b, code lost:
        r4 = r8.f38022a.get(r0).create(r9, r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0097, code lost:
        if (r4 != null) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0099, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009c, code lost:
        ((com.squareup.moshi.C17414y.C17416b) r3.f38032b.getLast()).f38030d = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a6, code lost:
        r3.mo68564b(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a9, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c4, code lost:
        throw new java.lang.IllegalArgumentException("No JsonAdapter for " + p618lp.C18215a.m30732k(r9, r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c5, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c7, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cc, code lost:
        throw r3.mo68563a(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cd, code lost:
        r3.mo68564b(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d0, code lost:
        throw r9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> com.squareup.moshi.JsonAdapter<T> mo68558c(java.lang.reflect.Type r9, java.util.Set<? extends java.lang.annotation.Annotation> r10, java.lang.String r11) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x00dc
            if (r10 == 0) goto L_0x00d4
            java.lang.reflect.Type r9 = p618lp.C18215a.m30722a(r9)
            java.lang.reflect.Type r9 = p618lp.C18215a.m30729h(r9)
            boolean r0 = r10.isEmpty()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0016
            r0 = r9
            goto L_0x0021
        L_0x0016:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r9
            r0[r2] = r10
            java.util.List r0 = java.util.Arrays.asList(r0)
        L_0x0021:
            java.util.LinkedHashMap r3 = r8.f38024c
            monitor-enter(r3)
            java.util.LinkedHashMap r4 = r8.f38024c     // Catch:{ all -> 0x00d1 }
            java.lang.Object r4 = r4.get(r0)     // Catch:{ all -> 0x00d1 }
            com.squareup.moshi.JsonAdapter r4 = (com.squareup.moshi.JsonAdapter) r4     // Catch:{ all -> 0x00d1 }
            if (r4 == 0) goto L_0x0030
            monitor-exit(r3)     // Catch:{ all -> 0x00d1 }
            return r4
        L_0x0030:
            monitor-exit(r3)     // Catch:{ all -> 0x00d1 }
            java.lang.ThreadLocal<com.squareup.moshi.y$c> r3 = r8.f38023b
            java.lang.Object r3 = r3.get()
            com.squareup.moshi.y$c r3 = (com.squareup.moshi.C17414y.C17417c) r3
            if (r3 != 0) goto L_0x0045
            com.squareup.moshi.y$c r3 = new com.squareup.moshi.y$c
            r3.<init>()
            java.lang.ThreadLocal<com.squareup.moshi.y$c> r4 = r8.f38023b
            r4.set(r3)
        L_0x0045:
            java.util.ArrayList r4 = r3.f38031a
            int r4 = r4.size()
            r5 = r1
        L_0x004c:
            if (r5 >= r4) goto L_0x006c
            java.util.ArrayList r6 = r3.f38031a
            java.lang.Object r6 = r6.get(r5)
            com.squareup.moshi.y$b r6 = (com.squareup.moshi.C17414y.C17416b) r6
            java.lang.Object r7 = r6.f38029c
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0069
            java.util.ArrayDeque r11 = r3.f38032b
            r11.add(r6)
            com.squareup.moshi.JsonAdapter<T> r11 = r6.f38030d
            if (r11 == 0) goto L_0x007c
            r6 = r11
            goto L_0x007c
        L_0x0069:
            int r5 = r5 + 1
            goto L_0x004c
        L_0x006c:
            com.squareup.moshi.y$b r4 = new com.squareup.moshi.y$b
            r4.<init>(r9, r11, r0)
            java.util.ArrayList r11 = r3.f38031a
            r11.add(r4)
            java.util.ArrayDeque r11 = r3.f38032b
            r11.add(r4)
            r6 = 0
        L_0x007c:
            if (r6 == 0) goto L_0x0082
            r3.mo68564b(r1)
            return r6
        L_0x0082:
            java.util.List<com.squareup.moshi.JsonAdapter$e> r11 = r8.f38022a     // Catch:{ IllegalArgumentException -> 0x00c7 }
            int r11 = r11.size()     // Catch:{ IllegalArgumentException -> 0x00c7 }
            r0 = r1
        L_0x0089:
            if (r0 >= r11) goto L_0x00aa
            java.util.List<com.squareup.moshi.JsonAdapter$e> r4 = r8.f38022a     // Catch:{ IllegalArgumentException -> 0x00c7 }
            java.lang.Object r4 = r4.get(r0)     // Catch:{ IllegalArgumentException -> 0x00c7 }
            com.squareup.moshi.JsonAdapter$e r4 = (com.squareup.moshi.JsonAdapter.C17360e) r4     // Catch:{ IllegalArgumentException -> 0x00c7 }
            com.squareup.moshi.JsonAdapter r4 = r4.create(r9, r10, r8)     // Catch:{ IllegalArgumentException -> 0x00c7 }
            if (r4 != 0) goto L_0x009c
            int r0 = r0 + 1
            goto L_0x0089
        L_0x009c:
            java.util.ArrayDeque r9 = r3.f38032b     // Catch:{ IllegalArgumentException -> 0x00c7 }
            java.lang.Object r9 = r9.getLast()     // Catch:{ IllegalArgumentException -> 0x00c7 }
            com.squareup.moshi.y$b r9 = (com.squareup.moshi.C17414y.C17416b) r9     // Catch:{ IllegalArgumentException -> 0x00c7 }
            r9.f38030d = r4     // Catch:{ IllegalArgumentException -> 0x00c7 }
            r3.mo68564b(r2)
            return r4
        L_0x00aa:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x00c7 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x00c7 }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x00c7 }
            java.lang.String r2 = "No JsonAdapter for "
            r0.append(r2)     // Catch:{ IllegalArgumentException -> 0x00c7 }
            java.lang.String r9 = p618lp.C18215a.m30732k(r9, r10)     // Catch:{ IllegalArgumentException -> 0x00c7 }
            r0.append(r9)     // Catch:{ IllegalArgumentException -> 0x00c7 }
            java.lang.String r9 = r0.toString()     // Catch:{ IllegalArgumentException -> 0x00c7 }
            r11.<init>(r9)     // Catch:{ IllegalArgumentException -> 0x00c7 }
            throw r11     // Catch:{ IllegalArgumentException -> 0x00c7 }
        L_0x00c5:
            r9 = move-exception
            goto L_0x00cd
        L_0x00c7:
            r9 = move-exception
            java.lang.IllegalArgumentException r9 = r3.mo68563a(r9)     // Catch:{ all -> 0x00c5 }
            throw r9     // Catch:{ all -> 0x00c5 }
        L_0x00cd:
            r3.mo68564b(r1)
            throw r9
        L_0x00d1:
            r9 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00d1 }
            throw r9
        L_0x00d4:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "annotations == null"
            r9.<init>(r10)
            throw r9
        L_0x00dc:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "type == null"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C17414y.mo68558c(java.lang.reflect.Type, java.util.Set, java.lang.String):com.squareup.moshi.JsonAdapter");
    }

    /* renamed from: d */
    public final <T> JsonAdapter<T> mo68559d(JsonAdapter.C17360e eVar, Type type, Set<? extends Annotation> set) {
        if (set != null) {
            Type h = C18215a.m30729h(C18215a.m30722a(type));
            int indexOf = this.f38022a.indexOf(eVar);
            if (indexOf != -1) {
                int size = this.f38022a.size();
                for (int i = indexOf + 1; i < size; i++) {
                    JsonAdapter<?> create = this.f38022a.get(i).create(h, set, this);
                    if (create != null) {
                        return create;
                    }
                }
                StringBuilder h2 = C0072d.m201h("No next JsonAdapter for ");
                h2.append(C18215a.m30732k(h, set));
                throw new IllegalArgumentException(h2.toString());
            }
            throw new IllegalArgumentException("Unable to skip past unknown factory " + eVar);
        }
        throw new NullPointerException("annotations == null");
    }
}
