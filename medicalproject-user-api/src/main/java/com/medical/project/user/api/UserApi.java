package com.medical.project.user.api;

import com.medical.project.user.fallback.UserApiError;
import com.medical.project.common.po.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "medicalproject-user",fallback = UserApiError.class)
public interface UserApi {
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    List<User> selectAll();
}
