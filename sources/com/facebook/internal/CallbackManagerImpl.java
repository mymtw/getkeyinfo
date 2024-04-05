package com.facebook.internal;

import android.content.Intent;
import java.util.HashMap;
import p365hg.C12879l0;
import p453tf.C13415g;
import p453tf.C13418j;

public final class CallbackManagerImpl implements C13415g {

    /* renamed from: b */
    public static final HashMap f27338b = new HashMap();

    /* renamed from: c */
    public static final C12248b f27339c = new C12248b();

    /* renamed from: a */
    public final HashMap f27340a = new HashMap();

    public enum RequestCodeOffset {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8),
        GamingFriendFinder(9),
        GamingGroupIntegration(10),
        Referral(11),
        GamingContextCreate(12),
        GamingContextSwitch(13),
        GamingContextChoose(14),
        TournamentShareDialog(15);
        
        private final int offset;

        private RequestCodeOffset(int i) {
            this.offset = i;
        }

        public final int toRequestCode() {
            String str = C13418j.f29381a;
            C12879l0.m20603g();
            return C13418j.f29392l + this.offset;
        }
    }

    /* renamed from: com.facebook.internal.CallbackManagerImpl$a */
    public interface C12247a {
        /* renamed from: a */
        boolean mo39375a(int i, Intent intent);
    }

    /* renamed from: com.facebook.internal.CallbackManagerImpl$b */
    public static final class C12248b {
    }

    /* renamed from: a */
    public static final synchronized void m20094a(int i, C12247a aVar) {
        synchronized (CallbackManagerImpl.class) {
            synchronized (f27339c) {
                HashMap hashMap = f27338b;
                if (!hashMap.containsKey(Integer.valueOf(i))) {
                    hashMap.put(Integer.valueOf(i), aVar);
                }
            }
        }
    }

    public final boolean onActivityResult(int i, int i2, Intent intent) {
        C12247a aVar;
        C12247a aVar2 = (C12247a) this.f27340a.get(Integer.valueOf(i));
        if (aVar2 != null) {
            return aVar2.mo39375a(i2, intent);
        }
        synchronized (f27339c) {
            aVar = (C12247a) f27338b.get(Integer.valueOf(i));
        }
        if (aVar != null) {
            return aVar.mo39375a(i2, intent);
        }
        return false;
    }
}
