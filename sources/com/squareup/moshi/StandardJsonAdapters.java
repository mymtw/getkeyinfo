package com.squareup.moshi;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.fasterxml.jackson.core.JsonFactory;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p618lp.C18215a;

public final class StandardJsonAdapters {

    /* renamed from: a */
    public static final C17375c f37920a = new C17375c();

    /* renamed from: b */
    public static final C17376d f37921b = new C17376d();

    /* renamed from: c */
    public static final C17377e f37922c = new C17377e();

    /* renamed from: d */
    public static final C17378f f37923d = new C17378f();

    /* renamed from: e */
    public static final C17379g f37924e = new C17379g();

    /* renamed from: f */
    public static final C17380h f37925f = new C17380h();

    /* renamed from: g */
    public static final C17381i f37926g = new C17381i();

    /* renamed from: h */
    public static final C17382j f37927h = new C17382j();

    /* renamed from: i */
    public static final C17383k f37928i = new C17383k();

    /* renamed from: j */
    public static final C17373a f37929j = new C17373a();

    public static final class EnumJsonAdapter<T extends Enum<T>> extends JsonAdapter<T> {
        private final T[] constants;
        private final Class<T> enumType;
        private final String[] nameStrings;
        private final JsonReader.C17362b options;

        public EnumJsonAdapter(Class<T> cls) {
            this.enumType = cls;
            try {
                T[] tArr = (Enum[]) cls.getEnumConstants();
                this.constants = tArr;
                this.nameStrings = new String[tArr.length];
                int i = 0;
                while (true) {
                    T[] tArr2 = this.constants;
                    if (i < tArr2.length) {
                        String name = tArr2[i].name();
                        String[] strArr = this.nameStrings;
                        Field field = cls.getField(name);
                        Set<Annotation> set = C18215a.f39926a;
                        C17402n nVar = (C17402n) field.getAnnotation(C17402n.class);
                        if (nVar != null) {
                            String name2 = nVar.name();
                            if (!"\u0000".equals(name2)) {
                                name = name2;
                            }
                        }
                        strArr[i] = name;
                        i++;
                    } else {
                        this.options = JsonReader.C17362b.m29110a(this.nameStrings);
                        return;
                    }
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(C0326j.m862g(cls, C0072d.m201h("Missing field in ")), e);
            }
        }

        public final Object fromJson(JsonReader jsonReader) throws IOException {
            int R = jsonReader.mo68407R(this.options);
            if (R != -1) {
                return this.constants[R];
            }
            String path = jsonReader.getPath();
            String t = jsonReader.mo68425t();
            StringBuilder h = C0072d.m201h("Expected one of ");
            h.append(Arrays.asList(this.nameStrings));
            h.append(" but was ");
            h.append(t);
            h.append(" at path ");
            h.append(path);
            throw new JsonDataException(h.toString());
        }

        public final void toJson(C17412w wVar, Object obj) throws IOException {
            wVar.mo68535x(this.nameStrings[((Enum) obj).ordinal()]);
        }

        public final String toString() {
            return C0326j.m863h(this.enumType, C0072d.m201h("JsonAdapter("), ")");
        }
    }

    public static final class ObjectJsonAdapter extends JsonAdapter<Object> {
        private final JsonAdapter<Boolean> booleanAdapter;
        private final JsonAdapter<Double> doubleAdapter;
        private final JsonAdapter<List> listJsonAdapter;
        private final JsonAdapter<Map> mapAdapter;
        private final C17414y moshi;
        private final JsonAdapter<String> stringAdapter;

        public ObjectJsonAdapter(C17414y yVar) {
            this.moshi = yVar;
            this.listJsonAdapter = yVar.mo68556a(List.class);
            this.mapAdapter = yVar.mo68556a(Map.class);
            this.stringAdapter = yVar.mo68556a(String.class);
            this.doubleAdapter = yVar.mo68556a(Double.class);
            this.booleanAdapter = yVar.mo68556a(Boolean.class);
        }

        public final Object fromJson(JsonReader jsonReader) throws IOException {
            switch (C17374b.f37930a[jsonReader.mo68426u().ordinal()]) {
                case 1:
                    return this.listJsonAdapter.fromJson(jsonReader);
                case 2:
                    return this.mapAdapter.fromJson(jsonReader);
                case 3:
                    return this.stringAdapter.fromJson(jsonReader);
                case 4:
                    return this.doubleAdapter.fromJson(jsonReader);
                case 5:
                    return this.booleanAdapter.fromJson(jsonReader);
                case 6:
                    jsonReader.mo68423n();
                    return null;
                default:
                    StringBuilder h = C0072d.m201h("Expected a value but was ");
                    h.append(jsonReader.mo68426u());
                    h.append(" at path ");
                    h.append(jsonReader.getPath());
                    throw new IllegalStateException(h.toString());
            }
        }

        public final void toJson(C17412w wVar, Object obj) throws IOException {
            Class cls = obj.getClass();
            if (cls == Object.class) {
                wVar.mo68522b();
                wVar.mo68526f();
                return;
            }
            C17414y yVar = this.moshi;
            if (Map.class.isAssignableFrom(cls)) {
                cls = Map.class;
            } else if (Collection.class.isAssignableFrom(cls)) {
                cls = Collection.class;
            }
            yVar.mo68558c(cls, C18215a.f39926a, (String) null).toJson(wVar, obj);
        }

        public final String toString() {
            return "JsonAdapter(Object)";
        }
    }

    /* renamed from: com.squareup.moshi.StandardJsonAdapters$a */
    public class C17373a extends JsonAdapter<String> {
        public final Object fromJson(JsonReader jsonReader) throws IOException {
            return jsonReader.mo68425t();
        }

        public final void toJson(C17412w wVar, Object obj) throws IOException {
            wVar.mo68535x((String) obj);
        }

        public final String toString() {
            return "JsonAdapter(String)";
        }
    }

    /* renamed from: com.squareup.moshi.StandardJsonAdapters$b */
    public static /* synthetic */ class C17374b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37930a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.squareup.moshi.JsonReader$Token[] r0 = com.squareup.moshi.JsonReader.Token.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f37930a = r0
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f37930a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f37930a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f37930a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f37930a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f37930a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.StandardJsonAdapters.C17374b.<clinit>():void");
        }
    }

    /* renamed from: com.squareup.moshi.StandardJsonAdapters$c */
    public class C17375c implements JsonAdapter.C17360e {
        /* JADX WARNING: Code restructure failed: missing block: B:100:0x014a, code lost:
            throw null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x014b, code lost:
            r10 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:0x0157, code lost:
            throw new java.lang.RuntimeException(android.support.p013v4.media.C0073e.m207g("Failed to instantiate the generated JsonAdapter for ", r9), r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x0158, code lost:
            r10 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x0164, code lost:
            throw new java.lang.RuntimeException(android.support.p013v4.media.C0073e.m207g("Failed to access the generated JsonAdapter for ", r9), r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x0165, code lost:
            r10 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x0168, code lost:
            if ((r9 instanceof java.lang.reflect.ParameterizedType) != false) goto L_0x0199;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x0198, code lost:
            throw new java.lang.RuntimeException("Failed to find the generated JsonAdapter constructor for '" + r9 + "'. Suspiciously, the type was not parameterized but the target class '" + r0.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:0x01a4, code lost:
            throw new java.lang.RuntimeException(android.support.p013v4.media.C0073e.m207g("Failed to find the generated JsonAdapter constructor for ", r9), r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:116:0x01a5, code lost:
            r10 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:0x01b1, code lost:
            throw new java.lang.RuntimeException(android.support.p013v4.media.C0073e.m207g("Failed to find the generated JsonAdapter class for ", r9), r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x0143, code lost:
            r10 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x0144, code lost:
            r0 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x0146, code lost:
            r9 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x0147, code lost:
            p618lp.C18215a.m30731j(r9);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x0111 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x012d */
        /* JADX WARNING: Removed duplicated region for block: B:101:0x014b A[ExcHandler: InstantiationException (r10v25 'e' java.lang.InstantiationException A[CUSTOM_DECLARE]), Splitter:B:80:0x00e8] */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x0158 A[ExcHandler: IllegalAccessException (r10v24 'e' java.lang.IllegalAccessException A[CUSTOM_DECLARE]), Splitter:B:80:0x00e8] */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x0171  */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x0199  */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x01a5 A[ExcHandler: ClassNotFoundException (r10v21 'e' java.lang.ClassNotFoundException A[CUSTOM_DECLARE]), Splitter:B:80:0x00e8] */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x0146 A[ExcHandler: InvocationTargetException (r9v14 'e' java.lang.reflect.InvocationTargetException A[CUSTOM_DECLARE]), Splitter:B:80:0x00e8] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:89:0x0111=Splitter:B:89:0x0111, B:93:0x012d=Splitter:B:93:0x012d} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.squareup.moshi.JsonAdapter<?> create(java.lang.reflect.Type r9, java.util.Set<? extends java.lang.annotation.Annotation> r10, com.squareup.moshi.C17414y r11) {
            /*
                r8 = this;
                boolean r10 = r10.isEmpty()
                r0 = 0
                if (r10 != 0) goto L_0x0008
                return r0
            L_0x0008:
                java.lang.Class r10 = java.lang.Boolean.TYPE
                if (r9 != r10) goto L_0x000f
                com.squareup.moshi.StandardJsonAdapters$d r9 = com.squareup.moshi.StandardJsonAdapters.f37921b
                return r9
            L_0x000f:
                java.lang.Class r10 = java.lang.Byte.TYPE
                if (r9 != r10) goto L_0x0016
                com.squareup.moshi.StandardJsonAdapters$e r9 = com.squareup.moshi.StandardJsonAdapters.f37922c
                return r9
            L_0x0016:
                java.lang.Class r10 = java.lang.Character.TYPE
                if (r9 != r10) goto L_0x001d
                com.squareup.moshi.StandardJsonAdapters$f r9 = com.squareup.moshi.StandardJsonAdapters.f37923d
                return r9
            L_0x001d:
                java.lang.Class r10 = java.lang.Double.TYPE
                if (r9 != r10) goto L_0x0024
                com.squareup.moshi.StandardJsonAdapters$g r9 = com.squareup.moshi.StandardJsonAdapters.f37924e
                return r9
            L_0x0024:
                java.lang.Class r10 = java.lang.Float.TYPE
                if (r9 != r10) goto L_0x002b
                com.squareup.moshi.StandardJsonAdapters$h r9 = com.squareup.moshi.StandardJsonAdapters.f37925f
                return r9
            L_0x002b:
                java.lang.Class r10 = java.lang.Integer.TYPE
                if (r9 != r10) goto L_0x0032
                com.squareup.moshi.StandardJsonAdapters$i r9 = com.squareup.moshi.StandardJsonAdapters.f37926g
                return r9
            L_0x0032:
                java.lang.Class r10 = java.lang.Long.TYPE
                if (r9 != r10) goto L_0x0039
                com.squareup.moshi.StandardJsonAdapters$j r9 = com.squareup.moshi.StandardJsonAdapters.f37927h
                return r9
            L_0x0039:
                java.lang.Class r10 = java.lang.Short.TYPE
                if (r9 != r10) goto L_0x0040
                com.squareup.moshi.StandardJsonAdapters$k r9 = com.squareup.moshi.StandardJsonAdapters.f37928i
                return r9
            L_0x0040:
                java.lang.Class<java.lang.Boolean> r10 = java.lang.Boolean.class
                if (r9 != r10) goto L_0x004b
                com.squareup.moshi.StandardJsonAdapters$d r9 = com.squareup.moshi.StandardJsonAdapters.f37921b
                com.squareup.moshi.JsonAdapter r9 = r9.nullSafe()
                return r9
            L_0x004b:
                java.lang.Class<java.lang.Byte> r10 = java.lang.Byte.class
                if (r9 != r10) goto L_0x0056
                com.squareup.moshi.StandardJsonAdapters$e r9 = com.squareup.moshi.StandardJsonAdapters.f37922c
                com.squareup.moshi.JsonAdapter r9 = r9.nullSafe()
                return r9
            L_0x0056:
                java.lang.Class<java.lang.Character> r10 = java.lang.Character.class
                if (r9 != r10) goto L_0x0061
                com.squareup.moshi.StandardJsonAdapters$f r9 = com.squareup.moshi.StandardJsonAdapters.f37923d
                com.squareup.moshi.JsonAdapter r9 = r9.nullSafe()
                return r9
            L_0x0061:
                java.lang.Class<java.lang.Double> r10 = java.lang.Double.class
                if (r9 != r10) goto L_0x006c
                com.squareup.moshi.StandardJsonAdapters$g r9 = com.squareup.moshi.StandardJsonAdapters.f37924e
                com.squareup.moshi.JsonAdapter r9 = r9.nullSafe()
                return r9
            L_0x006c:
                java.lang.Class<java.lang.Float> r10 = java.lang.Float.class
                if (r9 != r10) goto L_0x0077
                com.squareup.moshi.StandardJsonAdapters$h r9 = com.squareup.moshi.StandardJsonAdapters.f37925f
                com.squareup.moshi.JsonAdapter r9 = r9.nullSafe()
                return r9
            L_0x0077:
                java.lang.Class<java.lang.Integer> r10 = java.lang.Integer.class
                if (r9 != r10) goto L_0x0082
                com.squareup.moshi.StandardJsonAdapters$i r9 = com.squareup.moshi.StandardJsonAdapters.f37926g
                com.squareup.moshi.JsonAdapter r9 = r9.nullSafe()
                return r9
            L_0x0082:
                java.lang.Class<java.lang.Long> r10 = java.lang.Long.class
                if (r9 != r10) goto L_0x008d
                com.squareup.moshi.StandardJsonAdapters$j r9 = com.squareup.moshi.StandardJsonAdapters.f37927h
                com.squareup.moshi.JsonAdapter r9 = r9.nullSafe()
                return r9
            L_0x008d:
                java.lang.Class<java.lang.Short> r10 = java.lang.Short.class
                if (r9 != r10) goto L_0x0098
                com.squareup.moshi.StandardJsonAdapters$k r9 = com.squareup.moshi.StandardJsonAdapters.f37928i
                com.squareup.moshi.JsonAdapter r9 = r9.nullSafe()
                return r9
            L_0x0098:
                java.lang.Class<java.lang.String> r10 = java.lang.String.class
                if (r9 != r10) goto L_0x00a3
                com.squareup.moshi.StandardJsonAdapters$a r9 = com.squareup.moshi.StandardJsonAdapters.f37929j
                com.squareup.moshi.JsonAdapter r9 = r9.nullSafe()
                return r9
            L_0x00a3:
                java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
                if (r9 != r10) goto L_0x00b1
                com.squareup.moshi.StandardJsonAdapters$ObjectJsonAdapter r9 = new com.squareup.moshi.StandardJsonAdapters$ObjectJsonAdapter
                r9.<init>(r11)
                com.squareup.moshi.JsonAdapter r9 = r9.nullSafe()
                return r9
            L_0x00b1:
                java.lang.Class r10 = com.squareup.moshi.C17387a0.m29125c(r9)
                java.util.Set<java.lang.annotation.Annotation> r1 = p618lp.C18215a.f39926a
                java.lang.Class<com.squareup.moshi.y> r1 = com.squareup.moshi.C17414y.class
                java.lang.Class<com.squareup.moshi.o> r2 = com.squareup.moshi.C17403o.class
                java.lang.annotation.Annotation r2 = r10.getAnnotation(r2)
                com.squareup.moshi.o r2 = (com.squareup.moshi.C17403o) r2
                if (r2 == 0) goto L_0x01b2
                boolean r2 = r2.generateAdapter()
                if (r2 != 0) goto L_0x00cb
                goto L_0x01b2
            L_0x00cb:
                java.lang.String r2 = r10.getName()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "$"
                java.lang.String r5 = "_"
                java.lang.String r2 = r2.replace(r4, r5)
                r3.append(r2)
                java.lang.String r2 = "JsonAdapter"
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                java.lang.ClassLoader r3 = r10.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x01a5, NoSuchMethodException -> 0x0165, IllegalAccessException -> 0x0158, InstantiationException -> 0x014b, InvocationTargetException -> 0x0146 }
                r4 = 1
                java.lang.Class r2 = java.lang.Class.forName(r2, r4, r3)     // Catch:{ ClassNotFoundException -> 0x01a5, NoSuchMethodException -> 0x0165, IllegalAccessException -> 0x0158, InstantiationException -> 0x014b, InvocationTargetException -> 0x0146 }
                boolean r3 = r9 instanceof java.lang.reflect.ParameterizedType     // Catch:{ ClassNotFoundException -> 0x01a5, NoSuchMethodException -> 0x0143, IllegalAccessException -> 0x0158, InstantiationException -> 0x014b, InvocationTargetException -> 0x0146 }
                r5 = 0
                if (r3 == 0) goto L_0x0120
                r3 = r9
                java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3     // Catch:{ ClassNotFoundException -> 0x01a5, NoSuchMethodException -> 0x0143, IllegalAccessException -> 0x0158, InstantiationException -> 0x014b, InvocationTargetException -> 0x0146 }
                java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()     // Catch:{ ClassNotFoundException -> 0x01a5, NoSuchMethodException -> 0x0143, IllegalAccessException -> 0x0158, InstantiationException -> 0x014b, InvocationTargetException -> 0x0146 }
                r6 = 2
                java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ NoSuchMethodException -> 0x0111, ClassNotFoundException -> 0x01a5, IllegalAccessException -> 0x0158, InstantiationException -> 0x014b, InvocationTargetException -> 0x0146 }
                r7[r5] = r1     // Catch:{ NoSuchMethodException -> 0x0111, ClassNotFoundException -> 0x01a5, IllegalAccessException -> 0x0158, InstantiationException -> 0x014b, InvocationTargetException -> 0x0146 }
                java.lang.Class<java.lang.reflect.Type[]> r1 = java.lang.reflect.Type[].class
                r7[r4] = r1     // Catch:{ NoSuchMethodException -> 0x0111, ClassNotFoundException -> 0x01a5, IllegalAccessException -> 0x0158, InstantiationException -> 0x014b, InvocationTargetException -> 0x0146 }
                java.lang.reflect.Constructor r1 = r2.getDeclaredConstructor(r7)     // Catch:{ NoSuchMethodException -> 0x0111, ClassNotFoundException -> 0x01a5, IllegalAccessException -> 0x0158, InstantiationException -> 0x014b, InvocationTargetException -> 0x0146 }
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ NoSuchMethodException -> 0x0111, ClassNotFoundException -> 0x01a5, IllegalAccessException -> 0x0158, InstantiationException -> 0x014b, InvocationTargetException -> 0x0146 }
                r6[r5] = r11     // Catch:{ NoSuchMethodException -> 0x0111, ClassNotFoundException -> 0x01a5, IllegalAccessException -> 0x0158, InstantiationException -> 0x014b, InvocationTargetException -> 0x0146 }
                r6[r4] = r3     // Catch:{ NoSuchMethodException -> 0x0111, ClassNotFoundException -> 0x01a5, IllegalAccessException -> 0x0158, InstantiationException -> 0x014b, InvocationTargetException -> 0x0146 }
                goto L_0x0135
            L_0x0111:
                java.lang.Class[] r11 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x01a5, NoSuchMethodException -> 0x0143, IllegalAccessException -> 0x0158, InstantiationException -> 0x014b, InvocationTargetException -> 0x0146 }
                java.lang.Class<java.lang.reflect.Type[]> r1 = java.lang.reflect.Type[].class
                r11[r5] = r1     // Catch:{ ClassNotFoundException -> 0x01a5, NoSuchMethodException -> 0x0143, IllegalAccessException -> 0x0158, InstantiationException -> 0x014b, InvocationTargetException -> 0x0146 }
                java.lang.reflect.Constructor r1 = r2.getDeclaredConstructor(r11)     // Catch:{ ClassNotFoundException -> 0x01a5, NoSuchMethodException -> 0x0143, IllegalAccessException -> 0x0158, InstantiationException -> 0x014b, InvocationTargetException -> 0x0146 }
                java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x01a5, NoSuchMethodException -> 0x0143, IllegalAccessException -> 0x0158, InstantiationException -> 0x014b, InvocationTargetException -> 0x0146 }
                r6[r5] = r3     // Catch:{ ClassNotFoundException -> 0x01a5, NoSuchMethodException -> 0x0143, IllegalAccessException -> 0x0158, InstantiationException -> 0x014b, InvocationTargetException -> 0x0146 }
                goto L_0x0135
            L_0x0120:
                java.lang.Class[] r3 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x012d, ClassNotFoundException -> 0x01a5, IllegalAccessException -> 0x0158, InstantiationException -> 0x014b, InvocationTargetException -> 0x0146 }
                r3[r5] = r1     // Catch:{ NoSuchMethodException -> 0x012d, ClassNotFoundException -> 0x01a5, IllegalAccessException -> 0x0158, InstantiationException -> 0x014b, InvocationTargetException -> 0x0146 }
                java.lang.reflect.Constructor r1 = r2.getDeclaredConstructor(r3)     // Catch:{ NoSuchMethodException -> 0x012d, ClassNotFoundException -> 0x01a5, IllegalAccessException -> 0x0158, InstantiationException -> 0x014b, InvocationTargetException -> 0x0146 }
                java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ NoSuchMethodException -> 0x012d, ClassNotFoundException -> 0x01a5, IllegalAccessException -> 0x0158, InstantiationException -> 0x014b, InvocationTargetException -> 0x0146 }
                r6[r5] = r11     // Catch:{ NoSuchMethodException -> 0x012d, ClassNotFoundException -> 0x01a5, IllegalAccessException -> 0x0158, InstantiationException -> 0x014b, InvocationTargetException -> 0x0146 }
                goto L_0x0135
            L_0x012d:
                java.lang.Class[] r11 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x01a5, NoSuchMethodException -> 0x0143, IllegalAccessException -> 0x0158, InstantiationException -> 0x014b, InvocationTargetException -> 0x0146 }
                java.lang.reflect.Constructor r1 = r2.getDeclaredConstructor(r11)     // Catch:{ ClassNotFoundException -> 0x01a5, NoSuchMethodException -> 0x0143, IllegalAccessException -> 0x0158, InstantiationException -> 0x014b, InvocationTargetException -> 0x0146 }
                java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException -> 0x01a5, NoSuchMethodException -> 0x0143, IllegalAccessException -> 0x0158, InstantiationException -> 0x014b, InvocationTargetException -> 0x0146 }
            L_0x0135:
                r1.setAccessible(r4)     // Catch:{ ClassNotFoundException -> 0x01a5, NoSuchMethodException -> 0x0143, IllegalAccessException -> 0x0158, InstantiationException -> 0x014b, InvocationTargetException -> 0x0146 }
                java.lang.Object r11 = r1.newInstance(r6)     // Catch:{ ClassNotFoundException -> 0x01a5, NoSuchMethodException -> 0x0143, IllegalAccessException -> 0x0158, InstantiationException -> 0x014b, InvocationTargetException -> 0x0146 }
                com.squareup.moshi.JsonAdapter r11 = (com.squareup.moshi.JsonAdapter) r11     // Catch:{ ClassNotFoundException -> 0x01a5, NoSuchMethodException -> 0x0143, IllegalAccessException -> 0x0158, InstantiationException -> 0x014b, InvocationTargetException -> 0x0146 }
                com.squareup.moshi.JsonAdapter r9 = r11.nullSafe()     // Catch:{ ClassNotFoundException -> 0x01a5, NoSuchMethodException -> 0x0143, IllegalAccessException -> 0x0158, InstantiationException -> 0x014b, InvocationTargetException -> 0x0146 }
                goto L_0x01b3
            L_0x0143:
                r10 = move-exception
                r0 = r2
                goto L_0x0166
            L_0x0146:
                r9 = move-exception
                p618lp.C18215a.m30731j(r9)
                throw r0
            L_0x014b:
                r10 = move-exception
                java.lang.RuntimeException r11 = new java.lang.RuntimeException
                java.lang.String r0 = "Failed to instantiate the generated JsonAdapter for "
                java.lang.String r9 = android.support.p013v4.media.C0073e.m207g(r0, r9)
                r11.<init>(r9, r10)
                throw r11
            L_0x0158:
                r10 = move-exception
                java.lang.RuntimeException r11 = new java.lang.RuntimeException
                java.lang.String r0 = "Failed to access the generated JsonAdapter for "
                java.lang.String r9 = android.support.p013v4.media.C0073e.m207g(r0, r9)
                r11.<init>(r9, r10)
                throw r11
            L_0x0165:
                r10 = move-exception
            L_0x0166:
                boolean r11 = r9 instanceof java.lang.reflect.ParameterizedType
                if (r11 != 0) goto L_0x0199
                java.lang.reflect.TypeVariable[] r11 = r0.getTypeParameters()
                int r11 = r11.length
                if (r11 == 0) goto L_0x0199
                java.lang.RuntimeException r11 = new java.lang.RuntimeException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Failed to find the generated JsonAdapter constructor for '"
                r1.append(r2)
                r1.append(r9)
                java.lang.String r9 = "'. Suspiciously, the type was not parameterized but the target class '"
                r1.append(r9)
                java.lang.String r9 = r0.getCanonicalName()
                r1.append(r9)
                java.lang.String r9 = "' is generic. Consider using Types#newParameterizedType() to define these missing type variables."
                r1.append(r9)
                java.lang.String r9 = r1.toString()
                r11.<init>(r9, r10)
                throw r11
            L_0x0199:
                java.lang.RuntimeException r11 = new java.lang.RuntimeException
                java.lang.String r0 = "Failed to find the generated JsonAdapter constructor for "
                java.lang.String r9 = android.support.p013v4.media.C0073e.m207g(r0, r9)
                r11.<init>(r9, r10)
                throw r11
            L_0x01a5:
                r10 = move-exception
                java.lang.RuntimeException r11 = new java.lang.RuntimeException
                java.lang.String r0 = "Failed to find the generated JsonAdapter class for "
                java.lang.String r9 = android.support.p013v4.media.C0073e.m207g(r0, r9)
                r11.<init>(r9, r10)
                throw r11
            L_0x01b2:
                r9 = r0
            L_0x01b3:
                if (r9 == 0) goto L_0x01b6
                return r9
            L_0x01b6:
                boolean r9 = r10.isEnum()
                if (r9 == 0) goto L_0x01c6
                com.squareup.moshi.StandardJsonAdapters$EnumJsonAdapter r9 = new com.squareup.moshi.StandardJsonAdapters$EnumJsonAdapter
                r9.<init>(r10)
                com.squareup.moshi.JsonAdapter r9 = r9.nullSafe()
                return r9
            L_0x01c6:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.StandardJsonAdapters.C17375c.create(java.lang.reflect.Type, java.util.Set, com.squareup.moshi.y):com.squareup.moshi.JsonAdapter");
        }
    }

    /* renamed from: com.squareup.moshi.StandardJsonAdapters$d */
    public class C17376d extends JsonAdapter<Boolean> {
        public final Object fromJson(JsonReader jsonReader) throws IOException {
            return Boolean.valueOf(jsonReader.mo68416g());
        }

        public final void toJson(C17412w wVar, Object obj) throws IOException {
            wVar.mo68516B(((Boolean) obj).booleanValue());
        }

        public final String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    /* renamed from: com.squareup.moshi.StandardJsonAdapters$e */
    public class C17377e extends JsonAdapter<Byte> {
        public final Object fromJson(JsonReader jsonReader) throws IOException {
            return Byte.valueOf((byte) StandardJsonAdapters.m29117a(jsonReader, "a byte", -128, 255));
        }

        public final void toJson(C17412w wVar, Object obj) throws IOException {
            wVar.mo68533t((long) (((Byte) obj).intValue() & 255));
        }

        public final String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    /* renamed from: com.squareup.moshi.StandardJsonAdapters$f */
    public class C17378f extends JsonAdapter<Character> {
        public final Object fromJson(JsonReader jsonReader) throws IOException {
            String t = jsonReader.mo68425t();
            if (t.length() <= 1) {
                return Character.valueOf(t.charAt(0));
            }
            throw new JsonDataException(String.format("Expected %s but was %s at path %s", new Object[]{"a char", JsonFactory.DEFAULT_QUOTE_CHAR + t + JsonFactory.DEFAULT_QUOTE_CHAR, jsonReader.getPath()}));
        }

        public final void toJson(C17412w wVar, Object obj) throws IOException {
            wVar.mo68535x(((Character) obj).toString());
        }

        public final String toString() {
            return "JsonAdapter(Character)";
        }
    }

    /* renamed from: com.squareup.moshi.StandardJsonAdapters$g */
    public class C17379g extends JsonAdapter<Double> {
        public final Object fromJson(JsonReader jsonReader) throws IOException {
            return Double.valueOf(jsonReader.mo68418h());
        }

        public final void toJson(C17412w wVar, Object obj) throws IOException {
            wVar.mo68532r(((Double) obj).doubleValue());
        }

        public final String toString() {
            return "JsonAdapter(Double)";
        }
    }

    /* renamed from: com.squareup.moshi.StandardJsonAdapters$h */
    public class C17380h extends JsonAdapter<Float> {
        public final Object fromJson(JsonReader jsonReader) throws IOException {
            float h = (float) jsonReader.mo68418h();
            if (jsonReader.f37895f || !Float.isInfinite(h)) {
                return Float.valueOf(h);
            }
            throw new JsonDataException("JSON forbids NaN and infinities: " + h + " at path " + jsonReader.getPath());
        }

        public final void toJson(C17412w wVar, Object obj) throws IOException {
            Float f = (Float) obj;
            f.getClass();
            wVar.mo68534u(f);
        }

        public final String toString() {
            return "JsonAdapter(Float)";
        }
    }

    /* renamed from: com.squareup.moshi.StandardJsonAdapters$i */
    public class C17381i extends JsonAdapter<Integer> {
        public final Object fromJson(JsonReader jsonReader) throws IOException {
            return Integer.valueOf(jsonReader.mo68419i());
        }

        public final void toJson(C17412w wVar, Object obj) throws IOException {
            wVar.mo68533t((long) ((Integer) obj).intValue());
        }

        public final String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    /* renamed from: com.squareup.moshi.StandardJsonAdapters$j */
    public class C17382j extends JsonAdapter<Long> {
        public final Object fromJson(JsonReader jsonReader) throws IOException {
            return Long.valueOf(jsonReader.mo68420j());
        }

        public final void toJson(C17412w wVar, Object obj) throws IOException {
            wVar.mo68533t(((Long) obj).longValue());
        }

        public final String toString() {
            return "JsonAdapter(Long)";
        }
    }

    /* renamed from: com.squareup.moshi.StandardJsonAdapters$k */
    public class C17383k extends JsonAdapter<Short> {
        public final Object fromJson(JsonReader jsonReader) throws IOException {
            return Short.valueOf((short) StandardJsonAdapters.m29117a(jsonReader, "a short", -32768, 32767));
        }

        public final void toJson(C17412w wVar, Object obj) throws IOException {
            wVar.mo68533t((long) ((Short) obj).intValue());
        }

        public final String toString() {
            return "JsonAdapter(Short)";
        }
    }

    /* renamed from: a */
    public static int m29117a(JsonReader jsonReader, String str, int i, int i2) throws IOException {
        int i3 = jsonReader.mo68419i();
        if (i3 >= i && i3 <= i2) {
            return i3;
        }
        throw new JsonDataException(String.format("Expected %s but was %s at path %s", new Object[]{str, Integer.valueOf(i3), jsonReader.getPath()}));
    }
}
