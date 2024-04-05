package p345eg;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.appevents.codeless.internal.C12225d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p401mg.C13080a;
import p568fn.C17782b;

/* renamed from: eg.c */
public final class C12700c {

    /* renamed from: a */
    public static final List<Class<? extends View>> f27984a = C17782b.m29865e0(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);

    /* renamed from: b */
    public static final C12700c f27985b = new C12700c();

    /* renamed from: a */
    public static final ArrayList m20375a(View view) {
        Class<C12700c> cls = C12700c.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            C19383o.m32797g(view, "view");
            ArrayList arrayList = new ArrayList();
            for (Class<? extends View> isInstance : f27984a) {
                if (isInstance.isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            Iterator it = C12225d.m20054b(view).iterator();
            while (it.hasNext()) {
                arrayList.addAll(m20375a((View) it.next()));
            }
            return arrayList;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: b */
    public static final JSONObject m20376b(View view, View view2) {
        Class<C12700c> cls = C12700c.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            C19383o.m32797g(view, "view");
            JSONObject jSONObject = new JSONObject();
            if (view == view2) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            m20378e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator it = C12225d.m20054b(view).iterator();
            while (it.hasNext()) {
                jSONArray.put(m20376b((View) it.next(), view2));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: d */
    public static final String m20377d(View view) {
        Class<C12700c> cls = C12700c.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            C19383o.m32797g(view, "hostView");
            String j = C12225d.m20061j(view);
            if (j.length() > 0) {
                return j;
            }
            String join = TextUtils.join(" ", f27985b.mo45470c(view));
            C19383o.m32796f(join, "TextUtils.join(\" \", childrenText)");
            return join;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: e */
    public static final void m20378e(View view, JSONObject jSONObject) {
        Class<C12700c> cls = C12700c.class;
        if (!C13080a.m20762b(cls)) {
            try {
                C19383o.m32797g(view, "view");
                try {
                    String j = C12225d.m20061j(view);
                    String h = C12225d.m20059h(view);
                    jSONObject.put("classname", view.getClass().getSimpleName());
                    jSONObject.put("classtypebitmask", C12225d.m20055c(view));
                    boolean z = true;
                    if (j.length() > 0) {
                        jSONObject.put("text", j);
                    }
                    if (h.length() <= 0) {
                        z = false;
                    }
                    if (z) {
                        jSONObject.put(ResponseConstants.HINT, h);
                    }
                    if (view instanceof EditText) {
                        jSONObject.put("inputtype", ((EditText) view).getInputType());
                    }
                } catch (JSONException unused) {
                }
            } catch (Throwable th) {
                C13080a.m20761a(cls, th);
            }
        }
    }

    /* renamed from: c */
    public final ArrayList mo45470c(View view) {
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = C12225d.m20054b(view).iterator();
            while (it.hasNext()) {
                View view2 = (View) it.next();
                String j = C12225d.m20061j(view2);
                if (j.length() > 0) {
                    arrayList.add(j);
                }
                arrayList.addAll(mo45470c(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }
}
