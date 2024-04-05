package com.etsy.android.util;

import android.view.Menu;
import android.view.MenuItem;
import com.etsy.android.R;
import com.etsy.android.uikit.util.C11898d;

public final class BOEOptionsMenuItemHelper extends C11898d {

    public enum OptionsMenuIcon implements C11898d.C11900b {
        SEND(R.id.menu_send_reply, R.drawable.clg_icon_core_send_v1_1),
        COMPOSE(R.id.menu_new_message, R.drawable.clg_icon_core_compose_v1),
        SEARCH(R.id.menu_search, R.drawable.clg_icon_core_search_v1),
        SHARE(R.id.menu_share, R.drawable.clg_icon_core_androidshare_v1),
        FAVORITE(R.id.menu_fav, R.drawable.clg_icon_core_heart_v1);
        
        private int mIcon;
        private int mMenuId;

        private OptionsMenuIcon(int i, int i2) {
            this.mMenuId = i;
            this.mIcon = i2;
        }

        public int getIcon() {
            return this.mIcon;
        }

        public int getMenuId() {
            return this.mMenuId;
        }
    }

    /* renamed from: a */
    public static void m19853a(Menu menu) {
        for (OptionsMenuIcon optionsMenuIcon : OptionsMenuIcon.values()) {
            MenuItem findItem = menu.findItem(optionsMenuIcon.getMenuId());
            if (findItem != null) {
                findItem.setIcon(optionsMenuIcon.getIcon());
            }
        }
    }
}
