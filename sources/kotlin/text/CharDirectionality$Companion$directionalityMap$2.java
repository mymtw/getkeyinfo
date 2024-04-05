package kotlin.text;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p753kq.C19846a;

public final class CharDirectionality$Companion$directionalityMap$2 extends Lambda implements C19846a<Map<Integer, ? extends CharDirectionality>> {
    public static final CharDirectionality$Companion$directionalityMap$2 INSTANCE = new CharDirectionality$Companion$directionalityMap$2();

    public CharDirectionality$Companion$directionalityMap$2() {
        super(0);
    }

    public final Map<Integer, CharDirectionality> invoke() {
        CharDirectionality[] values = CharDirectionality.values();
        int T = C19421p.m32930T(values.length);
        if (T < 16) {
            T = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(T);
        for (CharDirectionality charDirectionality : values) {
            linkedHashMap.put(Integer.valueOf(charDirectionality.getValue()), charDirectionality);
        }
        return linkedHashMap;
    }
}
