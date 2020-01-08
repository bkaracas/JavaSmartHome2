
public class ElektrikliEvAleti {
	
	
	private int gucDegeri;
	private String ad;
	private int[] yazcalismaSaati;
	private int[] kiscalismaSaati;
	private int priorityyaz;
	private int prioritykis;
	private boolean active;
	
	
	
	
	
	public ElektrikliEvAleti(int gucDegeri, String ad,int prioritykis,int priorityyaz) {
		super();		
		this.gucDegeri = gucDegeri;
		this.ad = ad;
		this.setPriorityyaz(priorityyaz);
		this.setPrioritykis(prioritykis);
		yazcalismaSaati=new int[25];
		kiscalismaSaati=new int[25];
		setActive(false);
		for(int i=0;i<25;i++) {
			yazcalismaSaati[i]=0;
			kiscalismaSaati[i]=0;
			
		}
	}
	
	
	
	public void sycs(int k) {
		yazcalismaSaati[k]=1;
	}
	public void skcs(int k) {
		kiscalismaSaati[k]=1;
	}
	public void sycsz(int k) {
		yazcalismaSaati[k]=0;
	}
	public void skcsz(int k) {
		kiscalismaSaati[k]=0;
	}

	public int gycs(int k) {
		return yazcalismaSaati[k];
	}
	public int gkcs(int k) {
		return kiscalismaSaati[k];
	}

	public int getGucDegeri() {
		return gucDegeri;
	}
	public String getAd() {
		return ad;
	}
	public void setGucDegeri(int gucDegeri) {
		this.gucDegeri = gucDegeri;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}




	public int[] getYazcalismaSaati() {
		return yazcalismaSaati;
	}




	public void setYazcalismaSaati(int[] yazcalismaSaati) {
		this.yazcalismaSaati = yazcalismaSaati;
	}


	

	public int[] getKiscalismaSaati() {
		return kiscalismaSaati;
	}




	public void setKiscalismaSaati(int[] kiscalismaSaati) {
		this.kiscalismaSaati = kiscalismaSaati;
	}




	public int getPriorityyaz() {
		return priorityyaz;
	}




	public int getPrioritykis() {
		return prioritykis;
	}




	public void setPriorityyaz(int priorityyaz) {
		this.priorityyaz = priorityyaz;
	}




	public void setPrioritykis(int prioritykis) {
		this.prioritykis = prioritykis;
	}



	public boolean isActive() {
		return active;
	}



	public void setActive(boolean active) {
		this.active = active;
	}




	
	
	

}
