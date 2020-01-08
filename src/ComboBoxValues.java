import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.io.*;
import javax.swing.*;
import javax.swing.SpringLayout.Constraints;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


public class ComboBoxValues extends JFrame {
	
    Time time;
    static WindGenerator wind;
    static Batarya batarya;
    static ElektrikliEvAleti[] liste;
    static int mevsim; //yaz=1 kýþ=0
    static int esik;
    static int temp1;
    static int enerjiaktif;
    private JPanel panel1;
    private JPanel panel;
    private JPanel panel3;
    private JPanel panel2;
    private JPanel panel6;
    private JTextField text;
    private JTextArea text1;
    private JTextField text2;
    private JTextField text3;
    private JTextArea text5;
    
    
 
    JComboBox combo;
    JComboBox combo1;
    JComboBox combo2;
    JComboBox combo3;
    JComboBox combo4;
    JComboBox combo5;
    JComboBox combo6;
    JComboBox combo7;
    JComboBox combo8;// panel2 2
    JComboBox combo9; // panel2 2
    
    JButton Start; // panel2 2
    JButton Pause;// panel2 2
    JButton Stop;// panel2 2
    JButton Resume;
    JButton display; // panel 3 3
    JButton saveToDisk;
    JButton addAir;
    


    public static void main(String[] args) {
    	
    	batarya=new Batarya();
    	wind=new WindGenerator();
    	liste=new ElektrikliEvAleti[23];
    	ElektrikliEvAleti mb=new ElektrikliEvAleti(20,"minibuzdolabi",5,5);
    	ElektrikliEvAleti bd=new ElektrikliEvAleti(40,"buzdolabi",5,5);
    	ElektrikliEvAleti dd=new ElektrikliEvAleti(45,"derindondurucu",5,5);
    	ElektrikliEvAleti KOM=new ElektrikliEvAleti(150,"kombi",4,1);
    	ElektrikliEvAleti SACKURMAK=new ElektrikliEvAleti(2000,"sackurutmamakinesi",3,1);
    	ElektrikliEvAleti CAMMAK=new ElektrikliEvAleti(800,"camasirmakinesi",1,1);
    	ElektrikliEvAleti ELKSUPURGE=new ElektrikliEvAleti(1450,"elektriksupurgesi",2,2);
    	ElektrikliEvAleti ELEKOCAK=new ElektrikliEvAleti(1300,"elektrikliocak",4,4);
    	ElektrikliEvAleti FÝRÝN=new ElektrikliEvAleti(2000,"firin",4,4);
    	ElektrikliEvAleti KLÝMA=new ElektrikliEvAleti(1300,"1.klima",2,4);
    	ElektrikliEvAleti KLÝMA1=new ElektrikliEvAleti(1300,"2.klima",2,4);
    	ElektrikliEvAleti ELKÝSÝTÝCÝ=new ElektrikliEvAleti(2000,"elektrikliisitici",1,0);
    	ElektrikliEvAleti BULMAK=new ElektrikliEvAleti(1800,"bulasikmakinesi",1,1);
    	ElektrikliEvAleti UTU=new ElektrikliEvAleti(2800,"utu",2,2);
    	ElektrikliEvAleti LAPTOP=new ElektrikliEvAleti(90,"laptop",2,2);
    	ElektrikliEvAleti MÝKRODALGA=new ElektrikliEvAleti(1000,"mikrodalgafirin",4,4);
    	ElektrikliEvAleti CÝMBÝCMAK=new ElektrikliEvAleti(1000,"cimbicmemakinesi",1,1);
    	ElektrikliEvAleti KURUMAK=new ElektrikliEvAleti(600,"camamsirkurutmamakinesi",1,1);
    	ElektrikliEvAleti TV=new ElektrikliEvAleti(73,"1.televizyon",3,3);
    	ElektrikliEvAleti TV1=new ElektrikliEvAleti(73,"2.televizyon",3,3);
    	ElektrikliEvAleti SUÝSÝTÝCÝSÝ=new ElektrikliEvAleti(2200,"elektriklisuisitici",3,3);
    	ElektrikliEvAleti ASPÝRATOR=new ElektrikliEvAleti(180,"aspirator",4,4);
    	ElektrikliEvAleti SUPOMP=new ElektrikliEvAleti(2000,"supompasi",0,1);
    	
    	
    	for(int i=0;i<24;i++) {
    		mb.sycs(i);
    		mb.skcs(i);
    		bd.sycs(i);
    		bd.skcs(i);
    		dd.sycs(i);
    		dd.skcs(i);
    	}
    	
    	KOM.sycs(6);
    	KOM.skcs(6);
    	KOM.skcs(16);
    	KOM.skcs(17);
    	KOM.skcs(18);
    	KOM.skcs(19);
    	KOM.skcs(20);
    	KOM.skcs(21);
    	KOM.skcs(22);
    	KOM.skcs(23);
    	SACKURMAK.sycs(6);
    	SACKURMAK.skcs(6);
    	CAMMAK.sycs(19);
    	CAMMAK.sycs(20);
    	CAMMAK.skcs(17);
    	CAMMAK.skcs(18);
    	ELKSUPURGE.skcs(11);
    	ELEKOCAK.skcs(8);
    	ELEKOCAK.skcs(17);
    	ELEKOCAK.sycs(8);
    	ELEKOCAK.sycs(18);
    	FÝRÝN.sycs(16);
    	FÝRÝN.skcs(16);
    	KLÝMA.sycs(16);
    	KLÝMA.sycs(17);
    	KLÝMA.sycs(18);
    	KLÝMA.sycs(19);
    	KLÝMA.sycs(20);
    	KLÝMA.sycs(21);
    	KLÝMA.sycs(22);
    	KLÝMA.skcs(18);
    	KLÝMA1.sycs(16);
    	KLÝMA1.sycs(17);
    	KLÝMA1.sycs(18);
    	KLÝMA1.sycs(19);
    	KLÝMA1.sycs(20);
    	KLÝMA1.sycs(21);
    	KLÝMA1.sycs(22);
    	KLÝMA1.skcs(18);
    	ELKÝSÝTÝCÝ.skcs(20);
    	BULMAK.sycs(20);
    	BULMAK.skcs(19);
    	UTU.skcs(12);
    	LAPTOP.sycs(21);
    	LAPTOP.skcs(20);
    	MÝKRODALGA.sycs(19);
    	MÝKRODALGA.skcs(18);
    	CÝMBÝCMAK.sycs(8);
    	CÝMBÝCMAK.sycs(17);
    	CÝMBÝCMAK.skcs(8);
    	KURUMAK.sycs(20);
    	KURUMAK.sycs(21);
    	KURUMAK.skcs(19);
    	KURUMAK.skcs(20);
    	TV.sycs(20);
    	TV.sycs(21);
    	TV.sycs(22);
    	TV.sycs(23);
    	TV.skcs(20);
    	TV.skcs(21);
    	TV.skcs(22);
    	TV.skcs(19);
    	TV1.sycs(20);
    	TV1.sycs(21);
    	TV1.sycs(22);
    	TV1.sycs(23);
    	TV1.skcs(20);
    	TV1.skcs(21);
    	TV1.skcs(22);
    	TV1.skcs(19);
    	SUÝSÝTÝCÝSÝ.sycs(7);
    	SUÝSÝTÝCÝSÝ.skcs(7);
    	ASPÝRATOR.sycs(18);
    	ASPÝRATOR.skcs(17);
    	SUPOMP.sycs(19);
    	
    	liste[0]=mb;
    	liste[1]=bd;
    	liste[2]=dd;
    	liste[3]=KOM;
    	liste[4]=SACKURMAK;
    	liste[5]=CAMMAK;
    	liste[6]=ELKSUPURGE;
    	liste[7]=ELEKOCAK;
    	liste[8]=FÝRÝN;
    	liste[9]=KLÝMA;
    	liste[10]=ELKÝSÝTÝCÝ;
    	liste[11]=BULMAK;
    	liste[12]=UTU;
    	liste[13]=LAPTOP;
    	liste[14]=MÝKRODALGA;
    	liste[15]=CÝMBÝCMAK;
    	liste[16]=KURUMAK;
    	liste[17]=TV;
    	liste[18]=SUÝSÝTÝCÝSÝ;
    	liste[19]=ASPÝRATOR;
    	liste[20]=SUPOMP;
    	liste[21]=KLÝMA1;
    	liste[22]=TV1;
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ComboBoxValues frame = new ComboBoxValues();
                    frame.setSize(600, 600);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


    }


    public ComboBoxValues() {
    	
        JTabbedPane tappedPane = new JTabbedPane();
        panel = new JPanel();
        panel1 = new JPanel();
        panel2=new JPanel();
        panel3=new JPanel();
        Thread t=new Thread(new TimeThread());
  
        tappedPane.add(panel,"Set Time");
        tappedPane.add(panel1,"Active Components");
        tappedPane.add(panel2, "Logs");
        tappedPane.add(panel3, "All Logs");
  
        add(tappedPane);
        
        
        
        // setContentPane(panel1);
        tappedPane.setBackground(Color.DARK_GRAY);
        panel.setBackground(Color.DARK_GRAY);
        panel1.setBackground(Color.DARK_GRAY);
        panel2.setBackground(Color.DARK_GRAY);
        panel3.setBackground(Color.DARK_GRAY);
        panel1.setLayout(new GridLayout(5,5));
        panel2.setLayout(new GridLayout(30,10));
        panel3.setLayout(new GridLayout(30,2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        combo=new JComboBox();
        combo.addItem("Hour");
        for(int i=0;i<24;i++)
        {
            combo.addItem(i);
        }
        
        
        
        combo1=new JComboBox();
        combo1.addItem("Minute");
        for(int i=0;i<60;i++)
        {
            combo1.addItem(i);
        }
        
        combo2=new JComboBox();
        combo2.addItem("Mevsim");
            combo2.addItem("Yaz");
            combo2.addItem("Kis");
        
        combo3=new JComboBox();
        combo3.addItem("Esik Degeri");
        combo3.addItem(2000);
        combo3.addItem(2500);
        combo3.addItem(2750);
        combo3.addItem(3000);
        combo3.addItem(3500);
        combo3.addItem(4000);
        text1=new JTextArea(1,5);
        text1.setText("");
        Start =new JButton("Start"); // PANEL 2
        Pause =new JButton("Pause");
        Stop =new JButton("Stop");
        Resume=new JButton("Resume");
        //panel.add(combo,BorderLayout.LINE_START);
        //panel.add(combo1,BorderLayout.LINE_START);
        panel.add(combo2,BorderLayout.LINE_START);
        //panel.add(combo3,BorderLayout.LINE_START);
        panel.add(text1,BorderLayout.LINE_START);
        panel.add(Start,BorderLayout.SOUTH);
        panel.add(Pause,BorderLayout.SOUTH);
        //panel.add(Resume,BorderLayout.SOUTH);
        panel.add(Stop,BorderLayout.SOUTH); // PANEL 2
        
        Start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int hour = 0;//(int) (combo.getSelectedItem());
                int min =0;//(int) (combo1.getSelectedItem());
                String mev=(String)(combo2.getSelectedItem());
                if(mev.equals("Yaz")) {
                 mevsim= 1;}else {mevsim=0;}
                String esik1=text1.getText();
                esik=Integer.valueOf(esik1);
                System.out.println(esik);
                time = new Time(hour,min,1);
               
                t.start();
                

            }});

        Pause.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                time.setStat(0);
            }});

        Resume.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                time.setStat(1);
            }});

        Stop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t.stop();
            }});
        
        
        
        
        
        
        
        
        
        
    }
    
    
    public class TimeThread implements Runnable {
        private AtomicInteger timeinint=new AtomicInteger(0);
       
        @Override
        public void run() {
            System.out.println("Starting " );
            int x= time.getHour()*60+time.getmin();
            timeinint.set(x);
            int a=1;
            try {
                while(a==1) {
                	if((time.getHour()==23)&&(time.getmin()==45)) {
                		a=0;
                	}
                    while(time.getStat()==1) {
                    	if((time.getHour()==23)&&(time.getmin()==30)){
                    		time.setStat(2);
                    	}
                    	if( (timeinint.get()%60)==0) {
                     	   ElektrikliEvAleti[] aktif;
                     	   aktif=new ElektrikliEvAleti[10];
                     	   int sayac=0;
                     	   int saatlikEnerjiTuketimi=0;
                     	   
                     	   panel1.removeAll();
                     	   if(mevsim==1) {
                     		   int watt=wind.getYazeu(time.getHour());
                     		   batarya.updateLevel(watt);
                     		   
                     		   for(int i=0;i<23;i++) {
                     			   if(liste[i].gycs(time.getHour())==1) {
                     				   liste[i].setActive(true);
                     				   aktif[sayac]=liste[i];
                     				   sayac++;
                     				   saatlikEnerjiTuketimi=saatlikEnerjiTuketimi+liste[i].getGucDegeri();
                     				   //System.out.println("guc tuketimi:"+saatlikEnerjiTuketimi);		   
                     			   }else {
                     				   liste[i].setActive(false);
                     			   }
                     			   
                     		   }
                     	   }else {
                     		   int watt=wind.getKiseu(time.getHour());
                     		   batarya.updateLevel(watt);
                     		   for(int i=0;i<23;i++) {
                         		   if(liste[i].gkcs(time.getHour())==1) {
                         			   liste[i].setActive(true);
                         			   liste[i].setActive(true);
                     				   aktif[sayac]=liste[i];
                     				   sayac++;
                     				   saatlikEnerjiTuketimi=saatlikEnerjiTuketimi+liste[i].getGucDegeri();
                                    	
                         		   }else {
                          			   liste[i].setActive(false);
                          		   }
                         			   
                     		  }
                     	 }
                     	   
                     	if(saatlikEnerjiTuketimi>esik && time.getHour()>=17 && time.getHour()<=22) {
                     		
                     		 temp1=batarya.consumeBattery(saatlikEnerjiTuketimi-esik);
                     		
                     		if(temp1==(saatlikEnerjiTuketimi-esik)) {
                     			for(int i=0;i<sayac;i++) {
                         			text2=new JTextField();
                  				   text2.setBackground(Color.gray);
                  				   text2.setText("Cihaz adi: "+aktif[i].getAd()+"  Elektrik kullanýmý: "+aktif[i].getGucDegeri());
                  				   panel1.revalidate();
                  				   panel1.repaint();
                  				   panel1.add(text2);
                  				   text3=new JTextField();
                  				 text3.setBackground(Color.gray);
                				   text3.setText("Saat: "+time.getHour()+":"+time.getmin()+"0"+" Cihaz adi: "+aktif[i].getAd()+"  Elektrik kullanýmý: "+aktif[i].getGucDegeri());
                  				 panel3.revalidate();
                				   panel3.repaint();
                  				 panel3.add(text3);
                         		}
                     		}else {
                     			int oaet=0;
                     			
                     			if(mevsim==1) {
                     				if(time.getHour()>=17 && time.getHour()<=22) {
                     				while((saatlikEnerjiTuketimi-oaet)>=(esik+temp1)) {
                     				int minpr=aktif[0].getPriorityyaz();
                     				int minyer=0;
                     			for(int i=1;i<sayac;i++) {
                     				if(aktif[i].getPriorityyaz() <= minpr){
                     					if(aktif[minyer].getPriorityyaz()==aktif[i].getPriorityyaz()) {
                     						if(aktif[minyer].getGucDegeri()<aktif[i].getGucDegeri()) {
                     							minpr = aktif[i].getPriorityyaz();
                             					minyer=i;
                             					
                     						}
                     						
                     					}else {
                     					minpr = aktif[i].getPriorityyaz();
                     					minyer=i;
                     					
                     					}}
                         		}
                     			text2=new JTextField();
             				   text2.setBackground(Color.green);
             				  text2.setText("Saat: "+time.getHour()+":"+time.getmin()+"0'de/da calismasi beklenen "+aktif[minyer].getAd()+" aleti enerji yetmediði icin 22:00'den sonraya ertelenmistir.");
             				   panel2.revalidate();
             				   panel2.repaint();
             				   panel2.add(text2);
             				   	oaet=oaet+aktif[minyer].getGucDegeri();
                     			aktif[minyer].sycsz(time.getHour());
                     			aktif[minyer].sycs(0);
                     			aktif[minyer]=aktif[sayac-1];
                     			sayac--;
                     			
                     				}}
                         		}else{
                         			if(time.getHour()>=17 && time.getHour()<=22) {
                         			while((saatlikEnerjiTuketimi-oaet)>=(esik+temp1)) {
                         			int minpr=aktif[0].getPriorityyaz();
                     				int minyer=0;
                     			for(int i=1;i<sayac;i++) {
                     				if(aktif[i].getPrioritykis() < minpr){
                     					if(aktif[minyer].getPrioritykis()==aktif[i].getPrioritykis()) {
                     						if(aktif[minyer].getGucDegeri()<aktif[i].getGucDegeri()) {
                     							minpr = aktif[i].getPrioritykis();
                             					minyer=i;
                     						}
                     					}else {
                     					minpr = aktif[i].getPrioritykis();
                     					minyer=i;
                     					}}
                         			
                     			}
                     			text2=new JTextField();
             				   text2.setBackground(Color.green);
             				   text2.setText("Saat: "+time.getHour()+":"+time.getmin()+"0'de/da calismasi beklenen "+aktif[minyer].getAd()+" aleti enerji yetmediði icin 22:00'den sonraya ertelenmistir.");
             				   panel2.revalidate();
             				   panel2.repaint();
             				   panel2.add(text2);
             				  oaet=oaet+aktif[minyer].getGucDegeri();
                     			aktif[minyer].skcsz(time.getHour());
                     			aktif[minyer].skcs(0);
                     			aktif[minyer]=aktif[sayac-1];
                     			sayac--;
                     			
                         			}
                     		}
                     			for(int i=0;i<sayac;i++) {
                     			
                         			text2=new JTextField();
                  				   text2.setBackground(Color.gray);
                  				   text2.setText("Cihaz adi: "+aktif[i].getAd()+"  Elektrik kullanýmý: "+aktif[i].getGucDegeri());
                  				   panel1.revalidate();
                  				   panel1.repaint();
                  				   panel1.add(text2);
                  				 text3=new JTextField();
                  				 text3.setBackground(Color.gray);
                				   text3.setText("Saat: "+time.getHour()+":"+time.getmin()+"0"+" Cihaz adi: "+aktif[i].getAd()+"  Elektrik kullanýmý: "+aktif[i].getGucDegeri());
                  				 panel3.revalidate();
                				   panel3.repaint();
                  				 panel3.add(text3);
                         		}
                     			
                     	}}
                     		
                     	}else {
                     		for(int i=0;i<sayac;i++) {
                     			enerjiaktif=enerjiaktif+aktif[i].getGucDegeri();
                     			text2=new JTextField();
              				   text2.setBackground(Color.gray);
              				   text2.setText("Cihaz adi: "+aktif[i].getAd()+"  Elektrik kullanýmý: "+aktif[i].getGucDegeri());
              				   panel1.revalidate();
              				   panel1.repaint();
              				   panel1.add(text2);
              				 text3=new JTextField();
              				 text3.setBackground(Color.gray);
            				   text3.setText("Saat: "+time.getHour()+":"+time.getmin()+"0"+" Cihaz adi: "+aktif[i].getAd()+"  Elektrik kullanýmý: "+aktif[i].getGucDegeri());
              				 panel3.revalidate();
            				   panel3.repaint();
              				 panel3.add(text3);
                     		}
                     	}
                     	enerjiaktif=0;
                     	for(int i=0;i<sayac;i++) {
                     		System.out.println(aktif[i].getAd());
                     		enerjiaktif=enerjiaktif+aktif[i].getGucDegeri();}
                     		
                     	text2=new JTextField();
                     	text2.setBackground(Color.yellow);
       				   	text2.setText("Saat: "+time.getHour()+":"+time.getmin()+"0"+" Batarya durumu: "+batarya.getLevel()+" (%"+(float)((float)batarya.getLevel()/(float)batarya.getCapacity())*100+")"+" Planlý Elektrik kullanýmý:"+saatlikEnerjiTuketimi+" Batarya kullanýmý:"+temp1+" Anlýk Elektrik kullanýmý:"+enerjiaktif+" Esik: "+esik);
       				   	panel2.revalidate();
       				   	panel2.repaint();
       				   	panel2.add(text2);
                     	  
                     	   
                        }
                        timeinint.set(timeinint.get()+30);
                        //System.out.println("saat="+ ((timeinint.get()-(timeinint.get()%60))/60) + ":" + (timeinint.get()%60) );
                        time.setHour(((timeinint.get()-(timeinint.get()%60))/60));
                        time.setmin((timeinint.get()%60));
                        Thread.sleep(1000);
                        
                        String title = (Integer.toString(time.getHour())+":"+Integer.toString(time.getmin()));
                        TitledBorder border = BorderFactory.createTitledBorder(title);
                        border.setTitleColor(Color.WHITE);
                       
                       
                        
                        
                        panel1.setBorder(border);
                        panel1.revalidate();
                        panel1.repaint();
                        panel.setBorder(border);
                        panel.revalidate();
                        panel.repaint();
                        panel2.setBorder(border);
                        panel2.revalidate();
                        panel2.repaint();
                    }
                    time.setmin((timeinint.get()%60));
                    Thread.sleep(1000);

                }
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }

        }}


}