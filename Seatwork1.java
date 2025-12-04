package Individual;

//import java.util.Scanner;

public class Seatwork1 {

	public static void main(String[] args) {

		S1Book mybook = new S1Book();
		
		mybook.title = "Wonderland";
//		mybook.author = "Jannella De Guzman";
		
        mybook.display();
        
        
        S1House myHouse = new S1House();
        
        myHouse.location = "Caloocan";
//        myHouse.color = "red";
//        myHouse.size = 200;
        
        myHouse.displaylocation();
//        myHouse.displaycolor();
//        myHouse.displaysize();
        

        S1Tree myTree = new S1Tree();  
        
        myTree.types = "Narra";
             		
        myTree.displaytree();		
        
        
        
	}

}
