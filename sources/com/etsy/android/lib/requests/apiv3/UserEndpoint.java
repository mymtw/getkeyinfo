package com.etsy.android.lib.requests.apiv3;

import com.etsy.android.lib.models.apiv3.User;
import p248tp.C8071s;
import p765pr.C20064d;
import p771sr.C20183f;
import p771sr.C20196s;

public interface UserEndpoint {
    @C20183f("/etsyapps/v3/public/users/{id}")
    C8071s<C20064d<User>> getPublicUserById(@C20196s("id") long j);
}
