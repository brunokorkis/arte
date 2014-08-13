package com.example.artejogo;




import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends ActionBarActivity {
	
	private Button start;
	private Button proximo1;
	private Button proximo2;
	private ImageButton arte1;
	private ImageButton arte2;
	private ImageButton paint1;
	private ImageButton paint2;
	private TextView textoarte1;
	private TextView textoarte2;
	private TextView textopaint1;
	private TextView textopaint2;
	public int acertos = 0;
	public int erros = 0;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		start = (Button) findViewById(R.id.start);
	    start.setOnClickListener(new View.OnClickListener() {
	    	   
	    	   @Override
	    	   public void onClick(View v) {    
	    	   setContentView(R.layout.fragment_main);
	    	   comecarJogo();
	    	    
	    	   }
	    	  });
		

		
	}

    public void comecarJogo(){
    	
    	
    	textoarte1 = (TextView) findViewById(R.id.textoarte1);
    	
    	textopaint1 = (TextView) findViewById(R.id.textopaint1);
    	
    	proximo1 = (Button) findViewById(R.id.proximo1);
    	
    	
    	arte1 = (ImageButton) findViewById(R.id.arte1);
    	
		arte1.setOnClickListener(new View.OnClickListener() {
 
			
			public void onClick(View v) {
 
				Toast.makeText(MainActivity.this, "Acertou!", Toast.LENGTH_SHORT).show();
				
				textoarte1.setVisibility(View.VISIBLE);
				textopaint1.setVisibility(View.VISIBLE);
				proximo1.setVisibility(View.VISIBLE);
			}
 
		});
		
        
    	
		paint1 = (ImageButton) findViewById(R.id.paint1);
   	   
		paint1.setOnClickListener(new View.OnClickListener() {
 
			
			public void onClick(View v) {
 
				Toast.makeText(MainActivity.this, "Errou!", Toast.LENGTH_SHORT).show();
				
				textoarte1.setVisibility(View.VISIBLE);
				textopaint1.setVisibility(View.VISIBLE);
				proximo1.setVisibility(View.VISIBLE);
				
 
			}
 
		});
		
         

          proximo1.setOnClickListener(new View.OnClickListener() {
  			
  			@Override
  			public void onClick(View v) {
  				
  				setContentView(R.layout.fragment_main2);
  				comecarJogo2();
  			}
  		});
      	
		
		
    }
    
    public void comecarJogo2(){
    	
    	textoarte2 = (TextView) findViewById(R.id.textoarte2);
    	textopaint2 = (TextView) findViewById(R.id.textopaint2);
    	proximo2 = (Button) findViewById(R.id.proximo2);
    	arte2 = (ImageButton) findViewById(R.id.arte2);
    	paint2= (ImageButton) findViewById(R.id.paint2);
    	
    	 paint2.setOnClickListener(new View.OnClickListener() {
    		 
 			
 			public void onClick(View v) {
  
 				Toast.makeText(MainActivity.this, "Errou!", Toast.LENGTH_SHORT).show();
 				
 				textoarte2.setVisibility(View.VISIBLE);
 				textopaint2.setVisibility(View.VISIBLE);
 				
 				
  
 			}
  
 		});
    	
    	 arte2.setOnClickListener(new View.OnClickListener() {
    		 
 			
 			public void onClick(View v) {
  
 				Toast.makeText(MainActivity.this, "Acertou!", Toast.LENGTH_SHORT).show();
 				
 				textoarte2.setVisibility(View.VISIBLE);
 				textopaint2.setVisibility(View.VISIBLE);
 				
 			}
  
 		});
    	
    	
    }
	

}
