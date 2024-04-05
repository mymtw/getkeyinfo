package p039c8;

import java.util.ArrayList;
import java.util.List;

/* renamed from: c8.a */
public class C4430a<T> extends C4450f<T> {

    /* renamed from: b */
    public static C4436f f9726b = new C4436f();

    /* renamed from: c */
    public static C4444n f9727c = new C4444n();

    /* renamed from: d */
    public static C4431a f9728d = new C4431a();

    /* renamed from: e */
    public static C4432b f9729e = new C4432b();

    /* renamed from: f */
    public static C4433c f9730f = new C4433c();

    /* renamed from: g */
    public static C4434d f9731g = new C4434d();

    /* renamed from: h */
    public static C4435e f9732h = new C4435e();

    /* renamed from: i */
    public static C4437g f9733i = new C4437g();

    /* renamed from: j */
    public static C4438h f9734j = new C4438h();

    /* renamed from: k */
    public static C4439i f9735k = new C4439i();

    /* renamed from: l */
    public static C4440j f9736l = new C4440j();

    /* renamed from: m */
    public static C4441k f9737m = new C4441k();

    /* renamed from: n */
    public static C4442l f9738n = new C4442l();

    /* renamed from: o */
    public static C4443m f9739o = new C4443m();

    /* renamed from: c8.a$a */
    public class C4431a extends C4430a<byte[]> {
        public C4431a() {
            super((C4449e) null);
        }

        /* renamed from: c */
        public final Object mo14391c(Object obj) {
            List<Number> list = (List) obj;
            byte[] bArr = new byte[list.size()];
            int i = 0;
            for (Number byteValue : list) {
                bArr[i] = byteValue.byteValue();
                i++;
            }
            return bArr;
        }
    }

    /* renamed from: c8.a$b */
    public class C4432b extends C4430a<Byte[]> {
        public C4432b() {
            super((C4449e) null);
        }

        /* renamed from: c */
        public final Object mo14391c(Object obj) {
            List list = (List) obj;
            Byte[] bArr = new Byte[list.size()];
            int i = 0;
            for (Object next : list) {
                if (next != null) {
                    if (next instanceof Byte) {
                        bArr[i] = (Byte) next;
                    } else {
                        bArr[i] = Byte.valueOf(((Number) next).byteValue());
                    }
                    i++;
                }
            }
            return bArr;
        }
    }

    /* renamed from: c8.a$c */
    public class C4433c extends C4430a<char[]> {
        public C4433c() {
            super((C4449e) null);
        }

        /* renamed from: c */
        public final Object mo14391c(Object obj) {
            List<Object> list = (List) obj;
            char[] cArr = new char[list.size()];
            int i = 0;
            for (Object obj2 : list) {
                cArr[i] = obj2.toString().charAt(0);
                i++;
            }
            return cArr;
        }
    }

    /* renamed from: c8.a$d */
    public class C4434d extends C4430a<Character[]> {
        public C4434d() {
            super((C4449e) null);
        }

        /* renamed from: c */
        public final Object mo14391c(Object obj) {
            List list = (List) obj;
            Character[] chArr = new Character[list.size()];
            int i = 0;
            for (Object next : list) {
                if (next != null) {
                    chArr[i] = Character.valueOf(next.toString().charAt(0));
                    i++;
                }
            }
            return chArr;
        }
    }

    /* renamed from: c8.a$e */
    public class C4435e extends C4430a<long[]> {
        public C4435e() {
            super((C4449e) null);
        }

        /* renamed from: c */
        public final Object mo14391c(Object obj) {
            List<Number> list = (List) obj;
            long[] jArr = new long[list.size()];
            int i = 0;
            for (Number intValue : list) {
                jArr[i] = (long) intValue.intValue();
                i++;
            }
            return jArr;
        }
    }

    /* renamed from: c8.a$f */
    public class C4436f extends C4430a<int[]> {
        public C4436f() {
            super((C4449e) null);
        }

        /* renamed from: c */
        public final Object mo14391c(Object obj) {
            List<Number> list = (List) obj;
            int[] iArr = new int[list.size()];
            int i = 0;
            for (Number intValue : list) {
                iArr[i] = intValue.intValue();
                i++;
            }
            return iArr;
        }
    }

    /* renamed from: c8.a$g */
    public class C4437g extends C4430a<Long[]> {
        public C4437g() {
            super((C4449e) null);
        }

        /* renamed from: c */
        public final Object mo14391c(Object obj) {
            List list = (List) obj;
            Long[] lArr = new Long[list.size()];
            int i = 0;
            for (Object next : list) {
                if (next != null) {
                    if (next instanceof Float) {
                        lArr[i] = (Long) next;
                    } else {
                        lArr[i] = Long.valueOf(((Number) next).longValue());
                    }
                    i++;
                }
            }
            return lArr;
        }
    }

    /* renamed from: c8.a$h */
    public class C4438h extends C4430a<float[]> {
        public C4438h() {
            super((C4449e) null);
        }

        /* renamed from: c */
        public final Object mo14391c(Object obj) {
            List<Number> list = (List) obj;
            float[] fArr = new float[list.size()];
            int i = 0;
            for (Number floatValue : list) {
                fArr[i] = floatValue.floatValue();
                i++;
            }
            return fArr;
        }
    }

    /* renamed from: c8.a$i */
    public class C4439i extends C4430a<Float[]> {
        public C4439i() {
            super((C4449e) null);
        }

        /* renamed from: c */
        public final Object mo14391c(Object obj) {
            List list = (List) obj;
            Float[] fArr = new Float[list.size()];
            int i = 0;
            for (Object next : list) {
                if (next != null) {
                    if (next instanceof Float) {
                        fArr[i] = (Float) next;
                    } else {
                        fArr[i] = Float.valueOf(((Number) next).floatValue());
                    }
                    i++;
                }
            }
            return fArr;
        }
    }

    /* renamed from: c8.a$j */
    public class C4440j extends C4430a<double[]> {
        public C4440j() {
            super((C4449e) null);
        }

        /* renamed from: c */
        public final Object mo14391c(Object obj) {
            List<Number> list = (List) obj;
            double[] dArr = new double[list.size()];
            int i = 0;
            for (Number doubleValue : list) {
                dArr[i] = doubleValue.doubleValue();
                i++;
            }
            return dArr;
        }
    }

    /* renamed from: c8.a$k */
    public class C4441k extends C4430a<Double[]> {
        public C4441k() {
            super((C4449e) null);
        }

        /* renamed from: c */
        public final Object mo14391c(Object obj) {
            List list = (List) obj;
            Double[] dArr = new Double[list.size()];
            int i = 0;
            for (Object next : list) {
                if (next != null) {
                    if (next instanceof Double) {
                        dArr[i] = (Double) next;
                    } else {
                        dArr[i] = Double.valueOf(((Number) next).doubleValue());
                    }
                    i++;
                }
            }
            return dArr;
        }
    }

    /* renamed from: c8.a$l */
    public class C4442l extends C4430a<boolean[]> {
        public C4442l() {
            super((C4449e) null);
        }

        /* renamed from: c */
        public final Object mo14391c(Object obj) {
            List<Boolean> list = (List) obj;
            boolean[] zArr = new boolean[list.size()];
            int i = 0;
            for (Boolean booleanValue : list) {
                zArr[i] = booleanValue.booleanValue();
                i++;
            }
            return zArr;
        }
    }

    /* renamed from: c8.a$m */
    public class C4443m extends C4430a<Boolean[]> {
        public C4443m() {
            super((C4449e) null);
        }

        /* renamed from: c */
        public final Object mo14391c(Object obj) {
            List list = (List) obj;
            Boolean[] boolArr = new Boolean[list.size()];
            int i = 0;
            for (Object next : list) {
                if (next != null) {
                    if (next instanceof Boolean) {
                        boolArr[i] = Boolean.valueOf(((Boolean) next).booleanValue());
                    } else if (next instanceof Number) {
                        boolArr[i] = Boolean.valueOf(((Number) next).intValue() != 0);
                    } else {
                        throw new RuntimeException("can not convert " + next + " toBoolean");
                    }
                    i++;
                }
            }
            return boolArr;
        }
    }

    /* renamed from: c8.a$n */
    public class C4444n extends C4430a<Integer[]> {
        public C4444n() {
            super((C4449e) null);
        }

        /* renamed from: c */
        public final Object mo14391c(Object obj) {
            List list = (List) obj;
            Integer[] numArr = new Integer[list.size()];
            int i = 0;
            for (Object next : list) {
                if (next != null) {
                    if (next instanceof Integer) {
                        numArr[i] = (Integer) next;
                    } else {
                        numArr[i] = Integer.valueOf(((Number) next).intValue());
                    }
                    i++;
                }
            }
            return numArr;
        }
    }

    public C4430a(C4449e eVar) {
        super(eVar);
    }

    /* renamed from: b */
    public final Object mo14389b() {
        return new ArrayList();
    }

    /* renamed from: d */
    public final void mo14390d(Object obj, Object obj2) {
        ((List) obj).add(obj2);
    }
}
