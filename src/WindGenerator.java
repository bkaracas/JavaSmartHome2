
public class WindGenerator {
	
	private int[] yazeu;
	private int[] kiseu;
	
	public WindGenerator(){
		
		yazeu=new int[25];
		kiseu=new int[25];
		
		yazeu[0]=0;
		yazeu[1]=115;
		yazeu[2]=31;
		yazeu[3]=31;
		yazeu[4]=0;
		yazeu[5]=31;
		yazeu[6]=0;
		yazeu[7]=78;
		yazeu[8]=115;
		yazeu[9]=188;
		yazeu[10]=325;
		yazeu[11]=320;
		yazeu[12]=246;
		yazeu[13]=184;
		yazeu[14]=184;
		yazeu[15]=246;
		yazeu[16]=246;
		yazeu[17]=184;
		yazeu[18]=246;
		yazeu[19]=0;
		yazeu[20]=30;
		yazeu[21]=50;
		yazeu[22]=78;
		yazeu[23]=0;
		yazeu[24]=0;
		
		kiseu[0]=198;
		kiseu[1]=54;
		kiseu[2]=342;
		kiseu[3]=344;
		kiseu[4]=54;
		kiseu[5]=33;
		kiseu[6]=168;
		kiseu[7]=121;
		kiseu[8]=0;
		kiseu[9]=169;
		kiseu[10]=530;
		kiseu[11]=535;
		kiseu[12]=900;
		kiseu[13]=900;
		kiseu[14]=900;
		kiseu[15]=900;
		kiseu[16]=900;
		kiseu[17]=900;
		kiseu[18]=783;
		kiseu[19]=428;
		kiseu[20]=544;
		kiseu[21]=738;
		kiseu[22]=545;
		kiseu[23]=264;
		kiseu[24]=198;
		
		
	}
	
	
	
	public int getKiseu(int k) {
		return kiseu[k];
	}
	public void setKiseu(int[] kiseu) {
		this.kiseu = kiseu;
	}
	public int getYazeu(int k) {
		return yazeu[k];
	}
	public void setYazeu(int[] yazeu) {
		this.yazeu = yazeu;
	}
	
	

}
