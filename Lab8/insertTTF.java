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
