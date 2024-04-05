package com.google.gson.internal.bind;

import com.google.gson.C16708i;
import com.google.gson.C16807t;
import com.google.gson.C16808u;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.C16788e;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import kotlinx.coroutines.C19543e0;
import p658qn.C18467a;
import p675sn.C18541a;

public final class DateTypeAdapter extends C16807t<Date> {

    /* renamed from: b */
    public static final C16808u f37000b = new C16808u() {
        /* renamed from: a */
        public final <T> C16807t<T> mo59482a(C16708i iVar, C18541a<T> aVar) {
            if (aVar.getRawType() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a */
    public final ArrayList f37001a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f37001a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C16788e.f37106a >= 9) {
            arrayList.add(C19543e0.m33304V(2, 2));
        }
    }

    /* renamed from: a */
    public final Object mo59449a(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String nextString = jsonReader.nextString();
        synchronized (this) {
            Iterator it = this.f37001a.iterator();
            while (it.hasNext()) {
                try {
                    Date parse = ((DateFormat) it.next()).parse(nextString);
                    return parse;
                } catch (ParseException unused) {
                }
            }
            try {
                Date b = C18467a.m31165b(nextString, new ParsePosition(0));
                return b;
            } catch (ParseException e) {
                throw new JsonSyntaxException(nextString, e);
            }
        }
    }

    /* renamed from: b */
    public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
        Date date = (Date) obj;
        synchronized (this) {
            if (date == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(((DateFormat) this.f37001a.get(0)).format(date));
            }
        }
    }
}
