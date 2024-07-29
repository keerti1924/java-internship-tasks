package in.sp.beans;

public class skill {
	String web;
	String cloud;
	String ai;
	String data;

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getCloud() {
		return cloud;
	}
	
	public void setCloud(String cloud) {
		this.cloud = cloud;
	}

	public String getAi() {
		return ai;
	}

	public void setAi(String ai) {
		this.ai = ai;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	@Override
	public String toString() {
		
		return (web + ", "+cloud+" ,"+ ai+", "+data);
	}
	
	
	
}
