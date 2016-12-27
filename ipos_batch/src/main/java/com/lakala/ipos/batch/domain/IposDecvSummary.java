package com.lakala.ipos.batch.domain;

public class IposDecvSummary {

	private int id;
	private String sn;
	private String packageName;
	private String versionCode;
	private String versionName;

	public IposDecvSummary() {

	}

	public IposDecvSummary(String sn) {
		this.sn = sn;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getVersionCode() {
		return versionCode;
	}

	public void setVersionCode(String versionCode) {
		this.versionCode = versionCode;
	}

	public String getVersionName() {
		return versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

}
