package p687uj;

import android.support.p013v4.media.C0072d;
import com.google.android.gms.internal.firebase_messaging.zzr;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import com.google.firebase.encoders.EncodingException;
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

/* renamed from: uj.n */
public final class C18598n implements C18538e {

    /* renamed from: f */
    public static final Charset f41067f = Charset.forName("UTF-8");

    /* renamed from: g */
    public static final C18536c f41068g;

    /* renamed from: h */
    public static final C18536c f41069h;

    /* renamed from: i */
    public static final C18597m f41070i = C18597m.f41066a;

    /* renamed from: a */
    public OutputStream f41071a;

    /* renamed from: b */
    public final Map<Class<?>, C18537d<?>> f41072b;

    /* renamed from: c */
    public final Map<Class<?>, C18539f<?>> f41073c;

    /* renamed from: d */
    public final C18537d<Object> f41074d;

    /* renamed from: e */
    public final C18601q f41075e = new C18601q(this);

    static {
        zzr zzr = zzr.DEFAULT;
        C18593i iVar = new C18593i(1, zzr);
        HashMap hashMap = new HashMap();
        hashMap.put(C18596l.class, iVar);
        f41068g = new C18536c("key", C0072d.m202i(hashMap));
        C18593i iVar2 = new C18593i(2, zzr);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(C18596l.class, iVar2);
        f41069h = new C18536c("value", C0072d.m202i(hashMap2));
    }

    public C18598n(ByteArrayOutputStream byteArrayOutputStream, Map map, Map map2, C18537d dVar) {
        this.f41071a = byteArrayOutputStream;
        this.f41072b = map;
        this.f41073c = map2;
        this.f41074d = dVar;
    }

    /* renamed from: g */
    public static int m31354g(C18536c cVar) {
        C18596l lVar = (C18596l) ((Annotation) cVar.f40806b.get(C18596l.class));
        if (lVar != null) {
            return ((C18593i) lVar).f41063a;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: a */
    public final C18538e mo59028a(C18536c cVar, Object obj) throws IOException {
        mo70105b(cVar, obj, true);
        return this;
    }

    /* renamed from: b */
    public final void mo70105b(C18536c cVar, Object obj, boolean z) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z || charSequence.length() != 0) {
                    mo70109i((m31354g(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f41067f);
                    mo70109i(bytes.length);
                    this.f41071a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object b : (Collection) obj) {
                    mo70105b(cVar, b, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry h : ((Map) obj).entrySet()) {
                    mo70108h(f41070i, cVar, h, false);
                }
            } else if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (!z || doubleValue != ShadowDrawableWrapper.COS_45) {
                    mo70109i((m31354g(cVar) << 3) | 1);
                    this.f41071a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
                }
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z || floatValue != 0.0f) {
                    mo70109i((m31354g(cVar) << 3) | 5);
                    this.f41071a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                mo70107f(cVar, ((Number) obj).longValue(), z);
            } else if (obj instanceof Boolean) {
                mo70106e(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (!z || bArr.length != 0) {
                    mo70109i((m31354g(cVar) << 3) | 2);
                    mo70109i(bArr.length);
                    this.f41071a.write(bArr);
                }
            } else {
                C18537d dVar = this.f41072b.get(obj.getClass());
                if (dVar != null) {
                    mo70108h(dVar, cVar, obj, z);
                    return;
                }
                C18539f fVar = this.f41073c.get(obj.getClass());
                if (fVar != null) {
                    C18601q qVar = this.f41075e;
                    qVar.f41080a = false;
                    qVar.f41082c = cVar;
                    qVar.f41081b = z;
                    fVar.mo18639a(obj, qVar);
                } else if (obj instanceof C18595k) {
                    mo70106e(cVar, ((C18595k) obj).getNumber(), true);
                } else if (obj instanceof Enum) {
                    mo70106e(cVar, ((Enum) obj).ordinal(), true);
                } else {
                    mo70108h(this.f41074d, cVar, obj, z);
                }
            }
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C18538e mo59030c(C18536c cVar, long j) throws IOException {
        mo70107f(cVar, j, true);
        return this;
    }

    /* renamed from: d */
    public final /* synthetic */ C18538e mo59031d(C18536c cVar, int i) throws IOException {
        mo70106e(cVar, i, true);
        return this;
    }

    /* renamed from: e */
    public final void mo70106e(C18536c cVar, int i, boolean z) throws IOException {
        if (!z || i != 0) {
            C18596l lVar = (C18596l) ((Annotation) cVar.f40806b.get(C18596l.class));
            if (lVar != null) {
                zzr zzr = zzr.DEFAULT;
                C18593i iVar = (C18593i) lVar;
                int ordinal = iVar.f41064b.ordinal();
                if (ordinal == 0) {
                    mo70109i(iVar.f41063a << 3);
                    mo70109i(i);
                } else if (ordinal == 1) {
                    mo70109i(iVar.f41063a << 3);
                    mo70109i((i + i) ^ (i >> 31));
                } else if (ordinal == 2) {
                    mo70109i((iVar.f41063a << 3) | 5);
                    this.f41071a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
                }
            } else {
                throw new EncodingException("Field has no @Protobuf config");
            }
        }
    }

    /* renamed from: f */
    public final void mo70107f(C18536c cVar, long j, boolean z) throws IOException {
        if (!z || j != 0) {
            C18596l lVar = (C18596l) ((Annotation) cVar.f40806b.get(C18596l.class));
            if (lVar != null) {
                zzr zzr = zzr.DEFAULT;
                C18593i iVar = (C18593i) lVar;
                int ordinal = iVar.f41064b.ordinal();
                if (ordinal == 0) {
                    mo70109i(iVar.f41063a << 3);
                    mo70110j(j);
                } else if (ordinal == 1) {
                    mo70109i(iVar.f41063a << 3);
                    mo70110j((j >> 63) ^ (j + j));
                } else if (ordinal == 2) {
                    mo70109i((iVar.f41063a << 3) | 1);
                    this.f41071a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
                }
            } else {
                throw new EncodingException("Field has no @Protobuf config");
            }
        }
    }

    /* renamed from: h */
    public final void mo70108h(C18537d dVar, C18536c cVar, Object obj, boolean z) throws IOException {
        OutputStream outputStream;
        C18594j jVar = new C18594j();
        try {
            outputStream = this.f41071a;
            this.f41071a = jVar;
            dVar.mo18639a(obj, this);
            this.f41071a = outputStream;
            long j = jVar.f41065b;
            jVar.close();
            if (!z || j != 0) {
                mo70109i((m31354g(cVar) << 3) | 2);
                mo70110j(j);
                dVar.mo18639a(obj, this);
            }
        } catch (Throwable th) {
            try {
                jVar.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* renamed from: i */
    public final void mo70109i(int i) throws IOException {
        while (((long) (i & -128)) != 0) {
            this.f41071a.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f41071a.write(i & 127);
    }

    /* renamed from: j */
    public final void mo70110j(long j) throws IOException {
        while ((-128 & j) != 0) {
            this.f41071a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f41071a.write(((int) j) & 127);
    }
}
