package com.etsy.android.lib.models;

import com.etsy.android.lib.models.BaseModel;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONStringer;
import p340ea.C12673n;
import p628nj.C18263b;

@Deprecated
public class EtsyAssociativeArray extends BaseFieldModel {
    public HashMap<String, Object> mHashMap = new LinkedHashMap();

    private void toJSONValue(JSONStringer jSONStringer, Object obj) throws JSONException {
        if (obj instanceof EtsyAssociativeArray) {
            toJSON(jSONStringer, ((EtsyAssociativeArray) obj).getMap());
        } else if (obj instanceof List) {
            jSONStringer.array();
            for (Object jSONValue : (List) obj) {
                toJSONValue(jSONStringer, jSONValue);
            }
            jSONStringer.endArray();
        } else {
            jSONStringer.value(obj);
        }
    }

    public Object get(String str) {
        return this.mHashMap.get(str);
    }

    public EtsyAssociativeArray getHashMap(String str) {
        if (!this.mHashMap.containsKey(str)) {
            return null;
        }
        Object obj = this.mHashMap.get(str);
        if (obj instanceof EtsyAssociativeArray) {
            return (EtsyAssociativeArray) obj;
        }
        return null;
    }

    public EtsyAssociativeArray getHashMapOrDefault(String str, EtsyAssociativeArray etsyAssociativeArray) {
        EtsyAssociativeArray hashMap = getHashMap(str);
        return hashMap == null ? etsyAssociativeArray : hashMap;
    }

    public List<?> getList(String str) {
        if (!this.mHashMap.containsKey(str)) {
            return null;
        }
        Object obj = this.mHashMap.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        if (obj instanceof EtsyAssociativeArray) {
            return (List) obj;
        }
        return null;
    }

    public HashMap<String, Object> getMap() {
        return this.mHashMap;
    }

    public String getString(String str) {
        return (String) this.mHashMap.get(str);
    }

    public String getStringOrDefault(String str, String str2) {
        if (this.mHashMap.containsKey(str)) {
            Object obj = this.mHashMap.get(str);
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return str2;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
            try {
                this.mHashMap.put(str, BaseModel.parseRawStringArray(jsonParser));
                return false;
            } catch (BaseModel.UnsupportedFormatException unused) {
                ArrayList arrayList = new ArrayList();
                while (jsonParser.getCurrentToken() != JsonToken.END_ARRAY) {
                    arrayList.add((EtsyAssociativeArray) BaseModel.parseObject(jsonParser, EtsyAssociativeArray.class));
                    jsonParser.nextToken();
                }
                this.mHashMap.put(str, arrayList);
                return false;
            }
        } else if (JsonToken.START_OBJECT.equals(jsonParser.getCurrentToken())) {
            this.mHashMap.put(str, BaseModel.parseObject(jsonParser, EtsyAssociativeArray.class));
            return false;
        } else {
            this.mHashMap.put(str, BaseModel.parseString(jsonParser));
            return false;
        }
    }

    public void put(String str, Object obj) {
        this.mHashMap.put(str, obj);
    }

    public void putAll(Map<String, Object> map) {
        this.mHashMap.putAll(map);
    }

    public String toJSON() {
        JSONStringer jSONStringer = new JSONStringer();
        toJSON(jSONStringer, this.mHashMap);
        return jSONStringer.toString();
    }

    private void toJSON(JSONStringer jSONStringer, HashMap<String, Object> hashMap) {
        try {
            jSONStringer.object();
            for (String next : hashMap.keySet()) {
                jSONStringer.key(next);
                toJSONValue(jSONStringer, hashMap.get(next));
            }
            jSONStringer.endObject();
        } catch (JSONException e) {
            C12673n nVar = C18263b.f40052P;
            nVar.mo45450b("EtsyAssociativeArray", "Exception encoding as JSON " + e);
        }
    }
}
