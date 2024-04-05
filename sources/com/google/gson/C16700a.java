package com.google.gson;

import android.support.p013v4.media.C0072d;
import com.google.gson.internal.C16788e;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import kotlinx.coroutines.C19543e0;
import p658qn.C18467a;

/* renamed from: com.google.gson.a */
public final class C16700a extends C16807t<Date> {

    /* renamed from: a */
    public final Class<? extends Date> f36920a;

    /* renamed from: b */
    public final ArrayList f36921b;

    public C16700a(int i, int i2, Class cls) {
        ArrayList arrayList = new ArrayList();
        this.f36921b = arrayList;
        m27667c(cls);
        this.f36920a = cls;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (C16788e.f37106a >= 9) {
            arrayList.add(C19543e0.m33304V(i, i2));
        }
    }

    /* renamed from: c */
    public static void m27667c(Class cls) {
        if (cls != Date.class && cls != java.sql.Date.class && cls != Timestamp.class) {
            throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
        }
    }

    /* renamed from: a */
    public final Object mo59449a(JsonReader jsonReader) throws IOException {
        Date date;
        Object date2;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String nextString = jsonReader.nextString();
        synchronized (this.f36921b) {
            Iterator it = this.f36921b.iterator();
            while (it.hasNext()) {
                try {
                    date = ((DateFormat) it.next()).parse(nextString);
                    break;
                } catch (ParseException unused) {
                }
            }
            try {
                date = C18467a.m31165b(nextString, new ParsePosition(0));
            } catch (ParseException e) {
                throw new JsonSyntaxException(nextString, e);
            }
        }
        Class<? extends Date> cls = this.f36920a;
        if (cls == Date.class) {
            return date;
        }
        if (cls == Timestamp.class) {
            date2 = new Timestamp(date.getTime());
        } else if (cls == java.sql.Date.class) {
            date2 = new java.sql.Date(date.getTime());
        } else {
            throw new AssertionError();
        }
        return date2;
    }

    /* renamed from: b */
    public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
        Date date = (Date) obj;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this.f36921b) {
            jsonWriter.value(((DateFormat) this.f36921b.get(0)).format(date));
        }
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f36921b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            StringBuilder h = C0072d.m201h("DefaultDateTypeAdapter(");
            h.append(((SimpleDateFormat) dateFormat).toPattern());
            h.append(')');
            return h.toString();
        }
        StringBuilder h2 = C0072d.m201h("DefaultDateTypeAdapter(");
        h2.append(dateFormat.getClass().getSimpleName());
        h2.append(')');
        return h2.toString();
    }
}
