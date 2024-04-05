package com.google.firebase;

import android.content.Context;
import android.os.Build;
import androidx.compose.animation.C0388a;
import androidx.room.C3217a;
import androidx.room.C3229f;
import com.fasterxml.jackson.core.JsonPointer;
import com.google.firebase.heartbeatinfo.C16553d;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.platforminfo.C16683c;
import com.google.firebase.platforminfo.C16685e;
import com.google.firebase.platforminfo.C16687f;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19284b;
import p003a2.C0023f;
import p306z8.C8481h;
import p504ai.C13983i;
import p649pm.C18396b;
import p649pm.C18401f;
import p649pm.C18409l;

public class FirebaseCommonRegistrar implements C18401f {
    /* renamed from: a */
    public static String m27354a(String str) {
        return str.replace(' ', '_').replace(JsonPointer.SEPARATOR, '_');
    }

    public final List<C18396b<?>> getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        C18396b.C18397a<C16687f> a = C18396b.m31103a(C16687f.class);
        a.mo69934a(new C18409l(2, 0, C16683c.class));
        a.f40470e = new C3217a(1);
        arrayList.add(a.mo69935b());
        C18396b.C18397a<HeartBeatInfo> a2 = C18396b.m31103a(HeartBeatInfo.class);
        a2.mo69934a(new C18409l(1, 0, Context.class));
        a2.mo69934a(new C18409l(2, 0, C16553d.class));
        a2.f40470e = new C0023f();
        arrayList.add(a2.mo69935b());
        arrayList.add(C16685e.m27654a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(C16685e.m27654a("fire-core", "20.0.0"));
        arrayList.add(C16685e.m27654a("device-name", m27354a(Build.PRODUCT)));
        arrayList.add(C16685e.m27654a("device-model", m27354a(Build.DEVICE)));
        arrayList.add(C16685e.m27654a("device-brand", m27354a(Build.BRAND)));
        arrayList.add(C16685e.m27655b("android-target-sdk", new C8481h()));
        arrayList.add(C16685e.m27655b("android-min-sdk", new C3229f()));
        arrayList.add(C16685e.m27655b("android-platform", new C0388a()));
        arrayList.add(C16685e.m27655b("android-installer", new C13983i()));
        try {
            str = C19284b.f43149f.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(C16685e.m27654a("kotlin", str));
        }
        return arrayList;
    }
}
