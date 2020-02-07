package com.sample;

import com.sample.details.DetailsType;

import java.util.ArrayList;
import java.util.List;

public class ProfileService {

    public List getAvailableDetails(DetailsType type) {
    List details = new ArrayList();
    if(type.equals(DetailsType.EDUCATIONDETAILS)) {
        details.add("B.Tech Computer Engineer");
        details.add("Msc Computing");
    } else if(type.equals(DetailsType.WORKEXPERIENCE)) {
        details.add("Product Manager and Developer,IDR Solutions,UK");
        details.add("Technical Head,Soham Overseas,India");
        details.add("J2EE Intern,Infosys Ltd.,India");
    } else if(type.equals(DetailsType.SKILLSACQUIRED)) {
        details.add("IT Skills");
        details.add("Business Skills");
    } else {
        details.add("DetailType does not Exist");
    }
        return details;
    }
}
