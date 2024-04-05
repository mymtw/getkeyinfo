package p030bo.app;

import com.braze.models.inappmessage.C5483a;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.j6 */
public final class C3843j6 {

    /* renamed from: a */
    private static final String f8719a = BrazeLogger.m11287i(C3843j6.class);

    /* renamed from: a */
    public static C5483a m8951a(JSONObject jSONObject, C4274x1 x1Var) {
        if (jSONObject == null) {
            try {
                BrazeLogger.m11285g(f8719a, "Templated message Json was null. Not de-serializing templated message.");
                return null;
            } catch (JSONException e) {
                String str = f8719a;
                BrazeLogger.m11293o(str, "Encountered JSONException processing templated message: " + jSONObject, e);
                return null;
            } catch (Exception e2) {
                String str2 = f8719a;
                BrazeLogger.m11293o(str2, "Encountered general exception processing templated message: " + jSONObject, e2);
                return null;
            }
        } else {
            String string = jSONObject.getString("type");
            if (string.equals("inapp")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                if (jSONObject2 == null) {
                    return null;
                }
                return C3582b3.m8482a(jSONObject2, x1Var);
            }
            String str3 = f8719a;
            BrazeLogger.m11292n(str3, "Received templated message Json with unknown type: " + string + ". Not parsing.");
            return null;
        }
    }

    /* renamed from: b */
    public static C4275x2 m8954b(JSONObject jSONObject, C4274x1 x1Var) {
        try {
            String string = jSONObject.getString("type");
            if (string.equals("inapp")) {
                return new C3638e3(jSONObject, x1Var);
            }
            if (string.equals("templated_iam")) {
                return new C4215t5(jSONObject, x1Var);
            }
            String str = f8719a;
            BrazeLogger.m11288j(str, "Received unknown trigger type: " + string);
            return null;
        } catch (JSONException e) {
            String str2 = f8719a;
            BrazeLogger.m11293o(str2, "Encountered JSONException processing triggered action Json: " + jSONObject, e);
        } catch (Exception e2) {
            String str3 = f8719a;
            BrazeLogger.m11293o(str3, "Failed to deserialize triggered action Json: " + jSONObject, e2);
        }
    }

    /* renamed from: a */
    public static List<C4275x2> m8953a(JSONArray jSONArray, C4274x1 x1Var) {
        if (jSONArray == null) {
            try {
                BrazeLogger.m11285g(f8719a, "Triggered actions Json array was null. Not de-serializing triggered actions.");
                return null;
            } catch (JSONException e) {
                String str = f8719a;
                BrazeLogger.m11293o(str, "Encountered JSONException processing triggered actions Json array: " + jSONArray, e);
                return null;
            } catch (Exception e2) {
                String str2 = f8719a;
                BrazeLogger.m11293o(str2, "Failed to deserialize triggered actions Json array: " + jSONArray, e2);
                return null;
            }
        } else {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                C4275x2 b = m8954b(jSONArray.getJSONObject(i), x1Var);
                if (b != null) {
                    arrayList.add(b);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public static List<C4137r2> m8952a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String string = optJSONObject.getString("type");
                string.getClass();
                char c = 65535;
                switch (string.hashCode()) {
                    case -1679221933:
                        if (string.equals("purchase_property")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3417674:
                        if (string.equals("open")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3556498:
                        if (string.equals("test")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 447503464:
                        if (string.equals("custom_event_property")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 717572172:
                        if (string.equals("custom_event")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1512893214:
                        if (string.equals("iam_click")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1743324417:
                        if (string.equals("purchase")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1926863907:
                        if (string.equals("push_click")) {
                            c = 7;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        arrayList.add(new C3623d4(optJSONObject));
                        break;
                    case 1:
                        arrayList.add(new C4211t3());
                        break;
                    case 2:
                        arrayList.add(new C4236u5());
                        break;
                    case 3:
                        arrayList.add(new C3660f0(optJSONObject));
                        break;
                    case 4:
                        arrayList.add(new C3614d0(optJSONObject));
                        break;
                    case 5:
                        arrayList.add(new C4319z2(optJSONObject));
                        break;
                    case 6:
                        arrayList.add(new C3590b4(optJSONObject));
                        break;
                    case 7:
                        arrayList.add(new C3669f4(optJSONObject));
                        break;
                    default:
                        BrazeLogger.m11292n(f8719a, "Received triggered condition Json with unknown type: " + string + ". Not parsing.");
                        break;
                }
            } else {
                BrazeLogger.m11292n(f8719a, "Received null or blank trigger condition Json. Not parsing.");
            }
        }
        return arrayList;
    }
}
