package BST;

public class Test {
	public static void main(String[] args){
		SearchOperations s1 = new SearchOperations();
		s1.root = s1.Insert(50, s1.root);
		s1.root = s1.Insert(100, s1.root);
		s1.root = s1.Insert(25, s1.root);
		s1.print(s1.root);
	}

}
