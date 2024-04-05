package com.google.firebase.encoders.proto;

import android.support.p013v4.media.C0072d;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import p674sm.C18536c;
import p674sm.C18537d;
import p674sm.C18538e;
import p674sm.C18539f;
import p698vm.C18659a;
import p698vm.C18660b;
import p698vm.C18661c;
import p698vm.C18665f;

/* renamed from: com.google.firebase.encoders.proto.b */
public final class C16548b implements C18538e {

    /* renamed from: f */
    public static final Charset f36723f = Charset.forName("UTF-8");

    /* renamed from: g */
    public static final C18536c f36724g;

    /* renamed from: h */
    public static final C18536c f36725h;

    /* renamed from: i */
    public static final C18661c f36726i = new C18661c();

    /* renamed from: a */
    public OutputStream f36727a;

    /* renamed from: b */
    public final Map<Class<?>, C18537d<?>> f36728b;

    /* renamed from: c */
    public final Map<Class<?>, C18539f<?>> f36729c;

    /* renamed from: d */
    public final C18537d<Object> f36730d;

    /* renamed from: e */
    public final C18665f f36731e = new C18665f(this);

    /* renamed from: com.google.firebase.encoders.proto.b$a */
    public static /* synthetic */ class C16549a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36732a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.google.firebase.encoders.proto.Protobuf$IntEncoding[] r0 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f36732a = r0
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r1 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36732a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r1 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.SIGNED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36732a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r1 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.FIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.encoders.proto.C16548b.C16549a.<clinit>():void");
        }
    }

    static {
        Protobuf.IntEncoding intEncoding = Protobuf.IntEncoding.DEFAULT;
        C16547a aVar = new C16547a(1, intEncoding);
        HashMap hashMap = new HashMap();
        hashMap.put(Protobuf.class, aVar);
        f36724g = new C18536c("key", C0072d.m202i(hashMap));
        C16547a aVar2 = new C16547a(2, intEncoding);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(Protobuf.class, aVar2);
        f36725h = new C18536c("value", C0072d.m202i(hashMap2));
    }

    public C16548b(ByteArrayOutputStream byteArrayOutputStream, Map map, Map map2, C18537d dVar) {
        this.f36727a = byteArrayOutputStream;
        this.f36728b = map;
        this.f36729c = map2;
        this.f36730d = dVar;
    }

    /* renamed from: h */
    public static int m27358h(C18536c cVar) {
        Protobuf protobuf = (Protobuf) ((Annotation) cVar.f40806b.get(Protobuf.class));
        if (protobuf != null) {
            return ((C16547a) protobuf).f36721a;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: a */
    public final C18538e mo59028a(C18536c cVar, Object obj) throws IOException {
        mo59029b(cVar, obj, true);
        return this;
    }

    /* renamed from: b */
    public final C16548b mo59029b(C18536c cVar, Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            mo59035i((m27358h(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f36723f);
            mo59035i(bytes.length);
            this.f36727a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object b : (Collection) obj) {
                mo59029b(cVar, b, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry g : ((Map) obj).entrySet()) {
                mo59034g(f36726i, cVar, g, false);
            }
            return this;
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (!z || doubleValue != ShadowDrawableWrapper.COS_45) {
                mo59035i((m27358h(cVar) << 3) | 1);
                this.f36727a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
            }
            return this;
        } else if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (!z || floatValue != 0.0f) {
                mo59035i((m27358h(cVar) << 3) | 5);
                this.f36727a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            }
            return this;
        } else if (obj instanceof Number) {
            mo59033f(cVar, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            mo59032e(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            mo59035i((m27358h(cVar) << 3) | 2);
            mo59035i(bArr.length);
            this.f36727a.write(bArr);
            return this;
        } else {
            C18537d dVar = this.f36728b.get(obj.getClass());
            if (dVar != null) {
                mo59034g(dVar, cVar, obj, z);
                return this;
            }
            C18539f fVar = this.f36729c.get(obj.getClass());
            if (fVar != null) {
                C18665f fVar2 = this.f36731e;
                fVar2.f41272a = false;
                fVar2.f41274c = cVar;
                fVar2.f41273b = z;
                fVar.mo18639a(obj, fVar2);
                return this;
            } else if (obj instanceof C18660b) {
                mo59032e(cVar, ((C18660b) obj).getNumber(), true);
                return this;
            } else if (obj instanceof Enum) {
                mo59032e(cVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                mo59034g(this.f36730d, cVar, obj, z);
                return this;
            }
        }
    }

    /* renamed from: c */
    public final C18538e mo59030c(C18536c cVar, long j) throws IOException {
        mo59033f(cVar, j, true);
        return this;
    }

    /* renamed from: d */
    public final C18538e mo59031d(C18536c cVar, int i) throws IOException {
        mo59032e(cVar, i, true);
        return this;
    }

    /* renamed from: e */
    public final void mo59032e(C18536c cVar, int i, boolean z) throws IOException {
        if (!z || i != 0) {
            Protobuf protobuf = (Protobuf) ((Annotation) cVar.f40806b.get(Protobuf.class));
            if (protobuf != null) {
                C16547a aVar = (C16547a) protobuf;
                int i2 = C16549a.f36732a[aVar.f36722b.ordinal()];
                if (i2 == 1) {
                    mo59035i(aVar.f36721a << 3);
                    mo59035i(i);
                } else if (i2 == 2) {
                    mo59035i(aVar.f36721a << 3);
                    mo59035i((i << 1) ^ (i >> 31));
                } else if (i2 == 3) {
                    mo59035i((aVar.f36721a << 3) | 5);
                    this.f36727a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
                }
            } else {
                throw new EncodingException("Field has no @Protobuf config");
            }
        }
    }

    /* renamed from: f */
    public final void mo59033f(C18536c cVar, long j, boolean z) throws IOException {
        if (!z || j != 0) {
            Protobuf protobuf = (Protobuf) ((Annotation) cVar.f40806b.get(Protobuf.class));
            if (protobuf != null) {
                C16547a aVar = (C16547a) protobuf;
                int i = C16549a.f36732a[aVar.f36722b.ordinal()];
                if (i == 1) {
                    mo59035i(aVar.f36721a << 3);
                    mo59036j(j);
                } else if (i == 2) {
                    mo59035i(aVar.f36721a << 3);
                    mo59036j((j >> 63) ^ (j << 1));
                } else if (i == 3) {
                    mo59035i((aVar.f36721a << 3) | 1);
                    this.f36727a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
                }
            } else {
                throw new EncodingException("Field has no @Protobuf config");
            }
        }
    }

    /* renamed from: g */
    public final void mo59034g(C18537d dVar, C18536c cVar, Object obj, boolean z) throws IOException {
        OutputStream outputStream;
        C18659a aVar = new C18659a();
        try {
            outputStream = this.f36727a;
            this.f36727a = aVar;
            dVar.mo18639a(obj, this);
            this.f36727a = outputStream;
            long j = aVar.f41267b;
            aVar.close();
            if (!z || j != 0) {
                mo59035i((m27358h(cVar) << 3) | 2);
                mo59036j(j);
                dVar.mo18639a(obj, this);
            }
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: i */
    public final void mo59035i(int i) throws IOException {
        while (((long) (i & -128)) != 0) {
            this.f36727a.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f36727a.write(i & 127);
    }

    /* renamed from: j */
    public final void mo59036j(long j) throws IOException {
        while ((-128 & j) != 0) {
            this.f36727a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f36727a.write(((int) j) & 127);
    }
}
