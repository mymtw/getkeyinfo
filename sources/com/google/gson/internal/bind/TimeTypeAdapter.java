package com.google.gson.internal.bind;

import com.google.gson.C16708i;
import com.google.gson.C16807t;
import com.google.gson.C16808u;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p675sn.C18541a;

public final class TimeTypeAdapter extends C16807t<Time> {

    /* renamed from: b */
    public static final C16808u f37024b = new C16808u() {
        /* renamed from: a */
        public final <T> C16807t<T> mo59482a(C16708i iVar, C18541a<T> aVar) {
            if (aVar.getRawType() == Time.class) {
                return new TimeTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a */
    public final SimpleDateFormat f37025a = new SimpleDateFormat("hh:mm:ss a");

    /* renamed from: a */
    public final Object mo59449a(JsonReader jsonReader) throws IOException {
        synchronized (this) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                Time time = new Time(this.f37025a.parse(jsonReader.nextString()).getTime());
                return time;
            } catch (ParseException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }
    }

    /* renamed from: b */
    public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
        Time time = (Time) obj;
        synchronized (this) {
            jsonWriter.value(time == null ? null : this.f37025a.format(time));
        }
    }
}
