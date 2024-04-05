package p584hn;

import com.google.firebase.perf.util.Constants$CounterNames;
import java.util.Locale;
import java.util.Map;

/* renamed from: hn.e */
public abstract class C17834e {
    /* renamed from: b */
    public static String m29957b(Map.Entry<String, String> entry) {
        String key = entry.getKey();
        String value = entry.getValue();
        if (key == null) {
            return "Attribute key must not be null";
        }
        if (value == null) {
            return "Attribute value must not be null";
        }
        if (key.length() > 40) {
            return String.format(Locale.US, "Attribute key length must not exceed %d characters", new Object[]{40});
        } else if (value.length() > 100) {
            return String.format(Locale.US, "Attribute value length must not exceed %d characters", new Object[]{100});
        } else if (!key.matches("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*")) {
            return "Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_";
        } else {
            return null;
        }
    }

    /* renamed from: c */
    public static String m29958c(String str) {
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Metric name must not exceed %d characters", new Object[]{100});
        } else if (!str.startsWith("_")) {
            return null;
        } else {
            for (Constants$CounterNames constants$CounterNames : Constants$CounterNames.values()) {
                if (constants$CounterNames.toString().equals(str)) {
                    return null;
                }
            }
            return "Metric name must not start with '_'";
        }
    }

    /* renamed from: a */
    public abstract boolean mo69066a();
}
