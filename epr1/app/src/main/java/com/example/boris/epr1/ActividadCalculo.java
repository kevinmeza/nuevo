package com.example.boris.epr1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActividadCalculo extends AppCompatActivity {
    private EditText et_epr1,et_epe1,et_epr2,et_epe2,et_examen,et_eva1,et_eva2,et_eva3,et_eva4,et_promedio,et_presentacion;
    private Button btn_normal,btn_examen;
    private TextView txt_exam;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_calculo);

        et_epr1=(EditText)findViewById(R.id.et_epr1);
        et_epr2=(EditText) findViewById(R.id.et_epr2);
        et_epe1=(EditText) findViewById(R.id.et_epe1);
        et_epe2=(EditText) findViewById(R.id.et_epe2);
        et_eva1=(EditText) findViewById(R.id.et_eva1);
        et_eva2=(EditText) findViewById(R.id.et_eva2);
        et_eva3=(EditText) findViewById(R.id.et_eva3);
        et_eva4=(EditText) findViewById(R.id.et_eva4);
        et_promedio=(EditText) findViewById(R.id.et_promedio);
        et_presentacion=(EditText) findViewById(R.id.et_presentacion);
        et_examen=(EditText) findViewById(R.id.et_examen);
        btn_normal=(Button) findViewById(R.id.btn_normal);
        btn_examen=(Button) findViewById(R.id.btn_examen);
        txt_exam=(TextView) findViewById(R.id.txt_exam);
    }
    public void operaciones(View v) {


        double epr1 = Double.parseDouble(et_epr1.getText().toString());
        double epe1= Double.parseDouble(et_epe1.getText().toString());
        double epr2=Double.parseDouble(et_epr2.getText().toString());
        double epe2=Double.parseDouble(et_epe2.getText().toString());
        double eva1=Double.parseDouble(et_eva1.getText().toString());
        double eva2=Double.parseDouble(et_eva2.getText().toString());
        double eva3=Double.parseDouble(et_eva3.getText().toString());
        double eva4=Double.parseDouble(et_eva4.getText().toString());

        double nota1=epr1*0.10;
        double nota2=epe1*0.15;
        double nota3=epr2*0.20;
        double nota4=epe2*0.25;

        double promeva=(((eva1+eva2+eva3+eva4)/4)*0.30);
        double promedio=(nota1+nota2+nota3+nota4+promeva);
        double chek=((eva1+eva2+eva3+eva4)/4);
        double notapresexamen=promedio*0.70;
        double ex1=(notapresexamen-4);
        double ex2=(ex1*100)/30;


        et_promedio.setText(Double.toString(promedio));
        et_presentacion.setText(Double.toString(notapresexamen)+"  necesitas:"+ex2);

        if (promedio < 5.5 || epr1 < 4 || epe1 < 4 || epr2 < 4 || epe2 < 4 || chek < 4 ){



            txt_exam.setText("DEBES INGRESAR TU EXAMEN!!!");
            Toast toast1 =
                    Toast.makeText(getApplicationContext(),
                            "Debes rendir Examen "+ "necesitas un "+ex2, Toast.LENGTH_LONG);

            toast1.show();
        }
        else{
            Toast toast1 =
                    Toast.makeText(getApplicationContext(),
                            "Aprobaste y te eximes", Toast.LENGTH_LONG);

            toast1.show();
        }


    }

    public void examenes(View v){

        double epr1 = Double.parseDouble(et_epr1.getText().toString());
        double epe1= Double.parseDouble(et_epe1.getText().toString());
        double epr2=Double.parseDouble(et_epr2.getText().toString());
        double epe2=Double.parseDouble(et_epe2.getText().toString());
        double eva1=Double.parseDouble(et_eva1.getText().toString());
        double eva2=Double.parseDouble(et_eva2.getText().toString());
        double eva3=Double.parseDouble(et_eva3.getText().toString());
        double eva4=Double.parseDouble(et_eva4.getText().toString());

        double examen=Double.parseDouble(et_examen.getText().toString());
        double excal=examen*0.30;

        double nota1=epr1*0.10;
        double nota2=epe1*0.15;
        double nota3=epr2*0.20;
        double nota4=epe2*0.25;

        double promeva=(((eva1+eva2+eva3+eva4)/4)*0.30);
        double promedio=(nota1+nota2+nota3+nota4+promeva);
        double chek=((eva1+eva2+eva3+eva4)/4);
        double notapresexamen=promedio*0.70;

        double exfin=notapresexamen+excal;


        et_promedio.setText(Double.toString(exfin));
        et_presentacion.setText(Double.toString(notapresexamen));

        if (exfin > 3.95){
            Toast toast1 =
                    Toast.makeText(getApplicationContext(),
                            "Felicidades Aprobaste", Toast.LENGTH_LONG);

            toast1.show();
        }
        else{
            Toast toast1 =
                    Toast.makeText(getApplicationContext(),
                            "Reprobaste", Toast.LENGTH_LONG);

            toast1.show();
        }

    }
}
