package com.google.gson.internal.bind;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.google.android.material.badge.BadgeDrawable;
import com.google.gson.C16708i;
import com.google.gson.C16798l;
import com.google.gson.C16800n;
import com.google.gson.C16801o;
import com.google.gson.C16802p;
import com.google.gson.C16803q;
import com.google.gson.C16805s;
import com.google.gson.C16807t;
import com.google.gson.C16808u;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import p650pn.C18417a;
import p675sn.C18541a;

public final class TypeAdapters {

    /* renamed from: A */
    public static final C16773t f37037A;

    /* renamed from: B */
    public static final C16808u f37038B;

    /* renamed from: C */
    public static final C16808u f37039C = new C16808u() {
        /* JADX WARNING: type inference failed for: r3v0, types: [sn.a, sn.a<T>] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final <T> com.google.gson.C16807t<T> mo59482a(com.google.gson.C16708i r2, p675sn.C18541a<T> r3) {
            /*
                r1 = this;
                java.lang.Class<java.lang.Enum> r2 = java.lang.Enum.class
                java.lang.Class r3 = r3.getRawType()
                boolean r0 = r2.isAssignableFrom(r3)
                if (r0 == 0) goto L_0x001f
                if (r3 != r2) goto L_0x000f
                goto L_0x001f
            L_0x000f:
                boolean r2 = r3.isEnum()
                if (r2 != 0) goto L_0x0019
                java.lang.Class r3 = r3.getSuperclass()
            L_0x0019:
                com.google.gson.internal.bind.TypeAdapters$d0 r2 = new com.google.gson.internal.bind.TypeAdapters$d0
                r2.<init>(r3)
                return r2
            L_0x001f:
                r2 = 0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.C1674330.mo59482a(com.google.gson.i, sn.a):com.google.gson.t");
        }
    };

    /* renamed from: a */
    public static final C16808u f37040a;

    /* renamed from: b */
    public static final C16808u f37041b;

    /* renamed from: c */
    public static final C16777x f37042c = new C16777x();

    /* renamed from: d */
    public static final C16808u f37043d;

    /* renamed from: e */
    public static final C16808u f37044e;

    /* renamed from: f */
    public static final C16808u f37045f;

    /* renamed from: g */
    public static final C16808u f37046g;

    /* renamed from: h */
    public static final C16808u f37047h;

    /* renamed from: i */
    public static final C16808u f37048i;

    /* renamed from: j */
    public static final C16808u f37049j;

    /* renamed from: k */
    public static final C16752b f37050k = new C16752b();

    /* renamed from: l */
    public static final C16808u f37051l;

    /* renamed from: m */
    public static final C16808u f37052m;

    /* renamed from: n */
    public static final C16761h f37053n = new C16761h();

    /* renamed from: o */
    public static final C16762i f37054o = new C16762i();

    /* renamed from: p */
    public static final C16808u f37055p;

    /* renamed from: q */
    public static final C16808u f37056q;

    /* renamed from: r */
    public static final C16808u f37057r;

    /* renamed from: s */
    public static final C16808u f37058s;

    /* renamed from: t */
    public static final C16808u f37059t;

    /* renamed from: u */
    public static final C16808u f37060u;

    /* renamed from: v */
    public static final C16808u f37061v;

    /* renamed from: w */
    public static final C16808u f37062w;

    /* renamed from: x */
    public static final C16808u f37063x = new C16808u() {

        /* renamed from: com.google.gson.internal.bind.TypeAdapters$26$a */
        public class C16742a extends C16807t<Timestamp> {

            /* renamed from: a */
            public final /* synthetic */ C16807t f37066a;

            public C16742a(C16807t tVar) {
                this.f37066a = tVar;
            }

            /* renamed from: a */
            public final Object mo59449a(JsonReader jsonReader) throws IOException {
                Date date = (Date) this.f37066a.mo59449a(jsonReader);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            /* renamed from: b */
            public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
                this.f37066a.mo59450b(jsonWriter, (Timestamp) obj);
            }
        }

        /* renamed from: a */
        public final <T> C16807t<T> mo59482a(C16708i iVar, C18541a<T> aVar) {
            if (aVar.getRawType() != Timestamp.class) {
                return null;
            }
            iVar.getClass();
            return new C16742a(iVar.mo59460g(C18541a.get(Date.class)));
        }
    };

    /* renamed from: y */
    public static final C16808u f37064y;

    /* renamed from: z */
    public static final C16808u f37065z;

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$a */
    public class C16750a extends C16807t<AtomicIntegerArray> {
        /* renamed from: a */
        public final Object mo59449a(JsonReader jsonReader) throws IOException {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                try {
                    arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException((Throwable) e);
                }
            }
            jsonReader.endArray();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        /* renamed from: b */
        public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            jsonWriter.beginArray();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                jsonWriter.value((long) atomicIntegerArray.get(i));
            }
            jsonWriter.endArray();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$a0 */
    public class C16751a0 extends C16807t<Number> {
        /* renamed from: a */
        public final Object mo59449a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Integer.valueOf(jsonReader.nextInt());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: b */
        public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
            jsonWriter.value((Number) obj);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$b */
    public class C16752b extends C16807t<Number> {
        /* renamed from: a */
        public final Object mo59449a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Long.valueOf(jsonReader.nextLong());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: b */
        public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
            jsonWriter.value((Number) obj);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$b0 */
    public class C16753b0 extends C16807t<AtomicInteger> {
        /* renamed from: a */
        public final Object mo59449a(JsonReader jsonReader) throws IOException {
            try {
                return new AtomicInteger(jsonReader.nextInt());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: b */
        public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
            jsonWriter.value((long) ((AtomicInteger) obj).get());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$c */
    public class C16754c extends C16807t<Number> {
        /* renamed from: a */
        public final Object mo59449a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Float.valueOf((float) jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: b */
        public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
            jsonWriter.value((Number) obj);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$c0 */
    public class C16755c0 extends C16807t<AtomicBoolean> {
        /* renamed from: a */
        public final Object mo59449a(JsonReader jsonReader) throws IOException {
            return new AtomicBoolean(jsonReader.nextBoolean());
        }

        /* renamed from: b */
        public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
            jsonWriter.value(((AtomicBoolean) obj).get());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$d */
    public class C16756d extends C16807t<Number> {
        /* renamed from: a */
        public final Object mo59449a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Double.valueOf(jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: b */
        public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
            jsonWriter.value((Number) obj);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$d0 */
    public static final class C16757d0<T extends Enum<T>> extends C16807t<T> {

        /* renamed from: a */
        public final HashMap f37081a = new HashMap();

        /* renamed from: b */
        public final HashMap f37082b = new HashMap();

        public C16757d0(Class<T> cls) {
            try {
                for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                    String name = enumR.name();
                    C18417a aVar = (C18417a) cls.getField(name).getAnnotation(C18417a.class);
                    if (aVar != null) {
                        name = aVar.value();
                        for (String put : aVar.alternate()) {
                            this.f37081a.put(put, enumR);
                        }
                    }
                    this.f37081a.put(name, enumR);
                    this.f37082b.put(enumR, name);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: a */
        public final Object mo59449a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return (Enum) this.f37081a.get(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: b */
        public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
            Enum enumR = (Enum) obj;
            jsonWriter.value(enumR == null ? null : (String) this.f37082b.get(enumR));
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$e */
    public class C16758e extends C16807t<Number> {
        /* renamed from: a */
        public final Object mo59449a(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            int i = C16775v.f37083a[peek.ordinal()];
            if (i == 1 || i == 3) {
                return new LazilyParsedNumber(jsonReader.nextString());
            }
            if (i == 4) {
                jsonReader.nextNull();
                return null;
            }
            throw new JsonSyntaxException("Expecting number, got: " + peek);
        }

        /* renamed from: b */
        public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
            jsonWriter.value((Number) obj);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$f */
    public class C16759f extends C16807t<Character> {
        /* renamed from: a */
        public final Object mo59449a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String nextString = jsonReader.nextString();
            if (nextString.length() == 1) {
                return Character.valueOf(nextString.charAt(0));
            }
            throw new JsonSyntaxException(C0326j.m864i("Expecting character, got: ", nextString));
        }

        /* renamed from: b */
        public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
            Character ch = (Character) obj;
            jsonWriter.value(ch == null ? null : String.valueOf(ch));
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$g */
    public class C16760g extends C16807t<String> {
        /* renamed from: a */
        public final Object mo59449a(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            if (peek != JsonToken.NULL) {
                return peek == JsonToken.BOOLEAN ? Boolean.toString(jsonReader.nextBoolean()) : jsonReader.nextString();
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: b */
        public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
            jsonWriter.value((String) obj);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$h */
    public class C16761h extends C16807t<BigDecimal> {
        /* renamed from: a */
        public final Object mo59449a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return new BigDecimal(jsonReader.nextString());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: b */
        public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
            jsonWriter.value((Number) (BigDecimal) obj);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$i */
    public class C16762i extends C16807t<BigInteger> {
        /* renamed from: a */
        public final Object mo59449a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return new BigInteger(jsonReader.nextString());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: b */
        public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
            jsonWriter.value((Number) (BigInteger) obj);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$j */
    public class C16763j extends C16807t<StringBuilder> {
        /* renamed from: a */
        public final Object mo59449a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return new StringBuilder(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: b */
        public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
            StringBuilder sb = (StringBuilder) obj;
            jsonWriter.value(sb == null ? null : sb.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$k */
    public class C16764k extends C16807t<Class> {
        /* renamed from: a */
        public final Object mo59449a(JsonReader jsonReader) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        /* renamed from: b */
        public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
            throw new UnsupportedOperationException(C0326j.m863h((Class) obj, C0072d.m201h("Attempted to serialize java.lang.Class: "), ". Forgot to register a type adapter?"));
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$l */
    public class C16765l extends C16807t<StringBuffer> {
        /* renamed from: a */
        public final Object mo59449a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return new StringBuffer(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: b */
        public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
            StringBuffer stringBuffer = (StringBuffer) obj;
            jsonWriter.value(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$m */
    public class C16766m extends C16807t<URL> {
        /* renamed from: a */
        public final Object mo59449a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String nextString = jsonReader.nextString();
            if ("null".equals(nextString)) {
                return null;
            }
            return new URL(nextString);
        }

        /* renamed from: b */
        public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
            URL url = (URL) obj;
            jsonWriter.value(url == null ? null : url.toExternalForm());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$n */
    public class C16767n extends C16807t<URI> {
        /* renamed from: a */
        public final Object mo59449a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                String nextString = jsonReader.nextString();
                if ("null".equals(nextString)) {
                    return null;
                }
                return new URI(nextString);
            } catch (URISyntaxException e) {
                throw new JsonIOException((Throwable) e);
            }
        }

        /* renamed from: b */
        public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
            URI uri = (URI) obj;
            jsonWriter.value(uri == null ? null : uri.toASCIIString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$o */
    public class C16768o extends C16807t<InetAddress> {
        /* renamed from: a */
        public final Object mo59449a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return InetAddress.getByName(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: b */
        public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
            InetAddress inetAddress = (InetAddress) obj;
            jsonWriter.value(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$p */
    public class C16769p extends C16807t<UUID> {
        /* renamed from: a */
        public final Object mo59449a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return UUID.fromString(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: b */
        public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
            UUID uuid = (UUID) obj;
            jsonWriter.value(uuid == null ? null : uuid.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$q */
    public class C16770q extends C16807t<Currency> {
        /* renamed from: a */
        public final Object mo59449a(JsonReader jsonReader) throws IOException {
            return Currency.getInstance(jsonReader.nextString());
        }

        /* renamed from: b */
        public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
            jsonWriter.value(((Currency) obj).getCurrencyCode());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$r */
    public class C16771r extends C16807t<Calendar> {
        /* renamed from: a */
        public final Object mo59449a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (jsonReader.peek() != JsonToken.END_OBJECT) {
                String nextName = jsonReader.nextName();
                int nextInt = jsonReader.nextInt();
                if ("year".equals(nextName)) {
                    i = nextInt;
                } else if ("month".equals(nextName)) {
                    i2 = nextInt;
                } else if ("dayOfMonth".equals(nextName)) {
                    i3 = nextInt;
                } else if ("hourOfDay".equals(nextName)) {
                    i4 = nextInt;
                } else if ("minute".equals(nextName)) {
                    i5 = nextInt;
                } else if ("second".equals(nextName)) {
                    i6 = nextInt;
                }
            }
            jsonReader.endObject();
            return new GregorianCalendar(i, i2, i3, i4, i5, i6);
        }

        /* renamed from: b */
        public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
            Calendar calendar = (Calendar) obj;
            if (calendar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("year");
            jsonWriter.value((long) calendar.get(1));
            jsonWriter.name("month");
            jsonWriter.value((long) calendar.get(2));
            jsonWriter.name("dayOfMonth");
            jsonWriter.value((long) calendar.get(5));
            jsonWriter.name("hourOfDay");
            jsonWriter.value((long) calendar.get(11));
            jsonWriter.name("minute");
            jsonWriter.value((long) calendar.get(12));
            jsonWriter.name("second");
            jsonWriter.value((long) calendar.get(13));
            jsonWriter.endObject();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$s */
    public class C16772s extends C16807t<Locale> {
        /* renamed from: a */
        public final Object mo59449a(JsonReader jsonReader) throws IOException {
            String str = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.nextString(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            return (nextToken2 == null && str == null) ? new Locale(nextToken) : str == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, str);
        }

        /* renamed from: b */
        public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
            Locale locale = (Locale) obj;
            jsonWriter.value(locale == null ? null : locale.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$t */
    public class C16773t extends C16807t<C16800n> {
        /* renamed from: c */
        public static C16800n m27821c(JsonReader jsonReader) throws IOException {
            switch (C16775v.f37083a[jsonReader.peek().ordinal()]) {
                case 1:
                    return new C16803q((Number) new LazilyParsedNumber(jsonReader.nextString()));
                case 2:
                    return new C16803q(Boolean.valueOf(jsonReader.nextBoolean()));
                case 3:
                    return new C16803q(jsonReader.nextString());
                case 4:
                    jsonReader.nextNull();
                    return C16801o.f37122b;
                case 5:
                    C16798l lVar = new C16798l();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        Object c = m27821c(jsonReader);
                        if (c == null) {
                            c = C16801o.f37122b;
                        }
                        lVar.f37121b.add(c);
                    }
                    jsonReader.endArray();
                    return lVar;
                case 6:
                    C16802p pVar = new C16802p();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        Object c2 = m27821c(jsonReader);
                        LinkedTreeMap<String, C16800n> linkedTreeMap = pVar.f37123b;
                        if (c2 == null) {
                            c2 = C16801o.f37122b;
                        }
                        linkedTreeMap.put(nextName, c2);
                    }
                    jsonReader.endObject();
                    return pVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* renamed from: d */
        public static void m27822d(C16800n nVar, JsonWriter jsonWriter) throws IOException {
            if (nVar == null || (nVar instanceof C16801o)) {
                jsonWriter.nullValue();
            } else if (nVar instanceof C16803q) {
                C16803q c = nVar.mo59636c();
                Serializable serializable = c.f37124b;
                if (serializable instanceof Number) {
                    jsonWriter.value(c.mo59645l());
                } else if (serializable instanceof Boolean) {
                    jsonWriter.value(c.mo59643g());
                } else {
                    jsonWriter.value(c.mo59630e());
                }
            } else {
                boolean z = nVar instanceof C16798l;
                if (z) {
                    jsonWriter.beginArray();
                    if (z) {
                        Iterator<C16800n> it = ((C16798l) nVar).iterator();
                        while (it.hasNext()) {
                            m27822d(it.next(), jsonWriter);
                        }
                        jsonWriter.endArray();
                        return;
                    }
                    throw new IllegalStateException("Not a JSON Array: " + nVar);
                } else if (nVar instanceof C16802p) {
                    jsonWriter.beginObject();
                    for (Map.Entry next : nVar.mo59635a().f37123b.entrySet()) {
                        jsonWriter.name((String) next.getKey());
                        m27822d((C16800n) next.getValue(), jsonWriter);
                    }
                    jsonWriter.endObject();
                } else {
                    StringBuilder h = C0072d.m201h("Couldn't write ");
                    h.append(nVar.getClass());
                    throw new IllegalArgumentException(h.toString());
                }
            }
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo59449a(JsonReader jsonReader) throws IOException {
            return m27821c(jsonReader);
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
            m27822d((C16800n) obj, jsonWriter);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$u */
    public class C16774u extends C16807t<BitSet> {
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L_0x005e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
            if (r8.nextInt() != 0) goto L_0x005e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0063 A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo59449a(com.google.gson.stream.JsonReader r8) throws java.io.IOException {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.beginArray()
                com.google.gson.stream.JsonToken r1 = r8.peek()
                r2 = 0
                r3 = r2
            L_0x000e:
                com.google.gson.stream.JsonToken r4 = com.google.gson.stream.JsonToken.END_ARRAY
                if (r1 == r4) goto L_0x006a
                int[] r4 = com.google.gson.internal.bind.TypeAdapters.C16775v.f37083a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L_0x0056
                r6 = 2
                if (r4 == r6) goto L_0x0051
                r6 = 3
                if (r4 != r6) goto L_0x003a
                java.lang.String r1 = r8.nextString()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x002e }
                if (r1 == 0) goto L_0x005d
                goto L_0x005e
            L_0x002e:
                com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                java.lang.String r0 = "Error: Expecting: bitset number value (1, 0), Found: "
                java.lang.String r0 = androidx.appcompat.widget.C0326j.m864i(r0, r1)
                r8.<init>((java.lang.String) r0)
                throw r8
            L_0x003a:
                com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>((java.lang.String) r0)
                throw r8
            L_0x0051:
                boolean r5 = r8.nextBoolean()
                goto L_0x005e
            L_0x0056:
                int r1 = r8.nextInt()
                if (r1 == 0) goto L_0x005d
                goto L_0x005e
            L_0x005d:
                r5 = r2
            L_0x005e:
                if (r5 == 0) goto L_0x0063
                r0.set(r3)
            L_0x0063:
                int r3 = r3 + 1
                com.google.gson.stream.JsonToken r1 = r8.peek()
                goto L_0x000e
            L_0x006a:
                r8.endArray()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.C16774u.mo59449a(com.google.gson.stream.JsonReader):java.lang.Object");
        }

        /* renamed from: b */
        public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
            BitSet bitSet = (BitSet) obj;
            jsonWriter.beginArray();
            int length = bitSet.length();
            for (int i = 0; i < length; i++) {
                jsonWriter.value(bitSet.get(i) ? 1 : 0);
            }
            jsonWriter.endArray();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$v */
    public static /* synthetic */ class C16775v {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37083a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.gson.stream.JsonToken[] r0 = com.google.gson.stream.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f37083a = r0
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f37083a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f37083a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f37083a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f37083a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f37083a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f37083a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f37083a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NAME     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f37083a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f37083a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.C16775v.<clinit>():void");
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$w */
    public class C16776w extends C16807t<Boolean> {
        /* renamed from: a */
        public final Object mo59449a(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            if (peek != JsonToken.NULL) {
                return peek == JsonToken.STRING ? Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString())) : Boolean.valueOf(jsonReader.nextBoolean());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: b */
        public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
            jsonWriter.value((Boolean) obj);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$x */
    public class C16777x extends C16807t<Boolean> {
        /* renamed from: a */
        public final Object mo59449a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Boolean.valueOf(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: b */
        public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
            Boolean bool = (Boolean) obj;
            jsonWriter.value(bool == null ? "null" : bool.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$y */
    public class C16778y extends C16807t<Number> {
        /* renamed from: a */
        public final Object mo59449a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Byte.valueOf((byte) jsonReader.nextInt());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: b */
        public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
            jsonWriter.value((Number) obj);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$z */
    public class C16779z extends C16807t<Number> {
        /* renamed from: a */
        public final Object mo59449a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Short.valueOf((short) jsonReader.nextInt());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: b */
        public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
            jsonWriter.value((Number) obj);
        }
    }

    static {
        final C16805s sVar = new C16805s(new C16764k());
        final Class<Class> cls = Class.class;
        f37040a = new C16808u() {
            /* renamed from: a */
            public final <T> C16807t<T> mo59482a(C16708i iVar, C18541a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Factory[type=");
                h.append(r1.getName());
                h.append(",adapter=");
                h.append(r2);
                h.append("]");
                return h.toString();
            }
        };
        final C16805s sVar2 = new C16805s(new C16774u());
        final Class<BitSet> cls2 = BitSet.class;
        f37041b = new C16808u() {
            /* renamed from: a */
            public final <T> C16807t<T> mo59482a(C16708i iVar, C18541a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Factory[type=");
                h.append(r1.getName());
                h.append(",adapter=");
                h.append(r2);
                h.append("]");
                return h.toString();
            }
        };
        final C16776w wVar = new C16776w();
        final Class cls3 = Boolean.TYPE;
        final Class<Boolean> cls4 = Boolean.class;
        f37043d = new C16808u() {
            /* renamed from: a */
            public final <T> C16807t<T> mo59482a(C16708i iVar, C18541a<T> aVar) {
                Class<? super T> rawType = aVar.getRawType();
                if (rawType == r1 || rawType == r2) {
                    return r3;
                }
                return null;
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Factory[type=");
                h.append(r2.getName());
                h.append(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
                h.append(r1.getName());
                h.append(",adapter=");
                h.append(r3);
                h.append("]");
                return h.toString();
            }
        };
        final C16778y yVar = new C16778y();
        final Class cls5 = Byte.TYPE;
        final Class<Byte> cls6 = Byte.class;
        f37044e = new C16808u() {
            /* renamed from: a */
            public final <T> C16807t<T> mo59482a(C16708i iVar, C18541a<T> aVar) {
                Class<? super T> rawType = aVar.getRawType();
                if (rawType == r1 || rawType == r2) {
                    return r3;
                }
                return null;
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Factory[type=");
                h.append(r2.getName());
                h.append(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
                h.append(r1.getName());
                h.append(",adapter=");
                h.append(r3);
                h.append("]");
                return h.toString();
            }
        };
        final C16779z zVar = new C16779z();
        final Class cls7 = Short.TYPE;
        final Class<Short> cls8 = Short.class;
        f37045f = new C16808u() {
            /* renamed from: a */
            public final <T> C16807t<T> mo59482a(C16708i iVar, C18541a<T> aVar) {
                Class<? super T> rawType = aVar.getRawType();
                if (rawType == r1 || rawType == r2) {
                    return r3;
                }
                return null;
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Factory[type=");
                h.append(r2.getName());
                h.append(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
                h.append(r1.getName());
                h.append(",adapter=");
                h.append(r3);
                h.append("]");
                return h.toString();
            }
        };
        final C16751a0 a0Var = new C16751a0();
        final Class cls9 = Integer.TYPE;
        final Class<Integer> cls10 = Integer.class;
        f37046g = new C16808u() {
            /* renamed from: a */
            public final <T> C16807t<T> mo59482a(C16708i iVar, C18541a<T> aVar) {
                Class<? super T> rawType = aVar.getRawType();
                if (rawType == r1 || rawType == r2) {
                    return r3;
                }
                return null;
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Factory[type=");
                h.append(r2.getName());
                h.append(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
                h.append(r1.getName());
                h.append(",adapter=");
                h.append(r3);
                h.append("]");
                return h.toString();
            }
        };
        final C16805s sVar3 = new C16805s(new C16753b0());
        final Class<AtomicInteger> cls11 = AtomicInteger.class;
        f37047h = new C16808u() {
            /* renamed from: a */
            public final <T> C16807t<T> mo59482a(C16708i iVar, C18541a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Factory[type=");
                h.append(r1.getName());
                h.append(",adapter=");
                h.append(r2);
                h.append("]");
                return h.toString();
            }
        };
        final C16805s sVar4 = new C16805s(new C16755c0());
        final Class<AtomicBoolean> cls12 = AtomicBoolean.class;
        f37048i = new C16808u() {
            /* renamed from: a */
            public final <T> C16807t<T> mo59482a(C16708i iVar, C18541a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Factory[type=");
                h.append(r1.getName());
                h.append(",adapter=");
                h.append(r2);
                h.append("]");
                return h.toString();
            }
        };
        final C16805s sVar5 = new C16805s(new C16750a());
        final Class<AtomicIntegerArray> cls13 = AtomicIntegerArray.class;
        f37049j = new C16808u() {
            /* renamed from: a */
            public final <T> C16807t<T> mo59482a(C16708i iVar, C18541a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Factory[type=");
                h.append(r1.getName());
                h.append(",adapter=");
                h.append(r2);
                h.append("]");
                return h.toString();
            }
        };
        new C16754c();
        new C16756d();
        final C16758e eVar = new C16758e();
        final Class<Number> cls14 = Number.class;
        f37051l = new C16808u() {
            /* renamed from: a */
            public final <T> C16807t<T> mo59482a(C16708i iVar, C18541a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Factory[type=");
                h.append(r1.getName());
                h.append(",adapter=");
                h.append(r2);
                h.append("]");
                return h.toString();
            }
        };
        final C16759f fVar = new C16759f();
        final Class cls15 = Character.TYPE;
        final Class<Character> cls16 = Character.class;
        f37052m = new C16808u() {
            /* renamed from: a */
            public final <T> C16807t<T> mo59482a(C16708i iVar, C18541a<T> aVar) {
                Class<? super T> rawType = aVar.getRawType();
                if (rawType == r1 || rawType == r2) {
                    return r3;
                }
                return null;
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Factory[type=");
                h.append(r2.getName());
                h.append(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
                h.append(r1.getName());
                h.append(",adapter=");
                h.append(r3);
                h.append("]");
                return h.toString();
            }
        };
        final C16760g gVar = new C16760g();
        final Class<String> cls17 = String.class;
        f37055p = new C16808u() {
            /* renamed from: a */
            public final <T> C16807t<T> mo59482a(C16708i iVar, C18541a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Factory[type=");
                h.append(r1.getName());
                h.append(",adapter=");
                h.append(r2);
                h.append("]");
                return h.toString();
            }
        };
        final C16763j jVar = new C16763j();
        final Class<StringBuilder> cls18 = StringBuilder.class;
        f37056q = new C16808u() {
            /* renamed from: a */
            public final <T> C16807t<T> mo59482a(C16708i iVar, C18541a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Factory[type=");
                h.append(r1.getName());
                h.append(",adapter=");
                h.append(r2);
                h.append("]");
                return h.toString();
            }
        };
        final C16765l lVar = new C16765l();
        final Class<StringBuffer> cls19 = StringBuffer.class;
        f37057r = new C16808u() {
            /* renamed from: a */
            public final <T> C16807t<T> mo59482a(C16708i iVar, C18541a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Factory[type=");
                h.append(r1.getName());
                h.append(",adapter=");
                h.append(r2);
                h.append("]");
                return h.toString();
            }
        };
        final C16766m mVar = new C16766m();
        final Class<URL> cls20 = URL.class;
        f37058s = new C16808u() {
            /* renamed from: a */
            public final <T> C16807t<T> mo59482a(C16708i iVar, C18541a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Factory[type=");
                h.append(r1.getName());
                h.append(",adapter=");
                h.append(r2);
                h.append("]");
                return h.toString();
            }
        };
        final C16767n nVar = new C16767n();
        final Class<URI> cls21 = URI.class;
        f37059t = new C16808u() {
            /* renamed from: a */
            public final <T> C16807t<T> mo59482a(C16708i iVar, C18541a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Factory[type=");
                h.append(r1.getName());
                h.append(",adapter=");
                h.append(r2);
                h.append("]");
                return h.toString();
            }
        };
        final C16768o oVar = new C16768o();
        final Class<InetAddress> cls22 = InetAddress.class;
        f37060u = new C16808u() {

            /* renamed from: com.google.gson.internal.bind.TypeAdapters$35$a */
            public class C16749a extends C16807t<Object> {

                /* renamed from: a */
                public final /* synthetic */ Class f37079a;

                public C16749a(Class cls) {
                    this.f37079a = cls;
                }

                /* renamed from: a */
                public final Object mo59449a(JsonReader jsonReader) throws IOException {
                    Object a = r0.mo59449a(jsonReader);
                    if (a == null || this.f37079a.isInstance(a)) {
                        return a;
                    }
                    StringBuilder h = C0072d.m201h("Expected a ");
                    h.append(this.f37079a.getName());
                    h.append(" but was ");
                    h.append(a.getClass().getName());
                    throw new JsonSyntaxException(h.toString());
                }

                /* renamed from: b */
                public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
                    r0.mo59450b(jsonWriter, obj);
                }
            }

            /* renamed from: a */
            public final <T2> C16807t<T2> mo59482a(C16708i iVar, C18541a<T2> aVar) {
                Class<? super T2> rawType = aVar.getRawType();
                if (!r1.isAssignableFrom(rawType)) {
                    return null;
                }
                return new C16749a(rawType);
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Factory[typeHierarchy=");
                h.append(r1.getName());
                h.append(",adapter=");
                h.append(r0);
                h.append("]");
                return h.toString();
            }
        };
        final C16769p pVar = new C16769p();
        final Class<UUID> cls23 = UUID.class;
        f37061v = new C16808u() {
            /* renamed from: a */
            public final <T> C16807t<T> mo59482a(C16708i iVar, C18541a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Factory[type=");
                h.append(r1.getName());
                h.append(",adapter=");
                h.append(r2);
                h.append("]");
                return h.toString();
            }
        };
        final C16805s sVar6 = new C16805s(new C16770q());
        final Class<Currency> cls24 = Currency.class;
        f37062w = new C16808u() {
            /* renamed from: a */
            public final <T> C16807t<T> mo59482a(C16708i iVar, C18541a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Factory[type=");
                h.append(r1.getName());
                h.append(",adapter=");
                h.append(r2);
                h.append("]");
                return h.toString();
            }
        };
        final C16771r rVar = new C16771r();
        final Class<Calendar> cls25 = Calendar.class;
        final Class<GregorianCalendar> cls26 = GregorianCalendar.class;
        f37064y = new C16808u() {
            /* renamed from: a */
            public final <T> C16807t<T> mo59482a(C16708i iVar, C18541a<T> aVar) {
                Class<? super T> rawType = aVar.getRawType();
                if (rawType == cls25 || rawType == cls26) {
                    return rVar;
                }
                return null;
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Factory[type=");
                h.append(cls25.getName());
                h.append(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
                h.append(cls26.getName());
                h.append(",adapter=");
                h.append(rVar);
                h.append("]");
                return h.toString();
            }
        };
        final C16772s sVar7 = new C16772s();
        final Class<Locale> cls27 = Locale.class;
        f37065z = new C16808u() {
            /* renamed from: a */
            public final <T> C16807t<T> mo59482a(C16708i iVar, C18541a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Factory[type=");
                h.append(r1.getName());
                h.append(",adapter=");
                h.append(r2);
                h.append("]");
                return h.toString();
            }
        };
        final C16773t tVar = new C16773t();
        f37037A = tVar;
        final Class<C16800n> cls28 = C16800n.class;
        f37038B = new C16808u() {

            /* renamed from: com.google.gson.internal.bind.TypeAdapters$35$a */
            public class C16749a extends C16807t<Object> {

                /* renamed from: a */
                public final /* synthetic */ Class f37079a;

                public C16749a(Class cls) {
                    this.f37079a = cls;
                }

                /* renamed from: a */
                public final Object mo59449a(JsonReader jsonReader) throws IOException {
                    Object a = tVar.mo59449a(jsonReader);
                    if (a == null || this.f37079a.isInstance(a)) {
                        return a;
                    }
                    StringBuilder h = C0072d.m201h("Expected a ");
                    h.append(this.f37079a.getName());
                    h.append(" but was ");
                    h.append(a.getClass().getName());
                    throw new JsonSyntaxException(h.toString());
                }

                /* renamed from: b */
                public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
                    tVar.mo59450b(jsonWriter, obj);
                }
            }

            /* renamed from: a */
            public final <T2> C16807t<T2> mo59482a(C16708i iVar, C18541a<T2> aVar) {
                Class<? super T2> rawType = aVar.getRawType();
                if (!cls28.isAssignableFrom(rawType)) {
                    return null;
                }
                return new C16749a(rawType);
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Factory[typeHierarchy=");
                h.append(cls28.getName());
                h.append(",adapter=");
                h.append(tVar);
                h.append("]");
                return h.toString();
            }
        };
    }

    /* renamed from: a */
    public static <TT> C16808u m27761a(final Class<TT> cls, final C16807t<TT> tVar) {
        return new C16808u() {
            /* renamed from: a */
            public final <T> C16807t<T> mo59482a(C16708i iVar, C18541a<T> aVar) {
                if (aVar.getRawType() == cls) {
                    return tVar;
                }
                return null;
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Factory[type=");
                h.append(cls.getName());
                h.append(",adapter=");
                h.append(tVar);
                h.append("]");
                return h.toString();
            }
        };
    }

    /* renamed from: b */
    public static <TT> C16808u m27762b(final Class<TT> cls, final Class<TT> cls2, final C16807t<? super TT> tVar) {
        return new C16808u() {
            /* renamed from: a */
            public final <T> C16807t<T> mo59482a(C16708i iVar, C18541a<T> aVar) {
                Class<? super T> rawType = aVar.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return tVar;
                }
                return null;
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Factory[type=");
                h.append(cls2.getName());
                h.append(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
                h.append(cls.getName());
                h.append(",adapter=");
                h.append(tVar);
                h.append("]");
                return h.toString();
            }
        };
    }

    /* renamed from: c */
    public static <TT> C16808u m27763c(final C18541a<TT> aVar, final C16807t<TT> tVar) {
        return new C16808u() {
            /* renamed from: a */
            public final <T> C16807t<T> mo59482a(C16708i iVar, C18541a<T> aVar) {
                if (aVar.equals(C18541a.this)) {
                    return tVar;
                }
                return null;
            }
        };
    }
}
