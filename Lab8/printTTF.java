package Lab8;

import java.util.ArrayList;
import java.util.List;

public class PrintTTF<E extends Comparable<E>> extends TwoThreeFourTree<E> {


    @Override
    public E[] getSorted() {
        List<E> sortedList = new ArrayList<>();
        travreseInOrder(root, sortedList);
        return sortedList.toArray((E[]) new Comparable[sortedList.size()]);
    }

    private void travreseInOrder(Node<E> node, List<E> result) {
        if(node == null){
            return;
        }
        if(node.children[0]==null){
            for (int i = 0; i < node.size; i++) {
                result.add(node.data[i]);
            }
        }
        if (node != null) {
            travreseInOrder(node.children[0], result);

            for (int i = 0; i < node.size; i++) {
                result.add(node.data[i]);
            }

            for (int i = 0; i < node.size; i++) {
                travreseInOrder(node.children[i + 1], result);
            }

            travreseInOrder(node.children[node.size + 1], result);
        }
    }


}
