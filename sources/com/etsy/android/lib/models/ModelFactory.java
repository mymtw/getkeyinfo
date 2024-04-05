package com.etsy.android.lib.models;

import com.etsy.android.lib.logger.C8694h;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class ModelFactory {
    public static <T> T create(JsonParser jsonParser, Class<T> cls) throws IOException {
        if (cls != null) {
            try {
                T newInstance = cls.newInstance();
                ((BaseModel) newInstance).parseData(jsonParser);
                return newInstance;
            } catch (InstantiationException e) {
                C8694h hVar = C8694h.f19097a;
                hVar.mo21309d("InstantiationException creating class=" + cls, e);
                return null;
            } catch (IllegalAccessException e2) {
                C8694h hVar2 = C8694h.f19097a;
                hVar2.mo21309d("IllegalAccessException creating class=" + cls, e2);
                return null;
            }
        } else {
            C8694h.f19097a.mo21306a("CANT CREATE MODEL WITH NULL CLASS!!!");
            return null;
        }
    }
}
