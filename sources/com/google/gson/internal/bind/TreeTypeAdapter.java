package com.google.gson.internal.bind;

import com.google.gson.C16708i;
import com.google.gson.C16799m;
import com.google.gson.C16804r;
import com.google.gson.C16807t;
import com.google.gson.C16808u;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import p675sn.C18541a;

public final class TreeTypeAdapter<T> extends C16807t<T> {

    /* renamed from: a */
    public final C16804r<T> f37026a;

    /* renamed from: b */
    public final C16799m<T> f37027b;

    /* renamed from: c */
    public final C16708i f37028c;

    /* renamed from: d */
    public final C18541a<T> f37029d;

    /* renamed from: e */
    public final C16808u f37030e;

    /* renamed from: f */
    public C16807t<T> f37031f;

    public static final class SingleTypeFactory implements C16808u {

        /* renamed from: b */
        public final C18541a<?> f37032b;

        /* renamed from: c */
        public final boolean f37033c;

        /* renamed from: d */
        public final Class<?> f37034d;

        /* renamed from: e */
        public final C16804r<?> f37035e;

        /* renamed from: f */
        public final C16799m<?> f37036f;

        public SingleTypeFactory(C16799m mVar, C18541a aVar, boolean z) {
            this.f37035e = mVar instanceof C16804r ? (C16804r) mVar : null;
            this.f37036f = mVar;
            this.f37032b = aVar;
            this.f37033c = z;
            this.f37034d = null;
        }

        /* renamed from: a */
        public final <T> C16807t<T> mo59482a(C16708i iVar, C18541a<T> aVar) {
            C18541a<?> aVar2 = this.f37032b;
            if (aVar2 != null ? aVar2.equals(aVar) || (this.f37033c && this.f37032b.getType() == aVar.getRawType()) : this.f37034d.isAssignableFrom(aVar.getRawType())) {
                return new TreeTypeAdapter(this.f37035e, this.f37036f, iVar, aVar, this);
            }
            return null;
        }
    }

    /* renamed from: com.google.gson.internal.bind.TreeTypeAdapter$a */
    public final class C16740a {
    }

    public TreeTypeAdapter(C16804r<T> rVar, C16799m<T> mVar, C16708i iVar, C18541a<T> aVar, C16808u uVar) {
        new C16740a();
        this.f37026a = rVar;
        this.f37027b = mVar;
        this.f37028c = iVar;
        this.f37029d = aVar;
        this.f37030e = uVar;
    }

    /* renamed from: c */
    public static C16808u m27757c(C18541a aVar, C16799m mVar) {
        return new SingleTypeFactory(mVar, aVar, aVar.getType() == aVar.getRawType());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        throw new com.google.gson.JsonIOException((java.lang.Throwable) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0043, code lost:
        r4 = com.google.gson.C16801o.f37122b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005f, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r4);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002a A[ExcHandler: NumberFormatException (r4v9 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:7:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031 A[ExcHandler: IOException (r4v8 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:7:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0038 A[ExcHandler: MalformedJsonException (r4v7 'e' com.google.gson.stream.MalformedJsonException A[CUSTOM_DECLARE]), Splitter:B:7:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo59449a(com.google.gson.stream.JsonReader r4) throws java.io.IOException {
        /*
            r3 = this;
            com.google.gson.m<T> r0 = r3.f37027b
            if (r0 != 0) goto L_0x001a
            com.google.gson.t<T> r0 = r3.f37031f
            if (r0 == 0) goto L_0x0009
            goto L_0x0015
        L_0x0009:
            com.google.gson.i r0 = r3.f37028c
            com.google.gson.u r1 = r3.f37030e
            sn.a<T> r2 = r3.f37029d
            com.google.gson.t r0 = r0.mo59461h(r1, r2)
            r3.f37031f = r0
        L_0x0015:
            java.lang.Object r4 = r0.mo59449a(r4)
            return r4
        L_0x001a:
            r4.peek()     // Catch:{ EOFException -> 0x003f, MalformedJsonException -> 0x0038, IOException -> 0x0031, NumberFormatException -> 0x002a }
            r0 = 0
            com.google.gson.internal.bind.TypeAdapters$t r1 = com.google.gson.internal.bind.TypeAdapters.f37037A     // Catch:{ EOFException -> 0x0028, MalformedJsonException -> 0x0038, IOException -> 0x0031, NumberFormatException -> 0x002a }
            r1.getClass()     // Catch:{ EOFException -> 0x0028, MalformedJsonException -> 0x0038, IOException -> 0x0031, NumberFormatException -> 0x002a }
            com.google.gson.n r4 = com.google.gson.internal.bind.TypeAdapters.C16773t.m27821c(r4)     // Catch:{ EOFException -> 0x0028, MalformedJsonException -> 0x0038, IOException -> 0x0031, NumberFormatException -> 0x002a }
            goto L_0x0045
        L_0x0028:
            r4 = move-exception
            goto L_0x0041
        L_0x002a:
            r4 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>((java.lang.Throwable) r4)
            throw r0
        L_0x0031:
            r4 = move-exception
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException
            r0.<init>((java.lang.Throwable) r4)
            throw r0
        L_0x0038:
            r4 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>((java.lang.Throwable) r4)
            throw r0
        L_0x003f:
            r4 = move-exception
            r0 = 1
        L_0x0041:
            if (r0 == 0) goto L_0x005a
            com.google.gson.o r4 = com.google.gson.C16801o.f37122b
        L_0x0045:
            r4.getClass()
            boolean r0 = r4 instanceof com.google.gson.C16801o
            if (r0 == 0) goto L_0x004e
            r4 = 0
            return r4
        L_0x004e:
            com.google.gson.m<T> r0 = r3.f37027b
            sn.a<T> r1 = r3.f37029d
            r1.getType()
            java.lang.Object r4 = r0.mo59634a(r4)
            return r4
        L_0x005a:
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>((java.lang.Throwable) r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TreeTypeAdapter.mo59449a(com.google.gson.stream.JsonReader):java.lang.Object");
    }

    /* renamed from: b */
    public final void mo59450b(JsonWriter jsonWriter, T t) throws IOException {
        C16804r<T> rVar = this.f37026a;
        if (rVar == null) {
            C16807t<T> tVar = this.f37031f;
            if (tVar == null) {
                tVar = this.f37028c.mo59461h(this.f37030e, this.f37029d);
                this.f37031f = tVar;
            }
            tVar.mo59450b(jsonWriter, t);
        } else if (t == null) {
            jsonWriter.nullValue();
        } else {
            this.f37029d.getType();
            TypeAdapters.f37037A.mo59450b(jsonWriter, rVar.mo59646a());
        }
    }
}
