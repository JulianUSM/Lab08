package Lab8;

public class containTTF<E> extends TwoThreeFourTree{

	@Override
	public boolean contains(E data) {
		containsHelp(data, root);
		return true;
	}
	public boolean containsHelp(E data, Node root) {
		if(root == null)
			return false;
		E[] children = root.data;
		for(int j = 0; j < 4; j++) { //checks all data in current node
			if(children[j] == null)
				break; //breaks for loop, no more children in the node
				
		if(children[j].equals(data)) {
			return true; //data matches
		}

		for(int i = 0; i < 4; i++) {
			containsHelp(data, root);
		}

		}
	}
}
