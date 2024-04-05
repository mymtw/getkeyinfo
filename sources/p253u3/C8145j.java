package p253u3;

import org.json.JSONObject;

/* renamed from: u3.j */
public final class C8145j implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ String f17856b;

    /* renamed from: c */
    public final /* synthetic */ JSONObject f17857c;

    /* renamed from: d */
    public final /* synthetic */ JSONObject f17858d;

    /* renamed from: e */
    public final /* synthetic */ JSONObject f17859e;

    /* renamed from: f */
    public final /* synthetic */ JSONObject f17860f;

    /* renamed from: g */
    public final /* synthetic */ JSONObject f17861g;

    /* renamed from: h */
    public final /* synthetic */ long f17862h;

    /* renamed from: i */
    public final /* synthetic */ boolean f17863i = false;

    /* renamed from: j */
    public final /* synthetic */ C8139f f17864j;

    public C8145j(C8139f fVar, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, long j) {
        this.f17864j = fVar;
        this.f17856b = str;
        this.f17857c = jSONObject;
        this.f17858d = jSONObject2;
        this.f17859e = jSONObject3;
        this.f17860f = jSONObject4;
        this.f17861g = jSONObject5;
        this.f17862h = j;
    }

    public final void run() {
        if (!C8156t.m16412c(this.f17864j.f17822d)) {
            this.f17864j.mo20750f(this.f17856b, this.f17857c, this.f17858d, this.f17859e, this.f17860f, this.f17861g, this.f17862h, this.f17863i);
        }
    }
}
