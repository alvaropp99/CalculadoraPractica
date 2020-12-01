package com.example.calculadorapractica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    Button btnLimpiar;
    TextView tvResult;

    String op, show,r;
    double resultado;

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
    Button btnSumar, btnRestar,btnMultiplicar,btnDividir,btnPunto,btnBorrar,btnMasMen,btnIgual,btnResto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLimpiar=(Button)findViewById(R.id.cBtn);
        tvResult=(TextView)findViewById(R.id.tvResultado);


        tvResult.setText("");

        btn1=(Button)findViewById(R.id.unoBtn);
        btn2=(Button)findViewById(R.id.dosBtn);
        btn3=(Button)findViewById(R.id.tresBtn);
        btn4=(Button)findViewById(R.id.cuatroBtn);
        btn5=(Button)findViewById(R.id.cincoBtn);
        btn6=(Button)findViewById(R.id.seisBtn);
        btn7=(Button)findViewById(R.id.sieteBtn);
        btn8=(Button)findViewById(R.id.ochoBtn);
        btn9=(Button)findViewById(R.id.nueveBtn);
        btn0=(Button)findViewById(R.id.ceroBtn);

        btnSumar=(Button)findViewById(R.id.sumarBtn);
        btnRestar=(Button)findViewById(R.id.restarBtn);
        btnMultiplicar=(Button)findViewById(R.id.multiplicarBtn);
        btnDividir=(Button)findViewById(R.id.dividirBtn);
        btnPunto=(Button)findViewById(R.id.puntoBtn);
        btnBorrar=(Button)findViewById(R.id.borrarBtn);
        btnMasMen=(Button)findViewById(R.id.masMenosBtn);
        btnIgual=(Button)findViewById(R.id.igualBtn);
        btnResto=(Button)findViewById(R.id.restoBtn);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"0");
            }
        });

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("");
                show="";
                tvResult.setText(show);
                r="";
                op="";
            }
        });

        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                show=tvResult.getText().toString();
                if(show.length()>0){
                    show=show.substring(0,show.length()-1);
                    tvResult.setText(show);
                }
            }
        });

        btnPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show=tvResult.getText().toString();
                if(!(show.contains("."))){
                    tvResult.setText(tvResult.getText()+".");
                }
            }
        });

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r=tvResult.getText().toString();
                op="+";
                tvResult.setText("");
            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r=tvResult.getText().toString();
                op="-";
                tvResult.setText("");
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r=tvResult.getText().toString();
                op="*";
                tvResult.setText("");
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r=tvResult.getText().toString();
                op="/";
                tvResult.setText("");
            }
        });

        btnResto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r=tvResult.getText().toString();
                op="%";
                tvResult.setText("");
            }
        });

        btnMasMen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=tvResult.getText().toString();

                if(!n.contains("-")){
                    tvResult.setText("-"+n);
                }else{
                    try {
                        tvResult.setText(n.split("-")[1]);
                    }catch (IndexOutOfBoundsException e){

                    }
                }
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show=tvResult.getText().toString();
                show=show+"1";
                switch (op){
                    case "+":
                        resultado=Double.parseDouble(r)+Double.parseDouble(tvResult.getText().toString());
                        tvResult.setText(String.valueOf(resultado));
                        break;

                    case "-":
                        resultado=Double.parseDouble(r)-Double.parseDouble(tvResult.getText().toString());
                        tvResult.setText(String.valueOf(resultado));
                        break;
                    case "*":
                        resultado=Double.parseDouble(r)*Double.parseDouble(tvResult.getText().toString());
                        tvResult.setText(String.valueOf(resultado));
                        break;
                    case "/":
                        resultado=Double.parseDouble(r)/Double.parseDouble(tvResult.getText().toString());
                        tvResult.setText(String.valueOf(resultado));
                        break;

                    case "%":
                        resultado=Double.parseDouble(r)%Double.parseDouble(tvResult.getText().toString());
                        tvResult.setText(String.valueOf(resultado));
                        break;
                }
            }
        });
    }
}