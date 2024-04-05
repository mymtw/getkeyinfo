package com.bugsnag.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import androidx.activity.C0114h;
import com.bugsnag.android.internal.C5763c;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import kotlin.text.C19459m;

public final class SystemBroadcastReceiver extends BroadcastReceiver {
    public static final C5712a Companion = new C5712a();
    private static final String INTENT_ACTION_KEY = "Intent Action";
    private final Map<String, BreadcrumbType> actions = buildActions();
    private final C5917u client;
    private final C5816o1 logger;

    /* renamed from: com.bugsnag.android.SystemBroadcastReceiver$a */
    public static final class C5712a {
    }

    public SystemBroadcastReceiver(C5917u uVar, C5816o1 o1Var) {
        C19383o.m32798h(uVar, "client");
        C19383o.m32798h(o1Var, "logger");
        this.client = uVar;
        this.logger = o1Var;
    }

    private final void addExtrasToMetadata(Intent intent, Map<String, Object> map, String str) {
        Set<String> keySet;
        Bundle extras = intent.getExtras();
        if (extras != null && (keySet = extras.keySet()) != null) {
            for (String str2 : keySet) {
                Object obj = extras.get(str2);
                if (obj != null) {
                    String obj2 = obj.toString();
                    C5712a aVar = Companion;
                    C19383o.m32793c(str2, "key");
                    aVar.getClass();
                    if (C19457k.m33025c1(str2, "android.", false)) {
                        map.put("Extra", str + ": " + obj2);
                    } else {
                        map.put(str2, obj2);
                    }
                }
            }
        }
    }

    private final Map<String, BreadcrumbType> buildActions() {
        HashMap hashMap = new HashMap();
        C5763c cVar = this.client.f12622a;
        BreadcrumbType breadcrumbType = BreadcrumbType.USER;
        if (!cVar.mo16545b(breadcrumbType)) {
            hashMap.put("android.appwidget.action.APPWIDGET_DELETED", breadcrumbType);
            hashMap.put("android.appwidget.action.APPWIDGET_DISABLED", breadcrumbType);
            hashMap.put("android.appwidget.action.APPWIDGET_ENABLED", breadcrumbType);
            hashMap.put("android.intent.action.CAMERA_BUTTON", breadcrumbType);
            hashMap.put("android.intent.action.CLOSE_SYSTEM_DIALOGS", breadcrumbType);
            hashMap.put("android.intent.action.DOCK_EVENT", breadcrumbType);
        }
        BreadcrumbType breadcrumbType2 = BreadcrumbType.STATE;
        if (!cVar.mo16545b(breadcrumbType2)) {
            hashMap.put("android.appwidget.action.APPWIDGET_HOST_RESTORED", breadcrumbType2);
            hashMap.put("android.appwidget.action.APPWIDGET_RESTORED", breadcrumbType2);
            hashMap.put("android.appwidget.action.APPWIDGET_UPDATE", breadcrumbType2);
            hashMap.put("android.appwidget.action.APPWIDGET_UPDATE_OPTIONS", breadcrumbType2);
            hashMap.put("android.intent.action.ACTION_POWER_CONNECTED", breadcrumbType2);
            hashMap.put("android.intent.action.ACTION_POWER_DISCONNECTED", breadcrumbType2);
            hashMap.put("android.intent.action.ACTION_SHUTDOWN", breadcrumbType2);
            hashMap.put("android.intent.action.AIRPLANE_MODE", breadcrumbType2);
            hashMap.put("android.intent.action.BATTERY_LOW", breadcrumbType2);
            hashMap.put("android.intent.action.BATTERY_OKAY", breadcrumbType2);
            hashMap.put("android.intent.action.BOOT_COMPLETED", breadcrumbType2);
            hashMap.put("android.intent.action.CONFIGURATION_CHANGED", breadcrumbType2);
            hashMap.put("android.intent.action.CONTENT_CHANGED", breadcrumbType2);
            hashMap.put("android.intent.action.DATE_CHANGED", breadcrumbType2);
            hashMap.put("android.intent.action.DEVICE_STORAGE_LOW", breadcrumbType2);
            hashMap.put("android.intent.action.DEVICE_STORAGE_OK", breadcrumbType2);
            hashMap.put("android.intent.action.INPUT_METHOD_CHANGED", breadcrumbType2);
            hashMap.put("android.intent.action.LOCALE_CHANGED", breadcrumbType2);
            hashMap.put("android.intent.action.REBOOT", breadcrumbType2);
            hashMap.put("android.intent.action.SCREEN_OFF", breadcrumbType2);
            hashMap.put("android.intent.action.SCREEN_ON", breadcrumbType2);
            hashMap.put("android.intent.action.TIMEZONE_CHANGED", breadcrumbType2);
            hashMap.put("android.intent.action.TIME_SET", breadcrumbType2);
            hashMap.put("android.os.action.DEVICE_IDLE_MODE_CHANGED", breadcrumbType2);
            hashMap.put("android.os.action.POWER_SAVE_MODE_CHANGED", breadcrumbType2);
        }
        BreadcrumbType breadcrumbType3 = BreadcrumbType.NAVIGATION;
        if (!cVar.mo16545b(breadcrumbType3)) {
            hashMap.put("android.intent.action.DREAMING_STARTED", breadcrumbType3);
            hashMap.put("android.intent.action.DREAMING_STOPPED", breadcrumbType3);
        }
        return hashMap;
    }

    public static final void register(Context context, SystemBroadcastReceiver systemBroadcastReceiver, C5816o1 o1Var) {
        Companion.getClass();
        C19383o.m32798h(context, "ctx");
        C19383o.m32798h(systemBroadcastReceiver, "receiver");
        C19383o.m32798h(o1Var, "logger");
        if (!systemBroadcastReceiver.getActions().isEmpty()) {
            IntentFilter intentFilter = new IntentFilter();
            for (String addAction : systemBroadcastReceiver.getActions().keySet()) {
                intentFilter.addAction(addAction);
            }
            C0114h.m324v0(context, systemBroadcastReceiver, intentFilter, o1Var);
        }
    }

    public final Map<String, BreadcrumbType> getActions() {
        return this.actions;
    }

    public void onReceive(Context context, Intent intent) {
        C19383o.m32798h(context, ResponseConstants.CONTEXT);
        C19383o.m32798h(intent, "intent");
        try {
            HashMap hashMap = new HashMap();
            String action = intent.getAction();
            if (action != null) {
                Companion.getClass();
                String D1 = C19457k.m33025c1(action, "android.", false) ? C19459m.m33031D1(action, action) : action;
                hashMap.put(INTENT_ACTION_KEY, action);
                addExtrasToMetadata(intent, hashMap, D1);
                BreadcrumbType breadcrumbType = this.actions.get(action);
                if (breadcrumbType == null) {
                    breadcrumbType = BreadcrumbType.STATE;
                }
                this.client.mo16683b(breadcrumbType, D1, hashMap);
            }
        } catch (Exception e) {
            C5816o1 o1Var = this.logger;
            StringBuilder h = C0072d.m201h("Failed to leave breadcrumb in SystemBroadcastReceiver: ");
            h.append(e.getMessage());
            o1Var.mo16608h(h.toString());
        }
    }
}
