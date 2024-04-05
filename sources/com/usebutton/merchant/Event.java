package com.usebutton.merchant;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public final class Event {

    /* renamed from: a */
    public final UUID f38219a = UUID.randomUUID();

    /* renamed from: b */
    public final long f38220b = System.currentTimeMillis();

    /* renamed from: c */
    public final Name f38221c;

    /* renamed from: d */
    public final String f38222d;

    /* renamed from: e */
    public final JSONObject f38223e;

    public enum Name {
        DEEPLINK_OPENED("btn:deeplink-opened");
        
        /* access modifiers changed from: private */
        public final String eventName;

        private Name(String str) {
            this.eventName = str;
        }

        public String toString() {
            return this.eventName;
        }
    }

    public enum Property {
        URL("url");
        
        /* access modifiers changed from: private */
        public final String propertyName;

        private Property(String str) {
            this.propertyName = str;
        }

        public String toString() {
            return this.propertyName;
        }
    }

    public Event(Name name, String str) {
        this.f38221c = name;
        this.f38222d = str;
        this.f38223e = new JSONObject();
    }

    /* renamed from: a */
    public final JSONObject mo68643a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", this.f38221c.eventName);
        jSONObject.put("promotion_source_token", this.f38222d);
        long j = this.f38220b;
        SimpleDateFormat simpleDateFormat = C17505s.f38281a;
        jSONObject.put("time", C17505s.f38281a.format(new Date(j)));
        jSONObject.put("uuid", this.f38219a.toString());
        jSONObject.put("value", this.f38223e);
        return jSONObject;
    }
}
