package com.yash.youtube_extractor.pojo.search;

import com.google.gson.annotations.SerializedName;

public class ToggledAccessibility{

	@SerializedName("accessibilityData")
	private AccessibilityData accessibilityData;

	public void setAccessibilityData(AccessibilityData accessibilityData){
		this.accessibilityData = accessibilityData;
	}

	public AccessibilityData getAccessibilityData(){
		return accessibilityData;
	}

	@Override
 	public String toString(){
		return 
			"ToggledAccessibility{" + 
			"accessibilityData = '" + accessibilityData + '\'' + 
			"}";
		}
}