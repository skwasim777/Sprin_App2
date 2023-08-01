package com.customer.app;

import java.util.List;
import java.util.Properties;

public class Adress2 {
		private String pincode;
		private String area;
		private String flatNo;
		private List<String> landmarks;
		private Properties addresproof;
		public String getPincode() {
			return pincode;
		}
		public void setPincode(String pincode) {
			this.pincode = pincode;
		}
		public String getArea() {
			return area;
		}
		public void setArea(String area) {
			this.area = area;
		}
		public String getFlatNo() {
			return flatNo;
		}
		public void setFlatNo(String flatNo) {
			this.flatNo = flatNo;
		}
		public List<String> getLandmarks() {
			return landmarks;
		}
		public void setLandmarks(List<String> landmarks) {
			this.landmarks = landmarks;
		}
		public Properties getAddresproof() {
			return addresproof;
		}
		public void setAddresproof(Properties addresproof) {
			this.addresproof = addresproof;
		}
		@Override
		public String toString() {
			return "Adress [pincode=" + pincode + ", area=" + area + ", flatNo=" + flatNo + ", landmarks=" + landmarks
					+ ", addresproof=" + addresproof + "]";
		}
		
}
