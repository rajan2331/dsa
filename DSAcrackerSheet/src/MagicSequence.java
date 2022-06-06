
public class MagicSequence {

	public static void main(String[] args) {
		
	//	int[] a = {1,2,3,4,5,6,7,8,9,0};
	//	System.out.println(checkMagic(a,2,7));
		int[] a = {4,1,2,0,1,9,5,3,7,8,8,9,6,3,8,2,4,0,3,3,5,5,6,5,5,5,6,7,2};
		System.out.println(getCount(a));
	}

	private static int getCount(int[] a) {
	
		
		
	
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				
				if(checkMagic(a, i, j))
					count++;
			}
			
			
			
			
			
		}
		return count;
	}
	
	private static boolean checkMagic(int[] a,int i,int j){
		
		boolean alternate=false;
		int sum=0;
		while(j>0 && j>=i) {
			if(alternate) {
			int div = (a[j]*2)%10;
			int divi= (a[j]*2)/10;
			sum=sum+div+divi;
			alternate=false;	
			}else {
				sum=sum+a[j];
				alternate=true;
			}
			j--;
		}
	//	System.out.println(sum);
		
		return sum%10==0?true:false;
		
	}
}
