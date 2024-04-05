package com.google.gson.internal.bind;

import com.google.gson.C16708i;
import com.google.gson.C16807t;
import com.google.gson.C16808u;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p675sn.C18541a;

public final class SqlDateTypeAdapter extends C16807t<Date> {

    /* renamed from: b */
    public static final C16808u f37022b = new C16808u() {
        /* renamed from: a */
        public final <T> C16807t<T> mo59482a(C16708i iVar, C18541a<T> aVar) {
            if (aVar.getRawType() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a */
    public final SimpleDateFormat f37023a = new SimpleDateFormat("MMM d, yyyy");

    /* renamed from: a */
    public final Object mo59449a(JsonReader jsonReader) throws IOException {
        Date date;
        synchronized (this) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                date = null;
            } else {
                try {
                    date = new Date(this.f37023a.parse(jsonReader.nextString()).getTime());
                } catch (ParseException e) {
                    throw new JsonSyntaxException((Throwable) e);
                }
            }
        }
        return date;
    }

    /* renamed from: b */
    public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
        Date date = (Date) obj;
        synchronized (this) {
            jsonWriter.value(date == null ? null : this.f37023a.format(date));
        }
    }
}
