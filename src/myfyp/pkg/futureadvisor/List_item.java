package myfyp.pkg.futureadvisor;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;


public class List_item extends Activity{

    ListView list;
    String[] uniname ={

            "Government College University, Lahore",
            "Lahore College for Women University, Lahore",
            "National College of Arts, Lahore",
            "National School of Public Policy, Lahore",
            "University of Education, Lahore",
            "University of Engineering & Technology, Lahore",
            "University of Health Sciences, Lahore",
            "University of the Punjab, Lahore",
            "University of Veterinary and Animal Sciences, Lahore",
            "National University of Computer and Emerging Sciences(FAST)",
                    " Private Sector Universities/Degree Awarding Institutes",
            "Beaconhouse National University, Lahore",
            "Forman Christian College, Lahore",
            "Hajvery University, Lahore",
            "Imperial College of Business Studies, Lahore",
            "Institute of Management Sciences, Lahore",
            "Lahore School of Economics, Lahore",
            "Lahore University of Management Sciences, Lahore",
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

        "GC University, Katchery Road Lahore 54000 ",
        "Near Wapda Flats, Jail Road, Lahore 54000",
        "Shahrah-e-Qauid-e-Azam, 4 Mall Rd, Lahore 54000",
        "Shahrah-e-Quaid-e-Azam, Upper Mall, Lahore.",
        "College Road, Lahore",
        " G.T. Rd, Lahore 54890",
        "Khayaban-e-Jamia Punjab, Lahore 54000",
        "QUAID-E-AZAM CAMPUS:Canal Bank Road, Lahore.",
        "Shaykh Abdul Qadir Jilani Rd, Lahore 54000",
        "Block-B, Faisal Town,Lahore",
        "",
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
            R.drawable.im1,
            R.drawable.im2,
            R.drawable.im3,
            R.drawable.im4,
            R.drawable.im5,
            R.drawable.im6,
            R.drawable.im7,
            R.drawable.im8,
            R.drawable.im9,
            R.drawable.im,
            R.drawable.white,
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

               
                AlertDialog.Builder alert= new AlertDialog.Builder(List_item.this);
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