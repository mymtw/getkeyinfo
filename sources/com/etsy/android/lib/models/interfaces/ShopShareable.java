package com.etsy.android.lib.models.interfaces;

import java.io.Serializable;

public interface ShopShareable extends SocialShareable, Serializable {
    String getShareUrl();
}
