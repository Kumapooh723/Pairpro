
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
    		
    		
    	}
    	else if(length==3) {
    		
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
