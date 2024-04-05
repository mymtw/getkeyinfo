package p145io.branch.referral;

import android.app.Activity;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: io.branch.referral.h */
public final class C7041h {

    /* renamed from: a */
    public Drawable f15662a;

    /* renamed from: b */
    public String f15663b;

    /* renamed from: c */
    public Drawable f15664c;

    /* renamed from: d */
    public String f15665d;

    /* renamed from: e */
    public C7043i f15666e;

    /* renamed from: f */
    public ArrayList f15667f = new ArrayList();

    public C7041h(Activity activity, C7043i iVar) {
        JSONObject jSONObject = new JSONObject();
        new ArrayList();
        this.f15666e = new C7043i(activity);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                this.f15666e.mo19291a(jSONObject.get(next), next);
            }
        } catch (Exception unused) {
        }
        new ArrayList();
        Context applicationContext = activity.getApplicationContext();
        this.f15662a = applicationContext.getResources().getDrawable(17301573, applicationContext.getTheme());
        this.f15663b = "More...";
        Context applicationContext2 = activity.getApplicationContext();
        this.f15664c = applicationContext2.getResources().getDrawable(17301582, applicationContext2.getTheme());
        this.f15665d = "Copy link";
        UiModeManager uiModeManager = (UiModeManager) Branch.m13575j().f15577c.f15749b.getSystemService("uimode");
        boolean z = false;
        if (uiModeManager == null) {
            C7077r.m13675a("uiModeManager is null, mark this as a non-TV device by default.");
        } else if (uiModeManager.getCurrentModeType() == 4) {
            z = true;
        }
        if (z) {
            this.f15667f.add("com.google.android.tv.frameworkpackagestubs");
        }
        this.f15666e = iVar;
    }
}
