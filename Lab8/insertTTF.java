package Lab8;

/**
 *
 * @since 13 November 2023
 * @author Julian Edwards and Colby Cormier
 *
 */
public class insertTTF<E extends Comparable<E>> extends TwoThreeFourTree<E>
{
    /**
     * @param data
     */
    @Override
    public void insert(final E data) {
    	
    	// Base Case
    	if(root == null || root.children.length == 0)
    	{
    		return;
    	}
    	
    	// Recursive cases
    	switch(root.children.length)
    	{
	    	case 2:
	    		
	    		if(root.children[0].data[0].compareTo(data) < 0)
	    		{
	    			root.children[] = insert();
	    		} else if(root.children[1].data[0].compareTo(data) > 0) { 
	    			
	    		}
	    		
	    		break;
	    	case 3:
	    		break;
	    		
	    	// Split when encountering a 4-node
	    	case 4:
	    		split();
	    		break;
	    		
    		default:
    			break;
    	}
    }

	protected void split(final Node<E> nodeParent, final Node<E> nodeToSplit, final E data) {
		final int splitIndex = order >>> 1;
		final Node<E> newLocalRoot = new Node<>(order);
		newLocalRoot.data[splitIndex] = nodeToSplit.data[splitIndex];

		final Node<E> leftChild = new Node<>(order);
		leftChild.size = splitIndex;
		System.arraycopy(nodeToSplit.data, 0, leftChild.data, 0, splitIndex);

		final Node<E> rightChild = new Node<>(order);
		rightChild.size = nodeToSplit.size - splitIndex;

		// split root
		if(nodeParent == null) {

		}
		// split normal node
		else {

		}

       	// final Node<E> left = new Node<>(order);
        // System.arraycopy(nodeToSplit.data, 0, left.data, 0, splitIndex);
        // System.arraycopy(nodeToSplit.children, 0, left.children, 0, splitIndex - 1);
        // final Node<E> right = new Node<>(order);
        // if(nodeToSplit.data.length - (splitIndex + 1) >= 0) System.arraycopy(nodeToSplit.data, splitIndex + 1, right.data, splitIndex + 1, nodeToSplit.data.length - (splitIndex + 1));
	}

    /**
     * @param data
     * @return
     */
    @Override
    public boolean contains(final E data) {
        return false;
    }

    /**
     * @return
     */
    @Override
    public E[] getSorted() {
        
    }
}
