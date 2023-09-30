package project_one;


	public class Maps{

	public static void main(String[] args){

        int ar[]= {100,200,300,300,400,500,500,600};
        
        int li=0;
        int hi=ar.length-1;
        int mi=(li+hi)/2;
        int find=500;
        
        while(li<=hi) {
        	if(ar[mi]==find) {
        		System.out.println("number is at position = "+mi);
        		break;
        	}
        	
        	else if(ar[mi]<find) {
        		li=mi+1;
        	}
        	else   {
        		hi=mi-1;
        	}
        	mi=(li+hi)/2;
        	
        }
        if(li>hi) {
        	System.out.println("number not found");
        }


	}




	}


