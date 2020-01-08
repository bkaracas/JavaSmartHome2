
public class Batarya {
	int capacity;
	int level;
	boolean canUpdate;
	boolean consumed;
	boolean firstusage;
	public Batarya() {
		capacity=3500;
		level=350;
		canUpdate=true;
		consumed=false;
		firstusage=false;
	}

	
	
	
	public void updateLevel(int watt) {
		if(level<capacity*31/100) {
			consumed=false;
			canUpdate=true;
		}
		
		if(level>capacity*50/100) {
			canUpdate=false;
		}
		
		
		if ((canUpdate)||(!consumed)) {
		
		if(level<capacity*80/100) {
			if(watt>=700) {
				level=level+700;
			}else {
				level=level+watt;
			}	
		}else {
			System.out.println("kapasitenin %80'i dolu oldugundan ekleme yapilamadi.\n ");
		}
		
		if(level>=capacity*80/100) {
			level=capacity*80/100;
			canUpdate=false;
		}
		
		
	}else {
		System.out.println("Bataryaya yukleme yapilamazasd\n ");
	}
		
	}
	
	public int consumeBattery(int watt) {
		
		if(level>=capacity*80/100) {
			firstusage=true;
		}
		
		if(level<capacity*30/100) {
		canUpdate=true;
		consumed=false;
		System.out.println("Bataryaya yukleniyor, kullanilamaz\n ");
		}
		if(firstusage) {
		if(!canUpdate) {
		if(watt>capacity*30/100) {
			if(level >=1050) {
			level =level-1050;
			if(level<1050) {
				int temp=1050-level;
				level=1050;
				consumed=true;
				System.out.println("tempsasdqw     "+temp+"       "+level);
				return temp;
			}else {
				System.out.println("10501123     "+1050+"       "+level);
				return 1050;
			}
		
			}
			
			
		}else {
			if(level>=watt) {
				if(level-watt<capacity*30/100) {
					int temp=level-capacity*30/100;
					level=capacity*30/100;
					consumed=true;
					return temp;}else {
				level=level-watt;
				consumed=true;
				
				return watt;}
			}else {
				
					int temp=level-capacity*30/100;
					level=capacity*30/100;
					consumed=true;
					return temp;
				
				
			}
		}
		
	}else {
		System.out.println("Bataryaya yukleniyor, kullanilamaz\n ");
		return 0;
	}}
		return 0;
	}
	
	public int getLevel() {
		return level;
	}



	public void setLevel(int level) {
		this.level = level;
	}



	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	

}