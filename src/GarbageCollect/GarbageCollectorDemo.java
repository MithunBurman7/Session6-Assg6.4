package GarbageCollect;

public class GarbageCollectorDemo {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//Here we are creating the to object of  garbage
			 Garbage s1=new Garbage();  
			 Garbage s2=new Garbage();
			//here we are making the object unreferenced by making null 
			  s1=null;  
			  s2=null; 
			  //Here This Method will Run the garbage Collector
			  System.gc();  

		}
		//here we are taking the method Finalize
		//This method is invoked each time before the object is garbage collected
		public void finalize(){
		System.out.println("object is garbage collected");
	}
	}

	}

}
