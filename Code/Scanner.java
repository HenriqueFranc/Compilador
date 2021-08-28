


public class Scanner {
    private char currentChar = 'N' ; // primeiro caracter do arquivo, fazer ainda

    private byte currentKind;
    private StringBuffer currentvalor;

    private void take (char expectedChar ){
        if(currentChar == expectedChar){
            currentvalor.append(currentChar);
            currentChar = 'n'; // proximo caracter do arquivo
        }else{
            //report erro
        }
    }

    private void takeIt (){
        currentvalor.append(currentChar);
        currentChar = 'n'; // proximo caracter do arquivo
    }

    private boolean isDigit(char c){
        //retornar verdadeiro se digito
    }
    private boolean isLetter(char c){
        //retornar verdadeiro se letra
    }
    private boolean isGraphic(char c){
        //retornar verdadeiro se graphic letra digito ou outros
    }

    private byte scanToken(){
        switch (currentChar) {
            case 'a': 
                takeIt();
                while(isLetter(currentChar) || isDigit(currentChar)){
                    takeIt();
                }
                return Token.IDENTIFIER;
            case 'b': 
                takeIt();
                while(isLetter(currentChar) || isDigit(currentChar)){
                    takeIt();
                }
                return Token.IDENTIFIER;
            case 'c': 
                takeIt();
                while(isLetter(currentChar) || isDigit(currentChar)){
                    takeIt();
                }
                return Token.IDENTIFIER;
            case 'd': 
                takeIt();
                while(isLetter(currentChar) || isDigit(currentChar)){
                    takeIt();
                }
                return Token.IDENTIFIER;
            case 'e': 
                takeIt();
                while(isLetter(currentChar) || isDigit(currentChar)){
                    takeIt();
                }
                return Token.IDENTIFIER;
            case 'f': 
                takeIt();
                while(isLetter(currentChar) || isDigit(currentChar)){
                    takeIt();
                }
                return Token.IDENTIFIER;
            case 'g': 
                takeIt();
                while(isLetter(currentChar) || isDigit(currentChar)){
                    takeIt();
                }
                return Token.IDENTIFIER;
            case 'h': 
                takeIt();
                while(isLetter(currentChar) || isDigit(currentChar)){
                    takeIt();
                }
                return Token.IDENTIFIER;
            case 'i': 
                takeIt();
                while(isLetter(currentChar) || isDigit(currentChar)){
                    takeIt();
                }
                return Token.IDENTIFIER;
            case 'j': 
                takeIt();
                while(isLetter(currentChar) || isDigit(currentChar)){
                    takeIt();
                }
                return Token.IDENTIFIER;
            case 'k': 
                takeIt();
                while(isLetter(currentChar) || isDigit(currentChar)){
                    takeIt();
                }
                return Token.IDENTIFIER;
            case 'l': 
                takeIt();
                while(isLetter(currentChar) || isDigit(currentChar)){
                    takeIt();
                }
                return Token.IDENTIFIER;
            case 'm': 
                takeIt();
                while(isLetter(currentChar) || isDigit(currentChar)){
                    takeIt();
                }
                return Token.IDENTIFIER;
            case 'n': 
                takeIt();
                while(isLetter(currentChar) || isDigit(currentChar)){
                    takeIt();
                }
                return Token.IDENTIFIER;
            case 'o': 
                takeIt();
                while(isLetter(currentChar) || isDigit(currentChar)){
                    takeIt();
                }
                return Token.IDENTIFIER;
            case 'p': 
                takeIt();
                while(isLetter(currentChar) || isDigit(currentChar)){
                    takeIt();
                }
                return Token.IDENTIFIER;
            case 'q': 
                takeIt();
                while(isLetter(currentChar) || isDigit(currentChar)){
                    takeIt();
                }
                return Token.IDENTIFIER;
            case 'r': 
                takeIt();
                while(isLetter(currentChar) || isDigit(currentChar)){
                    takeIt();
                }
                return Token.IDENTIFIER;
            case 's': 
                takeIt();
                while(isLetter(currentChar) || isDigit(currentChar)){
                    takeIt();
                }
                return Token.IDENTIFIER;
            case 't': 
                takeIt();
                while(isLetter(currentChar) || isDigit(currentChar)){
                    takeIt();
                }
                return Token.IDENTIFIER;
            case 'u': 
                takeIt();
                while(isLetter(currentChar) || isDigit(currentChar)){
                    takeIt();
                }
                return Token.IDENTIFIER;
            case 'v': 
                takeIt();
                while(isLetter(currentChar) || isDigit(currentChar)){
                    takeIt();
                }
                return Token.IDENTIFIER;
            case 'w': 
                takeIt();
                while(isLetter(currentChar) || isDigit(currentChar)){
                    takeIt();
                }
                return Token.IDENTIFIER;
            case 'x': 
                takeIt();
                while(isLetter(currentChar) || isDigit(currentChar)){
                    takeIt();
                }
                return Token.IDENTIFIER;
            case 'z': 
                takeIt();
                while(isLetter(currentChar) || isDigit(currentChar)){
                    takeIt();
                }
                return Token.IDENTIFIER;
            case '0':
                takeIt();
                while (isDigit(currentChar)){
                    takeIt();
                }
                if(currentChar == '.'){
                    takeIt();
                    while (isDigit(currentChar)){
                             takeIt();
                        }
                    return Token.FLOATLITERAL;
                }else{
                    return Token.INTLITERAL;
                }
            case '1':
                takeIt();
                while (isDigit(currentChar)){
                    takeIt();
                }
                if(currentChar == '.'){
                    takeIt();
                    while (isDigit(currentChar)){
                             takeIt();
                        }
                    return Token.FLOATLITERAL;
                }else{
                    return Token.INTLITERAL;
                }
            case '2':
                takeIt();
                while (isDigit(currentChar)){
                    takeIt();
                }
                if(currentChar == '.'){
                    takeIt();
                    while (isDigit(currentChar)){
                             takeIt();
                        }
                    return Token.FLOATLITERAL;
                }else{
                    return Token.INTLITERAL;
                }
            case '3':
                takeIt();
                while (isDigit(currentChar)){
                    takeIt();
                }
                if(currentChar == '.'){
                    takeIt();
                    while (isDigit(currentChar)){
                             takeIt();
                        }
                    return Token.FLOATLITERAL;
                }else{
                    return Token.INTLITERAL;
                }
            case '4':
                takeIt();
                while (isDigit(currentChar)){
                    takeIt();
                }
                if(currentChar == '.'){
                    takeIt();
                    while (isDigit(currentChar)){
                             takeIt();
                        }
                    return Token.FLOATLITERAL;
                }else{
                    return Token.INTLITERAL;
                }
            case '5':
                takeIt();
                while (isDigit(currentChar)){
                    takeIt();
                }
                if(currentChar == '.'){
                    takeIt();
                    while (isDigit(currentChar)){
                             takeIt();
                        }
                    return Token.FLOATLITERAL;
                }else{
                    return Token.INTLITERAL;
                }
            case '6':
                takeIt();
                while (isDigit(currentChar)){
                    takeIt();
                }
                if(currentChar == '.'){
                    takeIt();
                    while (isDigit(currentChar)){
                             takeIt();
                        }
                    return Token.FLOATLITERAL;
                }else{
                    return Token.INTLITERAL;
                }
            case '7':
                takeIt();
                while (isDigit(currentChar)){
                    takeIt();
                }
                if(currentChar == '.'){
                    takeIt();
                    while (isDigit(currentChar)){
                             takeIt();
                        }
                    return Token.FLOATLITERAL;
                }else{
                    return Token.INTLITERAL;
                }
            case '8':
                takeIt();
                while (isDigit(currentChar)){
                    takeIt();
                }
                if(currentChar == '.'){
                    takeIt();
                    while (isDigit(currentChar)){
                             takeIt();
                        }
                    return Token.FLOATLITERAL;
                }else{
                    return Token.INTLITERAL;
                }
            case '9':
                takeIt();
                while (isDigit(currentChar)){
                    takeIt();
                }
                if(currentChar == '.'){
                    takeIt();
                    while (isDigit(currentChar)){
                             takeIt();
                        }
                    return Token.FLOATLITERAL;
                }else{
                    return Token.INTLITERAL;
                }
            
            case '.':
                takeIt();
                if(isDigit(currentChar)){
                    while(isDigit(currentChar)){
                        takeIt();
                    }
                    return Token.FLOATLITERAL;
                }else{
                    //erro e so um ponto sem nda
                }
    
            case '+':
                takeIt();
                return Token.SOMA;
            case '-':
                takeIt();
                return Token.SUB;
            case '*':
                takeIt();
                return Token.MUL;
            case '/':
                takeIt();
                return Token.DIV;
            case '<':
                takeIt();
                if(currentChar == '='){
                    takeIt();
                    return Token.LESSEQ;
                }else{
                    if(currentChar == '>'){
                        takeIt();
                        return Token.EQUALDIF;
                    }else{
                        return Token.LESS;
                    }

                }
            case '>':
                takeIt();
                if(currentChar == '='){
                    takeIt();
                    return Token.BIGEQ;
                }else{
                    return Token.BIGGER;
                }
            case '=':
                takeIt();
                return Token.EQUAL;
            case ';' :
                takeIt();
                return Token.SEMICOLON;
            case ':' :
                takeIt();
                if(currentChar == '='){
                    takeIt();
                    return Token.BECOMES;
                }else{
                    
                    return Token.COLON;
                }
    
            case '(' :
                takeIt();
                return Token.LPAREN;
            case ')' :
                takeIt();
                return Token.RPAREN;
            case ',' :
                takeIt();
                return Token.COMMA; 
            case '\000' :
                return Token.EOT;
                
            default:
                // report lexical erro (caso seja outros simbolos) retornar token erro aq
                break;
        }
    }
    private byte scanSeparator(){
        switch (currentChar) {
            case '#' :
                takeIt();
                while(isGraphic(currentChar)){
                    takeIt();
                    take('\n');
                }
            case ' ':
                takeIt();
                break;
            case '\n':
                takeIt();
                break;
        
            default:
                break;
        }
    }

    public Token scan(){
        while(currentChar == '#' || currentChar == ' ' || currentChar == '\n'){
            scanSeparator();
        }
        currentvalor = new StringBuffer("");
        currentKind = scanToken();
        return new Token(currentKind,currentvalor.toString());
    }

}

public class Token{

    public byte kind;
    public String valor;

    public Token (byte kind , String valor){
        this.kind = kind ;
        this.valor = valor;

        if(kind == IDENTIFIER){
            for(int k = BEGIN ; k <= WHILE ; k++){
                if(valor.equals(valores[k])){
                    this.kind = k ;
                    break;
                }
            }
        }
    }

   public final static byte IDENTIFIER=0,INTLITERAL=1,FLOATLITERAL=2,SOMA=3,SUB=4,MUL=5,DIV=6,
   LESS=7,BIGGER=8,LESSEQ=9,BIGEQ=10,EQUAL=11,EQUALDIF=12,SEMICOLON=13,COLON=14,LPAREN=15,
   RPAREN=16,COMMA=17,EOT=18,BEGIN=19,END=20,IF=21,THEN=22,ELSE=23,VAR=24,WHILE=25,DO=26,
   PROGRAM=27,TRUE=28,FALSE=29,REAL=30,BOLLEAN=31,INTEGER=32,BECOMES=33;

   private final static String[]  valores = {
    'begin','end','if','then','else','var','while','do','program','true','false','real','boolean','integer'       
    }
}