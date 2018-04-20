import javax.swing.JOptionPane;

public class Exercicio17 {

    public static void main(String[] args) {
        
        String anoDigitado = JOptionPane.showInputDialog(null, "Digite a ano");

        while(anoDigitado.length()!=4){
            anoDigitado = JOptionPane.showInputDialog(null, "Digite o ano com 4 digitos");
        }
        String anoEscrito = "";

        if (anoDigitado.charAt(0)=='1') {
            anoEscrito+="mil";
        } else if (anoDigitado.charAt(0)=='2') {
            anoEscrito+="dois mil";
        }

        if (anoDigitado.charAt(1)=='1') {
            anoEscrito+=" cento";
        } else if (anoDigitado.charAt(1)=='2') {
            anoEscrito+=" duzentos";
        }else if (anoDigitado.charAt(1)=='3') {
            anoEscrito+=" trezentos";
        }else if (anoDigitado.charAt(1)=='4') {
            anoEscrito+=" quatrocentos";
        }else if (anoDigitado.charAt(1)=='5') {
            anoEscrito+=" quinhentos";
        }else if (anoDigitado.charAt(1)=='6') {
            anoEscrito+=" seiscentos";
        }else if (anoDigitado.charAt(1)=='7') {
            anoEscrito+=" setecentos";
        }else if (anoDigitado.charAt(1)=='8') {
            anoEscrito+=" oitocentos";
        }else if (anoDigitado.charAt(1)=='9') {
            anoEscrito+=" novecentos";
        }

        if (anoDigitado.charAt(2)=='1' && anoDigitado.charAt(3)=='1') {
            anoEscrito+=" e onze";
        } else if (anoDigitado.charAt(2)=='1' && anoDigitado.charAt(3)=='2') {
            anoEscrito+=" e doze";
        } else if (anoDigitado.charAt(2)=='1' && anoDigitado.charAt(3)=='3') {
            anoEscrito+=" e treze";
        } else if (anoDigitado.charAt(2)=='1' && anoDigitado.charAt(3)=='4') {
            anoEscrito+=" e quatorze";
        } else if (anoDigitado.charAt(2)=='1' && anoDigitado.charAt(3)=='5') {
            anoEscrito+=" e quinze";
        } else if (anoDigitado.charAt(2)=='1' && anoDigitado.charAt(3)=='6') {
            anoEscrito+=" e desseseis";
        } else if (anoDigitado.charAt(2)=='1' && anoDigitado.charAt(3)=='7') {
            anoEscrito+=" e dessesete";
        } else if (anoDigitado.charAt(2)=='1' && anoDigitado.charAt(3)=='8') {
            anoEscrito+=" e dezoito";
        } else if (anoDigitado.charAt(2)=='1' && anoDigitado.charAt(3)=='9') {
            anoEscrito+=" e dezenove";
        } else if (anoDigitado.charAt(2)=='1' && anoDigitado.charAt(3)=='0') {
            anoEscrito+=" e dez";
        } else if (anoDigitado.charAt(2)=='2') {
            anoEscrito+=" e vinte";
        } else if (anoDigitado.charAt(2)=='3') {
            anoEscrito+=" e trinta";
        }else if (anoDigitado.charAt(2)=='4') {
            anoEscrito+=" e quarenta";
        }else if (anoDigitado.charAt(2)=='5') {
            anoEscrito+=" e ciquenta";
        }else if (anoDigitado.charAt(2)=='6') {
            anoEscrito+=" e sessenta";
        }else if (anoDigitado.charAt(2)=='7') {
            anoEscrito+=" e setenta";
        }else if (anoDigitado.charAt(2)=='8') {
            anoEscrito+=" e oitenta";
        }else if (anoDigitado.charAt(2)=='9') {
            anoEscrito+=" e noventa";
        }

        if (anoDigitado.charAt(3)!=0) {
            if (anoDigitado.charAt(3)=='1') {
                anoEscrito+=" e um";
            } else if (anoDigitado.charAt(3)=='2') {
                anoEscrito+=" e dois";
            }else if (anoDigitado.charAt(3)=='3') {
                anoEscrito+=" e três";
            }else if (anoDigitado.charAt(3)=='4') {
                anoEscrito+=" e quatro";
            }else if (anoDigitado.charAt(3)=='5') {
                anoEscrito+=" e cinco";
            }else if (anoDigitado.charAt(3)=='6') {
                anoEscrito+=" e seis";
            }else if (anoDigitado.charAt(3)=='7') {
                anoEscrito+=" e sete";
            }else if (anoDigitado.charAt(3)=='8') {
                anoEscrito+=" e oito";
            }else if (anoDigitado.charAt(3)=='9') {
                anoEscrito+=" e nove";
            } 
        }

        System.out.println(anoEscrito);

    }

}