package retrofit2;

/* renamed from: retrofit2.x */
public abstract class C20149x<T> {
    /* JADX WARNING: Removed duplicated region for block: B:378:0x096b  */
    /* JADX WARNING: Removed duplicated region for block: B:557:0x096e A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static retrofit2.C20105i m34449b(retrofit2.C20146w r22, java.lang.reflect.Method r23) {
        /*
            r0 = r22
            r1 = r23
            retrofit2.u$a r2 = new retrofit2.u$a
            r2.<init>(r0, r1)
            java.lang.annotation.Annotation[] r3 = r2.f44593c
            int r4 = r3.length
            r5 = 0
            r6 = r5
        L_0x000e:
            java.lang.String r7 = "HEAD"
            r8 = 0
            r9 = 1
            if (r6 >= r4) goto L_0x014f
            r10 = r3[r6]
            boolean r11 = r10 instanceof p771sr.C20179b
            if (r11 == 0) goto L_0x0027
            sr.b r10 = (p771sr.C20179b) r10
            java.lang.String r7 = r10.value()
            java.lang.String r8 = "DELETE"
            r2.mo74382b(r8, r7, r5)
            goto L_0x014b
        L_0x0027:
            boolean r11 = r10 instanceof p771sr.C20183f
            if (r11 == 0) goto L_0x0038
            sr.f r10 = (p771sr.C20183f) r10
            java.lang.String r7 = r10.value()
            java.lang.String r8 = "GET"
            r2.mo74382b(r8, r7, r5)
            goto L_0x014b
        L_0x0038:
            boolean r11 = r10 instanceof p771sr.C20184g
            if (r11 == 0) goto L_0x0047
            sr.g r10 = (p771sr.C20184g) r10
            java.lang.String r8 = r10.value()
            r2.mo74382b(r7, r8, r5)
            goto L_0x014b
        L_0x0047:
            boolean r7 = r10 instanceof p771sr.C20191n
            if (r7 == 0) goto L_0x0058
            sr.n r10 = (p771sr.C20191n) r10
            java.lang.String r7 = r10.value()
            java.lang.String r8 = "PATCH"
            r2.mo74382b(r8, r7, r9)
            goto L_0x014b
        L_0x0058:
            boolean r7 = r10 instanceof p771sr.C20192o
            if (r7 == 0) goto L_0x0069
            sr.o r10 = (p771sr.C20192o) r10
            java.lang.String r7 = r10.value()
            java.lang.String r8 = "POST"
            r2.mo74382b(r8, r7, r9)
            goto L_0x014b
        L_0x0069:
            boolean r7 = r10 instanceof p771sr.C20193p
            if (r7 == 0) goto L_0x007a
            sr.p r10 = (p771sr.C20193p) r10
            java.lang.String r7 = r10.value()
            java.lang.String r8 = "PUT"
            r2.mo74382b(r8, r7, r9)
            goto L_0x014b
        L_0x007a:
            boolean r7 = r10 instanceof p771sr.C20190m
            if (r7 == 0) goto L_0x008b
            sr.m r10 = (p771sr.C20190m) r10
            java.lang.String r7 = r10.value()
            java.lang.String r8 = "OPTIONS"
            r2.mo74382b(r8, r7, r5)
            goto L_0x014b
        L_0x008b:
            boolean r7 = r10 instanceof p771sr.C20185h
            if (r7 == 0) goto L_0x00a2
            sr.h r10 = (p771sr.C20185h) r10
            java.lang.String r7 = r10.method()
            java.lang.String r8 = r10.path()
            boolean r9 = r10.hasBody()
            r2.mo74382b(r7, r8, r9)
            goto L_0x014b
        L_0x00a2:
            boolean r7 = r10 instanceof p771sr.C20188k
            if (r7 == 0) goto L_0x0121
            sr.k r10 = (p771sr.C20188k) r10
            java.lang.String[] r7 = r10.value()
            int r10 = r7.length
            if (r10 == 0) goto L_0x0116
            okhttp3.o$a r10 = new okhttp3.o$a
            r10.<init>()
            int r11 = r7.length
            r12 = r5
        L_0x00b6:
            if (r12 >= r11) goto L_0x010f
            r13 = r7[r12]
            r14 = 58
            int r14 = r13.indexOf(r14)
            r15 = -1
            if (r14 == r15) goto L_0x0102
            if (r14 == 0) goto L_0x0102
            int r15 = r13.length()
            int r15 = r15 - r9
            if (r14 == r15) goto L_0x0102
            java.lang.String r15 = r13.substring(r5, r14)
            int r14 = r14 + 1
            java.lang.String r13 = r13.substring(r14)
            java.lang.String r13 = r13.trim()
            java.lang.String r14 = "Content-Type"
            boolean r14 = r14.equalsIgnoreCase(r15)
            if (r14 == 0) goto L_0x00fc
            okhttp3.r$a r14 = okhttp3.C20002r.f44260f     // Catch:{ IllegalArgumentException -> 0x00ee }
            r14.getClass()     // Catch:{ IllegalArgumentException -> 0x00ee }
            okhttp3.r r14 = okhttp3.C20002r.C20003a.m34243a(r13)     // Catch:{ IllegalArgumentException -> 0x00ee }
            r2.f44610t = r14     // Catch:{ IllegalArgumentException -> 0x00ee }
            goto L_0x00ff
        L_0x00ee:
            r0 = move-exception
            java.lang.reflect.Method r1 = r2.f44592b
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r2[r5] = r13
            java.lang.String r3 = "Malformed content type: %s"
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34347j(r1, r0, r3, r2)
            throw r0
        L_0x00fc:
            r10.mo72958a(r15, r13)
        L_0x00ff:
            int r12 = r12 + 1
            goto L_0x00b6
        L_0x0102:
            java.lang.reflect.Method r0 = r2.f44592b
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r5] = r13
            java.lang.String r2 = "@Headers value must be in the form \"Name: Value\". Found: \"%s\""
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34347j(r0, r8, r2, r1)
            throw r0
        L_0x010f:
            okhttp3.o r7 = r10.mo72961d()
            r2.f44609s = r7
            goto L_0x014b
        L_0x0116:
            java.lang.reflect.Method r0 = r2.f44592b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "@Headers annotation is empty."
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34347j(r0, r8, r2, r1)
            throw r0
        L_0x0121:
            boolean r7 = r10 instanceof p771sr.C20189l
            java.lang.String r11 = "Only one encoding annotation is allowed."
            if (r7 == 0) goto L_0x0137
            boolean r7 = r2.f44606p
            if (r7 != 0) goto L_0x012e
            r2.f44607q = r9
            goto L_0x014b
        L_0x012e:
            java.lang.reflect.Method r0 = r2.f44592b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34347j(r0, r8, r11, r1)
            throw r0
        L_0x0137:
            boolean r7 = r10 instanceof p771sr.C20182e
            if (r7 == 0) goto L_0x014b
            boolean r7 = r2.f44607q
            if (r7 != 0) goto L_0x0142
            r2.f44606p = r9
            goto L_0x014b
        L_0x0142:
            java.lang.reflect.Method r0 = r2.f44592b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34347j(r0, r8, r11, r1)
            throw r0
        L_0x014b:
            int r6 = r6 + 1
            goto L_0x000e
        L_0x014f:
            java.lang.String r3 = r2.f44604n
            if (r3 == 0) goto L_0x0b6b
            boolean r3 = r2.f44605o
            if (r3 != 0) goto L_0x0176
            boolean r3 = r2.f44607q
            if (r3 != 0) goto L_0x016b
            boolean r3 = r2.f44606p
            if (r3 != 0) goto L_0x0160
            goto L_0x0176
        L_0x0160:
            java.lang.reflect.Method r0 = r2.f44592b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST)."
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34347j(r0, r8, r2, r1)
            throw r0
        L_0x016b:
            java.lang.reflect.Method r0 = r2.f44592b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "Multipart can only be specified on HTTP methods with request body (e.g., @POST)."
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34347j(r0, r8, r2, r1)
            throw r0
        L_0x0176:
            java.lang.annotation.Annotation[][] r3 = r2.f44594d
            int r3 = r3.length
            retrofit2.r[] r4 = new retrofit2.C20122r[r3]
            r2.f44612v = r4
            int r4 = r3 + -1
            r6 = r5
        L_0x0180:
            if (r5 >= r3) goto L_0x09ce
            retrofit2.r<?>[] r10 = r2.f44612v
            java.lang.reflect.Type[] r11 = r2.f44595e
            r11 = r11[r5]
            java.lang.annotation.Annotation[][] r12 = r2.f44594d
            r12 = r12[r5]
            if (r5 != r4) goto L_0x018f
            goto L_0x0190
        L_0x018f:
            r9 = r6
        L_0x0190:
            if (r12 == 0) goto L_0x0995
            int r13 = r12.length
        L_0x0193:
            if (r6 >= r13) goto L_0x098c
            r14 = r12[r6]
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            r16 = r3
            java.lang.Class<okhttp3.s$c> r3 = okhttp3.C20004s.C20007c.class
            r17 = r4
            boolean r4 = r14 instanceof p771sr.C20202y
            r18 = r13
            java.lang.String r13 = "@Path parameters may not be used with @Url."
            if (r4 == 0) goto L_0x0245
            r2.mo74383c(r5, r11)
            boolean r3 = r2.f44603m
            if (r3 != 0) goto L_0x0239
            boolean r3 = r2.f44599i
            if (r3 != 0) goto L_0x022f
            boolean r3 = r2.f44600j
            if (r3 != 0) goto L_0x0223
            boolean r3 = r2.f44601k
            if (r3 != 0) goto L_0x0217
            boolean r3 = r2.f44602l
            if (r3 != 0) goto L_0x020b
            java.lang.String r3 = r2.f44608r
            if (r3 != 0) goto L_0x01fa
            r3 = 1
            r2.f44603m = r3
            java.lang.Class<okhttp3.p> r3 = okhttp3.C19997p.class
            if (r11 == r3) goto L_0x01ef
            if (r11 == r15) goto L_0x01ef
            java.lang.Class<java.net.URI> r3 = java.net.URI.class
            if (r11 == r3) goto L_0x01ef
            boolean r3 = r11 instanceof java.lang.Class
            if (r3 == 0) goto L_0x01e3
            java.lang.String r3 = "android.net.Uri"
            r4 = r11
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.String r4 = r4.getName()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01e3
            goto L_0x01ef
        L_0x01e3:
            java.lang.reflect.Method r0 = r2.f44592b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type."
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r0, r5, r2, r1)
            throw r0
        L_0x01ef:
            retrofit2.r$n r3 = new retrofit2.r$n
            java.lang.reflect.Method r4 = r2.f44592b
            r3.<init>(r5, r4)
        L_0x01f6:
            r19 = r7
            goto L_0x0730
        L_0x01fa:
            java.lang.reflect.Method r0 = r2.f44592b
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.f44604n
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "@Url cannot be used with @%s URL"
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r0, r5, r2, r1)
            throw r0
        L_0x020b:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f44592b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "A @Url parameter must not come after a @QueryMap."
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r1, r5, r2, r0)
            throw r0
        L_0x0217:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f44592b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "A @Url parameter must not come after a @QueryName."
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r1, r5, r2, r0)
            throw r0
        L_0x0223:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f44592b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "A @Url parameter must not come after a @Query."
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r1, r5, r2, r0)
            throw r0
        L_0x022f:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f44592b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r1, r5, r13, r0)
            throw r0
        L_0x0239:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f44592b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "Multiple @Url method annotations found."
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r1, r5, r2, r0)
            throw r0
        L_0x0245:
            boolean r4 = r14 instanceof p771sr.C20196s
            r1 = 2
            if (r4 == 0) goto L_0x02f9
            r2.mo74383c(r5, r11)
            boolean r3 = r2.f44600j
            if (r3 != 0) goto L_0x02ed
            boolean r3 = r2.f44601k
            if (r3 != 0) goto L_0x02e1
            boolean r3 = r2.f44602l
            if (r3 != 0) goto L_0x02d5
            boolean r3 = r2.f44603m
            if (r3 != 0) goto L_0x02cb
            java.lang.String r3 = r2.f44608r
            if (r3 == 0) goto L_0x02ba
            r3 = 1
            r2.f44599i = r3
            sr.s r14 = (p771sr.C20196s) r14
            java.lang.String r3 = r14.value()
            java.util.regex.Pattern r4 = retrofit2.C20143u.C20144a.f44590y
            java.util.regex.Matcher r4 = r4.matcher(r3)
            boolean r4 = r4.matches()
            if (r4 == 0) goto L_0x02a3
            java.util.LinkedHashSet r4 = r2.f44611u
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L_0x0290
            retrofit2.w r1 = r2.f44591a
            r1.mo74391f(r11, r12)
            retrofit2.r$i r1 = new retrofit2.r$i
            java.lang.reflect.Method r4 = r2.f44592b
            boolean r13 = r14.encoded()
            r1.<init>(r4, r5, r3, r13)
            goto L_0x0389
        L_0x0290:
            java.lang.reflect.Method r0 = r2.f44592b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.f44608r
            r4 = 0
            r1[r4] = r2
            r2 = 1
            r1[r2] = r3
            java.lang.String r2 = "URL \"%s\" does not contain \"{%s}\"."
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r0, r5, r2, r1)
            throw r0
        L_0x02a3:
            r0 = 1
            r4 = 0
            java.lang.reflect.Method r2 = r2.f44592b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.regex.Pattern r6 = retrofit2.C20143u.C20144a.f44589x
            java.lang.String r6 = r6.pattern()
            r1[r4] = r6
            r1[r0] = r3
            java.lang.String r0 = "@Path parameter name must match %s. Found: %s"
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r2, r5, r0, r1)
            throw r0
        L_0x02ba:
            r0 = 1
            r1 = 0
            java.lang.reflect.Method r3 = r2.f44592b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = r2.f44604n
            r0[r1] = r2
            java.lang.String r1 = "@Path can only be used with relative url on @%s"
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r3, r5, r1, r0)
            throw r0
        L_0x02cb:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f44592b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r1, r5, r13, r0)
            throw r0
        L_0x02d5:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f44592b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "A @Path parameter must not come after a @QueryMap."
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r1, r5, r2, r0)
            throw r0
        L_0x02e1:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f44592b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "A @Path parameter must not come after a @QueryName."
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r1, r5, r2, r0)
            throw r0
        L_0x02ed:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f44592b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "A @Path parameter must not come after a @Query."
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r1, r5, r2, r0)
            throw r0
        L_0x02f9:
            boolean r1 = r14 instanceof p771sr.C20197t
            java.lang.String r4 = "<String>)"
            java.lang.String r13 = " must include generic type (e.g., "
            if (r1 == 0) goto L_0x038d
            r2.mo74383c(r5, r11)
            sr.t r14 = (p771sr.C20197t) r14
            java.lang.String r1 = r14.value()
            boolean r3 = r14.encoded()
            java.lang.Class r14 = retrofit2.C20085a0.m34343f(r11)
            r15 = 1
            r2.f44600j = r15
            java.lang.Class<java.lang.Iterable> r15 = java.lang.Iterable.class
            boolean r15 = r15.isAssignableFrom(r14)
            if (r15 == 0) goto L_0x0360
            boolean r15 = r11 instanceof java.lang.reflect.ParameterizedType
            if (r15 == 0) goto L_0x0339
            r4 = r11
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            r13 = 0
            java.lang.reflect.Type r4 = retrofit2.C20085a0.m34342e(r13, r4)
            retrofit2.w r13 = r2.f44591a
            r13.mo74391f(r4, r12)
            retrofit2.r$j r4 = new retrofit2.r$j
            r4.<init>(r1, r3)
            retrofit2.p r1 = new retrofit2.p
            r1.<init>(r4)
            goto L_0x0389
        L_0x0339:
            java.lang.reflect.Method r0 = r2.f44592b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r14.getSimpleName()
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = r14.getSimpleName()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r0, r5, r1, r2)
            throw r0
        L_0x0360:
            boolean r4 = r14.isArray()
            if (r4 == 0) goto L_0x037e
            java.lang.Class r4 = r14.getComponentType()
            java.lang.Class r4 = retrofit2.C20143u.C20144a.m34436a(r4)
            retrofit2.w r13 = r2.f44591a
            r13.mo74391f(r4, r12)
            retrofit2.r$j r4 = new retrofit2.r$j
            r4.<init>(r1, r3)
            retrofit2.q r1 = new retrofit2.q
            r1.<init>(r4)
            goto L_0x0389
        L_0x037e:
            retrofit2.w r4 = r2.f44591a
            r4.mo74391f(r11, r12)
            retrofit2.r$j r4 = new retrofit2.r$j
            r4.<init>(r1, r3)
            r1 = r4
        L_0x0389:
            r19 = r7
            goto L_0x0606
        L_0x038d:
            boolean r1 = r14 instanceof p771sr.C20199v
            if (r1 == 0) goto L_0x0417
            r2.mo74383c(r5, r11)
            sr.v r14 = (p771sr.C20199v) r14
            boolean r1 = r14.encoded()
            java.lang.Class r3 = retrofit2.C20085a0.m34343f(r11)
            r14 = 1
            r2.f44601k = r14
            java.lang.Class<java.lang.Iterable> r14 = java.lang.Iterable.class
            boolean r14 = r14.isAssignableFrom(r3)
            if (r14 == 0) goto L_0x03ec
            boolean r14 = r11 instanceof java.lang.reflect.ParameterizedType
            if (r14 == 0) goto L_0x03c5
            r3 = r11
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            r4 = 0
            java.lang.reflect.Type r3 = retrofit2.C20085a0.m34342e(r4, r3)
            retrofit2.w r4 = r2.f44591a
            r4.mo74391f(r3, r12)
            retrofit2.r$l r3 = new retrofit2.r$l
            r3.<init>(r1)
            retrofit2.p r1 = new retrofit2.p
            r1.<init>(r3)
            goto L_0x0389
        L_0x03c5:
            java.lang.reflect.Method r0 = r2.f44592b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getSimpleName()
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = r3.getSimpleName()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r0, r5, r1, r2)
            throw r0
        L_0x03ec:
            boolean r4 = r3.isArray()
            if (r4 == 0) goto L_0x040b
            java.lang.Class r3 = r3.getComponentType()
            java.lang.Class r3 = retrofit2.C20143u.C20144a.m34436a(r3)
            retrofit2.w r4 = r2.f44591a
            r4.mo74391f(r3, r12)
            retrofit2.r$l r3 = new retrofit2.r$l
            r3.<init>(r1)
            retrofit2.q r1 = new retrofit2.q
            r1.<init>(r3)
            goto L_0x0389
        L_0x040b:
            retrofit2.w r3 = r2.f44591a
            r3.mo74391f(r11, r12)
            retrofit2.r$l r3 = new retrofit2.r$l
            r3.<init>(r1)
            goto L_0x01f6
        L_0x0417:
            boolean r1 = r14 instanceof p771sr.C20198u
            r19 = r7
            java.lang.String r7 = "Map must include generic types (e.g., Map<String, String>)"
            if (r1 == 0) goto L_0x0482
            r2.mo74383c(r5, r11)
            java.lang.Class r1 = retrofit2.C20085a0.m34343f(r11)
            r3 = 1
            r2.f44602l = r3
            java.lang.Class<java.util.Map> r4 = java.util.Map.class
            boolean r4 = r4.isAssignableFrom(r1)
            if (r4 == 0) goto L_0x0476
            java.lang.Class<java.util.Map> r4 = java.util.Map.class
            java.lang.reflect.Type r1 = retrofit2.C20085a0.m34344g(r11, r1, r4)
            boolean r4 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L_0x046c
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            r4 = 0
            java.lang.reflect.Type r4 = retrofit2.C20085a0.m34342e(r4, r1)
            if (r15 != r4) goto L_0x045c
            java.lang.reflect.Type r1 = retrofit2.C20085a0.m34342e(r3, r1)
            retrofit2.w r3 = r2.f44591a
            r3.mo74391f(r1, r12)
            retrofit2.r$k r1 = new retrofit2.r$k
            java.lang.reflect.Method r3 = r2.f44592b
            sr.u r14 = (p771sr.C20198u) r14
            boolean r4 = r14.encoded()
            r1.<init>(r3, r5, r4)
            goto L_0x0606
        L_0x045c:
            java.lang.reflect.Method r0 = r2.f44592b
            java.lang.String r1 = "@QueryMap keys must be of type String: "
            java.lang.String r1 = android.support.p013v4.media.C0073e.m207g(r1, r4)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r0, r5, r1, r2)
            throw r0
        L_0x046c:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f44592b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r1, r5, r7, r0)
            throw r0
        L_0x0476:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f44592b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@QueryMap parameter type must be Map."
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r1, r5, r2, r0)
            throw r0
        L_0x0482:
            boolean r1 = r14 instanceof p771sr.C20186i
            if (r1 == 0) goto L_0x050a
            r2.mo74383c(r5, r11)
            sr.i r14 = (p771sr.C20186i) r14
            java.lang.String r1 = r14.value()
            java.lang.Class r3 = retrofit2.C20085a0.m34343f(r11)
            java.lang.Class<java.lang.Iterable> r7 = java.lang.Iterable.class
            boolean r7 = r7.isAssignableFrom(r3)
            if (r7 == 0) goto L_0x04df
            boolean r7 = r11 instanceof java.lang.reflect.ParameterizedType
            if (r7 == 0) goto L_0x04b8
            r3 = r11
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            r4 = 0
            java.lang.reflect.Type r3 = retrofit2.C20085a0.m34342e(r4, r3)
            retrofit2.w r4 = r2.f44591a
            r4.mo74391f(r3, r12)
            retrofit2.r$d r3 = new retrofit2.r$d
            r3.<init>(r1)
            retrofit2.p r1 = new retrofit2.p
            r1.<init>(r3)
            goto L_0x0606
        L_0x04b8:
            java.lang.reflect.Method r0 = r2.f44592b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getSimpleName()
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = r3.getSimpleName()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r0, r5, r1, r2)
            throw r0
        L_0x04df:
            boolean r4 = r3.isArray()
            if (r4 == 0) goto L_0x04fe
            java.lang.Class r3 = r3.getComponentType()
            java.lang.Class r3 = retrofit2.C20143u.C20144a.m34436a(r3)
            retrofit2.w r4 = r2.f44591a
            r4.mo74391f(r3, r12)
            retrofit2.r$d r3 = new retrofit2.r$d
            r3.<init>(r1)
            retrofit2.q r1 = new retrofit2.q
            r1.<init>(r3)
            goto L_0x0606
        L_0x04fe:
            retrofit2.w r3 = r2.f44591a
            r3.mo74391f(r11, r12)
            retrofit2.r$d r3 = new retrofit2.r$d
            r3.<init>(r1)
            goto L_0x0730
        L_0x050a:
            boolean r1 = r14 instanceof p771sr.C20187j
            if (r1 == 0) goto L_0x0576
            java.lang.Class<okhttp3.o> r1 = okhttp3.C19994o.class
            if (r11 != r1) goto L_0x051b
            retrofit2.r$f r1 = new retrofit2.r$f
            java.lang.reflect.Method r3 = r2.f44592b
            r1.<init>(r5, r3)
            goto L_0x0606
        L_0x051b:
            r2.mo74383c(r5, r11)
            java.lang.Class r1 = retrofit2.C20085a0.m34343f(r11)
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 == 0) goto L_0x056a
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            java.lang.reflect.Type r1 = retrofit2.C20085a0.m34344g(r11, r1, r3)
            boolean r3 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x0560
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            r3 = 0
            java.lang.reflect.Type r3 = retrofit2.C20085a0.m34342e(r3, r1)
            if (r15 != r3) goto L_0x0550
            r3 = 1
            java.lang.reflect.Type r1 = retrofit2.C20085a0.m34342e(r3, r1)
            retrofit2.w r3 = r2.f44591a
            r3.mo74391f(r1, r12)
            retrofit2.r$e r1 = new retrofit2.r$e
            java.lang.reflect.Method r3 = r2.f44592b
            r1.<init>(r3, r5)
            goto L_0x0606
        L_0x0550:
            java.lang.reflect.Method r0 = r2.f44592b
            java.lang.String r1 = "@HeaderMap keys must be of type String: "
            java.lang.String r1 = android.support.p013v4.media.C0073e.m207g(r1, r3)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r0, r5, r1, r2)
            throw r0
        L_0x0560:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f44592b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r1, r5, r7, r0)
            throw r0
        L_0x056a:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f44592b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@HeaderMap parameter type must be Map."
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r1, r5, r2, r0)
            throw r0
        L_0x0576:
            boolean r1 = r14 instanceof p771sr.C20180c
            if (r1 == 0) goto L_0x0615
            r2.mo74383c(r5, r11)
            boolean r1 = r2.f44606p
            if (r1 == 0) goto L_0x0609
            sr.c r14 = (p771sr.C20180c) r14
            java.lang.String r1 = r14.value()
            boolean r3 = r14.encoded()
            r7 = 1
            r2.f44596f = r7
            java.lang.Class r7 = retrofit2.C20085a0.m34343f(r11)
            java.lang.Class<java.lang.Iterable> r14 = java.lang.Iterable.class
            boolean r14 = r14.isAssignableFrom(r7)
            if (r14 == 0) goto L_0x05dd
            boolean r14 = r11 instanceof java.lang.reflect.ParameterizedType
            if (r14 == 0) goto L_0x05b6
            r4 = r11
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            r7 = 0
            java.lang.reflect.Type r4 = retrofit2.C20085a0.m34342e(r7, r4)
            retrofit2.w r7 = r2.f44591a
            r7.mo74391f(r4, r12)
            retrofit2.r$b r4 = new retrofit2.r$b
            r4.<init>(r1, r3)
            retrofit2.p r1 = new retrofit2.p
            r1.<init>(r4)
            goto L_0x0606
        L_0x05b6:
            java.lang.reflect.Method r0 = r2.f44592b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r7.getSimpleName()
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = r7.getSimpleName()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r0, r5, r1, r2)
            throw r0
        L_0x05dd:
            boolean r4 = r7.isArray()
            if (r4 == 0) goto L_0x05fb
            java.lang.Class r4 = r7.getComponentType()
            java.lang.Class r4 = retrofit2.C20143u.C20144a.m34436a(r4)
            retrofit2.w r7 = r2.f44591a
            r7.mo74391f(r4, r12)
            retrofit2.r$b r4 = new retrofit2.r$b
            r4.<init>(r1, r3)
            retrofit2.q r1 = new retrofit2.q
            r1.<init>(r4)
            goto L_0x0606
        L_0x05fb:
            retrofit2.w r4 = r2.f44591a
            r4.mo74391f(r11, r12)
            retrofit2.r$b r4 = new retrofit2.r$b
            r4.<init>(r1, r3)
            r1 = r4
        L_0x0606:
            r3 = r1
            goto L_0x0730
        L_0x0609:
            java.lang.reflect.Method r0 = r2.f44592b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "@Field parameters can only be used with form encoding."
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r0, r5, r2, r1)
            throw r0
        L_0x0615:
            boolean r1 = r14 instanceof p771sr.C20181d
            if (r1 == 0) goto L_0x068b
            r2.mo74383c(r5, r11)
            boolean r1 = r2.f44606p
            if (r1 == 0) goto L_0x067f
            java.lang.Class r1 = retrofit2.C20085a0.m34343f(r11)
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 == 0) goto L_0x0673
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            java.lang.reflect.Type r1 = retrofit2.C20085a0.m34344g(r11, r1, r3)
            boolean r3 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x0669
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            r3 = 0
            java.lang.reflect.Type r3 = retrofit2.C20085a0.m34342e(r3, r1)
            if (r15 != r3) goto L_0x0659
            r3 = 1
            java.lang.reflect.Type r1 = retrofit2.C20085a0.m34342e(r3, r1)
            retrofit2.w r4 = r2.f44591a
            r4.mo74391f(r1, r12)
            r2.f44596f = r3
            retrofit2.r$c r1 = new retrofit2.r$c
            java.lang.reflect.Method r3 = r2.f44592b
            sr.d r14 = (p771sr.C20181d) r14
            boolean r4 = r14.encoded()
            r1.<init>(r3, r5, r4)
            goto L_0x0606
        L_0x0659:
            java.lang.reflect.Method r0 = r2.f44592b
            java.lang.String r1 = "@FieldMap keys must be of type String: "
            java.lang.String r1 = android.support.p013v4.media.C0073e.m207g(r1, r3)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r0, r5, r1, r2)
            throw r0
        L_0x0669:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f44592b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r1, r5, r7, r0)
            throw r0
        L_0x0673:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f44592b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@FieldMap parameter type must be Map."
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r1, r5, r2, r0)
            throw r0
        L_0x067f:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f44592b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@FieldMap parameters can only be used with form encoding."
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r1, r5, r2, r0)
            throw r0
        L_0x068b:
            boolean r1 = r14 instanceof p771sr.C20194q
            if (r1 == 0) goto L_0x0830
            r2.mo74383c(r5, r11)
            boolean r1 = r2.f44607q
            if (r1 == 0) goto L_0x0824
            sr.q r14 = (p771sr.C20194q) r14
            r1 = 1
            r2.f44597g = r1
            java.lang.String r1 = r14.value()
            java.lang.Class r7 = retrofit2.C20085a0.m34343f(r11)
            boolean r15 = r1.isEmpty()
            if (r15 == 0) goto L_0x073d
            java.lang.Class<java.lang.Iterable> r1 = java.lang.Iterable.class
            boolean r1 = r1.isAssignableFrom(r7)
            java.lang.String r14 = "@Part annotation must supply a name or use MultipartBody.Part parameter type."
            if (r1 == 0) goto L_0x0701
            boolean r1 = r11 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L_0x06da
            r1 = r11
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            r4 = 0
            java.lang.reflect.Type r1 = retrofit2.C20085a0.m34342e(r4, r1)
            java.lang.Class r1 = retrofit2.C20085a0.m34343f(r1)
            boolean r1 = r3.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x06d1
            retrofit2.r$m r1 = retrofit2.C20122r.C20135m.f44555a
            retrofit2.p r3 = new retrofit2.p
            r3.<init>(r1)
            goto L_0x0730
        L_0x06d1:
            java.lang.reflect.Method r0 = r2.f44592b
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r0, r5, r14, r1)
            throw r0
        L_0x06da:
            java.lang.reflect.Method r0 = r2.f44592b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r7.getSimpleName()
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = r7.getSimpleName()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r0, r5, r1, r2)
            throw r0
        L_0x0701:
            boolean r1 = r7.isArray()
            if (r1 == 0) goto L_0x0725
            java.lang.Class r1 = r7.getComponentType()
            boolean r1 = r3.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x071b
            retrofit2.r$m r1 = retrofit2.C20122r.C20135m.f44555a
            retrofit2.q r3 = new retrofit2.q
            r3.<init>(r1)
            r1 = r3
            goto L_0x0606
        L_0x071b:
            java.lang.reflect.Method r0 = r2.f44592b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r0, r5, r14, r1)
            throw r0
        L_0x0725:
            r1 = 0
            boolean r3 = r3.isAssignableFrom(r7)
            if (r3 == 0) goto L_0x0734
            retrofit2.r$m r1 = retrofit2.C20122r.C20135m.f44555a
            goto L_0x0606
        L_0x0730:
            r20 = r10
            goto L_0x0968
        L_0x0734:
            java.lang.reflect.Method r0 = r2.f44592b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r0, r5, r14, r1)
            throw r0
        L_0x073d:
            r15 = 4
            java.lang.String[] r15 = new java.lang.String[r15]
            java.lang.String r20 = "Content-Disposition"
            r21 = 0
            r15[r21] = r20
            java.lang.String r0 = "form-data; name=\""
            r20 = r10
            java.lang.String r10 = "\""
            java.lang.String r0 = p010a9.C0048b.m163a(r0, r1, r10)
            r1 = 1
            r15[r1] = r0
            java.lang.String r0 = "Content-Transfer-Encoding"
            r1 = 2
            r15[r1] = r0
            r0 = 3
            java.lang.String r1 = r14.encoding()
            r15[r0] = r1
            okhttp3.o$b r0 = okhttp3.C19994o.f44234c
            r0.getClass()
            okhttp3.o r0 = okhttp3.C19994o.C19996b.m34216c(r15)
            java.lang.Class<java.lang.Iterable> r1 = java.lang.Iterable.class
            boolean r1 = r1.isAssignableFrom(r7)
            java.lang.String r10 = "@Part parameters using the MultipartBody.Part must not include a part name in the annotation."
            if (r1 == 0) goto L_0x07ce
            boolean r1 = r11 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L_0x07a7
            r1 = r11
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            r4 = 0
            java.lang.reflect.Type r1 = retrofit2.C20085a0.m34342e(r4, r1)
            java.lang.Class r4 = retrofit2.C20085a0.m34343f(r1)
            boolean r3 = r3.isAssignableFrom(r4)
            if (r3 != 0) goto L_0x079d
            retrofit2.w r3 = r2.f44591a
            java.lang.annotation.Annotation[] r4 = r2.f44593c
            retrofit2.f r1 = r3.mo74389d(r1, r12, r4)
            retrofit2.r$g r3 = new retrofit2.r$g
            java.lang.reflect.Method r4 = r2.f44592b
            r3.<init>(r4, r5, r0, r1)
            retrofit2.p r0 = new retrofit2.p
            r0.<init>(r3)
            goto L_0x07f6
        L_0x079d:
            java.lang.reflect.Method r0 = r2.f44592b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r0, r5, r10, r1)
            throw r0
        L_0x07a7:
            java.lang.reflect.Method r0 = r2.f44592b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r7.getSimpleName()
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = r7.getSimpleName()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r0, r5, r1, r2)
            throw r0
        L_0x07ce:
            boolean r1 = r7.isArray()
            if (r1 == 0) goto L_0x0803
            java.lang.Class r1 = r7.getComponentType()
            java.lang.Class r1 = retrofit2.C20143u.C20144a.m34436a(r1)
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 != 0) goto L_0x07f9
            retrofit2.w r3 = r2.f44591a
            java.lang.annotation.Annotation[] r4 = r2.f44593c
            retrofit2.f r1 = r3.mo74389d(r1, r12, r4)
            retrofit2.r$g r3 = new retrofit2.r$g
            java.lang.reflect.Method r4 = r2.f44592b
            r3.<init>(r4, r5, r0, r1)
            retrofit2.q r0 = new retrofit2.q
            r0.<init>(r3)
        L_0x07f6:
            r3 = r0
            goto L_0x0968
        L_0x07f9:
            java.lang.reflect.Method r0 = r2.f44592b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r0, r5, r10, r1)
            throw r0
        L_0x0803:
            boolean r1 = r3.isAssignableFrom(r7)
            if (r1 != 0) goto L_0x081a
            retrofit2.w r1 = r2.f44591a
            java.lang.annotation.Annotation[] r3 = r2.f44593c
            retrofit2.f r1 = r1.mo74389d(r11, r12, r3)
            retrofit2.r$g r3 = new retrofit2.r$g
            java.lang.reflect.Method r4 = r2.f44592b
            r3.<init>(r4, r5, r0, r1)
            goto L_0x0968
        L_0x081a:
            java.lang.reflect.Method r0 = r2.f44592b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r0, r5, r10, r1)
            throw r0
        L_0x0824:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f44592b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@Part parameters can only be used with multipart encoding."
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r1, r5, r2, r0)
            throw r0
        L_0x0830:
            r20 = r10
            boolean r0 = r14 instanceof p771sr.C20195r
            if (r0 == 0) goto L_0x08c3
            r2.mo74383c(r5, r11)
            boolean r0 = r2.f44607q
            if (r0 == 0) goto L_0x08b7
            r0 = 1
            r2.f44597g = r0
            java.lang.Class r0 = retrofit2.C20085a0.m34343f(r11)
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r1 = r1.isAssignableFrom(r0)
            if (r1 == 0) goto L_0x08ab
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            java.lang.reflect.Type r0 = retrofit2.C20085a0.m34344g(r11, r0, r1)
            boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L_0x08a1
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            r1 = 0
            java.lang.reflect.Type r1 = retrofit2.C20085a0.m34342e(r1, r0)
            if (r15 != r1) goto L_0x0891
            r1 = 1
            java.lang.reflect.Type r0 = retrofit2.C20085a0.m34342e(r1, r0)
            java.lang.Class r1 = retrofit2.C20085a0.m34343f(r0)
            boolean r1 = r3.isAssignableFrom(r1)
            if (r1 != 0) goto L_0x0885
            retrofit2.w r1 = r2.f44591a
            java.lang.annotation.Annotation[] r3 = r2.f44593c
            retrofit2.f r0 = r1.mo74389d(r0, r12, r3)
            sr.r r14 = (p771sr.C20195r) r14
            retrofit2.r$h r3 = new retrofit2.r$h
            java.lang.reflect.Method r1 = r2.f44592b
            java.lang.String r4 = r14.encoding()
            r3.<init>(r1, r5, r0, r4)
            goto L_0x0968
        L_0x0885:
            java.lang.reflect.Method r0 = r2.f44592b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead."
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r0, r5, r2, r1)
            throw r0
        L_0x0891:
            r0 = 0
            java.lang.reflect.Method r2 = r2.f44592b
            java.lang.String r3 = "@PartMap keys must be of type String: "
            java.lang.String r1 = android.support.p013v4.media.C0073e.m207g(r3, r1)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r2, r5, r1, r0)
            throw r0
        L_0x08a1:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f44592b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r1, r5, r7, r0)
            throw r0
        L_0x08ab:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f44592b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@PartMap parameter type must be Map."
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r1, r5, r2, r0)
            throw r0
        L_0x08b7:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f44592b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@PartMap parameters can only be used with multipart encoding."
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r1, r5, r2, r0)
            throw r0
        L_0x08c3:
            boolean r0 = r14 instanceof p771sr.C20178a
            if (r0 == 0) goto L_0x0912
            r2.mo74383c(r5, r11)
            boolean r0 = r2.f44606p
            if (r0 != 0) goto L_0x0906
            boolean r0 = r2.f44607q
            if (r0 != 0) goto L_0x0906
            boolean r0 = r2.f44598h
            if (r0 != 0) goto L_0x08fa
            retrofit2.w r0 = r2.f44591a     // Catch:{ RuntimeException -> 0x08ea }
            java.lang.annotation.Annotation[] r1 = r2.f44593c     // Catch:{ RuntimeException -> 0x08ea }
            retrofit2.f r0 = r0.mo74389d(r11, r12, r1)     // Catch:{ RuntimeException -> 0x08ea }
            r1 = 1
            r2.f44598h = r1
            retrofit2.r$a r3 = new retrofit2.r$a
            java.lang.reflect.Method r1 = r2.f44592b
            r3.<init>(r1, r5, r0)
            goto L_0x0968
        L_0x08ea:
            r0 = move-exception
            java.lang.reflect.Method r1 = r2.f44592b
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r11
            java.lang.String r3 = "Unable to create @Body converter for %s"
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34349l(r1, r0, r5, r3, r2)
            throw r0
        L_0x08fa:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f44592b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "Multiple @Body method annotations found."
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r1, r5, r2, r0)
            throw r0
        L_0x0906:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f44592b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@Body parameters cannot be used with form or multi-part encoding."
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r1, r5, r2, r0)
            throw r0
        L_0x0912:
            boolean r0 = r14 instanceof p771sr.C20201x
            if (r0 == 0) goto L_0x0967
            r2.mo74383c(r5, r11)
            java.lang.Class r0 = retrofit2.C20085a0.m34343f(r11)
            int r1 = r5 + -1
        L_0x091f:
            if (r1 < 0) goto L_0x0961
            retrofit2.r<?>[] r3 = r2.f44612v
            r3 = r3[r1]
            boolean r4 = r3 instanceof retrofit2.C20122r.C20137o
            if (r4 == 0) goto L_0x095e
            retrofit2.r$o r3 = (retrofit2.C20122r.C20137o) r3
            java.lang.Class<T> r3 = r3.f44558a
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0934
            goto L_0x095e
        L_0x0934:
            java.lang.reflect.Method r2 = r2.f44592b
            java.lang.String r3 = "@Tag type "
            java.lang.StringBuilder r3 = android.support.p013v4.media.C0072d.m201h(r3)
            java.lang.String r0 = r0.getName()
            r3.append(r0)
            java.lang.String r0 = " is duplicate of parameter #"
            r3.append(r0)
            int r1 = r1 + 1
            r3.append(r1)
            java.lang.String r0 = " and would always overwrite its value."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r2, r5, r0, r1)
            throw r0
        L_0x095e:
            int r1 = r1 + -1
            goto L_0x091f
        L_0x0961:
            retrofit2.r$o r3 = new retrofit2.r$o
            r3.<init>(r0)
            goto L_0x0968
        L_0x0967:
            r3 = 0
        L_0x0968:
            if (r3 != 0) goto L_0x096b
            goto L_0x096e
        L_0x096b:
            if (r8 != 0) goto L_0x0980
            r8 = r3
        L_0x096e:
            int r6 = r6 + 1
            r0 = r22
            r1 = r23
            r3 = r16
            r4 = r17
            r13 = r18
            r7 = r19
            r10 = r20
            goto L_0x0193
        L_0x0980:
            java.lang.reflect.Method r0 = r2.f44592b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Multiple Retrofit annotations found, only one allowed."
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r0, r5, r2, r1)
            throw r0
        L_0x098c:
            r16 = r3
            r17 = r4
            r19 = r7
            r20 = r10
            goto L_0x099e
        L_0x0995:
            r16 = r3
            r17 = r4
            r19 = r7
            r20 = r10
            r8 = 0
        L_0x099e:
            if (r8 != 0) goto L_0x09bb
            if (r9 == 0) goto L_0x09af
            java.lang.Class r0 = retrofit2.C20085a0.m34343f(r11)     // Catch:{ NoClassDefFoundError -> 0x09af }
            java.lang.Class<kotlin.coroutines.c> r1 = kotlin.coroutines.C19340c.class
            if (r0 != r1) goto L_0x09af
            r0 = 1
            r2.f44613w = r0     // Catch:{ NoClassDefFoundError -> 0x09af }
            r8 = 0
            goto L_0x09bb
        L_0x09af:
            java.lang.reflect.Method r0 = r2.f44592b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "No Retrofit annotation found."
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34348k(r0, r5, r2, r1)
            throw r0
        L_0x09bb:
            r20[r5] = r8
            int r5 = r5 + 1
            r6 = 0
            r8 = 0
            r9 = 1
            r0 = r22
            r1 = r23
            r3 = r16
            r4 = r17
            r7 = r19
            goto L_0x0180
        L_0x09ce:
            r19 = r7
            java.lang.String r0 = r2.f44608r
            if (r0 != 0) goto L_0x09eb
            boolean r0 = r2.f44603m
            if (r0 == 0) goto L_0x09d9
            goto L_0x09eb
        L_0x09d9:
            java.lang.reflect.Method r0 = r2.f44592b
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.f44604n
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "Missing either @%s URL or @Url parameter."
            r3 = 0
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34347j(r0, r3, r2, r1)
            throw r0
        L_0x09eb:
            boolean r0 = r2.f44606p
            if (r0 != 0) goto L_0x0a09
            boolean r1 = r2.f44607q
            if (r1 != 0) goto L_0x0a09
            boolean r1 = r2.f44605o
            if (r1 != 0) goto L_0x0a09
            boolean r1 = r2.f44598h
            if (r1 != 0) goto L_0x09fc
            goto L_0x0a09
        L_0x09fc:
            java.lang.reflect.Method r0 = r2.f44592b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Non-body HTTP method cannot contain @Body."
            r3 = 0
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34347j(r0, r3, r2, r1)
            throw r0
        L_0x0a09:
            if (r0 == 0) goto L_0x0a1d
            boolean r0 = r2.f44596f
            if (r0 == 0) goto L_0x0a10
            goto L_0x0a1d
        L_0x0a10:
            java.lang.reflect.Method r0 = r2.f44592b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Form-encoded method must contain at least one @Field."
            r3 = 0
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34347j(r0, r3, r2, r1)
            throw r0
        L_0x0a1d:
            r0 = 0
            r1 = 0
            boolean r3 = r2.f44607q
            if (r3 == 0) goto L_0x0a33
            boolean r3 = r2.f44597g
            if (r3 == 0) goto L_0x0a28
            goto L_0x0a33
        L_0x0a28:
            java.lang.reflect.Method r2 = r2.f44592b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = "Multipart method must contain at least one @Part."
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34347j(r2, r1, r3, r0)
            throw r0
        L_0x0a33:
            retrofit2.u r0 = new retrofit2.u
            r0.<init>(r2)
            java.lang.reflect.Type r1 = r23.getGenericReturnType()
            boolean r2 = retrofit2.C20085a0.m34345h(r1)
            if (r2 != 0) goto L_0x0b5b
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r1 == r2) goto L_0x0b4e
            java.lang.Class<retrofit2.v> r1 = retrofit2.C20145v.class
            boolean r2 = r0.f44588k
            java.lang.annotation.Annotation[] r3 = r23.getAnnotations()
            if (r2 == 0) goto L_0x0aa5
            java.lang.reflect.Type[] r4 = r23.getGenericParameterTypes()
            int r5 = r4.length
            int r5 = r5 + -1
            r4 = r4[r5]
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type[] r4 = r4.getActualTypeArguments()
            r5 = 0
            r4 = r4[r5]
            boolean r6 = r4 instanceof java.lang.reflect.WildcardType
            if (r6 == 0) goto L_0x0a6e
            java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
            java.lang.reflect.Type[] r4 = r4.getLowerBounds()
            r4 = r4[r5]
        L_0x0a6e:
            java.lang.Class r6 = retrofit2.C20085a0.m34343f(r4)
            if (r6 != r1) goto L_0x0a80
            boolean r6 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r6 == 0) goto L_0x0a80
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type r4 = retrofit2.C20085a0.m34342e(r5, r4)
            r6 = 1
            goto L_0x0a81
        L_0x0a80:
            r6 = r5
        L_0x0a81:
            retrofit2.a0$b r7 = new retrofit2.a0$b
            java.lang.Class<retrofit2.b> r8 = retrofit2.C20089b.class
            r9 = 1
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r9]
            r10[r5] = r4
            r4 = 0
            r7.<init>(r4, r8, r10)
            java.lang.Class<retrofit2.y> r4 = retrofit2.C20150y.class
            boolean r4 = retrofit2.C20085a0.m34346i(r3, r4)
            if (r4 == 0) goto L_0x0a97
            goto L_0x0aaa
        L_0x0a97:
            int r4 = r3.length
            int r4 = r4 + r9
            java.lang.annotation.Annotation[] r4 = new java.lang.annotation.Annotation[r4]
            retrofit2.z r8 = retrofit2.C20151z.f44632a
            r4[r5] = r8
            int r8 = r3.length
            java.lang.System.arraycopy(r3, r5, r4, r9, r8)
            r3 = r4
            goto L_0x0aaa
        L_0x0aa5:
            java.lang.reflect.Type r7 = r23.getGenericReturnType()
            r6 = 0
        L_0x0aaa:
            r4 = r22
            retrofit2.c r3 = r4.mo74386a(r7, r3)     // Catch:{ RuntimeException -> 0x0b3d }
            java.lang.reflect.Type r5 = r3.mo74330a()
            java.lang.Class<okhttp3.z> r7 = okhttp3.C20018z.class
            if (r5 == r7) goto L_0x0b18
            if (r5 == r1) goto L_0x0b0b
            java.lang.String r1 = r0.f44580c
            r7 = r19
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0ada
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0acd
            goto L_0x0ada
        L_0x0acd:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "HEAD method must use Void as response type."
            r2 = 0
            r8 = r23
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34347j(r8, r2, r1, r0)
            throw r0
        L_0x0ada:
            r8 = r23
            java.lang.annotation.Annotation[] r1 = r23.getAnnotations()
            retrofit2.f r1 = r4.mo74390e(r5, r1)     // Catch:{ RuntimeException -> 0x0afc }
            okhttp3.e$a r4 = r4.f44618b
            if (r2 != 0) goto L_0x0aee
            retrofit2.i$a r2 = new retrofit2.i$a
            r2.<init>(r0, r4, r1, r3)
            goto L_0x0afb
        L_0x0aee:
            if (r6 == 0) goto L_0x0af6
            retrofit2.i$c r2 = new retrofit2.i$c
            r2.<init>(r0, r4, r1, r3)
            goto L_0x0afb
        L_0x0af6:
            retrofit2.i$b r2 = new retrofit2.i$b
            r2.<init>(r0, r4, r1, r3)
        L_0x0afb:
            return r2
        L_0x0afc:
            r0 = move-exception
            r1 = r0
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r5
            java.lang.String r2 = "Unable to create converter for %s"
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34347j(r8, r1, r2, r0)
            throw r0
        L_0x0b0b:
            r8 = r23
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Response must include generic type (e.g., Response<String>)"
            r2 = 0
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34347j(r8, r2, r1, r0)
            throw r0
        L_0x0b18:
            r8 = r23
            java.lang.String r0 = "'"
            java.lang.StringBuilder r0 = android.support.p013v4.media.C0072d.m201h(r0)
            java.lang.Class r1 = retrofit2.C20085a0.m34343f(r5)
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "' is not a valid response body type. Did you mean ResponseBody?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34347j(r8, r2, r0, r1)
            throw r0
        L_0x0b3d:
            r0 = move-exception
            r8 = r23
            r1 = r0
            r0 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r7
            java.lang.String r0 = "Unable to create call adapter for %s"
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34347j(r8, r1, r0, r2)
            throw r0
        L_0x0b4e:
            r8 = r23
            r0 = 0
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "Service methods cannot return void."
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34347j(r8, r1, r2, r0)
            throw r0
        L_0x0b5b:
            r8 = r23
            r0 = 1
            r2 = 0
            r3 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r1
            java.lang.String r1 = "Method return type must not include a type variable or wildcard: %s"
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34347j(r8, r3, r1, r0)
            throw r0
        L_0x0b6b:
            java.lang.reflect.Method r0 = r2.f44592b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "HTTP method annotation is required (e.g., @GET, @POST, etc.)."
            java.lang.IllegalArgumentException r0 = retrofit2.C20085a0.m34347j(r0, r8, r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.C20149x.m34449b(retrofit2.w, java.lang.reflect.Method):retrofit2.i");
    }

    /* renamed from: a */
    public abstract T mo74369a(Object[] objArr);
}
