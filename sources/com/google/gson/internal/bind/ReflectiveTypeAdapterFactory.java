package com.google.gson.internal.bind;

import com.google.gson.C16702c;
import com.google.gson.C16807t;
import com.google.gson.C16808u;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.C16727b;
import com.google.gson.internal.C16790g;
import com.google.gson.internal.Excluder;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import p667rn.C18500b;

public final class ReflectiveTypeAdapterFactory implements C16808u {

    /* renamed from: b */
    public final C16727b f37012b;

    /* renamed from: c */
    public final C16702c f37013c;

    /* renamed from: d */
    public final Excluder f37014d;

    /* renamed from: e */
    public final JsonAdapterAnnotationTypeAdapterFactory f37015e;

    /* renamed from: f */
    public final C18500b f37016f = C18500b.f40739a;

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$a */
    public static final class C16736a<T> extends C16807t<T> {

        /* renamed from: a */
        public final C16790g<T> f37017a;

        /* renamed from: b */
        public final Map<String, C16737b> f37018b;

        public C16736a(C16790g gVar, LinkedHashMap linkedHashMap) {
            this.f37017a = gVar;
            this.f37018b = linkedHashMap;
        }

        /* renamed from: a */
        public final T mo59449a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            T i = this.f37017a.mo1134i();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    C16737b bVar = this.f37018b.get(jsonReader.nextName());
                    if (bVar != null) {
                        if (bVar.f37021c) {
                            bVar.mo59576a(jsonReader, i);
                        }
                    }
                    jsonReader.skipValue();
                }
                jsonReader.endObject();
                return i;
            } catch (IllegalStateException e) {
                throw new JsonSyntaxException((Throwable) e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        /* renamed from: b */
        public final void mo59450b(JsonWriter jsonWriter, T t) throws IOException {
            if (t == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                for (C16737b next : this.f37018b.values()) {
                    if (next.mo59578c(t)) {
                        jsonWriter.name(next.f37019a);
                        next.mo59577b(jsonWriter, t);
                    }
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$b */
    public static abstract class C16737b {

        /* renamed from: a */
        public final String f37019a;

        /* renamed from: b */
        public final boolean f37020b;

        /* renamed from: c */
        public final boolean f37021c;

        public C16737b(String str, boolean z, boolean z2) {
            this.f37019a = str;
            this.f37020b = z;
            this.f37021c = z2;
        }

        /* renamed from: a */
        public abstract void mo59576a(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException;

        /* renamed from: b */
        public abstract void mo59577b(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException;

        /* renamed from: c */
        public abstract boolean mo59578c(Object obj) throws IOException, IllegalAccessException;
    }

    public ReflectiveTypeAdapterFactory(C16727b bVar, FieldNamingPolicy fieldNamingPolicy, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.f37012b = bVar;
        this.f37013c = fieldNamingPolicy;
        this.f37014d = excluder;
        this.f37015e = jsonAdapterAnnotationTypeAdapterFactory;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x019f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0188 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> com.google.gson.C16807t<T> mo59482a(com.google.gson.C16708i r35, p675sn.C18541a<T> r36) {
        /*
            r34 = this;
            r0 = r34
            r11 = r35
            java.lang.Class<java.lang.Object> r12 = java.lang.Object.class
            java.lang.Class r1 = r36.getRawType()
            boolean r2 = r12.isAssignableFrom(r1)
            r13 = 0
            if (r2 != 0) goto L_0x0012
            return r13
        L_0x0012:
            com.google.gson.internal.b r2 = r0.f37012b
            r3 = r36
            com.google.gson.internal.g r14 = r2.mo59573a(r3)
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$a r15 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$a
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            boolean r2 = r1.isInterface()
            if (r2 == 0) goto L_0x002c
        L_0x0027:
            r13 = r10
            r22 = r14
            goto L_0x01eb
        L_0x002c:
            java.lang.reflect.Type r9 = r36.getType()
            r8 = r1
            r16 = r3
        L_0x0033:
            if (r8 == r12) goto L_0x0027
            java.lang.reflect.Field[] r7 = r8.getDeclaredFields()
            int r6 = r7.length
            r5 = 0
            r4 = r5
        L_0x003c:
            if (r4 >= r6) goto L_0x01bb
            r3 = r7[r4]
            r2 = 1
            boolean r1 = r0.mo59575b(r3, r2)
            boolean r17 = r0.mo59575b(r3, r5)
            if (r1 != 0) goto L_0x005f
            if (r17 != 0) goto L_0x005f
            r20 = r4
            r31 = r5
            r32 = r6
            r27 = r7
            r36 = r8
            r11 = r9
            r13 = r10
            r19 = r12
            r22 = r14
            goto L_0x0188
        L_0x005f:
            rn.b r5 = r0.f37016f
            r5.mo70008a(r3)
            java.lang.reflect.Type r5 = r16.getType()
            java.lang.reflect.Type r13 = r3.getGenericType()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.lang.reflect.Type r13 = com.google.gson.internal.C$Gson$Types.m27704i(r5, r8, r13, r2)
            java.lang.Class<pn.a> r2 = p650pn.C18417a.class
            java.lang.annotation.Annotation r2 = r3.getAnnotation(r2)
            pn.a r2 = (p650pn.C18417a) r2
            if (r2 != 0) goto L_0x008c
            com.google.gson.c r2 = r0.f37013c
            java.lang.String r2 = r2.translateName(r3)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r19 = r1
            goto L_0x009d
        L_0x008c:
            java.lang.String r5 = r2.value()
            java.lang.String[] r2 = r2.alternate()
            r19 = r1
            int r1 = r2.length
            if (r1 != 0) goto L_0x00a3
            java.util.List r2 = java.util.Collections.singletonList(r5)
        L_0x009d:
            r5 = r2
            r20 = r4
            r18 = 1
            goto L_0x00c3
        L_0x00a3:
            java.util.ArrayList r1 = new java.util.ArrayList
            r20 = r4
            int r4 = r2.length
            r18 = 1
            int r4 = r4 + 1
            r1.<init>(r4)
            r1.add(r5)
            int r4 = r2.length
            r5 = 0
        L_0x00b4:
            if (r5 >= r4) goto L_0x00c2
            r21 = r4
            r4 = r2[r5]
            r1.add(r4)
            int r5 = r5 + 1
            r4 = r21
            goto L_0x00b4
        L_0x00c2:
            r5 = r1
        L_0x00c3:
            int r4 = r5.size()
            r1 = r19
            r2 = 0
            r19 = r12
            r12 = 0
        L_0x00cd:
            if (r2 >= r4) goto L_0x017a
            java.lang.Object r21 = r5.get(r2)
            r22 = r14
            r14 = r21
            java.lang.String r14 = (java.lang.String) r14
            if (r2 == 0) goto L_0x00de
            r21 = 0
            goto L_0x00e0
        L_0x00de:
            r21 = r1
        L_0x00e0:
            sn.a r1 = p675sn.C18541a.get((java.lang.reflect.Type) r13)
            r23 = r2
            java.lang.Class r2 = r1.getRawType()
            r24 = r4
            boolean r4 = r2 instanceof java.lang.Class
            if (r4 == 0) goto L_0x00f9
            boolean r2 = r2.isPrimitive()
            if (r2 == 0) goto L_0x00f9
            r25 = r18
            goto L_0x00fb
        L_0x00f9:
            r25 = 0
        L_0x00fb:
            java.lang.Class<com.google.gson.annotations.JsonAdapter> r2 = com.google.gson.annotations.JsonAdapter.class
            java.lang.annotation.Annotation r2 = r3.getAnnotation(r2)
            com.google.gson.annotations.JsonAdapter r2 = (com.google.gson.annotations.JsonAdapter) r2
            if (r2 == 0) goto L_0x0113
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r4 = r0.f37015e
            r26 = r3
            com.google.gson.internal.b r3 = r0.f37012b
            r4.getClass()
            com.google.gson.t r2 = com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.m27736b(r3, r11, r1, r2)
            goto L_0x0116
        L_0x0113:
            r26 = r3
            r2 = 0
        L_0x0116:
            if (r2 == 0) goto L_0x011b
            r27 = r18
            goto L_0x011d
        L_0x011b:
            r27 = 0
        L_0x011d:
            if (r2 != 0) goto L_0x0123
            com.google.gson.t r2 = r11.mo59460g(r1)
        L_0x0123:
            r28 = r2
            com.google.gson.internal.bind.c r4 = new com.google.gson.internal.bind.c
            r29 = r1
            r1 = r4
            r33 = r23
            r23 = r18
            r18 = r33
            r2 = r14
            r3 = r21
            r0 = r4
            r4 = r17
            r30 = r5
            r31 = 0
            r5 = r26
            r32 = r6
            r6 = r27
            r27 = r7
            r7 = r28
            r36 = r8
            r8 = r35
            r11 = r9
            r9 = r29
            r28 = r13
            r13 = r10
            r10 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r0 = r13.put(r14, r0)
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$b r0 = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.C16737b) r0
            if (r12 != 0) goto L_0x015c
            r12 = r0
        L_0x015c:
            int r2 = r18 + 1
            r0 = r34
            r8 = r36
            r9 = r11
            r10 = r13
            r1 = r21
            r14 = r22
            r18 = r23
            r4 = r24
            r3 = r26
            r7 = r27
            r13 = r28
            r5 = r30
            r6 = r32
            r11 = r35
            goto L_0x00cd
        L_0x017a:
            r32 = r6
            r27 = r7
            r36 = r8
            r11 = r9
            r13 = r10
            r22 = r14
            r31 = 0
            if (r12 != 0) goto L_0x019f
        L_0x0188:
            int r4 = r20 + 1
            r0 = r34
            r8 = r36
            r9 = r11
            r10 = r13
            r12 = r19
            r14 = r22
            r7 = r27
            r5 = r31
            r6 = r32
            r13 = 0
            r11 = r35
            goto L_0x003c
        L_0x019f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r2 = " declares multiple JSON fields named "
            r1.append(r2)
            java.lang.String r2 = r12.f37019a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01bb:
            r36 = r8
            r11 = r9
            r13 = r10
            r19 = r12
            r22 = r14
            java.lang.reflect.Type r0 = r16.getType()
            java.lang.reflect.Type r1 = r36.getGenericSuperclass()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r3 = r36
            java.lang.reflect.Type r0 = com.google.gson.internal.C$Gson$Types.m27704i(r0, r3, r1, r2)
            sn.a r16 = p675sn.C18541a.get((java.lang.reflect.Type) r0)
            java.lang.Class r8 = r16.getRawType()
            r0 = r34
            r9 = r11
            r10 = r13
            r12 = r19
            r14 = r22
            r13 = 0
            r11 = r35
            goto L_0x0033
        L_0x01eb:
            r0 = r22
            r15.<init>(r0, r13)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.mo59482a(com.google.gson.i, sn.a):com.google.gson.t");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006b, code lost:
        if (r1 == false) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo59575b(java.lang.reflect.Field r8, boolean r9) {
        /*
            r7 = this;
            com.google.gson.internal.Excluder r0 = r7.f37014d
            java.lang.Class r1 = r8.getType()
            boolean r2 = r0.mo59483b(r1)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x0017
            boolean r1 = r0.mo59484c(r1, r9)
            if (r1 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r1 = r4
            goto L_0x0018
        L_0x0017:
            r1 = r3
        L_0x0018:
            if (r1 != 0) goto L_0x00b5
            int r1 = r0.f36942c
            int r2 = r8.getModifiers()
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0025
            goto L_0x00af
        L_0x0025:
            double r1 = r0.f36941b
            r5 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0045
            java.lang.Class<pn.b> r1 = p650pn.C18418b.class
            java.lang.annotation.Annotation r1 = r8.getAnnotation(r1)
            pn.b r1 = (p650pn.C18418b) r1
            java.lang.Class<pn.c> r2 = p650pn.C18419c.class
            java.lang.annotation.Annotation r2 = r8.getAnnotation(r2)
            pn.c r2 = (p650pn.C18419c) r2
            boolean r1 = r0.mo59486d(r1, r2)
            if (r1 != 0) goto L_0x0045
            goto L_0x00af
        L_0x0045:
            boolean r1 = r8.isSynthetic()
            if (r1 == 0) goto L_0x004d
            goto L_0x00af
        L_0x004d:
            boolean r1 = r0.f36943d
            if (r1 != 0) goto L_0x006e
            java.lang.Class r1 = r8.getType()
            boolean r2 = r1.isMemberClass()
            if (r2 == 0) goto L_0x006a
            int r1 = r1.getModifiers()
            r1 = r1 & 8
            if (r1 == 0) goto L_0x0065
            r1 = r3
            goto L_0x0066
        L_0x0065:
            r1 = r4
        L_0x0066:
            if (r1 != 0) goto L_0x006a
            r1 = r3
            goto L_0x006b
        L_0x006a:
            r1 = r4
        L_0x006b:
            if (r1 == 0) goto L_0x006e
            goto L_0x00af
        L_0x006e:
            java.lang.Class r8 = r8.getType()
            java.lang.Class<java.lang.Enum> r1 = java.lang.Enum.class
            boolean r1 = r1.isAssignableFrom(r8)
            if (r1 != 0) goto L_0x0088
            boolean r1 = r8.isAnonymousClass()
            if (r1 != 0) goto L_0x0086
            boolean r8 = r8.isLocalClass()
            if (r8 == 0) goto L_0x0088
        L_0x0086:
            r8 = r3
            goto L_0x0089
        L_0x0088:
            r8 = r4
        L_0x0089:
            if (r8 == 0) goto L_0x008c
            goto L_0x00af
        L_0x008c:
            if (r9 == 0) goto L_0x0091
            java.util.List<com.google.gson.b> r8 = r0.f36944e
            goto L_0x0093
        L_0x0091:
            java.util.List<com.google.gson.b> r8 = r0.f36945f
        L_0x0093:
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L_0x00b1
            java.util.Iterator r8 = r8.iterator()
        L_0x009d:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00b1
            java.lang.Object r9 = r8.next()
            com.google.gson.b r9 = (com.google.gson.C16701b) r9
            boolean r9 = r9.mo59455b()
            if (r9 == 0) goto L_0x009d
        L_0x00af:
            r8 = r3
            goto L_0x00b2
        L_0x00b1:
            r8 = r4
        L_0x00b2:
            if (r8 != 0) goto L_0x00b5
            goto L_0x00b6
        L_0x00b5:
            r3 = r4
        L_0x00b6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.mo59575b(java.lang.reflect.Field, boolean):boolean");
    }
}
