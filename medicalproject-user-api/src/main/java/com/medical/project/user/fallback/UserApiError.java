package com.medical.project.user.fallback;

import com.medical.project.user.api.UserApi;
import com.medical.project.common.po.User;

import java.util.List;

public class UserApiError implements UserApi {

    @Override
    public List<User> selectAll() {
        return null;
    }
}
