package myfyp.pkg.futureadvisor;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;


public class List_item1 extends Activity{
	 public static final String EXTRA_MAJOR = "list_item:major";
	    public static final String EXTRA_INT = "list_item:int";

	    private int mInteger;
	    private String mMajor;

    ListView list;
    String[] suniname1 ={

            "Government College University, Lahore",
            "University of Engineering & Technology, Lahore",
            "University of the Punjab, Lahore",
            "National University of Computer and Emerging Sciences(FAST)",
            "Lahore University of Management Sciences(LUMS), Lahore",
            "COMSATS Institute of Information Technology (CIIT) - Lahore ", 
            "University of Central Punjab, Lahore",
            "University of Lahore",
            "University of Management And Technology, Lahore"
            

        };
    String[] saddres1 ={

            "GC University, Katchery Road Lahore 54000 ",
          
            "Khayaban-e-Jamia Punjab, Lahore 54000",
            "QUAID-E-AZAM CAMPUS:Canal Bank Road, Lahore.",
            "Block-B, Faisal Town,Lahore",
            " Opposite Sector U, DHA., Lahore 54792",
            "1.5 KM off Raiwind Rd,Near Labors Colony Defence Rd 54000, Ali Akbar Rd, Lahore",
            "Khayaban-e-Jinnah Lahore",
            "Lahore 54000",
            "University of Management and Technology Rd, Lahore 54000",
            };
    Integer[] simgid1={
    		
    		R.drawable.im1,
            R.drawable.im6,
            R.drawable.im8,
            R.drawable.im,
            R.drawable.im16,
            R.drawable.im20,
            R.drawable.im21,
            R.drawable.im22,
            R.drawable.im23,
          


    };
    String[] surlarray1={

            " http://www.gcu.edu.pk/",
             "http://www.uet.edu.pk/",
             "http://www.pu.edu.pk/ ",
             "http://www.nu.edu.pk ",
             "https://lums.edu.pk/ ",
             "http://lahore.comsats.edu.pk/ ",
             "http://www.ucp.edu.pk/",
             "http://www.uol.edu.pk/campuses/lahorecampus ",
             "http://umt.edu.pk/index.htm ",
            

 };
    
    String[] suniname2 ={

            "Government College University, Lahore",
            "University of Education, Lahore",
            "University of Engineering & Technology, Lahore",
            "University of the Punjab, Lahore",
            "National University of Computer and Emerging Sciences(FAST)",
            "Beaconhouse National University, Lahore",
            "Lahore University of Management Sciences(LUMS), Lahore",
            "COMSATS Institute of Information Technology (CIIT) - Lahore ", 
            "University of Central Punjab, Lahore",
            "University of Lahore",
            "University of Management And Technology, Lahore",
          
        };
    String[] saddres2={


            "Khayaban-e-Jamia Punjab, Lahore 54000",
            "College Road, Lahore",
            "QUAID-E-AZAM CAMPUS:Canal Bank Road, Lahore.",
            "Block-B, Faisal Town,Lahore",
            "Tarogil Campus, 13 Km Raiwind Road، Lahore 54400",
            " Opposite Sector U, DHA., Lahore 54792",
            "1.5 KM off Raiwind Rd,Near Labors Colony Defence Rd 54000, Ali Akbar Rd, Lahore",
            "Khayaban-e-Jinnah Lahore",
            "Lahore 54000",
            "University of Management and Technology Rd, Lahore 54000",
            };
 Integer[] simgid2={
    		
    		R.drawable.im1,
    		R.drawable.im5,
            R.drawable.im6,
            R.drawable.im8,
            R.drawable.im,
            R.drawable.im10,
            R.drawable.im16,
            R.drawable.im20,
            R.drawable.im21,
            R.drawable.im22,
            R.drawable.im23,
          


    };
    
 String[] surlarray2={

         " http://www.gcu.edu.pk/",
         "http://ue.edu.pk/beta/ ",
          "http://www.uet.edu.pk/",
          "http://www.pu.edu.pk/ ",
          "http://www.nu.edu.pk ",
          "http://www.bnu.edu.pk/bnu/ ",
          "https://lums.edu.pk/ ",
          "http://lahore.comsats.edu.pk/ ",
          "http://www.ucp.edu.pk/",
          "http://www.uol.edu.pk/campuses/lahorecampus ",
          "http://umt.edu.pk/index.htm ",
         

};
    
    
    String[] suniname3 ={
    		 "Beaconhouse National University, Lahore",
            "Imperial College of Business Studies, Lahore",
            "Institute of Management Sciences, Lahore",
            "Lahore School of Economics, Lahore",
            "National College of Buisness Administration& Economics (NCBA&E), Lahore",
            "University of Central Punjab, Lahore",
            "University of Lahore",
            "University of Management And Technology, Lahore",
            "University of South Asia, Lahore"

        };
    String[] saddres3 ={

    		"Tarogil Campus, 13 Km Raiwind Road، Lahore 54400",
    		"Shahkam Industries Rd, Lahore",
            "23، Lahore 54660",
            "Barki Rd, Lahore 54000",
            "178-, A-Block, Lahore",
            "Khayaban-e-Jinnah Lahore",
            "Lahore 54000",
            "University of Management and Technology Rd, Lahore 54000",
            "47 Tufail Rd, Lahore"

            };
 Integer[] simgid3={
    		
		 R.drawable.im10,
		 R.drawable.im13,
            R.drawable.im14,
            R.drawable.im15,
            R.drawable.im18,
            R.drawable.im21,
            R.drawable.im22,
            R.drawable.im23,
            R.drawable.im24,
          


    };
 String[] surlarray3={

		  "http://www.bnu.edu.pk/bnu/ ",
		  "http://www.imperial.edu.pk/", 
		  "http://site.pakaims.edu.pk/ ",
		  "http://www.lahoreschoolofeconomics.edu.pk/ ",
		  "http://www.ncbae.edu.pk/",
          "http://www.ucp.edu.pk/",
          "http://www.uol.edu.pk/campuses/lahorecampus ",
          "http://umt.edu.pk/index.htm ",
          "http://www.usa.edu.pk/ "
         

};
    String[] suniname4 ={

            "Government College University, Lahore",
            "National School of Public Policy, Lahore",
            "University of Education, Lahore",
            "University of the Punjab, Lahore",
            "Forman Christian College, Lahore",
            "Hajvery University, Lahore",
            "Minhaj University, Lahore",
            "The Superior University, Lahore",
            "University of Central Punjab, Lahore",
            "University of Lahore",
            "University of Management And Technology, Lahore",
            "University of South Asia, Lahore"

        };

    String[] saddres4 ={

            "GC University, Katchery Road Lahore 54000 ",
            "Shahrah-e-Qauid-e-Azam, 4 Mall Rd, Lahore 54000",
            "College Road, Lahore",
            "QUAID-E-AZAM CAMPUS:Canal Bank Road, Lahore.",
            "Zahoor Elahi Rd, Lahore 54600",
            " 43-52 Industrial Area,, Gurumangat Road, Lahore 54400",
            "Shah Jalani Road, Lahore",
            "17km Raiwind Rd, Lahore",
            "Khayaban-e-Jinnah Lahore",
            "Lahore 54000",
            "University of Management and Technology Rd, Lahore 54000",
            "47 Tufail Rd, Lahore"

            };
    Integer[] simgid4={
    		
   		       R.drawable.im1,
   		       R.drawable.im4,
               R.drawable.im5,
               R.drawable.im8,
               R.drawable.im11,
               R.drawable.im12,
               R.drawable.im17,
               R.drawable.im19,
               R.drawable.im21,
               R.drawable.im22,
               R.drawable.im23,
               R.drawable.im24,
             


       };
    String[] surlarray4={

    		 " http://www.gcu.edu.pk/",
    		 "http://www.nspp.gov.pk ",
    		 "http://ue.edu.pk/beta/ ",
    		 "http://www.pu.edu.pk/ ",
    		 "http://fccollege.edu.pk/ ",
    		  "http://www.hajvery.edu.pk/", 
    		"http://www.mul.edu.pk/ ",  
    		 "http://www.superior.edu.pk/ ",
            "http://www.ucp.edu.pk/",
            "http://www.uol.edu.pk/campuses/lahorecampus ",
            "http://umt.edu.pk/index.htm ",
            "http://www.usa.edu.pk/ "
           

  };
    String[] suniname5 ={
            "Lahore College for Women University, Lahore",
            "National College of Arts, Lahore",
            "University of the Punjab, Lahore",
            "Forman Christian College, Lahore",
            "Hajvery University, Lahore",
            "Minhaj University, Lahore",
            "University of Health Sciences, Lahore",
            "University of Veterinary and Animal Sciences, Lahore",
         
        };
    
    String[] saddres5 ={

            
            "Near Wapda Flats, Jail Road, Lahore 54000",
            "Shahrah-e-Qauid-e-Azam, 4 Mall Rd, Lahore 54000",
            "QUAID-E-AZAM CAMPUS:Canal Bank Road, Lahore.",
            "Zahoor Elahi Rd, Lahore 54600",
            " 43-52 Industrial Area,, Gurumangat Road, Lahore 54400",
            "Shah Jalani Road, Lahore",
            "Khayaban-e-Jamia Punjab, Lahore 54000",
            "Shaykh Abdul Qadir Jilani Rd, Lahore 54000",
            };
    Integer[] simgid5={
    		
		    R.drawable.im2,
		    R.drawable.im3,
            R.drawable.im8,
            R.drawable.im11,
            R.drawable.im12,
            R.drawable.im17,
            R.drawable.im7,
            R.drawable.im9,
         
    };
    String[] surlarray5={

    		 "http://www.lcwu.edu.pk/ ",
    		 "http://www.nca.edu.pk/" ,
    		 "http://www.pu.edu.pk/ ",
    		 "http://fccollege.edu.pk/ ",
             "http://www.hajvery.edu.pk/", 
             "http://www.mul.edu.pk/ ",
             "http://www.uhs.edu.pk/" ,
             "http://www.uvas.edu.pk/index.php ",

 };

    String[] uniname ={

    		"Lahore College for Women University, Lahore",
    		"Government College University, Lahore",
            
            "National College of Arts, Lahore",
            "National School of Public Policy, Lahore",
            "University of Education, Lahore",
            "University of Engineering & Technology, Lahore",
            "University of Health Sciences, Lahore",
            "University of the Punjab, Lahore",
            "University of Veterinary and Animal Sciences, Lahore",
            "National University of Computer and Emerging Sciences(FAST)",
                   
            "Beaconhouse National University, Lahore",
            "Forman Christian College, Lahore",
            "Hajvery University, Lahore",
            "Imperial College of Business Studies, Lahore",
            "Institute of Management Sciences, Lahore",
            "Lahore School of Economics, Lahore",
            "Lahore University of Management Sciences(LUMS), Lahore",
            "Minhaj University, Lahore",
            "National College of Buisness Administration& Economics (NCBA&E), Lahore",
            "The Superior University, Lahore",
            "COMSATS Institute of Information Technology (CIIT) - Lahore ", 
            "University of Central Punjab, Lahore",
            "University of Lahore",
            "University of Management And Technology, Lahore",
            "University of South Asia, Lahore"

        };
String[] addres ={
		"Near Wapda Flats, Jail Road, Lahore 54000",
        "GC University, Katchery Road Lahore 54000 ",
        
        "Shahrah-e-Qauid-e-Azam, 4 Mall Rd, Lahore 54000",
        "Shahrah-e-Quaid-e-Azam, Upper Mall, Lahore.",
        "College Road, Lahore",
        " G.T. Rd, Lahore 54890",
        "Khayaban-e-Jamia Punjab, Lahore 54000",
        "QUAID-E-AZAM CAMPUS:Canal Bank Road, Lahore.",
        "Shaykh Abdul Qadir Jilani Rd, Lahore 54000",
        "Block-B, Faisal Town,Lahore",
        
        "Tarogil Campus, 13 Km Raiwind Road، Lahore 54400",
        "Zahoor Elahi Rd, Lahore 54600",
        " 43-52 Industrial Area,, Gurumangat Road, Lahore 54400",
        "Shahkam Industries Rd, Lahore",
        "23، Lahore 54660",
        "Barki Rd, Lahore 54000",
        " Opposite Sector U, DHA., Lahore 54792",
        "Shah Jalani Road, Lahore",
        "178-, A-Block, Lahore",
        "17km Raiwind Rd, Lahore",
        "1.5 KM off Raiwind Rd,Near Labors Colony Defence Rd 54000, Ali Akbar Rd, Lahore",
        "Khayaban-e-Jinnah Lahore",
        "Lahore 54000",
        "University of Management and Technology Rd, Lahore 54000",
        "47 Tufail Rd, Lahore"

        };

    Integer[] imgid={
    		R.drawable.im2,
    		R.drawable.im1,
            
            R.drawable.im3,
            R.drawable.im4,
            R.drawable.im5,
            R.drawable.im6,
            R.drawable.im7,
            R.drawable.im8,
            R.drawable.im9,
            R.drawable.im,
          
            R.drawable.im10,
            R.drawable.im11,
            R.drawable.im12,
            R.drawable.im13,
            R.drawable.im14,
            R.drawable.im15,
            R.drawable.im16,
            R.drawable.im17,
            R.drawable.im18,
            R.drawable.im19,
            R.drawable.im20,
            R.drawable.im21,
            R.drawable.im22,
            R.drawable.im23,
            R.drawable.im24,


    };
    String[] urlarray={

               " http://www.gcu.edu.pk/",
                "http://www.lcwu.edu.pk/ ",
                "http://www.nca.edu.pk/" ,
                "http://www.nspp.gov.pk ",
                "http://ue.edu.pk/beta/ ",
                "http://www.uet.edu.pk/",
                "http://www.uhs.edu.pk/" ,
                "http://www.pu.edu.pk/ ",
                "http://www.uvas.edu.pk/index.php ",
                "http://www.nu.edu.pk ",
                
                "http://www.bnu.edu.pk/bnu/ ",
                "http://fccollege.edu.pk/ ",
                "http://www.hajvery.edu.pk/", 
                "http://www.imperial.edu.pk/", 
                "http://site.pakaims.edu.pk/ ",
                "http://www.lahoreschoolofeconomics.edu.pk/ ",
                "https://lums.edu.pk/ ",
                "http://www.mul.edu.pk/ ",
                "http://www.ncbae.edu.pk/",
                "http://www.superior.edu.pk/ ",
                "http://lahore.comsats.edu.pk/ ",
                "http://www.ucp.edu.pk/",
                "http://www.uol.edu.pk/campuses/lahorecampus ",
                "http://umt.edu.pk/index.htm ",
                "http://www.usa.edu.pk/ "

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        Intent intent = getIntent();

        mMajor = intent.getStringExtra(EXTRA_MAJOR);
        mInteger = intent.getIntExtra(EXTRA_INT, mInteger);
        if(mMajor.equals("Bachelor of Engineering") || mMajor.equals("Bachelor of Science in Civil Engineering") 
        		|| mMajor.equals("Bachelor of Science in Electrical Engineering") ||mMajor.equals("Bachelor of Science in Mechanical Engineering") 
        		|| mMajor.equals("Bachelor of Science in Software Engineering")|| mMajor.equals("Bachelor of Science in Mining Engineering") 
        		||mMajor.equals("Bachelor of Science in Manufacturing Engineering") ||mMajor.equals("Bachelor of Science in Integrated Science") 
        		||mMajor.equals("Bachelor of Science in Industrial Engineering") ||mMajor.equals("Bachelor of Science in Engineering Technology")  
        		&& mInteger>=75 ){
        	CustomListAdapter adapter=new CustomListAdapter(this, suniname1, simgid1,saddres1);
            list=(ListView)findViewById(R.id.list);
            list.setAdapter(adapter);

            list.setOnItemClickListener(new OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                        int position, long id) {
                    // TODO Auto-generated method stub
                    view.setSelected(true); 
                   // Intent i = new Intent(List_item.this, Listwebview.class); 

                   
                    AlertDialog.Builder alert= new AlertDialog.Builder(List_item1.this);
                    alert.setTitle("Selected University");

                    WebView wv = new WebView(getApplicationContext());
                    wv.loadUrl(surlarray1[+position]);
                    wv.setWebViewClient(new WebViewClient() {
                        @Override
                        public boolean shouldOverrideUrlLoading(WebView view, String url) {
                            view.loadUrl(url);

                            return true;
                        }
                    });

                    alert.setView(wv);
                    alert.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.dismiss();
                        }
                    });
                    alert.show();  

                }
            });
        }
        
      
        else if(mMajor.equals("Bachelor of Engineering") || mMajor.equals("Bachelor of Science in Civil Engineering") 
        		|| mMajor.equals("Bachelor of Science in Electrical Engineering") ||mMajor.equals("Bachelor of Science in Mechanical Engineering") 
        		|| mMajor.equals("Bachelor of Science in Software Engineering")|| mMajor.equals("Bachelor of Science in Mining Engineering") 
        		||mMajor.equals("Bachelor of Science in Manufacturing Engineering") ||mMajor.equals("Bachelor of Science in Integrated Science") 
        		||mMajor.equals("Bachelor of Science in Industrial Engineering") ||mMajor.equals("Bachelor of Science in Engineering Technology")  
        		
        		|| mMajor.equals("Bachelor of Science in Construction Technology") ||mMajor.equals("Bachelor of Computer Information Systems") 
        		|| mMajor.equals("Bachelor of Science in Architectural Engineering")|| mMajor.equals("Bachelor of Science in Architecture") 
        		||mMajor.equals("Bachelor of Science in Chemical Engineering")
        		&& mInteger>=50 ){
        	CustomListAdapter adapter=new CustomListAdapter(this, suniname2, simgid2,saddres2);
            list=(ListView)findViewById(R.id.list);
            list.setAdapter(adapter);

            list.setOnItemClickListener(new OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                        int position, long id) {
                    // TODO Auto-generated method stub
                    view.setSelected(true); 
                   // Intent i = new Intent(List_item.this, Listwebview.class); 

                   
                    AlertDialog.Builder alert= new AlertDialog.Builder(List_item1.this);
                    alert.setTitle("Selected University");

                    WebView wv = new WebView(getApplicationContext());
                    wv.loadUrl(surlarray2[+position]);
                    wv.setWebViewClient(new WebViewClient() {
                        @Override
                        public boolean shouldOverrideUrlLoading(WebView view, String url) {
                            view.loadUrl(url);

                            return true;
                        }
                    });

                    alert.setView(wv);
                    alert.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.dismiss();
                        }
                    });
                    alert.show();  

                }
            });
        }
        
        else if(mMajor.equals("Bachelor of Business Administration") || mMajor.equals("Bachelor of Business Administration") 
        		|| mMajor.equals("Bachelor of Economics") ||mMajor.equals("Bachelor of Accountancy") 
        		|| mMajor.equals("Bachelor of Science in Business Administration")|| mMajor.equals("Bachelor of Science in Business and Technology") 
        		||mMajor.equals("Bachelor of Science in Human Resources Management") ||mMajor.equals("Bachelor of Science in Marketing") 
        		||mMajor.equals("Bachelor of Science in Risk Management and Insurance") 
        		&& mInteger>=50 ){
        	CustomListAdapter adapter=new CustomListAdapter(this, suniname3, simgid3,saddres3);
            list=(ListView)findViewById(R.id.list);
            list.setAdapter(adapter);

            list.setOnItemClickListener(new OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                        int position, long id) {
                    // TODO Auto-generated method stub
                    view.setSelected(true); 
                   // Intent i = new Intent(List_item.this, Listwebview.class); 

                   
                    AlertDialog.Builder alert= new AlertDialog.Builder(List_item1.this);
                    alert.setTitle("Selected University");

                    WebView wv = new WebView(getApplicationContext());
                    wv.loadUrl(surlarray3[+position]);
                    wv.setWebViewClient(new WebViewClient() {
                        @Override
                        public boolean shouldOverrideUrlLoading(WebView view, String url) {
                            view.loadUrl(url);

                            return true;
                        }
                    });

                    alert.setView(wv);
                    alert.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.dismiss();
                        }
                    });
                    alert.show();  

                }
            });
        }
        
        else if(mMajor.equals("Bachelor of Fine Arts") || mMajor.equals("Bachelor of Science in Chemistry") 
        		|| mMajor.equals("Bachelor of Science in English Literature") ||mMajor.equals("Bachelor of Science in Environmental Science") 
        		|| mMajor.equals("Bachelor of Science in History")|| mMajor.equals("Bachelor of Science in Psychology") 
        		||mMajor.equals("Bachelor of Science in Veterinary Technology") ||mMajor.equals("Bachelor of Science in Science Education") 
        		 
        		&& mInteger>=45 ){
        	CustomListAdapter adapter=new CustomListAdapter(this, suniname5, simgid5,saddres5);
            list=(ListView)findViewById(R.id.list);
            list.setAdapter(adapter);

            list.setOnItemClickListener(new OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                        int position, long id) {
                    // TODO Auto-generated method stub
                    view.setSelected(true); 
                   // Intent i = new Intent(List_item.this, Listwebview.class); 

                   
                    AlertDialog.Builder alert= new AlertDialog.Builder(List_item1.this);
                    alert.setTitle("Selected University");

                    WebView wv = new WebView(getApplicationContext());
                    wv.loadUrl(surlarray5[+position]);
                    wv.setWebViewClient(new WebViewClient() {
                        @Override
                        public boolean shouldOverrideUrlLoading(WebView view, String url) {
                            view.loadUrl(url);

                            return true;
                        }
                    });

                    alert.setView(wv);
                    alert.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.dismiss();
                        }
                    });
                    alert.show();  

                }
            });
        }
        
        else if(mInteger<=40){
        	
        	
        	Toast.makeText(List_item1.this,"Sorry Your Percentage IS Low To Get Admission in HEC Recognized university", Toast.LENGTH_SHORT).show();
       
        }

        
        else if(mMajor.equals("Bachelor of Criminal Justice") || mMajor.equals("Bachelor of Social Work") 
        		|| mMajor.equals("Bachelor of Science in Criminal Justice") ||mMajor.equals("Bachelor of Science in Journalism") 
        		|| mMajor.equals("Bachelor of Science in Politics")|| mMajor.equals("Bachelor of Science in Religion") 
        		
        		&& mInteger>=50 ){
        	CustomListAdapter adapter=new CustomListAdapter(this, suniname4, simgid4,saddres4);
            list=(ListView)findViewById(R.id.list);
            list.setAdapter(adapter);

            list.setOnItemClickListener(new OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                        int position, long id) {
                    // TODO Auto-generated method stub
                    view.setSelected(true); 
                   // Intent i = new Intent(List_item.this, Listwebview.class); 

                   
                    AlertDialog.Builder alert= new AlertDialog.Builder(List_item1.this);
                    alert.setTitle("Selected University");

                    WebView wv = new WebView(getApplicationContext());
                    wv.loadUrl(surlarray4[+position]);
                    wv.setWebViewClient(new WebViewClient() {
                        @Override
                        public boolean shouldOverrideUrlLoading(WebView view, String url) {
                            view.loadUrl(url);

                            return true;
                        }
                    });

                    alert.setView(wv);
                    alert.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.dismiss();
                        }
                    });
                    alert.show();  

                }
            });
        }
    
       
        else{
        CustomListAdapter adapter=new CustomListAdapter(this, uniname, imgid,addres);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                    int position, long id) {
                // TODO Auto-generated method stub
                view.setSelected(true); 
               // Intent i = new Intent(List_item.this, Listwebview.class); 

               
                AlertDialog.Builder alert= new AlertDialog.Builder(List_item1.this);
                alert.setTitle("Selected University");

                WebView wv = new WebView(getApplicationContext());
                wv.loadUrl(urlarray[+position]);
                wv.setWebViewClient(new WebViewClient() {
                    @Override
                    public boolean shouldOverrideUrlLoading(WebView view, String url) {
                        view.loadUrl(url);

                        return true;
                    }
                });

                alert.setView(wv);
                alert.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });
                alert.show();  

            }
        });
    }
    }
}