package com.example.mycalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.style.TtsSpan;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnAdd, btnDec, btnMul, btnDiv, btnEqu, btnClear, btnDel;//���ڴ���������ܰ�ť
    private TextView txtResult;
    private StringBuffer digitA = new StringBuffer(), digitB = new StringBuffer();
    private boolean isChar = false;//����Ƿ��������
    private int operator = 0;//Ĭ�������Ϊ+
    private boolean isDigitA = true;//��ǵ�1���������������˸�ɾ��txtResult������

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = 0; //�����+
                isChar = true;
                isDigitA = false;
            }
        });
        btnDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = 1;//�������
                isChar = true;
                isDigitA = false;
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = 2;//�������
                isChar = true;
                isDigitA = false;
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = 3;//�������
                isChar = true;
                isDigitA = false;
            }
        });
        btnEqu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float da = Float.parseFloat(digitA.toString());
                float db = Float.parseFloat(digitB.toString());
                switch (operator) {
                    case 0:
                        txtResult.setText(da + db + "");
                        break;
                    case 1:
                        txtResult.setText(da - db + "");
                        break;
                    case 2:
                        txtResult.setText(da * db + "");
                        break;
                    case 3:
                        txtResult.setText(da / db + "");
                        break;
                }
                isChar = true;
                isDigitA = true;
                
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                digitA = new StringBuffer();
                digitB = new StringBuffer();
                isChar = false;
                txtResult.setText("");
            }
        });
        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = txtResult.getText().toString();
                if (isDigitA) {
                    digitA = new StringBuffer();

                    if (temp.length() > 0)
                        if (temp.length() == 1) {
                            temp = "0";
                        } else {
                            temp = temp.substring(0, temp.length() - 1);
                        }
                    txtResult.setText(temp);
                    digitA.append(txtResult.getText().toString());
                } else {
                    digitB = new StringBuffer();

                    if (temp.length() > 0)
                        if (temp.length() == 1) {
                            temp = "0";
                        } else {
                            temp = temp.substring(0, temp.length() - 1);
                        }
                    txtResult.setText(temp);
                    digitB.append(txtResult.getText().toString());
                }
            }
        });
    }

    void init() {
        btnAdd = (Button) this.findViewById(R.id.btn_add);
        btnDec = (Button) this.findViewById(R.id.btn_dec);
        btnMul = (Button) this.findViewById(R.id.btn_mul);
        btnDiv = (Button) this.findViewById(R.id.btn_div);
        btnEqu = (Button) this.findViewById(R.id.btn_equ);
        btnClear = (Button) this.findViewById(R.id.btn_clear);
        btnDel = (Button) this.findViewById(R.id.btn_del);
        txtResult = (TextView) this.findViewById(R.id.txtresult);
    }

    public void calClick(View view) {
        switch (view.getId()) {
            case R.id.btn_0:
                if (isChar) {//����Ѿ����������������ʾ���������գ�����0
                    txtResult.setText("");
                    digitB.append("0");
                    txtResult.setText(digitB.toString());
                } else {
                    digitA.append("0");
                    txtResult.setText(digitA.toString());
                }
                break;
            case R.id.btn_1:
                if (isChar) {
                    txtResult.setText("");
                    digitB.append("1");
                    txtResult.setText(digitB.toString());
                } else {
                    digitA.append("1");
                    txtResult.setText(digitA.toString());
                }
                break;
            case R.id.btn_2:
                if (isChar) {
                    txtResult.setText("");
                    digitB.append("2");
                    txtResult.setText(digitB.toString());
                } else {
                    digitA.append("2");
                    txtResult.setText(digitA.toString());
                }

                break;
            case R.id.btn_3:
                if (isChar) {
                    txtResult.setText("");
                    digitB.append("3");
                    txtResult.setText(digitB.toString());
                } else {
                    digitA.append("3");
                    txtResult.setText(digitA.toString());
                }
                break;
            case R.id.btn_4:

                if (isChar) {
                    txtResult.setText("");
                    digitB.append("4");
                    txtResult.setText(digitB.toString());
                } else {
                    digitA.append("4");
                    txtResult.setText(digitA.toString());
                }
                break;
            case R.id.btn_5:

                if (isChar) {
                    txtResult.setText("");
                    digitB.append("5");
                    txtResult.setText(digitB.toString());
                } else {
                    digitA.append("5");
                    txtResult.setText(digitA.toString());
                }
                break;
            case R.id.btn_6:

                if (isChar) {
                    txtResult.setText("");
                    digitB.append("6");
                    txtResult.setText(digitB.toString());
                } else {
                    digitA.append("6");
                    txtResult.setText(digitA.toString());
                }
                break;
            case R.id.btn_7:
                if (isChar) {
                    txtResult.setText("");
                    digitB.append("7");
                    txtResult.setText(digitB.toString());
                } else {
                    digitA.append("7");
                    txtResult.setText(digitA.toString());
                }
                break;
            case R.id.btn_8:
                if (isChar) {
                    txtResult.setText("");
                    digitB.append("8");
                    txtResult.setText(digitB.toString());
                } else {
                    digitA.append("8");
                    txtResult.setText(digitA.toString());
                }
                break;
            case R.id.btn_9:
                if (isChar) {
                    txtResult.setText("");
                    digitB.append("9");
                    txtResult.setText(digitB.toString());
                } else {
                    digitA.append("9");
                    txtResult.setText(digitA.toString());
                }
                break;

            case R.id.btn_dot:
                if (isChar) {
                    txtResult.setText("");
                    digitB.append(".");
                    txtResult.setText(digitB.toString());
                } else {
                    digitA.append(".");
                    txtResult.setText(digitA.toString());
                }
                break;

        }



    }
}
