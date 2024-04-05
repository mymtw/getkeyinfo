package com.etsy.android.config.flags.p073ui;

import com.etsy.android.R;
import com.etsy.collagecompose.BadgeStyle;
import kotlin.jvm.internal.C19383o;
import p409o9.C13122d;

/* renamed from: com.etsy.android.config.flags.ui.ConfigFlagStatus */
public enum ConfigFlagStatus {
    CLEAN_UP("Clean up", R.drawable.clg_icon_core_flag_v1, R.style.clg_badge_status_urgent, BadgeStyle.Urgent),
    IN_EXPERIMENT("In Experiment", R.drawable.clg_icon_core_barchart_v1, R.style.clg_badge_price_modifier, BadgeStyle.PriceModifier),
    IN_PE("In Persistent Experiment", R.drawable.clg_icon_core_calendar_v1, R.style.clg_badge_status_primary, BadgeStyle.Primary),
    OPERATIONAL("Operational", R.drawable.clg_icon_core_gear_fill_v1, R.style.clg_badge_status_secondary, BadgeStyle.Secondary);
    
    public static final C6390a Companion = null;
    private final BadgeStyle badgeStyle;
    private final int badgeStyleRes;
    private final int iconRes;
    private final String statusName;

    /* renamed from: com.etsy.android.config.flags.ui.ConfigFlagStatus$a */
    public static final class C6390a {
        /* renamed from: a */
        public static ConfigFlagStatus m12825a(C13122d dVar) {
            if (dVar != null) {
                Boolean bool = dVar.f28851d;
                Boolean bool2 = Boolean.TRUE;
                if (C19383o.m32792b(bool, bool2)) {
                    return ConfigFlagStatus.CLEAN_UP;
                }
                if (C19383o.m32792b(dVar.f28848a, bool2)) {
                    return ConfigFlagStatus.IN_EXPERIMENT;
                }
                if (C19383o.m32792b(dVar.f28850c, bool2)) {
                    return ConfigFlagStatus.IN_PE;
                }
                if (C19383o.m32792b(dVar.f28849b, bool2)) {
                    return ConfigFlagStatus.OPERATIONAL;
                }
            }
            return null;
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C6390a();
    }

    private ConfigFlagStatus(String str, int i, int i2, BadgeStyle badgeStyle2) {
        this.statusName = str;
        this.iconRes = i;
        this.badgeStyleRes = i2;
        this.badgeStyle = badgeStyle2;
    }

    public final BadgeStyle getBadgeStyle() {
        return this.badgeStyle;
    }

    public final int getBadgeStyleRes() {
        return this.badgeStyleRes;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final String getStatusName() {
        return this.statusName;
    }
}
