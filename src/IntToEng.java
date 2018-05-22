import java.util.Scanner;

public class IntToEng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

	}
	// 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	String eng = null;
    	String[] a = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve"};
    	int length = String.valueOf(n).length();
    	if(length==2 && n>12) {
    		if(13<=n && n<=19) {
    			String te = "teen";
    			if(n==13) eng="thir"+te;
    			if(n==14) eng=a[4]+te;
    			if(n==15) eng="fif"+te;
    			if(n==16) eng=a[6]+te;
    			if(n==17) eng=a[7]+te;
    			if(n==18) eng="eigh"+te;
    			if(n==19) eng=a[9]+te;
    		}
    		if(20<=n && n<=29) {
    			String tw="twenty";
    			if(n==20) eng=tw;
    			if(n==21) eng=tw+" "+a[1];
    			if(n==22) eng=tw+" "+a[2];
    			if(n==23) eng=tw+" "+a[3];
    			if(n==24) eng=tw+" "+a[4];
    			if(n==25) eng=tw+" "+a[5];
    			if(n==26) eng=tw+" "+a[6];
    			if(n==27) eng=tw+" "+a[7];
    			if(n==28) eng=tw+" "+a[8];
    			if(n==29) eng=tw+" "+a[9];
    		}
    		if(30<=n && n<=39) {
    			String th="thirty";
    			if(n==30) eng=th;
    			if(n==31) eng=th+" "+a[1];
    			if(n==32) eng=th+" "+a[2];
    			if(n==33) eng=th+" "+a[3];
    			if(n==34) eng=th+" "+a[4];
    			if(n==35) eng=th+" "+a[5];
    			if(n==36) eng=th+" "+a[6];
    			if(n==37) eng=th+" "+a[7];
    			if(n==38) eng=th+" "+a[8];
    			if(n==39) eng=th+" "+a[9];
    		}
    		if(40<=n && n<=49) {
    			String fr="forty";
    			if(n==40) eng=fr;
    			if(n==41) eng=fr+" "+a[1];
    			if(n==42) eng=fr+" "+a[2];
    			if(n==43) eng=fr+" "+a[3];
    			if(n==44) eng=fr+" "+a[4];
    			if(n==45) eng=fr+" "+a[5];
    			if(n==46) eng=fr+" "+a[6];
    			if(n==47) eng=fr+" "+a[7];
    			if(n==48) eng=fr+" "+a[8];
    			if(n==49) eng=fr+" "+a[9];
    		}
    		if(50<=n && n<=59) {
    			String fif="fifty";
    			if(n==50) eng=fif;
    			if(n==51) eng=fif+" "+a[1];
    			if(n==52) eng=fif+" "+a[2];
    			if(n==53) eng=fif+" "+a[3];
    			if(n==54) eng=fif+" "+a[4];
    			if(n==55) eng=fif+" "+a[5];
    			if(n==56) eng=fif+" "+a[6];
    			if(n==57) eng=fif+" "+a[7];
    			if(n==58) eng=fif+" "+a[8];
    			if(n==59) eng=fif+" "+a[9];
    		}
    		if(60<=n && n<=69) {
    			String six="sixty";
    			if(n==60) eng=six;
    			if(n==61) eng=six+" "+a[1];
    			if(n==62) eng=six+" "+a[2];
    			if(n==63) eng=six+" "+a[3];
    			if(n==64) eng=six+" "+a[4];
    			if(n==65) eng=six+" "+a[5];
    			if(n==66) eng=six+" "+a[6];
    			if(n==67) eng=six+" "+a[7];
    			if(n==68) eng=six+" "+a[8];
    			if(n==69) eng=six+" "+a[9];
    		}
    		if(70<=n && n<=79) {
    			String sv="seventy";
    			if(n==70) eng=sv;
    			if(n==71) eng=sv+" "+a[1];
    			if(n==72) eng=sv+" "+a[2];
    			if(n==73) eng=sv+" "+a[3];
    			if(n==74) eng=sv+" "+a[4];
    			if(n==75) eng=sv+" "+a[5];
    			if(n==76) eng=sv+" "+a[6];
    			if(n==77) eng=sv+" "+a[7];
    			if(n==78) eng=sv+" "+a[8];
    			if(n==79) eng=sv+" "+a[9];
    		}
    		if(80<=n && n<=89) {
    			String eh="eighty";
    			if(n==80) eng=eh;
    			if(n==81) eng=eh+" "+a[1];
    			if(n==82) eng=eh+" "+a[2];
    			if(n==83) eng=eh+" "+a[3];
    			if(n==84) eng=eh+" "+a[4];
    			if(n==85) eng=eh+" "+a[5];
    			if(n==86) eng=eh+" "+a[6];
    			if(n==87) eng=eh+" "+a[7];
    			if(n==88) eng=eh+" "+a[8];
    			if(n==89) eng=eh+" "+a[9];
    		}
    		if(90<=n && n<=99) {
    			String nn="ninety";
    			if(n==90) eng=nn;
    			if(n==91) eng=nn+" "+a[1];
    			if(n==92) eng=nn+" "+a[2];
    			if(n==93) eng=nn+" "+a[3];
    			if(n==94) eng=nn+" "+a[4];
    			if(n==95) eng=nn+" "+a[5];
    			if(n==96) eng=nn+" "+a[6];
    			if(n==97) eng=nn+" "+a[7];
    			if(n==98) eng=nn+" "+a[8];
    			if(n==99) eng=nn+" "+a[9];
    		}
    		
    		
    		
    	}
    	else if(length==3&&String.valueOf(n).matches("[1-9]00")) {
    		eng=a[1]+" "+"hundred";//ここを変えていけば100以上もできるはず
    		
    		
    	}
    	else
    	switch(n) {
    	case 0:
    		eng=a[0];
    		break;
    	case 1:
    		eng=a[1];
    		break;
    	case 2:
    		eng=a[2];
    		break;
    	case 3:
    		eng=a[3];
    		break;
    	case 4:
    		eng=a[4];
    		break;
    	case 5:
    		eng=a[5];
    		break;
    	case 6:
    		eng=a[6];
    		break;
    	case 7:
    		eng=a[7];
    		break;
    	case 8:
    		eng=a[8];
    		break;
    	case 9:
    		eng=a[9];
    		break;
    	case 10:
    		eng=a[10];
    		break;
    	case 11:
    		eng=a[11];
    		break;
    	case 12:
    		eng=a[12];
    		break;
    	}
        return eng;
    }

}