package androidx.versionedparcelable;

import android.os.IBinder;
import android.os.Parcelable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p010a9.C0048b;
import p193o.C7494b;
import p205p2.C7652b;
import p205p2.C7653c;
import p205p2.C7654d;
import p504ai.C13983i;

public abstract class VersionedParcel {

    /* renamed from: a */
    public final C7494b<String, Method> f7783a;

    /* renamed from: b */
    public final C7494b<String, Method> f7784b;

    /* renamed from: c */
    public final C7494b<String, Class> f7785c;

    public static class ParcelException extends RuntimeException {
        public ParcelException(Throwable th) {
            super(th);
        }
    }

    public VersionedParcel(C7494b<String, Method> bVar, C7494b<String, Method> bVar2, C7494b<String, Class> bVar3) {
        this.f7783a = bVar;
        this.f7784b = bVar2;
        this.f7785c = bVar3;
    }

    /* renamed from: A */
    public abstract void mo12563A(long j);

    /* renamed from: B */
    public abstract void mo12564B(Parcelable parcelable);

    /* renamed from: C */
    public final void mo12565C(Parcelable parcelable, int i) {
        mo12589t(i);
        mo12564B(parcelable);
    }

    /* renamed from: D */
    public abstract void mo12566D(String str);

    /* renamed from: E */
    public final void mo12567E(int i, String str) {
        mo12589t(i);
        mo12566D(str);
    }

    /* renamed from: F */
    public abstract void mo12568F(IBinder iBinder);

    /* renamed from: G */
    public final void mo12569G(C7654d dVar) {
        if (dVar == null) {
            mo12566D((String) null);
            return;
        }
        try {
            mo12566D(mo12571b(dVar.getClass()).getName());
            C7653c a = mo12570a();
            try {
                mo12573d(dVar.getClass()).invoke((Object) null, new Object[]{dVar, a});
                a.mo20062H();
            } catch (IllegalAccessException e) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e2.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(dVar.getClass().getSimpleName() + " does not have a Parcelizer", e5);
        }
    }

    /* renamed from: a */
    public abstract C7653c mo12570a();

    /* renamed from: b */
    public final Class mo12571b(Class<? extends C7654d> cls) throws ClassNotFoundException {
        Class orDefault = this.f7785c.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f7785c.put(cls.getName(), cls2);
        return cls2;
    }

    /* renamed from: c */
    public final Method mo12572c(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Class<VersionedParcel> cls = VersionedParcel.class;
        Method orDefault = this.f7783a.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f7783a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: d */
    public final Method mo12573d(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method orDefault = this.f7784b.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class b = mo12571b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b.getDeclaredMethod("write", new Class[]{cls, VersionedParcel.class});
        this.f7784b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: e */
    public final Object[] mo12574e(int i, Object[] objArr) {
        Serializable serializable;
        if (!mo12578i(i)) {
            return objArr;
        }
        int j = mo12579j();
        if (j < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(j);
        if (j != 0) {
            int j2 = mo12579j();
            if (j < 0) {
                return null;
            }
            if (j2 == 1) {
                while (j > 0) {
                    arrayList.add(mo12587r());
                    j--;
                }
            } else if (j2 == 2) {
                while (j > 0) {
                    arrayList.add(mo12582m());
                    j--;
                }
            } else if (j2 == 3) {
                while (j > 0) {
                    String o = mo12584o();
                    if (o == null) {
                        serializable = null;
                    } else {
                        try {
                            serializable = (Serializable) new C7652b(new ByteArrayInputStream(mo12576g())).readObject();
                        } catch (IOException e) {
                            throw new RuntimeException(C0048b.m163a("VersionedParcelable encountered IOException reading a Serializable object (name = ", o, ")"), e);
                        } catch (ClassNotFoundException e2) {
                            throw new RuntimeException(C0048b.m163a("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = ", o, ")"), e2);
                        }
                    }
                    arrayList.add(serializable);
                    j--;
                }
            } else if (j2 == 4) {
                while (j > 0) {
                    arrayList.add(mo12584o());
                    j--;
                }
            } else if (j2 == 5) {
                while (j > 0) {
                    arrayList.add(mo12586q());
                    j--;
                }
            }
        }
        return arrayList.toArray(objArr);
    }

    /* renamed from: f */
    public abstract boolean mo12575f();

    /* renamed from: g */
    public abstract byte[] mo12576g();

    /* renamed from: h */
    public abstract CharSequence mo12577h();

    /* renamed from: i */
    public abstract boolean mo12578i(int i);

    /* renamed from: j */
    public abstract int mo12579j();

    /* renamed from: k */
    public final int mo12580k(int i, int i2) {
        return !mo12578i(i2) ? i : mo12579j();
    }

    /* renamed from: l */
    public abstract long mo12581l();

    /* renamed from: m */
    public abstract <T extends Parcelable> T mo12582m();

    /* renamed from: n */
    public final <T extends Parcelable> T mo12583n(T t, int i) {
        return !mo12578i(i) ? t : mo12582m();
    }

    /* renamed from: o */
    public abstract String mo12584o();

    /* renamed from: p */
    public final String mo12585p(int i, String str) {
        return !mo12578i(i) ? str : mo12584o();
    }

    /* renamed from: q */
    public abstract IBinder mo12586q();

    /* renamed from: r */
    public final <T extends C7654d> T mo12587r() {
        String o = mo12584o();
        if (o == null) {
            return null;
        }
        C7653c a = mo12570a();
        try {
            return (C7654d) mo12572c(o).invoke((Object) null, new Object[]{a});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: s */
    public final <T extends C7654d> T mo12588s(T t, int i) {
        return !mo12578i(i) ? t : mo12587r();
    }

    /* renamed from: t */
    public abstract void mo12589t(int i);

    /* renamed from: u */
    public final void mo12590u(int i, Object[] objArr) {
        int i2;
        mo12589t(i);
        if (objArr == null) {
            mo12594y(-1);
            return;
        }
        int length = objArr.length;
        mo12594y(length);
        if (length > 0) {
            int i3 = 0;
            Object obj = objArr[0];
            if (obj instanceof String) {
                i2 = 4;
            } else if (obj instanceof Parcelable) {
                i2 = 2;
            } else if (obj instanceof C7654d) {
                i2 = 1;
            } else if (obj instanceof Serializable) {
                i2 = 3;
            } else if (obj instanceof IBinder) {
                i2 = 5;
            } else if (obj instanceof Integer) {
                i2 = 7;
            } else if (obj instanceof Float) {
                i2 = 8;
            } else {
                throw new IllegalArgumentException(C13983i.m21493l(obj, new StringBuilder(), " cannot be VersionedParcelled"));
            }
            mo12594y(i2);
            if (i2 == 1) {
                while (i3 < length) {
                    mo12569G(objArr[i3]);
                    i3++;
                }
            } else if (i2 == 2) {
                while (i3 < length) {
                    mo12564B(objArr[i3]);
                    i3++;
                }
            } else if (i2 == 3) {
                while (i3 < length) {
                    Serializable serializable = objArr[i3];
                    if (serializable == null) {
                        mo12566D((String) null);
                    } else {
                        String name = serializable.getClass().getName();
                        mo12566D(name);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                            objectOutputStream.writeObject(serializable);
                            objectOutputStream.close();
                            mo12592w(byteArrayOutputStream.toByteArray());
                        } catch (IOException e) {
                            throw new RuntimeException(C0048b.m163a("VersionedParcelable encountered IOException writing serializable object (name = ", name, ")"), e);
                        }
                    }
                    i3++;
                }
            } else if (i2 == 4) {
                while (i3 < length) {
                    mo12566D(objArr[i3]);
                    i3++;
                }
            } else if (i2 == 5) {
                while (i3 < length) {
                    mo12568F(objArr[i3]);
                    i3++;
                }
            }
        }
    }

    /* renamed from: v */
    public abstract void mo12591v(boolean z);

    /* renamed from: w */
    public abstract void mo12592w(byte[] bArr);

    /* renamed from: x */
    public abstract void mo12593x(CharSequence charSequence);

    /* renamed from: y */
    public abstract void mo12594y(int i);

    /* renamed from: z */
    public final void mo12595z(int i, int i2) {
        mo12589t(i2);
        mo12594y(i);
    }
}
