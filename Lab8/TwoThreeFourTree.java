package Lab8;

public abstract class TwoThreeFourTree<E extends Comparable<E>> {

    /** A Node represents a node in a 2-3-4‐tree. */
    protected static class Node<E> {
        // Data Fields
        /** The number of data items in this node */
        protected int size = 0;
        /** The information */
        protected E[] data;
        /** The links to the children. child[i] refers to the subtree of
        children < data[i] for i < size and to the subtree
        of children > data[size‐1] for i == size
        */
        protected Node<E>[] children;
        /** Create an empty node of size order
        @param order The size of a node
        */
  
        public Node(int order) {
            data = (E[]) new Comparable[order-1];
            children = (Node<E>[]) new Node[order];
            size = 0;
        }
    }
    
    protected Node<E> root;
    /** The maximum number of children of a node */
    protected int order;
    
    public TwoThreeFourTree()
    {
        root = null;
        order=4;
    }
    
    /**
     * @param data
     */
    public abstract void insert(E data);
    /**
     * @param data
     * @return
     */
    public abstract boolean contains(E data);
    /**
     * @return
     */
    public abstract E[] getSorted();
    

}
