import javax.swing.JOptionPane;

public class Exercicio23{

    public static void main(String[] args) {

        double portugues1 = Double.parseDouble(JOptionPane.showInputDialog(null, "PORTUGUÊS, insira a primeira nota"));
        double portugues2 = Double.parseDouble(JOptionPane.showInputDialog(null, "PORTUGUÊS, insira a segunda nota"));
        double portugues3 = Double.parseDouble(JOptionPane.showInputDialog(null, "PORTUGUÊS, insira a terceira nota"));
        double portugues4 = Double.parseDouble(JOptionPane.showInputDialog(null, "PORTUGUÊS, insira a quarta nota"));
        double mediaPortugues = (portugues1+portugues2+portugues3+portugues4)/4;

        double matematica1 = Double.parseDouble(JOptionPane.showInputDialog(null, "MATEMÁTICA, insira a primeira nota"));
        double matematica2 = Double.parseDouble(JOptionPane.showInputDialog(null, "MATEMÁTICA, insira a segunda nota"));
        double matematica3 = Double.parseDouble(JOptionPane.showInputDialog(null, "MATEMÁTICA, insira a terceira nota"));
        double matematica4 = Double.parseDouble(JOptionPane.showInputDialog(null, "MATEMÁTICA, insira a quarta nota"));
        double mediaMatematica = (matematica1+matematica2+matematica3+matematica4)/4;

        double ingles1 = Double.parseDouble(JOptionPane.showInputDialog(null, "INGLÊS, insira a primeira nota"));
        double ingles2 = Double.parseDouble(JOptionPane.showInputDialog(null, "INGLÊS, insira a segunda nota"));
        double ingles3 = Double.parseDouble(JOptionPane.showInputDialog(null, "INGLÊS, insira a terceira nota"));
        double ingles4 = Double.parseDouble(JOptionPane.showInputDialog(null, "INGLÊS, insira a quarta nota"));
        double mediaIngles = (ingles1+ingles2+ingles3+ingles4)/4;

        double biologia1 = Double.parseDouble(JOptionPane.showInputDialog(null, "BIOLOGIA, insira a primeira nota"));
        double biologia2 = Double.parseDouble(JOptionPane.showInputDialog(null, "BIOLOGIA, insira a segunda nota"));
        double biologia3 = Double.parseDouble(JOptionPane.showInputDialog(null, "BIOLOGIA, insira a terceira nota"));
        double biologia4 = Double.parseDouble(JOptionPane.showInputDialog(null, "BIOLOGIA, insira a quarta nota"));
        double mediaBiologia = (biologia1+biologia2+biologia3+biologia4)/4;

        double quimica1 = Double.parseDouble(JOptionPane.showInputDialog(null, "QUIMICA, insira a primeira nota"));
        double quimica2 = Double.parseDouble(JOptionPane.showInputDialog(null, "QUIMICA, insira a segunda nota"));
        double quimica3 = Double.parseDouble(JOptionPane.showInputDialog(null, "QUIMICA, insira a terceira nota"));
        double quimica4 = Double.parseDouble(JOptionPane.showInputDialog(null, "QUIMICA, insira a quarta nota"));
        double mediaQuimica = (quimica1+quimica2+quimica3+quimica4)/4;

        double fisica1 = Double.parseDouble(JOptionPane.showInputDialog(null, "FÍSICA, insira a primeira nota"));
        double fisica2 = Double.parseDouble(JOptionPane.showInputDialog(null, "FÍSICA, insira a segunda nota"));
        double fisica3 = Double.parseDouble(JOptionPane.showInputDialog(null, "FÍSICA, insira a terceira nota"));
        double fisica4 = Double.parseDouble(JOptionPane.showInputDialog(null, "FÍSICA, insira a quarta nota"));
        double mediaFisica = (fisica1+fisica2+fisica3+fisica4)/4;

        double sociologia1 = Double.parseDouble(JOptionPane.showInputDialog(null, "SOCIOLOGIA, insira a primeira nota"));
        double sociologia2 = Double.parseDouble(JOptionPane.showInputDialog(null, "SOCIOLOGIA, insira a segunda nota"));
        double sociologia3 = Double.parseDouble(JOptionPane.showInputDialog(null, "SOCIOLOGIA, insira a terceira nota"));
        double sociologia4 = Double.parseDouble(JOptionPane.showInputDialog(null, "SOCIOLOGIA, insira a quarta nota"));
        double mediaSociologia = (sociologia1+sociologia2+sociologia3+sociologia4)/4;

        double filosofia1 = Double.parseDouble(JOptionPane.showInputDialog(null, "FILOSOFIA, insira a primeira nota"));
        double filosofia2 = Double.parseDouble(JOptionPane.showInputDialog(null, "FILOSOFIA, insira a segunda nota"));
        double filosofia3 = Double.parseDouble(JOptionPane.showInputDialog(null, "FILOSOFIA, insira a terceira nota"));
        double filosofia4 = Double.parseDouble(JOptionPane.showInputDialog(null, "FILOSOFIA, insira a quarta nota"));
        double mediaFilosofia = (filosofia1+filosofia2+filosofia3+filosofia4)/4;

        double geografia1 = Double.parseDouble(JOptionPane.showInputDialog(null, "GEOGRAFIA, insira a primeira nota"));
        double geografia2 = Double.parseDouble(JOptionPane.showInputDialog(null, "GEOGRAFIA, insira a segunda nota"));
        double geografia3 = Double.parseDouble(JOptionPane.showInputDialog(null, "GEOGRAFIA, insira a terceira nota"));
        double geografia4 = Double.parseDouble(JOptionPane.showInputDialog(null, "GEOGRAFIA, insira a quarta nota"));
        double mediaGeografia = (geografia1+geografia2+geografia3+geografia4)/4;

        double historia1 = Double.parseDouble(JOptionPane.showInputDialog(null, "HISTÓRIA, insira a primeira nota"));
        double historia2 = Double.parseDouble(JOptionPane.showInputDialog(null, "HISTÓRIA, insira a segunda nota"));
        double historia3 = Double.parseDouble(JOptionPane.showInputDialog(null, "HISTÓRIA, insira a terceira nota"));
        double historia4 = Double.parseDouble(JOptionPane.showInputDialog(null, "HISTÓRIA, insira a quarta nota"));
        double mediaHistoria = (historia1+historia2+historia3+historia4)/4;

        double educacaoFisica1 = Double.parseDouble(JOptionPane.showInputDialog(null, "ED. FÍSICA, insira a primeira nota"));
        double educacaoFisica2 = Double.parseDouble(JOptionPane.showInputDialog(null, "ED. FÍSICA, insira a segunda nota"));
        double educacaoFisica3 = Double.parseDouble(JOptionPane.showInputDialog(null, "ED. FÍSICA, insira a terceira nota"));
        double educacaoFisica4 = Double.parseDouble(JOptionPane.showInputDialog(null, "ED. FÍSICA, insira a quarta nota"));
        double mediaEducacaoFisica = (educacaoFisica1+educacaoFisica2+educacaoFisica3+educacaoFisica4)/4;

        String mensagemFinal="";

        if (mediaPortugues>=mediaMatematica && mediaPortugues>=mediaIngles && mediaPortugues>=mediaBiologia && mediaPortugues>=mediaQuimica && mediaPortugues>=mediaFisica && mediaPortugues>=mediaSociologia && mediaPortugues>=mediaFilosofia && mediaPortugues>=mediaGeografia && mediaPortugues>=mediaHistoria && mediaPortugues>=mediaEducacaoFisica) {
            mensagemFinal += "Maior Média: PORTUGUÊS="+mediaPortugues;
        } else if(mediaMatematica>=mediaPortugues && mediaMatematica>=mediaIngles && mediaMatematica>=mediaBiologia && mediaMatematica>=mediaQuimica && mediaMatematica>=mediaFisica && mediaMatematica>=mediaSociologia && mediaMatematica>=mediaFilosofia && mediaMatematica>=mediaGeografia && mediaMatematica>=mediaHistoria && mediaMatematica>=mediaEducacaoFisica) {
            mensagemFinal += "Maior Média: MATEMÁTICA="+mediaMatematica;
        } else if(mediaIngles>=mediaMatematica && mediaIngles>=mediaPortugues && mediaIngles>=mediaBiologia && mediaIngles>=mediaQuimica && mediaIngles>=mediaFisica && mediaIngles>=mediaSociologia && mediaIngles>=mediaFilosofia && mediaIngles>=mediaGeografia && mediaIngles>=mediaHistoria && mediaPortugues>=mediaEducacaoFisica) {
            mensagemFinal += "Maior Média: INGLÊS="+mediaIngles;
        } else if(mediaBiologia>=mediaMatematica && mediaBiologia>=mediaIngles && mediaBiologia>=mediaPortugues && mediaBiologia>=mediaQuimica && mediaBiologia>=mediaFisica && mediaBiologia>=mediaSociologia && mediaBiologia>=mediaFilosofia && mediaBiologia>=mediaGeografia && mediaBiologia>=mediaHistoria && mediaBiologia>=mediaEducacaoFisica) {
            mensagemFinal += "Maior Média: BIOLOGIA="+mediaBiologia;
        } else if(mediaQuimica>=mediaMatematica && mediaQuimica>=mediaIngles && mediaQuimica>=mediaBiologia && mediaQuimica>=mediaQuimica && mediaQuimica>=mediaFisica && mediaQuimica>=mediaSociologia && mediaQuimica>=mediaFilosofia && mediaQuimica>=mediaGeografia && mediaQuimica>=mediaHistoria && mediaQuimica>=mediaEducacaoFisica) {
            mensagemFinal += "Maior Média: QUIMICA="+mediaQuimica;
        } else if(mediaFisica>=mediaMatematica && mediaFisica>=mediaIngles && mediaFisica>=mediaBiologia && mediaFisica>=mediaQuimica && mediaFisica>=mediaPortugues && mediaFisica>=mediaSociologia && mediaFisica>=mediaFilosofia && mediaFisica>=mediaGeografia && mediaFisica>=mediaHistoria && mediaFisica>=mediaEducacaoFisica) {
            mensagemFinal += "Maior Média: FÍSICA="+mediaFisica;
        } else if(mediaSociologia>=mediaMatematica && mediaSociologia>=mediaIngles && mediaSociologia>=mediaBiologia && mediaSociologia>=mediaQuimica && mediaSociologia>=mediaFisica && mediaSociologia>=mediaPortugues && mediaSociologia>=mediaFilosofia && mediaSociologia>=mediaGeografia && mediaSociologia>=mediaHistoria && mediaSociologia>=mediaEducacaoFisica) {
            mensagemFinal += "Maior Média: SOCIOLOGIA="+mediaSociologia;
        } else if(mediaFilosofia>=mediaMatematica && mediaFilosofia>=mediaIngles && mediaFilosofia>=mediaBiologia && mediaFilosofia>=mediaQuimica && mediaFilosofia>=mediaFisica && mediaFilosofia>=mediaSociologia && mediaFilosofia>=mediaPortugues && mediaFilosofia>=mediaGeografia && mediaFilosofia>=mediaHistoria && mediaFilosofia>=mediaEducacaoFisica) {
            mensagemFinal += "Maior Média: FILOSOFIA="+mediaFilosofia;
        } else if(mediaGeografia>=mediaMatematica && mediaGeografia>=mediaIngles && mediaGeografia>=mediaBiologia && mediaGeografia>=mediaQuimica && mediaGeografia>=mediaFisica && mediaGeografia>=mediaSociologia && mediaGeografia>=mediaFilosofia && mediaGeografia>=mediaPortugues && mediaGeografia>=mediaHistoria && mediaGeografia>=mediaEducacaoFisica) {
            mensagemFinal += "Maior Média: GEOGRAFIA="+mediaGeografia;
        } else if(mediaHistoria>=mediaMatematica && mediaHistoria>=mediaIngles && mediaHistoria>=mediaBiologia && mediaHistoria>=mediaQuimica && mediaHistoria>=mediaFisica && mediaHistoria>=mediaSociologia && mediaHistoria>=mediaFilosofia && mediaHistoria>=mediaGeografia && mediaHistoria>=mediaPortugues && mediaHistoria>=mediaEducacaoFisica) {
            mensagemFinal += "Maior Média: HISTÓRIA="+mediaHistoria;
        } else {
            mensagemFinal += "Maior Média: ED. FÍSICA="+mediaEducacaoFisica;
        }

        if (mediaPortugues<=mediaMatematica && mediaPortugues<=mediaIngles && mediaPortugues<=mediaBiologia && mediaPortugues<=mediaQuimica && mediaPortugues<=mediaFisica && mediaPortugues<=mediaSociologia && mediaPortugues<=mediaFilosofia && mediaPortugues<=mediaGeografia && mediaPortugues<=mediaHistoria && mediaPortugues<=mediaEducacaoFisica) {
            mensagemFinal += "\nMenor Média: PORTUGUÊS="+mediaPortugues;
        } else if(mediaMatematica<=mediaPortugues && mediaMatematica<=mediaIngles && mediaMatematica<=mediaBiologia && mediaMatematica<=mediaQuimica && mediaMatematica<=mediaFisica && mediaMatematica<=mediaSociologia && mediaMatematica<=mediaFilosofia && mediaMatematica<=mediaGeografia && mediaMatematica<=mediaHistoria && mediaMatematica<=mediaEducacaoFisica) {
            mensagemFinal += "\nMenor Média: MATEMÁTICA="+mediaMatematica;
        } else if(mediaIngles<=mediaMatematica && mediaIngles<=mediaPortugues && mediaIngles<=mediaBiologia && mediaIngles<=mediaQuimica && mediaIngles<=mediaFisica && mediaIngles<=mediaSociologia && mediaIngles<=mediaFilosofia && mediaIngles<=mediaGeografia && mediaIngles<=mediaHistoria && mediaPortugues<=mediaEducacaoFisica) {
            mensagemFinal += "\nMenor Média: INGLÊS="+mediaIngles;
        } else if(mediaBiologia<=mediaMatematica && mediaBiologia<=mediaIngles && mediaBiologia<=mediaPortugues && mediaBiologia<=mediaQuimica && mediaBiologia<=mediaFisica && mediaBiologia<=mediaSociologia && mediaBiologia<=mediaFilosofia && mediaBiologia<=mediaGeografia && mediaBiologia<=mediaHistoria && mediaBiologia<=mediaEducacaoFisica) {
            mensagemFinal += "\nMenor Média: BIOLOGIA="+mediaBiologia;
        } else if(mediaQuimica<=mediaMatematica && mediaQuimica<=mediaIngles && mediaQuimica<=mediaBiologia && mediaQuimica<=mediaQuimica && mediaQuimica<=mediaFisica && mediaQuimica<=mediaSociologia && mediaQuimica<=mediaFilosofia && mediaQuimica<=mediaGeografia && mediaQuimica<=mediaHistoria && mediaQuimica<=mediaEducacaoFisica) {
            mensagemFinal += "\nMenor Média: QUIMICA="+mediaQuimica;
        } else if(mediaFisica<=mediaMatematica && mediaFisica<=mediaIngles && mediaFisica<=mediaBiologia && mediaFisica<=mediaQuimica && mediaFisica<=mediaPortugues && mediaFisica<=mediaSociologia && mediaFisica<=mediaFilosofia && mediaFisica<=mediaGeografia && mediaFisica<=mediaHistoria && mediaFisica<=mediaEducacaoFisica) {
            mensagemFinal += "\nMenor Média: FÍSICA="+mediaFisica;
        } else if(mediaSociologia<=mediaMatematica && mediaSociologia<=mediaIngles && mediaSociologia<=mediaBiologia && mediaSociologia<=mediaQuimica && mediaSociologia<=mediaFisica && mediaSociologia<=mediaPortugues && mediaSociologia<=mediaFilosofia && mediaSociologia<=mediaGeografia && mediaSociologia<=mediaHistoria && mediaSociologia<=mediaEducacaoFisica) {
            mensagemFinal += "\nMenor Média: SOCIOLOGIA="+mediaSociologia;
        } else if(mediaFilosofia<=mediaMatematica && mediaFilosofia<=mediaIngles && mediaFilosofia<=mediaBiologia && mediaFilosofia<=mediaQuimica && mediaFilosofia<=mediaFisica && mediaFilosofia<=mediaSociologia && mediaFilosofia<=mediaPortugues && mediaFilosofia<=mediaGeografia && mediaFilosofia<=mediaHistoria && mediaFilosofia<=mediaEducacaoFisica) {
            mensagemFinal += "\nMenor Média: FILOSOFIA="+mediaFilosofia;
        } else if(mediaGeografia<=mediaMatematica && mediaGeografia<=mediaIngles && mediaGeografia<=mediaBiologia && mediaGeografia<=mediaQuimica && mediaGeografia<=mediaFisica && mediaGeografia<=mediaSociologia && mediaGeografia<=mediaFilosofia && mediaGeografia<=mediaPortugues && mediaGeografia<=mediaHistoria && mediaGeografia<=mediaEducacaoFisica) {
            mensagemFinal += "\nMenor Média: GEOGRAFIA="+mediaGeografia;
        } else if(mediaHistoria<=mediaMatematica && mediaHistoria<=mediaIngles && mediaHistoria<=mediaBiologia && mediaHistoria<=mediaQuimica && mediaHistoria<=mediaFisica && mediaHistoria<=mediaSociologia && mediaHistoria<=mediaFilosofia && mediaHistoria<=mediaGeografia && mediaHistoria<=mediaPortugues && mediaHistoria<=mediaEducacaoFisica) {
            mensagemFinal += "\nMenor Média: HISTÓRIA="+mediaHistoria;
        } else {
            mensagemFinal += "\nMenor Média: ED. FÍSICA="+mediaEducacaoFisica;
        }

        double mediaGeral = (mediaBiologia+mediaFilosofia+mediaFisica+mediaGeografia+mediaHistoria+mediaEducacaoFisica+mediaIngles+mediaMatematica+mediaPortugues+mediaQuimica+mediaSociologia)/11;

        if (mediaGeral<=2) {
            mensagemFinal += "\nMédia Geral:Você deve se empenhar muito mais!\nMédia: "+mediaGeral;
        } else if (mediaGeral<=5) {
            mensagemFinal += "\nMédia Geral:Você deve se empenhar um pouco mais!\nMédia: "+mediaGeral;
        } else if (mediaGeral<=8){
            mensagemFinal += "\nMédia Geral:Você deve se empenhar porém não muito!\nMédia: "+mediaGeral; 
        }else{
            mensagemFinal += "\nMédia Geral:Você tem o direito a um dia de descanso!\nMédia: "+mediaGeral;
        }

        JOptionPane.showMessageDialog(null,
        mensagemFinal,"Média Geral",
        JOptionPane.WARNING_MESSAGE
        );

    }
}