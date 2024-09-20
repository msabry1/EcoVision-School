package com.education.ecovisionschool.audit;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class EcoVisionSchoolInfoContributor implements InfoContributor {

    @Override
    public void contribute(Info.Builder builder) {
        Map<String, String> ecovisionMap = new HashMap<String, String>();
        ecovisionMap.put("App Name", "EcoVisionSchool");
        ecovisionMap.put("App Description", "EcoVision School Web Application for Students and Admin");
        ecovisionMap.put("App Version", "1.0.0");
        ecovisionMap.put("Contact Email", "info@ecovisionschool.com");
        ecovisionMap.put("Contact Mobile", "+1(21) 673 4587");
        builder.withDetail("ecovisionschool-info", ecovisionMap);
    }

}
