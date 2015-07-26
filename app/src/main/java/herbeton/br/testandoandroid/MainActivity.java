package herbeton.br.testandoandroid;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    String valor1 = "", valor2 = "", operacao = "";
    String valorTotalEditText = "";
    int numVirgulas = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void soma(View view){
        TextView varLayout1 = (TextView)  findViewById(R.id.displayNumero);
        TextView resultMostra = (TextView) findViewById(R.id.boxResultado);
        if(valor1 == "") {
            valor1 = varLayout1.getText().toString();
        }
        operacao = "soma";
        varLayout1.setText("");
        valorTotalEditText = "";
        if(valor1 != "" && valor2 != "") {
            Float val1, val2;
            val1 = Float.valueOf(valor1);
            val2 = Float.valueOf(valor2);
            Float result = (Float) (val1 + val2);
            igual(view);
            resultMostra.setText("" + result);
            valor1 = "";
            valor2 = "";
            operacao = "";
        }
    }
    public void igual(View view){
        TextView textViewResultado = (TextView) findViewById(R.id.boxResultado);
        textViewResultado.setText("");
        //if(valor1 != ""){
        TextView editText = (TextView) findViewById(R.id.displayNumero);
        valor2 = editText.getText().toString();
        //}
        if(operacao == "soma"){
            soma(view);
        }
        else if(operacao == "subtracao"){
            subtracao(view);
        }
        else if(operacao == "multiplicacao"){
            multiplicacao(view);
        }
        else if(operacao == "divisao"){
            divisao(view);
        }
    }

    public void divisao(View view) {
        TextView editText = (TextView) findViewById(R.id.displayNumero);
        TextView textView = (TextView) findViewById(R.id.boxResultado);
        if(valor1 == "") {
            valor1 = editText.getText().toString();
        }
        editText.setText("");
        operacao = "divisao";
        valorTotalEditText = "";
        if(valor1 != "" && valor2 != ""){
            float val1, val2, resultado;
            val1 = Float.valueOf(valor1);
            val2 = Float.valueOf(valor2);
            resultado = val1 / val2;
            igual(view);
            textView.setText(""+resultado);
            valor1 = "";
            valor2 = "";
            operacao = "";
        }
    }

    public void multiplicacao(View view) {
        TextView editText = (TextView) findViewById(R.id.displayNumero);
        TextView textView = (TextView) findViewById(R.id.boxResultado);
        if(valor1 == "") {
            valor1 = editText.getText().toString();
        }
        editText.setText("");
        operacao = "multiplicacao";
        valorTotalEditText = "";
        if(valor1 != "" && valor2 != ""){
            float val1, val2, resultado;
            val1 = Float.valueOf(valor1);
            val2 = Float.valueOf(valor2);
            resultado = val1 * val2;
            igual(view);
            textView.setText(""+resultado);
            valor1 = "";
            valor2 = "";
            operacao = "";
        }
    }

    public void subtracao(View view) {
        TextView editText = (TextView) findViewById(R.id.displayNumero);
        TextView textView = (TextView) findViewById(R.id.boxResultado);
        if(valor1 == "") {
            valor1 = editText.getText().toString();
        }
        //editText.setText("");
        operacao = "subtracao";
        editText.setText("");
        valorTotalEditText = "";
        if(valor1 != "" && valor2 != ""){
            float val1, val2, resultado;
            val1 = Float.valueOf(valor1);
            val2 = Float.valueOf(valor2);
            resultado = val1 - val2;
            igual(view);
            textView.setText(""+resultado);
            valor1 = "";
            valor2 = "";
            operacao = "";
        }
    }

    public void bt1(View view){
        TextView edText1 = (TextView) findViewById(R.id.displayNumero);
        valorTotalEditText += "1";
        edText1.setText(valorTotalEditText);
        edText1.moveCursorToVisibleOffset();
    }
    public void bt2(View view){
        TextView edText1 = (TextView) findViewById(R.id.displayNumero);
        valorTotalEditText += "2";
        edText1.setText(valorTotalEditText);
    }
    public void bt3(View view){
        TextView edText1 = (TextView) findViewById(R.id.displayNumero);
        valorTotalEditText += "3";
        edText1.setText(valorTotalEditText);
    }
    public void bt4(View view){
        TextView edText1 = (TextView) findViewById(R.id.displayNumero);
        valorTotalEditText += "4";
        edText1.setText(valorTotalEditText);
    }
    public void bt5(View view){
        TextView edText1 = (TextView) findViewById(R.id.displayNumero);
        valorTotalEditText += "5";
        edText1.setText(valorTotalEditText);
    }
    public void bt6(View view){
        TextView edText1 = (TextView) findViewById(R.id.displayNumero);
        valorTotalEditText += "6";
        edText1.setText(valorTotalEditText);
    }
    public void bt7(View view){
        TextView edText1 = (TextView) findViewById(R.id.displayNumero);
        valorTotalEditText += "7";
        edText1.setText(valorTotalEditText);
    }
    public void bt8(View view){
        TextView edText1 = (TextView) findViewById(R.id.displayNumero);
        valorTotalEditText += "8";
        edText1.setText(valorTotalEditText);
    }
    public void bt9(View view){
        TextView edText1 = (TextView) findViewById(R.id.displayNumero);
        valorTotalEditText += "9";
        edText1.setText(valorTotalEditText);
    }
    public void bt0(View view){
        TextView edText1 = (TextView) findViewById(R.id.displayNumero);
        valorTotalEditText += "0";
        edText1.setText(valorTotalEditText);

    }
    public void limparTela(View view){
        TextView editText = (TextView) findViewById(R.id.displayNumero);
        TextView textViewResultado = (TextView) findViewById(R.id.boxResultado);
        editText.setText("");
        if(operacao != "raizQuadrada") {
            textViewResultado.setText("");
        }
        valor1 = "";
        valor2 = "";
        operacao = "";
        valorTotalEditText = "";

    }

    public void btnPorcentagem(View view) {
    }

    public void btVirgula(View view) {
        if(numVirgulas < 1){
            TextView edText1 = (TextView) findViewById(R.id.displayNumero);
            valorTotalEditText += ".";
            edText1.setText(valorTotalEditText);
            numVirgulas++;
        }
    }

    public void btLimparUm(View view) {
        TextView textView = (TextView) findViewById(R.id.displayNumero);
        String valorAtual = textView.getText().toString();
        int nummeroElementos = valorAtual.length();
        if(nummeroElementos != 0) {
            String numeroString = String.valueOf(valorAtual);
            StringBuilder buffer = new StringBuilder();
            buffer.append(numeroString);
            buffer.delete(nummeroElementos - 1, nummeroElementos);
            String novoNumeroString = buffer.toString();

            textView.setText(novoNumeroString);
        }
    }

    public void btRaizQuadrada(View view) {
        TextView textView = (TextView) findViewById(R.id.displayNumero);
        TextView textViewResultado = (TextView) findViewById(R.id.boxResultado);
        valor1 = textView.getText().toString();
        Float val1, resultado;
        val1 = Float.valueOf(valor1);
        operacao = "raizQuadrada";
        limparTela(view);
        resultado = val1 * val1;

        textViewResultado.setText(resultado.toString());
    }
}
