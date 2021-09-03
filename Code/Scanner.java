
public class Scanner {

    private char currentChar ; // primeiro caracter do arquivo, fazer ainda
    private byte currentKind;
    private StringBuffer currentvalor;
    private int count ;
    private StringBuffer arquivo;
    private int lenght;
    
    
    private void take (char expectedChar ){
        if(currentChar == expectedChar){
            takeIt();
            takeIt();
            
        }else{
            System.out.println("Error 00");
        }
    }

    private void takeIt (){
        if(count < lenght - 1){
            this.currentvalor.append(this.currentChar);
            this.count++;
            this.currentChar = arquivo.charAt(count);// proximo caracter do arquiv
       
            
        }else{
            if(count == lenght - 1){
                currentvalor.append(currentChar);
                this.currentChar = '\000';
                this.count++;
            }
        }
    }

    private boolean isDigit(char c){
        switch (c) {
            case '0':case '1':case '2':case '3':case '4':case '5':case '6':case '7':case '8':case '9':
                return true;

            default:
                return false;
        }
    }
    private boolean isLetter(char c){
        switch (c) {
            case 'a': case 'b': case 'c': case 'd': case 'e': case 'f': case 'g': case 'h': case 'i': case 'j': case 'k': case 'l': case 'm': case 'n': case 'o': case 'p': case 'q': case 'r': case 's': case 't': case 'u': case 'v': case 'w': case 'x': case 'z': 
                return true;

            default:
                return false;
        }
       
    }
    private boolean isGraphic(char c){
       if (isDigit(c) || isLetter(c)){
           return true;
        }else{
            return false;
        }
    }

    private byte scanToken(){
        switch (currentChar) {
            case 'a': case 'b': case 'c': case 'd': case 'e': case 'f': case 'g': case 'h': case 'i': case 'j': case 'k': case 'l': case 'm': case 'n': case 'o': case 'p': case 'q': case 'r': case 's': case 't': case 'u': case 'v': case 'w': case 'x': case 'z': 
                takeIt();
                while(isLetter(currentChar) || isDigit(currentChar)){
                   
                    takeIt();
                }
            return Token.IDENTIFIER;

            case '0':case '1':case '2':case '3':case '4':case '5':case '6':case '7':case '8':case '9':

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
                    System.out.println("Error 01");
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
                return (byte)000;

        }
    }
    private void scanSeparator(){
        switch (currentChar) {

            case '#' :
                takeIt();

                while(isGraphic(currentChar)){
                    takeIt();
                }
                take('\r');
                break;
            case ' ':
                takeIt();
                break;
            case '\r':
                takeIt();
                takeIt();
                break;
        
        }
    }

    public Token scan(StringBuffer arquivo){
        this.count = 0;
        this.lenght = arquivo.length();
        this.arquivo = arquivo;
        this.currentChar = arquivo.charAt(0);
        while(count < lenght){

            while(currentChar == '#' || currentChar == ' ' || currentChar == '\r'){

                currentvalor = new StringBuffer("");
                scanSeparator();
            }
            currentvalor = new StringBuffer("");
            currentKind = scanToken();
            Token x = new Token(currentKind,currentvalor.toString());
            System.out.println(x.kind);
            System.out.println(x.valor);
        }
        return new Token(currentKind,currentvalor.toString());
    }

    public static class Token{

        public byte kind;
        public String valor;
    
        public Token (byte kind , String valor){
            this.kind = kind ;
            this.valor = valor;
    
            if(kind == IDENTIFIER){
                for(int k = 0 ; k < 33 ; k++){
                    if(valor.equals(valores[k])){
                        this.kind = (byte) k ;
                        break;
                    }
                }
            }
        }
    
       public final static byte IDENTIFIER=0,INTLITERAL=1,FLOATLITERAL=2,SOMA=3,SUB=4,MUL=5,DIV=6,
       LESS=7,BIGGER=8,LESSEQ=9,BIGEQ=10,EQUAL=11,EQUALDIF=12,SEMICOLON=13,COLON=14,LPAREN=15,
       RPAREN=16,COMMA=17,EOT=18,BEGIN=19,END=20,IF=21,THEN=22,ELSE=23,VAR=24,WHILE=25,DO=26,
       PROGRAM=27,TRUE=28,FALSE=29,REAL=30,BOLLEAN=31,INTEGER=32,BECOMES=33;
    
       private final static String[]  valores = { "<identifier>","<intliteral>","<float-literal>","<soma>","<sub>","<mul>",
       "<div>","<less>","<bigger>","<lesseq>","<bigeq>","<equal>","<equaldif>","<semicolon>","<colon>","<lparen>","<rparen>","<comma>","<eot>",
        "begin","end","if","then","else","var","while","do","program","true","false","real","boolean","integer","<becomes>"     
        };
    }

}

